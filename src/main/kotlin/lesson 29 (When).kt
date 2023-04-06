class `lesson 29 (When)` {


    fun week (a:String){

        when (a){
            "sat" -> println("saturday")
            "sun" -> println("sunday")
            "m" -> println("Mon")
            "t" -> println("Tuesday")
            "w" -> println("Wed")
            "th" -> println("Thursday")
            "f" -> println("Friday")
            else -> println("Not exist !")
        }
    }
}