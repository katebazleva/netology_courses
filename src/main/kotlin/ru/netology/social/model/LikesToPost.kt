package ru.netology.social.model

class LikesToPost(
    var count: Int = 0,
    var userLikes: Boolean = false,
    var canLike: Boolean = true,
    var canPublish: Boolean = true
) {
}