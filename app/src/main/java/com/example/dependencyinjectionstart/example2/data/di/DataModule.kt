package com.example.dependencyinjectionstart.example2.data.di

import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.example.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

//    @Provides
//    fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
//        return impl
//    }
//
//    @Provides
//    fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
//        return impl
//    }
}