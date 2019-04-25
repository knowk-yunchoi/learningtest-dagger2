package learningtest.dagger2.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import learningtest.dagger2.LearningTestApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AndroidActivityBuilder::class])
interface AppComponent: AndroidInjector<LearningTestApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: LearningTestApplication): Builder
        fun build(): AppComponent
    }

}