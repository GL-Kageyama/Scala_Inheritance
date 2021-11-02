// Define superclass
class Calculation {
    def add(x: Int, y: Int): Int = x + y
    def sub(x: Int, y: Int): Int = x - y
    def multi(x: Int, y: Int): Int = x * y
    def div(x: Int, y: Int): Int = x / y
}

// Inherit superclass and override method
class Addition extends Calculation {
    override def add(x: Int, y: Int): Int = x + x + y + y
}
class Subtraction extends Calculation {
    override def sub(x: Int, y: Int): Int = x - y - y - y
}
class Multiplication extends Calculation {
    override def multi(x: Int, y: Int): Int = x * y * y
}
class Division extends Calculation {
    override def div(x: Int, y: Int): Int = x / y / y
}

object ScalaBasicInheritance extends App {
    
    val calAdd = new Addition()
    println(calAdd.add(20, 7))

    val calSub = new Subtraction()
    println(calSub.sub(300, 30))

    val calMulti = new Multiplication()
    println(calMulti.multi(5, 8))

    val calDiv = new Division()
    println(calDiv.div(40, 2))
}


// =====================================
//         Output Sample
// =====================================
// $ scalac ScalaBasicInheritance.scala 
// $ scala ScalaBasicInheritance
// 54
// 210
// 320
// 10