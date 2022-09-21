package com.example.dependencyinjectionstart.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example2.ExampleApp
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var viewModel: ExampleViewModel

//    private val component by lazy {
//        DaggerApplicationComponent.builder()
//            .context(application)
//            .timeMillis(System.currentTimeMillis())
//            .build()
//    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val viewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel2::class.java]
    }

//    @Inject
//    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        (application as ExampleApp).component
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.d("MainActivity", "${component.getViewModel()}")
//        Log.d("MainActivity", "${component.getViewModel()}")
//        Log.d("MainActivity", "${component.getDataBase()}")
//        Log.d("MainActivity", "${component.getDataBase()}")
//        Log.d("MainActivity", "${component.getApiService()}")
//        Log.d("MainActivity", "${component.getApiService()}")
        viewModel.method()
        viewModel2.method()
//        val activity = Activity()
//        activity.computer.toString()
//        activity.keyboard.toString()
//        activity.mouse.toString()
//        activity.monitor.toString()
    }
}