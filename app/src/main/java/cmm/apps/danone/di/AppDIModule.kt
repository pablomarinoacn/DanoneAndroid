package cmm.apps.danone.di

import cmm.apps.danone.data.di.DataDIModule
import cmm.apps.danone.datasource_remote.di.RemoteDIModule
import cmm.apps.danone.domain.di.DomainDIModule
import cmm.apps.danone.view.di.ViewDIModule
import cmm.apps.datasource_local.di.LocalDIModule
import org.koin.dsl.module

object AppDIModule {

    val modules = module {
        includes(
            ViewDIModule.module,
            LocalDIModule.module,
            RemoteDIModule.module,
            DataDIModule.module,
            DomainDIModule.module
        )
    }
}