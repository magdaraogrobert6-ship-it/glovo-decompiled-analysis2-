package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.TapToPayTaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class getUnspecifiedXSAIIZE extends getValueimpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final getMaxHeightimpl serializer;

    static {
        TapToPayTaskUiItem$Companion tapToPayTaskUiItem$Companion = getMaxHeightimpl.Companion;
        int i = IconCompatParcelizer + 107;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public getUnspecifiedXSAIIZE(getMaxHeightimpl getmaxheightimpl) {
        getmaxheightimpl.getClass();
        this.serializer = getmaxheightimpl;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.serializer.hashCode();
        }
        int i3 = 97 / 0;
        return this.serializer.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TapToPayTask(tapToPayTaskUiItem=" + this.serializer + ")";
        int i2 = write + 29;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 15;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof getUnspecifiedXSAIIZE)) {
            return false;
        }
        Object[] objArr = {this.serializer, ((getUnspecifiedXSAIIZE) obj).serializer};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        int i4 = write + 81;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
