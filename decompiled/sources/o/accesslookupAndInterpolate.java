package o;

/* JADX INFO: loaded from: classes3.dex */
public final class accesslookupAndInterpolate {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final addInAppMessageViewToViewGrouplambda20 serializer;

    public accesslookupAndInterpolate(addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20) {
        this.serializer = addinappmessageviewtoviewgrouplambda20;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.serializer.hashCode();
            int i3 = 42 / 0;
        } else {
            iHashCode = this.serializer.hashCode();
        }
        int i4 = RemoteActionCompatParcelizer + 41;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 94 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "MetaData(map=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = RemoteActionCompatParcelizer + 73;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else if (!(obj instanceof accesslookupAndInterpolate) || !this.serializer.equals(((accesslookupAndInterpolate) obj).serializer)) {
            return false;
        }
        int i4 = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return true;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
