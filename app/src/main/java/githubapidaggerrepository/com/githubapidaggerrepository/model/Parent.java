
package githubapidaggerrepository.com.githubapidaggerrepository.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parent implements Parcelable
{

    @SerializedName("sha")
    @Expose
    private String sha;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    public final static Creator<Parent> CREATOR = new Creator<Parent>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Parent createFromParcel(Parcel in) {
            return new Parent(in);
        }

        public Parent[] newArray(int size) {
            return (new Parent[size]);
        }

    }
    ;

    protected Parent(Parcel in) {
        this.sha = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.htmlUrl = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Parent() {
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

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(sha);
        dest.writeValue(url);
        dest.writeValue(htmlUrl);
    }

    public int describeContents() {
        return  0;
    }

}
