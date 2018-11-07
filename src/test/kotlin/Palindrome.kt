import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec
import jdk.nashorn.tools.ShellFunctions.input
import com.univocity.parsers.common.ArgumentUtils.toCharArray



class PalindromeSpec : DescribeSpec({
    describe("Home work 5") {
        context("palindrome number") {

            it("positive case") {
                Palindrome(123321) shouldBe true
                Palindrome(715517) shouldBe true
            }
            it("negative case") {
                Palindrome(123456) shouldBe false
                Palindrome(102202) shouldBe false
            }
        }
    }
})
/**
 * Determine whether an integer is a palidrome.
 * An integer is a palindrome when it reads the same
 * backward as forward. Example: 117711 - true. -7887 - false
 */
fun Palindrome(num:Int): Boolean{

    val str1 = num.toString().substring(0,3)

    val str2 = num.toString().substring(3,6)


    var num1=str1.toInt()
    var num2 = str2.toInt()

    var rev = 0
    while(num2!=0){
        val dg=num2%10
        if(dg%4 !=0){
            rev = rev*10+num2%10
        }
        num2 = num2/10
    }

    if(num1!=rev) {
        return false
    }
    return true
}