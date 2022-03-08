package dev.dalvent.justdo.di

import dagger.Binds
import dagger.Module
import dev.dalvent.justdo.data.ObjectiveRepository
import dev.dalvent.justdo.data.ObjectiveRepositoryImpl
import javax.inject.Singleton

@Module
abstract class DataModule {
    @Binds
    @Singleton
    abstract fun provideObjectivesRepository(
        objectiveRepositoryImpl: ObjectiveRepositoryImpl
    ): ObjectiveRepository
}
