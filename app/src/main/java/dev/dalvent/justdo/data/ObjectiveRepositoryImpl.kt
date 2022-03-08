package dev.dalvent.justdo.data

class ObjectiveRepositoryImpl : ObjectiveRepository {

    private val objectives: List<Objective> = listOf(
        Objective(
            1,
            "Купить автомат",
            OBJECTIVE_STATUS_NORMAL,
            OBJECTIVE_DESCRIPTION
        ),
        Objective(
            2,
            "Поесть холодильник",
            OBJECTIVE_STATUS_HOT,
            OBJECTIVE_DESCRIPTION
        ),
        Objective(
            3,
            "Позвонить доче",
            OBJECTIVE_STATUS_COLD,
            OBJECTIVE_DESCRIPTION
        ),
        Objective(
            4,
            "Купить авп азимов",
            OBJECTIVE_STATUS_NORMAL,
            OBJECTIVE_DESCRIPTION
        )
    )

    override fun getAll(): List<Objective> {
        return objectives
    }

    companion object {
        private const val OBJECTIVE_DESCRIPTION = "description"
    }
}