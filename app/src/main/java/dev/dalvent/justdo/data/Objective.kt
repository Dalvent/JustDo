package dev.dalvent.justdo.data

const val OBJECTIVE_STATUS_NORMAL = 0
const val OBJECTIVE_STATUS_HOT = 0
const val OBJECTIVE_STATUS_COLD = 0

data class Objective(
    var id: Int,
    var name: String,
    val status: Int,
    val desorption: String
)