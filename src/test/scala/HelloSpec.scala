import org.scalatest.{ FlatSpec, Matchers }
import org.scalactic.TypeCheckedTripleEquals

class HelloSpec extends FlatSpec with Matchers with TypeCheckedTripleEquals {

  "Hello" should "have tests" in {
    true should ===(true)

    // Because of mixing in `TypeCheckedTripleEquals` the following wouldn't compile:
    // true should ===("true")
  }
}
