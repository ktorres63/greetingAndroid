package com.myExamples.androidmaster
//Variables
fun boringStuff(){
    //variables: var & constantes: val
    //Variables numericas
    val age: Int = 12
    val age2:Long = 99
    val ex1:Float = 23.9f
    var ex2:Double = 3.999
    ex2 = 8.9999

    //Variables alfanumericas

    val caracter:Char = 'A'
    val txt1:String = "Hello :)"

    //Variables alfanumericas

    val v1:Boolean = true
    val v2:Boolean = false

    println("hola mundo") // print with line break
    print(ex2)
}



fun main(){
   var cad:String? = null

    println(cad?.get(1))

}