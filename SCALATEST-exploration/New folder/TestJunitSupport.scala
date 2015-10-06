
package com.hascode
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
 
@RunWith(classOf[JUnitRunner])
class TestJunitSupport extends FlatSpec with ShouldMatchers {
 "The Scala language" should "perform correct addition"  in {
       val set = 1 + 1
       assert(set === 2)
       assert(set + 12 === 14)
     }

   it should "subtract correctly"  in {
     val sub = 4 - 1
     assert(sub === 3)
     assert(sub - 2 === 1)
   }
}
