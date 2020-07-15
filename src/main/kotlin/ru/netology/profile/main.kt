package ru.netology.profile

import ru.netology.profile.model.Profile

fun main() {
    val me = Profile(1, "katty", "kate", "bazleva")
    println(me.fullName)
}
