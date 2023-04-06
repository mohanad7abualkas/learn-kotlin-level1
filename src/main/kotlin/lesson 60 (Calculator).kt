class `lesson 60 (Calculator)` {

    fun sum (num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun sub (num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun mul (num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun div (num1: Int, num2: Int): Int {
        return if (num2 == 0){
            0
        } else
            num1 / num2
    }
}