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

    @Provides
    fun provideMainRepository(): MainRepository = MainRepository()

    /**
     * MainFragmentInjectBuilder 에서 참조되는 프래그먼트와 충돌을 피하기 위해 @Named 사용.
     */
    @Provides
    @Named("mainFragmentInstance")
    fun provideMainFragment(): MainFragment = MainFragment.newInstance()
}

@Module
class MainFragmentModule {

    @Provides
    @Named("fragmentViewModel")
    fun provideFragmentViewModel(fragment: MainFragment): MainViewModel = ViewModelProviders.of(fragment).get(MainViewModel::class.java)

}