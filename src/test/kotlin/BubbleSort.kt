import io.kotlintest.shouldBe
import io.kotlintest.specs.DescribeSpec

class BubbleSort: DescribeSpec({
    describe("Kotlin Lessons"){
        context("sorting_alg") {

            sortNum(numberList)

            numberList shouldBe arrayOf(1,3,5,6,8)

            numberList[0] shouldBe 1
            numberList[1] shouldBe 3

        }
    }
})
val numberList = arrayOf(5,3,8,1,6)

fun sortNum (numlist: Array<Int>){

   var buffer:Int
    print("Unsorted Numbers: ")
    for (i in 0..4){
        print(" "+numberList[i])//вывод всех чисел через пробел
    }
    for (i in 0..4){
        for (j in 1..(4-i)){
            if(numberList[j-1]>numberList[j]){//сравнение элементов

                //замена элементов если один больше другого
                buffer = numberList[j-1]
                numberList[j-1] = numberList[j]
                numberList[j] = buffer
            }
        }
    }
    println()//новая строка
    print("Sorted Numbers: ")
    for(i in 0..4){
        print(" "+numberList[i])
    }
}