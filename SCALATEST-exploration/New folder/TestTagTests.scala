
import org.scalatest.Tag

 object SlowTest extends Tag("com.mycompany.groups.SlowTest")
 object DbTest extends Tag("com.mycompany.groups.DbTest")
 
 import org.scalatest.FlatSpec

 class TestTagTests extends FlatSpec {

   "The Scala language" must "add correctly" taggedAs(SlowTest) in {
       val sum = 1 + 1
       assert(sum === 2)
       assert(sum + 2 === 4)
     }

   ignore must "subtract correctly" taggedAs(SlowTest, DbTest) in {
     val diff = 4 - 1
     assert(diff === 3)
     assert(diff - 2 === 1)
   }
 }