package com.example.videogames

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


    @Parcelize
    data class character(val picture: Int,
                        val name: String,
                        val origin: String,
                        val style: String,
                        val plot: String,
                        val secretSong: Int,
                        val secretString: String) : Parcelable
