package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21 implements NavHostKtNavHost291ExternalSyntheticLambda0 {
    private static int serializer = 0;
    private static int write = 1;
    public final ArrayList IconCompatParcelizer;
    public final boolean read;

    public invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21(ArrayList arrayList, boolean z) {
        this.IconCompatParcelizer = arrayList;
        this.read = z;
    }

    public final int hashCode() {
        int iHashCode;
        int i;
        int i2 = 2 % 2;
        int i3 = serializer + 95;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int iHashCode2 = this.IconCompatParcelizer.hashCode();
            iHashCode = Boolean.hashCode(this.read);
            i = iHashCode2 >>> 69;
        } else {
            int iHashCode3 = this.IconCompatParcelizer.hashCode();
            iHashCode = Boolean.hashCode(this.read);
            i = iHashCode3 * 31;
        }
        return iHashCode + i;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 43;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21)) {
            return false;
        }
        invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21 invokesuspendcomroadrunnermapintegrationmapboxnavigationmapnavigationimplprocessflows21 = (invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21) obj;
        if (this.IconCompatParcelizer.equals(invokesuspendcomroadrunnermapintegrationmapboxnavigationmapnavigationimplprocessflows21.IconCompatParcelizer)) {
            return this.read == invokesuspendcomroadrunnermapintegrationmapboxnavigationmapnavigationimplprocessflows21.read;
        }
        int i4 = serializer + 13;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "NestNavBar(items=" + this.IconCompatParcelizer + ", isLoading=" + this.read + ")";
        int i2 = serializer + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
