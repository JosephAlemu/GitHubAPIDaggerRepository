package githubapidaggerrepository.com.githubapidaggerrepository.home;

import android.util.Log;

import java.util.List;

import githubapidaggerrepository.com.githubapidaggerrepository.Api.ApiInterface;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Commit;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Repo;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by user on 5/10/2018.
 */
public  class BasePresenter implements MainContract.Presenter {

    List<Commit> list;
    ApiInterface repoService;
    MainContract.View view;
    public BasePresenter(MainContract.View view,ApiInterface repoService) {
        this.view = view;
        this.repoService = repoService;
    }

    @Override
    public void fetchData(){

        repoService.getListRepos()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Repo>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List<Repo> repos) {
                        view.onsuccess(repos);
                        Log.d("BasePresenter",""+repos.toString());
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        view.onfailure("error");
                        Log.d("BasePresenter",""+e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });





    }



}