package com.example.dependencyinjectionstart.example2.data.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

//    fun getViewModel(): ExampleViewModel
//
//    fun getDataBase(): ExampleDatabase
//
//    fun getApiService():ExampleApiService

    fun inject(activity: MainActivity)

//    @Component.Builder
//    interface ApplicationComponentBuilder {
//
//        @BindsInstance
//        fun context(context: Context): ApplicationComponentBuilder
//
//        @BindsInstance
//        fun timeMillis(timeMillis: Long): ApplicationComponentBuilder
//
//        fun build(): ApplicationComponent
//    }

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}