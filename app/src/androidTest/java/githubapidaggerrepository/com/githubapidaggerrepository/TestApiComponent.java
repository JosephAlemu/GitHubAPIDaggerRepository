package githubapidaggerrepository.com.githubapidaggerrepository;

import githubapidaggerrepository.com.githubapidaggerrepository.dependecies.ApiComponent;
import githubapidaggerrepository.com.githubapidaggerrepository.home.MainActivity;

/**
 * Created by user on 5/11/2018.
 */

public interface TestApiComponent extends ApiComponent {
    @Override
    public void inject(MainActivityTest target);
}
