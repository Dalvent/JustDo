package dev.dalvent.justdo.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.dalvent.justdo.data.Objective
import dev.dalvent.justdo.data.ObjectiveRepository
import javax.inject.Inject

class ObjectivesViewModel @Inject constructor(
    objectiveRepository: ObjectiveRepository
) : ViewModel() {
    private val _objective = MutableLiveData<List<Objective>>()
    val objective: LiveData<List<Objective>> = _objective

    init {
        _objective.value = objectiveRepository.getAll()
    }

}