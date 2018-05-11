package githubapidaggerrepository.com.githubapidaggerrepository.home;

import java.util.List;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Repo;

/**
 * Created by user on 5/10/2018.
 */
public interface MainContract {

    interface View {
         ////
        void onsuccess(List<Repo> list);
        //
        void onfailure(String error);

    }

    interface Presenter {

        void fetchData();

    }

}