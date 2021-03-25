package com.example.cepdog.model

/*
{
    "message": [
        "https://images.dog.ceo/breeds/hound-blood/n02088466_7195.jpg",
        "https://images.dog.ceo/breeds/affenpinscher/n02110627_3972.jpg",
        "https://images.dog.ceo/breeds/dane-great/n02109047_19984.jpg"
    ],
    "status": "success"
}
 */

data class DoggyResponse(
    val message: List<String>
)





