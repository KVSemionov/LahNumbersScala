import org.scalatest.funsuite.AnyFunSuite

class LahNumbersTest extends AnyFunSuite {
  test("lah(5, 2) == 240") {
    assert(LahNumbers.lah(5, 2) == 240)
  }

  test("lah(6, 4) == 300") {
    assert(LahNumbers.lah(6, 4) == 300)
  }

  test("lah(8, 2) == 141120") {
    assert(LahNumbers.lah(8, 2) == 141120)
  }
}
