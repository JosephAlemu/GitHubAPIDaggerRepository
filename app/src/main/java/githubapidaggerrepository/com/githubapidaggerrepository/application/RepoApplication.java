package githubapidaggerrepository.com.githubapidaggerrepository.application;

import android.app.Application;

import githubapidaggerrepository.com.githubapidaggerrepository.dependecies.ApiComponent;
import githubapidaggerrepository.com.githubapidaggerrepository.dependecies.DaggerApiComponent;
import githubapidaggerrepository.com.githubapidaggerrepository.dependecies.NetworkModule;
import githubapidaggerrepository.com.githubapidaggerrepository.utils.Constant;

/**
 * Created by user on 5/10/2018.
 */

public class RepoApplication extends Application {

    ///
    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        resolveDependency();
        super.onCreate();
    }


    private void resolveDependency() {


        mApiComponent =  DaggerApiComponent.builder()
                .networkModule(new NetworkModule(Constant.BASE_URL))
                .build();
    }

    public ApiComponent getApiComponent() {
        return mApiComponent;
    }

}
