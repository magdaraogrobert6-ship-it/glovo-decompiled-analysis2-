package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.state.pudo.TagToken;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g implements r8lambda55q2_ohlbc4LGzu4K9wd7pcC14s {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final TagToken RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g(String str, String str2, TagToken tagToken) {
        str.getClass();
        str2.getClass();
        tagToken.getClass();
        this.serializer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = tagToken;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 11;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.read);
        int i4 = IconCompatParcelizer + 117;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("TagInstruction(title=", this.serializer, ", description=", this.read, ", colorToken=");
        sbM.append(this.RemoteActionCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = IconCompatParcelizer + 99;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g) {
                r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g = (r8lambdanlfTZVuvy_8jMV3I3Z3dE7gl_2g) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g.serializer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g.read}, getCieXyz.write())).booleanValue()) {
                    return this.RemoteActionCompatParcelizer == r8lambdanlftzvuvy_8jmv3i3z3de7gl_2g.RemoteActionCompatParcelizer;
                }
                int i2 = IconCompatParcelizer + 25;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = write + 15;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        int i5 = IconCompatParcelizer + 11;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return true;
    }
}
