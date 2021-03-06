// Generated by Dagger (https://dagger.dev).
package com.nadi.nadimovies;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.nadi.core.movie.MovieGateway;
import com.nadi.core.movie.MovieUseCase;
import com.nadi.core.similar.SimilarGateway;
import com.nadi.core.similar.SimilarUseCase;
import com.nadi.core.trailer.TrailerGateway;
import com.nadi.core.trailer.TrailerUseCase;
import com.nadi.data.di.AppModule;
import com.nadi.data.di.AppModule_ProvideRetrofitInstanceFactory;
import com.nadi.data.di.AppModule_ProvideSimilarDataGatewayFactory;
import com.nadi.data.di.AppModule_ProvideTestDataGatewayFactory;
import com.nadi.data.di.AppModule_ProvideTrailerDataGatewayFactory;
import com.nadi.data.di.AppModule_ProvideWebServiceFactory;
import com.nadi.data.network.MovieAPIs;
import com.nadi.nadimovies.ui.MainActivity;
import com.nadi.nadimovies.ui.details.DetailsFragment;
import com.nadi.nadimovies.ui.details.DetailsViewModel_AssistedFactory;
import com.nadi.nadimovies.ui.details.DetailsViewModel_AssistedFactory_Factory;
import com.nadi.nadimovies.ui.home.HomeFragment;
import com.nadi.nadimovies.ui.home.HomeViewModel_AssistedFactory;
import com.nadi.nadimovies.ui.home.HomeViewModel_AssistedFactory_Factory;
import com.nadi.nadimovies.ui.trailer.TrailerFragment;
import com.nadi.nadimovies.ui.trailer.TrailerViewModel_AssistedFactory;
import com.nadi.nadimovies.ui.trailer.TrailerViewModel_AssistedFactory_Factory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainApplication_HiltComponents_SingletonC extends MainApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object movieAPIs = new MemoizedSentinel();

  private volatile Object similarGateway = new MemoizedSentinel();

  private volatile Object movieGateway = new MemoizedSentinel();

  private volatile Object trailerGateway = new MemoizedSentinel();

  private DaggerMainApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private Retrofit retrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideRetrofitInstanceFactory.provideRetrofitInstance();
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private MovieAPIs movieAPIs() {
    Object local = movieAPIs;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = movieAPIs;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideWebServiceFactory.provideWebService(retrofit());
          movieAPIs = DoubleCheck.reentrantCheck(movieAPIs, local);
        }
      }
    }
    return (MovieAPIs) local;
  }

  private SimilarGateway similarGateway() {
    Object local = similarGateway;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = similarGateway;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideSimilarDataGatewayFactory.provideSimilarDataGateway(movieAPIs());
          similarGateway = DoubleCheck.reentrantCheck(similarGateway, local);
        }
      }
    }
    return (SimilarGateway) local;
  }

  private MovieGateway movieGateway() {
    Object local = movieGateway;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = movieGateway;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideTestDataGatewayFactory.provideTestDataGateway(movieAPIs());
          movieGateway = DoubleCheck.reentrantCheck(movieGateway, local);
        }
      }
    }
    return (MovieGateway) local;
  }

  private TrailerGateway trailerGateway() {
    Object local = trailerGateway;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = trailerGateway;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideTrailerDataGatewayFactory.provideTrailerDataGateway(movieAPIs());
          trailerGateway = DoubleCheck.reentrantCheck(trailerGateway, local);
        }
      }
    }
    return (TrailerGateway) local;
  }

  @Override
  public void injectMainApplication(MainApplication mainApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MainApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMainApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MainApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MainApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MainApplication_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements MainApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MainApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<SimilarUseCase> similarUseCaseProvider;

      private volatile Provider<DetailsViewModel_AssistedFactory> detailsViewModel_AssistedFactoryProvider;

      private volatile Provider<MovieUseCase> movieUseCaseProvider;

      private volatile Provider<HomeViewModel_AssistedFactory> homeViewModel_AssistedFactoryProvider;

      private volatile Provider<TrailerUseCase> trailerUseCaseProvider;

      private volatile Provider<TrailerViewModel_AssistedFactory> trailerViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private SimilarUseCase similarUseCase() {
        return new SimilarUseCase(DaggerMainApplication_HiltComponents_SingletonC.this.similarGateway());
      }

      private Provider<SimilarUseCase> similarUseCaseProvider() {
        Object local = similarUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          similarUseCaseProvider = (Provider<SimilarUseCase>) local;
        }
        return (Provider<SimilarUseCase>) local;
      }

      private DetailsViewModel_AssistedFactory detailsViewModel_AssistedFactory() {
        return DetailsViewModel_AssistedFactory_Factory.newInstance(similarUseCaseProvider());
      }

      private Provider<DetailsViewModel_AssistedFactory> detailsViewModel_AssistedFactoryProvider(
          ) {
        Object local = detailsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          detailsViewModel_AssistedFactoryProvider = (Provider<DetailsViewModel_AssistedFactory>) local;
        }
        return (Provider<DetailsViewModel_AssistedFactory>) local;
      }

      private MovieUseCase movieUseCase() {
        return new MovieUseCase(DaggerMainApplication_HiltComponents_SingletonC.this.movieGateway());
      }

      private Provider<MovieUseCase> movieUseCaseProvider() {
        Object local = movieUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          movieUseCaseProvider = (Provider<MovieUseCase>) local;
        }
        return (Provider<MovieUseCase>) local;
      }

      private HomeViewModel_AssistedFactory homeViewModel_AssistedFactory() {
        return HomeViewModel_AssistedFactory_Factory.newInstance(movieUseCaseProvider());
      }

      private Provider<HomeViewModel_AssistedFactory> homeViewModel_AssistedFactoryProvider() {
        Object local = homeViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          homeViewModel_AssistedFactoryProvider = (Provider<HomeViewModel_AssistedFactory>) local;
        }
        return (Provider<HomeViewModel_AssistedFactory>) local;
      }

      private TrailerUseCase trailerUseCase() {
        return new TrailerUseCase(DaggerMainApplication_HiltComponents_SingletonC.this.trailerGateway());
      }

      private Provider<TrailerUseCase> trailerUseCaseProvider() {
        Object local = trailerUseCaseProvider;
        if (local == null) {
          local = new SwitchingProvider<>(5);
          trailerUseCaseProvider = (Provider<TrailerUseCase>) local;
        }
        return (Provider<TrailerUseCase>) local;
      }

      private TrailerViewModel_AssistedFactory trailerViewModel_AssistedFactory() {
        return TrailerViewModel_AssistedFactory_Factory.newInstance(trailerUseCaseProvider());
      }

      private Provider<TrailerViewModel_AssistedFactory> trailerViewModel_AssistedFactoryProvider(
          ) {
        Object local = trailerViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          trailerViewModel_AssistedFactoryProvider = (Provider<TrailerViewModel_AssistedFactory>) local;
        }
        return (Provider<TrailerViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> mapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(3).put("com.nadi.nadimovies.ui.details.DetailsViewModel", (Provider) detailsViewModel_AssistedFactoryProvider()).put("com.nadi.nadimovies.ui.home.HomeViewModel", (Provider) homeViewModel_AssistedFactoryProvider()).put("com.nadi.nadimovies.ui.trailer.TrailerViewModel", (Provider) trailerViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory provideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), mapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      private Set<ViewModelProvider.Factory> defaultActivityViewModelFactorySetOfViewModelProviderFactory(
          ) {
        return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String>emptySet(), new ViewModelCBuilder(), defaultActivityViewModelFactorySetOfViewModelProviderFactory(), Collections.<ViewModelProvider.Factory>emptySet());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MainApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MainApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory provideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.mapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        private Set<ViewModelProvider.Factory> defaultFragmentViewModelFactorySetOfViewModelProviderFactory(
            ) {
          return Collections.<ViewModelProvider.Factory>singleton(provideFactory());
        }

        @Override
        public void injectDetailsFragment(DetailsFragment detailsFragment) {
        }

        @Override
        public void injectHomeFragment(HomeFragment homeFragment) {
        }

        @Override
        public void injectTrailerFragment(TrailerFragment trailerFragment) {
        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMainApplication_HiltComponents_SingletonC.this.applicationContextModule), Collections.<String>emptySet(), new ViewModelCBuilder(), ActivityCImpl.this.defaultActivityViewModelFactorySetOfViewModelProviderFactory(), defaultFragmentViewModelFactorySetOfViewModelProviderFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MainApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MainApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MainApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MainApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MainApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MainApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.nadi.nadimovies.ui.details.DetailsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.detailsViewModel_AssistedFactory();

            case 1: // com.nadi.core.similar.SimilarUseCase 
            return (T) ActivityCImpl.this.similarUseCase();

            case 2: // com.nadi.nadimovies.ui.home.HomeViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.homeViewModel_AssistedFactory();

            case 3: // com.nadi.core.movie.MovieUseCase 
            return (T) ActivityCImpl.this.movieUseCase();

            case 4: // com.nadi.nadimovies.ui.trailer.TrailerViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.trailerViewModel_AssistedFactory();

            case 5: // com.nadi.core.trailer.TrailerUseCase 
            return (T) ActivityCImpl.this.trailerUseCase();

            default: throw new AssertionError(id);
          }
        }
      }
    }

    private final class ViewModelCBuilder implements MainApplication_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public MainApplication_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends MainApplication_HiltComponents.ViewModelC {
      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return Collections.<String, Provider<ViewModel>>emptyMap();
      }
    }
  }

  private final class ServiceCBuilder implements MainApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MainApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MainApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
