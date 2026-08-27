package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import o.DoubleIdentitylambda0;
import o.Fill;
import o.accessgetPerceptualcp;
import o.accessisWideGamut;
import o.compareAndSetFactory;
import o.component4NHjbRc;
import o.drawImage9jGpkUEdefault;
import o.drawLine1RTmtNcdefault;
import o.drawLineNGM6Ib0default;
import o.getD;
import o.getEotf;
import o.r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4;
import o.r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk;
import o.scaleFgt4K4Qdefault;
import o.translatedefault;

/* JADX INFO: loaded from: classes.dex */
public final class GifFrameLoader {
    public int ComponentActivity;
    public final ArrayList IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final DoubleIdentitylambda0 MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final RequestManager MediaSessionCompatResultReceiverWrapper;
    public drawLine1RTmtNcdefault MediaSessionCompatToken;
    public drawLine1RTmtNcdefault ParcelableVolumeInfo;
    public RequestBuilder PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public final Handler RatingCompat;
    public drawLine1RTmtNcdefault RemoteActionCompatParcelizer;
    public final getD read;
    public Bitmap serializer;
    public int write;

    public final int MediaDescriptionCompat() {
        return this.ComponentActivity;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void RemoteActionCompatParcelizer(drawLine1RTmtNcdefault drawline1rtmtncdefault) {
        this.MediaMetadataCompat = false;
        boolean z = this.MediaSessionCompatQueueItem;
        Handler handler = this.RatingCompat;
        if (z) {
            handler.obtainMessage(2, drawline1rtmtncdefault).sendToTarget();
            return;
        }
        if (!this.PlaybackStateCompatCustomAction) {
            this.MediaSessionCompatToken = drawline1rtmtncdefault;
            return;
        }
        if (drawline1rtmtncdefault.read != null) {
            Bitmap bitmap = this.serializer;
            if (bitmap != null) {
                this.read.read(bitmap);
                this.serializer = null;
            }
            drawLine1RTmtNcdefault drawline1rtmtncdefault2 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = drawline1rtmtncdefault;
            ArrayList arrayList = this.IconCompatParcelizer;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                drawImage9jGpkUEdefault drawimage9jgpkuedefault = (drawImage9jGpkUEdefault) arrayList.get(size);
                drawLineNGM6Ib0default drawlinengm6ib0default = drawimage9jgpkuedefault.RatingCompat;
                Object callback = drawimage9jgpkuedefault.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    drawimage9jgpkuedefault.stop();
                    drawimage9jgpkuedefault.invalidateSelf();
                } else {
                    drawimage9jgpkuedefault.invalidateSelf();
                    GifFrameLoader gifFrameLoader = (GifFrameLoader) drawlinengm6ib0default.write;
                    drawLine1RTmtNcdefault drawline1rtmtncdefault3 = gifFrameLoader.RemoteActionCompatParcelizer;
                    if ((drawline1rtmtncdefault3 != null ? drawline1rtmtncdefault3.serializer : -1) == gifFrameLoader.IconCompatParcelizer() - 1) {
                        drawimage9jgpkuedefault.MediaDescriptionCompat++;
                    }
                    int i = drawimage9jgpkuedefault.MediaMetadataCompat;
                    if (i != -1 && drawimage9jgpkuedefault.MediaDescriptionCompat >= i) {
                        drawimage9jgpkuedefault.stop();
                    }
                }
            }
            if (drawline1rtmtncdefault2 != null) {
                handler.obtainMessage(2, drawline1rtmtncdefault2).sendToTarget();
            }
        }
        MediaMetadataCompat();
    }

    public final Bitmap read() {
        return this.serializer;
    }

    public GifFrameLoader(Glide glide, DoubleIdentitylambda0 doubleIdentitylambda0, int i, int i2, Bitmap bitmap) {
        getD getd = glide.read;
        accessgetPerceptualcp accessgetperceptualcp = glide.RatingCompat;
        Context baseContext = accessgetperceptualcp.getBaseContext();
        UrlUtils.serializer(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        RequestManager requestManagerRemoteActionCompatParcelizer = Glide.IconCompatParcelizer(baseContext).MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(baseContext);
        Context baseContext2 = accessgetperceptualcp.getBaseContext();
        UrlUtils.serializer(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        RequestManager requestManagerRemoteActionCompatParcelizer2 = Glide.IconCompatParcelizer(baseContext2).MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(baseContext2);
        requestManagerRemoteActionCompatParcelizer2.getClass();
        RequestBuilder requestBuilderIconCompatParcelizer = new RequestBuilder(requestManagerRemoteActionCompatParcelizer2.MediaSessionCompatQueueItem, requestManagerRemoteActionCompatParcelizer2, Bitmap.class, requestManagerRemoteActionCompatParcelizer2.read).write(RequestManager.IconCompatParcelizer).write(((scaleFgt4K4Qdefault) ((scaleFgt4K4Qdefault) ((scaleFgt4K4Qdefault) new scaleFgt4K4Qdefault().IconCompatParcelizer(accessisWideGamut.serializer)).MediaMetadataCompat()).serializer()).serializer(i, i2));
        this.IconCompatParcelizer = new ArrayList();
        this.MediaSessionCompatResultReceiverWrapper = requestManagerRemoteActionCompatParcelizer;
        Handler handler = new Handler(Looper.getMainLooper(), new compareAndSetFactory(1, this));
        this.read = getd;
        this.RatingCompat = handler;
        this.PlaybackStateCompat = requestBuilderIconCompatParcelizer;
        this.MediaDescriptionCompat = doubleIdentitylambda0;
        serializer(component4NHjbRc.write, bitmap);
    }

    public final int IconCompatParcelizer() {
        return this.MediaDescriptionCompat.MediaSessionCompatQueueItem.read;
    }

    public final void RemoteActionCompatParcelizer(drawImage9jGpkUEdefault drawimage9jgpkuedefault) {
        ArrayList arrayList = this.IconCompatParcelizer;
        arrayList.remove(drawimage9jgpkuedefault);
        if (arrayList.isEmpty()) {
            this.PlaybackStateCompatCustomAction = false;
        }
    }

    public final ByteBuffer serializer() {
        return this.MediaDescriptionCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.asReadOnlyBuffer();
    }

    public final void serializer(getEotf geteotf, Bitmap bitmap) {
        UrlUtils.serializer(geteotf, "Argument must not be null");
        UrlUtils.serializer(bitmap, "Argument must not be null");
        this.serializer = bitmap;
        this.PlaybackStateCompat = this.PlaybackStateCompat.write(new scaleFgt4K4Qdefault().IconCompatParcelizer(geteotf));
        this.write = Fill.RemoteActionCompatParcelizer(bitmap);
        this.ComponentActivity = bitmap.getWidth();
        this.MediaBrowserCompatMediaItem = bitmap.getHeight();
    }

    public final void MediaMetadataCompat() {
        int i;
        int i2;
        if (!this.PlaybackStateCompatCustomAction || this.MediaMetadataCompat) {
            return;
        }
        drawLine1RTmtNcdefault drawline1rtmtncdefault = this.MediaSessionCompatToken;
        if (drawline1rtmtncdefault != null) {
            this.MediaSessionCompatToken = null;
            RemoteActionCompatParcelizer(drawline1rtmtncdefault);
            return;
        }
        this.MediaMetadataCompat = true;
        DoubleIdentitylambda0 doubleIdentitylambda0 = this.MediaDescriptionCompat;
        r8lambdaLOvDXKeBCWVMEVqkoYOT9dw91J4 r8lambdalovdxkebcwvmevqkoyot9dw91j4 = doubleIdentitylambda0.MediaSessionCompatQueueItem;
        int i3 = r8lambdalovdxkebcwvmevqkoyot9dw91j4.read;
        if (i3 <= 0 || (i2 = doubleIdentitylambda0.MediaBrowserCompatMediaItem) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((r8lambdaepWD6LFpMo_FfyizDMcoRKn0Itk) r8lambdalovdxkebcwvmevqkoyot9dw91j4.IconCompatParcelizer.get(i2)).serializer;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = i;
        int i4 = (doubleIdentitylambda0.MediaBrowserCompatMediaItem + 1) % doubleIdentitylambda0.MediaSessionCompatQueueItem.read;
        doubleIdentitylambda0.MediaBrowserCompatMediaItem = i4;
        this.ParcelableVolumeInfo = new drawLine1RTmtNcdefault(this.RatingCompat, i4, jUptimeMillis + j);
        this.PlaybackStateCompat.write((scaleFgt4K4Qdefault) new scaleFgt4K4Qdefault().write(new translatedefault(Double.valueOf(Math.random())))).read(doubleIdentitylambda0).write(this.ParcelableVolumeInfo);
    }

    public final void read(drawImage9jGpkUEdefault drawimage9jgpkuedefault) {
        if (this.MediaSessionCompatQueueItem) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot subscribe to a cleared frame loader");
            return;
        }
        ArrayList arrayList = this.IconCompatParcelizer;
        if (arrayList.contains(drawimage9jgpkuedefault)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot subscribe twice in a row");
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(drawimage9jgpkuedefault);
        if (!zIsEmpty || this.PlaybackStateCompatCustomAction) {
            return;
        }
        this.PlaybackStateCompatCustomAction = true;
        this.MediaSessionCompatQueueItem = false;
        MediaMetadataCompat();
    }

    public final Bitmap write() {
        drawLine1RTmtNcdefault drawline1rtmtncdefault = this.RemoteActionCompatParcelizer;
        return drawline1rtmtncdefault != null ? drawline1rtmtncdefault.read : this.serializer;
    }
}
