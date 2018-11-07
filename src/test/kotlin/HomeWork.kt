import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

class HomeSpec : DescribeSpec({
    describe("Kotlin lessons") {
        context("switch_case") {

            grade(4) shouldBe "OK"
            grade(6) shouldBe "Good"
            grade(0) shouldBe "Fail"
        }
        context("collections") {
            val list = arrayListOf<Int>()
            list.addAll(listOf(1,2,3,4))
            val keyValue = mapOf(1 to "Amit",
                    2 to "Ali",
                    3 to "Mindorks")

          sumInt(list) shouldBe 10
        }
    }
})
fun grade(score:Int) :String=
    when (score) {
        9, 10 -> "Excellent"
        in 6..8 -> "Good"
        4, 5 -> "OK"
        in 1..3 -> "Fail"
        else -> "Fail"
    }

fun sumInt(list: ArrayList<Int>): Int{
    var sum = 0
    for (i in list){
        sum +=i
    }
    return sum
}