fun main (args: Array <String>){

    var ari = IntArray(8)

    ari[0] = 5
    ari[7] = -89
    println(ari[7])

    // طريقة أخرى لتعريف مصفوفة
    var ari2 = Array(5){" "}

    ari2[4] = "ali"
    println(ari2[4])

    // طريقة أخرى لتعريف مصفوفة
    var ari3 = Array<Float> (8) {0.0f}

    ari3[4] = 17.3f
    println(ari3[4])

    // طباعة عناصر المصفوفة باستخدام for loop
    var ari4 = Array<Int>(7) {0}

    for (i: Int in 0 until 7)
        println(ari4[i])

    // إضافات
    for (i: Int in 0 until ari4.size)
        println(ari4[i])

    //طريقة مختصرة
    for (element in ari4)
        println(element)

    // عملية جمع بسيطة باستخدام المصفوفات
    var list = Array<Int>(3){0}
    list[0]=7
    list[1]=8
    list[2]=9

    var total : Int = 0

    for (i: Int in 0 until list.size){
        total += list[i]
    }

    println("Total = $total")

    // مثال على المصفوفات كيف تطبع العنصر الأكبر
    var mylist = Array<Int>(3){0}

    mylist[0]=17
    mylist[1]=10
    mylist[2]=9

    var max = list[0]

    for (i: Int in 0 until mylist.size){
        if (mylist[i] > max)
            max = mylist[i]
    }
    println("max = $max")

    // foreach
    for (i in mylist) // يقوم بطباعة جميع الـ index
    {
        print("$i ")
    }
    println()

    // طريقة مختصرة لتعريف المصفوفة
    var list7 = arrayOf("a",'R',6,2.1,9.7f) // يكون نوعها حسب القيم التي بداخلها, ويمكن وضع قيم من أنواع مختلفة

    for (i in list7) {
        print("$i ")
    }
    println()


}