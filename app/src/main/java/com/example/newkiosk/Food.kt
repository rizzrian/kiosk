package com.example.newkiosk

class Food( name: String, price: Double, catagory: String, discription: String) {
    var name: String
    var price: Double
    var catagory: String
    var discription: String

    init {
        this.name = name
        this.price = price
        this.catagory = catagory
        this.discription = discription
    }

    fun displayInfo(){
        println("카테고리: $catagory, 가격: $price, 이름: $name, 설명 : [  $discription  ]")
    }
}

