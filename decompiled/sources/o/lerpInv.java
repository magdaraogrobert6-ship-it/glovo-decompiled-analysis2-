package o;

/* JADX INFO: loaded from: classes3.dex */
public final class lerpInv {
    private static int read = 1;
    private static int serializer;
    public final accesslookupAndInterpolate IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk write;

    public lerpInv(String str, r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq) {
        addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20 = addInAppMessageViewToViewGrouplambda20.IconCompatParcelizer;
        addinappmessageviewtoviewgrouplambda20.getClass();
        accesslookupAndInterpolate accesslookupandinterpolate = new accesslookupAndInterpolate(addinappmessageviewtoviewgrouplambda20);
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        this.write = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = accesslookupandinterpolate;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.write.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        if (str == null) {
            int i2 = read + 97;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode3 = this.IconCompatParcelizer.serializer.hashCode() + (((iHashCode2 * 31) + iHashCode) * 31);
        int i4 = serializer + 59;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return iHashCode3;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SecondaryItemView(icons=" + this.write + ", text=" + this.RemoteActionCompatParcelizer + ", metaData=" + this.IconCompatParcelizer + ")";
        int i2 = read + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lerpInv)) {
            return false;
        }
        lerpInv lerpinv = (lerpInv) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, lerpinv.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, lerpinv.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, lerpinv.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i4 = read + 101;
        int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 45;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
