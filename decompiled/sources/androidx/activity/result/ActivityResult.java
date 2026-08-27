package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.zzd;
import o.getViewModelStore;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new zzd(11);
    public final Intent RemoteActionCompatParcelizer;
    public final int write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ActivityResult(int i, Intent intent) {
        this.write = i;
        this.RemoteActionCompatParcelizer = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.write);
        Intent intent = this.RemoteActionCompatParcelizer;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public final String toString() {
        return "ActivityResult{resultCode=" + getViewModelStore.serializer(this.write) + ", data=" + this.RemoteActionCompatParcelizer + '}';
    }
}
