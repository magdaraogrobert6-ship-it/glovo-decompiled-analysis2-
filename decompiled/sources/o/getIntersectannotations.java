package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import coil3.Extras$Key;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class getIntersectannotations implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ cancelPendingWebViewPause IconCompatParcelizer;
    public final /* synthetic */ coil3.decode.StaticImageDecoder RemoteActionCompatParcelizer;

    public getIntersectannotations(coil3.decode.StaticImageDecoder staticImageDecoder, cancelPendingWebViewPause cancelpendingwebviewpause) {
        this.RemoteActionCompatParcelizer = staticImageDecoder;
        this.IconCompatParcelizer = cancelpendingwebviewpause;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        android.util.Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        getBlurRadiusannotations getblurradiusannotations = this.RemoteActionCompatParcelizer.serializer;
        accessgetLayerBlockp accessgetlayerblockp = getblurradiusannotations.MediaSessionCompatQueueItem;
        getBlurRadius getblurradius = getblurradiusannotations.MediaBrowserCompatMediaItem;
        Extras$Key extras$Key = LinearGradientShaderVjE6UOUdefault.write;
        long jIconCompatParcelizer = RangesKt.IconCompatParcelizer(width, height, accessgetlayerblockp, getblurradius, (accessgetLayerBlockp) coil3.ExtrasKt.read(getblurradiusannotations, extras$Key));
        int i = (int) (jIconCompatParcelizer >> 32);
        int i2 = (int) (jIconCompatParcelizer & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i2)) {
            double dWrite = RangesKt.write(width, height, i, i2, getblurradiusannotations.MediaBrowserCompatMediaItem, (accessgetLayerBlockp) coil3.ExtrasKt.read(getblurradiusannotations, extras$Key));
            boolean z = dWrite < 1.0d;
            this.IconCompatParcelizer.IconCompatParcelizer = z;
            if (z || getblurradiusannotations.MediaDescriptionCompat == getNoneannotations.EXACT) {
                imageDecoder.setTargetSize(MathKt.write(((double) width) * dWrite), MathKt.write(dWrite * ((double) height)));
            }
        }
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: o.getDifference
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return true;
            }
        });
        imageDecoder.setAllocator(LinearGradientShaderVjE6UOU.IconCompatParcelizer(getblurradiusannotations) == Bitmap.Config.HARDWARE ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) coil3.ExtrasKt.read(getblurradiusannotations, LinearGradientShaderVjE6UOU.read)).booleanValue() ? 1 : 0);
        Extras$Key extras$Key2 = LinearGradientShaderVjE6UOU.RemoteActionCompatParcelizer;
        if (((android.graphics.ColorSpace) coil3.ExtrasKt.read(getblurradiusannotations, extras$Key2)) != null) {
            imageDecoder.setTargetColorSpace((android.graphics.ColorSpace) coil3.ExtrasKt.read(getblurradiusannotations, extras$Key2));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) coil3.ExtrasKt.read(getblurradiusannotations, LinearGradientShaderVjE6UOU.RatingCompat)).booleanValue());
    }
}
