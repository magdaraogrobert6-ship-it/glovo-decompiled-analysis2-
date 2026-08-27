package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.zzd;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new zzd(4);
    public final float RemoteActionCompatParcelizer;
    public final int write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.write;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.write);
        parcel.writeFloat(this.RemoteActionCompatParcelizer);
    }

    public RatingCompat(int i, float f) {
        this.write = i;
        this.RemoteActionCompatParcelizer = f;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.write);
        sb.append(" rating=");
        float f = this.RemoteActionCompatParcelizer;
        if (f < 0.0f) {
            strValueOf = "unrated";
        } else {
            strValueOf = String.valueOf(f);
        }
        sb.append(strValueOf);
        return sb.toString();
    }
}
