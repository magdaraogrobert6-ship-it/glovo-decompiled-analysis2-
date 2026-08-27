package com.roadrunner.common.data.api;

import androidx.activity.OnBackPressedCallback;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.api.client.PendingResultsCreator;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.Style;
import com.mapbox.maps.StyleObjectInfo;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.extension.localization.LocalizationKt;
import com.mapbox.maps.extension.localization.SupportedLanguagesKt;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.roadrunner.login.presentation.router.RouterActivity;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.text.RegexKt;
import o.OnEventTrackingSucceededListener;
import o.OnGoogleAdIdReadListener;
import o.UncheckedColordefault;
import o._get_messageWebView_lambda3;
import o.access900;
import o.accessdrawWithChildTracking;
import o.createFromParcel;
import o.fireWithUpdatedRectui;
import o.getAutoke2Ky5w;
import o.getCieXyz;
import o.getInAppMessageEventMap;
import o.getTextCenterJ6kI3mc;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isInsideContent;
import o.onContentCardClicked;
import o.onTouch;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import o.setJustificationMode;
import o.tintxETnrds;
import o.unpackMetaFocusable;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class MapApiError$$ExternalSyntheticLambda1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int read;

    public /* synthetic */ MapApiError$$ExternalSyntheticLambda1(int i) {
        this.read = i;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0439  */
    /* JADX WARN: Code duplicated, block: B:146:0x0441  */
    /* JADX WARN: Code duplicated, block: B:149:0x0472  */
    /* JADX WARN: Code duplicated, block: B:150:0x0475  */
    /* JADX WARN: Code duplicated, block: B:151:0x0478  */
    /* JADX WARN: Code duplicated, block: B:153:0x048e  */
    /* JADX WARN: Code duplicated, block: B:155:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:164:0x050f  */
    /* JADX WARN: Instruction removed from duplicated block: B:151:0x0478, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:153:0x048e, please report this as an issue */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        unpackMetaFocusable unpackmetafocusable;
        String str;
        getTextCenterJ6kI3mc gettextcenterj6ki3mc;
        createFromParcel createfromparcel;
        String str2;
        String str3;
        String[] strArr;
        String str4;
        String str5;
        String str6;
        String str7;
        Long lValueOf;
        Calendar calendar;
        List list;
        OnEventTrackingSucceededListener onEventTrackingSucceededListener;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        String str8 = "url";
        String str9 = "";
        switch (i2) {
            case 0:
                onTouch ontouch = (onTouch) obj;
                ontouch.getClass();
                ontouch.MediaDescriptionCompat = true;
                ontouch.MediaMetadataCompat = true;
                ontouch.MediaSessionCompatQueueItem = true;
                return createfromparcel2;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                String message = th.getMessage();
                return message == null ? "" : message;
            case 2:
                onTouch ontouch2 = (onTouch) obj;
                ontouch2.getClass();
                ontouch2.MediaDescriptionCompat = true;
                ontouch2.MediaSessionCompatQueueItem = true;
                return createfromparcel2;
            case 3:
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("SELECT * FROM country_config LIMIT 1");
                try {
                    int iWrite = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "id_country_config");
                    int iWrite2 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "name");
                    int iWrite3 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "country_code");
                    int iWrite4 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "country_iso_code");
                    int iWrite5 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "brand");
                    int iWrite6 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "currency");
                    int iWrite7 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "url");
                    int iWrite8 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "global_entity_id");
                    int iWrite9 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "register_url");
                    int iWrite10 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "privacy_policy_url");
                    if (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                        int i3 = serializer + 31;
                        write = i3 % Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                        long jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite);
                        String str10 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite2);
                        String str11 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite3);
                        String str12 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite4);
                        String str13 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite5);
                        String str14 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite6);
                        String str15 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite7);
                        String str16 = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite8);
                        String str17 = uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite9) ? null : uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite9);
                        if (uncheckedColordefaultRemoteActionCompatParcelizer.MediaSessionCompatQueueItem(iWrite10)) {
                            int i5 = serializer + 105;
                            write = i5 % Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                            str = null;
                        } else {
                            str = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite10);
                        }
                        unpackmetafocusable = new unpackMetaFocusable(jSerializer, str10, str11, str12, str13, str14, str15, str16, str17, str);
                        break;
                    } else {
                        unpackmetafocusable = null;
                    }
                    return unpackmetafocusable;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                }
            case 4:
                return createfromparcel2;
            case 5:
                List list2 = (List) obj;
                list2.getClass();
                Iterator it = list2.iterator();
                int iMediaSessionCompatQueueItem = 0;
                while (it.hasNext()) {
                    int i7 = write + 35;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    iMediaSessionCompatQueueItem += ((fireWithUpdatedRectui) it.next()).MediaSessionCompatQueueItem();
                }
                return Integer.valueOf(iMediaSessionCompatQueueItem);
            case 6:
                onTouch ontouch3 = (onTouch) obj;
                ontouch3.getClass();
                ontouch3.MediaDescriptionCompat = true;
                return createfromparcel2;
            case 7:
                tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
                tintxetnrds2.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds2.RemoteActionCompatParcelizer("SELECT * FROM session WHERE id_session = 14490");
                try {
                    int iWrite11 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "id_session");
                    int iWrite12 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, PushNotificationParserObj.COUNTRY_KEY);
                    int iWrite13 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "countryUrl");
                    int iWrite14 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "userId");
                    int iWrite15 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "contract");
                    int iWrite16 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer2, "cityId");
                    if (uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer()) {
                        gettextcenterj6ki3mc = new getTextCenterJ6kI3mc(uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite11), uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite12), uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite13), uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite14), uncheckedColordefaultRemoteActionCompatParcelizer2.read(iWrite15), uncheckedColordefaultRemoteActionCompatParcelizer2.serializer(iWrite16));
                        break;
                    } else {
                        gettextcenterj6ki3mc = null;
                    }
                    return gettextcenterj6ki3mc;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                }
            case 8:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 9:
                return new setJustificationMode(((Float) obj).floatValue());
            case 10:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 11:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 12:
                onTouch ontouch4 = (onTouch) obj;
                ontouch4.getClass();
                ontouch4.MediaDescriptionCompat = true;
                return createfromparcel2;
            case 13:
                isInsideContent isinsidecontent = (isInsideContent) obj;
                if (isinsidecontent == null) {
                    return null;
                }
                int i9 = write + 87;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return isinsidecontent.id;
            case 14:
                onTouch ontouch5 = (onTouch) obj;
                ontouch5.getClass();
                ontouch5.MediaDescriptionCompat = true;
                int i11 = serializer + 103;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    int i12 = 60 / 0;
                }
                return createfromparcel2;
            case 15:
                tintxETnrds tintxetnrds3 = (tintxETnrds) obj;
                tintxetnrds3.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer3 = tintxetnrds3.RemoteActionCompatParcelizer("SELECT COUNT(*) FROM in_app_message WHERE is_shown = ?");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer3.RemoteActionCompatParcelizer(1, 0L);
                    int iSerializer = uncheckedColordefaultRemoteActionCompatParcelizer3.IconCompatParcelizer() ? (int) uncheckedColordefaultRemoteActionCompatParcelizer3.serializer(0) : 0;
                    uncheckedColordefaultRemoteActionCompatParcelizer3.close();
                    return Integer.valueOf(iSerializer);
                } catch (Throwable th2) {
                    uncheckedColordefaultRemoteActionCompatParcelizer3.close();
                    throw th2;
                }
            case 16:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey() + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue();
            case 17:
                return RouterActivity.IconCompatParcelizer((OnBackPressedCallback) obj);
            case 18:
                Timber.RemoteActionCompatParcelizer.write((Throwable) obj);
                return createfromparcel2;
            case 19:
                Style style = (Style) obj;
                style.getClass();
                Locale locale = Locale.getDefault();
                locale.getClass();
                int i13 = 1803334089;
                int i14 = -1803334089;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{style.getStyleURI(), Style.STANDARD}, getCieXyz.write())).booleanValue()) {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Mapbox Standard style does not support client-side runtime localization. Consider using Mapbox internationalization capability instead: https://www.mapbox.com/blog/maps-internationalization-34-languages");
                    return null;
                }
                getInAppMessageEventMap getinappmessageeventmap = LocalizationKt.EXPRESSION_REGEX;
                String str18 = "name_" + locale.getLanguage();
                String[] strArr2 = SupportedLanguagesKt.supportedV7;
                boolean zIconCompatParcelizer = onContentCardClicked.IconCompatParcelizer(strArr2, str18);
                String[] strArr3 = SupportedLanguagesKt.supportedV8;
                if (zIconCompatParcelizer || onContentCardClicked.IconCompatParcelizer(strArr3, str18)) {
                    Iterator<T> it2 = style.getStyleLayers().iterator();
                    while (it2.hasNext()) {
                        int i15 = serializer + 61;
                        write = i15 % Fields.SpotShadowColor;
                        if (i15 % 2 != 0) {
                            ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((StyleObjectInfo) it2.next()).getType(), "symbol"}, getCieXyz.write())).booleanValue();
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        StyleObjectInfo styleObjectInfo = (StyleObjectInfo) it2.next();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), i13, i14, getCieXyz.write(), getCieXyz.write(), new Object[]{styleObjectInfo.getType(), "symbol"}, getCieXyz.write())).booleanValue()) {
                            String id = styleObjectInfo.getId();
                            id.getClass();
                            StylePropertyValue styleLayerProperty = style.getStyleLayerProperty(id, "text-field");
                            if (styleLayerProperty.getKind() != StylePropertyValueKind.EXPRESSION) {
                                createfromparcel = createfromparcel2;
                                str2 = str8;
                                str9 = str9;
                                str3 = str18;
                                strArr = strArr3;
                            } else {
                                String json = styleLayerProperty.getValue().toJson();
                                json.getClass();
                                Object contents = style.getStyleLayerProperty(id, "source").getValue().getContents();
                                if (contents instanceof String) {
                                    int i16 = write + 59;
                                    serializer = i16 % Fields.SpotShadowColor;
                                    int i17 = i16 % 2;
                                    str4 = (String) contents;
                                } else {
                                    str4 = null;
                                }
                                if (str4 == null) {
                                    str4 = str9;
                                }
                                Object contents2 = style.getStyleSourceProperty(str4, "type").getValue().getContents();
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{contents2 instanceof String ? (String) contents2 : null, "vector"}, getCieXyz.write())).booleanValue()) {
                                    Object contents3 = style.getStyleSourceProperty(str4, str8).getValue().getContents();
                                    String str19 = contents3 instanceof String ? (String) contents3 : null;
                                    if (str19 != null) {
                                        str3 = str18;
                                        str2 = str8;
                                        createfromparcel = createfromparcel2;
                                        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str19, (CharSequence) "mapbox.mapbox-streets-v8", false)) {
                                            String language = locale.getLanguage();
                                            language.getClass();
                                            if (!(!setCarryoverInAppMessage.RemoteActionCompatParcelizer(language, "zh", false))) {
                                                if (!locale.equals(Locale.TAIWAN)) {
                                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{locale.getScript(), "Hant"}, getCieXyz.write())).booleanValue()) {
                                                        str5 = "name_zh-Hans";
                                                    }
                                                    strArr = strArr3;
                                                }
                                                str7 = "name_zh-Hant";
                                            } else {
                                                str7 = "name_" + locale.getLanguage();
                                                if (!onContentCardClicked.IconCompatParcelizer(strArr3, str7)) {
                                                    MapboxLogger.logW("Localization", "Language " + locale.getDisplayLanguage() + " is not supported in the current style");
                                                }
                                            }
                                            str5 = str7;
                                            strArr = strArr3;
                                        } else {
                                            strArr = strArr3;
                                            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str19, (CharSequence) "mapbox.mapbox-streets-v7", false)) {
                                                int i18 = write + 123;
                                                serializer = i18 % Fields.SpotShadowColor;
                                                if (i18 % 2 == 0) {
                                                    String language2 = locale.getLanguage();
                                                    language2.getClass();
                                                    if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(language2, "zh", false)) {
                                                        str6 = "name_" + locale.getLanguage();
                                                        if (!onContentCardClicked.IconCompatParcelizer(strArr2, str6)) {
                                                            MapboxLogger.logW("Localization", "Language " + locale.getDisplayLanguage() + " is not supported in the current style");
                                                        }
                                                        str5 = str6;
                                                    } else if (locale.equals(Locale.SIMPLIFIED_CHINESE)) {
                                                        str5 = "name_zh-Hans";
                                                    } else {
                                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{locale.getScript(), "Hans"}, getCieXyz.write())).booleanValue()) {
                                                            str5 = "name_zh-Hans";
                                                        } else {
                                                            str5 = "name_zh";
                                                        }
                                                    }
                                                } else {
                                                    String language3 = locale.getLanguage();
                                                    language3.getClass();
                                                    if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(language3, "zh", false)) {
                                                        str6 = "name_" + locale.getLanguage();
                                                        if (!onContentCardClicked.IconCompatParcelizer(strArr2, str6)) {
                                                            MapboxLogger.logW("Localization", "Language " + locale.getDisplayLanguage() + " is not supported in the current style");
                                                        }
                                                        str5 = str6;
                                                    } else if (locale.equals(Locale.SIMPLIFIED_CHINESE)) {
                                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{locale.getScript(), "Hans"}, getCieXyz.write())).booleanValue()) {
                                                            str5 = "name_zh-Hans";
                                                        } else {
                                                            str5 = "name_zh";
                                                        }
                                                    } else {
                                                        str5 = "name_zh-Hans";
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        createfromparcel = createfromparcel2;
                                        str2 = str8;
                                        str3 = str18;
                                        strArr = strArr3;
                                    }
                                    str5 = null;
                                } else {
                                    createfromparcel = createfromparcel2;
                                    str2 = str8;
                                    str3 = str18;
                                    strArr = strArr3;
                                    str5 = null;
                                }
                                if (str5 == null) {
                                    str5 = str3;
                                }
                                Expression[] expressionArr = {new Expression(str5)};
                                Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("get");
                                expressionBuilder.addArgument(expressionArr[0]);
                                String json2 = expressionBuilder.build().toJson();
                                json2.getClass();
                                String strRemoteActionCompatParcelizer = LocalizationKt.EXPRESSION_ABBR_REGEX.RemoteActionCompatParcelizer(LocalizationKt.EXPRESSION_REGEX.RemoteActionCompatParcelizer(json, json2), json2);
                                Expected<String, Value> expectedFromJson = Value.fromJson(strRemoteActionCompatParcelizer);
                                expectedFromJson.getClass();
                                Value value = expectedFromJson.getValue();
                                if (value == null || style.setStyleLayerProperty(id, "text-field", value) == null) {
                                    MapboxLogger.logW("LocalizationPluginImpl", ff$$ExternalSyntheticOutline0.m(new StringBuilder("An error "), expectedFromJson.getError(), " occurred when converting ", strRemoteActionCompatParcelizer, " to a Value!"));
                                }
                            }
                        } else {
                            createfromparcel = createfromparcel2;
                            str2 = str8;
                            str9 = str9;
                            str3 = str18;
                            strArr = strArr3;
                        }
                        str9 = str9;
                        str18 = str3;
                        str8 = str2;
                        createfromparcel2 = createfromparcel;
                        strArr3 = strArr;
                        i13 = 1803334089;
                        i14 = -1803334089;
                    }
                } else {
                    MapboxLogger.logW("LocalizationPluginImpl", "Locale: " + locale + " is not supported.");
                }
                return createfromparcel2;
            case 20:
                Exception exc = (Exception) obj;
                exc.getClass();
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(exc, "Failed to get last known location", new Object[0]);
                return createfromparcel2;
            case 21:
                getAutoke2Ky5w getautoke2ky5w = (getAutoke2Ky5w) obj;
                getautoke2ky5w.getClass();
                return Boolean.valueOf(getautoke2ky5w instanceof accessdrawWithChildTracking);
            case 22:
                getAutoke2Ky5w getautoke2ky5w2 = (getAutoke2Ky5w) obj;
                getautoke2ky5w2.getClass();
                return (access900) getautoke2ky5w2.RemoteActionCompatParcelizer();
            case 23:
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((Throwable) obj, "dialogMessageRequestProxy.events failed.", new Object[0]);
                return createfromparcel2;
            case 24:
                onTouch ontouch6 = (onTouch) obj;
                ontouch6.getClass();
                ontouch6.MediaDescriptionCompat = true;
                return createfromparcel2;
            case 25:
                _get_messageWebView_lambda3 _get_messagewebview_lambda3 = (_get_messageWebView_lambda3) obj;
                _get_messagewebview_lambda3.getClass();
                return _get_messagewebview_lambda3.serializer();
            case 26:
                onTouch ontouch7 = (onTouch) obj;
                ontouch7.getClass();
                ontouch7.MediaDescriptionCompat = true;
                ontouch7.MediaMetadataCompat = true;
                return createfromparcel2;
            case 27:
                tintxETnrds tintxetnrds4 = (tintxETnrds) obj;
                tintxetnrds4.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer4 = tintxetnrds4.RemoteActionCompatParcelizer("DELETE FROM shift_info");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer4.IconCompatParcelizer();
                    return createfromparcel2;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer4.close();
                }
            case 28:
                tintxETnrds tintxetnrds5 = (tintxETnrds) obj;
                tintxetnrds5.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer5 = tintxetnrds5.RemoteActionCompatParcelizer("SELECT * FROM shift_info LIMIT 1");
                try {
                    int iWrite17 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "id");
                    int iWrite18 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "zone");
                    int iWrite19 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "city");
                    int iWrite20 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "cityId");
                    int iWrite21 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "contractType");
                    int iWrite22 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "status");
                    int iWrite23 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "statusEndingTime");
                    int iWrite24 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "isEndBreakAllowed");
                    int iWrite25 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "isBreakScheduled");
                    int iWrite26 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "isShiftExtensionAllowed");
                    int iWrite27 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "isShiftExtensionRequestedByRider");
                    int iWrite28 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "shifts");
                    int iWrite29 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "startingArea");
                    int iWrite30 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "timestamp");
                    int iWrite31 = UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer5, "balanceLimit");
                    if (!(!uncheckedColordefaultRemoteActionCompatParcelizer5.IconCompatParcelizer())) {
                        long jSerializer2 = uncheckedColordefaultRemoteActionCompatParcelizer5.serializer(iWrite17);
                        String str20 = uncheckedColordefaultRemoteActionCompatParcelizer5.read(iWrite18);
                        String str21 = uncheckedColordefaultRemoteActionCompatParcelizer5.read(iWrite19);
                        int iSerializer2 = (int) uncheckedColordefaultRemoteActionCompatParcelizer5.serializer(iWrite20);
                        String str22 = uncheckedColordefaultRemoteActionCompatParcelizer5.read(iWrite21);
                        String str23 = uncheckedColordefaultRemoteActionCompatParcelizer5.read(iWrite22);
                        if (uncheckedColordefaultRemoteActionCompatParcelizer5.MediaSessionCompatQueueItem(iWrite23)) {
                            int i19 = write + 15;
                            serializer = i19 % Fields.SpotShadowColor;
                            if (i19 % 2 == 0) {
                                throw null;
                            }
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(uncheckedColordefaultRemoteActionCompatParcelizer5.serializer(iWrite23));
                        }
                        if (lValueOf != null) {
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTimeInMillis(lValueOf.longValue());
                            calendar = calendar2;
                        } else {
                            calendar = null;
                        }
                        boolean z = ((int) uncheckedColordefaultRemoteActionCompatParcelizer5.serializer(iWrite24)) != 0;
                        boolean z2 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer5.serializer(iWrite25)) != 0;
                        boolean z3 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer5.serializer(iWrite26)) != 0;
                        boolean z4 = ((int) uncheckedColordefaultRemoteActionCompatParcelizer5.serializer(iWrite27)) != 0;
                        String str24 = !(uncheckedColordefaultRemoteActionCompatParcelizer5.MediaSessionCompatQueueItem(iWrite28) ^ true) ? null : uncheckedColordefaultRemoteActionCompatParcelizer5.read(iWrite28);
                        if (str24 == null) {
                            list = null;
                        } else {
                            list = (List) RegexKt.RemoteActionCompatParcelizer(PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), PendingResultsCreator.InstantPendingResult.serializer(), 218399833, new Object[]{str24}, -218399832, PendingResultsCreator.InstantPendingResult.serializer());
                        }
                        String str25 = uncheckedColordefaultRemoteActionCompatParcelizer5.MediaSessionCompatQueueItem(iWrite29) ? null : uncheckedColordefaultRemoteActionCompatParcelizer5.read(iWrite29);
                        OnGoogleAdIdReadListener onGoogleAdIdReadListenerSerializer = str25 == null ? null : r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.serializer(str25);
                        long jSerializer3 = uncheckedColordefaultRemoteActionCompatParcelizer5.serializer(iWrite30);
                        String str26 = uncheckedColordefaultRemoteActionCompatParcelizer5.MediaSessionCompatQueueItem(iWrite31) ? null : uncheckedColordefaultRemoteActionCompatParcelizer5.read(iWrite31);
                        onEventTrackingSucceededListener = new OnEventTrackingSucceededListener(jSerializer2, str20, str21, iSerializer2, str22, str23, calendar, z, z2, z3, z4, list, onGoogleAdIdReadListenerSerializer, jSerializer3, str26 == null ? null : TuplesKt.IconCompatParcelizer(str26));
                        break;
                    } else {
                        onEventTrackingSucceededListener = null;
                    }
                    uncheckedColordefaultRemoteActionCompatParcelizer5.close();
                    return onEventTrackingSucceededListener;
                } catch (Throwable th3) {
                    uncheckedColordefaultRemoteActionCompatParcelizer5.close();
                    throw th3;
                }
            default:
                tintxETnrds tintxetnrds6 = (tintxETnrds) obj;
                tintxetnrds6.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer6 = tintxetnrds6.RemoteActionCompatParcelizer("DELETE FROM work_opportunity");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer6.IconCompatParcelizer();
                    return createfromparcel2;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer6.close();
                }
        }
    }
}
