package learningtest.dagger2.feature.main

import androidx.lifecycle.ViewModelProviders
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MainActivityModule {

    @Provides
    @Named("activityViewModel")
    fun provideViewModel(activity: MainActivity): MainViewModel = ViewModelProviders.of(activity).get(MainViewModel::class.java)

}

@Module
class MainFragmentModule {

    @Provides
    @Named("fragmentViewModel")
    fun provideFragmentViewModel(fragment: MainFragment): MainViewModel = ViewModelProviders.of(fragment).get(MainViewModel::class.java)

}