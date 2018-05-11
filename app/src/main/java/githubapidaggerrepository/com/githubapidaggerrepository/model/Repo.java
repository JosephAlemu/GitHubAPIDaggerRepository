
package githubapidaggerrepository.com.githubapidaggerrepository.model;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repo implements Parcelable
{

    @SerializedName("sha")
    @Expose
    private String sha;
    @SerializedName("commit")
    @Expose
    private Commit commit;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("author")
    @Expose
    private Author_ author;
    @SerializedName("committer")
    @Expose
    private Committer_ committer;
    @SerializedName("parents")
    @Expose
    private List<Parent> parents = null;
    public final static Creator<Repo> CREATOR = new Creator<Repo>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Repo createFromParcel(Parcel in) {
            return new Repo(in);
        }

        public Repo[] newArray(int size) {
            return (new Repo[size]);
        }

    }
    ;

    protected Repo(Parcel in) {
        this.sha = ((String) in.readValue((String.class.getClassLoader())));
        this.commit = ((Commit) in.readValue((Commit.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.commentsUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.author = ((Author_) in.readValue((Author_.class.getClassLoader())));
        this.committer = ((Committer_) in.readValue((Committer_.class.getClassLoader())));
        in.readList(this.parents, (Repo.class.getClassLoader()));
    }

    public Repo() {
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Commit getCommit() {
        return commit;
    }

    public void setCommit(Commit commit) {
        this.commit = commit;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public Author_ getAuthor() {
        return author;
    }

    public void setAuthor(Author_ author) {
        this.author = author;
    }

    public Committer_ getCommitter() {
        return committer;
    }

    public void setCommitter(Committer_ committer) {
        this.committer = committer;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(sha);
        dest.writeValue(commit);
        dest.writeValue(url);
        dest.writeValue(htmlUrl);
        dest.writeValue(commentsUrl);
        dest.writeValue(author);
        dest.writeValue(committer);
        dest.writeList(parents);
    }

    public int describeContents() {
        return  0;
    }

}
