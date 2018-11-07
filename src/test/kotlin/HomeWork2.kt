import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec
import jdk.nashorn.internal.runtime.arrays.ArrayIndex

class HomeWork2:DescribeSpec({
    describe("Kotlin Lessons"){
        context("sorting_alg"){

            sortNumber()

            numberArray shouldBe arrayOf(1,3,4,5,8)
            numberArray[0] shouldBe 1
            numberArray[4] shouldBe 8
        }
    }
})
class SortingNumber()
    val numberArray = arrayOf(5, 8, 1, 3, 4)

    fun sortNumber() {
        numberArray.sort()
        numberArray.forEach { print("${it}") }
    }

