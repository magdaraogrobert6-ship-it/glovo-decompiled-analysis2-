package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompatCustomAction implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new android.support.v4.media.session.PlaybackStateCompat.CustomAction[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new android.support.v4.media.session.PlaybackStateCompat.CustomAction(parcel);
    }
}
