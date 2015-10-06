package scalatest
import org.scalatest.FunSuite
class TestHelloSBTScala extends FunSuite {
  test("Very Basic : Check of equality 1==1") {
    assert(1 == 1)
  }
  test("Another Very Basic : Check of equality HelloWorld") {
    assert("Hello World" == "Hello World")
  }
}
