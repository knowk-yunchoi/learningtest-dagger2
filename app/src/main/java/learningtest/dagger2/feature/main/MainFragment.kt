package learningtest.dagger2.feature.main

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import learningtest.dagger2.R
import learningtest.dagger2.base.BaseFragment
import javax.inject.Inject
import javax.inject.Named

class MainFragment : BaseFragment() {

    @Inject
    @field:Named("activityViewModel")
    lateinit var activityViewModel: MainViewModel

    @Inject
    @field:Named("fragmentViewModel")
    lateinit var fragmentViewModel: MainViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)

        assert(activityViewModel != null)
        assert(activityViewModel.foobarNumber == 20)

        assert(fragmentViewModel != null)
        assert(fragmentViewModel.foobarNumber == 10)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}
