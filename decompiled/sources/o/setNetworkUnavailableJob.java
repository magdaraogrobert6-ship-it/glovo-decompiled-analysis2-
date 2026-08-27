package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setNetworkUnavailableJob {
    public static String serializer(String str) {
        try {
            return URLEncoder.encode(str, com.adjust.sdk.Constants.ENCODING).replace("+", "%20").replace("%21", "!").replace("%27", "'").replace("%28", "(").replace("%29", ")").replace("%7E", "~");
        } catch (UnsupportedEncodingException e) {
            DrawableTransformation.read((Throwable) e);
            return null;
        }
    }

    public static Shader IconCompatParcelizer(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        float f;
        float f2;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        String name = xmlResourceParser.getName();
        if (name.equals("gradient")) {
            TypedArray typedArrayRemoteActionCompatParcelizer = coil3.ExtrasKt.RemoteActionCompatParcelizer(resources, theme, attributeSet, onFocusEvent.GradientColor);
            float f3 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayRemoteActionCompatParcelizer.getFloat(8, 0.0f) : 0.0f;
            float f4 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayRemoteActionCompatParcelizer.getFloat(9, 0.0f) : 0.0f;
            float f5 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayRemoteActionCompatParcelizer.getFloat(10, 0.0f) : 0.0f;
            float f6 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayRemoteActionCompatParcelizer.getFloat(11, 0.0f) : 0.0f;
            float f7 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayRemoteActionCompatParcelizer.getFloat(3, 0.0f) : 0.0f;
            float f8 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayRemoteActionCompatParcelizer.getFloat(4, 0.0f) : 0.0f;
            int i = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayRemoteActionCompatParcelizer.getInt(2, 0) : 0;
            int color = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayRemoteActionCompatParcelizer.getColor(0, 0) : 0;
            boolean z = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
            int color2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayRemoteActionCompatParcelizer.getColor(7, 0) : 0;
            int color3 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayRemoteActionCompatParcelizer.getColor(1, 0) : 0;
            int i2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayRemoteActionCompatParcelizer.getInt(6, 0) : 0;
            float f9 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayRemoteActionCompatParcelizer.getFloat(5, 0.0f) : 0.0f;
            typedArrayRemoteActionCompatParcelizer.recycle();
            int depth = xmlResourceParser.getDepth() + 1;
            ArrayList arrayList = new ArrayList(20);
            float f10 = f9;
            ArrayList arrayList2 = new ArrayList(20);
            while (true) {
                int next = xmlResourceParser.next();
                f = f6;
                if (next == 1) {
                    f2 = f5;
                    break;
                }
                int depth2 = xmlResourceParser.getDepth();
                f2 = f5;
                if (depth2 < depth && next == 3) {
                    break;
                }
                if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayRemoteActionCompatParcelizer2 = coil3.ExtrasKt.RemoteActionCompatParcelizer(resources, theme, attributeSet, onFocusEvent.GradientColorItem);
                    boolean zHasValue = typedArrayRemoteActionCompatParcelizer2.hasValue(0);
                    boolean zHasValue2 = typedArrayRemoteActionCompatParcelizer2.hasValue(1);
                    if (zHasValue && zHasValue2) {
                        int color4 = typedArrayRemoteActionCompatParcelizer2.getColor(0, 0);
                        float f11 = typedArrayRemoteActionCompatParcelizer2.getFloat(1, 0.0f);
                        typedArrayRemoteActionCompatParcelizer2.recycle();
                        arrayList2.add(Integer.valueOf(color4));
                        arrayList.add(Float.valueOf(f11));
                    } else {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                    }
                }
                f6 = f;
                f5 = f2;
            }
            accessgetGreencp accessgetgreencp = arrayList2.size() > 0 ? new accessgetGreencp(arrayList2, arrayList) : null;
            if (accessgetgreencp == null) {
                if (z) {
                    accessgetgreencp = new accessgetGreencp(color, color2, color3);
                } else {
                    accessgetgreencp = new accessgetGreencp(color, color3);
                }
            }
            if (i != 1) {
                if (i != 2) {
                    int[] iArr = (int[]) accessgetgreencp.IconCompatParcelizer;
                    float[] fArr = (float[]) accessgetgreencp.write;
                    if (i2 == 1) {
                        tileMode2 = Shader.TileMode.REPEAT;
                    } else if (i2 != 2) {
                        tileMode2 = Shader.TileMode.CLAMP;
                    } else {
                        tileMode2 = Shader.TileMode.MIRROR;
                    }
                    return new android.graphics.LinearGradient(f3, f4, f2, f, iArr, fArr, tileMode2);
                }
                return new android.graphics.SweepGradient(f7, f8, (int[]) accessgetgreencp.IconCompatParcelizer, (float[]) accessgetgreencp.write);
            }
            float f12 = f7;
            float f13 = f8;
            if (f10 > 0.0f) {
                int[] iArr2 = (int[]) accessgetgreencp.IconCompatParcelizer;
                float[] fArr2 = (float[]) accessgetgreencp.write;
                if (i2 == 1) {
                    tileMode = Shader.TileMode.REPEAT;
                } else if (i2 != 2) {
                    tileMode = Shader.TileMode.CLAMP;
                } else {
                    tileMode = Shader.TileMode.MIRROR;
                }
                return new android.graphics.RadialGradient(f12, f13, f10, iArr2, fArr2, tileMode);
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }
}
