package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class getAnimationClocksui_toolingannotations extends getTrackedUnsupportedAnimationsannotations {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final String RemoteActionCompatParcelizer;

    public getAnimationClocksui_toolingannotations(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = IconCompatParcelizer + 65;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m("Completed(text=", this.RemoteActionCompatParcelizer, ")");
        int i4 = serializer + 117;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return strM;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 45;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
            if (this != obj) {
                if ((obj instanceof getAnimationClocksui_toolingannotations) || !this.RemoteActionCompatParcelizer.equals(((getAnimationClocksui_toolingannotations) obj).RemoteActionCompatParcelizer)) {
                    return false;
                }
            }
        } else if (this != obj) {
            if (obj instanceof getAnimationClocksui_toolingannotations) {
            }
            return false;
        }
        int i4 = IconCompatParcelizer + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return true;
    }
}
