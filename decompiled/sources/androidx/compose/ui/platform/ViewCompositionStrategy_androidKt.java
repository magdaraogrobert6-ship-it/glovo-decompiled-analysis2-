package androidx.compose.ui.platform;

import o.AndroidColorSpace_androidKt;
import o.DrawableTransformation;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.supportsColorMatrixQuery;
import o.toAndroidColorSpace;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public final class ViewCompositionStrategy_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 installForLifecycle(final AbstractComposeView abstractComposeView, final supportsColorMatrixQuery supportscolormatrixquery) {
        if (((accessregisterComponentCallback) supportscolormatrixquery).RatingCompat.compareTo(toColorLong8_81llA.DESTROYED) <= 0) {
            DrawableTransformation.serializer("Cannot configure ", abstractComposeView, " to disposeComposition at Lifecycle ON_DESTROY: ", supportscolormatrixquery, "is already destroyed");
            return null;
        }
        final toAndroidColorSpace toandroidcolorspace = new toAndroidColorSpace() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$$ExternalSyntheticLambda0
            @Override // o.toAndroidColorSpace
            public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
                ViewCompositionStrategy_androidKt.installForLifecycle$lambda$1(abstractComposeView, accessisrendernodecompatiblecp, androidColorSpace_androidKt);
            }
        };
        supportscolormatrixquery.IconCompatParcelizer(toandroidcolorspace);
        return new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt.installForLifecycle.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m2792invoke() {
                supportscolormatrixquery.read(toandroidcolorspace);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m2792invoke();
                return createFromParcel.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installForLifecycle$lambda$1(AbstractComposeView abstractComposeView, accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
            abstractComposeView.disposeComposition();
        }
    }
}
