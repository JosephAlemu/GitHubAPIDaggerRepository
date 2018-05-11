package githubapidaggerrepository.com.githubapidaggerrepository.view.home;

import java.util.List;

import javax.inject.Inject;

import githubapidaggerrepository.com.githubapidaggerrepository.data.remote.ApiInterface;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Comment;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by user on 5/10/2018.
 */
public  class HomePresenter implements HomeContract.Presenter {


    ApiInterface commentService;
    HomeContract.View view;

    @Inject
    public HomePresenter(ApiInterface commentService) {
        this.commentService = commentService;
    }

    @Override
    public void fetchData(){

        commentService.getListRepos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Comment>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<Comment> comments) {
                        view.onCommentsReceived(comments);
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        view.showError(e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });



    }


    @Override
    public void attachView(HomeContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {

        this.view = null;
    }
}