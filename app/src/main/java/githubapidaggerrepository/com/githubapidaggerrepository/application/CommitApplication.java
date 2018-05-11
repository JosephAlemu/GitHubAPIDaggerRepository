package githubapidaggerrepository.com.githubapidaggerrepository.application;

import android.app.Application;


import githubapidaggerrepository.com.githubapidaggerrepository.injection.component.DaggerHomeComponent;
import githubapidaggerrepository.com.githubapidaggerrepository.injection.component.HomeComponent;
import githubapidaggerrepository.com.githubapidaggerrepository.injection.module.NetworkModule;
import githubapidaggerrepository.com.githubapidaggerrepository.utils.Constant;

/**
 * Created by user on 5/10/2018.
 */

public class CommitApplication extends Application {

    ///
    private HomeComponent mHomeComponent;

    @Override
    public void onCreate() {
        resolveDependency();
        super.onCreate();
    }


    private void resolveDependency() {


        mHomeComponent =  DaggerHomeComponent.builder()
                .networkModule(new NetworkModule(Constant.BASE_URL))
                .build();
    }

    public HomeComponent getApiComponent() {
        return mHomeComponent;
    }

}
