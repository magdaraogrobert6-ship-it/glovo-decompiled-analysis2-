package o;

import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class unaryMinus9UxMQ8M extends VelocityKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final Instant read;
    public final ArrayList serializer;

    public unaryMinus9UxMQ8M(ArrayList arrayList, Instant instant) {
        this.serializer = arrayList;
        this.read = instant;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = this.serializer.hashCode();
        Instant instant = this.read;
        if (instant == null) {
            iHashCode = 0;
        } else {
            iHashCode = instant.hashCode();
            int i4 = IconCompatParcelizer + 87;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = (iHashCode2 * 31) + iHashCode;
        int i7 = IconCompatParcelizer + 9;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            int i8 = 2 / 0;
        }
        return i6;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StackedDeliveryListV1(deliveryListV1=" + this.serializer + ", nextRefreshTime=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unaryMinus9UxMQ8M)) {
            return false;
        }
        unaryMinus9UxMQ8M unaryminus9uxmq8m = (unaryMinus9UxMQ8M) obj;
        if (this.serializer.equals(unaryminus9uxmq8m.serializer)) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, unaryminus9uxmq8m.read}, getCieXyz.write())).booleanValue();
        }
        int i3 = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return false;
    }
}
