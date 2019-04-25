package learningtest.dagger2.feature.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import learningtest.dagger2.R
import learningtest.dagger2.base.BaseActivity
import learningtest.dagger2.di.ViewModelFactory
import learningtest.dagger2.di.get
import javax.inject.Inject
import javax.inject.Named

class MainActivity : BaseActivity() {

    @Inject
    @field:Named("mainFragmentInstance")
    lateinit var mainFragment: MainFragment

    @Inject
    @field:Named("activityViewModel")
    lateinit var viewModel: MainViewModel

    /**
     * Activity/Fragment/BroadcastReceiver/Service/ContentProvider 외에 클래스 내부에서 DI 받아야 하는 경우 팩토리 또는 수동으로 의존성 주입해줘야 함.
     */
    @Inject
    lateinit var mainViewModel2Factory: ViewModelFactory<MainViewModel2>
    private val mainViewModel2: MainViewModel2 by lazy {
        mainViewModel2Factory.get(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkNotNull(mainFragment)
        checkNotNull(mainViewModel2.mainRepository)
        assert(viewModel == ViewModelProviders.of(this).get(MainViewModel::class.java))

        viewModel.foobarNumber = 20

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, mainFragment)
            .commit()
    }
}
