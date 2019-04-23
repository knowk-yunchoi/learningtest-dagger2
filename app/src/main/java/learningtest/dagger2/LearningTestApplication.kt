package learningtest.dagger2

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import learningtest.dagger2.di.DaggerAppComponent

class LearningTestApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }

}