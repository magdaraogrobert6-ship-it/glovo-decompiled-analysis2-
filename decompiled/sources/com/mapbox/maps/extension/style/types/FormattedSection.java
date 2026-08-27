package com.mapbox.maps.extension.style.types;

import android.graphics.Color;
import androidx.annotation.Keep;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.Value;
import io.sentry.android.core.SentryLogcatAdapter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@LayersDsl
@Keep
public final class FormattedSection {
    private Double fontScale;
    private List<String> fontStack;
    private final String text;
    private String textColor;

    public final String component1() {
        return this.text;
    }

    public final Double component2() {
        return this.fontScale;
    }

    public final List<String> component3() {
        return this.fontStack;
    }

    public final String component4() {
        return this.textColor;
    }

    public final Double getFontScale() {
        return this.fontScale;
    }

    public final List<String> getFontStack() {
        return this.fontStack;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final void setFontScale(Double d) {
        this.fontScale = d;
    }

    public final void setFontStack(List<String> list) {
        this.fontStack = list;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode();
        Double d = this.fontScale;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        List<String> list = this.fontStack;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        String str = this.textColor;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final Value toValue$extension_style_release() {
        HashMap map = new HashMap();
        Double d = this.fontScale;
        if (d != null) {
            map.put("font-scale", new Value(d.doubleValue()));
        }
        List<String> list = this.fontStack;
        if (list != null) {
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Value((String) it.next()));
            }
            map.put("text-font", new Value((List<Value>) arrayList));
        }
        String str = this.textColor;
        if (str != null) {
            map.put("text-color", new Value(str));
        }
        return new Value((List<Value>) SQLite.read(new Value(this.text), new Value((HashMap<String, Value>) map)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormattedSection copy$default(FormattedSection formattedSection, String str, Double d, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formattedSection.text;
        }
        if ((i & 2) != 0) {
            d = formattedSection.fontScale;
        }
        if ((i & 4) != 0) {
            list = formattedSection.fontStack;
        }
        if ((i & 8) != 0) {
            str2 = formattedSection.textColor;
        }
        return formattedSection.copy(str, d, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormattedSection)) {
            return false;
        }
        FormattedSection formattedSection = (FormattedSection) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, formattedSection.text}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fontScale, formattedSection.fontScale}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fontStack, formattedSection.fontStack}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.textColor, formattedSection.textColor}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FormattedSection(text=");
        sb.append(this.text);
        sb.append(", fontScale=");
        sb.append(this.fontScale);
        sb.append(", fontStack=");
        sb.append(this.fontStack);
        sb.append(", textColor=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.textColor, ')');
    }

    public final FormattedSection copy(String str, Double d, List<String> list, String str2) {
        str.getClass();
        return new FormattedSection(str, d, list, str2);
    }

    public final int getTextColorAsInt() {
        Integer numValueOf;
        String str = this.textColor;
        if (str != null) {
            Matcher matcher = Pattern.compile("rgba?\\s*\\(\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,\\s*(\\d+\\.?\\d*)\\s*,?\\s*(\\d+\\.?\\d*)?\\s*\\)").matcher(str);
            matcher.getClass();
            if (matcher.matches() && matcher.groupCount() == 4) {
                String strGroup = matcher.group(4);
                float f = strGroup != null ? Float.parseFloat(strGroup) : 1.0f;
                String strGroup2 = matcher.group(1);
                strGroup2.getClass();
                int i = (int) Float.parseFloat(strGroup2);
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                int i2 = (int) Float.parseFloat(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                numValueOf = Integer.valueOf(Color.argb((int) ((f * 255.0f) + 0.5f), i, i2, (int) Float.parseFloat(strGroup4)));
            } else {
                SentryLogcatAdapter.serializer("ColorUtils", "Not a valid rgb/rgba value");
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Property textColor is not set.");
        return 0;
    }

    public /* synthetic */ FormattedSection(String str, Double d, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormattedSection(String str, Double d) {
        this(str, d, null, null, 12, null);
        str.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormattedSection(String str, Double d, List<String> list) {
        this(str, d, list, null, 8, null);
        str.getClass();
    }

    public final void setTextColorAsInt(int i) {
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.US);
        numberInstance.getClass();
        DecimalFormat decimalFormat = (DecimalFormat) numberInstance;
        decimalFormat.applyPattern("#.########");
        String str = decimalFormat.format(((double) ((i >> 24) & 255)) / 255.0d);
        str.getClass();
        this.textColor = String.format(Locale.US, "rgba(%d, %d, %d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf((i >> 16) & 255), Integer.valueOf((i >> 8) & 255), Integer.valueOf(i & 255), str}, 4));
    }

    public FormattedSection(String str, Double d, List<String> list, String str2) {
        str.getClass();
        this.text = str;
        this.fontScale = d;
        this.fontStack = list;
        this.textColor = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormattedSection(String str) {
        this(str, null, null, null, 14, null);
        str.getClass();
    }
}
