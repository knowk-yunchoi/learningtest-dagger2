package learningtest.dagger2.di

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import javax.inject.Provider
import javax.inject.Singleton

@Module
class AppModule(var application: Application) {

    @Singleton
    @Provides
    fun appContext() = application.applicationContext
}