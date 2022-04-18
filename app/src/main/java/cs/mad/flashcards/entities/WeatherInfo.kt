package cs.mad.flashcards.entities

class WeatherInfo {
    var coord = Coordinates()

    var weather = mutableListOf<Weather>()

    var base: String = "N/A"

    var main = MainInfo()

    var visibility: Int = 0

    var wind = WindInfo()

    var clouds = object {
        var all = 0
    }
    var dt = 1560350645
    var sys = Sys()

    var timezone = -25200
    var id = 420006353
    var name = "Mountain View"
    var cod = 200
}

class MainInfo {
    var temp: Double = 0.0
    var feels_like: Double = 0.0
    var temp_min: Double = 0.0
    var temp_max: Double = 0.0
    var pressure: Int = 0
    var humidity: Int = 0
}

class WindInfo {
    var speed: Double = 0.0
    var deg: Int = 0
}

class Coordinates {
    var lon: Double = 0.0
    var lat: Double = 0.0
}

class Weather {
    var id: Int = 800
    var main: String = "N/A"
    var description: String = "N/A"
    var icon: String = "N/A"
}

class Sys {
    var type = 1
    var id = 5122
    var message = 0.0139
    var country = "US"
    var sunrise = 1560343627
    var sunset = 1560396563
}