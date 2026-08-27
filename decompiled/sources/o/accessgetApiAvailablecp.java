package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetApiAvailablecp extends r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU {
    private static int read = 1;
    private static int serializer;
    public final int IconCompatParcelizer;

    @Override // o.r8lambdahKqWkK2sqJkz9lmLXp4YuqHwTU
    public final int read() {
        int i = 2 % 2;
        int i2 = serializer + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.IconCompatParcelizer;
        int i5 = i3 + 13;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
        return i4;
    }

    public accessgetApiAvailablecp(int i) {
        super(i);
        this.IconCompatParcelizer = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 113;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return Integer.hashCode(this.IconCompatParcelizer);
        }
        Integer.hashCode(this.IconCompatParcelizer);
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "Unknown(id=", ")");
        int i4 = read + 1;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 107;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(obj instanceof accessgetApiAvailablecp))) {
            return this.IconCompatParcelizer == ((accessgetApiAvailablecp) obj).IconCompatParcelizer;
        }
        int i4 = read;
        int i5 = i4 + 23;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 109;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
