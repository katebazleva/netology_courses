import kotlin.math.pow

fun main() {
    val bodyMassIndex = bodyMassIndex(165, 55f)

    val verdict = when (bodyMassIndex) {
        in 0.0..16.0 -> "Выраженный дефицит массы тела"
        in 16.0..18.5 -> "Недостаточная масса тела (дефицит)"
        in 18.6..25.0 -> "Норма"
        in 25.1..30.0 -> "Избыточная масса тела (предожирение)"
        in 30.1..35.0 -> "Ожирение"
        in 35.1..40.0 -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }
    println(verdict)
}

fun bodyMassIndex(heightInCentimeters: Int, weight: Float) = weight / (heightInCentimeters / 100.0).pow(2)
