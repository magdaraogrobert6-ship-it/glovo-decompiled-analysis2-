package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class containsFireIds {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final long IconCompatParcelizer;
    public final String serializer;
    public final String write;

    public containsFireIds(String str, String str2, long j) {
        this.serializer = str;
        this.write = str2;
        this.IconCompatParcelizer = j;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("Reward(text=", this.serializer, ", description=", this.write, ", descriptionTextColor="), androidx.compose.ui.graphics.Color.m730toStringimpl(this.IconCompatParcelizer), ")");
        int i4 = read + 29;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 75;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.serializer;
        if (str == null) {
            int i5 = i2 + 95;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.write;
        return androidx.compose.ui.graphics.Color.m729hashCodeimpl(this.IconCompatParcelizer) + (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 27;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof containsFireIds)) {
            int i4 = i2 + 99;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
        containsFireIds containsfireids = (containsFireIds) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, containsfireids.serializer}, getCieXyz.write())).booleanValue()) {
            int i5 = read + 63;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, containsfireids.write}, getCieXyz.write())).booleanValue() || !androidx.compose.ui.graphics.Color.m723equalsimpl0(this.IconCompatParcelizer, containsfireids.IconCompatParcelizer)) {
            return false;
        }
        int i7 = RemoteActionCompatParcelizer + 53;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
