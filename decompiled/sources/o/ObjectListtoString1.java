package o;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectListtoString1 {
    public static final Object IconCompatParcelizer = new Object();
    public static ObjectListtoString1 write;
    public androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator serializer;
    public final Object MediaSessionCompatQueueItem = new Object();
    public final HashMap RemoteActionCompatParcelizer = new HashMap();
    public final HashMap MediaBrowserCompatMediaItem = new HashMap();
    public final ArrayDeque read = new ArrayDeque();

    public final maxIntrinsicHeight IconCompatParcelizer(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter) {
        synchronized (this.MediaSessionCompatQueueItem) {
            coil3.util.UtilsKt.IconCompatParcelizer("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.RemoteActionCompatParcelizer.get(new AnimatedContentMeasurePolicy(System.identityHashCode(accessisrendernodecompatiblecp), cameraUseCaseAdapter.write)) == null);
            maxIntrinsicHeight maxintrinsicheight = new maxIntrinsicHeight(accessisrendernodecompatiblecp, cameraUseCaseAdapter);
            if (((ArrayList) cameraUseCaseAdapter.serializer()).isEmpty()) {
                maxintrinsicheight.RemoteActionCompatParcelizer();
            }
            if (((accessregisterComponentCallback) accessisrendernodecompatiblecp.getLifecycle()).RatingCompat == toColorLong8_81llA.DESTROYED) {
                return maxintrinsicheight;
            }
            IconCompatParcelizer(maxintrinsicheight);
            return maxintrinsicheight;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0015 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x0023, B:13:0x0038, B:15:0x0042, B:16:0x004a, B:17:0x0052), top: B:22:0x0005 }] */
    public final void IconCompatParcelizer(androidx.camera.core.LegacySessionConfig legacySessionConfig, HashSet hashSet) {
        boolean zIsEmpty;
        Set<AnimatedContentMeasurePolicy> setKeySet = hashSet;
        synchronized (this.MediaSessionCompatQueueItem) {
            if (hashSet == null) {
                setKeySet = this.RemoteActionCompatParcelizer.keySet();
                for (AnimatedContentMeasurePolicy animatedContentMeasurePolicy : setKeySet) {
                    if (this.RemoteActionCompatParcelizer.containsKey(animatedContentMeasurePolicy)) {
                        maxIntrinsicHeight maxintrinsicheight = (maxIntrinsicHeight) this.RemoteActionCompatParcelizer.get(animatedContentMeasurePolicy);
                        zIsEmpty = maxintrinsicheight.IconCompatParcelizer().isEmpty();
                        maxintrinsicheight.write(legacySessionConfig);
                        if (zIsEmpty && maxintrinsicheight.IconCompatParcelizer().isEmpty()) {
                            write(maxintrinsicheight.write());
                        }
                    } else {
                        setInflatedId.read("LifecycleCameraRepository", "Attempt to unbind use cases from an invalid camera.");
                    }
                }
            } else {
                while (r5.hasNext()) {
                    if (this.RemoteActionCompatParcelizer.containsKey(animatedContentMeasurePolicy)) {
                        maxIntrinsicHeight maxintrinsicheight2 = (maxIntrinsicHeight) this.RemoteActionCompatParcelizer.get(animatedContentMeasurePolicy);
                        zIsEmpty = maxintrinsicheight2.IconCompatParcelizer().isEmpty();
                        maxintrinsicheight2.write(legacySessionConfig);
                        if (zIsEmpty) {
                        }
                    } else {
                        setInflatedId.read("LifecycleCameraRepository", "Attempt to unbind use cases from an invalid camera.");
                    }
                }
            }
            throw th;
        }
    }

    public final void IconCompatParcelizer(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        synchronized (this.MediaSessionCompatQueueItem) {
            if (serializer(accessisrendernodecompatiblecp)) {
                if (this.read.isEmpty()) {
                    this.read.push(accessisrendernodecompatiblecp);
                } else {
                    androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator camera2CameraCoordinator = this.serializer;
                    if (camera2CameraCoordinator == null || camera2CameraCoordinator.IconCompatParcelizer() != 2) {
                        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp2 = (accessisRenderNodeCompatiblecp) this.read.peek();
                        if (!accessisrendernodecompatiblecp.equals(accessisrendernodecompatiblecp2)) {
                            read(accessisrendernodecompatiblecp2);
                            this.read.remove(accessisrendernodecompatiblecp);
                            this.read.push(accessisrendernodecompatiblecp);
                        }
                    }
                }
                MediaMetadataCompat(accessisrendernodecompatiblecp);
            }
        }
    }

    public final void IconCompatParcelizer(maxIntrinsicHeight maxintrinsicheight) {
        synchronized (this.MediaSessionCompatQueueItem) {
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecpWrite = maxintrinsicheight.write();
            AnimatedContentMeasurePolicy animatedContentMeasurePolicy = new AnimatedContentMeasurePolicy(System.identityHashCode(accessisrendernodecompatiblecpWrite), maxintrinsicheight.RemoteActionCompatParcelizer.write);
            AnimatedContent animatedContentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(accessisrendernodecompatiblecpWrite);
            Set hashSet = animatedContentRemoteActionCompatParcelizer != null ? (Set) this.MediaBrowserCompatMediaItem.get(animatedContentRemoteActionCompatParcelizer) : new HashSet();
            hashSet.add(animatedContentMeasurePolicy);
            this.RemoteActionCompatParcelizer.put(animatedContentMeasurePolicy, maxintrinsicheight);
            if (animatedContentRemoteActionCompatParcelizer == null) {
                AnimatedContent animatedContent = new AnimatedContent(accessisrendernodecompatiblecpWrite, this);
                this.MediaBrowserCompatMediaItem.put(animatedContent, hashSet);
                accessisrendernodecompatiblecpWrite.getLifecycle().IconCompatParcelizer(animatedContent);
            }
        }
    }

    public final void MediaMetadataCompat(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        synchronized (this.MediaSessionCompatQueueItem) {
            Iterator it = ((Set) this.MediaBrowserCompatMediaItem.get(RemoteActionCompatParcelizer(accessisrendernodecompatiblecp))).iterator();
            while (it.hasNext()) {
                maxIntrinsicHeight maxintrinsicheight = (maxIntrinsicHeight) this.RemoteActionCompatParcelizer.get((AnimatedContentMeasurePolicy) it.next());
                maxintrinsicheight.getClass();
                if (!maxintrinsicheight.IconCompatParcelizer().isEmpty()) {
                    maxintrinsicheight.read();
                }
            }
        }
    }

    public final void RatingCompat(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        synchronized (this.MediaSessionCompatQueueItem) {
            AnimatedContent animatedContentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(accessisrendernodecompatiblecp);
            if (animatedContentRemoteActionCompatParcelizer == null) {
                return;
            }
            write(accessisrendernodecompatiblecp);
            Iterator it = ((Set) this.MediaBrowserCompatMediaItem.get(animatedContentRemoteActionCompatParcelizer)).iterator();
            while (it.hasNext()) {
                this.RemoteActionCompatParcelizer.remove((AnimatedContentMeasurePolicy) it.next());
            }
            this.MediaBrowserCompatMediaItem.remove(animatedContentRemoteActionCompatParcelizer);
            animatedContentRemoteActionCompatParcelizer.serializer.getLifecycle().read(animatedContentRemoteActionCompatParcelizer);
        }
    }

    public final AnimatedContent RemoteActionCompatParcelizer(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        synchronized (this.MediaSessionCompatQueueItem) {
            for (AnimatedContent animatedContent : this.MediaBrowserCompatMediaItem.keySet()) {
                if (accessisrendernodecompatiblecp.equals(animatedContent.serializer)) {
                    return animatedContent;
                }
            }
            return null;
        }
    }

    public final void RemoteActionCompatParcelizer(maxIntrinsicHeight maxintrinsicheight) {
        synchronized (this.MediaSessionCompatQueueItem) {
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecpWrite = maxintrinsicheight.write();
            AnimatedContentMeasurePolicy animatedContentMeasurePolicy = new AnimatedContentMeasurePolicy(System.identityHashCode(accessisrendernodecompatiblecpWrite), maxintrinsicheight.RemoteActionCompatParcelizer.write);
            this.RemoteActionCompatParcelizer.remove(animatedContentMeasurePolicy);
            HashSet hashSet = new HashSet();
            for (AnimatedContent animatedContent : this.MediaBrowserCompatMediaItem.keySet()) {
                if (accessisrendernodecompatiblecpWrite.equals(animatedContent.serializer)) {
                    Set set = (Set) this.MediaBrowserCompatMediaItem.get(animatedContent);
                    set.remove(animatedContentMeasurePolicy);
                    if (set.isEmpty()) {
                        hashSet.add(animatedContent.serializer);
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                RatingCompat((accessisRenderNodeCompatiblecp) it.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0090 A[Catch: all -> 0x009c, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x001c, B:8:0x001e, B:10:0x002a, B:35:0x007d, B:36:0x0080, B:38:0x0090, B:39:0x0093, B:42:0x0096, B:43:0x009b, B:12:0x0031, B:13:0x0035, B:15:0x003b, B:17:0x0052, B:19:0x005c, B:20:0x005e, B:27:0x006a, B:29:0x006e, B:30:0x0072, B:31:0x0079, B:34:0x007c, B:21:0x005f, B:25:0x0067, B:24:0x0065), top: B:51:0x0003, inners: #0, #1 }] */
    public final void RemoteActionCompatParcelizer(maxIntrinsicHeight maxintrinsicheight, androidx.camera.core.LegacySessionConfig legacySessionConfig, androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator camera2CameraCoordinator) {
        boolean z;
        synchronized (this.MediaSessionCompatQueueItem) {
            coil3.util.UtilsKt.serializer(!((List) legacySessionConfig.RatingCompat).isEmpty());
            this.serializer = camera2CameraCoordinator;
            accessisRenderNodeCompatiblecp accessisrendernodecompatiblecpWrite = maxintrinsicheight.write();
            AnimatedContent animatedContentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(accessisrendernodecompatiblecpWrite);
            if (animatedContentRemoteActionCompatParcelizer == null) {
                return;
            }
            Set set = (Set) this.MediaBrowserCompatMediaItem.get(animatedContentRemoteActionCompatParcelizer);
            androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator camera2CameraCoordinator2 = this.serializer;
            if (camera2CameraCoordinator2 != null && camera2CameraCoordinator2.IconCompatParcelizer() == 2) {
                maxintrinsicheight.read(legacySessionConfig);
                if (((accessregisterComponentCallback) accessisrendernodecompatiblecpWrite.getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                    IconCompatParcelizer(accessisrendernodecompatiblecpWrite);
                }
                return;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                maxIntrinsicHeight maxintrinsicheight2 = (maxIntrinsicHeight) this.RemoteActionCompatParcelizer.get((AnimatedContentMeasurePolicy) it.next());
                maxintrinsicheight2.getClass();
                if (!maxintrinsicheight2.equals(maxintrinsicheight) && !maxintrinsicheight2.IconCompatParcelizer().isEmpty()) {
                    synchronized (maxintrinsicheight2.read) {
                        androidx.camera.core.LegacySessionConfig legacySessionConfig2 = maxintrinsicheight2.write;
                        z = legacySessionConfig2 == null ? false : legacySessionConfig2.serializer;
                    }
                    if (z || legacySessionConfig.serializer) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                    }
                    maxintrinsicheight2.serializer();
                }
            }
            try {
                maxintrinsicheight.read(legacySessionConfig);
                if (((accessregisterComponentCallback) accessisrendernodecompatiblecpWrite.getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                    IconCompatParcelizer(accessisrendernodecompatiblecpWrite);
                }
                return;
            } catch (androidx.camera.core.internal.CameraUseCaseAdapter.CameraException e) {
                throw new IllegalArgumentException(e);
            }
            throw th;
        }
    }

    public final void read(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        synchronized (this.MediaSessionCompatQueueItem) {
            AnimatedContent animatedContentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(accessisrendernodecompatiblecp);
            if (animatedContentRemoteActionCompatParcelizer == null) {
                return;
            }
            Iterator it = ((Set) this.MediaBrowserCompatMediaItem.get(animatedContentRemoteActionCompatParcelizer)).iterator();
            while (it.hasNext()) {
                maxIntrinsicHeight maxintrinsicheight = (maxIntrinsicHeight) this.RemoteActionCompatParcelizer.get((AnimatedContentMeasurePolicy) it.next());
                maxintrinsicheight.getClass();
                maxintrinsicheight.RemoteActionCompatParcelizer();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0025 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x000f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0015 A[Catch: all -> 0x0032, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000b, B:7:0x000f, B:9:0x0015, B:11:0x0025, B:12:0x0030), top: B:17:0x0005 }] */
    public final void serializer(HashSet hashSet) {
        Iterator it;
        maxIntrinsicHeight maxintrinsicheight;
        Set setKeySet = hashSet;
        synchronized (this.MediaSessionCompatQueueItem) {
            if (hashSet == null) {
                setKeySet = this.RemoteActionCompatParcelizer.keySet();
                it = setKeySet.iterator();
                while (it.hasNext()) {
                    maxintrinsicheight = (maxIntrinsicHeight) this.RemoteActionCompatParcelizer.get((AnimatedContentMeasurePolicy) it.next());
                    if (maxintrinsicheight != null) {
                        maxintrinsicheight.serializer();
                        write(maxintrinsicheight.write());
                    }
                }
            } else {
                it = setKeySet.iterator();
                while (it.hasNext()) {
                    maxintrinsicheight = (maxIntrinsicHeight) this.RemoteActionCompatParcelizer.get((AnimatedContentMeasurePolicy) it.next());
                    if (maxintrinsicheight != null) {
                        maxintrinsicheight.serializer();
                        write(maxintrinsicheight.write());
                    }
                }
            }
            throw th;
        }
    }

    public final boolean serializer(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        synchronized (this.MediaSessionCompatQueueItem) {
            AnimatedContent animatedContentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(accessisrendernodecompatiblecp);
            if (animatedContentRemoteActionCompatParcelizer == null) {
                return false;
            }
            Iterator it = ((Set) this.MediaBrowserCompatMediaItem.get(animatedContentRemoteActionCompatParcelizer)).iterator();
            while (it.hasNext()) {
                maxIntrinsicHeight maxintrinsicheight = (maxIntrinsicHeight) this.RemoteActionCompatParcelizer.get((AnimatedContentMeasurePolicy) it.next());
                maxintrinsicheight.getClass();
                if (!maxintrinsicheight.IconCompatParcelizer().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void write(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        synchronized (this.MediaSessionCompatQueueItem) {
            this.read.remove(accessisrendernodecompatiblecp);
            read(accessisrendernodecompatiblecp);
            if (!this.read.isEmpty()) {
                MediaMetadataCompat((accessisRenderNodeCompatiblecp) this.read.peek());
            }
        }
    }
}
