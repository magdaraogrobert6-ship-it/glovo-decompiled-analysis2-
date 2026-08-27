package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class InspectableValueDefaultImpls {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[accessgetValueOverridejd.values().length];
        write = iArr;
        try {
            iArr[accessgetValueOverridejd.CAPTURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            write[accessgetValueOverridejd.CONCAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            write[accessgetValueOverridejd.ALTERNATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            write[accessgetValueOverridejd.STAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            write[accessgetValueOverridejd.PLUS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            write[accessgetValueOverridejd.QUEST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            write[accessgetValueOverridejd.REPEAT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
