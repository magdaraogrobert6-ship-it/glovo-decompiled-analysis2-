package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import o.accessupdateBuffersOnAppeared;
import o.getBrush;
import o.getOffsetF1C5BW0;
import o.onCreateVirtualViewTranslationRequestsui;
import o.onViewDetachedFromWindow;
import o.setShape;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class ParcelableSnapshotMutableLongState extends onCreateVirtualViewTranslationRequestsui implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new accessupdateBuffersOnAppeared(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableLongState(long j) {
        getBrush getbrushWrite = getOffsetF1C5BW0.write();
        onViewDetachedFromWindow onviewdetachedfromwindow = new onViewDetachedFromWindow(getbrushWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), j);
        if (!(getbrushWrite instanceof setShape)) {
            onviewdetachedfromwindow.MediaSessionCompatQueueItem = new onViewDetachedFromWindow(1L, j);
        }
        this.serializer = onviewdetachedfromwindow;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(RemoteActionCompatParcelizer());
    }
}
