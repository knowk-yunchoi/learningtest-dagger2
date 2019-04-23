package learningtest.dagger2.feature.main

import androidx.lifecycle.ViewModelProviders
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    fun provideActivityViewModel(activity: MainActivity): MainViewModel = ViewModelProviders.of(activity).get(MainViewModel::class.java)

}

//@Module
//class MainFragmentModule {
//
//}