package com.example.middleeexam


import androidx.compose.runtime.Composable


data class Teacher(
    val id:Int,
    val name:String,
    val major:String,
    val score:Int,
    val gender:String
)
data class Student(
    val id:Int,
    val name:String,
    val subject: String,
    val age:Int,
    val gender:String
)
val teachers = listOf(
    Teacher(1,"abc ","English",44,"女"),
    Teacher(2,"B","MATH",25,"女"),
    Teacher(1,"c ","English",37,"女"),
    Teacher(2,"d","English",30,"男")
)
val students = listOf(
    Student(4, "Alice ", "English", 17, "女"),
    Student(5, "ai ", "MATH", 19, "男"),
    Student(6, "cc ", "MATHh", 18, "男"),
    Student(7, "ff ", "English", 17, "女")
)

@Composable
fun PageA(teachers: List<Teacher>) {

}

@Composable
fun PageB(students: List<Student>) {

}

@Composable
fun PageC() {

}
