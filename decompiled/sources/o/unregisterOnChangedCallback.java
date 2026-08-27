package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class unregisterOnChangedCallback {
    private static int serializer = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public final String write() {
        int i = 2 % 2;
        int i2 = write + 73;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 97;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public unregisterOnChangedCallback(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("CustomerChatPushMessageData(orderCode=", this.read, ", pushAlert=", this.RemoteActionCompatParcelizer, ", message="), this.IconCompatParcelizer, ")");
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("CustomerChatPushMessageData(orderCode=", this.read, ", pushAlert=", this.RemoteActionCompatParcelizer, ", message="), this.IconCompatParcelizer, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 13;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode2 = this.IconCompatParcelizer.hashCode() + (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31);
        int i4 = serializer + 65;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof unregisterOnChangedCallback) {
            unregisterOnChangedCallback unregisteronchangedcallback = (unregisterOnChangedCallback) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, unregisteronchangedcallback.read}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, unregisteronchangedcallback.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, unregisteronchangedcallback.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = serializer + 115;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 65 / 0;
            }
            return false;
        }
        int i4 = serializer + 85;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 != 0;
    }
}
