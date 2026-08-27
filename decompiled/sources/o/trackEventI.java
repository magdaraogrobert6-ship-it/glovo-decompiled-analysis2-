package o;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class trackEventI extends teardownAttributionS {
    private static int IconCompatParcelizer = 0;
    public static int RemoteActionCompatParcelizer = 0;
    public static int read = 0;
    private static int write = 1;
    public final teardownActivityStateS serializer;

    public trackEventI(teardownActivityStateS teardownactivitystates) {
        teardownactivitystates.getClass();
        this.serializer = teardownactivitystates;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 89;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode();
        }
        int i3 = 22 / 0;
        return this.serializer.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NavigateToEarnings(earningsViewEntity=" + this.serializer + ")";
        int i2 = IconCompatParcelizer + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof trackEventI) {
                Object[] objArr = {this.serializer, ((trackEventI) obj).serializer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = IconCompatParcelizer + 37;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = write + 59;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 22 / 0;
            }
            return false;
        }
        int i6 = IconCompatParcelizer + 65;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static int IconCompatParcelizer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 8171281;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iNextInt = new Random().nextInt();
        read = iNextInt;
        return iNextInt;
    }
}
