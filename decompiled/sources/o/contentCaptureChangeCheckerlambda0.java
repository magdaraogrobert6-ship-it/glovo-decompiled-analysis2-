package o;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class contentCaptureChangeCheckerlambda0 {
    public static final /* synthetic */ int[] write;

    static {
        int[] iArr = new int[fastForEachReplacedVisibleChildren.values().length];
        try {
            iArr[fastForEachReplacedVisibleChildren.InitialPending.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fastForEachReplacedVisibleChildren.RecomposePending.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fastForEachReplacedVisibleChildren.Recomposing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fastForEachReplacedVisibleChildren.ApplyPending.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[fastForEachReplacedVisibleChildren.Applied.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[fastForEachReplacedVisibleChildren.Cancelled.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[fastForEachReplacedVisibleChildren.Invalid.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        write = iArr;
    }
}
