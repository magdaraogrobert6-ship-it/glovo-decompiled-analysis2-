package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class getReverseDifference implements PathOperation {
    public final getInAppMessageManagerListener serializer;

    public getReverseDifference(getInAppMessageManagerListener getinappmessagemanagerlistener) {
        this.serializer = getinappmessagemanagerlistener;
    }

    @Override // o.PathOperation
    public final coil3.decode.StaticImageDecoder IconCompatParcelizer(PixelMap pixelMap, getBlurRadiusannotations getblurradiusannotations) {
        ImageDecoder.Source sourceSerializer;
        Bitmap.Config configIconCompatParcelizer = LinearGradientShaderVjE6UOU.IconCompatParcelizer(getblurradiusannotations);
        if ((configIconCompatParcelizer == Bitmap.Config.ARGB_8888 || configIconCompatParcelizer == Bitmap.Config.HARDWARE) && (sourceSerializer = getXor.serializer(pixelMap.serializer, getblurradiusannotations)) != null) {
            return new coil3.decode.StaticImageDecoder(sourceSerializer, pixelMap.serializer, getblurradiusannotations, this.serializer);
        }
        return null;
    }
}
