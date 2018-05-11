package githubapidaggerrepository.com.githubapidaggerrepository.view.base;

public interface BasePresenter<V extends BaseView> {

    void attachView(V view);

    void detachView();
}
