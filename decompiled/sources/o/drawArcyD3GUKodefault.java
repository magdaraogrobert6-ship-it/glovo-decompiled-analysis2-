package o;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import io.sentry.util.UrlUtils;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class drawArcyD3GUKodefault implements generateOetf {
    public final Object read;
    public final /* synthetic */ int serializer;

    public drawArcyD3GUKodefault(byte[] bArr) {
        this.serializer = 2;
        UrlUtils.serializer(bArr, "Argument must not be null");
        this.read = bArr;
    }

    @Override // o.generateOetf
    public final Object IconCompatParcelizer() {
        int i = this.serializer;
        Object obj = this.read;
        if (i == 0) {
            return (File) obj;
        }
        if (i != 1) {
            return i != 2 ? (AnimatedImageDrawable) obj : (byte[]) obj;
        }
        return (Bitmap) obj;
    }

    @Override // o.generateOetf
    public final int write() {
        int i = this.serializer;
        Object obj = this.read;
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return Fill.RemoteActionCompatParcelizer((Bitmap) obj);
        }
        if (i == 2) {
            return ((byte[]) obj).length;
        }
        AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
        int intrinsicWidth = animatedImageDrawable.getIntrinsicWidth();
        return Fill.serializer(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * intrinsicWidth * 2;
    }

    @Override // o.generateOetf
    public final void MediaBrowserCompatMediaItem() {
        int i = this.serializer;
        if (i == 0 || i == 1 || i == 2) {
            return;
        }
        AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.read;
        animatedImageDrawable.stop();
        animatedImageDrawable.clearAnimationCallbacks();
    }

    @Override // o.generateOetf
    public final Class RemoteActionCompatParcelizer() {
        int i = this.serializer;
        if (i == 0) {
            return ((File) this.read).getClass();
        }
        if (i != 1) {
            return i != 2 ? Drawable.class : byte[].class;
        }
        return Bitmap.class;
    }

    public /* synthetic */ drawArcyD3GUKodefault(int i, Object obj) {
        this.serializer = i;
        this.read = obj;
    }

    public drawArcyD3GUKodefault(File file) {
        this.serializer = 0;
        UrlUtils.serializer(file, "Argument must not be null");
        this.read = file;
    }
}
