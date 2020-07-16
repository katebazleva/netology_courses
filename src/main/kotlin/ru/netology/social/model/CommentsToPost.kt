package ru.netology.social.model

class CommentsToPost(
    var count: Int = 0,
    var canPost: Boolean = true,
    var groupsCanPost: Boolean = true,
    var canClose: Boolean = true,
    var canOpen: Boolean = true
) {
}
