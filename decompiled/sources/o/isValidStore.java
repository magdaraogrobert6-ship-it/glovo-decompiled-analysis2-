package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class isValidStore extends sign {
    private static int RatingCompat = 1;
    private static int write;
    public final boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public isValidStore(String str, String str2, String str3, boolean z) {
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
        this.serializer = str3;
        this.IconCompatParcelizer = z;
    }

    public /* synthetic */ isValidStore(String str, String str2, String str3) {
        this(str, str2, str3, true);
    }

    public static isValidStore write(isValidStore isvalidstore, boolean z) {
        int i = 2 % 2;
        String str = isvalidstore.read;
        String str2 = isvalidstore.RemoteActionCompatParcelizer;
        String str3 = isvalidstore.serializer;
        str.getClass();
        str2.getClass();
        str3.getClass();
        isValidStore isvalidstore2 = new isValidStore(str, str2, str3, z);
        int i2 = write + 71;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
        return isvalidstore2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 9;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer) + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.RemoteActionCompatParcelizer), 31, this.serializer);
        int i4 = RatingCompat + 61;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 63;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Working(title=", this.read, ", description=", this.RemoteActionCompatParcelizer, ", area=");
        sbM.append(this.serializer);
        sbM.append(", isStopWorkingButtonEnabled=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 89;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this != obj) {
            if (!(obj instanceof isValidStore)) {
                return false;
            }
            isValidStore isvalidstore = (isValidStore) obj;
            Object[] objArr = {this.read, isvalidstore.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.RemoteActionCompatParcelizer, isvalidstore.RemoteActionCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                Object[] objArr3 = {this.serializer, isvalidstore.serializer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != isvalidstore.IconCompatParcelizer) {
                    return false;
                }
            } else {
                int i4 = RatingCompat + 39;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return false;
                }
                int i5 = 2 / 5;
                return false;
            }
        }
        int i6 = write + 41;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
