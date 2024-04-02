package uk.ac.tees.mad.d3617913.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Luk/ac/tees/mad/d3617913/di/AppModule;", "", "()V", "provideAppEntryUseCases", "Luk/ac/tees/mad/d3617913/domain/usecases/app_entry/AppEntryUseCases;", "localUserManager", "Luk/ac/tees/mad/d3617913/domain/manager/LocalUserManager;", "provideLocalUserManager", "application", "Landroid/app/Application;", "app_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull
    public static final uk.ac.tees.mad.d3617913.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final uk.ac.tees.mad.d3617913.domain.manager.LocalUserManager provideLocalUserManager(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final uk.ac.tees.mad.d3617913.domain.usecases.app_entry.AppEntryUseCases provideAppEntryUseCases(@org.jetbrains.annotations.NotNull
    uk.ac.tees.mad.d3617913.domain.manager.LocalUserManager localUserManager) {
        return null;
    }
}