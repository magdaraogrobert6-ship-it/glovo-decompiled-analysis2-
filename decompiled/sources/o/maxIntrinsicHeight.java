package o;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class maxIntrinsicHeight implements accessclearShadowCache, getContentInsetStart {
    public final accessisRenderNodeCompatiblecp IconCompatParcelizer;
    public final androidx.camera.core.internal.CameraUseCaseAdapter RemoteActionCompatParcelizer;
    public final Object read = new Object();
    public boolean serializer = false;
    public androidx.camera.core.LegacySessionConfig write = null;

    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_PAUSE)
    public void onPause(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem.IconCompatParcelizer(false);
    }

    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_RESUME)
    public void onResume(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem.IconCompatParcelizer(true);
    }

    public final List IconCompatParcelizer() {
        List listUnmodifiableList;
        synchronized (this.read) {
            listUnmodifiableList = Collections.unmodifiableList(this.RemoteActionCompatParcelizer.serializer());
        }
        return listUnmodifiableList;
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this.read) {
            if (this.serializer) {
                return;
            }
            onStop(this.IconCompatParcelizer);
            this.serializer = true;
        }
    }

    @Override // o.getContentInsetStart
    public final FocusMeteringAction ResultReceiver() {
        return this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem.read;
    }

    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_DESTROY)
    public void onDestroy(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        synchronized (this.read) {
            androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter = this.RemoteActionCompatParcelizer;
            cameraUseCaseAdapter.IconCompatParcelizer((ArrayList) cameraUseCaseAdapter.serializer());
        }
    }

    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_START)
    public void onStart(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        synchronized (this.read) {
            if (!this.serializer) {
                this.RemoteActionCompatParcelizer.write();
            }
        }
    }

    @AndroidGraphicsContext_androidKt(write = AndroidColorSpace_androidKt.ON_STOP)
    public void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        synchronized (this.read) {
            if (!this.serializer) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // o.getContentInsetStart
    public final ImageCaptureMetadata r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem.serializer;
    }

    public final void read() {
        synchronized (this.read) {
            if (this.serializer) {
                this.serializer = false;
                if (((accessregisterComponentCallback) this.IconCompatParcelizer.getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                    onStart(this.IconCompatParcelizer);
                }
            }
        }
    }

    public final void read(androidx.camera.core.LegacySessionConfig legacySessionConfig) {
        synchronized (this.read) {
            androidx.camera.core.LegacySessionConfig legacySessionConfig2 = this.write;
            if (legacySessionConfig2 == null) {
                this.write = legacySessionConfig;
            } else if (legacySessionConfig.serializer) {
                if (!legacySessionConfig2.serializer) {
                    throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                }
                ArrayList arrayList = new ArrayList((List) this.write.RatingCompat);
                arrayList.addAll((List) legacySessionConfig.RatingCompat);
                this.write = new androidx.camera.core.LegacySessionConfig(arrayList, (CameraIdUtil) legacySessionConfig.MediaDescriptionCompat, (List) legacySessionConfig.write);
            } else {
                if (legacySessionConfig2.serializer) {
                    throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                }
                this.write = legacySessionConfig;
                androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter = this.RemoteActionCompatParcelizer;
                cameraUseCaseAdapter.IconCompatParcelizer((ArrayList) cameraUseCaseAdapter.serializer());
            }
            androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter2 = this.RemoteActionCompatParcelizer;
            CameraIdUtil cameraIdUtil = (CameraIdUtil) legacySessionConfig.MediaDescriptionCompat;
            synchronized (cameraUseCaseAdapter2.PlaybackStateCompat) {
                cameraUseCaseAdapter2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = cameraIdUtil;
            }
            androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter3 = this.RemoteActionCompatParcelizer;
            List list = (List) legacySessionConfig.write;
            synchronized (cameraUseCaseAdapter3.PlaybackStateCompat) {
                cameraUseCaseAdapter3.RatingCompat = list;
            }
            synchronized (this.RemoteActionCompatParcelizer.PlaybackStateCompat) {
            }
            androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter4 = this.RemoteActionCompatParcelizer;
            Range range = (Range) legacySessionConfig.IconCompatParcelizer;
            synchronized (cameraUseCaseAdapter4.PlaybackStateCompat) {
                cameraUseCaseAdapter4.MediaMetadataCompat = range;
            }
            FocusMeteringAction focusMeteringActionResultReceiver = ResultReceiver();
            FocusMeteringAction focusMeteringAction = focusMeteringActionResultReceiver;
            focusMeteringActionResultReceiver.getClass();
            SupportedSurfaceCombination supportedSurfaceCombinationSerializer = com.huawei.hmf.tasks.a.j.serializer(legacySessionConfig, focusMeteringActionResultReceiver);
            ((ReportedVideoQualityNotSupportedQuirk) legacySessionConfig.RemoteActionCompatParcelizer).execute(new Crossfade(supportedSurfaceCombinationSerializer, 12, legacySessionConfig));
            this.RemoteActionCompatParcelizer.IconCompatParcelizer((List) legacySessionConfig.RatingCompat, supportedSurfaceCombinationSerializer);
        }
    }

    public final void serializer() {
        synchronized (this.read) {
            androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter = this.RemoteActionCompatParcelizer;
            cameraUseCaseAdapter.IconCompatParcelizer((ArrayList) cameraUseCaseAdapter.serializer());
            this.write = null;
        }
    }

    public final accessisRenderNodeCompatiblecp write() {
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp;
        synchronized (this.read) {
            accessisrendernodecompatiblecp = this.IconCompatParcelizer;
        }
        return accessisrendernodecompatiblecp;
    }

    public final void write(androidx.camera.core.LegacySessionConfig legacySessionConfig) {
        boolean z;
        boolean z2;
        synchronized (this.read) {
            androidx.camera.core.LegacySessionConfig legacySessionConfig2 = this.write;
            if (legacySessionConfig2 != null && (z = legacySessionConfig2.serializer) == (z2 = legacySessionConfig.serializer)) {
                androidx.camera.core.LegacySessionConfig legacySessionConfig3 = null;
                if (z || z2) {
                    if (z && z2) {
                        ArrayList arrayList = new ArrayList((List) this.write.RatingCompat);
                        arrayList.removeAll((List) legacySessionConfig.RatingCompat);
                        if (!arrayList.isEmpty()) {
                            androidx.camera.core.LegacySessionConfig legacySessionConfig4 = this.write;
                            legacySessionConfig3 = new androidx.camera.core.LegacySessionConfig(arrayList, (CameraIdUtil) legacySessionConfig4.MediaDescriptionCompat, (List) legacySessionConfig4.write);
                        }
                        this.write = legacySessionConfig3;
                    }
                } else if (legacySessionConfig2 != legacySessionConfig) {
                    return;
                } else {
                    this.write = null;
                }
                ArrayList arrayList2 = new ArrayList((List) legacySessionConfig.RatingCompat);
                arrayList2.retainAll(this.RemoteActionCompatParcelizer.serializer());
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(arrayList2);
            }
        }
    }

    public maxIntrinsicHeight(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, androidx.camera.core.internal.CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.IconCompatParcelizer = accessisrendernodecompatiblecp;
        this.RemoteActionCompatParcelizer = cameraUseCaseAdapter;
        if (((accessregisterComponentCallback) accessisrendernodecompatiblecp.getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
            cameraUseCaseAdapter.write();
        } else {
            cameraUseCaseAdapter.RemoteActionCompatParcelizer();
        }
        accessisrendernodecompatiblecp.getLifecycle().IconCompatParcelizer(this);
    }
}
