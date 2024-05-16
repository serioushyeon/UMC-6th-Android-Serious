package com.example.flo

data class Song(
    val title : String = "",
    val singer : String = "",
    var second : Int = 0,
    var playTime : Int = 60,
    var isPlaying : Boolean = false,
    var isLike : Boolean = false,
    var music : String = ""
)
