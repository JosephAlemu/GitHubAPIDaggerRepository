package githubapidaggerrepository.com.githubapidaggerrepository.data.remote;

import java.util.List;

import githubapidaggerrepository.com.githubapidaggerrepository.model.Comment;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by user on 5/10/2018.
 */

public interface ApiInterface {

     //https://api.github.com/repos/google/dagger/commits

     // https://api.github.com/repos/google/dagger
    @GET("/repos/google/dagger/commits")
    Observable<List<Comment>> getListRepos();

}
