package androidx.camera.camera2.internal.concurrent;

import androidx.camera.camera2.internal.CameraIdUtil;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import o.FocusMeteringAction;
import o.getImageFormat;
import o.setInflatedId;
import o.setLineHeight;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2CameraCoordinator implements getImageFormat {
    public final CameraManagerCompat RemoteActionCompatParcelizer;
    public final Object MediaMetadataCompat = new Object();
    public HashMap IconCompatParcelizer = new HashMap();
    public HashSet read = new HashSet();
    public final ArrayList serializer = new ArrayList();
    public int write = 0;
    public final ArrayList MediaBrowserCompatMediaItem = new ArrayList();

    public final int IconCompatParcelizer() {
        int i;
        synchronized (this.MediaMetadataCompat) {
            i = this.write;
        }
        return i;
    }

    public final String IconCompatParcelizer(String str) {
        synchronized (this.MediaMetadataCompat) {
            if (!this.IconCompatParcelizer.containsKey(str)) {
                return null;
            }
            List<String> list = (List) this.IconCompatParcelizer.get(str);
            if (list == null) {
                return null;
            }
            for (String str2 : list) {
                Iterator it = this.serializer.iterator();
                while (it.hasNext()) {
                    if (str2.equals(((setLineHeight) ImageCapture$1.serializer((FocusMeteringAction) it.next()).MediaSessionCompatQueueItem).MediaDescriptionCompat)) {
                        return str2;
                    }
                }
            }
            return null;
        }
    }

    @Override // o.getImageFormat
    public final void IconCompatParcelizer(List list) throws CameraUpdateException {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set set : this.RemoteActionCompatParcelizer.serializer.serializer()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (CameraIdUtil.read(this.RemoteActionCompatParcelizer, str) && CameraIdUtil.read(this.RemoteActionCompatParcelizer, str2)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!map.containsKey(str)) {
                                    map.put(str, new ArrayList());
                                }
                                ((List) map.get(str)).add(str2);
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new ArrayList());
                                }
                                ((List) map.get(str2)).add(str);
                            }
                        } catch (InitializationException unused) {
                            setInflatedId.IconCompatParcelizer(3, "Camera2CameraCoordinator");
                        }
                    }
                }
            }
            synchronized (this.MediaMetadataCompat) {
                this.IconCompatParcelizer = map;
                this.read = hashSet;
                Objects.toString(map);
                setInflatedId.IconCompatParcelizer(3, "Camera2CameraCoordinator");
            }
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUpdateException("Failed to retrieve concurrent camera id info.", e);
        }
    }

    public Camera2CameraCoordinator(CameraManagerCompat cameraManagerCompat) {
        this.RemoteActionCompatParcelizer = cameraManagerCompat;
        try {
            IconCompatParcelizer(Arrays.asList(cameraManagerCompat.RemoteActionCompatParcelizer()));
        } catch (CameraAccessExceptionCompat | CameraUpdateException e) {
            setInflatedId.read("Camera2CameraCoordinator", "Failed to get concurrent camera ids", e);
        }
    }
}
