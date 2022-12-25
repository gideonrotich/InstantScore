package com.uxstate.instantscore.data.remote.dtos.fixtures

import com.squareup.moshi.Json

data class Goals(
    @Json(name = "away")
    val away: Int?,
    @Json(name = "home")
    val home: Int?
)