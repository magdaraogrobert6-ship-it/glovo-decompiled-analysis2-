package o;

/* JADX INFO: loaded from: classes4.dex */
public enum FwFClientcache2 {
    FLOAT32(1),
    INT32(2),
    UINT8(3),
    INT64(4),
    STRING(5),
    BOOL(6),
    INT16(7),
    INT8(9);

    private final int value;

    public int c() {
        return this.value;
    }

    public int byteSize() {
        switch (FwFClientcustomerProfileClientDelegate1.write[ordinal()]) {
            case 1:
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
            case 5:
                return 1;
            case 6:
                return 8;
            case 7:
            case 8:
                return -1;
            default:
                DrawableTransformation.IconCompatParcelizer("DataType error: DataType ", this, " is not supported yet");
                return 0;
        }
    }

    FwFClientcache2(int i) {
        this.value = i;
    }
}
