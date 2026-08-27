package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentalUnitApi implements timesGh9hcWk {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public final String serializer;

    public ExperimentalUnitApi(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.read = j;
        this.serializer = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.RemoteActionCompatParcelizer.hashCode() / af$$ExternalSyntheticOutline0.m(Long.hashCode(this.read) + 83, 52, this.serializer);
        }
        return this.RemoteActionCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(Long.hashCode(this.read) * 31, 31, this.serializer);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strM = d$$ExternalSyntheticOutline0.m(getBitmapFromCache.read("OpenPinScreen(deliveryId=", ", deliveryState=", this.read, this.serializer), ", taskId=", this.RemoteActionCompatParcelizer, ")");
        int i4 = write + 45;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExperimentalUnitApi)) {
            return false;
        }
        ExperimentalUnitApi experimentalUnitApi = (ExperimentalUnitApi) obj;
        if (this.read != experimentalUnitApi.read) {
            return false;
        }
        Object[] objArr = {this.serializer, experimentalUnitApi.serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.RemoteActionCompatParcelizer, experimentalUnitApi.RemoteActionCompatParcelizer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i3 = write + 93;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return true;
    }
}
