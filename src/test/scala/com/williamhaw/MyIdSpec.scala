package com.williamhaw

import org.specs2.mock.Mockito
import org.specs2.mutable.Specification

class MyIdSpec extends Specification with Mockito{
  "Caller" should {
    "call ExampleService with id 1 in specs2" in {
      val mockService = mock[ExampleService]
      val caller = new Caller(mockService)
      caller.businessLogic(MyId(1))
      there was one(mockService).exists(MyId(any[Int])) // if instead defined as .exists(any[MyId]), throws NullPointerException
    }

    "return true if all users exist" in {
      val mockService = mock[ExampleService]
      mockService.exists(MyId(any[Int])).returns(true) // if instead defined as .exists(any[MyId]), throws NullPointerException

      val caller = new Caller(mockService)
      caller.businessLogic(MyId(1)) shouldEqual true
    }
  }
}
