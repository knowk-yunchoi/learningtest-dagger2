package learningtest.dagger2.di

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import learningtest.dagger2.common.MeshRepository
import learningtest.dagger2.feature.main.*

@Module
class AppModule {
    // Analytics, FoobarManager, ImageLoader 등 앱에 전역적으로 필요한 의존성 만들어서 사용.
}

@Module
class RepositoryModule {

    @Provides
    fun provideMeshRepository(): MeshRepository = MeshRepository()

    // 다양한 레파지토리 레이어 의존성 만들어서 사용.
}

@Module
class NetworkModule {
    // OkHttpClient, Retrofit, 관련 서비스들 추가해서 사용.

//    @Provides
//    fun provideMainService(retofit: Retrofit) = retrofit.create(MainService::class.java)
}

@Module
abstract class AndroidActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class, MainFragmentBuilder::class])
    abstract fun bindMainActivity(): MainActivity

    // Activity 추가
}

/**
 * 필요하면 Fragment 별로 모듈을 만들어서 사용.
 */
@Module
abstract class MainFragmentBuilder {
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun bindMainFragment(): MainFragment
}