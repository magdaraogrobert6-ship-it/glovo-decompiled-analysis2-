package o;

import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class isPresent extends getSignerInstance {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = StartWorkingNavAction.StartOnDemand.serializer.hashCode();
        int i4 = IconCompatParcelizer + 9;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj || (obj instanceof isPresent)) {
            return true;
        }
        int i2 = read + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 61;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "StartWorking(navAction=" + StartWorkingNavAction.StartOnDemand.serializer + ")";
        int i2 = read + 111;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
