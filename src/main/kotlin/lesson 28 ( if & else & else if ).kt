class `lesson 28 ( if & else & else if )` {

    var value:Int = 0


    fun max (a:Int, b:Int){

        this.value = if(a>b){
            a
        } else if (a<b){
            b
        } else {
            0
        }
        println(this.value)
    }
}