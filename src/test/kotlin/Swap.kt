import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec
import io.kotlintest.shouldNotBe


data class Swap(val a: Int,val b: Int)
class SwapSpec : DescribeSpec({
    describe("Home work 5") {
        context("palindrome number") {

            it("positive case") {

                swapNumber(3,7) shouldBe Swap(a=7, b=3)
                swapNumber(5,10) shouldBe Swap(a=10, b=5)
            }
            it("negative case") {
                swapNumber(5,10) shouldNotBe Swap(a=5, b=10)
            }
        }
    }
})

    fun swapNumber(a: Int, b: Int): Swap {

        var first = a
        var second = b

        first = first + second
        second = first - second
        first = first - second

        return Swap(first,second)

}