package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setRecycledViewPool implements SwipeDismissTouchListener2 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ String write;

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        Class<SwipeDismissTouchListener2> cls;
        int i = 2 % 2;
        int i2 = read + 93;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            cls = SwipeDismissTouchListener2.class;
            int i4 = 63 / 0;
        } else {
            cls = SwipeDismissTouchListener2.class;
        }
        int i5 = i3 + 93;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return cls;
    }

    @Override // o.SwipeDismissTouchListener2
    public final /* synthetic */ String write() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 9;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.write;
        int i5 = i2 + 23;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setRecycledViewPool(String str) {
        this.write = str;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 109;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.write.hashCode() ^ 707790692;
            int i3 = 88 / 0;
        } else {
            iHashCode = this.write.hashCode() ^ 707790692;
        }
        int i4 = read + 107;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.write, ")");
            int i3 = serializer + 13;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return strM;
            }
            obj.hashCode();
            throw null;
        }
        ff$$ExternalSyntheticOutline0.m("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.write, ")");
        throw null;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 93;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!(obj instanceof SwipeDismissTouchListener2) || !this.write.equals(((SwipeDismissTouchListener2) obj).write())) {
            return false;
        }
        int i4 = serializer + 97;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
