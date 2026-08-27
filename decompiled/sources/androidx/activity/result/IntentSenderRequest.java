package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.zzd;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new zzd(12);
    public final IntentSender IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final Intent serializer;
    public final int write;

    public final Intent IconCompatParcelizer() {
        return this.serializer;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final IntentSender read() {
        return this.IconCompatParcelizer;
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer;
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.IconCompatParcelizer = intentSender;
        this.serializer = intent;
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.IconCompatParcelizer, i);
        parcel.writeParcelable(this.serializer, i);
        parcel.writeInt(this.write);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
    }
}
