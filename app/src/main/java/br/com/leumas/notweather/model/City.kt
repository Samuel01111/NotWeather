package br.com.leumas.notweather.model

data class City(
    val id: Int,
    val coord: Coord,
    val country: String
)

data class Coord(
    val lat: Double,
    val lon: Double
)