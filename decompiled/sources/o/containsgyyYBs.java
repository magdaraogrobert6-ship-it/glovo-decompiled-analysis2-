package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.SignatureTaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class containsgyyYBs extends getCenternOccac {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;
    public final wrapper RemoteActionCompatParcelizer;

    static {
        SignatureTaskUiItem$Companion signatureTaskUiItem$Companion = wrapper.Companion;
        int i = IconCompatParcelizer + 37;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public containsgyyYBs(wrapper wrapperVar) {
        wrapperVar.getClass();
        this.RemoteActionCompatParcelizer = wrapperVar;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 99;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RemoteActionCompatParcelizer.hashCode();
        }
        this.RemoteActionCompatParcelizer.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "SignatureTask(signatureTaskUiItem=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 51;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            int i4 = i3 + 83;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        if (!(obj instanceof containsgyyYBs)) {
            return false;
        }
        Object[] objArr = {this.RemoteActionCompatParcelizer, ((containsgyyYBs) obj).RemoteActionCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i6 = write + 33;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
