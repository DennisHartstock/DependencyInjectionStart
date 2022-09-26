package com.example.dependencyinjectionstart.example2.data.di

import com.example.dependencyinjectionstart.example2.data.datasource.*
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource

//    @Provides
//    fun provideContext(): Context {
//        return context
//    }
//
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