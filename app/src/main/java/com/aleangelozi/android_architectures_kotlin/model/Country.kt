package com.aleangelozi.android_architectures_kotlin.model

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("name")
    var countryName: String
)