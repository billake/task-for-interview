package org.interview

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ForComprehensionTaskSpec extends AnyWordSpec with Matchers {
  "For comprehension" can {
    "be a syntactic sugar for flatMap and map" in new ForComprehensionTask {
      val result = Some(10)

      optSumWithChain(Some(2), Some(8)) shouldBe result
    }

    "be used with one statement" in new ForComprehensionTask {
      val actual = Some(1)
      val result = Some(2)

      forWithOneStatement(actual) shouldBe result
    }

    "be used with two statements" in new ForComprehensionTask {
      val result = Some(10)

      forWithTwoStatements(Some(2), Some(8)) shouldBe result
    }

    "have filter inside" in new ForComprehensionTask {
      val youngCustomer = Customer("Nikoly", 17)
      val adults = Customer("Bob", 39) :: Customer("Nika", 32) :: Nil
      val all = youngCustomer :: adults

      findAdultCustomers(all) shouldBe adults
    }

    "be desugared" in new ForComprehensionTask {
      answer shouldBe FlatMap :: FlatMap :: WithFilter :: Map :: Nil
    }
  }
}
