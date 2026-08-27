package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class getRoundRectPathui_graphics {
    public static final /* synthetic */ int[] IconCompatParcelizer;
    public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
    public static final /* synthetic */ int[] read;
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[setTranslationX.values().length];
        try {
            iArr[setTranslationX.ENQUEUED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[setTranslationX.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[setTranslationX.SUCCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[setTranslationX.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[setTranslationX.BLOCKED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[setTranslationX.CANCELLED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        IconCompatParcelizer = iArr;
        int[] iArr2 = new int[GraphicsLayerScope.values().length];
        try {
            iArr2[GraphicsLayerScope.EXPONENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[GraphicsLayerScope.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        write = iArr2;
        int[] iArr3 = new int[setCompositingStrategyaDBOjCE.values().length];
        try {
            iArr3[setCompositingStrategyaDBOjCE.NOT_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[setCompositingStrategyaDBOjCE.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[setCompositingStrategyaDBOjCE.UNMETERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[setCompositingStrategyaDBOjCE.NOT_ROAMING.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[setCompositingStrategyaDBOjCE.METERED.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        RemoteActionCompatParcelizer = iArr3;
        int[] iArr4 = new int[setRotationZ.values().length];
        try {
            iArr4[setRotationZ.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr4[setRotationZ.DROP_WORK_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        read = iArr4;
    }
}
