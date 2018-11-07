import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec
import jdk.nashorn.tools.ShellFunctions.input
import com.univocity.parsers.common.ArgumentUtils.toCharArray



class LetterSpec : DescribeSpec({
    describe("Home work 4") {
        context("unique letters") {

            it("positive case") {
                String_unique("sword") shouldBe true
                String_unique("discount") shouldBe true

            }
            it("negative case") {

                String_unique("sleep") shouldBe false
                String_unique("positive") shouldBe false
            }
        }
    }
})
fun String_unique(word:String): Boolean{

    val letters=word.toCharArray()

    val set:HashSet<Char> = hashSetOf()

    for (c in letters) {
        if (set.contains(c)) {
            return false
        }
        set.add(c)
    }
    return true
}
fun Tricky(first_word:String, second_word:String):Boolean{


    return true
}