import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.DescribeSpec

class BinaryNumSumSpec : DescribeSpec({
    describe("Home work 4") {
        context("binary sum") {

            it("positive case") {

                sumBin("110","101") shouldBe 1011
                sumBin("010","1010") shouldBe 1100
            }
            it("negative case") {

                sumBin("101","101") shouldNotBe 1011
                sumBin("001","100") shouldNotBe 1010

            }
        }
    }
})
//we have two binary numbers which consist of three element
//we need to find sum of this number. Example: 100+101=1001, 101+101=1010
fun sumBin(bin1:String, bin2:String): Int{

    val dec1 = Integer.parseInt(bin1,2)
    val dec2 = Integer.parseInt(bin2,2)

    val sum = dec1+dec2

    return Integer.toBinaryString(sum).toInt()
}