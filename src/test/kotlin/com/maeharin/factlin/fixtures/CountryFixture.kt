package com.maeharin.factlin.fixtures

import java.time.LocalDateTime
import com.ninja_squad.dbsetup_kotlin.DbSetupBuilder
import com.ninja_squad.dbsetup_kotlin.mappedValues

data class CountryFixture (
    val country_id: Int = 0, 
    val country: String = "", 
    val last_update: LocalDateTime = LocalDateTime.now() 
)

fun DbSetupBuilder.insertCountryFixture(f: CountryFixture) {
    insertInto("country") {
        mappedValues(
                "country_id" to f.country_id,
                "country" to f.country,
                "last_update" to f.last_update
        )
    }
}