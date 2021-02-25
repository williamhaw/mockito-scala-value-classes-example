package com.williamhaw

import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito.verify
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.mockito.MockitoSugar

class MyIdTest extends AnyFlatSpec with Matchers with MockitoSugar {

    "Caller" should "call ExampleService with id 1 in ScalaTest" in {
        val mockService = mock[ExampleService]
        val caller = new Caller(mockService)
        caller.businessLogic(MyId(1))
        verify(mockService).exists(MyId(any[Int]))
    }
}