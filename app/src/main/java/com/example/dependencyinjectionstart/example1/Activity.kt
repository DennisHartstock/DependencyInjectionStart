package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    @Inject
    lateinit var mouse: Mouse

    @Inject
    lateinit var monitor: Monitor

    init {
        DaggerNewComponent.create().inject(this)
    }

//    private val component = DaggerNewComponent.create()
//    val keyboard = component.getKeyboard()
//    val mouse = component.getMouse()
//    val monitor = component.getMonitor()

}