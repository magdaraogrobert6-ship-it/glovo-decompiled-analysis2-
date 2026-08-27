package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdamcioKCS7zG0FxR0ccpXoY9T79ZQ implements r8lambdaltZ1uNITaEov9GRvWdNWxxSy0k {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String write;

    public r8lambdamcioKCS7zG0FxR0ccpXoY9T79ZQ(String str) {
        str.getClass();
        this.write = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode();
        int i4 = IconCompatParcelizer + 11;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 95;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m("OpenDeepLink(url=", this.write, ")");
        }
        ff$$ExternalSyntheticOutline0.m("OpenDeepLink(url=", this.write, ")");
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 25;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 11;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof r8lambdamcioKCS7zG0FxR0ccpXoY9T79ZQ) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ((r8lambdamcioKCS7zG0FxR0ccpXoY9T79ZQ) obj).write}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i7 = read + 105;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return false;
    }
}
