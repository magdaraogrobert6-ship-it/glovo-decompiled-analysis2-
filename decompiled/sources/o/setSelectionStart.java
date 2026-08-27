package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class setSelectionStart {
    private static int serializer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;
    public final long read;

    public final String serializer() {
        int i = 2 % 2;
        int i2 = serializer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RemoteActionCompatParcelizer;
        }
        int i3 = 16 / 0;
        return this.RemoteActionCompatParcelizer;
    }

    public final long write() {
        int i = 2 % 2;
        int i2 = serializer + 65;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.read;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public setSelectionStart(String str, long j) {
        str.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.read = j;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 123;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Long.hashCode(this.read) + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = serializer + 41;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 85;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("MessageInfo(messageText=", this.RemoteActionCompatParcelizer, this.read, ", messageReceivedTimeStamp=");
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 39;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 49;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setSelectionStart) {
            setSelectionStart setselectionstart = (setSelectionStart) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, setselectionstart.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                return this.read == setselectionstart.read;
            }
            int i5 = write + 51;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return i5 % 2 != 0;
        }
        int i6 = i2 + 31;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
