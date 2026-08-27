package o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class ContentDrawScopeDefaultImpls implements getInverseTransform {
    public final Object read;
    public final /* synthetic */ int serializer;
    public final Object write;

    public ContentDrawScopeDefaultImpls(Resources resources, getInverseTransform getinversetransform) {
        this.serializer = 1;
        this.read = resources;
        this.write = getinversetransform;
    }

    @Override // o.getInverseTransform
    public final generateOetf IconCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z;
        DrawTransformDefaultImpls drawTransformDefaultImpls;
        int i3 = this.serializer;
        if (i3 != 0) {
            if (i3 == 1) {
                generateOetf generateoetfIconCompatParcelizer = ((getInverseTransform) this.write).IconCompatParcelizer(obj, i, i2, geteotffuncui_graphics);
                Resources resources = (Resources) this.read;
                if (generateoetfIconCompatParcelizer == null) {
                    return null;
                }
                return new getCanvas(resources, generateoetfIconCompatParcelizer);
            }
            generateOetf generateoetfIconCompatParcelizer2 = ((drawCircleV9BoPswdefault) this.write).IconCompatParcelizer((Uri) obj, geteotffuncui_graphics);
            if (generateoetfIconCompatParcelizer2 == null) {
                return null;
            }
            return scale0AR0LA0.serializer((getD) this.read, (Drawable) ((drawImagegbVJVH8default) generateoetfIconCompatParcelizer2).IconCompatParcelizer(), i, i2);
        }
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            recyclableBufferedInputStream = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream(inputStream, (getF) this.read);
            z = true;
        }
        ArrayDeque arrayDeque = DrawTransformDefaultImpls.IconCompatParcelizer;
        synchronized (arrayDeque) {
            drawTransformDefaultImpls = (DrawTransformDefaultImpls) arrayDeque.poll();
        }
        if (drawTransformDefaultImpls == null) {
            drawTransformDefaultImpls = new DrawTransformDefaultImpls();
        }
        DrawTransformDefaultImpls drawTransformDefaultImpls2 = drawTransformDefaultImpls;
        drawTransformDefaultImpls2.RemoteActionCompatParcelizer = recyclableBufferedInputStream;
        getTimestampSeconds gettimestampseconds = new getTimestampSeconds(drawTransformDefaultImpls2);
        colorResource colorresource = new colorResource(recyclableBufferedInputStream, drawTransformDefaultImpls2, false, 14);
        try {
            CanvasDrawScopeKtasDrawTransform1 canvasDrawScopeKtasDrawTransform1 = (CanvasDrawScopeKtasDrawTransform1) this.write;
            getCanvas getcanvasRemoteActionCompatParcelizer = canvasDrawScopeKtasDrawTransform1.RemoteActionCompatParcelizer(new accessgetTvTeletextcp(gettimestampseconds, canvasDrawScopeKtasDrawTransform1.ParcelableVolumeInfo, canvasDrawScopeKtasDrawTransform1.MediaSessionCompatQueueItem), i, i2, geteotffuncui_graphics, colorresource);
            drawTransformDefaultImpls2.serializer = null;
            drawTransformDefaultImpls2.RemoteActionCompatParcelizer = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(drawTransformDefaultImpls2);
            }
            return getcanvasRemoteActionCompatParcelizer;
        } finally {
            drawTransformDefaultImpls2.serializer = null;
            drawTransformDefaultImpls2.RemoteActionCompatParcelizer = null;
            ArrayDeque arrayDeque2 = DrawTransformDefaultImpls.IconCompatParcelizer;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(drawTransformDefaultImpls2);
                if (z) {
                    recyclableBufferedInputStream.write();
                }
            }
        }
    }

    @Override // o.getInverseTransform
    public final boolean RemoteActionCompatParcelizer(Object obj, getEotfFuncui_graphics geteotffuncui_graphics) {
        int i = this.serializer;
        if (i != 0) {
            return i != 1 ? "android.resource".equals(((Uri) obj).getScheme()) : ((getInverseTransform) this.write).RemoteActionCompatParcelizer(obj, geteotffuncui_graphics);
        }
        return true;
    }

    public /* synthetic */ ContentDrawScopeDefaultImpls(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.write = obj;
        this.read = obj2;
    }
}
