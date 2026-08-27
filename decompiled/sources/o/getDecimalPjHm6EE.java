package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getDecimalPjHm6EE {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final String RemoteActionCompatParcelizer;
    public final boolean serializer;
    public final List write;

    public getDecimalPjHm6EE(String str, ArrayList arrayList, boolean z) {
        this.RemoteActionCompatParcelizer = str;
        this.write = arrayList;
        this.serializer = z;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 73;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("CrowdSourcingFloatingConfig(currentAddress=", this.RemoteActionCompatParcelizer, ", images=", this.write, ", hasActions="), this.serializer, ")");
        int i4 = IconCompatParcelizer + 23;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 91;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            int i5 = i3 + 5;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        List list = this.write;
        return Boolean.hashCode(this.serializer) + (((iHashCode * 31) + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 115;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 35;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        if (!(obj instanceof getDecimalPjHm6EE)) {
            return false;
        }
        getDecimalPjHm6EE getdecimalpjhm6ee = (getDecimalPjHm6EE) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, getdecimalpjhm6ee.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i5 = read + 99;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, getdecimalpjhm6ee.write}, getCieXyz.write())).booleanValue()) {
            return this.serializer == getdecimalpjhm6ee.serializer;
        }
        int i7 = IconCompatParcelizer + 91;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
