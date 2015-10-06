import collection.mutable.Stack
import org.scalatest._
import org.scalatest.Assertions._

class StackSpec extends FlatSpec {

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyStack = new Stack[String]
    intercept[NoSuchElementException] {
      emptyStack.pop()
    }
  }
 it should "satify the following three assertions" in {
val left = 2
val right = 1
val attempted = 2       
assert(left == right)
assert(attempted == 1, "Execution was attempted" + left + "times instead of 1 time")
 } 
 
 
  
}