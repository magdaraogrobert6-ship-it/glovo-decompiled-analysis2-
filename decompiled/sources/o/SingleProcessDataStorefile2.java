package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleProcessDataStorefile2 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final int serializer;

    public SingleProcessDataStorefile2(int i) {
        this.serializer = i;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return Integer.hashCode(this.serializer);
        }
        int i3 = 78 / 0;
        return Integer.hashCode(this.serializer);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return d$$ExternalSyntheticOutline0.m(this.serializer, "HelpCenterItemUiState(messageCount=", ")");
        }
        int i3 = 4 / 0;
        return d$$ExternalSyntheticOutline0.m(this.serializer, "HelpCenterItemUiState(messageCount=", ")");
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IconCompatParcelizer + 39;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof SingleProcessDataStorefile2) {
            return this.serializer == ((SingleProcessDataStorefile2) obj).serializer;
        }
        int i4 = IconCompatParcelizer + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
