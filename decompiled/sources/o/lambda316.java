package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lambda316 {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final List serializer;
    public final String write;

    public lambda316(String str, String str2, List list, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.read = str2;
        this.serializer = list;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = z2;
    }

    public static lambda316 RemoteActionCompatParcelizer(lambda316 lambda316Var, boolean z, boolean z2, int i) {
        int i2 = 2 % 2;
        String str = lambda316Var.write;
        String str2 = lambda316Var.read;
        List list = lambda316Var.serializer;
        if ((i & 8) != 0) {
            z = lambda316Var.IconCompatParcelizer;
            int i3 = MediaMetadataCompat + 1;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            int i5 = MediaMetadataCompat + 33;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z2 = lambda316Var.RemoteActionCompatParcelizer;
        }
        lambda316Var.getClass();
        str.getClass();
        str2.getClass();
        return new lambda316(str, str2, list, z3, z2);
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 41;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.read);
        List list = this.serializer;
        if (list == null) {
            i = 0;
        } else {
            int iHashCode = list.hashCode();
            int i5 = MediaMetadataCompat + 19;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = iHashCode;
        }
        return Boolean.hashCode(this.RemoteActionCompatParcelizer) + d$$ExternalSyntheticOutline0.m((iM + i) * 31, 31, this.IconCompatParcelizer);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 97;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("EquipmentOptionViewEntity(text=", this.write, ", value=", this.read, ", dependantEquipment=");
        sbM.append(this.serializer);
        sbM.append(", isSelected=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(", isVisible=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.RemoteActionCompatParcelizer, ")");
        int i4 = MediaMetadataCompat + 11;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return strM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof lambda316)) {
                return false;
            }
            lambda316 lambda316Var = (lambda316) obj;
            Object[] objArr = {this.write, lambda316Var.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.read, lambda316Var.read};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                Object[] objArr3 = {this.serializer, lambda316Var.serializer};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue() || this.IconCompatParcelizer != lambda316Var.IconCompatParcelizer) {
                    return false;
                }
                if (this.RemoteActionCompatParcelizer == lambda316Var.RemoteActionCompatParcelizer) {
                    return true;
                }
                int i2 = RatingCompat + 35;
                MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = MediaMetadataCompat + 109;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = MediaMetadataCompat + 37;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
