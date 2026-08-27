package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes.dex */
public final class addSvg implements toSvgdefault {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final getBlurRadiusannotations serializer;

    public /* synthetic */ addSvg(Object obj, getBlurRadiusannotations getblurradiusannotations, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
        this.serializer = getblurradiusannotations;
    }

    @Override // o.toSvgdefault
    public final Object fetch(getBuffer getbuffer) {
        int i = this.RemoteActionCompatParcelizer;
        getBlurRadiusannotations getblurradiusannotations = this.serializer;
        Object obj = this.IconCompatParcelizer;
        if (i == 0) {
            Drawable bitmapDrawable = (Drawable) obj;
            Bitmap.Config[] configArr = accessgetBevelcp.write;
            boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof getNonefv9h1I);
            if (z) {
                bitmapDrawable = new BitmapDrawable(getblurradiusannotations.write.getResources(), setNativeShader.read(bitmapDrawable, LinearGradientShaderVjE6UOU.IconCompatParcelizer(getblurradiusannotations), getblurradiusannotations.MediaSessionCompatQueueItem, getblurradiusannotations.MediaBrowserCompatMediaItem, (accessgetLayerBlockp) coil3.ExtrasKt.read(getblurradiusannotations, LinearGradientShaderVjE6UOUdefault.write), getblurradiusannotations.MediaDescriptionCompat == getNoneannotations.INEXACT));
            }
            return new getWaAFU9c(RegexKt.serializer(bitmapDrawable), z, getSegmentdefault.MEMORY);
        }
        if (i != 1) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            return new PixelMap(new getIntersect(new GifDrawableTransformation(new PathSvgKt(byteBuffer)), getblurradiusannotations.IconCompatParcelizer, new PathMeasureDefaultImpls(byteBuffer)), null, getSegmentdefault.MEMORY);
        }
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        registryMissingComponentException.write(bArr, 0, bArr.length);
        return new PixelMap(new getIntersect(registryMissingComponentException, getblurradiusannotations.IconCompatParcelizer, null), null, getSegmentdefault.MEMORY);
    }
}
