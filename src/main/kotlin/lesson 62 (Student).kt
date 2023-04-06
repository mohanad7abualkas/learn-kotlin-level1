class `lesson 62 (Student)` {

    var name: String? = null
    var age: Int? = null
    var totalscore: Int = 0
    var numOfQuize: Int = 0

    fun student_name() {
        println("Hello! My Name is: " + this.name)
        println("My age is: ${this.age}")
    }

    fun addQuiz(score: Int) {
        this.totalscore += score
        numOfQuize++
    }

    fun getScore(): Int {
        return this.totalscore
    }

    fun getAverage(): Int {
        return this.totalscore / this.numOfQuize
    }
}