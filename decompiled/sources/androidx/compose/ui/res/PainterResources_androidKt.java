package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getPostalCode;
import o.hideCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class PainterResources_androidKt {
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    private static final ImageBitmap loadImageBitmapResource(CharSequence charSequence, Resources resources, int i) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources, i);
        } catch (Exception e) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
        }
    }

    public static final Painter painterResource(int i, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Context context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = (Resources) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources());
        TypedValue typedValueResolveResourcePath = ((ResourceIdCache) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResourceIdCache())).resolveResourcePath(resources, i);
        CharSequence charSequence = typedValueResolveResourcePath.string;
        boolean z = true;
        if (charSequence != null && hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(charSequence, ".xml")) {
            getpostalcode.serializer(-1771798434);
            VectorPainter vectorPainterRememberVectorPainter = VectorPainterKt.rememberVectorPainter(loadVectorResource(context.getTheme(), resources, i, typedValueResolveResourcePath.changingConfigurations, getpostalcode, (i2 << 6) & 896), getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(false);
            return vectorPainterRememberVectorPainter;
        }
        getpostalcode.serializer(-1771643000);
        Resources.Theme theme = context.getTheme();
        boolean z2 = getpostalcode.read(charSequence);
        if ((((i2 & 14) ^ 6) <= 4 || !getpostalcode.read(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z3 = getpostalcode.read(theme);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if ((z3 | z2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = loadImageBitmapResource(charSequence, resources, i);
            getpostalcode.write(objComponentActivity);
        }
        BitmapPainter bitmapPainter = new BitmapPainter((ImageBitmap) objComponentActivity, 0L, 0L, 6, null);
        getpostalcode.IconCompatParcelizer(false);
        return bitmapPainter;
    }

    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i, int i2, getBirthDateFull getbirthdatefull, int i3) throws XmlPullParserException {
        ImageVectorCache imageVectorCache = (ImageVectorCache) ((getPostalCode) getbirthdatefull).write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i);
        ImageVectorCache.ImageVectorEntry imageVectorEntryLoadVectorResourceInner = imageVectorCache.get(key);
        if (imageVectorEntryLoadVectorResourceInner == null) {
            XmlResourceParser xml = resources.getXml(i);
            Object[] objArr = {XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector"};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(errorMessage);
                return null;
            }
            imageVectorEntryLoadVectorResourceInner = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i2);
            imageVectorCache.set(key, imageVectorEntryLoadVectorResourceInner);
        }
        return imageVectorEntryLoadVectorResourceInner.getImageVector();
    }
}
