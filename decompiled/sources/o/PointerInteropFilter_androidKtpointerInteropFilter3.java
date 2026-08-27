package o;

/* JADX INFO: loaded from: classes2.dex */
public enum PointerInteropFilter_androidKtpointerInteropFilter3 implements clearOnDeviceChange {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);

    private final int zzr;

    @Override // o.clearOnDeviceChange
    public final int zza() {
        return this.zzr;
    }

    PointerInteropFilter_androidKtpointerInteropFilter3(int i) {
        this.zzr = i;
    }
}
