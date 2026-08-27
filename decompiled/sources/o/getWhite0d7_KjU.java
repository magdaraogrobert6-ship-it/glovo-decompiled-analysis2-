package o;

import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getWhite0d7_KjU {
    public final getRed0d7_KjU RemoteActionCompatParcelizer;
    public final getLightGray0d7_KjU read;

    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        getRed0d7_KjU getred0d7_kju = this.RemoteActionCompatParcelizer;
        getTransparent0d7_KjU gettransparent0d7_kju = getred0d7_kju.MediaDescriptionCompat;
        if (!getred0d7_kju.serializer) {
            getred0d7_kju.RemoteActionCompatParcelizer();
        }
        if (((accessregisterComponentCallback) gettransparent0d7_kju.getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(((accessregisterComponentCallback) gettransparent0d7_kju.getLifecycle()).RatingCompat, "performRestore cannot be called when owner is ");
        } else if (getred0d7_kju.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("SavedStateRegistry was already restored.");
        } else {
            getred0d7_kju.RatingCompat = (bundle == null || !getCyan0d7_KjU.IconCompatParcelizer(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key")) ? null : getCyan0d7_KjU.read(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            getred0d7_kju.write = true;
        }
    }

    public getWhite0d7_KjU(getRed0d7_KjU getred0d7_kju) {
        this.RemoteActionCompatParcelizer = getred0d7_kju;
        this.read = new getLightGray0d7_KjU(getred0d7_kju);
    }

    public final void read(Bundle bundle) {
        getRed0d7_KjU getred0d7_kju = this.RemoteActionCompatParcelizer;
        Object[] objArr = {(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        Bundle bundle2 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320);
        Bundle bundle3 = getred0d7_kju.RatingCompat;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        synchronized (getred0d7_kju.RemoteActionCompatParcelizer) {
            for (Map.Entry entry : getred0d7_kju.IconCompatParcelizer.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleSaveState = ((getGreen0d7_KjU) entry.getValue()).saveState();
                str.getClass();
                bundleSaveState.getClass();
                bundle2.putBundle(str, bundleSaveState);
            }
        }
        if (getCyan0d7_KjU.read(bundle2)) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
