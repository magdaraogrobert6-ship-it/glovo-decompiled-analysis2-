package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda8eW4gCH7wj99pe_ivDYNvYKauDA {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        int i3 = 39 / 0;
        return this.write;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = serializer + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 45;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = serializer + 111;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 93;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public r8lambda8eW4gCH7wj99pe_ivDYNvYKauDA(String str, String str2, String str3) {
        this.write = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 79;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("HelpCenterDeepLinkParams(pageId=", this.write, ", deliveryId=", this.read, ", flowVersion="), this.RemoteActionCompatParcelizer, ")");
        int i4 = IconCompatParcelizer + 65;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x0033 A[PHI: r1 r3
  0x0033: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r3v5 java.lang.String) = (r3v0 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        int iHashCode;
        String str;
        int i;
        int iHashCode2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 5;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            iHashCode = this.write.hashCode();
            str = this.read;
            if (str == null) {
                i = serializer + 81;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    iHashCode2 = 1;
                } else {
                    iHashCode2 = 0;
                }
            } else {
                iHashCode2 = str.hashCode();
            }
        } else {
            iHashCode = this.write.hashCode();
            str = this.read;
            if (str == null) {
                i = serializer + 81;
                IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    iHashCode2 = 1;
                } else {
                    iHashCode2 = 0;
                }
            } else {
                iHashCode2 = str.hashCode();
            }
        }
        String str2 = this.RemoteActionCompatParcelizer;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 57;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambda8eW4gCH7wj99pe_ivDYNvYKauDA) {
            r8lambda8eW4gCH7wj99pe_ivDYNvYKauDA r8lambda8ew4gch7wj99pe_ivdynvykauda = (r8lambda8eW4gCH7wj99pe_ivDYNvYKauDA) obj;
            if (this.write.equals(r8lambda8ew4gch7wj99pe_ivdynvykauda.write)) {
                Object[] objArr = {this.read, r8lambda8ew4gch7wj99pe_ivdynvykauda.read};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    Object[] objArr2 = {this.RemoteActionCompatParcelizer, r8lambda8ew4gch7wj99pe_ivdynvykauda.RemoteActionCompatParcelizer};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                }
            }
        }
        int i4 = IconCompatParcelizer + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
