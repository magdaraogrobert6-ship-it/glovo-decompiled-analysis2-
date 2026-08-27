package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setDividerHeight {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final PreferenceGroup IconCompatParcelizer;
    public final String read;
    public final String write;

    public setDividerHeight(String str, String str2, PreferenceGroup preferenceGroup) {
        str.getClass();
        preferenceGroup.getClass();
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = preferenceGroup;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = serializer + 109;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.write.hashCode();
        String str = this.read;
        if (str == null) {
            int i3 = serializer + 27;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return this.IconCompatParcelizer.hashCode() + (((iHashCode2 * 31) + iHashCode) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("SuspendedStateAction(text=", this.write, ", url=", this.read, ", navigationType=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 81;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDividerHeight)) {
            int i5 = i3 + 35;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i6;
            boolean z = i5 % 2 == 0;
            int i7 = i6 + 83;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return z;
        }
        setDividerHeight setdividerheight = (setDividerHeight) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, setdividerheight.write}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, setdividerheight.read}, getCieXyz.write())).booleanValue()) {
            int i9 = RemoteActionCompatParcelizer + 3;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i9 % 2 != 0;
        }
        if (this.IconCompatParcelizer == setdividerheight.IconCompatParcelizer) {
            return true;
        }
        int i10 = RemoteActionCompatParcelizer;
        int i11 = i10 + 35;
        serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        int i13 = i10 + 79;
        serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            int i14 = 27 / 0;
        }
        return false;
    }
}
