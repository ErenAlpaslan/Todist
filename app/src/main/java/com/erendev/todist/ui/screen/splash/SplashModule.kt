package com.erendev.todist.ui.screen.splash

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val splashModule = module {
    viewModel { SplashViewModel() }
    factory { SplashScreen() }
}