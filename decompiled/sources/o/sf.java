package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class sf {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final sgExternalSyntheticLambda3 RemoteActionCompatParcelizer;
    public final String read;
    public final ArrayList write;

    public sf(ArrayList arrayList, String str, sgExternalSyntheticLambda3 sgexternalsyntheticlambda3) {
        str.getClass();
        sgexternalsyntheticlambda3.getClass();
        this.write = arrayList;
        this.read = str;
        this.RemoteActionCompatParcelizer = sgexternalsyntheticlambda3;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.read);
        int i4 = serializer + 65;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 49;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            int i3 = 5 % 4;
            return true;
        }
        if (obj instanceof sf) {
            sf sfVar = (sf) obj;
            if (this.write.equals(sfVar.write)) {
                Object[] objArr = {this.read, sfVar.read};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && this.RemoteActionCompatParcelizer == sfVar.RemoteActionCompatParcelizer) {
                    return true;
                }
            }
        }
        int i4 = IconCompatParcelizer + 103;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "Section(icons=" + this.write + ", text=" + this.read + ", type=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = IconCompatParcelizer + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
