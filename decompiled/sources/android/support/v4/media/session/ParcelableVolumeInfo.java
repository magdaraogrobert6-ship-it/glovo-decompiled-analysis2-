package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.zzd;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new zzd(8);
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.read);
        parcel.writeInt(this.write);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        parcel.writeInt(this.serializer);
        parcel.writeInt(this.IconCompatParcelizer);
    }
}
