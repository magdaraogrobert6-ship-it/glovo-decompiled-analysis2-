package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getVirtualChildCount {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[nativeConvertAndroid420ToABGR.values().length];
        write = iArr;
        try {
            iArr[nativeConvertAndroid420ToABGR.PENDING_OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[nativeConvertAndroid420ToABGR.OPENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[nativeConvertAndroid420ToABGR.OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[nativeConvertAndroid420ToABGR.CONFIGURED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            write[nativeConvertAndroid420ToABGR.CLOSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            write[nativeConvertAndroid420ToABGR.RELEASING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            write[nativeConvertAndroid420ToABGR.CLOSED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            write[nativeConvertAndroid420ToABGR.RELEASED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
