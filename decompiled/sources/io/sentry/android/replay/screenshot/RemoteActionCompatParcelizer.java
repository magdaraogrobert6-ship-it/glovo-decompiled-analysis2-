package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.PixelCopy;
import android.view.Surface;
import io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import o.ClickableNode;
import o.UriActionExternalSyntheticLambda4;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RemoteActionCompatParcelizer implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ write read;

    public /* synthetic */ RemoteActionCompatParcelizer(write writeVar, int i) {
        this.IconCompatParcelizer = i;
        this.read = writeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        write writeVar = this.read;
        if (i != 0) {
            Bitmap bitmap = writeVar.RatingCompat;
            if (bitmap != null) {
                synchronized (bitmap) {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
            }
            writeVar.PlaybackStateCompatCustomAction.release();
            writeVar.MediaSessionCompatResultReceiverWrapper.release();
            return;
        }
        if (writeVar.IconCompatParcelizer.get()) {
            writeVar.RemoteActionCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture picture = (Picture) writeVar.MediaSessionCompatToken.getAndSet(null);
        if (picture == null) {
            return;
        }
        try {
            Canvas canvasLockHardwareCanvas = writeVar.PlaybackStateCompatCustomAction.lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                picture.draw(canvasLockHardwareCanvas);
                writeVar.PlaybackStateCompatCustomAction.unlockCanvasAndPost(canvasLockHardwareCanvas);
                if (writeVar.RatingCompat == null) {
                    UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = writeVar.MediaMetadataCompat.serializer();
                    try {
                        if (writeVar.RatingCompat == null) {
                            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = writeVar.read;
                            writeVar.RatingCompat = Bitmap.createBitmap(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.serializer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RemoteActionCompatParcelizer, Bitmap.Config.ARGB_8888);
                        }
                        Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Okio.RemoteActionCompatParcelizer(uriActionExternalSyntheticLambda4Serializer, th);
                            throw th2;
                        }
                    }
                }
                if (writeVar.IconCompatParcelizer.get()) {
                    writeVar.RemoteActionCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = writeVar.PlaybackStateCompatCustomAction;
                Bitmap bitmap2 = writeVar.RatingCompat;
                bitmap2.getClass();
                PixelCopy.request(surface, bitmap2, new ClickableNode(1, writeVar), writeVar.write.IconCompatParcelizer());
            } catch (Throwable th3) {
                writeVar.PlaybackStateCompatCustomAction.unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th3;
            }
        } catch (Throwable th4) {
            writeVar.RemoteActionCompatParcelizer.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Canvas Strategy: picture render failed", th4);
            writeVar.serializer.set(false);
        }
    }
}
