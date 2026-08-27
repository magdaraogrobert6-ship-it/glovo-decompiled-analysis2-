package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdas7hGQZUVhdtJa9loZ8w1Xl2jDOA implements r8lambdaemiioW_nKh79YyPl9R1HU3hWdFc {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final ArrayList read;

    public r8lambdas7hGQZUVhdtJa9loZ8w1Xl2jDOA(ArrayList arrayList) {
        this.read = arrayList;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        int i4 = write + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FrequentlyUsedItemsUiState(items=" + this.read + ")";
        int i2 = RemoteActionCompatParcelizer + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 75;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambdas7hGQZUVhdtJa9loZ8w1Xl2jDOA) {
            return this.read.equals(((r8lambdas7hGQZUVhdtJa9loZ8w1Xl2jDOA) obj).read);
        }
        int i4 = i3 + 45;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
