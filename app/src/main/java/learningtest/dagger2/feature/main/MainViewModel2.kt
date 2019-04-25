package learningtest.dagger2.feature.main

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel2 @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel()