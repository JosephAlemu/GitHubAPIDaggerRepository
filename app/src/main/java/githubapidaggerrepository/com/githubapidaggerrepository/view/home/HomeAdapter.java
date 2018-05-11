package githubapidaggerrepository.com.githubapidaggerrepository.view.home;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import githubapidaggerrepository.com.githubapidaggerrepository.R;
import githubapidaggerrepository.com.githubapidaggerrepository.model.Comment;

/**
 * Created by user on 5/10/2018.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.RepoViewHolder> {

    private List<Comment> commentList;

    public HomeAdapter(List<Comment> commentList) {
        this.commentList = commentList;
    }


    @Override
    public int getItemCount() {
        return commentList.size();
    }

    @Override
    public void onBindViewHolder(RepoViewHolder repoViewHolder, int i) {
        Comment comment = commentList.get(i);
        repoViewHolder.txtAuthor.setText(comment.getCommit().getCommitter().getName());
        repoViewHolder.txtCommitHash.setText("SHA: "+comment.getSha());
        repoViewHolder.txtCommitMessage.setText(comment.getCommit().getMessage());
    }

    @Override
    public RepoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_layout, viewGroup, false);

        return new RepoViewHolder(itemView);
    }

    public static class RepoViewHolder extends RecyclerView.ViewHolder {

        TextView txtAuthor;
        TextView txtCommitHash;
        TextView txtCommitMessage;


        public RepoViewHolder(View v) {
            super(v);
            txtAuthor = v.findViewById(R.id.txtAuthor);
            txtCommitHash = v.findViewById(R.id.txtCommitHash);
            txtCommitMessage = v.findViewById(R.id.txtCommitMessage);

        }
    }
}