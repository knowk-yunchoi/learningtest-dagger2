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

    @Inject
    lateinit var mainViewModel2Factory: ViewModelFactory<MainViewModel2>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkNotNull(mainFragment)
        checkNotNull(mainViewModel2Factory.get(this).mainRepository)
        assert(viewModel == ViewModelProviders.of(this).get(MainViewModel::class.java))

        viewModel.foobarNumber = 20

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, mainFragment)
            .commit()
    }
}
