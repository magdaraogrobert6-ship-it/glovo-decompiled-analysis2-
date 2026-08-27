package o;

import android.view.ScrollCaptureSession;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class seekAnimationsanimation_core implements setTextClassifier, getBirthDateMonth, getHandlerui, androidx.compose.ui.text.TextInclusionStrategy, androidx.compose.ui.text.input.VisualTransformation, getDstBrush {
    public final /* synthetic */ int write;

    @Override // o.getBirthDateMonth
    public void RemoteActionCompatParcelizer() {
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public androidx.compose.ui.text.input.TransformedText filter(androidx.compose.ui.text.AnnotatedString annotatedString) {
        return androidx.compose.ui.text.input.VisualTransformation.Companion.None$lambda$0(annotatedString);
    }

    @Override // o.getHandlerui
    public boolean read() {
        return androidx.compose.ui.layout.LayoutNodeSubcompositionsState.applyPausedPrecomposition$lambda$0$0$0();
    }

    @Override // o.getDstBrush
    public void serializer(obtainAndroidColorSpace obtainandroidcolorspace, ColorSpaceVerificationHelperExternalSyntheticLambda0 colorSpaceVerificationHelperExternalSyntheticLambda0, boolean z) {
        obtainandroidcolorspace.RemoteActionCompatParcelizer(colorSpaceVerificationHelperExternalSyntheticLambda0);
    }

    public /* synthetic */ seekAnimationsanimation_core(int i) {
        this.write = i;
    }

    public static /* synthetic */ void serializer(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    @Override // androidx.compose.ui.text.TextInclusionStrategy
    public boolean isIncluded(androidx.compose.ui.geometry.Rect rect, androidx.compose.ui.geometry.Rect rect2) {
        int i = this.write;
        if (i != 17) {
            return i != 18 ? androidx.compose.ui.text.TextInclusionStrategy.Companion.ContainsCenter$lambda$0(rect, rect2) : androidx.compose.ui.text.TextInclusionStrategy.Companion.ContainsAll$lambda$0(rect, rect2);
        }
        return rect.overlaps(rect2);
    }

    @Override // o.setTextClassifier
    public Object read(Object obj) {
        return this.write != 1 ? Integer.valueOf(((CombinedClickableElement) obj).IconCompatParcelizer) : new backgroundbw27NRU((minIntrinsicWidth) obj);
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession at_(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsetsAnimation au_(Object obj) {
        return (android.view.WindowInsetsAnimation) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession av_(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void IconCompatParcelizer(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* bridge */ /* synthetic */ android.graphics.BlendModeColorFilter as_(Object obj) {
        return (android.graphics.BlendModeColorFilter) obj;
    }

    public static /* synthetic */ void IconCompatParcelizer(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* bridge */ /* synthetic */ boolean MediaMetadataCompat(Object obj) {
        return obj instanceof android.graphics.BlendModeColorFilter;
    }
}
