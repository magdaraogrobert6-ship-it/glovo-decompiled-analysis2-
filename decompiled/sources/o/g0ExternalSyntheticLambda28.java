package o;

import bo.app.af$$ExternalSyntheticOutline0;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final class g0ExternalSyntheticLambda28 extends Options.Companion {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final boolean IconCompatParcelizer;
    public final f6 write;

    @Override // okio.Options.Companion
    public final f6 L_() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 57;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        f6 f6Var = this.write;
        int i5 = i2 + 71;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return f6Var;
    }

    @Override // okio.Options.Companion
    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public g0ExternalSyntheticLambda28(f6 f6Var, boolean z) {
        f6Var.getClass();
        this.write = f6Var;
        this.IconCompatParcelizer = z;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 3;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            int i4 = i2 + 27;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof g0ExternalSyntheticLambda28)) {
            return false;
        }
        g0ExternalSyntheticLambda28 g0externalsyntheticlambda28 = (g0ExternalSyntheticLambda28) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, g0externalsyntheticlambda28.write}, getCieXyz.write())).booleanValue() && this.IconCompatParcelizer == g0externalsyntheticlambda28.IconCompatParcelizer;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "IconMarker(iconDrawable=2131231219, iconColor=2131101537, backgroundDrawable=2131232423, iconAnchor=" + this.write + ", highlighted=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(com.logistics.rider.glovo.R.drawable.rounded_box, af$$ExternalSyntheticOutline0.m(com.logistics.rider.glovo.R.color.neutral_00, Integer.hashCode(com.logistics.rider.glovo.R.drawable.ic_bold_large_logout_logout) * 31, 31), 31);
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer) + ((this.write.hashCode() + iM) * 31);
        int i4 = RemoteActionCompatParcelizer + 65;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
