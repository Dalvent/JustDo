package dev.dalvent.justdo.data

interface ObjectiveRepository {
    fun getAll() : List<Objective>
}