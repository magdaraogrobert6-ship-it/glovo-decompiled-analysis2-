package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class accessupdateBuffersOnAppeared implements Parcelable.Creator {
    public final /* synthetic */ int serializer;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = this.serializer;
        if (i2 != 0) {
            return i2 != 1 ? new androidx.compose.runtime.ParcelableSnapshotMutableLongState[i] : new androidx.compose.runtime.ParcelableSnapshotMutableFloatState[i];
        }
        return new androidx.compose.runtime.ParcelableSnapshotMutableIntState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = this.serializer;
        if (i != 0) {
            return i != 1 ? new androidx.compose.runtime.ParcelableSnapshotMutableLongState(parcel.readLong()) : new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(parcel.readFloat());
        }
        return new androidx.compose.runtime.ParcelableSnapshotMutableIntState(parcel.readInt());
    }
}
