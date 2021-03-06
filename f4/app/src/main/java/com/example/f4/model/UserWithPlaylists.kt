package com.example.f4.model

import androidx.room.Embedded
import androidx.room.Relation

data class UserWithPlaylists(
    @Embedded val user: User,
    @Relation(
        parentColumn = "uid",
        entityColumn = "userCreatorId"
    )
    val playlists: List<Playlist>
)