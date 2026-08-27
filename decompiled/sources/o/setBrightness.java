package o;

import android.util.Range;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class setBrightness {
    public androidx.camera.core.SurfaceRequest MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final android.graphics.Matrix MediaSessionCompatQueueItem;
    public final SmallDisplaySizeQuirk MediaSessionCompatResultReceiverWrapper;
    public SurfaceViewStretchedQuirk MediaSessionCompatToken;
    public int ParcelableVolumeInfo;
    public final int PlaybackStateCompatCustomAction;
    public final int read;
    public final boolean serializer;
    public final android.graphics.Rect write;
    public boolean IconCompatParcelizer = false;
    public final HashSet RatingCompat = new HashSet();
    public boolean RemoteActionCompatParcelizer = false;
    public final ArrayList PlaybackStateCompat = new ArrayList();

    public final androidx.camera.core.SurfaceRequest RemoteActionCompatParcelizer(ImageCapture1 imageCapture1, boolean z) {
        PrematureEndOfStreamVideoQuirk.write();
        write();
        SmallDisplaySizeQuirk smallDisplaySizeQuirk = this.MediaSessionCompatResultReceiverWrapper;
        android.util.Size size = smallDisplaySizeQuirk.MediaMetadataCompat;
        getNavigationIcon getnavigationicon = smallDisplaySizeQuirk.read;
        int i = smallDisplaySizeQuirk.MediaDescriptionCompat;
        Range range = smallDisplaySizeQuirk.IconCompatParcelizer;
        int i2 = 1;
        androidx.camera.core.SurfaceRequest surfaceRequest = new androidx.camera.core.SurfaceRequest(size, imageCapture1, z, getnavigationicon, i, range, new getVisibilityRampUpAnimationDurationMillis(this, 1));
        try {
            Camera2CameraFactory camera2CameraFactory = surfaceRequest.write;
            SurfaceViewStretchedQuirk surfaceViewStretchedQuirk = this.MediaSessionCompatToken;
            Objects.requireNonNull(surfaceViewStretchedQuirk);
            if (surfaceViewStretchedQuirk.IconCompatParcelizer(camera2CameraFactory, new onAnimationEnd(surfaceViewStretchedQuirk, i2))) {
                VideoQualityQuirk.write((DrawModifierNodeKt) surfaceViewStretchedQuirk.ParcelableVolumeInfo).RemoteActionCompatParcelizer(new getContentPaddingBottom(camera2CameraFactory, 0), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
            }
            this.MediaBrowserCompatMediaItem = surfaceRequest;
            RemoteActionCompatParcelizer();
            return surfaceRequest;
        } catch (DeferrableSurface$SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            surfaceRequest.RemoteActionCompatParcelizer();
            throw e2;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        Camera2CameraImpl camera2CameraImpl;
        Executor executor;
        PrematureEndOfStreamVideoQuirk.write();
        getCollapseContentDescription getcollapsecontentdescription = new getCollapseContentDescription(this.write, this.MediaDescriptionCompat, this.ParcelableVolumeInfo, this.serializer, this.MediaSessionCompatQueueItem, this.MediaMetadataCompat);
        androidx.camera.core.SurfaceRequest surfaceRequest = this.MediaBrowserCompatMediaItem;
        if (surfaceRequest != null) {
            synchronized (surfaceRequest.MediaDescriptionCompat) {
                surfaceRequest.MediaSessionCompatResultReceiverWrapper = getcollapsecontentdescription;
                camera2CameraImpl = surfaceRequest.ResultReceiver;
                executor = surfaceRequest.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            }
            if (camera2CameraImpl != null && executor != null) {
                executor.execute(new Camera2ConfigExternalSyntheticLambda1(camera2CameraImpl, getcollapsecontentdescription, 0));
            }
        }
        Iterator it = this.PlaybackStateCompat.iterator();
        while (it.hasNext()) {
            ((FocusOwnerImplmodifier1) it.next()).accept(getcollapsecontentdescription);
        }
    }

    public final void read() {
        PrematureEndOfStreamVideoQuirk.write();
        this.MediaSessionCompatToken.write();
        this.RemoteActionCompatParcelizer = true;
        this.PlaybackStateCompat.clear();
        this.RatingCompat.clear();
    }

    public final void read(Runnable runnable) {
        PrematureEndOfStreamVideoQuirk.write();
        write();
        this.RatingCompat.add(runnable);
    }

    public final void serializer() {
        boolean z;
        PrematureEndOfStreamVideoQuirk.write();
        write();
        SurfaceViewStretchedQuirk surfaceViewStretchedQuirk = this.MediaSessionCompatToken;
        surfaceViewStretchedQuirk.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        if (surfaceViewStretchedQuirk.ResultReceiver == null) {
            synchronized (surfaceViewStretchedQuirk.MediaSessionCompatResultReceiverWrapper) {
                z = surfaceViewStretchedQuirk.MediaSessionCompatQueueItem;
            }
            if (!z) {
                return;
            }
        }
        this.IconCompatParcelizer = false;
        this.MediaSessionCompatToken.write();
        this.MediaSessionCompatToken = new SurfaceViewStretchedQuirk(this.MediaSessionCompatResultReceiverWrapper.MediaMetadataCompat, this.read);
        Iterator it = this.RatingCompat.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public setBrightness(int i, int i2, SmallDisplaySizeQuirk smallDisplaySizeQuirk, android.graphics.Matrix matrix, boolean z, android.graphics.Rect rect, int i3, int i4, boolean z2) {
        this.PlaybackStateCompatCustomAction = i;
        this.read = i2;
        this.MediaSessionCompatResultReceiverWrapper = smallDisplaySizeQuirk;
        this.MediaSessionCompatQueueItem = matrix;
        this.serializer = z;
        this.write = rect;
        this.MediaDescriptionCompat = i3;
        this.ParcelableVolumeInfo = i4;
        this.MediaMetadataCompat = z2;
        this.MediaSessionCompatToken = new SurfaceViewStretchedQuirk(smallDisplaySizeQuirk.MediaMetadataCompat, i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.PlaybackStateCompatCustomAction);
        sb.append(", format=");
        sb.append(this.read);
        sb.append(", resolution=");
        sb.append(this.MediaSessionCompatResultReceiverWrapper.MediaMetadataCompat);
        sb.append(", cropRect=");
        sb.append(this.write);
        sb.append(", rotationDegrees=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", mirroring=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", sensorToBufferTransform= ");
        android.graphics.Matrix matrix = this.MediaSessionCompatQueueItem;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(MediaStoreVideoCannotWrite.write(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(MediaStoreVideoCannotWrite.read(matrix));
        sb.append(", isClosed=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.RemoteActionCompatParcelizer, '}');
    }

    public final void write() {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Edge is already closed.", !this.RemoteActionCompatParcelizer);
    }
}
