package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.List;
import kotlin.text.RegexKt;
import okio.Okio;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class PathSvgKtWhenMappings implements toSvgdefault {
    public final PathDefaultImpls IconCompatParcelizer;
    public final getBlurRadiusannotations serializer;

    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    @Override // o.toSvgdefault
    public final Object fetch(getBuffer getbuffer) throws XmlPullParserException, IOException {
        Integer numMediaSessionCompatQueueItem;
        String strSerializer;
        Drawable bitmapDrawable;
        PathDefaultImpls pathDefaultImpls = this.IconCompatParcelizer;
        String str = pathDefaultImpls.serializer;
        if (str != null) {
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                str = null;
            }
            if (str != null) {
                String str2 = (String) onContentCardDismissed.MediaBrowserCompatMediaItem((List) coil3.UriKt.RemoteActionCompatParcelizer(accessunpack.serializer(), accessunpack.serializer(), 1023072373, -1023072371, new Object[]{pathDefaultImpls}, accessunpack.serializer(), accessunpack.serializer()));
                if (str2 == null || (numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, str2)) == null) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(pathDefaultImpls, "Invalid android.resource URI: ");
                    return null;
                }
                int iIntValue = numMediaSessionCompatQueueItem.intValue();
                getBlurRadiusannotations getblurradiusannotations = this.serializer;
                Context context = getblurradiusannotations.write;
                Resources resources = str.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                String string = typedValue.string.toString();
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
                    strSerializer = null;
                } else {
                    String strRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(string, '#'), '?');
                    String strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('/', strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer), "");
                    if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strIconCompatParcelizer)) {
                        strSerializer = null;
                    } else {
                        String lowerCase = strIconCompatParcelizer.toLowerCase(java.util.Locale.ROOT);
                        lowerCase.getClass();
                        strSerializer = (String) getSquareKaPHkGw.serializer.get(lowerCase);
                        if (strSerializer == null) {
                            strSerializer = StrokeJoin.serializer(lowerCase);
                        }
                    }
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strSerializer, "text/xml"}, getCieXyz.write())).booleanValue()) {
                    return new PixelMap(getUnionb3I0S0c.serializer(new GifDrawableTransformation(Okio.RemoteActionCompatParcelizer(resources.openRawResource(iIntValue, new TypedValue()))), getblurradiusannotations.IconCompatParcelizer, new PathOperationKt(str, iIntValue)), strSerializer, getSegmentdefault.DISK);
                }
                if (str.equals(context.getPackageName())) {
                    bitmapDrawable = (Drawable) coil3.util.ContextsKt.IconCompatParcelizer(-1479691464, logImpressionlambda2.read(), new Object[]{context, Integer.valueOf(iIntValue)}, logImpressionlambda2.read(), logImpressionlambda2.read(), 1479691465, logImpressionlambda2.read());
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal threadLocal = setLeft.read;
                    Drawable drawable = resources.getDrawable(iIntValue, theme);
                    if (drawable == null) {
                        DrawableTransformation.read((Object) c8$$ExternalSyntheticOutline0.m(iIntValue, "Invalid resource ID: "));
                        return null;
                    }
                    bitmapDrawable = drawable;
                }
                Bitmap.Config[] configArr = accessgetBevelcp.write;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof getNonefv9h1I);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(context.getResources(), setNativeShader.read(bitmapDrawable, (Bitmap.Config) coil3.ExtrasKt.read(getblurradiusannotations, LinearGradientShaderVjE6UOU.IconCompatParcelizer), getblurradiusannotations.MediaSessionCompatQueueItem, getblurradiusannotations.MediaBrowserCompatMediaItem, (accessgetLayerBlockp) coil3.ExtrasKt.read(getblurradiusannotations, LinearGradientShaderVjE6UOUdefault.write), getblurradiusannotations.MediaDescriptionCompat == getNoneannotations.INEXACT));
                }
                return new getWaAFU9c(RegexKt.serializer(bitmapDrawable), z, getSegmentdefault.DISK);
            }
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(pathDefaultImpls, "Invalid android.resource URI: ");
        return null;
    }

    public PathSvgKtWhenMappings(PathDefaultImpls pathDefaultImpls, getBlurRadiusannotations getblurradiusannotations) {
        this.IconCompatParcelizer = pathDefaultImpls;
        this.serializer = getblurradiusannotations;
    }
}
