package com.example.socialmedia.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var name: String? = null,
    var email: String? = null,
    var phone: String? = null,
    var uid: String? = null,
    var avatar: String? = null,
    var cover: String? = null
) : Parcelable
