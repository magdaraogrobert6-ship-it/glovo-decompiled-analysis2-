package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import io.sentry.util.UrlUtils;

/* JADX INFO: loaded from: classes.dex */
public final class getCanvas implements generateOetf, cross {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final Object read;
    public final Object serializer;

    public getCanvas(Bitmap bitmap, getD getd) {
        UrlUtils.serializer(bitmap, "Bitmap must not be null");
        this.read = bitmap;
        UrlUtils.serializer(getd, "BitmapPool must not be null");
        this.serializer = getd;
    }

    @Override // o.generateOetf
    public final void MediaBrowserCompatMediaItem() {
        if (this.IconCompatParcelizer != 0) {
            ((generateOetf) this.serializer).MediaBrowserCompatMediaItem();
        } else {
            ((getD) this.serializer).read((Bitmap) this.read);
        }
    }

    @Override // o.cross
    public final void read() {
        if (this.IconCompatParcelizer == 0) {
            ((Bitmap) this.read).prepareToDraw();
            return;
        }
        generateOetf generateoetf = (generateOetf) this.serializer;
        if (generateoetf instanceof cross) {
            ((cross) generateoetf).read();
        }
    }

    @Override // o.generateOetf
    public final int write() {
        return this.IconCompatParcelizer != 0 ? ((generateOetf) this.serializer).write() : Fill.RemoteActionCompatParcelizer((Bitmap) this.read);
    }

    @Override // o.generateOetf
    public final Object IconCompatParcelizer() {
        return this.IconCompatParcelizer != 0 ? new BitmapDrawable((Resources) this.read, (Bitmap) ((generateOetf) this.serializer).IconCompatParcelizer()) : (Bitmap) this.read;
    }

    @Override // o.generateOetf
    public final Class RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer != 0 ? BitmapDrawable.class : Bitmap.class;
    }

    public getCanvas(Resources resources, generateOetf generateoetf) {
        UrlUtils.serializer(resources, "Argument must not be null");
        this.read = resources;
        UrlUtils.serializer(generateoetf, "Argument must not be null");
        this.serializer = generateoetf;
    }
}
