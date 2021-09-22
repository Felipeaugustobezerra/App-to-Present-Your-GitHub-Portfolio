package br.com.dio.apprepositories

import android.app.Application
import br.com.dio.apprepositories.domain.di.DomainModule
import br.com.dio.apprepositories.data.di.DataModule
import br.com.dio.apprepositories.presentation.di.PresentationModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModel.load()
    }
}