package githubapidaggerrepository.com.githubapidaggerrepository.injection.component;

import javax.inject.Singleton;

import dagger.Component;
import githubapidaggerrepository.com.githubapidaggerrepository.injection.module.HomeModule;
import githubapidaggerrepository.com.githubapidaggerrepository.injection.module.NetworkModule;
import githubapidaggerrepository.com.githubapidaggerrepository.view.home.HomeActivity;

/**
 * Created by user on 5/10/2018.
 */

@Singleton
@Component(modules = {NetworkModule.class, HomeModule.class})
public interface HomeComponent {

    void inject(HomeActivity target);

}