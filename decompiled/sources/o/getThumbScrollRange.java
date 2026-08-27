package o;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.ImageCapture$Metadata;
import androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda3;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import com.google.firebase.firestore.core.FirestoreClient$$ExternalSyntheticLambda1;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class getThumbScrollRange extends getThumbOffset {
    public setDividerDrawable IconCompatParcelizer;
    public final PreviewFreezeAfterHighSpeedRecordingQuirk MediaBrowserCompatMediaItem;
    public final ImageCapture$1 MediaMetadataCompat;
    public PendingValue MediaSessionCompatResultReceiverWrapper;
    public onDrawBehind ParcelableVolumeInfo;
    public onDrawWithContent PlaybackStateCompatCustomAction;
    public ArrayList RatingCompat;
    public final androidx.lifecycle.BlockRunner RemoteActionCompatParcelizer;
    public final ReportedVideoQualityNotSupportedQuirk r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final ReportedVideoQualityNotSupportedQuirk r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final setDropDownVerticalOffset r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final ImageCapture$Metadata r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public ImageCapture$1 serializer;
    public final accessgenerateEotf write;
    public final Object MediaSessionCompatToken = new Object();
    public List MediaSessionCompatQueueItem = null;
    public boolean MediaDescriptionCompat = false;
    public boolean ComponentActivity = false;
    public boolean ResultReceiver = false;
    public final Object PlaybackStateCompat = new Object();
    public final AtomicBoolean read = new AtomicBoolean(false);

    public final void write() {
        int i = 0;
        if (!this.read.compareAndSet(false, true)) {
            serializer();
            return;
        }
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer) {
            try {
                serializer();
                coil3.util.UtilsKt.IconCompatParcelizer(this.serializer, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((ImageCapture$1) this.serializer.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).abortCaptures();
            } catch (Exception e) {
                e.toString();
                serializer();
            }
        }
        serializer();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer().RemoteActionCompatParcelizer(new getCompoundPaddingRight(this, i), this.MediaBrowserCompatMediaItem);
    }

    @Override // o.getThumbOffset
    public final void IconCompatParcelizer(getThumbScrollRange getthumbscrollrange) {
        Objects.requireNonNull(this.IconCompatParcelizer);
        this.IconCompatParcelizer.IconCompatParcelizer(getthumbscrollrange);
    }

    public final boolean IconCompatParcelizer() {
        boolean zRemoteActionCompatParcelizer;
        synchronized (this.PlaybackStateCompat) {
            if (RemoteActionCompatParcelizer()) {
                this.write.serializer(this.RatingCompat);
            } else {
                PendingValue pendingValue = this.MediaSessionCompatResultReceiverWrapper;
                if (pendingValue != null) {
                    pendingValue.cancel(true);
                }
            }
            VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk = null;
            try {
                synchronized (this.MediaSessionCompatToken) {
                    if (!this.ComponentActivity) {
                        VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk2 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                        videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk = videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk2 != null ? videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk2 : null;
                        this.ComponentActivity = true;
                    }
                    zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                }
                if (videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk != null) {
                    videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.cancel(true);
                }
            } catch (Throwable th) {
                if (videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk != null) {
                    videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.cancel(true);
                }
                throw th;
            }
        }
        return !zRemoteActionCompatParcelizer;
    }

    @Override // o.getThumbOffset
    public final void MediaBrowserCompatMediaItem(getThumbScrollRange getthumbscrollrange) {
        int i;
        onDrawBehind ondrawbehind;
        synchronized (this.MediaSessionCompatToken) {
            i = 1;
            if (this.ResultReceiver) {
                ondrawbehind = null;
            } else {
                this.ResultReceiver = true;
                coil3.util.UtilsKt.IconCompatParcelizer(this.ParcelableVolumeInfo, "Need to call openCaptureSession before using this API.");
                ondrawbehind = this.ParcelableVolumeInfo;
            }
        }
        if (ondrawbehind != null) {
            ondrawbehind.serializer.RemoteActionCompatParcelizer(new setTextOffInternal(this, getthumbscrollrange, i), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        }
    }

    @Override // o.getThumbOffset
    public final void RatingCompat(getThumbScrollRange getthumbscrollrange) {
        Objects.requireNonNull(this.IconCompatParcelizer);
        this.IconCompatParcelizer.RatingCompat(getthumbscrollrange);
    }

    public final DrawModifierNodeKt RemoteActionCompatParcelizer(ArrayList arrayList) {
        synchronized (this.MediaSessionCompatToken) {
            if (this.ComponentActivity) {
                return new EncoderImplMediaCodecCallback(0, new CancellationException("Opener is disabled"));
            }
            StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkSerializer = VideoQualityQuirk.serializer(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(androidx.camera.core.impl.DeferrableSurfaces.IconCompatParcelizer(arrayList, this.MediaBrowserCompatMediaItem, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY)), new StreamSharing$$ExternalSyntheticLambda0(this, 3, arrayList), this.MediaBrowserCompatMediaItem);
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = stretchedVideoResolutionQuirkSerializer;
            return VideoQualityQuirk.write((DrawModifierNodeKt) stretchedVideoResolutionQuirkSerializer);
        }
    }

    @Override // o.getThumbOffset
    public final void RemoteActionCompatParcelizer(getThumbScrollRange getthumbscrollrange) {
        onDrawBehind ondrawbehind;
        synchronized (this.PlaybackStateCompat) {
            this.write.serializer(this.RatingCompat);
        }
        serializer();
        synchronized (this.MediaSessionCompatToken) {
            if (this.MediaDescriptionCompat) {
                ondrawbehind = null;
            } else {
                this.MediaDescriptionCompat = true;
                coil3.util.UtilsKt.IconCompatParcelizer(this.ParcelableVolumeInfo, "Need to call openCaptureSession before using this API.");
                ondrawbehind = this.ParcelableVolumeInfo;
            }
        }
        synchronized (this.MediaSessionCompatToken) {
            List list = this.MediaSessionCompatQueueItem;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((PreviewExternalSyntheticLambda0) it.next()).serializer();
                }
                this.MediaSessionCompatQueueItem = null;
            }
        }
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer();
        if (ondrawbehind != null) {
            ondrawbehind.serializer.RemoteActionCompatParcelizer(new setTextOffInternal(this, getthumbscrollrange, 0), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        boolean z;
        synchronized (this.MediaSessionCompatToken) {
            z = this.ParcelableVolumeInfo != null;
        }
        return z;
    }

    public final int read(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback captureCallbackIconCompatParcelizer = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer(captureCallback);
        coil3.util.UtilsKt.IconCompatParcelizer(this.serializer, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((ImageCapture$1) this.serializer.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).setSingleRepeatingRequest(captureRequest, this.MediaBrowserCompatMediaItem, captureCallbackIconCompatParcelizer);
    }

    public final ImageCapture$1 read() {
        this.serializer.getClass();
        return this.serializer;
    }

    public final DrawModifierNodeKt read(CameraDevice cameraDevice, setThumbDrawable setthumbdrawable, List list) {
        DrawModifierNodeKt drawModifierNodeKtWrite;
        synchronized (this.PlaybackStateCompat) {
            ArrayList<getThumbScrollRange> arrayList = this.RemoteActionCompatParcelizer.read();
            ArrayList arrayList2 = new ArrayList();
            for (getThumbScrollRange getthumbscrollrange : arrayList) {
                arrayList2.add(coil3.util.UtilsKt.RemoteActionCompatParcelizer(new Futures$$ExternalSyntheticLambda3(getthumbscrollrange.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer(), getthumbscrollrange.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, 1500L, 0)));
            }
            PendingValue pendingValueRemoteActionCompatParcelizer = VideoQualityQuirk.RemoteActionCompatParcelizer(arrayList2);
            this.MediaSessionCompatResultReceiverWrapper = pendingValueRemoteActionCompatParcelizer;
            drawModifierNodeKtWrite = VideoQualityQuirk.write((DrawModifierNodeKt) VideoQualityQuirk.serializer(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(pendingValueRemoteActionCompatParcelizer), new FirestoreClient$$ExternalSyntheticLambda1(this, cameraDevice, setthumbdrawable, list), this.MediaBrowserCompatMediaItem));
        }
        return drawModifierNodeKtWrite;
    }

    @Override // o.getThumbOffset
    public final void serializer(getThumbScrollRange getthumbscrollrange) {
        Objects.requireNonNull(this.IconCompatParcelizer);
        this.IconCompatParcelizer.serializer(getthumbscrollrange);
    }

    @Override // o.getThumbOffset
    public final void write(getThumbScrollRange getthumbscrollrange) {
        getThumbScrollRange getthumbscrollrange2;
        Objects.requireNonNull(this.IconCompatParcelizer);
        synchronized (this.MediaSessionCompatToken) {
            List list = this.MediaSessionCompatQueueItem;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((PreviewExternalSyntheticLambda0) it.next()).serializer();
                }
                this.MediaSessionCompatQueueItem = null;
            }
        }
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer();
        androidx.lifecycle.BlockRunner blockRunner = this.RemoteActionCompatParcelizer;
        Iterator it2 = blockRunner.RatingCompat().iterator();
        while (it2.hasNext() && (getthumbscrollrange2 = (getThumbScrollRange) it2.next()) != this) {
            synchronized (getthumbscrollrange2.MediaSessionCompatToken) {
                List list2 = getthumbscrollrange2.MediaSessionCompatQueueItem;
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((PreviewExternalSyntheticLambda0) it3.next()).serializer();
                    }
                    getthumbscrollrange2.MediaSessionCompatQueueItem = null;
                }
            }
            getthumbscrollrange2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer();
        }
        synchronized (blockRunner.serializer) {
            ((LinkedHashSet) blockRunner.RemoteActionCompatParcelizer).remove(this);
        }
        this.IconCompatParcelizer.write(getthumbscrollrange);
    }

    @Override // o.getThumbOffset
    public final void write(getThumbScrollRange getthumbscrollrange, Surface surface) {
        Objects.requireNonNull(this.IconCompatParcelizer);
        this.IconCompatParcelizer.write(getthumbscrollrange, surface);
    }

    public static void serializer() {
        setInflatedId.IconCompatParcelizer(3, "SyncCaptureSessionImpl");
    }

    @Override // o.getThumbOffset
    public final void read(getThumbScrollRange getthumbscrollrange) {
        ArrayList arrayList;
        getThumbScrollRange getthumbscrollrange2;
        getThumbScrollRange getthumbscrollrange3;
        getThumbScrollRange getthumbscrollrange4;
        serializer();
        ImageCapture$1 imageCapture$1 = this.MediaMetadataCompat;
        androidx.lifecycle.BlockRunner blockRunner = this.RemoteActionCompatParcelizer;
        synchronized (blockRunner.serializer) {
            arrayList = new ArrayList((LinkedHashSet) blockRunner.RemoteActionCompatParcelizer);
        }
        ArrayList arrayList2 = this.RemoteActionCompatParcelizer.read();
        if (((androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk) imageCapture$1.MediaSessionCompatQueueItem) != null) {
            LinkedHashSet<getThumbScrollRange> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (getthumbscrollrange4 = (getThumbScrollRange) it.next()) != getthumbscrollrange) {
                linkedHashSet.add(getthumbscrollrange4);
            }
            for (getThumbScrollRange getthumbscrollrange5 : linkedHashSet) {
                getthumbscrollrange5.getClass();
                getthumbscrollrange5.write(getthumbscrollrange5);
            }
        }
        Objects.requireNonNull(this.IconCompatParcelizer);
        androidx.lifecycle.BlockRunner blockRunner2 = this.RemoteActionCompatParcelizer;
        synchronized (blockRunner2.serializer) {
            ((LinkedHashSet) blockRunner2.RatingCompat).add(this);
            ((LinkedHashSet) blockRunner2.RemoteActionCompatParcelizer).remove(this);
        }
        Iterator it2 = blockRunner2.RatingCompat().iterator();
        while (it2.hasNext() && (getthumbscrollrange3 = (getThumbScrollRange) it2.next()) != this) {
            synchronized (getthumbscrollrange3.MediaSessionCompatToken) {
                List list = getthumbscrollrange3.MediaSessionCompatQueueItem;
                if (list != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((PreviewExternalSyntheticLambda0) it3.next()).serializer();
                    }
                    getthumbscrollrange3.MediaSessionCompatQueueItem = null;
                }
            }
            getthumbscrollrange3.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer();
        }
        this.IconCompatParcelizer.read(getthumbscrollrange);
        if (((androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk) imageCapture$1.MediaSessionCompatQueueItem) != null) {
            LinkedHashSet<getThumbScrollRange> linkedHashSet2 = new LinkedHashSet();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext() && (getthumbscrollrange2 = (getThumbScrollRange) it4.next()) != getthumbscrollrange) {
                linkedHashSet2.add(getthumbscrollrange2);
            }
            for (getThumbScrollRange getthumbscrollrange6 : linkedHashSet2) {
                getthumbscrollrange6.getClass();
                getthumbscrollrange6.RemoteActionCompatParcelizer(getthumbscrollrange6);
            }
        }
    }

    public final int RemoteActionCompatParcelizer(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        coil3.util.UtilsKt.IconCompatParcelizer(this.serializer, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((ImageCapture$1) this.serializer.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem).setRepeatingBurstRequests(list, this.MediaBrowserCompatMediaItem, captureCallback);
    }

    public getThumbScrollRange(u$a u_a, u$a u_a2, androidx.lifecycle.BlockRunner blockRunner, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk, Handler handler) {
        this.RemoteActionCompatParcelizer = blockRunner;
        this.MediaBrowserCompatMediaItem = previewFreezeAfterHighSpeedRecordingQuirk;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = reportedVideoQualityNotSupportedQuirk;
        accessgenerateEotf accessgenerateeotf = new accessgenerateEotf();
        accessgenerateeotf.IconCompatParcelizer = u_a2.RemoteActionCompatParcelizer(androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk.class);
        accessgenerateeotf.write = u_a.RemoteActionCompatParcelizer(androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk.class);
        accessgenerateeotf.read = u_a.RemoteActionCompatParcelizer(androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.write = accessgenerateeotf;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new setDropDownVerticalOffset(u_a.RemoteActionCompatParcelizer(androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk.class) || u_a.RemoteActionCompatParcelizer(androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk.class));
        this.MediaMetadataCompat = new ImageCapture$1(u_a2, 19);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new ImageCapture$Metadata(u_a2, 1);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = reportedVideoQualityNotSupportedQuirk;
    }

    public final void serializer(CameraCaptureSession cameraCaptureSession) {
        if (this.serializer == null) {
            this.serializer = new ImageCapture$1(cameraCaptureSession, 10);
        }
    }
}
