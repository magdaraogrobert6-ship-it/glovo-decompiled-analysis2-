package com.mapbox.maps.attribution;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.Base64;
import androidx.compose.ui.graphics.Fields;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.R;
import com.mapbox.maps.plugin.attribution.Attribution;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public class AttributionParser {
    private static final String COPYRIGHT = "© ";
    public static final Companion Companion;
    private static final String EMPTY_STRING = "";
    private static final List<String> IMPROVE_MAP_URLS;
    private static final String IMPROVE_THIS_MAP = "Improve this map";
    private static int IconCompatParcelizer = 1;
    private static int read;
    private static byte write;
    private final String attributionData;
    private final Set<Attribution> attributions;
    private final WeakReference<Context> context;
    private final List<Attribution> extraAttributions;
    private final boolean withCopyrightSign;
    private final boolean withImproveMap;
    private final boolean withMapboxAttribution;
    private final boolean withMapboxGeofencingConsent;
    private final boolean withMapboxPrivacyPolicy;
    private final boolean withTelemetryAttribution;

    public static final class Options {
        private static final Companion Companion = new Companion(null);

        @Deprecated
        public static final String HTML_STYLE_REGEX = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>";
        private String[] attributionDataStringArray;
        private final WeakReference<Context> context;
        private List<Attribution> extraAttributions;
        private List<String> stringLiteralArray;
        private boolean withCopyrightSign;
        private boolean withImproveMap;
        private boolean withMapboxAttribution;
        private boolean withMapboxGeofencingConsent;
        private boolean withMapboxPrivacyPolicy;
        private boolean withTelemetryAttribution;

        public final Options withCopyrightSign(boolean z) {
            this.withCopyrightSign = z;
            return this;
        }

        public final Options withImproveMap(boolean z) {
            this.withImproveMap = z;
            return this;
        }

        public final Options withMapboxAttribution(boolean z) {
            this.withMapboxAttribution = z;
            return this;
        }

        public final Options withMapboxGeofencingConsent(boolean z) {
            this.withMapboxGeofencingConsent = z;
            return this;
        }

        public final Options withMapboxPrivacyPolicy(boolean z) {
            this.withMapboxPrivacyPolicy = z;
            return this;
        }

        public final Options withTelemetryAttribution(boolean z) {
            this.withTelemetryAttribution = z;
            return this;
        }

        private final boolean hasValidHTMLTag(String str) {
            return Pattern.compile(HTML_STYLE_REGEX).matcher(str).find();
        }

        private final String parseAttribution(String[] strArr) {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                if (str.length() > 0) {
                    if (hasValidHTMLTag(str)) {
                        sb.append(str);
                    } else {
                        this.stringLiteralArray.add(str);
                    }
                }
            }
            return sb.toString();
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Options(Context context) {
            context.getClass();
            this.context = new WeakReference<>(context);
            this.withImproveMap = true;
            this.withCopyrightSign = true;
            this.withMapboxAttribution = true;
            this.withMapboxPrivacyPolicy = true;
            this.withMapboxGeofencingConsent = true;
            this.stringLiteralArray = new ArrayList();
            this.extraAttributions = instance_delegatelambda0.write;
        }

        public final Options withAttributionData(String... strArr) {
            strArr.getClass();
            this.attributionDataStringArray = (String[]) Arrays.copyOf(strArr, strArr.length);
            return this;
        }

        public final Options withExtraAttributions(List<Attribution> list) {
            list.getClass();
            this.extraAttributions = list;
            return this;
        }

        public final AttributionParser build() {
            String[] strArr = this.attributionDataStringArray;
            if (strArr == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Using builder without providing attribution data");
                return null;
            }
            strArr.getClass();
            AttributionParser attributionParser = new AttributionParser(this.context, parseAttribution(strArr), this.withImproveMap, this.withCopyrightSign, this.withTelemetryAttribution, this.withMapboxAttribution, this.withMapboxPrivacyPolicy, this.withMapboxGeofencingConsent, this.extraAttributions);
            attributionParser.parse();
            attributionParser.parseStringLiteralToAttributions(this.stringLiteralArray);
            return attributionParser;
        }
    }

    public final Set<Attribution> getAttributions() {
        return this.attributions;
    }

    private final boolean isImproveThisMapAnchor(String str) {
        Object[] objArr = {str, IMPROVE_THIS_MAP};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    private final void parseAttributions() {
        Spanned spannedFromHtml = Companion.fromHtml(this.attributionData);
        spannedFromHtml.getClass();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spannedFromHtml;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        uRLSpanArr.getClass();
        for (URLSpan uRLSpan : uRLSpanArr) {
            uRLSpan.getClass();
            parseUrlSpan(spannableStringBuilder, uRLSpan);
        }
    }

    public final String createAttributionString(boolean z) {
        String str;
        if (this.attributions.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(this.withCopyrightSign ? "" : COPYRIGHT);
        int i = 0;
        for (Attribution attribution : this.attributions) {
            i++;
            if (z) {
                str = attribution.title;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "OpenStreetMap"}, getCieXyz.write())).booleanValue()) {
                    str = "OSM";
                }
            } else {
                str = attribution.title;
            }
            sb.append(str);
            if (i != this.attributions.size()) {
                sb.append(" / ");
            }
        }
        return sb.toString();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Spanned fromHtml(String str) {
            Spanned spannedFromHtml = Html.fromHtml(str, 0);
            spannedFromHtml.getClass();
            return spannedFromHtml;
        }

        public final List<String> getIMPROVE_MAP_URLS() {
            return AttributionParser.IMPROVE_MAP_URLS;
        }

        private Companion() {
        }
    }

    static {
        IconCompatParcelizer();
        Companion = new Companion(null);
        ArrayList arrayList = new ArrayList();
        IMPROVE_MAP_URLS = arrayList;
        arrayList.add("https://www.mapbox.com/feedback/");
        arrayList.add("https://www.mapbox.com/map-feedback/");
        arrayList.add("https://apps.mapbox.com/feedback/");
    }

    public AttributionParser(WeakReference<Context> weakReference, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<Attribution> list) {
        weakReference.getClass();
        str.getClass();
        list.getClass();
        this.context = weakReference;
        this.attributionData = str;
        this.withImproveMap = z;
        this.withCopyrightSign = z2;
        this.withTelemetryAttribution = z3;
        this.withMapboxAttribution = z4;
        this.withMapboxPrivacyPolicy = z5;
        this.withMapboxGeofencingConsent = z6;
        this.extraAttributions = list;
        this.attributions = new LinkedHashSet();
    }

    public final void parse() {
        parseAttributions();
        addAdditionalAttributions();
    }

    private final boolean isValidForImproveThisMap(String str) {
        return this.withImproveMap || !IMPROVE_MAP_URLS.contains(str);
    }

    private final String parseAnchorValue(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
        char[] cArr = new char[spanEnd - spanStart];
        spannableStringBuilder.getChars(spanStart, spanEnd, cArr, 0);
        return stripCopyright(new String(cArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void parseStringLiteralToAttributions(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String string = Companion.fromHtml(it.next()).toString();
            if (!this.withCopyrightSign) {
                string = stripCopyright(string);
            }
            this.attributions.add(new Attribution(string, ""));
        }
    }

    private final void parseUrlSpan(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        String url = uRLSpan.getURL();
        url.getClass();
        if (isUrlValid(url)) {
            String anchorValue = parseAnchorValue(spannableStringBuilder, uRLSpan);
            if (isImproveThisMapAnchor(anchorValue)) {
                if (!this.withImproveMap) {
                    return;
                } else {
                    anchorValue = translateImproveThisMapAnchor(anchorValue);
                }
            }
            this.attributions.add(new Attribution(anchorValue, url));
        }
    }

    private final boolean isUrlValid(String str) {
        return isValidForImproveThisMap(str) && isValidForMapbox(str);
    }

    private final boolean isValidForMapbox(String str) {
        if (this.withMapboxAttribution) {
            return true;
        }
        return !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "https://www.mapbox.com/about/maps/"}, getCieXyz.write())).booleanValue();
    }

    public static /* synthetic */ String createAttributionString$default(AttributionParser attributionParser, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            return attributionParser.createAttributionString(z);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: createAttributionString");
        return null;
    }

    private final String stripCopyright(String str) {
        return (this.withCopyrightSign || !setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, COPYRIGHT, false)) ? str : str.substring(2, str.length());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040 A[PHI: r4
  0x0040: PHI (r4v7 java.lang.String) = (r4v6 java.lang.String), (r4v14 java.lang.String) binds: [B:10:0x003e, B:7:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    private final String translateImproveThisMapAnchor(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Context context = this.context.get();
        if (context != null) {
            int i4 = read + 65;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                str = context.getString(R.string.mapbox_telemetryImproveMap);
                int i5 = 70 / 0;
                if (str.startsWith("%('")) {
                    Object[] objArr = new Object[1];
                    a(str.substring(3), objArr);
                    str = ((String) objArr[0]).intern();
                }
            } else {
                str = context.getString(R.string.mapbox_telemetryImproveMap);
                if (str.startsWith("%('")) {
                    Object[] objArr2 = new Object[1];
                    a(str.substring(3), objArr2);
                    str = ((String) objArr2[0]).intern();
                }
            }
            str.getClass();
        }
        return str;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ write);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public final String createAttributionString() {
        return createAttributionString$default(this, false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    private final void addAdditionalAttributions() {
        String string;
        String string2;
        String string3;
        int i = 2 % 2;
        int i2 = read + 17;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Context context = this.context.get();
        if (this.withTelemetryAttribution) {
            Set<Attribution> set = this.attributions;
            if (context != null) {
                string3 = context.getString(R.string.mapbox_telemetrySettings);
                if (!(!string3.startsWith("%('"))) {
                    int i4 = read + 105;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    Object[] objArr = new Object[1];
                    a(string3.substring(3), objArr);
                    string3 = ((String) objArr[0]).intern();
                }
                if (string3 == null) {
                    string3 = "Mapbox Telemetry";
                }
            } else {
                string3 = "Mapbox Telemetry";
            }
            set.add(new Attribution(string3, "https://www.mapbox.com/telemetry/"));
        }
        if (this.withMapboxGeofencingConsent) {
            Set<Attribution> set2 = this.attributions;
            if (context != null) {
                string2 = context.getString(R.string.mapbox_geofencing_consent);
                if (string2.startsWith("%('")) {
                    Object[] objArr2 = new Object[1];
                    a(string2.substring(3), objArr2);
                    string2 = ((String) objArr2[0]).intern();
                }
                if (string2 == null) {
                    string2 = "Mapbox Geofencing";
                }
            } else {
                string2 = "Mapbox Geofencing";
            }
            set2.add(new Attribution(string2, "geofencing_url_marker"));
        }
        if (this.withMapboxPrivacyPolicy) {
            int i6 = IconCompatParcelizer + 53;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Set<Attribution> set3 = this.attributions;
            if (context != null) {
                string = context.getString(R.string.mapbox_privacy_policy);
                if (string.startsWith("%('")) {
                    int i7 = IconCompatParcelizer + 49;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    String strSubstring = string.substring(3);
                    Object[] objArr3 = new Object[1];
                    a(strSubstring, objArr3);
                    string = ((String) objArr3[0]).intern();
                }
                if (string == null) {
                    string = "Mapbox Privacy Policy";
                }
            } else {
                string = "Mapbox Privacy Policy";
            }
            set3.add(new Attribution(string, "https://www.mapbox.com/legal/privacy#product-privacy-policy/"));
        }
        this.attributions.addAll(this.extraAttributions);
    }

    static void IconCompatParcelizer() {
        write = (byte) -112;
    }
}
