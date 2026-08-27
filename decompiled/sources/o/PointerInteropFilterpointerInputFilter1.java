package o;

/* JADX INFO: loaded from: classes2.dex */
public enum PointerInteropFilterpointerInputFilter1 implements clearOnDeviceChange {
    FORMAT_UNKNOWN(0),
    FORMAT_CODE_128(1),
    FORMAT_CODE_39(2),
    FORMAT_CODE_93(4),
    FORMAT_CODABAR(8),
    FORMAT_DATA_MATRIX(16),
    FORMAT_EAN_13(32),
    FORMAT_EAN_8(64),
    FORMAT_ITF(androidx.compose.ui.graphics.Fields.SpotShadowColor),
    FORMAT_QR_CODE(androidx.compose.ui.graphics.Fields.RotationX),
    FORMAT_UPC_A(androidx.compose.ui.graphics.Fields.RotationY),
    FORMAT_UPC_E(androidx.compose.ui.graphics.Fields.RotationZ),
    FORMAT_PDF417(androidx.compose.ui.graphics.Fields.CameraDistance),
    FORMAT_AZTEC(androidx.compose.ui.graphics.Fields.TransformOrigin);

    private final int zzp;

    @Override // o.clearOnDeviceChange
    public final int zza() {
        return this.zzp;
    }

    PointerInteropFilterpointerInputFilter1(int i) {
        this.zzp = i;
    }
}
