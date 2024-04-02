package uk.ac.tees.mad.d3617913.di

import android.app.Application
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uk.ac.tees.mad.d3617913.data.manager.LocalUserManagerImpl
import uk.ac.tees.mad.d3617913.domain.manager.LocalUserManager
import uk.ac.tees.mad.d3617913.domain.usecases.app_entry.AppEntryUseCases
import uk.ac.tees.mad.d3617913.domain.usecases.app_entry.ReadAppEntry
import uk.ac.tees.mad.d3617913.domain.usecases.app_entry.SaveAppEntry
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)

    @Provides
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManager
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )
}