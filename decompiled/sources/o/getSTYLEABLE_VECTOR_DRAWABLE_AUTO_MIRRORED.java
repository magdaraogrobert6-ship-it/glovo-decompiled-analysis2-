package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED implements accessisRenderNodeCompatiblecp {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final accessregisterComponentCallback read;

    @Override // o.accessisRenderNodeCompatiblecp
    public final supportsColorMatrixQuery getLifecycle() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 7;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        accessregisterComponentCallback accessregistercomponentcallback = this.read;
        int i5 = i3 + 101;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return accessregistercomponentcallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED() {
        accessregisterComponentCallback accessregistercomponentcallback = new accessregisterComponentCallback(this, true);
        this.read = accessregistercomponentcallback;
        accessregistercomponentcallback.serializer(AndroidColorSpace_androidKt.ON_CREATE);
    }
}
