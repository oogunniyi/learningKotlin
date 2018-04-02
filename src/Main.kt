// This is main, the entry point of a Java/Kotlin Application
fun main(args: Array<String>) {

    var expandedStudent=Student(
            firstName="Toyin",
            lastName="Ogunniyi",
            age=24,
            gender="Female",
            favoriteSubject="History",
            numericGrade=100

    )

    println(expandedStudent.getLetterGrade())

    var expandedStudent2=Student(
            firstName="Lynda",
            lastName="Nicholson",
            age=24,
            gender="Female",
            favoriteSubject="Biology",
            numericGrade=82
    )

    var expandedStudent3=Student(
            firstName="Jessica",
            lastName="Garcia",
            gender="Female",
            age=24,
            favoriteSubject="Cyber Security",
            numericGrade=98

            // TODO("Run Assignment functions here")
    )
    var exandedTeacher=Teacher(
            firstName="Vanessa",
            lastName="Peterson",
            age=29,
            currentSubject="Mathematics",
            gender = "Female",
            students = arrayOf(expandedStudent2, expandedStudent3, expandedStudent) )

println(exandedTeacher.studentWithHighestGrade())

}
