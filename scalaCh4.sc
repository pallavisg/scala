object scalaCh4 {
  println("Welcome to Chapter 4 of Beginning Scala")
                                                  //> Welcome to Chapter 4 of Beginning Scala

/*Function Literal/Anonymous Function -  parenthesized comma−separated list of arguments
followed by an arrow and the body of the function*/

//Assigned to a variable
val add = (x: Int, y: Int) => x + y               //> add  : (Int, Int) => Int = <function2>
add(1,2)                                          //> res0: Int = 3



//Function as an argument
def operation(functionparam:(Int, Int) => Int) { println(functionparam(24,4)) }
                                                  //> operation: (functionparam: (Int, Int) => Int)Unit
val subtract = (x: Int, y: Int) => x - y          //> subtract  : (Int, Int) => Int = <function2>
operation(subtract)                               //> 20

//Function returned by another function
def hometown()=(location: String) => {"I hail from" + " " + location}
                                                  //> hometown: ()String => String
val address = hometown()                          //> address  : String => String = <function1>
address("Assam")                                  //> res1: String = I hail from Assam






//Closure
val y = 3                                         //> y  : Int = 3
val multiplier = (x:Int) => x * y                 //> multiplier  : Int => Int = <function1>
multiplier(2)                                     //> res2: Int = 6



//Partially applied function
 val areaRectangle = (length: Int, width: Int) => length * width
                                                  //> areaRectangle  : (Int, Int) => Int = <function2>
 val partialArea = areaRectangle(6, _:Int)        //> partialArea  : Int => Int = <function1>
 partialArea(10)                                  //> res3: Int = 60



//Curried function
 def curriedAdd(a: Int)(b: Int) = a + b           //> curriedAdd: (a: Int)(b: Int)Int
  curriedAdd(2)(2)                                //> res4: Int = 4

/*Tail recursion
 @annotation.tailrec
 def factorial(accumulator: Int, number: Int) : Int = {
  if(number == 1)
  return accumulator
  factorial(number * accumulator, number - 1)
 }
 println(factorial(1,3))
*/


}