package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class accessgetTriangleFancp {
    public static final /* synthetic */ int[] IconCompatParcelizer;

    static {
        int[] iArr = new int[mul3x3Float3.values().length];
        IconCompatParcelizer = iArr;
        try {
            iArr[mul3x3Float3.MERGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            IconCompatParcelizer[mul3x3Float3.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            IconCompatParcelizer[mul3x3Float3.SUBTRACT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            IconCompatParcelizer[mul3x3Float3.INTERSECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            IconCompatParcelizer[mul3x3Float3.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
