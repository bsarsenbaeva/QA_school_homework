import io.kotlintest.hours
import io.kotlintest.shouldBe
import io.kotlintest.shouldNotBe
import io.kotlintest.specs.DescribeSpec


open class Engineer (var name:String, var department: String, var category: Int)
class EngineerTest : DescribeSpec({
    describe("Check QA Engineer class") {

        val tasks:ArrayList<String> =
                arrayListOf("registration","redesign","addButton","test design","authorization")

        val tasks1 = HashMap<String, Int>()
        tasks1.put("registration", 1)
        tasks1.put("redesign", 6)
        tasks1.put("addButton", 2)
        tasks1.put("test design", 8)
        tasks1.put("authorization", 3)


        val qa_name = "Tester"
        val qa_department = "IT department"
        val qa_category = 2

        val dev_name = "Developer"
        val dev_department = "Developers"
        val dev_category = 1

        context("qa work"){

            QA(qa_name, qa_department,qa_category).work(1, tasks) shouldBe 4
            QA(qa_name, qa_department,qa_category).work(3, tasks) shouldBe 2
        }
        context("developer work"){

            Developer(dev_name, dev_department,dev_category).work(2, tasks) shouldBe 7
            Developer(dev_name, dev_department,dev_category).work(4, tasks) shouldBe 9
        }
        context("release days") {

            releaseTesting(2, tasks) shouldBe false
            releaseTesting(4, tasks) shouldBe true
            releaseTesting(0, tasks) shouldBe false
            releaseTesting(7, tasks) shouldNotBe false
        }
        context("444"){
            QA(qa_name, qa_department,qa_category).work1(1, tasks1) shouldBe 4
        }
    }
})

class QA:Engineer {

    constructor(name: String, department: String,category:Int):super(name, department, category){
        this.name = name
        this.department = department
        this.category=category
    }

        fun work(capacity:Int, currentTask:ArrayList<String>): Int{
            return currentTask.size-capacity
        }

    fun work1(capacity:Int, currentTask:HashMap<String, Int>): Int{

        val work_hours = 8
        var release_day: Int =0

        currentTask.forEach{(task,hour)->

            val maxNum = currentTask.maxBy { it.value }
            println("Max number = "+maxNum!!.value)

            if(work_hours-maxNum.value==6){

                if(hour<=2){

                }

            }

        }

        return currentTask.size-capacity
    }

}

class Developer: Engineer {
    constructor(name: String, department: String,category:Int):super(name, department, category){
        this.name = name
        this.department = department
        this.category = category}

        fun work(capacity:Int, currentTask:ArrayList<String>): Int{
            return currentTask.size+capacity
        }
}

    fun releaseTesting(day: Int, currentTask: ArrayList<String>):Boolean{//сколько дней дано

        val task_count=currentTask.size//количество задач
        val day_task:Int

        //если количество задач делится на 2 без остатка, то делим количество задач на 2
        //условие: 2 задачи в день
        //если с остатком, то делим количество задач на 2 и добавляем 1
        if ((task_count % 2)==0){

             day_task = task_count/2
        }else{

            day_task=task_count/2+1
        }

        if(day>=day_task){
            println("Успеваем")
            return true}
        else if (day<day_task){
            println("Не успеваем")
            return false}

        return true
}



