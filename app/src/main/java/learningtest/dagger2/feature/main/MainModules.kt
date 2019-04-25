package learningtest.dagger2.feature.main

import androidx.lifecycle.ViewModelProviders
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class MainActivityModule {

    @Provides
    fun provideViewModel(activity: MainActivity): MainViewModel = ViewModelProviders.of(activity).get(MainViewModel::class.java)

    @Provides
    fun provideMainFragment(): MainFragment = MainFragment.newInstance()
}

@Module
class MainFragmentModule {

    @Provides
    @Named("activityViewModel")
    fun provideActivityViewModel(fragment: MainFragment): MainViewModel = ViewModelProviders.of(fragment.requireActivity()).get(MainViewModel::class.java)

    @Provides
    @Named("fragmentViewModel")
    fun provideFragmentViewModel(fragment: MainFragment): MainViewModel = ViewModelProviders.of(fragment).get(MainViewModel::class.java)

}