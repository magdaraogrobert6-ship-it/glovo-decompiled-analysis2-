package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getAcescg {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[mul3x3Float3_2.values().length];
        write = iArr;
        try {
            iArr[mul3x3Float3_2.MASK_MODE_NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[mul3x3Float3_2.MASK_MODE_SUBTRACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[mul3x3Float3_2.MASK_MODE_INTERSECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[mul3x3Float3_2.MASK_MODE_ADD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[getBt2020Pq.values().length];
        IconCompatParcelizer = iArr2;
        try {
            iArr2[getBt2020Pq.SHAPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            IconCompatParcelizer[getBt2020Pq.PRE_COMP.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            IconCompatParcelizer[getBt2020Pq.SOLID.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            IconCompatParcelizer[getBt2020Pq.IMAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            IconCompatParcelizer[getBt2020Pq.NULL.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            IconCompatParcelizer[getBt2020Pq.TEXT.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            IconCompatParcelizer[getBt2020Pq.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
