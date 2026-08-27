package o;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class expandFieldArray {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final Map serializer;

    public expandFieldArray(Map map) {
        this.serializer = map;
    }

    public final int hashCode() {
        int i = 2 % 2;
        Map map = this.serializer;
        if (map != null) {
            return map.hashCode();
        }
        int i2 = write + 9;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 91;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NestState(nestComponents=" + this.serializer + ")";
        int i2 = IconCompatParcelizer + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof expandFieldArray)) {
            int i2 = write + 55;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, ((expandFieldArray) obj).serializer}, getCieXyz.write())).booleanValue())) {
            return true;
        }
        int i3 = write + 123;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
