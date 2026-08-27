package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class UtilNetworking1 {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final String IconCompatParcelizer;
    public final PopulateViewStructure_androidKtpopulate7 read;
    public final androidx.compose.ui.Modifier serializer;
    public final boolean write;

    public UtilNetworking1(String str, androidx.compose.ui.Modifier modifier, boolean z) {
        str.getClass();
        modifier.getClass();
        this.IconCompatParcelizer = str;
        this.write = true;
        this.serializer = modifier;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.read = populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer;
        ((onShowTranslationui) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer).setValue(Boolean.valueOf(z));
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iHashCode = this.serializer.hashCode() / d$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() >> 63, 66, this.write);
        } else {
            iHashCode = this.serializer.hashCode() + d$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.write);
        }
        int i3 = RatingCompat + 105;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("ToggleItem(text=", this.IconCompatParcelizer, ", enabled=", ", modifier=", this.write);
        sbM.append(this.serializer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 43;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof UtilNetworking1) {
            UtilNetworking1 utilNetworking1 = (UtilNetworking1) obj;
            Object[] objArr = {this.IconCompatParcelizer, utilNetworking1.IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.write == utilNetworking1.write) {
                Object[] objArr2 = {this.serializer, utilNetworking1.serializer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        int i4 = RatingCompat + 79;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
