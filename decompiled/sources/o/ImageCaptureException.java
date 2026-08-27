package o;

import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureException {
    public androidx.camera.core.impl.CameraRepository IconCompatParcelizer;
    public setSelector MediaSessionCompatToken;
    public androidx.camera.camera2.internal.Camera2CameraFactory RemoteActionCompatParcelizer;
    public final Executor serializer;
    public final Object RatingCompat = new Object();
    public final SizeAnimationModifierNodemeasure2 MediaBrowserCompatMediaItem = new SizeAnimationModifierNodemeasure2(1, this);
    public volatile List read = instance_delegatelambda0.write;
    public final AtomicBoolean MediaMetadataCompat = new AtomicBoolean(false);
    public final CopyOnWriteArrayList MediaDescriptionCompat = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList MediaSessionCompatQueueItem = new CopyOnWriteArrayList();
    public final LinkedHashMap write = new LinkedHashMap();

    public final void serializer(Set set, Set set2) {
        boolean zIsEmpty = set.isEmpty();
        CopyOnWriteArrayList copyOnWriteArrayList = this.MediaSessionCompatQueueItem;
        if (!zIsEmpty) {
            set.size();
            setInflatedId.IconCompatParcelizer(4, "CameraPresencePrvdr");
            Iterator it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        set2.size();
        setInflatedId.IconCompatParcelizer(4, "CameraPresencePrvdr");
        Iterator it2 = copyOnWriteArrayList.iterator();
        if (it2.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it2);
        }
    }

    public final void IconCompatParcelizer(String str) {
        synchronized (this.RatingCompat) {
            unregisterComponentCallback unregistercomponentcallback = (unregisterComponentCallback) this.write.remove(str);
            androidx.camera.core.impl.CameraRepository cameraRepository = this.IconCompatParcelizer;
            if (unregistercomponentcallback != null && cameraRepository != null) {
                try {
                    removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(cameraRepository.write(str), 23, unregistercomponentcallback));
                    setInflatedId.IconCompatParcelizer(3, "CameraPresencePrvdr");
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public ImageCaptureException(Executor executor) {
        this.serializer = executor;
    }

    public final void read(androidx.camera.camera2.internal.Camera2CameraFactory camera2CameraFactory, androidx.camera.core.impl.CameraRepository cameraRepository) {
        camera2CameraFactory.getClass();
        cameraRepository.getClass();
        if (this.MediaMetadataCompat.compareAndSet(false, true)) {
            setInflatedId.IconCompatParcelizer(4, "CameraPresencePrvdr");
            LinkedHashSet<String> linkedHashSetIconCompatParcelizer = camera2CameraFactory.IconCompatParcelizer();
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(linkedHashSetIconCompatParcelizer, 10));
            for (String str : linkedHashSetIconCompatParcelizer) {
                str.getClass();
                int iSerializer = getQueryParameterslambda2.serializer();
                int iSerializer2 = getQueryParameterslambda2.serializer();
                arrayList.add(new getNavButtonView((ArrayList) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new String[]{str}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer), null));
            }
            this.read = arrayList;
            this.RemoteActionCompatParcelizer = camera2CameraFactory;
            this.IconCompatParcelizer = cameraRepository;
            setSelector setselector = camera2CameraFactory.MediaMetadataCompat;
            this.MediaSessionCompatToken = setselector;
            if (setselector != null) {
                setselector.serializer(this.serializer, this.MediaBrowserCompatMediaItem);
            }
        }
    }

    public final void serializer() {
        if (!this.MediaMetadataCompat.getAndSet(false)) {
            setInflatedId.IconCompatParcelizer(3, "CameraPresencePrvdr");
            return;
        }
        setInflatedId.IconCompatParcelizer(4, "CameraPresencePrvdr");
        setSelector setselector = this.MediaSessionCompatToken;
        if (setselector != null) {
            setselector.write(this.MediaBrowserCompatMediaItem);
        }
        synchronized (this.RatingCompat) {
            if (!this.write.isEmpty()) {
                Map mapSerializer = onMove.serializer(this.write);
                this.write.clear();
                androidx.camera.core.impl.CameraRepository cameraRepository = this.IconCompatParcelizer;
                if (cameraRepository != null) {
                    LinkedHashSet linkedHashSetSerializer = cameraRepository.serializer();
                    ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(linkedHashSetSerializer, 10));
                    Iterator it = linkedHashSetSerializer.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ImageCapture1) it.next()).MediaMetadataCompat());
                    }
                    mapSerializer.size();
                    setInflatedId.IconCompatParcelizer(3, "CameraPresencePrvdr");
                    ArrayList arrayList2 = new ArrayList(mapSerializer.size());
                    for (Map.Entry entry : mapSerializer.entrySet()) {
                        String str = (String) entry.getKey();
                        removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new WorkerKt$$ExternalSyntheticLambda2(arrayList, (unregisterComponentCallback) entry.getValue(), str, 6));
                        arrayList2.add(createFromParcel.INSTANCE);
                    }
                }
            }
        }
        this.MediaDescriptionCompat.clear();
        this.MediaSessionCompatQueueItem.clear();
        this.read = instance_delegatelambda0.write;
        this.RemoteActionCompatParcelizer = null;
        this.IconCompatParcelizer = null;
    }

    public final void write(FocusMeteringAction focusMeteringAction) {
        final String str = focusMeteringAction.read();
        str.getClass();
        if (this.MediaMetadataCompat.get()) {
            synchronized (this.RatingCompat) {
                if (this.write.containsKey(str)) {
                    return;
                }
                unregisterComponentCallback unregistercomponentcallback = new unregisterComponentCallback() { // from class: o.ImageProcessingUtil
                    @Override // o.unregisterComponentCallback
                    public final void RemoteActionCompatParcelizer(Object obj) {
                        getCurrentMenuItems getcurrentmenuitems = (getCurrentMenuItems) obj;
                        ImageCaptureException imageCaptureException = this.write;
                        if (!imageCaptureException.MediaMetadataCompat.get()) {
                            setInflatedId.IconCompatParcelizer(3, "CameraPresencePrvdr");
                            return;
                        }
                        if ((getcurrentmenuitems != null ? getcurrentmenuitems.IconCompatParcelizer : null) == null) {
                            if ((getcurrentmenuitems != null ? getcurrentmenuitems.read : null) != getLogo.CLOSED) {
                                return;
                            }
                        }
                        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Camera ", str, " state changed to ");
                        sbM.append(getcurrentmenuitems.read);
                        sbM.append(" with error: ");
                        Toolbar toolbar = getcurrentmenuitems.IconCompatParcelizer;
                        sbM.append(toolbar != null ? Integer.valueOf(toolbar.write) : null);
                        sbM.append(". Triggering refresh.");
                        setInflatedId.read("CameraPresencePrvdr", sbM.toString());
                        setSelector setselector = imageCaptureException.MediaSessionCompatToken;
                        if (setselector != null) {
                            setselector.RemoteActionCompatParcelizer();
                        }
                    }
                };
                removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new CameraX$$ExternalSyntheticLambda2(focusMeteringAction, 24, unregistercomponentcallback));
                this.write.put(str, unregistercomponentcallback);
                setInflatedId.IconCompatParcelizer(3, "CameraPresencePrvdr");
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        androidx.camera.core.impl.CameraRepository cameraRepository = this.IconCompatParcelizer;
        if (cameraRepository == null) {
            return;
        }
        try {
            FocusMeteringAction focusMeteringActionMediaMetadataCompat = cameraRepository.write(str).MediaMetadataCompat();
            focusMeteringActionMediaMetadataCompat.getClass();
            write(focusMeteringActionMediaMetadataCompat);
        } catch (IllegalArgumentException unused) {
            setInflatedId.read("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }
}
