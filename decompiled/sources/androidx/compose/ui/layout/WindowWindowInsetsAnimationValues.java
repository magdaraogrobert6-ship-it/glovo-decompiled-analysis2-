package androidx.compose.ui.layout;

import androidx.compose.runtime.CompositionKt;
import o.AndroidContentCaptureManagerCompanion;
import o.PopulateViewStructure_androidKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.getContentCaptureSessionui;
import o.getPersonFullName;
import o.onCreateVirtualViewTranslationRequestsui;
import o.populate;

/* JADX INFO: loaded from: classes.dex */
public final class WindowWindowInsetsAnimationValues implements PlatformWindowInsetsAnimation {
    public static final int $stable = 8;
    private final RectRulers source;
    private final RectRulers target;
    private final PopulateViewStructure_androidKtpopulate7 isVisible$delegate = CompositionKt.RemoteActionCompatParcelizer(Boolean.TRUE);
    private final PopulateViewStructure_androidKtpopulate7 isAnimating$delegate = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
    private final populate fraction$delegate = getPersonFullName.RemoteActionCompatParcelizer(0.0f);
    private final PopulateViewStructure_androidKt durationMillis$delegate = AndroidContentCaptureManagerCompanion.RemoteActionCompatParcelizer(0);
    private final populate alpha$delegate = getPersonFullName.RemoteActionCompatParcelizer(1.0f);
    private long current = ValueInsets_androidKt.getUnsetValueInsets();
    private long maximum = ValueInsets_androidKt.getUnsetValueInsets();
    private long sourceValueInsets = ValueInsets_androidKt.getUnsetValueInsets();
    private long targetValueInsets = ValueInsets_androidKt.getUnsetValueInsets();

    /* JADX INFO: renamed from: getCurrent-hdzbrEE, reason: not valid java name */
    public final long m2360getCurrenthdzbrEE() {
        return this.current;
    }

    /* JADX INFO: renamed from: getMaximum-hdzbrEE, reason: not valid java name */
    public final long m2361getMaximumhdzbrEE() {
        return this.maximum;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: getSourceValueInsets-hdzbrEE, reason: not valid java name */
    public final long m2362getSourceValueInsetshdzbrEE() {
        return this.sourceValueInsets;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public RectRulers getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: getTargetValueInsets-hdzbrEE, reason: not valid java name */
    public final long m2363getTargetValueInsetshdzbrEE() {
        return this.targetValueInsets;
    }

    /* JADX INFO: renamed from: setCurrent-Ynlvx88, reason: not valid java name */
    public final void m2364setCurrentYnlvx88(long j) {
        this.current = j;
    }

    /* JADX INFO: renamed from: setMaximum-Ynlvx88, reason: not valid java name */
    public final void m2365setMaximumYnlvx88(long j) {
        this.maximum = j;
    }

    /* JADX INFO: renamed from: setSourceValueInsets-Ynlvx88, reason: not valid java name */
    public final void m2366setSourceValueInsetsYnlvx88(long j) {
        this.sourceValueInsets = j;
    }

    /* JADX INFO: renamed from: setTargetValueInsets-Ynlvx88, reason: not valid java name */
    public final void m2367setTargetValueInsetsYnlvx88(long j) {
        this.targetValueInsets = j;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getAlpha() {
        return ((getContentCaptureSessionui) this.alpha$delegate).serializer();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public long getDurationMillis() {
        return ((onCreateVirtualViewTranslationRequestsui) this.durationMillis$delegate).RemoteActionCompatParcelizer();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public float getFraction() {
        return ((getContentCaptureSessionui) this.fraction$delegate).serializer();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isAnimating() {
        return ((Boolean) this.isAnimating$delegate.getValue()).booleanValue();
    }

    @Override // androidx.compose.ui.layout.WindowInsetsAnimation
    public boolean isVisible() {
        return ((Boolean) this.isVisible$delegate.getValue()).booleanValue();
    }

    public void setAlpha(float f) {
        ((getContentCaptureSessionui) this.alpha$delegate).IconCompatParcelizer(f);
    }

    public void setDurationMillis(long j) {
        ((onCreateVirtualViewTranslationRequestsui) this.durationMillis$delegate).write(j);
    }

    public void setFraction(float f) {
        ((getContentCaptureSessionui) this.fraction$delegate).IconCompatParcelizer(f);
    }

    public WindowWindowInsetsAnimationValues(String str) {
        this.source = RectRulersKt.RectRulers(str + " source");
        this.target = RectRulersKt.RectRulers(str + " target");
    }

    public void setAnimating(boolean z) {
        this.isAnimating$delegate.setValue(Boolean.valueOf(z));
    }

    public void setVisible(boolean z) {
        this.isVisible$delegate.setValue(Boolean.valueOf(z));
    }
}
