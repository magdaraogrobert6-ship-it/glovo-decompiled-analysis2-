package o;

import android.os.Bundle;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public final class getDarkGray0d7_KjU implements toAndroidColorSpace {
    public final getTransparent0d7_KjU RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getDarkGray0d7_KjU(getTransparent0d7_KjU gettransparent0d7_kju, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = gettransparent0d7_kju;
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        int i = this.write;
        getTransparent0d7_KjU gettransparent0d7_kju = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            androidx.activity.ComponentActivity componentActivity = (androidx.activity.ComponentActivity) gettransparent0d7_kju;
            componentActivity.ensureViewModelStore();
            componentActivity.getLifecycle().read(this);
            return;
        }
        if (androidColorSpace_androidKt != AndroidColorSpace_androidKt.ON_CREATE) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write((Object) "Next event must be ON_CREATE");
            return;
        }
        accessisrendernodecompatiblecp.getLifecycle().read(this);
        Bundle bundleWrite = gettransparent0d7_kju.getSavedStateRegistry().write("androidx.savedstate.Restarter");
        if (bundleWrite == null) {
            return;
        }
        ArrayList<String> arrayListRemoteActionCompatParcelizer = getCyan0d7_KjU.RemoteActionCompatParcelizer(bundleWrite);
        if (arrayListRemoteActionCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        for (String str : arrayListRemoteActionCompatParcelizer) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, getDarkGray0d7_KjU.class.getClassLoader()).asSubclass(getGray0d7_KjU.class);
                clsAsSubclass.getClass();
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        if (!(gettransparent0d7_kju instanceof asFrameworkPaint)) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(gettransparent0d7_kju, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                            return;
                        }
                        getFilterQualityfv9h1I viewModelStore = ((asFrameworkPaint) gettransparent0d7_kju).getViewModelStore();
                        getLightGray0d7_KjU savedStateRegistry = gettransparent0d7_kju.getSavedStateRegistry();
                        viewModelStore.getClass();
                        LinkedHashMap linkedHashMap = viewModelStore.serializer;
                        for (String str2 : new HashSet(linkedHashMap.keySet())) {
                            str2.getClass();
                            androidx.lifecycle.ViewModel viewModel = (androidx.lifecycle.ViewModel) linkedHashMap.get(str2);
                            if (viewModel != null) {
                                TuplesKt.write(viewModel, savedStateRegistry, gettransparent0d7_kju.getLifecycle());
                            }
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            savedStateRegistry.serializer();
                        }
                    } catch (Exception e) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to instantiate ", str), e);
                        return;
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(ff$$ExternalSyntheticOutline0.m("Class ", str, " wasn't found"), e3);
                return;
            }
        }
    }
}
