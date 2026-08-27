package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.ui.graphics.vector.PathParser;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.getPrevious;
import o.removeNodeAtDepth;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidVectorParser {
    public static final int $stable = 8;
    private int config;
    public final PathParser pathParser;
    private final XmlPullParser xmlParser;

    public final XmlPullParser component1() {
        return this.xmlParser;
    }

    public final int component2() {
        return this.config;
    }

    public final int getConfig() {
        return this.config;
    }

    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public final void setConfig(int i) {
        this.config = i;
    }

    public final AndroidVectorParser copy(XmlPullParser xmlPullParser, int i) {
        return new AndroidVectorParser(xmlPullParser, i);
    }

    public final boolean getNamedBoolean(TypedArray typedArray, String str, int i, boolean z) {
        if (ExtrasKt.RemoteActionCompatParcelizer(this.xmlParser, str)) {
            z = typedArray.getBoolean(i, z);
        }
        updateConfig(typedArray.getChangingConfigurations());
        return z;
    }

    public final ColorStateList getNamedColorStateList(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        ColorStateList colorStateListRemoteActionCompatParcelizer = ExtrasKt.RemoteActionCompatParcelizer(typedArray, this.xmlParser, theme, str, i);
        updateConfig(typedArray.getChangingConfigurations());
        return colorStateListRemoteActionCompatParcelizer;
    }

    public final float getNamedFloat(TypedArray typedArray, String str, int i, float f) {
        if (ExtrasKt.RemoteActionCompatParcelizer(this.xmlParser, str)) {
            f = typedArray.getFloat(i, f);
        }
        updateConfig(typedArray.getChangingConfigurations());
        return f;
    }

    public final int getNamedInt(TypedArray typedArray, String str, int i, int i2) {
        if (ExtrasKt.RemoteActionCompatParcelizer(this.xmlParser, str)) {
            i2 = typedArray.getInt(i, i2);
        }
        updateConfig(typedArray.getChangingConfigurations());
        return i2;
    }

    public int hashCode() {
        return Integer.hashCode(this.config) + (this.xmlParser.hashCode() * 31);
    }

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i) {
        this.xmlParser = xmlPullParser;
        this.config = i;
        this.pathParser = new PathParser();
    }

    private final void updateConfig(int i) {
        this.config = i | this.config;
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i2 & 2) != 0) {
            i = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.xmlParser, androidVectorParser.xmlParser}, getCieXyz.write())).booleanValue() && this.config == androidVectorParser.config;
    }

    public final float getDimension(TypedArray typedArray, int i, float f) {
        float dimension = typedArray.getDimension(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(TypedArray typedArray, int i, float f) {
        float f2 = typedArray.getFloat(i, f);
        updateConfig(typedArray.getChangingConfigurations());
        return f2;
    }

    public final int getInt(TypedArray typedArray, int i, int i2) {
        int i3 = typedArray.getInt(i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return i3;
    }

    public final String getString(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    public final TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayRemoteActionCompatParcelizer = ExtrasKt.RemoteActionCompatParcelizer(resources, theme, attributeSet, iArr);
        updateConfig(typedArrayRemoteActionCompatParcelizer.getChangingConfigurations());
        return typedArrayRemoteActionCompatParcelizer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.xmlParser);
        sb.append(", config=");
        return af$$ExternalSyntheticOutline0.m(sb, this.config, ')');
    }

    public final getPrevious getNamedComplexColor(TypedArray typedArray, Resources.Theme theme, String str, int i, int i2) {
        getPrevious getpreviousIconCompatParcelizer = ExtrasKt.IconCompatParcelizer(typedArray, this.xmlParser, theme, str, i, i2);
        updateConfig(typedArray.getChangingConfigurations());
        return getpreviousIconCompatParcelizer;
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i2 & 2) != 0 ? 0 : i);
    }
}
