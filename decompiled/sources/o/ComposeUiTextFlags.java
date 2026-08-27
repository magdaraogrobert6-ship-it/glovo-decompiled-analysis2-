package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeUiTextFlags {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final DeprecatedBridgeFontResourceLoaderCompanion RemoteActionCompatParcelizer;
    public final ArrayList write;

    public final DeprecatedBridgeFontResourceLoaderCompanion read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 35;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        DeprecatedBridgeFontResourceLoaderCompanion deprecatedBridgeFontResourceLoaderCompanion = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 39;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return deprecatedBridgeFontResourceLoaderCompanion;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = read + 27;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        ArrayList arrayList = this.write;
        int i4 = i3 + 61;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return arrayList;
        }
        obj.hashCode();
        throw null;
    }

    public ComposeUiTextFlags(DeprecatedBridgeFontResourceLoaderCompanion deprecatedBridgeFontResourceLoaderCompanion, ArrayList arrayList) {
        this.RemoteActionCompatParcelizer = deprecatedBridgeFontResourceLoaderCompanion;
        this.write = arrayList;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.write.hashCode() * (this.RemoteActionCompatParcelizer.hashCode() / 105);
        } else {
            iHashCode = this.write.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        }
        int i3 = read + 89;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "FetchedManifest(config=" + this.RemoteActionCompatParcelizer + ", releases=" + this.write + ")";
        int i2 = read + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ComposeUiTextFlags) {
            ComposeUiTextFlags composeUiTextFlags = (ComposeUiTextFlags) obj;
            if (this.RemoteActionCompatParcelizer.equals(composeUiTextFlags.RemoteActionCompatParcelizer) && this.write.equals(composeUiTextFlags.write)) {
                return true;
            }
        }
        int i4 = IconCompatParcelizer + 45;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return false;
    }
}
