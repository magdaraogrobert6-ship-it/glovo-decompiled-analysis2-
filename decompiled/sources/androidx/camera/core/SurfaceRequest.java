package androidx.camera.core;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.google.android.gms.net.zza;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.Camera2CameraFactory;
import o.Camera2CameraImpl;
import o.Camera2ConfigDefaultProvider;
import o.Camera2ConfigExternalSyntheticLambda1;
import o.DrawModifierNodeKt;
import o.FocusOwnerImplmodifier1;
import o.ImageCapture1;
import o.SmallDisplaySizeQuirk;
import o.VideoQualityQuirk;
import o.accessgetSubCompositionViewjd;
import o.getCollapseContentDescription;
import o.getNavigationIcon;
import o.getVisibilityRampUpAnimationDurationMillis;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.setContentDrawScopeui;
import o.valueOf;

/* JADX INFO: loaded from: classes.dex */
public final class SurfaceRequest {
    public static final Range serializer = SmallDisplaySizeQuirk.RemoteActionCompatParcelizer;
    public final getNavigationIcon IconCompatParcelizer;
    public final onDrawWithContent MediaBrowserCompatMediaItem;
    public final Object MediaDescriptionCompat = new Object();
    public final onDrawBehind MediaMetadataCompat;
    public final Size MediaSessionCompatQueueItem;
    public getCollapseContentDescription MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public final onDrawWithContent ParcelableVolumeInfo;
    public final onDrawWithContent PlaybackStateCompat;
    public final onDrawBehind PlaybackStateCompatCustomAction;
    public final boolean RatingCompat;
    public final ImageCapture1 RemoteActionCompatParcelizer;
    public Camera2CameraImpl ResultReceiver;
    public Executor r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final Range read;
    public final Camera2CameraFactory write;

    public final void IconCompatParcelizer(Executor executor, Camera2CameraImpl camera2CameraImpl) {
        getCollapseContentDescription getcollapsecontentdescription;
        synchronized (this.MediaDescriptionCompat) {
            this.ResultReceiver = camera2CameraImpl;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = executor;
            getcollapsecontentdescription = this.MediaSessionCompatResultReceiverWrapper;
        }
        if (getcollapsecontentdescription != null) {
            executor.execute(new Camera2ConfigExternalSyntheticLambda1(camera2CameraImpl, getcollapsecontentdescription, 1));
        }
    }

    public final boolean write() {
        return this.PlaybackStateCompatCustomAction.serializer.isDone();
    }

    public final boolean RemoteActionCompatParcelizer() {
        final String str = "Surface request will not complete.";
        return this.PlaybackStateCompat.serializer(new Exception(str) { // from class: androidx.camera.core.impl.DeferrableSurface$SurfaceUnavailableException
        });
    }

