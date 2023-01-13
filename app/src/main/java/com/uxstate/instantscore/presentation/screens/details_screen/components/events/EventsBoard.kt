package com.uxstate.instantscore.presentation.screens.details_screen.components.events

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.uxstate.instantscore.domain.models.fixture_details.FixtureDetails

@Composable
fun EventsBoard(fixtureDetails: FixtureDetails, modifier: Modifier = Modifier) {

    val homeTeam = fixtureDetails.teams.first.name

    val events = fixtureDetails.events

    Card(modifier = modifier.fillMaxWidth()) {

        LazyColumn {

            items(events) { event ->

                val isHomeEvent = event.side == homeTeam
                when (event.eventType) {

                    "Goal" -> {

                        GoalEvent(event = event, isHomeEvent)
                    }

                    "Card" -> {

                        CardEvent(event = event, isHomeTeamEvent = isHomeEvent)
                    }

                    "subst" -> {

                        SubstitutionEvent(event = event, isHomeTeamEvent = isHomeEvent)
                    }
                }
            }
        }
    }
}