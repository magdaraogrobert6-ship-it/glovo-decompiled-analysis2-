package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import io.sentry.util.UrlUtils;
import java.security.MessageDigest;
import o.drawImage9jGpkUEdefault;
import o.generateOetf;
import o.getCanvas;
import o.getEotf;

/* JADX INFO: loaded from: classes.dex */
public final class GifDrawableTransformation implements getEotf {
    public final getEotf RemoteActionCompatParcelizer;

    @Override // o.eotfFunclambda0
    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // o.eotfFunclambda0
    public final void serializer(MessageDigest messageDigest) {
        this.RemoteActionCompatParcelizer.serializer(messageDigest);
    }

    @Override // o.eotfFunclambda0
    public final boolean equals(Object obj) {
        if (obj instanceof GifDrawableTransformation) {
            return this.RemoteActionCompatParcelizer.equals(((GifDrawableTransformation) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    @Override // o.getEotf
    public final generateOetf write(Context context, generateOetf generateoetf, int i, int i2) {
        drawImage9jGpkUEdefault drawimage9jgpkuedefault = (drawImage9jGpkUEdefault) generateoetf.IconCompatParcelizer();
        getCanvas getcanvas = new getCanvas(((GifFrameLoader) drawimage9jgpkuedefault.RatingCompat.write).read(), Glide.IconCompatParcelizer(context).read);
        getEotf geteotf = this.RemoteActionCompatParcelizer;
        generateOetf generateoetfWrite = geteotf.write(context, getcanvas, i, i2);
        if (getcanvas != generateoetfWrite) {
            getcanvas.MediaBrowserCompatMediaItem();
        }
        ((GifFrameLoader) drawimage9jgpkuedefault.RatingCompat.write).serializer(geteotf, (Bitmap) generateoetfWrite.IconCompatParcelizer());
        return generateoetf;
    }

    public GifDrawableTransformation(getEotf geteotf) {
        UrlUtils.serializer(geteotf, "Argument must not be null");
        this.RemoteActionCompatParcelizer = geteotf;
    }
}
