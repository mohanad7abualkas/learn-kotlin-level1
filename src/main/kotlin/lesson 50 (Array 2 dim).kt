fun main (arg: Array <String>){


    // المصفوفات ثنائية البعد
    var a = arrayOf(1,2,3,4,8)
    var b = arrayOf(2,4,6,8,10)
    var c = arrayOf(1,3,5,7,9)

    var d = arrayOf(a,b,c)

    //println(d[1][4])

    // طباعة جميع العناصر
    for (i in d){
        for (j in i){
            print(j)
        }
        println()
    }
}