fun main(args: Array<String>) {

    // Variables Declaration

////    var a: String = "mohanad"
////    var b = 27
////    var c: Double
////    c = 20.0
////
////    println("$a \n $b \n $c")
////
////    // إنشاء object من كلاس
////    var obj1 = `lesson 14 (Kotlin create a class)`()
////    val obj2 = `lesson 14 (Kotlin create a class)`()
////
////    // استخدام الخصائص الموجود في الكلاس باستخدام الأوبجكت الذي أنشأناه
////    // تابع لدرس 14
////    obj1.name = "KIA"
////    obj1.model = 2020
////    obj1.speed = 300.0
////
////    obj2.model = 2019
////
////    println(obj1.speed)
////    println(obj2.model)
////
////    // تابع لدرس 18
//////    var o1 = `lesson 18 (Kotlin concept function)`()
//////    var num1 :Int? = null
//////    var num2 :Int? = null
//////
//////    println("Enter Tow numbers:")
//////    num1 = readln().toInt()
//////    num2 = readln().toInt()
//////    o1.sum(num1,num2)
////
////    // تابع لدرس 20
////    var b1 = `lesson 20 (Kotlin concept return)`()
////    var recive : Int = b1.numbers()
////    println(recive)
////
////    // تابع درس العِلاقة بين المتغيرات والدوال درس 23
////    var v1 = `العلاقة بين المتغيرات والدوال`()
////    v1.speed = 100
////    v1.speedcar()
////
//    // تابع لدرس 25
////    var obj_A = `lesson 25 (this)`()
////    var obj_B = `lesson 25 (this)`()
////
////    obj_A.name = "mohanad"
////    obj_A.age = 21
////
////    obj_B.name = "ahmad"
////    obj_B.age = 19
////
////    obj_A.speak()
//
//    // تابع درس 28
////    var obj1 = `lesson 28 ( if & else & else if )`()
////
////    obj1.max(8,8)
//
//    // تابع درس 29
//    var ob1 = `lesson 29 (When)`()
//
//    ob1.week("SUN")

    // تابع درس 60
//    var cal = `lesson 60 (Calculator)`()
//    var result = println(cal.sum(10,5))
//    result = println(cal.sub(10,5))
//    result = println(cal.mul(10,5))
//    result = println(cal.div(10,5))

    // تابع درس 61
//    var ar = `lesson 61 (mul Arrays)`()
//    var ar1 = arrayOf(1,5,7)
//    var ar2 = arrayOf(2,6,10)
//    var result2 = ar.mulArray(ar1,ar2)
//
//    for (i: Int in result2.indices){
//        println(result2[i])
//    }

    // تابع درس 62
    // object 1
    var st = `lesson 62 (Student)`()
    var st2 = `lesson 62 (Student)`()
    var marks = `lesson 62 (Student)`()

    var score: Int = 0
    var average: Int = 0


    print("What is your name: ")
    st.name = readLine().toString()  // قراءة قيمة من المستخدم وإرسالها للمتغير في الكلاس

    print("What is your age: ")
    st.age = readLine()!!.toInt()

    println("Enter your marks: ")
    st.addQuiz(readLine()!!.toInt()) // إدخال العلامة من قبل المستخدم و إرسالها للدالة كـ Parameter
    st.addQuiz(readLine()!!.toInt())
    st.addQuiz(readLine()!!.toInt())

    score = st.getScore()
    average = st.getAverage()
    st.student_name()      // إرسال البيانات باستخدام الأوبجكت للدالة داخل الكلاس
    println("Your Score is: $score \n Your Average is: $average")






}

