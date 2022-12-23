package com.uxstate.instantscore.data.remote.dtos.fixture_details


import com.squareup.moshi.Json

data class Status(
    @Json(name = "elapsed")
    val elapsed: Int,
    @Json(name = "long")
    val long: String,
    @Json(name = "short")
    val short: String
)