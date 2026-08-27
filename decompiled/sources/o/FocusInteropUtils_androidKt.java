package o;

import android.app.Notification;
import android.os.Parcel;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class FocusInteropUtils_androidKt implements toAndroidFocusDirection3ESFkO8 {
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final Notification serializer;
    public final int write;

    public final void serializer(PlaybackStateCompat playbackStateCompat) {
        String str = this.read;
        int i = this.write;
        String str2 = this.RemoteActionCompatParcelizer;
        Notification notification = this.serializer;
        ParcelableVolumeInfo parcelableVolumeInfo = (ParcelableVolumeInfo) playbackStateCompat;
        parcelableVolumeInfo.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(PlaybackStateCompat.RemoteActionCompatParcelizer);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            parcelObtain.writeString(str2);
            parcelObtain.writeTypedObject(notification, 0);
            parcelableVolumeInfo.write.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public FocusInteropUtils_androidKt(String str, int i, String str2, Notification notification) {
        this.read = str;
        this.write = i;
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = notification;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.read);
        sb.append(", id:");
        sb.append(this.write);
        sb.append(", tag:");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, "]");
    }
}
