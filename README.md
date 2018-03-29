Learning Basic Kotlin

# Basic project on learning / building a kotlin project

## Homework 2: Learning Classes

### Pre-Req:
* Merge the `hw2_base` branch into your branch
* Create a new branch called `hw2_classes` from `hw2_base`
* Push this up to your repo/fork on github
* Once completed, create a pull request from `hw2_classes` -> `hw2_base`

### Assignment:
 
* Create 2 classes:
    * `Teacher` in Teacher.kt file with the following:
        * property first name: String
        * property last name: String
        * property age: Int
        * property gender: String
        * property currentSubject: String
        * property students: Array<Student>
        * function studentWithHighestGrade()            
    * `Student` in Student.kt file
        * property first name: String
        * property last name : String
        * property age: Int
        * property gender: String
        * property favoriteSubject: String
        * property numericGrade : Int
        * function getLetterGrade(): String
            * hint: use `when`
* Inside `main()`:
    * Create several Students with various grades
    * Create 1 teacher and add those students to that teacher
    * Print the letter grade of each student
    * Print the student with highest grade under that teacher.
* Expected time to complete: 15 minutes to 1 hour

### Additional Notes:
Commit small and frequently and push to git.

Example:
* I create an empty `Teacher` class inside of Teacher.kt
* Commit this new code
* Push the code
* Add more stuff.


Make sure your code Runs BEFORE committing and pushing.