package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class NullableInputConnectionWrapperApi34 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final boolean RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public NullableInputConnectionWrapperApi34(String str, String str2, boolean z) {
        str.getClass();
        this.write = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = z;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("ActiveReport(imageId=", this.write, ", selectedReasonId=", this.serializer, ", blockUserChecked="), this.RemoteActionCompatParcelizer, ")");
        int i4 = IconCompatParcelizer + 61;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 2 / 0;
        }
        return strM;
    }

    public static NullableInputConnectionWrapperApi34 serializer(NullableInputConnectionWrapperApi34 nullableInputConnectionWrapperApi34, String str, boolean z, int i) {
        int i2 = 2 % 2;
        int i3 = read;
        int i4 = i3 + 11;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        String str2 = nullableInputConnectionWrapperApi34.write;
        if ((i & 2) != 0) {
            str = nullableInputConnectionWrapperApi34.serializer;
            int i6 = i3 + 45;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        if ((i & 4) != 0) {
            int i8 = i3 + 51;
            IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                boolean z2 = nullableInputConnectionWrapperApi34.RemoteActionCompatParcelizer;
                throw null;
            }
            z = nullableInputConnectionWrapperApi34.RemoteActionCompatParcelizer;
        }
        nullableInputConnectionWrapperApi34.getClass();
        str2.getClass();
        return new NullableInputConnectionWrapperApi34(str2, str, z);
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.write.hashCode();
        String str = this.serializer;
        if (str == null) {
            int i3 = IconCompatParcelizer + 107;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode2 = str.hashCode();
            int i5 = read + 13;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode2;
        }
        return Boolean.hashCode(this.RemoteActionCompatParcelizer) + (((iHashCode * 31) + i) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 17;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(!(obj instanceof NullableInputConnectionWrapperApi34))) {
            NullableInputConnectionWrapperApi34 nullableInputConnectionWrapperApi34 = (NullableInputConnectionWrapperApi34) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, nullableInputConnectionWrapperApi34.write}, getCieXyz.write())).booleanValue()) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, nullableInputConnectionWrapperApi34.serializer}, getCieXyz.write())).booleanValue())) {
                    if (this.RemoteActionCompatParcelizer == nullableInputConnectionWrapperApi34.RemoteActionCompatParcelizer) {
                        return true;
                    }
                    int i4 = IconCompatParcelizer + 65;
                    read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    return i4 % 2 != 0;
                }
            } else {
                int i5 = IconCompatParcelizer + 21;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
        }
        return false;
    }
}
