package androidx.camera.camera2.internal;

import android.content.Context;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.CameraUpdateException;
import com.huawei.hmf.tasks.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import o.access501;
import o.getImageFormat;
import o.getViewModelStore;
import o.onReadoutStarted;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2DeviceSurfaceManager implements getImageFormat {
    public final j IconCompatParcelizer;
    public final HashMap RemoteActionCompatParcelizer;
    public final CameraManagerCompat read;
    public final Object serializer;
    public final Context write;

    @Override // o.getImageFormat
    public final void IconCompatParcelizer(List list) throws CameraUpdateException {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.serializer) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.RemoteActionCompatParcelizer.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, write(str));
            }
            synchronized (this.serializer) {
                HashMap map2 = new HashMap();
                for (String str2 : (ArrayList) list) {
                    if (this.RemoteActionCompatParcelizer.containsKey(str2)) {
                        map2.put(str2, (SupportedSurfaceCombination) this.RemoteActionCompatParcelizer.get(str2));
                    } else {
                        map2.put(str2, (SupportedSurfaceCombination) map.get(str2));
                    }
                }
                this.RemoteActionCompatParcelizer.clear();
                this.RemoteActionCompatParcelizer.putAll(map2);
            }
        } catch (CameraUnavailableException | RuntimeException e) {
            throw new CameraUpdateException("Failed to create SupportedSurfaceCombination", e);
        }
    }

    public Camera2DeviceSurfaceManager(Context context, Object obj, LinkedHashSet linkedHashSet) throws CameraUnavailableException {
        j jVar = new j(2);
        this.serializer = new Object();
        this.RemoteActionCompatParcelizer = new HashMap();
        this.IconCompatParcelizer = jVar;
        this.write = context;
        if (obj instanceof CameraManagerCompat) {
            this.read = (CameraManagerCompat) obj;
        } else {
            getViewModelStore.read();
            this.read = CameraManagerCompat.RemoteActionCompatParcelizer(context);
        }
        try {
            IconCompatParcelizer(new ArrayList(linkedHashSet));
        } catch (CameraUpdateException e) {
            if (e.getCause() instanceof CameraUnavailableException) {
                throw ((CameraUnavailableException) e.getCause());
            }
            throw new CameraUnavailableException(e);
        }
    }

    public final SupportedSurfaceCombination write(String str) {
        onReadoutStarted access501Var = Build.VERSION.SDK_INT >= 35 ? new access501(this.write, str, this.read) : onReadoutStarted.MediaMetadataCompat;
        return new SupportedSurfaceCombination(this.write, str, this.read, this.IconCompatParcelizer, access501Var);
    }
}
