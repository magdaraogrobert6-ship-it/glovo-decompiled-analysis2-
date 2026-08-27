package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk {
    public static final /* synthetic */ int[] serializer;

    static {
        int[] iArr = new int[ZoomControl.values().length];
        try {
            iArr[ZoomControl.IMAGE_FORMAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ZoomControl.DYNAMIC_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ZoomControl.FPS_RANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ZoomControl.VIDEO_STABILIZATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        serializer = iArr;
    }
}
