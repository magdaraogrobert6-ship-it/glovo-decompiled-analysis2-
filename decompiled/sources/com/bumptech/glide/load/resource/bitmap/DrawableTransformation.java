package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;
import o.generateOetf;
import o.getCanvas;
import o.getD;
import o.getEotf;
import o.scale0AR0LA0;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableTransformation implements getEotf {
    public final getEotf RemoteActionCompatParcelizer;

    @Override // o.eotfFunclambda0
    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // o.eotfFunclambda0
    public final void serializer(MessageDigest messageDigest) {
        this.RemoteActionCompatParcelizer.serializer(messageDigest);
    }

    public DrawableTransformation(getEotf geteotf) {
        this.RemoteActionCompatParcelizer = geteotf;
    }

    @Override // o.eotfFunclambda0
    public final boolean equals(Object obj) {
        if (obj instanceof DrawableTransformation) {
            return this.RemoteActionCompatParcelizer.equals(((DrawableTransformation) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    @Override // o.getEotf
    public final generateOetf write(Context context, generateOetf generateoetf, int i, int i2) {
        getD getd = Glide.IconCompatParcelizer(context).read;
        Drawable drawable = (Drawable) generateoetf.IconCompatParcelizer();
        getCanvas getcanvasSerializer = scale0AR0LA0.serializer(getd, drawable, i, i2);
        if (getcanvasSerializer == null) {
            o.DrawableTransformation.IconCompatParcelizer("Unable to convert ", drawable, " to a Bitmap");
            return null;
        }
        generateOetf generateoetfWrite = this.RemoteActionCompatParcelizer.write(context, getcanvasSerializer, i, i2);
        if (!generateoetfWrite.equals(getcanvasSerializer)) {
            return new getCanvas(context.getResources(), generateoetfWrite);
        }
        generateoetfWrite.MediaBrowserCompatMediaItem();
        return generateoetf;
    }
}
