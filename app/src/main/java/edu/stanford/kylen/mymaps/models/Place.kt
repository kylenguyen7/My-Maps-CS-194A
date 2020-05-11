package edu.stanford.kylen.mymaps.models

import java.io.Serializable

data class Place(val title: String, val desc: String, val latitude: Double, val longitude: Double) : Serializable