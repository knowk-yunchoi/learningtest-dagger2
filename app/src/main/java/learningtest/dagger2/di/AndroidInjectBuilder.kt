package learningtest.dagger2.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import learningtest.dagger2.feature.main.MainActivity
import learningtest.dagger2.feature.main.MainModule

@Module
abstract class AndroidInjectBuilder {

    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun bindMainActivity(): MainActivity

}