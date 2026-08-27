package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class tf extends tc {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final String IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    @Override // o.tc
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 103;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.IconCompatParcelizer;
        int i4 = i2 + 57;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return str;
    }

    @Override // o.tc
    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 99;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        boolean z = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 5;
        MediaSessionCompatQueueItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    @Override // o.tc
    public final String read() {
        int i = 2 % 2;
        int i2 = RatingCompat + 43;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public tf(String str, String str2, String str3, String str4, boolean z) {
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = z;
        this.read = str3;
        this.write = str4;
    }

    public static tf serializer(tf tfVar, boolean z) {
        int i = 2 % 2;
        String str = tfVar.serializer;
        String str2 = tfVar.IconCompatParcelizer;
        String str3 = tfVar.read;
        String str4 = tfVar.write;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        tf tfVar2 = new tf(str, str2, str3, str4, z);
        int i2 = MediaSessionCompatQueueItem + 125;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
        return tfVar2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 79;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Empty(headerTitle=", this.serializer, ", headerSubtitle=", this.IconCompatParcelizer, ", showLoading=");
        IconCompatParcelizer.RemoteActionCompatParcelizer(", title=", this.read, ", description=", sbM, this.RemoteActionCompatParcelizer);
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.write, ")");
        int i4 = MediaSessionCompatQueueItem + 25;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022 A[PHI: r1
  0x0022: PHI (r1v10 java.lang.String) = (r1v4 java.lang.String), (r1v14 java.lang.String) binds: [B:8:0x0018, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final int hashCode() {
        String str;
        int i = 2 % 2;
        int i2 = RatingCompat + 15;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        int iHashCode = 0;
        if (i2 % 2 == 0) {
            str = this.serializer;
            int i4 = 7 / 0;
            if (str == null) {
                int i5 = i3 + 33;
                RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                iHashCode = str.hashCode();
                int i7 = MediaSessionCompatQueueItem + 63;
                RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
        } else {
            str = this.serializer;
            if (str == null) {
                int i9 = i3 + 33;
                RatingCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                iHashCode = str.hashCode();
                int i11 = MediaSessionCompatQueueItem + 63;
                RatingCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
            }
        }
        return this.write.hashCode() + af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(iHashCode * 31, 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer), 31, this.read);
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3 = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof tf) {
            tf tfVar = (tf) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, tfVar.serializer}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, tfVar.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    if (this.RemoteActionCompatParcelizer != tfVar.RemoteActionCompatParcelizer) {
                        return false;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, tfVar.read}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, tfVar.write}, getCieXyz.write())).booleanValue();
                }
                i = MediaSessionCompatQueueItem + 33;
                i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else {
                i = RatingCompat + 19;
                MediaSessionCompatQueueItem = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i4 = i % 2;
            return false;
        }
        i = MediaSessionCompatQueueItem + 93;
        i2 = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RatingCompat = i2;
        int i5 = i % 2;
        return false;
    }
}
