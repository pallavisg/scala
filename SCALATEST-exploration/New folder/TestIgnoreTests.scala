import org.scalatest.FlatSpec

 import scala.collection.mutable.Stack


 class TestIgnoreTests extends FlatSpec {

   "The Scala language" must "add correctly"  in {
       val sum = 1 + 1
       assert(sum === 2)
       assert(sum + 2 === 4)
     }

   ignore must "subtract correctly"  in {
     val diff = 4 - 1
     assert(diff === 3)
     assert(diff - 2 === 1)
   }
 }