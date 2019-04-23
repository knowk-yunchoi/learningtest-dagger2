package learningtest.dagger2.feature.main

import androidx.lifecycle.ViewModelProviders
import dagger.Module
import dagger.Provides

@Module
class MainModule {

//    @Provides
//    fun view(): MainFragment = MainFragment.newInstance()

    @Provides
    fun provideActivityViewModel(activity: MainActivity): MainViewModel = ViewModelProviders.of(activity).get(MainViewModel::class.java)

//    @Provides
//    @Named("fragmentViewModel")
//    fun provideFragmentViewModel(fragment: MainFragment): MainViewModel = ViewModelProviders.of(fragment).get(MainViewModel::class.java)
}