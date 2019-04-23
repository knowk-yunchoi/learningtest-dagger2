package learningtest.dagger2.di

import learningtest.dagger2.LearningTestApplication

interface LearningTestAppComponent {
    fun inject(application: LearningTestApplication)
}