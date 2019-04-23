package learningtest.dagger2.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import learningtest.dagger2.feature.main.MainActivity
import learningtest.dagger2.feature.main.MainModule

@Module
abstract class FeaturesModule {

    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun contributeMainActivityInjector(): MainActivity

//    @ContributesAndroidInjector(modules = [MainModule::class])
//    abstract fun contributeMainFragmentInjector(): MainFragment
}