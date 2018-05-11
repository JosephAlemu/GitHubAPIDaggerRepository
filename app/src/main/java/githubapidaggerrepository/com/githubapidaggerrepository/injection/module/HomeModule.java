package githubapidaggerrepository.com.githubapidaggerrepository.injection.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import githubapidaggerrepository.com.githubapidaggerrepository.data.remote.ApiInterface;
import githubapidaggerrepository.com.githubapidaggerrepository.view.home.HomePresenter;

/**
 * Created by user on 5/11/2018.
 */

@Module
public class HomeModule {

    @Provides
    @Singleton
    HomePresenter providesHomePresenter(ApiInterface apiInterface) {
        return new HomePresenter(apiInterface);
    }
}

