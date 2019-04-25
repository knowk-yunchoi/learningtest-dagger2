package learningtest.dagger2.di

import javax.inject.Scope

@Scope
annotation class ActivityScope

@Scope
@Target(AnnotationTarget.TYPE, AnnotationTarget.FUNCTION)
annotation class FragmentScope
