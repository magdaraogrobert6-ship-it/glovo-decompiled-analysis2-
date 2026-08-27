package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l5 extends lExternalSyntheticLambda2 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final String IconCompatParcelizer;
    public final ArrayList write;

    public final List write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 5;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ArrayList arrayList = this.write;
        int i5 = i2 + 119;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return arrayList;
    }

    public l5(ArrayList arrayList, String str) {
        this.write = arrayList;
        this.IconCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.IconCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
        int i4 = serializer + 103;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RoutesReady(routes=" + this.write + ", routerOrigin=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 43;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2 = 2 % 2;
        if (this != obj) {
            if (obj instanceof l5) {
                l5 l5Var = (l5) obj;
                if (this.write.equals(l5Var.write)) {
                    if (!this.IconCompatParcelizer.equals(l5Var.IconCompatParcelizer)) {
                        return false;
                    }
                } else {
                    int i3 = RemoteActionCompatParcelizer + 49;
                    serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        return false;
                    }
                    i = 5;
                }
            } else {
                i = serializer + 93;
                RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            int i4 = i % 2;
            return false;
        }
        return true;
    }
}
