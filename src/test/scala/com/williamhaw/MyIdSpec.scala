package com.williamhaw

import org.mockito.ArgumentMatchers.any
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
  }
}
