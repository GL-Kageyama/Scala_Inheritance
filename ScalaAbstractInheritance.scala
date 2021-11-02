// Define an abstract class
abstract class AddCalculation {
    def add: Int
}
abstract class SubCalculation {
    def sub: Int
}
abstract class MultiCalculation {
    def multi: Int
}
abstract class DivCalculation {
    def div: Int
}

// Inherit abstract class
class Addition(x: Int, y: Int) extends AddCalculation {
    def add: Int = x + x + y + y
}
class Subtraction(x: Int, y: Int) extends SubCalculation {
    def sub: Int = x - y - y - y
}
class Multiplication(x: Int, y: Int) extends MultiCalculation {
    def multi: Int = x * y * y
}
class Division(x: Int, y: Int) extends DivCalculation {
    def div: Int = x / y / y
}

object ScalaAbstractInheritance extends App {

    val calAdd = new Addition(20, 7)
    println(calAdd.add)

    val calSub = new Subtraction(300, 30)
    println(calSub.sub)

    val calMulti = new Multiplication(5, 8)
    println(calMulti.multi)

    val calDiv = new Division(40, 2)
    println(calDiv.div)
}


// =====================================
//         Output Sample
// =====================================
// $ scalac ScalaAbstractInheritance.scala 
// $ scala ScalaAbstractInheritance
// 54
// 210
// 320
// 10