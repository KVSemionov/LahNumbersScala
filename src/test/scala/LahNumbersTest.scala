import org.scalatest.funsuite.AnyFunSuite

class LahNumbersTest extends AnyFunSuite {
  test("lah(5, 2) == 120") {
    assert(LahNumbers.lah(5, 2) == 120)
  }

  test("lah(0, 0) == 0") {
    assert(LahNumbers.lah(0, 0) == 0)
  }

  test("lah(3, 4) == 0") {
    assert(LahNumbers.lah(3, 4) == 0)
  }
}
