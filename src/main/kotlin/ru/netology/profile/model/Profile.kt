package ru.netology.profile.model

class Profile(
    val id: Int,
    val login: String,
    val name: String,
    val surname: String,
    val status: String = "new",
    val avatar: String = "picture"
) {
    val fullName: String
        get() = "$name $surname"
}
