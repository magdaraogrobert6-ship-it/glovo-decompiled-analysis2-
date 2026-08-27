package o;

/* JADX INFO: loaded from: classes3.dex */
public final class onCanceled implements getTransparent0d7_KjU {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public getWhite0d7_KjU read;
    public final /* synthetic */ int serializer;
    public accessregisterComponentCallback write;

    @Override // o.accessisRenderNodeCompatiblecp
    public final supportsColorMatrixQuery getLifecycle() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 33;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this.serializer != 0) {
            accessregisterComponentCallback accessregistercomponentcallback = this.write;
            int i5 = i2 + 17;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return accessregistercomponentcallback;
            }
            throw null;
        }
        accessregisterComponentCallback accessregistercomponentcallback2 = this.write;
        int i6 = i4 + 23;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return accessregistercomponentcallback2;
        }
        throw null;
    }

    @Override // o.getTransparent0d7_KjU
    public final getLightGray0d7_KjU getSavedStateRegistry() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.serializer == 0) {
            return this.read.read;
        }
        getLightGray0d7_KjU getlightgray0d7_kju = this.read.read;
        int i4 = RemoteActionCompatParcelizer + 55;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getlightgray0d7_kju;
    }
}
