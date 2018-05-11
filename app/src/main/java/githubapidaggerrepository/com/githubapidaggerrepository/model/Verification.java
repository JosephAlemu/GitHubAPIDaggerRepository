
package githubapidaggerrepository.com.githubapidaggerrepository.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Verification implements Parcelable
{

    @SerializedName("verified")
    @Expose
    private Boolean verified;
    @SerializedName("reason")
    @Expose
    private String reason;
    @SerializedName("signature")
    @Expose
    private Object signature;
    @SerializedName("payload")
    @Expose
    private Object payload;
    public final static Creator<Verification> CREATOR = new Creator<Verification>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Verification createFromParcel(Parcel in) {
            return new Verification(in);
        }

        public Verification[] newArray(int size) {
            return (new Verification[size]);
        }

    }
    ;

    protected Verification(Parcel in) {
        this.verified = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.reason = ((String) in.readValue((String.class.getClassLoader())));
        this.signature = ((Object) in.readValue((Object.class.getClassLoader())));
        this.payload = ((Object) in.readValue((Object.class.getClassLoader())));
    }

    public Verification() {
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Object getSignature() {
        return signature;
    }

    public void setSignature(Object signature) {
        this.signature = signature;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(verified);
        dest.writeValue(reason);
        dest.writeValue(signature);
        dest.writeValue(payload);
    }

    public int describeContents() {
        return  0;
    }

}
