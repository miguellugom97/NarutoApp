package com.miguellugo.narutoapp.domain.model

import androidx.annotation.DrawableRes
import com.miguellugo.narutoapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First: OnBoardingPage(
        image = R.drawable.greetings,
        title = "Saludos",
        description = "Eres un fan de Naruto, por qué si es así tengo buenas noticias para ti."
    )
    object Second: OnBoardingPage(
        image = R.drawable.explore,
        title = "Explora",
        description = "Encuentra a tus personajes favoritos y conoce más de ellos."
    )
    object Third: OnBoardingPage(
        image = R.drawable.power,
        title = "Fuerza",
        description = "Conoce la fuerza de tus ninjas favoritos y comparalo con otros."
    )
}
