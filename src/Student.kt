class Student(var gender: String,
              var favoriteSubject: String,
              var firstName: String,
              var numericGrade: Int,
              var age: Int,
              var lastName: String) {

    fun getLetterGrade(): String {
        return when {
            numericGrade > 90 -> "A"
            numericGrade in 0..89 -> "B"
            numericGrade == 70 -> "C+"
            else -> "N/A"
        }
    }

    override fun toString(): String {
        return "Student(gender='$gender', favoriteSubject='$favoriteSubject', firstName='$firstName', numericGrade=$numericGrade, age=$age, lastName='$lastName')"
    }


}

