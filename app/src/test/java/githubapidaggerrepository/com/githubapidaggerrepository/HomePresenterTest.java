package githubapidaggerrepository.com.githubapidaggerrepository;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import githubapidaggerrepository.com.githubapidaggerrepository.data.remote.ApiInterface;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Comment;
import githubapidaggerrepository.com.githubapidaggerrepository.model.CommitModel;
import githubapidaggerrepository.com.githubapidaggerrepository.view.home.HomeContract;
import githubapidaggerrepository.com.githubapidaggerrepository.view.home.HomePresenter;
import io.reactivex.Observable;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by user on 5/15/2018.
 */

public class HomePresenterTest {


    @Mock
    ApiInterface commentService;

    @Mock
    HomeContract.View view;

    HomePresenter homePresenter;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);

        homePresenter = new HomePresenter(commentService);
    }

    @Test
    public void testAttachView(){

        CommitModel commitModel = new CommitModel();

        when(commentService.getListRepos()).thenReturn(Observable.<List<Comment>>fromArray(new List[]{commitModel.getMock()}));
        homePresenter.fetchData();

        verify(view).onCommentsReceived(commitModel.getMock());

    }

    @Test
    public void testFetchData(){


    }



    @After
    public void tearDown(){

    }
}
