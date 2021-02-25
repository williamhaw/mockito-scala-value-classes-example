package com.williamhaw

trait ExampleService {
    def exists(id: MyId): Boolean
}

class Caller(service: ExampleService) {
    def businessLogic(id: MyId): Boolean = {
        //... some business logic here
        service.exists(id)
    }
}