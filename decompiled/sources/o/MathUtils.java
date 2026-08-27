package o;

/* JADX INFO: loaded from: classes3.dex */
public final class MathUtils {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final accesslookupAndInterpolate IconCompatParcelizer;
    public final String read;

    public MathUtils(String str) {
        addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20 = addInAppMessageViewToViewGrouplambda20.IconCompatParcelizer;
        addinappmessageviewtoviewgrouplambda20.getClass();
        accesslookupAndInterpolate accesslookupandinterpolate = new accesslookupAndInterpolate(addinappmessageviewtoviewgrouplambda20);
        this.read = str;
        this.IconCompatParcelizer = accesslookupandinterpolate;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 9;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.read;
        if (str == null) {
            int i5 = i2 + 107;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return this.IconCompatParcelizer.serializer.hashCode() + (iHashCode * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PrimaryItemView(primaryText=" + this.read + ", metaData=" + this.IconCompatParcelizer + ")";
        int i2 = serializer + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MathUtils)) {
            int i2 = serializer + 43;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        MathUtils mathUtils = (MathUtils) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, mathUtils.read}, getCieXyz.write())).booleanValue()) {
            int i4 = RemoteActionCompatParcelizer + 29;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, mathUtils.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i6 = serializer + 85;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }
}
