package learningtest.dagger2.di

import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, FeaturesModule::class])
interface AppComponent : LearningTestAppComponent