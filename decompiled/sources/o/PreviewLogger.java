package o;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PreviewLogger {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final List IconCompatParcelizer;
    public final getPositionannotations serializer;

    public PreviewLogger(getPositionannotations getpositionannotations, List list) {
        list.getClass();
        this.serializer = getpositionannotations;
        this.IconCompatParcelizer = list;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023 A[PHI: r2
  0x0023: PHI (r2v7 o.getPositionannotations) = (r2v2 o.getPositionannotations), (r2v8 o.getPositionannotations) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final int hashCode() {
        getPositionannotations getpositionannotations;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 93;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode = 0;
        if (i3 % 2 == 0) {
            getpositionannotations = this.serializer;
            int i4 = 94 / 0;
            if (getpositionannotations == null) {
                int i5 = i2 + 45;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                iHashCode = getpositionannotations.hashCode();
            }
        } else {
            getpositionannotations = this.serializer;
            if (getpositionannotations == null) {
                int i7 = i2 + 45;
                read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                iHashCode = getpositionannotations.hashCode();
            }
        }
        int iHashCode2 = this.IconCompatParcelizer.hashCode() + (iHashCode * 31);
        int i9 = RemoteActionCompatParcelizer + 17;
        read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "AnalyticsResult(analytics=" + this.serializer + ", trackingEvents=" + this.IconCompatParcelizer + ")";
        int i2 = read + 87;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            int i5 = i3 + 47;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof PreviewLogger) {
            PreviewLogger previewLogger = (PreviewLogger) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, previewLogger.serializer}, getCieXyz.write())).booleanValue()) {
                int i7 = read + 5;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, previewLogger.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i9 = read + 5;
            RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        int i11 = i3 + 37;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
