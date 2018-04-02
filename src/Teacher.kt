class Teacher(var firstName: String,
              var age: Int=0,
              var students: Array<Student>,
              var lastName: String,
              var gender: String,
              var currentSubject: String) {

    fun studentWithHighestGrade(): Student {
        var currentHighStudent=students[0]
        students.forEach {
            if (it.numericGrade > currentHighStudent.numericGrade) {
                currentHighStudent=it
            }
        }
        return currentHighStudent
    }
}