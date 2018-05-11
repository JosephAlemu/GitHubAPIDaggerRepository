package githubapidaggerrepository.com.githubapidaggerrepository.view.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import javax.inject.Inject;

import githubapidaggerrepository.com.githubapidaggerrepository.R;
import githubapidaggerrepository.com.githubapidaggerrepository.application.CommitApplication;
import githubapidaggerrepository.com.githubapidaggerrepository.data.remote.ApiInterface;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Comment;
import githubapidaggerrepository.com.githubapidaggerrepository.utils.ViewUtils;

public class HomeActivity extends AppCompatActivity implements HomeContract.View{

    private RecyclerView rvComments;
    private HomeAdapter commentsAdapter;

    @Inject
    ApiInterface repoService;

    @Inject
    HomePresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupDaggerComponent();

    }

    private void setupDaggerComponent() {
        ((CommitApplication) getApplication()).getApiComponent().inject(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.attachView(this);
        presenter.fetchData();

    }

    @Override
    public void onCommentsReceived(List<Comment> commentList) {

        rvComments = findViewById(R.id.rvComments);
        rvComments.setLayoutManager(new LinearLayoutManager(this));
        commentsAdapter = new HomeAdapter(commentList);
        rvComments.setAdapter(commentsAdapter);

    }



    @Override
    public void showError(String error) {
        ViewUtils.showToast(this, error);
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detachView();
    }
}
