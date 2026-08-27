package com.adjust.sdk.webbridge;

import android.net.Uri;
import android.webkit.WebView;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustEventFailure;
import com.adjust.sdk.AdjustEventSuccess;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.AdjustRemoteTrigger;
import com.adjust.sdk.AdjustSessionFailure;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.AdjustThirdPartySharingResult;
import com.adjust.sdk.ILogger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AdjustBridgeUtil {
    private static final String NATIVE_CALLBACK_NAME = "Adjust._nativeCallback";
    private static final String SET_BRIDGE_TOKEN_CALLBACK_NAME = "Adjust._setBridgeToken";

    public static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    public static String[] jsonArrayToArray(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.get(i).toString();
        }
        return strArr;
    }

    public static Boolean fieldToBoolean(Object obj) {
        if (obj == null) {
            return null;
        }
        String string = obj.toString();
        if (string.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (string.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Double fieldToDouble(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(obj.toString()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Integer fieldToInteger(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(obj.toString()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static Long fieldToLong(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(obj.toString()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String fieldToString(Object obj) {
        if (obj == null) {
            return null;
        }
        String string = obj.toString();
        if (string.equals("null")) {
            return null;
        }
        return string;
    }

    public static void sendDeeplinkToWebView(final WebView webView, final Uri uri) {
        if (webView != null) {
            webView.post(new Runnable() { // from class: com.adjust.sdk.webbridge.AdjustBridgeUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    Uri uri2 = uri;
                    webView.evaluateJavascript(ff$$ExternalSyntheticOutline0.m("if (typeof adjust_deeplink === 'function') { adjust_deeplink(", uri2 == null ? "null" : JSONObject.quote(uri2.toString()), "); }"), null);
                }
            });
        }
    }

    public static void execAdidCallbackCommand(WebView webView, String str, String str2) {
        String strQuote;
        if (str2 == null) {
            strQuote = "null";
        } else {
            strQuote = JSONObject.quote(str2);
        }
        execNativeCallback(webView, str, strQuote);
    }

    public static void execSingleValueCallback(WebView webView, String str, String str2) {
        String strQuote;
        if (str2 == null) {
            strQuote = "null";
        } else {
            strQuote = JSONObject.quote(str2);
        }
        execNativeCallback(webView, str, strQuote);
    }

    public static void execAttributionCallbackCommand(WebView webView, String str, AdjustAttribution adjustAttribution) {
        Object jSONObject;
        if (webView == null || str == null) {
            return;
        }
        try {
            if (adjustAttribution != null) {
                JSONObject jSONObject2 = new JSONObject();
                Object obj = adjustAttribution.trackerName;
                if (obj == null) {
                    obj = JSONObject.NULL;
                }
                jSONObject2.put("trackerName", obj);
                Object obj2 = adjustAttribution.trackerToken;
                if (obj2 == null) {
                    obj2 = JSONObject.NULL;
                }
                jSONObject2.put("trackerToken", obj2);
                Object obj3 = adjustAttribution.campaign;
                if (obj3 == null) {
                    obj3 = JSONObject.NULL;
                }
                jSONObject2.put("campaign", obj3);
                Object obj4 = adjustAttribution.network;
                if (obj4 == null) {
                    obj4 = JSONObject.NULL;
                }
                jSONObject2.put("network", obj4);
                Object obj5 = adjustAttribution.creative;
                if (obj5 == null) {
                    obj5 = JSONObject.NULL;
                }
                jSONObject2.put("creative", obj5);
                Object obj6 = adjustAttribution.adgroup;
                if (obj6 == null) {
                    obj6 = JSONObject.NULL;
                }
                jSONObject2.put("adgroup", obj6);
                Object obj7 = adjustAttribution.clickLabel;
                if (obj7 == null) {
                    obj7 = JSONObject.NULL;
                }
                jSONObject2.put("clickLabel", obj7);
                Object obj8 = adjustAttribution.costType;
                if (obj8 == null) {
                    obj8 = JSONObject.NULL;
                }
                jSONObject2.put("costType", obj8);
                Double d = adjustAttribution.costAmount;
                jSONObject2.put("costAmount", (d == null || d.isNaN()) ? 0.0d : adjustAttribution.costAmount.doubleValue());
                Object obj9 = adjustAttribution.costCurrency;
                if (obj9 == null) {
                    obj9 = JSONObject.NULL;
                }
                jSONObject2.put("costCurrency", obj9);
                Object obj10 = adjustAttribution.fbInstallReferrer;
                if (obj10 == null) {
                    obj10 = JSONObject.NULL;
                }
                jSONObject2.put("fbInstallReferrer", obj10);
                if (adjustAttribution.jsonResponse == null) {
                    jSONObject = JSONObject.NULL;
                } else {
                    jSONObject = new JSONObject(adjustAttribution.jsonResponse);
                }
                jSONObject2.put("jsonResponse", jSONObject);
                execNativeCallback(webView, str, jSONObject2.toString());
                return;
            }
            execNativeCallback(webView, str, "null");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void execEventFailureCallbackCommand(WebView webView, String str, AdjustEventFailure adjustEventFailure) {
        String strValueOf;
        if (webView == null || adjustEventFailure == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = adjustEventFailure.eventToken;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("eventToken", obj);
            Object obj2 = adjustEventFailure.message;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("message", obj2);
            Object obj3 = adjustEventFailure.adid;
            if (obj3 == null) {
                obj3 = JSONObject.NULL;
            }
            jSONObject.put("adid", obj3);
            Object obj4 = adjustEventFailure.timestamp;
            if (obj4 == null) {
                obj4 = JSONObject.NULL;
            }
            jSONObject.put("timestamp", obj4);
            if (adjustEventFailure.willRetry) {
                strValueOf = String.valueOf(true);
            } else {
                strValueOf = String.valueOf(false);
            }
            jSONObject.put("willRetry", strValueOf);
            Object obj5 = adjustEventFailure.callbackId;
            if (obj5 == null) {
                obj5 = JSONObject.NULL;
            }
            jSONObject.put("callbackId", obj5);
            Object obj6 = adjustEventFailure.jsonResponse;
            if (obj6 == null) {
                obj6 = JSONObject.NULL;
            }
            jSONObject.put("jsonResponse", obj6);
            execNativeCallback(webView, str, jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void execEventSuccessCallbackCommand(WebView webView, String str, AdjustEventSuccess adjustEventSuccess) {
        if (webView == null || adjustEventSuccess == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = adjustEventSuccess.eventToken;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("eventToken", obj);
            Object obj2 = adjustEventSuccess.message;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("message", obj2);
            Object obj3 = adjustEventSuccess.adid;
            if (obj3 == null) {
                obj3 = JSONObject.NULL;
            }
            jSONObject.put("adid", obj3);
            Object obj4 = adjustEventSuccess.timestamp;
            if (obj4 == null) {
                obj4 = JSONObject.NULL;
            }
            jSONObject.put("timestamp", obj4);
            Object obj5 = adjustEventSuccess.callbackId;
            if (obj5 == null) {
                obj5 = JSONObject.NULL;
            }
            jSONObject.put("callbackId", obj5);
            Object obj6 = adjustEventSuccess.jsonResponse;
            if (obj6 == null) {
                obj6 = JSONObject.NULL;
            }
            jSONObject.put("jsonResponse", obj6);
            execNativeCallback(webView, str, jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void execNativeCallback(final WebView webView, final String str, final String str2) {
        if (webView == null || str == null) {
            return;
        }
        webView.post(new Runnable() { // from class: com.adjust.sdk.webbridge.AdjustBridgeUtil.3
            @Override // java.lang.Runnable
            public void run() {
                StringBuilder sb = new StringBuilder("if (window.Adjust && typeof Adjust._nativeCallback === 'function') { Adjust._nativeCallback(");
                sb.append(JSONObject.quote(str));
                sb.append(", ");
                webView.evaluateJavascript(ff$$ExternalSyntheticOutline0.m(sb, str2, "); }"), null);
            }
        });
    }

    public static void execRemoteTriggerCallbackCommand(WebView webView, String str, AdjustRemoteTrigger adjustRemoteTrigger) {
        Object label;
        Object payload;
        if (webView == null || adjustRemoteTrigger == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (adjustRemoteTrigger.getLabel() == null) {
                label = JSONObject.NULL;
            } else {
                label = adjustRemoteTrigger.getLabel();
            }
            jSONObject.put("label", label);
            if (adjustRemoteTrigger.getPayload() == null) {
                payload = JSONObject.NULL;
            } else {
                payload = adjustRemoteTrigger.getPayload();
            }
            jSONObject.put("payload", payload);
            execNativeCallback(webView, str, jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void execSessionFailureCallbackCommand(WebView webView, String str, AdjustSessionFailure adjustSessionFailure) {
        String strValueOf;
        if (webView == null || adjustSessionFailure == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = adjustSessionFailure.message;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("message", obj);
            Object obj2 = adjustSessionFailure.adid;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("adid", obj2);
            Object obj3 = adjustSessionFailure.timestamp;
            if (obj3 == null) {
                obj3 = JSONObject.NULL;
            }
            jSONObject.put("timestamp", obj3);
            if (adjustSessionFailure.willRetry) {
                strValueOf = String.valueOf(true);
            } else {
                strValueOf = String.valueOf(false);
            }
            jSONObject.put("willRetry", strValueOf);
            Object obj4 = adjustSessionFailure.jsonResponse;
            if (obj4 == null) {
                obj4 = JSONObject.NULL;
            }
            jSONObject.put("jsonResponse", obj4);
            execNativeCallback(webView, str, jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void execSessionSuccessCallbackCommand(WebView webView, String str, AdjustSessionSuccess adjustSessionSuccess) {
        if (webView == null || adjustSessionSuccess == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Object obj = adjustSessionSuccess.message;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("message", obj);
            Object obj2 = adjustSessionSuccess.adid;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("adid", obj2);
            Object obj3 = adjustSessionSuccess.timestamp;
            if (obj3 == null) {
                obj3 = JSONObject.NULL;
            }
            jSONObject.put("timestamp", obj3);
            Object obj4 = adjustSessionSuccess.jsonResponse;
            if (obj4 == null) {
                obj4 = JSONObject.NULL;
            }
            jSONObject.put("jsonResponse", obj4);
            execNativeCallback(webView, str, jSONObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void execThirdPartySharingSettingsCallbackCommand(WebView webView, String str, AdjustThirdPartySharingResult adjustThirdPartySharingResult) {
        Object thirdPartySharingSettingsJson;
        if (webView == null || str == null) {
            return;
        }
        try {
            if (adjustThirdPartySharingResult != null) {
                JSONObject jSONObject = new JSONObject();
                if (adjustThirdPartySharingResult.getThirdPartySharingSettingsJson() == null) {
                    thirdPartySharingSettingsJson = JSONObject.NULL;
                } else {
                    thirdPartySharingSettingsJson = adjustThirdPartySharingResult.getThirdPartySharingSettingsJson();
                }
                jSONObject.put("thirdPartySharingSettingsJson", thirdPartySharingSettingsJson);
                execNativeCallback(webView, str, jSONObject.toString());
                return;
            }
            execNativeCallback(webView, str, "null");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendBridgeTokenToWebView(final WebView webView, final String str) {
        if (webView == null || str == null) {
            return;
        }
        webView.post(new Runnable() { // from class: com.adjust.sdk.webbridge.AdjustBridgeUtil.2
            @Override // java.lang.Runnable
            public void run() {
                webView.evaluateJavascript("if (window.Adjust && typeof Adjust._setBridgeToken === 'function') { Adjust._setBridgeToken(" + JSONObject.quote(str) + "); }", null);
            }
        });
    }
}
