package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class deleteGlobalCallbackParameters {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    public final createDeeplinkIntentI RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final int write;

    public final int IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.write;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String read() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 19;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.serializer;
        int i5 = i2 + 79;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 11;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.read;
        int i4 = i3 + 43;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public deleteGlobalCallbackParameters(int i, String str, String str2, createDeeplinkIntentI createdeeplinkintenti) {
        createdeeplinkintenti.getClass();
        this.write = i;
        this.read = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = createdeeplinkintenti;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Notification(id=", this.write, ", title=", this.read, ", message=");
        sbM.append(this.serializer);
        sbM.append(", action=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RatingCompat + 119;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode2 = Integer.hashCode(this.write);
        String str = this.read;
        if (str == null) {
            int i4 = IconCompatParcelizer + 79;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.serializer;
        return this.RemoteActionCompatParcelizer.hashCode() + (((((iHashCode2 * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deleteGlobalCallbackParameters)) {
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 119;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 59;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return false;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        deleteGlobalCallbackParameters deleteglobalcallbackparameters = (deleteGlobalCallbackParameters) obj;
        if (this.write != deleteglobalcallbackparameters.write) {
            int i6 = RatingCompat + 119;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr = {this.read, deleteglobalcallbackparameters.read};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.serializer, deleteglobalcallbackparameters.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == deleteglobalcallbackparameters.RemoteActionCompatParcelizer) {
            return true;
        }
        int i8 = IconCompatParcelizer + 37;
        RatingCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }
}
