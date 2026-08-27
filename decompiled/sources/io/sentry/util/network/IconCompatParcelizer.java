package io.sentry.util.network;

import bo.app.af$$ExternalSyntheticOutline0;
import com.adjust.sdk.Constants;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.android.gms.common.zzw;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Serializable;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.MediaSessionCompatQueueItem;
import o.getScaleXannotations;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
public abstract class IconCompatParcelizer {
    public abstract float getValue(getScaleXannotations getscalexannotations);

    public abstract void setValue(getScaleXannotations getscalexannotations, float f);

    public static NetworkBody read(byte[] bArr, String str, String str2, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        Object obj = null;
        if (bArr.length == 0) {
            return null;
        }
        int i = 0;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("image/") || lowerCase.contains("video/") || lowerCase.contains("audio/") || lowerCase.contains("application/octet-stream") || lowerCase.contains("application/pdf") || lowerCase.contains("application/zip") || lowerCase.contains("application/gzip")) {
                return new NetworkBody("[Binary data, " + bArr.length + " bytes, type: " + str + "]", i, obj);
            }
        }
        try {
            return IconCompatParcelizer(new String(bArr, 0, Math.min(bArr.length, 153600), str2), str, bArr.length > 153600, brazeActionParserExternalSyntheticLambda0);
        } catch (UnsupportedEncodingException e) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to decode bytes: " + e.getMessage(), new Object[0]);
            return new NetworkBody(af$$ExternalSyntheticOutline0.m(bArr.length, " bytes]", new StringBuilder("[Failed to decode bytes, ")), i, Collections.singletonList(read.BODY_PARSE_ERROR));
        }
    }

    public static NetworkBody IconCompatParcelizer(String str, String str2, boolean z, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        List list = null;
        if (str.isEmpty()) {
            return null;
        }
        int i = 0;
        if (str2 != null) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("application/x-www-form-urlencoded")) {
                try {
                    HashMap map = new HashMap();
                    for (String str3 : str.split(ContainerUtils.FIELD_DELIMITER, -1)) {
                        int iIndexOf = str3.indexOf(ContainerUtils.KEY_VALUE_DELIMITER);
                        if (iIndexOf > 0) {
                            String strDecode = URLDecoder.decode(str3.substring(0, iIndexOf), Constants.ENCODING);
                            String strDecode2 = iIndexOf < str3.length() + (-1) ? URLDecoder.decode(str3.substring(iIndexOf + 1), Constants.ENCODING) : "";
                            if (map.containsKey(strDecode)) {
                                Object obj = map.get(strDecode);
                                if (obj instanceof List) {
                                    ((List) obj).add(strDecode2);
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((String) obj);
                                    arrayList.add(strDecode2);
                                    map.put(strDecode, arrayList);
                                }
                            } else {
                                map.put(strDecode, strDecode2);
                            }
                        }
                    }
                    return new NetworkBody(map, i, z ? Collections.singletonList(read.TEXT_TRUNCATED) : null);
                } catch (UnsupportedEncodingException e) {
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to parse form data: " + e.getMessage(), new Object[0]);
                    return new NetworkBody(list, i, Collections.singletonList(read.BODY_PARSE_ERROR));
                }
            }
            if (lowerCase.contains(ConstantKt.CONTENT_TYPE_JSON)) {
                try {
                    io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new io.sentry.vendor.gson.stream.RemoteActionCompatParcelizer(new StringReader(str));
                    try {
                        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(18);
                        zzw zzwVar = (zzw) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write;
                        Serializable serializableIconCompatParcelizer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.IconCompatParcelizer(remoteActionCompatParcelizer, 0);
                        zzwVar.RemoteActionCompatParcelizer = serializableIconCompatParcelizer;
                        if (serializableIconCompatParcelizer == null && !z && !zzwVar.read && !zzwVar.write) {
                            NetworkBody networkBody = new NetworkBody(list, i, list);
                            remoteActionCompatParcelizer.close();
                            return networkBody;
                        }
                        NetworkBody networkBody2 = new NetworkBody(serializableIconCompatParcelizer, i, (z || zzwVar.write) ? Collections.singletonList(read.JSON_TRUNCATED) : zzwVar.read ? Collections.singletonList(read.INVALID_JSON) : null);
                        remoteActionCompatParcelizer.close();
                        return networkBody2;
                    } catch (Throwable th) {
                        try {
                            remoteActionCompatParcelizer.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, MediaSessionCompatQueueItem.read(e2, new StringBuilder("Failed to parse JSON: ")), new Object[0]);
                    return new NetworkBody(list, i, Collections.singletonList(read.INVALID_JSON));
                }
            }
        }
        return new NetworkBody(str, i, z ? Collections.singletonList(read.TEXT_TRUNCATED) : null);
    }
}
