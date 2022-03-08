package dev.dalvent.justdo.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dev.dalvent.justdo.presentation.ObjectivesViewModel

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(ObjectivesViewModel::class)
    abstract fun objectiveViewModel(objectivesViewModel: ObjectivesViewModel): ViewModel
}