package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.zzd;
import o.ComponentActivity;
import o.MediaSessionCompatToken;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new zzd(10);
    public MediaSessionCompatToken RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public void serializer(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new ComponentActivity(this);
            }
            parcel.writeStrongBinder(this.RemoteActionCompatParcelizer.asBinder());
        }
    }
}
