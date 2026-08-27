package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class transformlambda0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String serializer;
    public final String write;

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 55;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.IconCompatParcelizer;
        int i4 = i2 + 5;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = read + 1;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer;
        }
        throw null;
    }

    public transformlambda0(String str, String str2, String str3, String str4) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.write = str4;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = read + 89;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("CustomerChatPushData(orderId=", this.serializer, ", message=", this.IconCompatParcelizer, ", channelType="), this.RemoteActionCompatParcelizer, ", channelId=null, chatId=", this.write, ", senderName=null, country=null, pushId=null, pushAlert=null)");
        int i4 = MediaBrowserCompatMediaItem + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.IconCompatParcelizer), 961, this.RemoteActionCompatParcelizer);
        String str = this.write;
        if (str == null) {
            int i3 = MediaBrowserCompatMediaItem + 81;
            int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 99;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i8 = MediaBrowserCompatMediaItem + 13;
            read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i = iHashCode;
        }
        return (iM + i) * 923521;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read + 115;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 119;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            if (!(obj instanceof transformlambda0)) {
                return false;
            }
            transformlambda0 transformlambda0Var = (transformlambda0) obj;
            Object[] objArr = {this.serializer, transformlambda0Var.serializer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.IconCompatParcelizer, transformlambda0Var.IconCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr3 = {this.RemoteActionCompatParcelizer, transformlambda0Var.RemoteActionCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr4 = {this.write, transformlambda0Var.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
