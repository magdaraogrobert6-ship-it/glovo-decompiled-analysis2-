package o;

import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class setOnAttributionReadListener extends setOnAdidReadListener {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = StartWorkingNavAction.StartOnDemand.serializer.hashCode();
        int i4 = IconCompatParcelizer + 37;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 123;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 37;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else if (!(obj instanceof setOnAttributionReadListener)) {
            int i6 = i2 + 41;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartWorking(navAction=" + StartWorkingNavAction.StartOnDemand.serializer + ")";
        int i2 = IconCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 0 / 0;
        }
        return str;
    }
}
