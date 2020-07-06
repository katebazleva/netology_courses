import java.time.Year
import java.time.YearMonth

fun main() {
    println(postedAgoHumanReadable(0))
    println(postedAgoHumanReadable(60))
    println(postedAgoHumanReadable(120))
    println(postedAgoHumanReadable(300))
    println(postedAgoHumanReadable(7200))
    println(postedAgoHumanReadable(86400))
    println(postedAgoHumanReadable(2_592_000))
    println(postedAgoHumanReadable(31_536_000))
    println(postedAgoHumanReadable(31_622_400))
    println(postedAgoHumanReadable(63_244_800))
}

fun postedAgoHumanReadable(secondsAgo: Int): String {
    val minutesAgo = secondsAgo / 60
    val hoursAgo = minutesAgo / 60
    val daysAgo = hoursAgo / 24

    return when {
        daysAgo - getDaysInMonth() >= 0 -> getRightMonths(daysAgo)
        daysAgo > 0 -> getRightDays(daysAgo)
        hoursAgo > 0 -> getRightHours(hoursAgo)
        else -> getRightMinutes(minutesAgo)
    }
}

fun getRightMinutes(minutes: Int) = when (minutes) {
    0 -> "менее минуты назад"
    1 -> "минуту назад"
    2, 3, 4 -> "$minutes минуты назад"
    else -> "$minutes минут назад"
}

fun getRightHours(hours: Int) = when (hours) {
    1 -> "час назад"
    2, 3, 4, 22, 23 -> "$hours часа назад"
    21 -> "$hours час назад"
    else -> "$hours часов назад"
}

fun getRightDays(days: Int) = when (days) {
    1 -> "день назад"
    2, 3, 4, 22, 23, 24 -> "$days дня назад"
    21 -> "$days день назад"
    else -> "$days дней назад"
}

fun getRightMonths(days: Int): String {
    var monthAmount = -1
    var daysLeft = days
    var year = Year.now().value
    var previousMonthNumber = YearMonth.now().monthValue - 1

    while (daysLeft >= 0) {
        monthAmount++

        if (previousMonthNumber <= 0) {
            year = Year.now().value - 1
            previousMonthNumber = 12
        }
        daysLeft -= getDaysInMonth(year, YearMonth.of(year, previousMonthNumber).monthValue)

        previousMonthNumber -= 1
    }

    return when (monthAmount) {
        0, 1 -> "месяц назад"
        2, 3, 4 -> "$monthAmount месяца назад"
        in 5..11 -> "$monthAmount месяцев назад"
        in 12..23 -> "год назад"
        else -> "несколько лет назад"
    }
}

fun getDaysInMonth(year: Int = Year.now().value, month: Int = YearMonth.now().monthValue - 1) =
    YearMonth.of(year, month).lengthOfMonth()
