package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetEmptyCanvasp implements toAndroidColorSpace {
    public final Object IconCompatParcelizer;
    public final Object read;
    public final /* synthetic */ int write = 0;

    public accessgetEmptyCanvasp(accessclearShadowCache accessclearshadowcache) {
        this.read = accessclearshadowcache;
        skew skewVar = skew.IconCompatParcelizer;
        Class<?> cls = accessclearshadowcache.getClass();
        setInternalCanvas setinternalcanvas = (setInternalCanvas) skewVar.serializer.get(cls);
        this.IconCompatParcelizer = setinternalcanvas == null ? skewVar.serializer(cls, null) : setinternalcanvas;
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        int i = this.write;
        Object obj = this.read;
        Object obj2 = this.IconCompatParcelizer;
        if (i != 0) {
            if (i != 1) {
                HashMap map = ((setInternalCanvas) obj2).IconCompatParcelizer;
                setInternalCanvas.read((List) map.get(androidColorSpace_androidKt), accessisrendernodecompatiblecp, androidColorSpace_androidKt, obj);
                setInternalCanvas.read((List) map.get(AndroidColorSpace_androidKt.ON_ANY), accessisrendernodecompatiblecp, androidColorSpace_androidKt, obj);
                return;
            }
            addObserverForBackInvoker addobserverforbackinvoker = (addObserverForBackInvoker) obj;
            int i2 = getOnBackPressedInput.write[androidColorSpace_androidKt.ordinal()];
            if (i2 == 1) {
                addobserverforbackinvoker.RemoteActionCompatParcelizer(true);
                return;
            }
            if (i2 == 2) {
                addobserverforbackinvoker.RemoteActionCompatParcelizer(false);
                return;
            } else {
                if (i2 != 3) {
                    return;
                }
                addobserverforbackinvoker.serializer();
                ((supportsColorMatrixQuery) obj2).read(this);
                return;
            }
        }
        androidx.lifecycle.DefaultLifecycleObserver defaultLifecycleObserver = (androidx.lifecycle.DefaultLifecycleObserver) obj;
        switch (ActualCanvas.serializer[androidColorSpace_androidKt.ordinal()]) {
            case 1:
                defaultLifecycleObserver.onCreate(accessisrendernodecompatiblecp);
                break;
            case 2:
                defaultLifecycleObserver.onStart(accessisrendernodecompatiblecp);
                break;
            case 3:
                defaultLifecycleObserver.onResume(accessisrendernodecompatiblecp);
                break;
            case 4:
                defaultLifecycleObserver.onPause(accessisrendernodecompatiblecp);
                break;
            case 5:
                defaultLifecycleObserver.onStop(accessisrendernodecompatiblecp);
                break;
            case 6:
                defaultLifecycleObserver.onDestroy(accessisrendernodecompatiblecp);
                break;
            case 7:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ON_ANY must not been send by anybody");
                return;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
        }
        toAndroidColorSpace toandroidcolorspace = (toAndroidColorSpace) obj2;
        if (toandroidcolorspace != null) {
            toandroidcolorspace.onStateChanged(accessisrendernodecompatiblecp, androidColorSpace_androidKt);
        }
    }

    public accessgetEmptyCanvasp(androidx.lifecycle.DefaultLifecycleObserver defaultLifecycleObserver, toAndroidColorSpace toandroidcolorspace) {
        defaultLifecycleObserver.getClass();
        this.read = defaultLifecycleObserver;
        this.IconCompatParcelizer = toandroidcolorspace;
    }

    public accessgetEmptyCanvasp(addObserverForBackInvoker addobserverforbackinvoker, defaultViewModelProviderFactory_delegatelambda0 defaultviewmodelproviderfactory_delegatelambda0, supportsColorMatrixQuery supportscolormatrixquery) {
        this.read = addobserverforbackinvoker;
        this.IconCompatParcelizer = supportscolormatrixquery;
    }
}
