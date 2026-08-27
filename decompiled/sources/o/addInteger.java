package o;

/* JADX INFO: loaded from: classes3.dex */
public final class addInteger {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final String serializer;
    public final long write;

    public addInteger(String str, long j) {
        str.getClass();
        this.serializer = str;
        this.write = j;
    }

    public final int hashCode() {
        int iM729hashCodeimpl;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int iHashCode = this.serializer.hashCode();
            iM729hashCodeimpl = androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.write);
            i = iHashCode % 11;
        } else {
            int iHashCode2 = this.serializer.hashCode();
            iM729hashCodeimpl = androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.write);
            i = iHashCode2 * 31;
        }
        return iM729hashCodeimpl + i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 15;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Earning(text=", this.serializer, ", textColor=", androidx.compose.ui.graphics.Color.m730toStringimpl(this.write), ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Earning(text=", this.serializer, ", textColor=", androidx.compose.ui.graphics.Color.m730toStringimpl(this.write), ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addInteger)) {
            return false;
        }
        addInteger addinteger = (addInteger) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, addinteger.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (androidx.compose.ui.graphics.Color.m723equalsimpl0(this.write, addinteger.write)) {
            return true;
        }
        int i4 = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        return i4 % 2 == 0;
    }
}
