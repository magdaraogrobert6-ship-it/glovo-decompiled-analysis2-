package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdafHcIMtqslO5nN2ofGE631aElY extends ContainsAlllambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final int read;
    public final String serializer;

    public r8lambdafHcIMtqslO5nN2ofGE631aElY(String str, String str2, int i) {
        str.getClass();
        str2.getClass();
        this.IconCompatParcelizer = str;
        this.serializer = str2;
        this.read = i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = af$$ExternalSyntheticOutline0.m(this.read, ")", c8$$ExternalSyntheticOutline0.m("Available(title=", this.IconCompatParcelizer, ", description=", this.serializer, ", icon=2131231259, animation="));
        int i4 = RemoteActionCompatParcelizer + 101;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iM;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            iM = Integer.hashCode(this.read) >> af$$ExternalSyntheticOutline0.m(com.logistics.rider.glovo.R.drawable.ic_bold_large_shopping_bag_paired_orders, af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() - 44, 53, this.serializer), 121);
        } else {
            iM = af$$ExternalSyntheticOutline0.m(com.logistics.rider.glovo.R.drawable.ic_bold_large_shopping_bag_paired_orders, af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer.hashCode() * 31, 31, this.serializer), 31) + Integer.hashCode(this.read);
        }
        int i3 = write + 11;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 59;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 7;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (!(obj instanceof r8lambdafHcIMtqslO5nN2ofGE631aElY)) {
            return false;
        }
        r8lambdafHcIMtqslO5nN2ofGE631aElY r8lambdafhcimtqslo5nn2ofge631aely = (r8lambdafHcIMtqslO5nN2ofGE631aElY) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, r8lambdafhcimtqslo5nn2ofge631aely.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdafhcimtqslo5nn2ofge631aely.serializer}, getCieXyz.write())).booleanValue() && this.read == r8lambdafhcimtqslo5nn2ofge631aely.read;
    }
}
