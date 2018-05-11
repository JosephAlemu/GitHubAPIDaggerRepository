package githubapidaggerrepository.com.githubapidaggerrepository.view.home;

import java.util.List;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Comment;
import githubapidaggerrepository.com.githubapidaggerrepository.view.base.BasePresenter;
import githubapidaggerrepository.com.githubapidaggerrepository.view.base.BaseView;

/**
 * Created by user on 5/10/2018.
 */
public interface HomeContract {

    interface View extends BaseView{

        void onCommentsReceived(List<Comment> commentList);

    }

    interface Presenter extends BasePresenter<View> {

        void fetchData();

    }

}