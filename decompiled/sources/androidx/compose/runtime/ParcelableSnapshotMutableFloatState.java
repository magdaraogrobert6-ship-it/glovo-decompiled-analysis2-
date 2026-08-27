package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import o.accessupdateBuffersOnAppeared;
import o.getBrush;
import o.getContentCaptureSessionui;
import o.getOffsetF1C5BW0;
import o.isEnabledui;
import o.setShape;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class ParcelableSnapshotMutableFloatState extends getContentCaptureSessionui implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new accessupdateBuffersOnAppeared(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableFloatState(float f) {
        getBrush getbrushWrite = getOffsetF1C5BW0.write();
        isEnabledui isenabledui = new isEnabledui(getbrushWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), f);
        if (!(getbrushWrite instanceof setShape)) {
            isenabledui.MediaSessionCompatQueueItem = new isEnabledui(1L, f);
        }
        this.serializer = isenabledui;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(serializer());
    }
}
