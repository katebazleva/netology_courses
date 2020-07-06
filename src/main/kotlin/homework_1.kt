import kotlin.math.roundToInt

fun main() {
    println(calculateFee(100, 11_000))
    println(calculateFee(100, 11_000, true))

    println(calculateFee(100, 1100))
    println(calculateFee(100, 1100, true))
}

fun calculateFee(currentPrice: Int, totalSales: Int, isExclusive: Boolean = false): Int {
    val exclusiveDiscount = 0.05
    val fee = when (totalSales) {
        in 0..1_000 -> 0.3
        in 1_001..10_000 -> 0.25
        in 10_001..50_000 -> 0.2
        else -> 0.15
    }
    return (currentPrice * (if (isExclusive) fee - exclusiveDiscount else fee)).roundToInt()
}
