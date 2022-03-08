package dev.dalvent.justdo

import dagger.Component
import dev.dalvent.justdo.di.DataModule
import dev.dalvent.justdo.di.ViewModelModule
import dev.dalvent.justdo.presentation.ObjectivesFragment
import dev.dalvent.justdo.presentation.ObjectivesViewModel
import javax.inject.Singleton

@Component(modules = [DataModule::class, ViewModelModule::class])
interface AppComponent
{
    fun inject(fragment: ObjectivesFragment)
}