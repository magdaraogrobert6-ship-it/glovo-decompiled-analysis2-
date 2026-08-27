package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AbstractComposeView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AbstractComposeView$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i != 0) {
            AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$0((AndroidComposeViewAccessibilityDelegateCompat) obj);
        } else {
            ((AbstractComposeView) obj).attachedToWindow();
        }
    }
}
