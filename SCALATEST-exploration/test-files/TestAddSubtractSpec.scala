import org.scalatest.FlatSpec

 class AddSubtractSpec extends FlatSpec {

   // Sharing immutable fixture objects via instance variables
   val shared = 5

  "The Scala language" must "add correctly" in {
     val sum = 2 + 3
     assert(sum === shared)
   }

   it must "subtract correctly" in {
     val diff = 7 - 2
     assert(diff === shared)
   }
 }
 