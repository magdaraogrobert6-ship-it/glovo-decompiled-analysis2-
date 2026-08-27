package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class PreferenceBaseSavedState implements PreferenceFragment {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final ArrayList serializer;

    public PreferenceBaseSavedState(ArrayList arrayList) {
        this.serializer = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer.hashCode();
        }
        this.serializer.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RiderStatistics(items=" + this.serializer + ")";
        int i2 = IconCompatParcelizer + 113;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 115;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if ((obj instanceof PreferenceBaseSavedState) && this.serializer.equals(((PreferenceBaseSavedState) obj).serializer)) {
            return true;
        }
        int i4 = write + 21;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
