package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda5kWZVrTTOf4XktrICuq14WHMSQA implements r8lambda56WtWDYfFxH1I9MfVEIOgBnACTY {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final String read;
    public final String serializer;
    public final String write;

    public r8lambda5kWZVrTTOf4XktrICuq14WHMSQA(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.write = str;
        this.serializer = str2;
        this.read = str3;
    }

    public final int hashCode() {
        int iM;
        String str;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = af$$ExternalSyntheticOutline0.m(this.write.hashCode() >> 40, 75, this.serializer);
            str = this.read;
        } else {
            iM = af$$ExternalSyntheticOutline0.m(this.write.hashCode() * 31, 31, this.serializer);
            str = this.read;
        }
        return str.hashCode() + iM;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 71;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("UrlLinkItem(title=", this.write, ", iconUrl=", this.serializer, ", link="), this.read, ")");
            int i3 = RemoteActionCompatParcelizer + 123;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strM;
        }
        ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("UrlLinkItem(title=", this.write, ", iconUrl=", this.serializer, ", link="), this.read, ")");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof r8lambda5kWZVrTTOf4XktrICuq14WHMSQA) {
            r8lambda5kWZVrTTOf4XktrICuq14WHMSQA r8lambda5kwzvrttof4xktricuq14whmsqa = (r8lambda5kWZVrTTOf4XktrICuq14WHMSQA) obj;
            Object[] objArr = {this.write, r8lambda5kwzvrttof4xktricuq14whmsqa.write};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.serializer, r8lambda5kwzvrttof4xktricuq14whmsqa.serializer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() && this.read.equals(r8lambda5kwzvrttof4xktricuq14whmsqa.read)) {
                    return true;
                }
            }
        } else {
            int i2 = RemoteActionCompatParcelizer + 113;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = IconCompatParcelizer + 71;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
