package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.huawei.hmf.tasks.a.i$d;
import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public final class drawImagegbVJVH8default implements generateOetf, cross {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Drawable serializer;

    public drawImagegbVJVH8default(Drawable drawable, int i) {
        this.IconCompatParcelizer = i;
        UrlUtils.serializer(drawable, "Argument must not be null");
        this.serializer = drawable;
    }

    @Override // o.generateOetf
    public final Object IconCompatParcelizer() {
        Drawable drawable = this.serializer;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }

    @Override // o.cross
    public void read() {
        int i = this.IconCompatParcelizer;
        Drawable drawable = this.serializer;
        if (i == 0) {
            ((com.bumptech.glide.load.resource.gif.GifFrameLoader) ((drawImage9jGpkUEdefault) drawable).RatingCompat.write).read().prepareToDraw();
        } else if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof drawImage9jGpkUEdefault) {
            ((com.bumptech.glide.load.resource.gif.GifFrameLoader) ((drawImage9jGpkUEdefault) drawable).RatingCompat.write).read().prepareToDraw();
        }
    }

    @Override // o.generateOetf
    public final int write() {
        int i = this.IconCompatParcelizer;
        Drawable drawable = this.serializer;
        if (i != 0) {
            return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
        }
        com.bumptech.glide.load.resource.gif.GifFrameLoader gifFrameLoader = (com.bumptech.glide.load.resource.gif.GifFrameLoader) ((drawImage9jGpkUEdefault) drawable).RatingCompat.write;
        DoubleIdentitylambda0 doubleIdentitylambda0 = gifFrameLoader.MediaDescriptionCompat;
        int iLimit = doubleIdentitylambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.limit();
        int length = doubleIdentitylambda0.RatingCompat.length;
        return (doubleIdentitylambda0.MediaSessionCompatToken.length * 4) + iLimit + length + gifFrameLoader.write;
    }

    @Override // o.generateOetf
    public final Class RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer != 0 ? this.serializer.getClass() : drawImage9jGpkUEdefault.class;
    }

    @Override // o.generateOetf
    public final void MediaBrowserCompatMediaItem() {
        getF getf;
        getF getf2;
        getF getf3;
        if (this.IconCompatParcelizer != 0) {
            return;
        }
        drawImage9jGpkUEdefault drawimage9jgpkuedefault = (drawImage9jGpkUEdefault) this.serializer;
        drawimage9jgpkuedefault.stop();
        drawimage9jgpkuedefault.IconCompatParcelizer = true;
        com.bumptech.glide.load.resource.gif.GifFrameLoader gifFrameLoader = (com.bumptech.glide.load.resource.gif.GifFrameLoader) drawimage9jgpkuedefault.RatingCompat.write;
        com.bumptech.glide.RequestManager requestManager = gifFrameLoader.MediaSessionCompatResultReceiverWrapper;
        gifFrameLoader.IconCompatParcelizer.clear();
        Bitmap bitmap = gifFrameLoader.serializer;
        if (bitmap != null) {
            gifFrameLoader.read.read(bitmap);
            gifFrameLoader.serializer = null;
        }
        gifFrameLoader.PlaybackStateCompatCustomAction = false;
        drawLine1RTmtNcdefault drawline1rtmtncdefault = gifFrameLoader.RemoteActionCompatParcelizer;
        if (drawline1rtmtncdefault != null) {
            requestManager.read(drawline1rtmtncdefault);
            gifFrameLoader.RemoteActionCompatParcelizer = null;
        }
        drawLine1RTmtNcdefault drawline1rtmtncdefault2 = gifFrameLoader.ParcelableVolumeInfo;
        if (drawline1rtmtncdefault2 != null) {
            requestManager.read(drawline1rtmtncdefault2);
            gifFrameLoader.ParcelableVolumeInfo = null;
        }
        drawLine1RTmtNcdefault drawline1rtmtncdefault3 = gifFrameLoader.MediaSessionCompatToken;
        if (drawline1rtmtncdefault3 != null) {
            requestManager.read(drawline1rtmtncdefault3);
            gifFrameLoader.MediaSessionCompatToken = null;
        }
        DoubleIdentitylambda0 doubleIdentitylambda0 = gifFrameLoader.MediaDescriptionCompat;
        i$d i_d = doubleIdentitylambda0.RemoteActionCompatParcelizer;
        doubleIdentitylambda0.MediaSessionCompatQueueItem = null;
        byte[] bArr = doubleIdentitylambda0.RatingCompat;
        if (bArr != null && (getf3 = (getF) i_d.read) != null) {
            getf3.IconCompatParcelizer(bArr);
        }
        int[] iArr = doubleIdentitylambda0.MediaSessionCompatToken;
        if (iArr != null && (getf2 = (getF) i_d.read) != null) {
            getf2.IconCompatParcelizer(iArr);
        }
        Bitmap bitmap2 = doubleIdentitylambda0.PlaybackStateCompatCustomAction;
        if (bitmap2 != null) {
            ((getD) i_d.serializer).read(bitmap2);
        }
        doubleIdentitylambda0.PlaybackStateCompatCustomAction = null;
        doubleIdentitylambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        doubleIdentitylambda0.MediaDescriptionCompat = null;
        byte[] bArr2 = doubleIdentitylambda0.read;
        if (bArr2 != null && (getf = (getF) i_d.read) != null) {
            getf.IconCompatParcelizer(bArr2);
        }
        gifFrameLoader.MediaSessionCompatQueueItem = true;
    }
}