    public SurfaceRequest(Size size, ImageCapture1 imageCapture1, boolean z, getNavigationIcon getnavigationicon, int i, Range range, getVisibilityRampUpAnimationDurationMillis getvisibilityrampupanimationdurationmillis) {
        this.MediaSessionCompatQueueItem = size;
        this.RemoteActionCompatParcelizer = imageCapture1;
        this.RatingCompat = z;
        UtilsKt.IconCompatParcelizer("SurfaceRequest's DynamicRange must always be fully specified.", getnavigationicon.serializer());
        this.IconCompatParcelizer = getnavigationicon;
        this.MediaSessionCompatToken = i;
        this.read = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            atomicReference.set(ondrawwithcontent);
            ondrawwithcontent.RemoteActionCompatParcelizer = str.concat("-cancellation");
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        onDrawWithContent ondrawwithcontent2 = (onDrawWithContent) atomicReference.get();
        ondrawwithcontent2.getClass();
        this.MediaBrowserCompatMediaItem = ondrawwithcontent2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        onDrawWithContent ondrawwithcontent3 = new onDrawWithContent();
        ondrawwithcontent3.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind2 = new onDrawBehind(ondrawwithcontent3);
        ondrawwithcontent3.read = ondrawbehind2;
        ondrawwithcontent3.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            atomicReference2.set(ondrawwithcontent3);
            ondrawwithcontent3.RemoteActionCompatParcelizer = str.concat("-status");
        } catch (Exception e2) {
            ondrawbehind2.write(e2);
        }
        this.MediaMetadataCompat = ondrawbehind2;
        int i2 = 1;
        ondrawbehind2.RemoteActionCompatParcelizer(new zza(ondrawbehind2, i2, new valueOf(ondrawwithcontent2, 0, ondrawbehind)), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        onDrawWithContent ondrawwithcontent4 = (onDrawWithContent) atomicReference2.get();
        ondrawwithcontent4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        onDrawWithContent ondrawwithcontent5 = new onDrawWithContent();
        ondrawwithcontent5.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind3 = new onDrawBehind(ondrawwithcontent5);
        ondrawwithcontent5.read = ondrawbehind3;
        ondrawwithcontent5.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            atomicReference3.set(ondrawwithcontent5);
            ondrawwithcontent5.RemoteActionCompatParcelizer = str.concat("-Surface");
        } catch (Exception e3) {
            ondrawbehind3.write(e3);
        }
        this.PlaybackStateCompatCustomAction = ondrawbehind3;
        onDrawWithContent ondrawwithcontent6 = (onDrawWithContent) atomicReference3.get();
        ondrawwithcontent6.getClass();
        this.PlaybackStateCompat = ondrawwithcontent6;
        Camera2CameraFactory camera2CameraFactory = new Camera2CameraFactory(this, size);
        this.write = camera2CameraFactory;
        DrawModifierNodeKt drawModifierNodeKtWrite = VideoQualityQuirk.write((DrawModifierNodeKt) camera2CameraFactory.ParcelableVolumeInfo);
        ondrawbehind3.RemoteActionCompatParcelizer(new zza(ondrawbehind3, i2, new UseCaseGroup(drawModifierNodeKtWrite, ondrawwithcontent4, str)), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        drawModifierNodeKtWrite.RemoteActionCompatParcelizer(new Camera2ConfigDefaultProvider(this, 0), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        accessgetSubCompositionViewjd accessgetsubcompositionviewjd = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read();
        AtomicReference atomicReference4 = new AtomicReference(null);
        onDrawBehind ondrawbehindRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 4, atomicReference4));
        ondrawbehindRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new zza(ondrawbehindRemoteActionCompatParcelizer, i2, new ImageCapture$1(28, getvisibilityrampupanimationdurationmillis)), accessgetsubcompositionviewjd);
        onDrawWithContent ondrawwithcontent7 = (onDrawWithContent) atomicReference4.get();
        ondrawwithcontent7.getClass();
        this.ParcelableVolumeInfo = ondrawwithcontent7;
    }

    public final void write(final Surface surface, Executor executor, final FocusOwnerImplmodifier1 focusOwnerImplmodifier1) {
        if (!surface.isValid()) {
            final int i = 0;
            executor.execute(new Runnable() { // from class: o.AndroidRZoomImpl
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    Surface surface2 = surface;
                    FocusOwnerImplmodifier1 focusOwnerImplmodifier2 = focusOwnerImplmodifier1;
                    if (i2 == 0) {
                        focusOwnerImplmodifier2.accept(new getContentInsetLeft(2, surface2));
                    } else if (i2 != 1) {
                        focusOwnerImplmodifier2.accept(new getContentInsetLeft(4, surface2));
                    } else {
                        focusOwnerImplmodifier2.accept(new getContentInsetLeft(3, surface2));
                    }
                }
            });
            return;
        }
        final int i2 = 1;
        final int i3 = 2;
        if (!this.PlaybackStateCompat.RemoteActionCompatParcelizer(surface)) {
            onDrawBehind ondrawbehind = this.PlaybackStateCompatCustomAction;
            if (!ondrawbehind.isCancelled()) {
                UtilsKt.RemoteActionCompatParcelizer((String) null, ondrawbehind.serializer.isDone());
                try {
                    ondrawbehind.get();
                    executor.execute(new Runnable() { // from class: o.AndroidRZoomImpl
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            Surface surface2 = surface;
                            FocusOwnerImplmodifier1 focusOwnerImplmodifier2 = focusOwnerImplmodifier1;
                            if (i4 == 0) {
                                focusOwnerImplmodifier2.accept(new getContentInsetLeft(2, surface2));
                            } else if (i4 != 1) {
                                focusOwnerImplmodifier2.accept(new getContentInsetLeft(4, surface2));
                            } else {
                                focusOwnerImplmodifier2.accept(new getContentInsetLeft(3, surface2));
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new Runnable() { // from class: o.AndroidRZoomImpl
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            Surface surface2 = surface;
                            FocusOwnerImplmodifier1 focusOwnerImplmodifier2 = focusOwnerImplmodifier1;
                            if (i4 == 0) {
                                focusOwnerImplmodifier2.accept(new getContentInsetLeft(2, surface2));
                            } else if (i4 != 1) {
                                focusOwnerImplmodifier2.accept(new getContentInsetLeft(4, surface2));
                            } else {
                                focusOwnerImplmodifier2.accept(new getContentInsetLeft(3, surface2));
                            }
                        }
                    });
                    return;
                }
            }
        }
        valueOf valueof = new valueOf(focusOwnerImplmodifier1, i3, surface);
        onDrawBehind ondrawbehind2 = this.MediaMetadataCompat;
        ondrawbehind2.RemoteActionCompatParcelizer(new zza(ondrawbehind2, i2, valueof), executor);
    }

    public final class RequestCancelledException extends RuntimeException {
        public RequestCancelledException(String str, Throwable th) {
            super(str, th);
        }
    }
}
