package com.example.alaaripatient.usersigndataclass

data class SignupResponse(
    val age: String,
    val alternateContact: String,
    val area: String,
    val city: String,
    val country: String,
    val dialCode: String,
    val email: String,
    val firstName: String,
    val gender: String,
    val isActive: Boolean,
    val lastName: String,
    val mobileNumber: String,
    val password: String,
    val selectLanguage: String,
    val street: String,
    val title: String,
    val totalExperience: String,
    val userType: String
)