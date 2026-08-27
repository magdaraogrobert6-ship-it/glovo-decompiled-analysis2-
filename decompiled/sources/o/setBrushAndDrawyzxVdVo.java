package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setBrushAndDrawyzxVdVo implements toSpan {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final String IconCompatParcelizer;
    public final getApplicationInfo RemoteActionCompatParcelizer;
    public final Map read;
    public final CoroutineLiveDataExternalSyntheticLambda0 serializer;
    public final String write;

    public setBrushAndDrawyzxVdVo(String str, String str2, CoroutineLiveDataExternalSyntheticLambda0 coroutineLiveDataExternalSyntheticLambda0, getApplicationInfo getapplicationinfo, Map map) {
        str.getClass();
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.serializer = coroutineLiveDataExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = getapplicationinfo;
        this.read = map;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 27;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("ActionsData(contactName=", this.IconCompatParcelizer, ", additionalInfo=", this.write, ", chat=");
        sbM.append(this.serializer);
        sbM.append(", phone=REDACTED, trackingParameters=");
        sbM.append(this.read);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaSessionCompatQueueItem + 63;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028 A[PHI: r1 r3 r4
  0x0028: PHI (r1v15 int) = (r1v5 int), (r1v17 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r4v5 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[PHI: r1 r4
  0x0026: PHI (r1v6 int) = (r1v5 int), (r1v17 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0024, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        String str;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 79;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int iHashCode4 = 0;
        if (i2 % 2 != 0) {
            iHashCode = this.IconCompatParcelizer.hashCode();
            str = this.write;
            iHashCode2 = 1;
            if (str == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = str.hashCode();
            }
        } else {
            iHashCode = this.IconCompatParcelizer.hashCode();
            str = this.write;
            iHashCode2 = 0;
            if (str == null) {
                iHashCode3 = 0;
            } else {
                iHashCode3 = str.hashCode();
            }
        }
        CoroutineLiveDataExternalSyntheticLambda0 coroutineLiveDataExternalSyntheticLambda0 = this.serializer;
        if (coroutineLiveDataExternalSyntheticLambda0 != null) {
            iHashCode4 = coroutineLiveDataExternalSyntheticLambda0.hashCode();
            int i3 = MediaSessionCompatQueueItem + 61;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        getApplicationInfo getapplicationinfo = this.RemoteActionCompatParcelizer;
        if (getapplicationinfo != null) {
            iHashCode2 = getapplicationinfo.hashCode();
        }
        return this.read.hashCode() + (((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setBrushAndDrawyzxVdVo) {
            setBrushAndDrawyzxVdVo setbrushanddrawyzxvdvo = (setBrushAndDrawyzxVdVo) obj;
            Object[] objArr = {this.IconCompatParcelizer, setbrushanddrawyzxvdvo.IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.write, setbrushanddrawyzxvdvo.write};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    Object[] objArr3 = {this.serializer, setbrushanddrawyzxvdvo.serializer};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        Object[] objArr4 = {this.RemoteActionCompatParcelizer, setbrushanddrawyzxvdvo.RemoteActionCompatParcelizer};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue() && this.read.equals(setbrushanddrawyzxvdvo.read)) {
                            return true;
                        }
                    }
                }
            } else {
                int i2 = MediaSessionCompatQueueItem + 57;
                MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
        }
        int i4 = MediaSessionCompatQueueItem + 125;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
