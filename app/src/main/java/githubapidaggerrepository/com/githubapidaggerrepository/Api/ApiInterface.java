package githubapidaggerrepository.com.githubapidaggerrepository.Api;

import java.util.List;

import githubapidaggerrepository.com.githubapidaggerrepository.model.Repo;
import io.reactivex.Observable;
import io.reactivex.internal.operators.completable.CompletableMergeIterable;
import retrofit2.http.GET;

/**
 * Created by user on 5/10/2018.
 */

public interface ApiInterface {

     //https://api.github.com/repos/google/dagger/commits

     // https://api.github.com/repos/google/dagger
    @GET("/repos/google/dagger/commits")
    Observable<List<Repo>> getListRepos();

}
