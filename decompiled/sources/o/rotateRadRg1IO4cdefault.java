package o;

import android.graphics.drawable.Drawable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class rotateRadRg1IO4cdefault implements getDefaultFilterQualityfv9h1I {
    public final int MediaBrowserCompatMediaItem;
    public rotateRg1IO4c MediaDescriptionCompat;
    public final int RemoteActionCompatParcelizer;

    public final void IconCompatParcelizer() {
        this.MediaDescriptionCompat = null;
    }

    public abstract void IconCompatParcelizer(Object obj);

    @Override // o.getDefaultFilterQualityfv9h1I
    public final void RemoteActionCompatParcelizer() {
    }

    public final rotateRg1IO4c read() {
        return this.MediaDescriptionCompat;
    }

    public void read(Drawable drawable) {
    }

    @Override // o.getDefaultFilterQualityfv9h1I
    public final void serializer() {
    }

    @Override // o.getDefaultFilterQualityfv9h1I
    public final void write() {
    }

    public abstract void write(Drawable drawable);

    public rotateRadRg1IO4cdefault() {
        if (!Fill.read(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.MediaBrowserCompatMediaItem = Integer.MIN_VALUE;
        this.RemoteActionCompatParcelizer = Integer.MIN_VALUE;
    }
}
