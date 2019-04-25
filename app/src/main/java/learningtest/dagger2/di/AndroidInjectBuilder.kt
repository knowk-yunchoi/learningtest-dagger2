package learningtest.dagger2.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import learningtest.dagger2.feature.main.*

@Module
abstract class AndroidInjectBuilder {

    @ContributesAndroidInjector(modules = [MainActivityModule::class, MainFragmentInjectBuilder::class])
    abstract fun bindMainActivity(): MainActivity

}

@Module
abstract class MainFragmentInjectBuilder {
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun bindMainFragment(): MainFragment
}