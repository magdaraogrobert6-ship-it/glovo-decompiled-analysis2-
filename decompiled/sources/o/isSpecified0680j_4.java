package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.PinValidationTaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class isSpecified0680j_4 extends isSpecified0680j_4annotations {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final PreviewLightDark RemoteActionCompatParcelizer;

    static {
        PinValidationTaskUiItem$Companion pinValidationTaskUiItem$Companion = PreviewLightDark.Companion;
        int i = IconCompatParcelizer + 69;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 47 / 0;
        }
    }

    public isSpecified0680j_4(PreviewLightDark previewLightDark) {
        previewLightDark.getClass();
        this.RemoteActionCompatParcelizer = previewLightDark;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 35;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int i4 = read + 89;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PinValidationTask(pinValidationTaskUiItem=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 55;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 29;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 45;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return true;
        }
        if (obj instanceof isSpecified0680j_4) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, ((isSpecified0680j_4) obj).RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i7 = i2 + 113;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
