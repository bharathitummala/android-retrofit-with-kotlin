package com.rkpandey.blogexplorer.models

import androidx.annotation.Keep
import java.io.Serializable
@Keep
data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String) : Serializable