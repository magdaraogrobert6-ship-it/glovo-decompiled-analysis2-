package o;

import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class lambda_558638247lambda0 {
    private static int read = 0;
    private static int write = 1;
    public final Instant RemoteActionCompatParcelizer;
    public final WrapPreview serializer;

    public final Instant serializer() {
        Instant instant;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 25;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            instant = this.RemoteActionCompatParcelizer;
            int i4 = 94 / 0;
        } else {
            instant = this.RemoteActionCompatParcelizer;
        }
        int i5 = i2 + 7;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return instant;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final WrapPreview write() {
        int i = 2 % 2;
        int i2 = write + 125;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        WrapPreview wrapPreview = this.serializer;
        int i5 = i3 + 25;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return wrapPreview;
    }

    public lambda_558638247lambda0(WrapPreview wrapPreview, Instant instant) {
        wrapPreview.getClass();
        instant.getClass();
        this.serializer = wrapPreview;
        this.RemoteActionCompatParcelizer = instant;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.serializer.hashCode() * 31);
        int i4 = write + 11;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderStatusCountdownUiItem(orderStatusItemUiV1=" + this.serializer + ", nextUpdateTime=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = write + 7;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 101;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof lambda_558638247lambda0) {
            lambda_558638247lambda0 lambda_558638247lambda0Var = (lambda_558638247lambda0) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, lambda_558638247lambda0Var.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, lambda_558638247lambda0Var.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i5 = read + 53;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = write + 31;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i8 = i3 + 113;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
