// Define an abstract class
abstract class AddCalculation {
    val xValue = 20
    val yValue = 7
}
abstract class SubCalculation {
    val xValue = 300
    val yValue = 30
}
abstract class MultiCalculation {
    val xValue = 5
    val yValue = 8
}
abstract class DivCalculation {
    val xValue = 40
    val yValue = 2
}

// Inherit abstract class
class Addition extends AddCalculation {
    val x = xValue
    val y = yValue
    def add: Int = x + x + y + y
}
class Subtraction extends SubCalculation {
    val x = xValue
    val y = yValue
    def sub: Int = x - y - y - y
}
class Multiplication extends MultiCalculation {
    val x = xValue
    val y = yValue
    def multi: Int = x * y * y
}
class Division extends DivCalculation {
    val x = xValue
    val y = yValue
    def div: Int = x / y / y
}

object ScalaValueInheritance extends App {

    val calAdd = new Addition
    println(calAdd.add)

    val calSub = new Subtraction
    println(calSub.sub)

    val calMulti = new Multiplication
    println(calMulti.multi)

    val calDiv = new Division
    println(calDiv.div)
}


// =====================================
//         Output Sample
// =====================================
// $ scalac ScalaValueInheritance.scala 
// $ scala ScalaValueInheritance
// 54
// 210
// 320
// 10