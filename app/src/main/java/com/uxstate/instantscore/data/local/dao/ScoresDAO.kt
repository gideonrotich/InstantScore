package com.uxstate.instantscore.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.uxstate.instantscore.data.local.entities.FixtureEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ScoresDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFixtures(list: List<FixtureEntity>)

    @Query("SELECT * FROM fixture_table ORDER BY date ASC")
    fun getFixtures(): List<FixtureEntity>

    @Query("DELETE FROM fixture_table")
    suspend fun clearFixtures()
}