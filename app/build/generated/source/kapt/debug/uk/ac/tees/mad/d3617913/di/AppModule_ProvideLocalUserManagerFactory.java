// Generated by Dagger (https://dagger.dev).
package uk.ac.tees.mad.d3617913.di;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import uk.ac.tees.mad.d3617913.domain.manager.LocalUserManager;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideLocalUserManagerFactory implements Factory<LocalUserManager> {
  private final Provider<Application> applicationProvider;

  public AppModule_ProvideLocalUserManagerFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public LocalUserManager get() {
    return provideLocalUserManager(applicationProvider.get());
  }

  public static AppModule_ProvideLocalUserManagerFactory create(
      Provider<Application> applicationProvider) {
    return new AppModule_ProvideLocalUserManagerFactory(applicationProvider);
  }

  public static LocalUserManager provideLocalUserManager(Application application) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideLocalUserManager(application));
  }
}