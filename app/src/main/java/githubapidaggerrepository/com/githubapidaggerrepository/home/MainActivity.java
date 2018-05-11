package githubapidaggerrepository.com.githubapidaggerrepository.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import githubapidaggerrepository.com.githubapidaggerrepository.Api.ApiInterface;
import githubapidaggerrepository.com.githubapidaggerrepository.R;
import githubapidaggerrepository.com.githubapidaggerrepository.application.RepoApplication;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Comment;
import githubapidaggerrepository.com.githubapidaggerrepository.utils.RepoAdapter;

public class MainActivity extends AppCompatActivity implements MainContract.View{
    private RecyclerView rv;
    private RepoAdapter adapter;

     private List<Comment> list;
    @Inject
    ApiInterface repoService;

    BasePresenter basePresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();

         ((RepoApplication) getApplication()).getApiComponent().inject(this);

          basePresenter = new BasePresenter(this, repoService);
          basePresenter.fetchData();

    }

    @Override
    public void onsuccess(List<Comment> list) {

        // set up the RecyclerView
        rv = (RecyclerView)findViewById(R.id.rvRepo);
        rv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new RepoAdapter(list);
        rv.setAdapter(adapter);


       //  adapter.notifyDataSetChanged();
    }

    @Override
    public void onfailure(String error) {

    }
}
