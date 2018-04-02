class Student(var gender: String,
              var favoriteSubject: String,
              var firstName: String,
              var numericGrade: Int,
              var age: Int,
              var lastName: String) {

    fun getLetterGrade(): String {
        return when (numericGrade) {
            90 -> "A"
            in 0..50 -> "F"
            75 -> "C+"
            else -> "N/A"
        }
    }
}
