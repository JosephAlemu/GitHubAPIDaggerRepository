package githubapidaggerrepository.com.githubapidaggerrepository.dependecies;

import javax.inject.Singleton;

import dagger.Component;
import githubapidaggerrepository.com.githubapidaggerrepository.home.MainActivity;

/**
 * Created by user on 5/10/2018.
 */

@Singleton
@Component(modules = {NetworkModule.class})
public interface ApiComponent {

    void inject(MainActivity target);

}