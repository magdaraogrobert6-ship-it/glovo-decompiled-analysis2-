package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda5hznbMbgdS2eCZLmHROk6qxRFRo {
    private static int serializer = 1;
    private static int write;
    public final int IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 117;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        String str = this.read;
        int i5 = i3 + 97;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = serializer + 61;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        int i5 = this.IconCompatParcelizer;
        int i6 = i3 + 51;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 47 / 0;
        }
        return i5;
    }

    public final String write() {
        String str;
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 121;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.RemoteActionCompatParcelizer;
            int i4 = 89 / 0;
        } else {
            str = this.RemoteActionCompatParcelizer;
        }
        int i5 = i2 + 3;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public r8lambda5hznbMbgdS2eCZLmHROk6qxRFRo(String str, int i, String str2) {
        this.read = str;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, this.read.hashCode() * 31, 31);
        int i4 = write + 71;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(m1$$ExternalSyntheticOutline0.m("RoosterData(url=", this.IconCompatParcelizer, this.read, ", titleRes=", ", screenName="), this.RemoteActionCompatParcelizer, ")");
        int i4 = serializer + 121;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 55;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambda5hznbMbgdS2eCZLmHROk6qxRFRo) {
            r8lambda5hznbMbgdS2eCZLmHROk6qxRFRo r8lambda5hznbmbgds2eczlmhrok6qxrfro = (r8lambda5hznbMbgdS2eCZLmHROk6qxRFRo) obj;
            return this.read.equals(r8lambda5hznbmbgds2eczlmhrok6qxrfro.read) && this.IconCompatParcelizer == r8lambda5hznbmbgds2eczlmhrok6qxrfro.IconCompatParcelizer && this.RemoteActionCompatParcelizer.equals(r8lambda5hznbmbgds2eczlmhrok6qxrfro.RemoteActionCompatParcelizer);
        }
        int i4 = i3 + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
