package o;

import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class getLightGray0d7_KjU {
    public final getRed0d7_KjU IconCompatParcelizer;
    public removeMenuProvider read;

    public final getGreen0d7_KjU IconCompatParcelizer(String str) {
        getGreen0d7_KjU getgreen0d7_kju;
        getRed0d7_KjU getred0d7_kju = this.IconCompatParcelizer;
        synchronized (getred0d7_kju.RemoteActionCompatParcelizer) {
            Iterator it = getred0d7_kju.IconCompatParcelizer.entrySet().iterator();
            do {
                getgreen0d7_kju = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                getGreen0d7_KjU getgreen0d7_kju2 = (getGreen0d7_KjU) entry.getValue();
                int iWrite = getCieXyz.write();
                int iWrite2 = getCieXyz.write();
                int iWrite3 = getCieXyz.write();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str2, str}, iWrite3)).booleanValue()) {
                    getgreen0d7_kju = getgreen0d7_kju2;
                }
            } while (getgreen0d7_kju == null);
        }
        return getgreen0d7_kju;
    }

    public final void serializer() {
        if (!this.IconCompatParcelizer.read) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Can not perform this action after onSaveInstanceState");
            return;
        }
        removeMenuProvider removemenuprovider = this.read;
        if (removemenuprovider == null) {
            removemenuprovider = new removeMenuProvider(this);
        }
        this.read = removemenuprovider;
        try {
            actualColorMatrixFromFilter.class.getDeclaredConstructor(null);
            removeMenuProvider removemenuprovider2 = this.read;
            if (removemenuprovider2 != null) {
                ((LinkedHashSet) removemenuprovider2.serializer).add(actualColorMatrixFromFilter.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + actualColorMatrixFromFilter.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final Bundle write(String str) {
        getRed0d7_KjU getred0d7_kju = this.IconCompatParcelizer;
        if (!getred0d7_kju.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = getred0d7_kju.RatingCompat;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = getCyan0d7_KjU.IconCompatParcelizer(bundle, str) ? getCyan0d7_KjU.read(bundle, str) : null;
        bundle.remove(str);
        if (getCyan0d7_KjU.read(bundle)) {
            getred0d7_kju.RatingCompat = null;
        }
        return bundle2;
    }

    public getLightGray0d7_KjU(getRed0d7_KjU getred0d7_kju) {
        this.IconCompatParcelizer = getred0d7_kju;
    }

    public final void RemoteActionCompatParcelizer(String str, getGreen0d7_KjU getgreen0d7_kju) {
        getgreen0d7_kju.getClass();
        getRed0d7_KjU getred0d7_kju = this.IconCompatParcelizer;
        synchronized (getred0d7_kju.RemoteActionCompatParcelizer) {
            if (getred0d7_kju.IconCompatParcelizer.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            getred0d7_kju.IconCompatParcelizer.put(str, getgreen0d7_kju);
        }
    }
}
