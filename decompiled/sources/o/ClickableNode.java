package o;

import android.graphics.Bitmap;
import android.view.PixelCopy;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ClickableNode implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ ClickableNode(int i, Object obj) {
        this.write = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        int i2 = this.write;
        Object obj = this.IconCompatParcelizer;
        if (i2 == 0) {
            Semaphore semaphore = (Semaphore) obj;
            if (i == 0) {
                setInflatedId.IconCompatParcelizer(3, "SurfaceViewImpl");
            } else {
                setInflatedId.serializer("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
            }
            semaphore.release();
            return;
        }
        io.sentry.android.replay.screenshot.write writeVar = (io.sentry.android.replay.screenshot.write) obj;
        if (writeVar.IconCompatParcelizer.get()) {
            writeVar.RemoteActionCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i != 0) {
            writeVar.RemoteActionCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, c8$$ExternalSyntheticOutline0.m(i, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
            writeVar.serializer.set(false);
            return;
        }
        writeVar.serializer.set(true);
        Bitmap bitmap = writeVar.RatingCompat;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        writeVar.MediaDescriptionCompat.serializer(bitmap);
    }
}
