package learningtest.dagger2.feature.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import learningtest.dagger2.R
import learningtest.dagger2.base.BaseActivity
import javax.inject.Inject
import javax.inject.Named

class MainActivity : BaseActivity() {

    val mainFragment: MainFragment = MainFragment.newInstance()

    @Inject
    @field:Named("activityViewModel")
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkNotNull(mainFragment)
        assert(viewModel == ViewModelProviders.of(this).get(MainViewModel::class.java))

        viewModel.foobarNumber = 20

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, mainFragment)
            .commit()
    }
}
