package com.example.dependencyinjectionstart.example2.data.di

import com.example.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import com.example.dependencyinjectionstart.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DomainModule {

    @Binds
    abstract fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository

//    @Provides
//    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
//        return impl
//    }
}