package o;

import com.mapbox.navigation.base.route.NavigationRoute;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class lc {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public final LinkedHashSet IconCompatParcelizer;
    public final NavigationRoute RemoteActionCompatParcelizer;
    public final Set read;
    public final Set serializer;

    public lc(NavigationRoute navigationRoute, Set set, Set set2, LinkedHashSet linkedHashSet) {
        this.RemoteActionCompatParcelizer = navigationRoute;
        this.read = set;
        this.serializer = set2;
        this.IconCompatParcelizer = linkedHashSet;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 15;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode() + ((this.serializer.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31);
        int i4 = write + 87;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "RouteExcludeAnalysis(route=" + this.RemoteActionCompatParcelizer + ", classes=" + this.read + ", requested=" + this.serializer + ", violating=" + this.IconCompatParcelizer + ")";
        int i2 = MediaMetadataCompat + 39;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 81;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 97;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj;
        if (!this.RemoteActionCompatParcelizer.equals(lcVar.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (this.read.equals(lcVar.read)) {
            return this.serializer.equals(lcVar.serializer) && this.IconCompatParcelizer.equals(lcVar.IconCompatParcelizer);
        }
        int i6 = write + 83;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
