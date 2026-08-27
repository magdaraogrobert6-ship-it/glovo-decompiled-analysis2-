package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import o.access700;
import o.getBitmapFromCache;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class CodeScanTaskArgs implements Parcelable {
    public static final Parcelable.Creator<CodeScanTaskArgs> CREATOR = new access700(1);
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int serializer = 1;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 7;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 59;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    static {
        int i = serializer + 39;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public CodeScanTaskArgs(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = j;
        this.read = str;
        this.write = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 77;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeLong(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        int i5 = MediaBrowserCompatMediaItem + 69;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 9;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.write.hashCode() % af$$ExternalSyntheticOutline0.m(Long.hashCode(this.RemoteActionCompatParcelizer) >> 126, 63, this.read);
        } else {
            iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(Long.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.read);
        }
        int i3 = MediaBrowserCompatMediaItem + 101;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("CodeScanTaskArgs(deliveryId=", ", deliveryState=", this.RemoteActionCompatParcelizer, this.read), ", taskId=", this.write, ")");
        int i4 = MediaSessionCompatQueueItem + 31;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 125;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodeScanTaskArgs)) {
            return false;
        }
        CodeScanTaskArgs codeScanTaskArgs = (CodeScanTaskArgs) obj;
        if (this.RemoteActionCompatParcelizer == codeScanTaskArgs.RemoteActionCompatParcelizer) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, codeScanTaskArgs.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, codeScanTaskArgs.write}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i5 = i3 + 109;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
