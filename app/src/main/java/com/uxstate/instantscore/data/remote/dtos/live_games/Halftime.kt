package com.uxstate.instantscore.data.remote.dtos.live_games

import com.squareup.moshi.Json

data class Halftime(
    @Json(name = "away")
    val away: Int,
    @Json(name = "home")
    val home: Int
)