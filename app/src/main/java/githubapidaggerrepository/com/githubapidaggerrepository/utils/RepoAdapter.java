package githubapidaggerrepository.com.githubapidaggerrepository.utils;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import githubapidaggerrepository.com.githubapidaggerrepository.R;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Commit;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Repo;

/**
 * Created by user on 5/10/2018.
 */

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.RepoViewHolder> {

    private List<Repo> reposList;

    public RepoAdapter(List<Repo> reposList) {
        this.reposList = reposList;
    }


    @Override
    public int getItemCount() {
        return reposList.size();
    }

    @Override
    public void onBindViewHolder(RepoViewHolder repoViewHolder, int i) {
        Repo repo = reposList.get(i);
        repoViewHolder.vAuthor.setText(repo.getCommit().getAuthor().getName());
        repoViewHolder.vCommitHash.setText(repo.getSha());
        repoViewHolder.vCommitMessage.setText(repo.getCommit().getMessage());
        repoViewHolder.vTitle.setText("Commiter Name "+":" + repo.getCommit().getCommitter().getName());
    }

    @Override
    public RepoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_layout, viewGroup, false);

        return new RepoViewHolder(itemView);
    }

    public static class RepoViewHolder extends RecyclerView.ViewHolder {

        protected TextView vAuthor;
        protected TextView vCommitHash;
        protected TextView vCommitMessage;
        protected TextView vTitle;

        public RepoViewHolder(View v) {
            super(v);
            vAuthor =  (TextView) v.findViewById(R.id.txtAuthor);
            vCommitHash = (TextView)  v.findViewById(R.id.txtCommitHash);
            vCommitMessage = (TextView)  v.findViewById(R.id.txtCommitMessage);
            vTitle = (TextView) v.findViewById(R.id.title);
        }
    }
}