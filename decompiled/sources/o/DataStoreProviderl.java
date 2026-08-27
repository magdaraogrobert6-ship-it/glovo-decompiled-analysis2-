package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class DataStoreProviderl implements Parcelable.Creator<com.sentiance.sdk.tile.store.c> {
    @Override // android.os.Parcelable.Creator
    public final com.sentiance.sdk.tile.store.c[] newArray(int i) {
        return new com.sentiance.sdk.tile.store.c[i];
    }

    @Override // android.os.Parcelable.Creator
    public final com.sentiance.sdk.tile.store.c createFromParcel(Parcel parcel) {
        return new com.sentiance.sdk.tile.store.c(parcel);
    }
}
