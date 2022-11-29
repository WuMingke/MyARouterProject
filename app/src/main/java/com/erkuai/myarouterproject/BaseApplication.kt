package com.erkuai.myarouterproject

import android.app.Application

class BaseApplication : Application() {

    companion object {
        const val isApplication = BuildConfig.is_application
    }
}