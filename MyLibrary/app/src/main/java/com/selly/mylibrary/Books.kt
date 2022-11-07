package com.selly.mylibrary

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Books(
    val imgBooks: Int,
    val titleBooks: String,
    val descBooks: String,
) : Parcelable

