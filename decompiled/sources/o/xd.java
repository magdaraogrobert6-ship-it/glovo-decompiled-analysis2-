package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class xd {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final getWindowAreaDisplayMetrics IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final WorkDatabase_Impl read;
    public final getFailureResponseData serializer;
    public final se write;

    public xd(se seVar, getFailureResponseData getfailureresponsedata, boolean z, WorkDatabase_Impl workDatabase_Impl, getWindowAreaDisplayMetrics getwindowareadisplaymetrics) {
        seVar.getClass();
        getfailureresponsedata.getClass();
        workDatabase_Impl.getClass();
        getwindowareadisplaymetrics.getClass();
        this.write = seVar;
        this.serializer = getfailureresponsedata;
        this.RemoteActionCompatParcelizer = z;
        this.read = workDatabase_Impl;
        this.IconCompatParcelizer = getwindowareadisplaymetrics;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 97;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int iM = d$$ExternalSyntheticOutline0.m((this.serializer.hashCode() + (iHashCode * 31)) * 31, 31, this.RemoteActionCompatParcelizer);
        int iHashCode2 = this.IconCompatParcelizer.hashCode() + ((this.read.hashCode() + iM) * 31);
        int i4 = RatingCompat + 95;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 11;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, xdVar.write}, getCieXyz.write())).booleanValue())) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, xdVar.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (this.RemoteActionCompatParcelizer != xdVar.RemoteActionCompatParcelizer) {
                int i4 = RatingCompat + 61;
                MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            if (this.read != xdVar.read) {
                int i6 = MediaSessionCompatQueueItem + 21;
                RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, xdVar.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i8 = MediaSessionCompatQueueItem + 119;
        RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i8 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "ZoneSelectionInputs(opportunitiesInfo=" + this.write + ", riderStatus=" + this.serializer + ", canRequestLocation=" + this.RemoteActionCompatParcelizer + ", offlineRequestState=" + this.read + ", locationResult=" + this.IconCompatParcelizer + ")";
        int i2 = MediaSessionCompatQueueItem + 49;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
