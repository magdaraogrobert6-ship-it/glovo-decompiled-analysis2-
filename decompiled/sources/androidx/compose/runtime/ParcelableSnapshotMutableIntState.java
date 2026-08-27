package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import o.accessupdateBuffersOnAppeared;
import o.getBrush;
import o.getOffsetF1C5BW0;
import o.onHideTranslationui;
import o.onLayoutChangeui;
import o.setShape;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class ParcelableSnapshotMutableIntState extends onHideTranslationui implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new accessupdateBuffersOnAppeared(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableIntState(int i) {
        getBrush getbrushWrite = getOffsetF1C5BW0.write();
        onLayoutChangeui onlayoutchangeui = new onLayoutChangeui(getbrushWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), i);
        if (!(getbrushWrite instanceof setShape)) {
            onlayoutchangeui.MediaSessionCompatQueueItem = new onLayoutChangeui(1L, i);
        }
        this.IconCompatParcelizer = onlayoutchangeui;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(serializer());
    }
}
