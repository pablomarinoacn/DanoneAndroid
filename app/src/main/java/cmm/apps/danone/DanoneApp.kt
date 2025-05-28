package cmm.apps.danone

import android.app.Application
import androidx.lifecycle.LifecycleObserver
import cmm.apps.danone.di.AppDIModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class DanoneApp : Application(), LifecycleObserver {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            allowOverride(false)
            androidLogger()
            androidContext(this@DanoneApp)
            modules(AppDIModule.modules)
        }
    }
}