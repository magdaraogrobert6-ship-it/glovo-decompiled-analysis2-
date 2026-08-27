package o;

import android.util.Log;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreviewExternalSyntheticLambda0 {
    public Class MediaDescriptionCompat;
    public final onDrawBehind MediaMetadataCompat;
    public onDrawWithContent MediaSessionCompatToken;
    public final onDrawBehind ParcelableVolumeInfo;
    public final int PlaybackStateCompat;
    public final android.util.Size PlaybackStateCompatCustomAction;
    public onDrawWithContent RatingCompat;
    public static final android.util.Size IconCompatParcelizer = new android.util.Size(0, 0);
    public static final boolean write = setInflatedId.IconCompatParcelizer(3, "DeferrableSurface");
    public static final AtomicInteger MediaBrowserCompatMediaItem = new AtomicInteger(0);
    public static final AtomicInteger serializer = new AtomicInteger(0);
    public final Object MediaSessionCompatResultReceiverWrapper = new Object();
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
    public boolean MediaSessionCompatQueueItem = false;

    public abstract DrawModifierNodeKt RemoteActionCompatParcelizer();

    public final DrawModifierNodeKt IconCompatParcelizer() {
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            if (this.MediaSessionCompatQueueItem) {
                return new EncoderImplMediaCodecCallback(0, new DeferrableSurface$SurfaceClosedException("DeferrableSurface already closed.", this));
            }
            return RemoteActionCompatParcelizer();
        }
    }

    public final void read() {
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            int i = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (i == 0 && this.MediaSessionCompatQueueItem) {
                throw new DeferrableSurface$SurfaceClosedException("Cannot begin use on a closed surface.", this);
            }
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i + 1;
            if (setInflatedId.IconCompatParcelizer(3, "DeferrableSurface")) {
                if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == 1) {
                    serializer.get();
                    MediaBrowserCompatMediaItem.incrementAndGet();
                    MediaDescriptionCompat();
                }
                toString();
                setInflatedId.IconCompatParcelizer(3, "DeferrableSurface");
            }
        }
    }

    public final void serializer() {
        onDrawWithContent ondrawwithcontent;
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            int i = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i2 = i - 1;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2;
            if (i2 == 0 && this.MediaSessionCompatQueueItem) {
                ondrawwithcontent = this.MediaSessionCompatToken;
                this.MediaSessionCompatToken = null;
            } else {
                ondrawwithcontent = null;
            }
            if (setInflatedId.IconCompatParcelizer(3, "DeferrableSurface")) {
                toString();
                setInflatedId.IconCompatParcelizer(3, "DeferrableSurface");
                if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == 0) {
                    serializer.get();
                    MediaBrowserCompatMediaItem.decrementAndGet();
                    MediaDescriptionCompat();
                }
            }
        }
        if (ondrawwithcontent != null) {
            ondrawwithcontent.RemoteActionCompatParcelizer(null);
        }
    }

    public void write() {
        onDrawWithContent ondrawwithcontent;
        synchronized (this.MediaSessionCompatResultReceiverWrapper) {
            if (this.MediaSessionCompatQueueItem) {
                ondrawwithcontent = null;
            } else {
                this.MediaSessionCompatQueueItem = true;
                this.RatingCompat.RemoteActionCompatParcelizer(null);
                if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == 0) {
                    ondrawwithcontent = this.MediaSessionCompatToken;
                    this.MediaSessionCompatToken = null;
                } else {
                    ondrawwithcontent = null;
                }
                if (setInflatedId.IconCompatParcelizer(3, "DeferrableSurface")) {
                    toString();
                    setInflatedId.IconCompatParcelizer(3, "DeferrableSurface");
                }
            }
        }
        if (ondrawwithcontent != null) {
            ondrawwithcontent.RemoteActionCompatParcelizer(null);
        }
    }

    public PreviewExternalSyntheticLambda0(android.util.Size size, int i) {
        final int i2 = 0;
        this.PlaybackStateCompatCustomAction = size;
        this.PlaybackStateCompat = i;
        onDrawBehind ondrawbehindRemoteActionCompatParcelizer = coil3.util.UtilsKt.RemoteActionCompatParcelizer(new obtainShadowContext(this) { // from class: o.volume
            public final /* synthetic */ PreviewExternalSyntheticLambda0 write;

            {
                this.write = this;
            }

            @Override // o.obtainShadowContext
            public final Object serializer(onDrawWithContent ondrawwithcontent) {
                int i3 = i2;
                PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0 = this.write;
                if (i3 != 0) {
                    synchronized (previewExternalSyntheticLambda0.MediaSessionCompatResultReceiverWrapper) {
                        previewExternalSyntheticLambda0.RatingCompat = ondrawwithcontent;
                    }
                    return "DeferrableSurface-close(" + previewExternalSyntheticLambda0 + ")";
                }
                synchronized (previewExternalSyntheticLambda0.MediaSessionCompatResultReceiverWrapper) {
                    previewExternalSyntheticLambda0.MediaSessionCompatToken = ondrawwithcontent;
                }
                return "DeferrableSurface-termination(" + previewExternalSyntheticLambda0 + ")";
            }
        });
        this.ParcelableVolumeInfo = ondrawbehindRemoteActionCompatParcelizer;
        final int i3 = 1;
        this.MediaMetadataCompat = coil3.util.UtilsKt.RemoteActionCompatParcelizer(new obtainShadowContext(this) { // from class: o.volume
            public final /* synthetic */ PreviewExternalSyntheticLambda0 write;

            {
                this.write = this;
            }

            @Override // o.obtainShadowContext
            public final Object serializer(onDrawWithContent ondrawwithcontent) {
                int i4 = i3;
                PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0 = this.write;
                if (i4 != 0) {
                    synchronized (previewExternalSyntheticLambda0.MediaSessionCompatResultReceiverWrapper) {
                        previewExternalSyntheticLambda0.RatingCompat = ondrawwithcontent;
                    }
                    return "DeferrableSurface-close(" + previewExternalSyntheticLambda0 + ")";
                }
                synchronized (previewExternalSyntheticLambda0.MediaSessionCompatResultReceiverWrapper) {
                    previewExternalSyntheticLambda0.MediaSessionCompatToken = ondrawwithcontent;
                }
                return "DeferrableSurface-termination(" + previewExternalSyntheticLambda0 + ")";
            }
        });
        if (setInflatedId.IconCompatParcelizer(3, "DeferrableSurface")) {
            serializer.incrementAndGet();
            MediaBrowserCompatMediaItem.get();
            MediaDescriptionCompat();
            ondrawbehindRemoteActionCompatParcelizer.serializer.RemoteActionCompatParcelizer(new CameraX$$ExternalSyntheticLambda2(this, 27, Log.getStackTraceString(new Exception())), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        }
    }

    public final void MediaDescriptionCompat() {
        if (!write && setInflatedId.IconCompatParcelizer(3, "DeferrableSurface")) {
            setInflatedId.IconCompatParcelizer(3, "DeferrableSurface");
        }
        toString();
        setInflatedId.IconCompatParcelizer(3, "DeferrableSurface");
    }
}
