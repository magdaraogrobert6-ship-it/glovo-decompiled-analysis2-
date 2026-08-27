package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzd;
import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetNcp implements Parcelable.Creator {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ accessgetNcp(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (this.IconCompatParcelizer != 0) {
            return new zzd(parcel.readStrongBinder());
        }
        int iWrite = UrlUtils.write(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iWrite) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
            } else {
                intent = (Intent) UrlUtils.read(parcel, i, Intent.CREATOR);
            }
        }
        Object[] objArr = {parcel, Integer.valueOf(iWrite)};
        UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), objArr);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return this.IconCompatParcelizer != 0 ? new zzd[i] : new CloudMessage[i];
    }
}
