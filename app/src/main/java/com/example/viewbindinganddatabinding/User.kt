package com.example.viewbindinganddatabinding

import java.io.Serializable

data class User (
    var userImageId : Int,
    var userName : String,
    var gender : Int,
    var birthYear : Int,
    var email : String
        ): Serializable