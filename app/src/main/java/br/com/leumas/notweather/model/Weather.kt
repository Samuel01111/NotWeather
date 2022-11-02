package br.com.leumas.notweather.model

data class Weather(
    val dt: Int,
    val main: MainData,
    val weather: List<Condition>
)

data class Condition(
    val id: Int,
    val main: String,
    val description: String,
    val icon: String
)

data class MainData(
    val temp: Double,
    val feelsLike: Double,
    val tempMin: Double,
    val tempMax: Double,
    val seaLevel: Int,
    val humidity: Int
)

data class Clouds(
    val all
)



