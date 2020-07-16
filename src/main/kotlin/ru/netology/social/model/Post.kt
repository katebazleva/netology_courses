package ru.netology.social.model

import java.util.*

class Post(
    val id: Int,
    val ownerId: Int,
    var fromId: Int = ownerId,
    val createdBy: Int? = null,
    val date: Date,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean = false,
    val comments: CommentsToPost = CommentsToPost(),
    val copyright: String,
    val likes: LikesToPost = LikesToPost(),
    val viewsCount: Int = 0,
    val postType: String,
    val geo: Geo?,
    val signerId: Int? = null,
    val canPin: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val postponedId: Boolean = false
) {
}
