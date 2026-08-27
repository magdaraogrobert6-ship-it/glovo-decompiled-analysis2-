package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM implements toAndroidColorSpace {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
        this.read = obj2;
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        int i = this.serializer;
        Object obj = this.read;
        Object obj2 = this.IconCompatParcelizer;
        if (i == 0) {
            androidx.activity.ComponentActivity.addObserverForBackInvoker$lambda$0((defaultViewModelProviderFactory_delegatelambda0) obj2, (androidx.activity.ComponentActivity) obj, accessisrendernodecompatiblecp, androidColorSpace_androidKt);
            return;
        }
        toComposeColorSpace tocomposecolorspace = (toComposeColorSpace) obj2;
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) obj;
        if (((accessregisterComponentCallback) accessisrendernodecompatiblecp.getLifecycle()).RatingCompat == toColorLong8_81llA.DESTROYED) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
            tocomposecolorspace.serializer();
            return;
        }
        int iCompareTo = ((accessregisterComponentCallback) accessisrendernodecompatiblecp.getLifecycle()).RatingCompat.compareTo(tocomposecolorspace.read);
        actualColorMatrixColorFilterjHGOpc actualcolormatrixcolorfilterjhgopc = tocomposecolorspace.serializer;
        if (iCompareTo < 0) {
            actualcolormatrixcolorfilterjhgopc.read = true;
            return;
        }
        if (actualcolormatrixcolorfilterjhgopc.read) {
            if (actualcolormatrixcolorfilterjhgopc.IconCompatParcelizer) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot resume a finished dispatcher");
            } else {
                actualcolormatrixcolorfilterjhgopc.read = false;
                actualcolormatrixcolorfilterjhgopc.IconCompatParcelizer();
            }
        }
    }
}
