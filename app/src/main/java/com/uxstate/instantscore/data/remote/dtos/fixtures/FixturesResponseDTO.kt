package com.uxstate.instantscore.data.remote.dtos.fixtures


import com.squareup.moshi.Json

data class FixturesResponseDTO(
    @Json(name = "errors")
    val errors: List<Any>,
    @Json(name = "get")
    val `get`: String,
    @Json(name = "paging")
    val paging: Paging,
    @Json(name = "parameters")
    val parameters: Parameters,
    @Json(name = "response")
    val response: List<Response>,
    @Json(name = "results")
    val results: Int
)