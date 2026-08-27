package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class throwInvalidConstraintException implements offsetNN6EwU {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final String IconCompatParcelizer;
    public final long serializer;
    public final String write;

    public throwInvalidConstraintException(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.serializer = j;
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.write.hashCode() % af$$ExternalSyntheticOutline0.m(Long.hashCode(this.serializer) / 47, 48, this.IconCompatParcelizer);
        } else {
            iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(Long.hashCode(this.serializer) * 31, 31, this.IconCompatParcelizer);
        }
        int i3 = read + 21;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("OpenCodeScanScreen(deliveryId=", ", deliveryState=", this.serializer, this.IconCompatParcelizer), ", taskId=", this.write, ")");
            int i3 = read + 47;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("OpenCodeScanScreen(deliveryId=", ", deliveryState=", this.serializer, this.IconCompatParcelizer), ", taskId=", this.write, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 67;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof throwInvalidConstraintException)) {
            int i3 = RemoteActionCompatParcelizer + 83;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        throwInvalidConstraintException throwinvalidconstraintexception = (throwInvalidConstraintException) obj;
        if (this.serializer != throwinvalidconstraintexception.serializer) {
            int i5 = read + 103;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, throwinvalidconstraintexception.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, throwinvalidconstraintexception.write}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i7 = read + 29;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
