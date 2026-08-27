package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getPostalCode;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class VectorResources_androidKt {
    public static final ImageVector vectorResource(ImageVector.Companion companion, int i, getBirthDateFull getbirthdatefull, int i2) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Context context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = (Resources) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalResources());
        Resources.Theme theme = context.getTheme();
        Configuration configuration = resources.getConfiguration();
        boolean z = (((i2 & 112) ^ 48) > 32 && getpostalcode.read(i)) || (i2 & 48) == 32;
        boolean z2 = getpostalcode.read(resources);
        boolean z3 = getpostalcode.read(theme);
        boolean z4 = getpostalcode.read(configuration);
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if ((z | z2 | z3 | z4) || objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = vectorResource(companion, theme, resources, i);
            getpostalcode.write(objComponentActivity);
        }
        return (ImageVector) objComponentActivity;
    }

    public static /* synthetic */ ImageVectorCache.ImageVectorEntry loadVectorResourceInner$default(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i, int i2, Object obj) throws XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser, i);
    }

    public static /* synthetic */ ImageVector vectorResource$default(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i, int i2, Object obj) throws XmlPullParserException {
        if ((i2 & 1) != 0) {
            theme = null;
        }
        return vectorResource(companion, theme, resources, i);
    }

    public static final ImageVectorCache.ImageVectorEntry loadVectorResourceInner(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(xmlResourceParser, 0, 2, null);
        ImageVector.Builder builderCreateVectorImageBuilder = XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser, resources, theme, attributeSetAsAttributeSet);
        int currentVectorNode = 0;
        while (!XmlVectorParser_androidKt.isAtEnd(xmlResourceParser)) {
            currentVectorNode = XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser, resources, attributeSetAsAttributeSet, theme, builderCreateVectorImageBuilder, currentVectorNode);
            xmlResourceParser.next();
        }
        return new ImageVectorCache.ImageVectorEntry(builderCreateVectorImageBuilder.build(), androidVectorParser.getConfig() | i);
    }

    public static final ImageVector vectorResource(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i) throws XmlPullParserException, IOException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        XmlResourceParser xml = resources.getXml(i);
        XmlVectorParser_androidKt.seekToStartTag(xml);
        return loadVectorResourceInner(theme, resources, xml, typedValue.changingConfigurations).getImageVector();
    }
}
