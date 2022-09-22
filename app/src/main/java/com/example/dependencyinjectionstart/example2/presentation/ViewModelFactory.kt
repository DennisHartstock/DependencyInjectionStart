package com.example.dependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.example2.data.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Provider

@ApplicationScope
class ViewModelFactory @Inject constructor(
    private val viewModelsProviders: @JvmSuppressWildcards Map<String, Provider<ViewModel>>
//private val exampleUseCase: ExampleUseCase,
//private val repository: ExampleRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewModelsProviders[modelClass.simpleName]?.get() as T

//        if (modelClass == ExampleViewModel::class.java) {
//            return ExampleViewModel(exampleUseCase) as T
//        }
//        if (modelClass == ExampleViewModel2::class.java) {
//            return ExampleViewModel2(repository) as T
//        }
//        throw RuntimeException("Unknown view model class $modelClass")
    }
}