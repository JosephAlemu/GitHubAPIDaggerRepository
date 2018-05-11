package githubapidaggerrepository.com.githubapidaggerrepository.home;

import java.util.List;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Comment;

/**
 * Created by user on 5/10/2018.
 */
public interface MainContract {

    interface View {
         ////
        void onsuccess(List<Comment> list);
        //
        void onfailure(String error);

    }

    interface Presenter {

        void fetchData();

    }

}