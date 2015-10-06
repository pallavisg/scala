package com.hascode
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
 
class TestMatchers extends FlatSpec with ShouldMatchers {
 
	it should "return 2 given a an array Array('A', 'B') solely" in {
	Array('A', 'B') should have size (2)
	}
	
	"13.43" should "be(13.4 plusOrMinus 0.4)"
	
	 it should "satisfy the matchers"  in {
	var foo = List(1, 2)
    var bar = foo
    bar should be theSameInstanceAs (foo)
	}
}