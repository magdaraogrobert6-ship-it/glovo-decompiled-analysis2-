package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class PreferencesKtedit2 {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 29;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.read;
        int i5 = i2 + 95;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String write() {
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 == 0) {
            str = this.write;
            int i4 = 67 / 0;
        } else {
            str = this.write;
        }
        int i5 = i3 + 33;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("HelpCenterParams(initialMessage=null, orderId=null, reasonCode=null, pageId=", this.read, ", deliveryId=", this.serializer, ", flowVersion="), this.write, ")");
            int i3 = IconCompatParcelizer + 85;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 45 / 0;
            }
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("HelpCenterParams(initialMessage=null, orderId=null, reasonCode=null, pageId=", this.read, ", deliveryId=", this.serializer, ", flowVersion="), this.write, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PreferencesKtedit2(String str, String str2, String str3, int i) {
        if ((i & 8) != 0) {
            int i2 = IconCompatParcelizer + 83;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 16) != 0) {
            int i5 = IconCompatParcelizer;
            int i6 = i5 + 31;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = i5 + 45;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            str2 = null;
        }
        str3 = (i & 32) != 0 ? null : str3;
        this.read = str;
        this.serializer = str2;
        this.write = str3;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.read;
        if (str == null) {
            int i2 = IconCompatParcelizer + 109;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.serializer;
        if (str2 == null) {
            int i4 = IconCompatParcelizer + 3;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.write;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 19;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreferencesKtedit2)) {
            return false;
        }
        PreferencesKtedit2 preferencesKtedit2 = (PreferencesKtedit2) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, preferencesKtedit2.read}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, preferencesKtedit2.serializer}, getCieXyz.write())).booleanValue()) {
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, preferencesKtedit2.write}, getCieXyz.write())).booleanValue();
            }
            int i4 = IconCompatParcelizer + 23;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 39;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return false;
        }
        int i7 = 3 % 3;
        return false;
    }
}
