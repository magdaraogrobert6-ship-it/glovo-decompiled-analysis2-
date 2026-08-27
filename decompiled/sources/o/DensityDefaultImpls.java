package o;

import com.roadrunner.delivery.pickupdropoff.tasks.model.MultipleCodeScanTaskUiItem$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class DensityDefaultImpls extends getDensityannotations {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    public final sourceInformationContextOf IconCompatParcelizer;

    static {
        MultipleCodeScanTaskUiItem$Companion multipleCodeScanTaskUiItem$Companion = sourceInformationContextOf.Companion;
        int i = serializer + 67;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public DensityDefaultImpls(sourceInformationContextOf sourceinformationcontextof) {
        sourceinformationcontextof.getClass();
        this.IconCompatParcelizer = sourceinformationcontextof;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.IconCompatParcelizer.hashCode();
        }
        this.IconCompatParcelizer.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "MultipleCodeScanTask(uiItem=" + this.IconCompatParcelizer + ")";
        int i2 = RemoteActionCompatParcelizer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 27;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof DensityDefaultImpls) {
            Object[] objArr = {this.IconCompatParcelizer, ((DensityDefaultImpls) obj).IconCompatParcelizer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = RemoteActionCompatParcelizer + 91;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return false;
            }
            throw null;
        }
        int i6 = i2 + 111;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
