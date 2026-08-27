package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathNode;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import java.io.IOException;
import java.util.List;
import o.getPrevious;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    private static final String SHAPE_CLIP_PATH = "clip-path";
    private static final String SHAPE_GROUP = "group";
    private static final String SHAPE_PATH = "path";

    public static final void parseClipPath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA());
        List emptyPath = string2 == null ? VectorKt.getEmptyPath() : PathParser.pathStringToNodes$default(androidVectorParser.pathParser, string2, null, 2, null);
        typedArrayObtainAttributes.recycle();
        builder.addGroup((Constant.ERROR_ROAD_AREA_INVALID & 1) != 0 ? "" : str, (Constant.ERROR_ROAD_AREA_INVALID & 2) != 0 ? 0.0f : 0.0f, (Constant.ERROR_ROAD_AREA_INVALID & 4) != 0 ? 0.0f : 0.0f, (Constant.ERROR_ROAD_AREA_INVALID & 8) != 0 ? 0.0f : 0.0f, (Constant.ERROR_ROAD_AREA_INVALID & 16) != 0 ? 1.0f : 0.0f, (Constant.ERROR_ROAD_AREA_INVALID & 32) == 0 ? 0.0f : 1.0f, (Constant.ERROR_ROAD_AREA_INVALID & 64) != 0 ? 0.0f : 0.0f, (Constant.ERROR_ROAD_AREA_INVALID & Fields.SpotShadowColor) == 0 ? 0.0f : 0.0f, (Constant.ERROR_ROAD_AREA_INVALID & Fields.RotationX) != 0 ? VectorKt.getEmptyPath() : emptyPath);
    }

    public static final void parseGroup(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "rotation", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f = androidVectorParser.getFloat(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f2 = androidVectorParser.getFloat(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "translateX", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "translateY", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        typedArrayObtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f, f2, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }

    public static final void parsePath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) throws IllegalArgumentException {
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (!ExtrasKt.RemoteActionCompatParcelizer(androidVectorParser.getXmlParser(), "pathData")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("No path data available");
            return;
        }
        String string = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        String string2 = androidVectorParser.getString(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA());
        List<? extends PathNode> emptyPath = string2 == null ? VectorKt.getEmptyPath() : PathParser.pathStringToNodes$default(androidVectorParser.pathParser, string2, null, 2, null);
        getPrevious namedComplexColor = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "fillColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "fillAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int iM1497getStrokeLineCapCSYIeUk = m1497getStrokeLineCapCSYIeUk(androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineCap", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.Companion.m1099getButtKaPHkGw());
        int iM1499getStrokeLineJoinkLtJ_vA = m1499getStrokeLineJoinkLtJ_vA(androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineJoin", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.Companion.m1110getMiterLxFBmk8());
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeMiterLimit", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 4.0f);
        getPrevious namedComplexColor2 = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "strokeColor", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeAlpha", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathEnd", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat6 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathOffset", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat7 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathStart", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int namedInt = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "fillType", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
        typedArrayObtainAttributes.recycle();
        builder.m1462addPathoIyEayM(emptyPath, namedInt == 0 ? PathFillType.Companion.m1022getNonZeroRgk1Os() : PathFillType.Companion.m1021getEvenOddRgk1Os(), str, obtainBrushFromComplexColor(namedComplexColor), namedFloat, obtainBrushFromComplexColor(namedComplexColor2), namedFloat3, namedFloat4, iM1497getStrokeLineCapCSYIeUk, iM1499getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
    }

    public static final ImageVector.Builder createVectorImageBuilder(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jM758getUnspecified0d7_KjU;
        int iM660getSrcIn0nO6VwU;
        ColorStateList namedColorStateList;
        AndroidVectorResources androidVectorResources = AndroidVectorResources.INSTANCE;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = androidVectorParser.getNamedBoolean(typedArrayObtainAttributes, "autoMirrored", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "viewportWidth", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "viewportHeight", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (namedFloat2 > 0.0f) {
            float dimension = androidVectorParser.getDimension(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
            float dimension2 = androidVectorParser.getDimension(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
            if (typedArrayObtainAttributes.hasValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
                TypedValue typedValue = new TypedValue();
                typedArrayObtainAttributes.getValue(androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
                if (typedValue.type != 2 && (namedColorStateList = androidVectorParser.getNamedColorStateList(typedArrayObtainAttributes, theme, "tint", androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) != null) {
                    jM758getUnspecified0d7_KjU = ColorKt.Color(namedColorStateList.getDefaultColor());
                } else {
                    jM758getUnspecified0d7_KjU = Color.Companion.m758getUnspecified0d7_KjU();
                }
            } else {
                jM758getUnspecified0d7_KjU = Color.Companion.m758getUnspecified0d7_KjU();
            }
            long j = jM758getUnspecified0d7_KjU;
            int i = androidVectorParser.getInt(typedArrayObtainAttributes, androidVectorResources.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
            if (i == -1) {
                iM660getSrcIn0nO6VwU = BlendMode.Companion.m660getSrcIn0nO6VwU();
            } else if (i == 3) {
                iM660getSrcIn0nO6VwU = BlendMode.Companion.m662getSrcOver0nO6VwU();
            } else if (i == 5) {
                iM660getSrcIn0nO6VwU = BlendMode.Companion.m660getSrcIn0nO6VwU();
            } else if (i != 9) {
                switch (i) {
                    case 14:
                        iM660getSrcIn0nO6VwU = BlendMode.Companion.m651getModulate0nO6VwU();
                        break;
                    case 15:
                        iM660getSrcIn0nO6VwU = BlendMode.Companion.m656getScreen0nO6VwU();
                        break;
                    case 16:
                        iM660getSrcIn0nO6VwU = BlendMode.Companion.m654getPlus0nO6VwU();
                        break;
                    default:
                        iM660getSrcIn0nO6VwU = BlendMode.Companion.m660getSrcIn0nO6VwU();
                        break;
                }
            } else {
                iM660getSrcIn0nO6VwU = BlendMode.Companion.m659getSrcAtop0nO6VwU();
            }
            int i2 = iM660getSrcIn0nO6VwU;
            float fM3673constructorimpl = Dp.m3673constructorimpl(dimension / resources.getDisplayMetrics().density);
            float fM3673constructorimpl2 = Dp.m3673constructorimpl(dimension2 / resources.getDisplayMetrics().density);
            typedArrayObtainAttributes.recycle();
            return new ImageVector.Builder(null, fM3673constructorimpl, fM3673constructorimpl2, namedFloat, namedFloat2, j, i2, namedBoolean, 1, null);
        }
        throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
    }

    /* JADX INFO: renamed from: getStrokeLineCap-CSYIeUk$default, reason: not valid java name */
    public static /* synthetic */ int m1498getStrokeLineCapCSYIeUk$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StrokeCap.Companion.m1099getButtKaPHkGw();
        }
        return m1497getStrokeLineCapCSYIeUk(i, i2);
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-kLtJ_vA$default, reason: not valid java name */
    public static /* synthetic */ int m1500getStrokeLineJoinkLtJ_vA$default(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = StrokeJoin.Companion.m1110getMiterLxFBmk8();
        }
        return m1499getStrokeLineJoinkLtJ_vA(i, i2);
    }

    public static final int parseCurrentVectorNode(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i) throws XmlPullParserException {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !SHAPE_GROUP.equals(androidVectorParser.getXmlParser().getName())) {
                return i;
            }
            for (int i2 = 0; i2 < i + 1; i2++) {
                builder.clearGroup();
            }
            return 0;
        }
        String name = androidVectorParser.getXmlParser().getName();
        if (name == null) {
            return i;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals(SHAPE_CLIP_PATH)) {
                return i;
            }
            parseClipPath(androidVectorParser, resources, theme, attributeSet, builder);
            return i + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals(SHAPE_PATH)) {
                return i;
            }
            parsePath(androidVectorParser, resources, theme, attributeSet, builder);
            return i;
        }
        if (iHashCode != 98629247 || !name.equals(SHAPE_GROUP)) {
            return i;
        }
        parseGroup(androidVectorParser, resources, theme, attributeSet, builder);
        return i;
    }

    private static final Brush obtainBrushFromComplexColor(getPrevious getprevious) {
        Shader shader = getprevious.read;
        if (shader == null && getprevious.write == 0) {
            return null;
        }
        return shader != null ? BrushKt.ShaderBrush(shader) : new SolidColor(ColorKt.Color(getprevious.write), null);
    }

    public static final boolean isAtEnd(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    /* JADX INFO: renamed from: getStrokeLineCap-CSYIeUk, reason: not valid java name */
    private static final int m1497getStrokeLineCapCSYIeUk(int i, int i2) {
        if (i == 0) {
            return StrokeCap.Companion.m1099getButtKaPHkGw();
        }
        if (i != 1) {
            return i != 2 ? i2 : StrokeCap.Companion.m1101getSquareKaPHkGw();
        }
        return StrokeCap.Companion.m1100getRoundKaPHkGw();
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-kLtJ_vA, reason: not valid java name */
    private static final int m1499getStrokeLineJoinkLtJ_vA(int i, int i2) {
        if (i == 0) {
            return StrokeJoin.Companion.m1110getMiterLxFBmk8();
        }
        if (i != 1) {
            return i != 2 ? i2 : StrokeJoin.Companion.m1109getBevelLxFBmk8();
        }
        return StrokeJoin.Companion.m1111getRoundLxFBmk8();
    }

    public static final XmlPullParser seekToStartTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i);
    }
}
