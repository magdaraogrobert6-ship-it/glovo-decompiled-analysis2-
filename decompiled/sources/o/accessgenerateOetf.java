package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class accessgenerateOetf {
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[r8lambdafQNxHYBbQei_ep6070iYk6_yIE.values().length];
        RemoteActionCompatParcelizer = iArr;
        try {
            iArr[r8lambdafQNxHYBbQei_ep6070iYk6_yIE.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            RemoteActionCompatParcelizer[r8lambdafQNxHYBbQei_ep6070iYk6_yIE.TRANSFORMED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[accesscomputeWhitePoint.values().length];
        write = iArr2;
        try {
            iArr2[accesscomputeWhitePoint.RESOURCE_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[accesscomputeWhitePoint.DATA_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            write[accesscomputeWhitePoint.SOURCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            write[accesscomputeWhitePoint.FINISHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            write[accesscomputeWhitePoint.INITIALIZE.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[r8lambdaponDVIvEP6WqtUQAnGxPpAB6jjg.values().length];
        read = iArr3;
        try {
            iArr3[r8lambdaponDVIvEP6WqtUQAnGxPpAB6jjg.INITIALIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            read[r8lambdaponDVIvEP6WqtUQAnGxPpAB6jjg.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            read[r8lambdaponDVIvEP6WqtUQAnGxPpAB6jjg.DECODE_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
