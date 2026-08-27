package androidx.camera.core.impl;

import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import o.ImageCapture1;
import o.getImageFormat;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.setInflatedId;

/* JADX INFO: loaded from: classes.dex */
public final class CameraRepository implements getImageFormat {
    public onDrawBehind IconCompatParcelizer;
    public onDrawWithContent RemoteActionCompatParcelizer;
    public Camera2CameraFactory serializer;
    public final Object write = new Object();
    public final LinkedHashMap read = new LinkedHashMap();
    public final HashSet MediaSessionCompatQueueItem = new HashSet();

    @Override // o.getImageFormat
    public final void IconCompatParcelizer(List list) throws CameraUpdateException {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.write) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.read.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.serializer.read(str));
            }
            synchronized (this.write) {
                HashSet hashSet2 = new HashSet(this.read.keySet());
                hashSet2.removeAll(list);
                ArrayList<ImageCapture1> arrayList = new ArrayList();
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    arrayList.add((ImageCapture1) this.read.get((String) it.next()));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str2 : (ArrayList) list) {
                    if (this.read.containsKey(str2)) {
                        linkedHashMap.put(str2, (ImageCapture1) this.read.get(str2));
                    } else {
                        linkedHashMap.put(str2, (ImageCapture1) map.get(str2));
                    }
                }
                this.read.clear();
                this.read.putAll(linkedHashMap);
                for (ImageCapture1 imageCapture1 : arrayList) {
                    if (imageCapture1 != null) {
                        imageCapture1.MediaSessionCompatResultReceiverWrapper();
                    }
                }
            }
        } catch (CameraUnavailableException e) {
            throw new CameraUpdateException("Failed to create CameraInternal", e);
        }
    }

    public final LinkedHashSet serializer() {
        LinkedHashSet linkedHashSet;
        synchronized (this.write) {
            linkedHashSet = new LinkedHashSet(this.read.values());
        }
        return linkedHashSet;
    }

    public final void serializer(Camera2CameraFactory camera2CameraFactory) {
        this.serializer = camera2CameraFactory;
        synchronized (this.write) {
            try {
                try {
                    for (String str : camera2CameraFactory.IconCompatParcelizer()) {
                        setInflatedId.IconCompatParcelizer(3, "CameraRepository");
                        ImageCapture1 imageCapture1 = (ImageCapture1) this.read.put(str, camera2CameraFactory.read(str));
                        if (imageCapture1 != null) {
                            imageCapture1.ParcelableVolumeInfo();
                        }
                    }
                } catch (CameraUnavailableException e) {
                    throw new InitializationException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ImageCapture1 write(String str) {
        ImageCapture1 imageCapture1;
        synchronized (this.write) {
            imageCapture1 = (ImageCapture1) this.read.get(str);
            if (imageCapture1 == null) {
                throw new IllegalArgumentException("Invalid camera: " + str);
            }
        }
        return imageCapture1;
    }
}
