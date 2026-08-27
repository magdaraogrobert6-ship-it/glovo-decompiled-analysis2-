package com.roadrunner.rrds.compose.component.actions.links;

import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Patterns;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.incognia.internal.pcn;
import com.roadrunner.rrds.compose.component.actions.links.LinkifyTextKt;
import com.sentiance.visitessentials.h$c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.buildMapping;
import o.canReadNonPlayIds;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LinkifyTextKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:51:0x013b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014b A[SYNTHETIC] */
    /* JADX INFO: renamed from: LinkifyPhoneNumberAndUrlText-cf5BqRc, reason: not valid java name */
    public static final void m5034LinkifyPhoneNumberAndUrlTextcf5BqRc(final String str, final TextStyle textStyle, final long j, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        Modifier modifier2;
        AnnotatedString.Builder builder;
        SpannableString spannableString;
        int i3;
        Object[] spans;
        h$c h_c;
        Iterator it;
        URLSpan uRLSpan;
        int spanStart;
        int spanEnd;
        int iPushLink;
        int i4;
        int i5 = 2 % 2;
        str.getClass();
        textStyle.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1346904177);
        if ((i & 6) == 0) {
            int i6 = write + 5;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(textStyle)) {
                int i8 = write + 121;
                int i9 = i8 % Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 85;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i13 = write + 31;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i2 |= getpostalcode.serializer(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i15 = i2 | 3072;
        if (getpostalcode.write(i15 & 1, (i15 & 1171) != 1170)) {
            modifier2 = Modifier.Companion;
            UriHandler uriHandler = (UriHandler) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalUriHandler());
            SpanStyle spanStyle = new SpanStyle(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getAccessibilityClassName(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (DefaultConstructorMarker) null);
            boolean z = (i15 & 14) == 4;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z) {
                builder = new AnnotatedString.Builder(0, 1, null);
                spannableString = new SpannableString(str);
                Linkify.addLinks(spannableString, Patterns.PHONE, "tel:", Linkify.sPhoneNumberMatchFilter, Linkify.sPhoneNumberTransformFilter);
                Linkify.addLinks(spannableString, Patterns.WEB_URL, "https://", (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
                i3 = 0;
                spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                spans.getClass();
                h_c = new h$c(5, spannableString);
                if (spans.length != 0) {
                    spans = Arrays.copyOf(spans, spans.length);
                    if (spans.length > 1) {
                        Arrays.sort(spans, h_c);
                    }
                }
                List listAsList = Arrays.asList(spans);
                listAsList.getClass();
                it = listAsList.iterator();
                while (it.hasNext()) {
                    uRLSpan = (URLSpan) it.next();
                    spanStart = spannableString.getSpanStart(uRLSpan);
                    spanEnd = spannableString.getSpanEnd(uRLSpan);
                    if (spanStart >= i3) {
                        builder.append(spannableString.subSequence(i3, spanStart));
                        builder.addStyle(spanStyle, spanStart, spanEnd);
                        String url = uRLSpan.getURL();
                        url.getClass();
                        Iterator it2 = it;
                        iPushLink = builder.pushLink(new LinkAnnotation.Url(url, new TextLinkStyles(spanStyle, null, null, null, 14, null), new canReadNonPlayIds(uriHandler, 1)));
                        builder.append(spannableString.subSequence(spanStart, spanEnd));
                        builder.pop(iPushLink);
                        it = it2;
                        i3 = spanEnd;
                    }
                }
                builder.append(spannableString.subSequence(i3, str.length()));
                objComponentActivity = builder.toAnnotatedString();
                getpostalcode.write(objComponentActivity);
            } else if (objComponentActivity == getCreditCardExpirationMonth.write) {
                int i16 = RemoteActionCompatParcelizer + 15;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                builder = new AnnotatedString.Builder(0, 1, null);
                spannableString = new SpannableString(str);
                Linkify.addLinks(spannableString, Patterns.PHONE, "tel:", Linkify.sPhoneNumberMatchFilter, Linkify.sPhoneNumberTransformFilter);
                Linkify.addLinks(spannableString, Patterns.WEB_URL, "https://", (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
                i3 = 0;
                spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                spans.getClass();
                h_c = new h$c(5, spannableString);
                if (spans.length != 0) {
                    spans = Arrays.copyOf(spans, spans.length);
                    if (spans.length > 1) {
                        Arrays.sort(spans, h_c);
                    }
                }
                List listAsList2 = Arrays.asList(spans);
                listAsList2.getClass();
                it = listAsList2.iterator();
                while (it.hasNext()) {
                    uRLSpan = (URLSpan) it.next();
                    spanStart = spannableString.getSpanStart(uRLSpan);
                    spanEnd = spannableString.getSpanEnd(uRLSpan);
                    if (spanStart >= i3) {
                        builder.append(spannableString.subSequence(i3, spanStart));
                        builder.addStyle(spanStyle, spanStart, spanEnd);
                        String url2 = uRLSpan.getURL();
                        url2.getClass();
                        Iterator it3 = it;
                        iPushLink = builder.pushLink(new LinkAnnotation.Url(url2, new TextLinkStyles(spanStyle, null, null, null, 14, null), new canReadNonPlayIds(uriHandler, 1)));
                        try {
                            builder.append(spannableString.subSequence(spanStart, spanEnd));
                            builder.pop(iPushLink);
                            it = it3;
                            i3 = spanEnd;
                        } catch (Throwable th) {
                            builder.pop(iPushLink);
                            throw th;
                        }
                    }
                }
                builder.append(spannableString.subSequence(i3, str.length()));
                objComponentActivity = builder.toAnnotatedString();
                getpostalcode.write(objComponentActivity);
            }
            TextKt.m132TextZ58ophY((AnnotatedString) objComponentActivity, modifier2, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, textStyle.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyle.spanStyle.m3016getColor0d7_KjU() : j, (15204351 & 2) != 0 ? textStyle.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyle.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyle.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (15204351 & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & Fields.RotationX) != 0 ? textStyle.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (15204351 & Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : null, (15204351 & Fields.CameraDistance) != 0 ? textStyle.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (15204351 & Fields.Clip) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (15204351 & Fields.CompositingStrategy) != 0 ? textStyle.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyle.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & Fields.ColorFilter) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (15204351 & Fields.BlendMode) != 0 ? textStyle.platformStyle : null, (15204351 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyle.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null), getpostalcode, (i15 >> 6) & 112, 0, 262140);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final Modifier modifier3 = modifier2;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.equalBoolean
                private static int MediaBrowserCompatMediaItem = 1;
                private static int MediaMetadataCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i18 = 2 % 2;
                    int i19 = MediaMetadataCompat + 75;
                    MediaBrowserCompatMediaItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    ((Integer) obj2).getClass();
                    LinkifyTextKt.m5034LinkifyPhoneNumberAndUrlTextcf5BqRc(str, textStyle, j, modifier3, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i21 = MediaMetadataCompat + 85;
                    MediaBrowserCompatMediaItem = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                    return createfromparcel;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d1  */
    /* JADX INFO: renamed from: LinkifyPlaceholder-mAkEFg8, reason: not valid java name */
    public static final void m5035LinkifyPlaceholdermAkEFg8(final String str, final String str2, final TextStyle textStyle, final long j, final Modifier modifier, long j2, FontWeight fontWeight, FontStyle fontStyle, final String str3, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode;
        final long j3;
        final FontWeight fontWeight2;
        final FontStyle fontStyle2;
        FontWeight bold;
        int i3;
        FontStyle fontStyleM3108getFontStyle4Lr2A7w;
        long j4;
        boolean z;
        String str4;
        AnnotatedString.Builder builder;
        SpannableString spannableString;
        URLSpan[] uRLSpanArr;
        int length;
        int i4;
        int iPushLink;
        int i5;
        int i6 = 2 % 2;
        str2.getClass();
        textStyle.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-8496072);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(str)) {
                int i7 = write + 113;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = RemoteActionCompatParcelizer + 89;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode2.read(textStyle);
                throw null;
            }
            i2 |= getpostalcode2.read(textStyle) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i10 = RemoteActionCompatParcelizer + 21;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode2.serializer(j) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.read(modifier) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        int i12 = 1572864 | i2;
        if ((12582912 & i) == 0) {
            int i13 = write + 1;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            i12 = 5767168 | i2;
        }
        if ((100663296 & i) == 0) {
            i12 |= getpostalcode2.read(str3) ? 67108864 : 33554432;
        }
        int i15 = 0;
        if (getpostalcode2.write(i12 & 1, (38347923 & i12) != 38347922)) {
            getpostalcode2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode2.PlaybackStateCompat()) {
                long jOnKeyDown = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onKeyDown();
                bold = FontWeight.Companion.getBold();
                i3 = i12 & (-29818881);
                fontStyleM3108getFontStyle4Lr2A7w = ((TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer())).m3108getFontStyle4Lr2A7w();
                j4 = jOnKeyDown;
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                j4 = j2;
                bold = fontWeight;
                fontStyleM3108getFontStyle4Lr2A7w = fontStyle;
                i3 = i12 & (-29818881);
            }
            getpostalcode2.RemoteActionCompatParcelizer();
            UriHandler uriHandler = (UriHandler) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalUriHandler());
            SpanStyle spanStyle = new SpanStyle(j4, 0L, bold, fontStyleM3108getFontStyle4Lr2A7w, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65522, (DefaultConstructorMarker) null);
            if ((i3 & 14) == 4) {
                int i16 = write + 5;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (z) {
                Pattern patternCompile = Pattern.compile(str2, 0);
                patternCompile.getClass();
                if (str3 == null) {
                    str4 = "";
                } else {
                    int i18 = RemoteActionCompatParcelizer + 21;
                    write = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    str4 = str3;
                }
                builder = new AnnotatedString.Builder(0, 1, null);
                spannableString = new SpannableString(str);
                Linkify.addLinks(spannableString, patternCompile, "http://");
                uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                uRLSpanArr.getClass();
                length = uRLSpanArr.length;
                i4 = 0;
                while (i15 < length) {
                    URLSpan uRLSpan = uRLSpanArr[i15];
                    int spanStart = spannableString.getSpanStart(uRLSpan);
                    int spanEnd = spannableString.getSpanEnd(uRLSpan);
                    builder.append(spannableString.subSequence(i4, spanStart));
                    builder.addStyle(spanStyle, spanStart, spanEnd);
                    URLSpan[] uRLSpanArr2 = uRLSpanArr;
                    iPushLink = builder.pushLink(new LinkAnnotation.Url(str4, new TextLinkStyles(spanStyle, null, null, null, 14, null), new canReadNonPlayIds(uriHandler, 0)));
                    builder.append(spannableString.subSequence(spanStart, spanEnd));
                    builder.pop(iPushLink);
                    i15++;
                    uRLSpanArr = uRLSpanArr2;
                    i4 = spanEnd;
                }
                builder.append(spannableString.subSequence(i4, str.length()));
                objComponentActivity = builder.toAnnotatedString();
                getpostalcode2.write(objComponentActivity);
            } else {
                int i20 = RemoteActionCompatParcelizer + 35;
                write = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    Pattern patternCompile2 = Pattern.compile(str2, 0);
                    patternCompile2.getClass();
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        int i110 = RemoteActionCompatParcelizer + 21;
                        write = i110 % Fields.SpotShadowColor;
                        int i111 = i110 % 2;
                        str4 = str3;
                    }
                    builder = new AnnotatedString.Builder(0, 1, null);
                    spannableString = new SpannableString(str);
                    Linkify.addLinks(spannableString, patternCompile2, "http://");
                    uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
                    uRLSpanArr.getClass();
                    length = uRLSpanArr.length;
                    i4 = 0;
                    while (i15 < length) {
                        URLSpan uRLSpan2 = uRLSpanArr[i15];
                        int spanStart2 = spannableString.getSpanStart(uRLSpan2);
                        int spanEnd2 = spannableString.getSpanEnd(uRLSpan2);
                        builder.append(spannableString.subSequence(i4, spanStart2));
                        builder.addStyle(spanStyle, spanStart2, spanEnd2);
                        URLSpan[] uRLSpanArr3 = uRLSpanArr;
                        iPushLink = builder.pushLink(new LinkAnnotation.Url(str4, new TextLinkStyles(spanStyle, null, null, null, 14, null), new canReadNonPlayIds(uriHandler, 0)));
                        try {
                            builder.append(spannableString.subSequence(spanStart2, spanEnd2));
                            builder.pop(iPushLink);
                            i15++;
                            uRLSpanArr = uRLSpanArr3;
                            i4 = spanEnd2;
                        } catch (Throwable th) {
                            builder.pop(iPushLink);
                            throw th;
                        }
                    }
                    builder.append(spannableString.subSequence(i4, str.length()));
                    objComponentActivity = builder.toAnnotatedString();
                    getpostalcode2.write(objComponentActivity);
                }
            }
            getpostalcode = getpostalcode2;
            TextKt.m132TextZ58ophY((AnnotatedString) objComponentActivity, modifier, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, textStyle.m3102copyp1EtxEg((15204351 & 1) != 0 ? textStyle.spanStyle.m3016getColor0d7_KjU() : j, (15204351 & 2) != 0 ? textStyle.spanStyle.m3017getFontSizeXSAIIZE() : 0L, (15204351 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyle.spanStyle.m3018getFontStyle4Lr2A7w() : null, (15204351 & 16) != 0 ? textStyle.spanStyle.m3019getFontSynthesisZQGJjVo() : null, (15204351 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (15204351 & Fields.SpotShadowColor) != 0 ? textStyle.spanStyle.m3020getLetterSpacingXSAIIZE() : 0L, (15204351 & Fields.RotationX) != 0 ? textStyle.spanStyle.m3015getBaselineShift5SSeXJ0() : null, (15204351 & Fields.RotationY) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (15204351 & Fields.RotationZ) != 0 ? textStyle.spanStyle.getLocaleList() : null, (15204351 & Fields.CameraDistance) != 0 ? textStyle.spanStyle.m3014getBackground0d7_KjU() : 0L, (15204351 & Fields.TransformOrigin) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (15204351 & Fields.Clip) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (15204351 & Fields.CompositingStrategy) != 0 ? textStyle.paragraphStyle.m2955getTextAligne0LSkKk() : 0, (15204351 & 65536) != 0 ? textStyle.paragraphStyle.m2957getTextDirections_7Xco() : 0, (15204351 & Fields.RenderEffect) != 0 ? textStyle.paragraphStyle.m2953getLineHeightXSAIIZE() : 0L, (15204351 & Fields.ColorFilter) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (15204351 & Fields.BlendMode) != 0 ? textStyle.platformStyle : null, (15204351 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle.paragraphStyle.m2952getLineBreakrAG3T2k() : 0, (15204351 & 4194304) != 0 ? textStyle.paragraphStyle.m2950getHyphensvmbZdU8() : 0, (15204351 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null), getpostalcode, (i3 >> 9) & 112, 0, 262140);
            j3 = j4;
            fontWeight2 = bold;
            fontStyle2 = fontStyleM3108getFontStyle4Lr2A7w;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            j3 = j2;
            fontWeight2 = fontWeight;
            fontStyle2 = fontStyle;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.createUuid
                private static int MediaSessionCompatToken = 1;
                private static int PlaybackStateCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i22 = 2 % 2;
                    int i23 = MediaSessionCompatToken + 95;
                    PlaybackStateCompat = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i24 = i23 % 2;
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    LinkifyTextKt.m5035LinkifyPlaceholdermAkEFg8(str, str2, textStyle, j, modifier, j3, fontWeight2, fontStyle2, str3, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i25 = MediaSessionCompatToken + 119;
                    PlaybackStateCompat = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i25 % 2 == 0) {
                        return createfromparcel;
                    }
                    throw null;
                }
            };
        }
    }
}
