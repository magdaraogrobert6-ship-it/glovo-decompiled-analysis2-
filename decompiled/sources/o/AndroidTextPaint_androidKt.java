package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidTextPaint_androidKt extends setShaderStateui_text {
    private static int read = 0;
    private static int serializer = 1;
    public final AndroidTypefaceCache IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final setDrawStyle write;

    public AndroidTextPaint_androidKt(setDrawStyle setdrawstyle, boolean z, AndroidTypefaceCache androidTypefaceCache) {
        this.write = setdrawstyle;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = androidTypefaceCache;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 o.setDrawStyle) = (r1v4 o.setDrawStyle), (r1v7 o.setDrawStyle) binds: [B:8:0x0019, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    public static AndroidTextPaint_androidKt read(AndroidTextPaint_androidKt androidTextPaint_androidKt, boolean z, AndroidTypefaceCache androidTypefaceCache, int i) {
        setDrawStyle setdrawstyle;
        int i2;
        int i3 = 2 % 2;
        int i4 = serializer + 83;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i5;
        if (i4 % 2 != 0) {
            setdrawstyle = androidTextPaint_androidKt.write;
            if ((i & 5) != 0) {
                i2 = i5 + 35;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    z = androidTextPaint_androidKt.RemoteActionCompatParcelizer;
                    int i6 = 16 / 0;
                } else {
                    z = androidTextPaint_androidKt.RemoteActionCompatParcelizer;
                }
            }
        } else {
            setdrawstyle = androidTextPaint_androidKt.write;
            if ((i & 2) != 0) {
                i2 = i5 + 35;
                serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    z = androidTextPaint_androidKt.RemoteActionCompatParcelizer;
                    int i7 = 16 / 0;
                } else {
                    z = androidTextPaint_androidKt.RemoteActionCompatParcelizer;
                }
            }
        }
        if ((i & 4) != 0) {
            int i8 = serializer + 113;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                AndroidTypefaceCache androidTypefaceCache2 = androidTextPaint_androidKt.IconCompatParcelizer;
                throw null;
            }
            androidTypefaceCache = androidTextPaint_androidKt.IconCompatParcelizer;
        }
        androidTextPaint_androidKt.getClass();
        return new AndroidTextPaint_androidKt(setdrawstyle, z, androidTypefaceCache);
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.RemoteActionCompatParcelizer);
        AndroidTypefaceCache androidTypefaceCache = this.IconCompatParcelizer;
        if (androidTypefaceCache == null) {
            int i4 = serializer + 57;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = androidTypefaceCache.hashCode();
        }
        return iM + iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 47;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj instanceof AndroidTextPaint_androidKt) {
            AndroidTextPaint_androidKt androidTextPaint_androidKt = (AndroidTextPaint_androidKt) obj;
            if (this.write.equals(androidTextPaint_androidKt.write)) {
                if (this.RemoteActionCompatParcelizer != androidTextPaint_androidKt.RemoteActionCompatParcelizer) {
                    int i4 = read + 25;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                } else {
                    Object[] objArr = {this.IconCompatParcelizer, androidTextPaint_androidKt.IconCompatParcelizer};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigationSuccessState(navigationButtonState=" + this.write + ", loading=" + this.RemoteActionCompatParcelizer + ", settingsDialog=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 35;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
