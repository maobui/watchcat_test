package com.me.bui.watchcattest

import android.app.Application
import com.dynamixsoftware.ErrorAgent

/**
 * Created by mao.bui on 12/21/2018.
 */

class MyApplication : Application() {

    override fun onCreate() {
        ErrorAgent.register(this, 224)
    }
}