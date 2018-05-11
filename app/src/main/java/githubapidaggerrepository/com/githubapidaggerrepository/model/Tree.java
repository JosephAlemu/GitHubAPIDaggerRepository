
package githubapidaggerrepository.com.githubapidaggerrepository.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tree implements Parcelable
{

    @SerializedName("sha")
    @Expose
    private String sha;
    @SerializedName("url")
    @Expose
    private String url;
    public final static Creator<Tree> CREATOR = new Creator<Tree>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Tree createFromParcel(Parcel in) {
            return new Tree(in);
        }

        public Tree[] newArray(int size) {
            return (new Tree[size]);
        }

    }
    ;

    protected Tree(Parcel in) {
        this.sha = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Tree() {
    }

    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(sha);
        dest.writeValue(url);
    }

    public int describeContents() {
        return  0;
    }

}
