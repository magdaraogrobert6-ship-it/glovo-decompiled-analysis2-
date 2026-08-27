package com.adjust.sdk.webbridge;

import android.app.Application;
import android.net.Uri;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.AdjustEventFailure;
import com.adjust.sdk.AdjustEventSuccess;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.AdjustRemoteTrigger;
import com.adjust.sdk.AdjustSessionFailure;
import com.adjust.sdk.AdjustSessionSuccess;
import com.adjust.sdk.AdjustStoreInfo;
import com.adjust.sdk.AdjustThirdPartySharing;
import com.adjust.sdk.AdjustThirdPartySharingResult;
import com.adjust.sdk.LogLevel;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAmazonAdIdReadListener;
import com.adjust.sdk.OnAttributionChangedListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnDeferredDeeplinkResponseListener;
import com.adjust.sdk.OnEventTrackingFailedListener;
import com.adjust.sdk.OnEventTrackingSucceededListener;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.adjust.sdk.OnIsEnabledListener;
import com.adjust.sdk.OnRemoteTriggerListener;
import com.adjust.sdk.OnSdkVersionReadListener;
import com.adjust.sdk.OnSessionTrackingFailedListener;
import com.adjust.sdk.OnSessionTrackingSucceededListener;
import com.adjust.sdk.OnThirdPartySharingSettingsChangedListener;
import com.adjust.sdk.OnThirdPartySharingSettingsReadListener;
import com.deliveryhero.fwf_cache.UtilKt;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AdjustBridgeInstance {
    private static final String FB_JAVASCRIPT_INTERFACE_NAME_PREFIX = "fbmq_";
    private static final String JAVASCRIPT_INTERFACE_NAME = "AdjustBridge";
    private static final String LOG_LEVEL_ASSERT = "ASSERT";
    private static final String LOG_LEVEL_DEBUG = "DEBUG";
    private static final String LOG_LEVEL_ERROR = "ERROR";
    private static final String LOG_LEVEL_INFO = "INFO";
    private static final String LOG_LEVEL_SUPPRESS = "SUPPRESS";
    private static final String LOG_LEVEL_VERBOSE = "VERBOSE";
    private static final String LOG_LEVEL_WARN = "WARN";
    private Application application;
    private WebView webView;
    private boolean isInitialized = false;
    private boolean isOpeningDeferredDeeplinkEnabled = true;
    private FacebookSDKJSInterface facebookSDKJSInterface = null;
    private String adjustSdkPrefix = null;
    private boolean isBridgeSecurityEnabled = false;
    private String bridgeSecurityToken = null;

    public void setApplicationContext(Application application) {
        this.application = application;
    }

    private String generateBridgeToken() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 2);
    }

    public void registerFacebookSDKJSInterface() {
        String applicationId = FacebookSDKJSInterface.getApplicationId(this.application.getApplicationContext());
        AdjustFactory.getLogger().info("AdjustBridgeInstance fbApplicationId: %s", applicationId);
        if (applicationId == null) {
            return;
        }
        FacebookSDKJSInterface facebookSDKJSInterface = new FacebookSDKJSInterface();
        this.facebookSDKJSInterface = facebookSDKJSInterface;
        this.webView.addJavascriptInterface(facebookSDKJSInterface, FB_JAVASCRIPT_INTERFACE_NAME_PREFIX.concat(applicationId));
    }

    public AdjustBridgeInstance(Application application, WebView webView) {
        this.application = application;
        setWebView(webView);
    }

    public void setWebView(WebView webView) {
        this.webView = webView;
        webView.addJavascriptInterface(this, JAVASCRIPT_INTERFACE_NAME);
        enableBridgeSecurity();
    }

    private void enableBridgeSecurity() {
        if (!this.isBridgeSecurityEnabled) {
            this.isBridgeSecurityEnabled = true;
        }
        if (this.bridgeSecurityToken == null) {
            this.bridgeSecurityToken = generateBridgeToken();
        }
        AdjustBridgeUtil.sendBridgeTokenToWebView(this.webView, this.bridgeSecurityToken);
    }

    private boolean isInitialized() {
        if (this.webView == null) {
            AdjustBridgeUtil.getLogger().error("Webview missing. Call AdjustBridge.setWebView before", new Object[0]);
            return false;
        }
        if (this.application != null) {
            return true;
        }
        AdjustBridgeUtil.getLogger().error("Application context missing. Call AdjustBridge.setApplicationContext before", new Object[0]);
        return false;
    }

    @JavascriptInterface
    public void requestBridgeToken() {
        if (this.webView == null) {
            return;
        }
        enableBridgeSecurity();
    }

    private boolean isBridgeAuthorized(String str) {
        if (!this.isBridgeSecurityEnabled) {
            return true;
        }
        String str2 = this.bridgeSecurityToken;
        if (str2 == null) {
            return false;
        }
        return str2.equals(str);
    }

    @JavascriptInterface
    public void addGlobalCallbackParameter(String str, String str2, String str3) {
        if (isBridgeAuthorized(str3) && isInitialized()) {
            Adjust.addGlobalCallbackParameter(str, str2);
        }
    }

    @JavascriptInterface
    public void addGlobalPartnerParameter(String str, String str2, String str3) {
        if (isBridgeAuthorized(str3) && isInitialized()) {
            Adjust.addGlobalPartnerParameter(str, str2);
        }
    }

    @JavascriptInterface
    public void disable(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.disable();
        }
    }

    @JavascriptInterface
    public void disableCoppaComplianceInDelay(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.disableCoppaComplianceInDelay();
        }
    }

    @JavascriptInterface
    public void disablePlayStoreKidsComplianceInDelay(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.disablePlayStoreKidsComplianceInDelay();
        }
    }

    @JavascriptInterface
    public void enable(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.enable();
        }
    }

    @JavascriptInterface
    public void enableCoppaComplianceInDelay(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.enableCoppaComplianceInDelay();
        }
    }

    @JavascriptInterface
    public void enablePlayStoreKidsComplianceInDelay(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.enablePlayStoreKidsComplianceInDelay();
        }
    }

    @JavascriptInterface
    public void endFirstSessionDelay(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.endFirstSessionDelay();
        }
    }

    @JavascriptInterface
    public void fbPixelEvent(String str, String str2, String str3, String str4) {
        if (isBridgeAuthorized(str4)) {
            this.facebookSDKJSInterface.sendEvent(str, str2, str3);
        }
    }

    @JavascriptInterface
    public void gdprForgetMe(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.gdprForgetMe(this.application.getApplicationContext());
        }
    }

    @JavascriptInterface
    public void getAdid(final String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.getAdid(new OnAdidReadListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.12
                @Override // com.adjust.sdk.OnAdidReadListener
                public void onAdidRead(String str3) {
                    AdjustBridgeUtil.execSingleValueCallback(AdjustBridgeInstance.this.webView, str, str3);
                }
            });
        }
    }

    @JavascriptInterface
    public void getAdidWithTimeout(long j, final String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.getAdidWithTimeout(this.application.getApplicationContext(), j, new OnAdidReadListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.13
                @Override // com.adjust.sdk.OnAdidReadListener
                public void onAdidRead(String str3) {
                    AdjustBridgeUtil.execAdidCallbackCommand(AdjustBridgeInstance.this.webView, str, str3);
                }
            });
        }
    }

    @JavascriptInterface
    public void getAmazonAdId(final String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.getAmazonAdId(this.application.getApplicationContext(), new OnAmazonAdIdReadListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.11
                @Override // com.adjust.sdk.OnAmazonAdIdReadListener
                public void onAmazonAdIdRead(String str3) {
                    AdjustBridgeUtil.execSingleValueCallback(AdjustBridgeInstance.this.webView, str, str3);
                }
            });
        }
    }

    @JavascriptInterface
    public void getAttribution(final String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.getAttribution(new OnAttributionReadListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.14
                @Override // com.adjust.sdk.OnAttributionReadListener
                public void onAttributionRead(AdjustAttribution adjustAttribution) {
                    AdjustBridgeUtil.execAttributionCallbackCommand(AdjustBridgeInstance.this.webView, str, adjustAttribution);
                }
            });
        }
    }

    @JavascriptInterface
    public void getAttributionWithTimeout(long j, final String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.getAttributionWithTimeout(this.application.getApplicationContext(), j, new OnAttributionReadListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.15
                @Override // com.adjust.sdk.OnAttributionReadListener
                public void onAttributionRead(AdjustAttribution adjustAttribution) {
                    AdjustBridgeUtil.execAttributionCallbackCommand(AdjustBridgeInstance.this.webView, str, adjustAttribution);
                }
            });
        }
    }

    @JavascriptInterface
    public void getGoogleAdId(final String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.getGoogleAdId(this.application.getApplicationContext(), new OnGoogleAdIdReadListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.10
                @Override // com.adjust.sdk.OnGoogleAdIdReadListener
                public void onGoogleAdIdRead(String str3) {
                    AdjustBridgeUtil.execSingleValueCallback(AdjustBridgeInstance.this.webView, str, str3);
                }
            });
        }
    }

    @JavascriptInterface
    public void getSdkVersion(final String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.getSdkVersion(new OnSdkVersionReadListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.17
                @Override // com.adjust.sdk.OnSdkVersionReadListener
                public void onSdkVersionRead(String str3) {
                    AdjustBridgeUtil.execSingleValueCallback(AdjustBridgeInstance.this.webView, str, str3);
                }
            });
        }
    }

    @JavascriptInterface
    public void getThirdPartySharingSettingsWithTimeout(long j, final String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.getThirdPartySharingSettingsWithTimeout(this.application.getApplicationContext(), j, new OnThirdPartySharingSettingsReadListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.16
                @Override // com.adjust.sdk.OnThirdPartySharingSettingsReadListener
                public void onThirdPartySharingSettingsRead(AdjustThirdPartySharingResult adjustThirdPartySharingResult) {
                    AdjustBridgeUtil.execThirdPartySharingSettingsCallbackCommand(AdjustBridgeInstance.this.webView, str, adjustThirdPartySharingResult);
                }
            });
        }
    }

    @JavascriptInterface
    public void isEnabled(final String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.isEnabled(this.application.getApplicationContext(), new OnIsEnabledListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.9
                @Override // com.adjust.sdk.OnIsEnabledListener
                public void onIsEnabledRead(boolean z) {
                    AdjustBridgeUtil.execSingleValueCallback(AdjustBridgeInstance.this.webView, str, String.valueOf(z));
                }
            });
        }
    }

    @JavascriptInterface
    public void onPause(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.onPause();
        }
    }

    @JavascriptInterface
    public void onResume(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.onResume();
        }
    }

    @JavascriptInterface
    public void removeGlobalCallbackParameter(String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.removeGlobalCallbackParameter(str);
        }
    }

    @JavascriptInterface
    public void removeGlobalCallbackParameters(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.removeGlobalCallbackParameters();
        }
    }

    @JavascriptInterface
    public void removeGlobalPartnerParameter(String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.removeGlobalPartnerParameter(str);
        }
    }

    @JavascriptInterface
    public void removeGlobalPartnerParameters(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.removeGlobalPartnerParameters();
        }
    }

    @JavascriptInterface
    public void setExternalDeviceIdInDelay(String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.setExternalDeviceIdInDelay(str);
        }
    }

    @JavascriptInterface
    public void setReferrer(String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            Adjust.setReferrer(str, this.application.getApplicationContext());
        }
    }

    @JavascriptInterface
    public void switchBackToOnlineMode(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.switchBackToOnlineMode();
        }
    }

    @JavascriptInterface
    public void switchToOfflineMode(String str) {
        if (isBridgeAuthorized(str) && isInitialized()) {
            Adjust.switchToOfflineMode();
        }
    }

    @JavascriptInterface
    public void trackEvent(String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Object obj = jSONObject.get("eventToken");
                Object obj2 = jSONObject.get("revenue");
                Object obj3 = jSONObject.get("currency");
                Object obj4 = jSONObject.get("callbackParameters");
                Object obj5 = jSONObject.get("partnerParameters");
                Object obj6 = jSONObject.get("deduplicationId");
                Object obj7 = jSONObject.get("callbackId");
                AdjustEvent adjustEvent = new AdjustEvent(AdjustBridgeUtil.fieldToString(obj));
                if (adjustEvent.isValid()) {
                    Double dFieldToDouble = AdjustBridgeUtil.fieldToDouble(obj2);
                    String strFieldToString = AdjustBridgeUtil.fieldToString(obj3);
                    if (dFieldToDouble != null && strFieldToString != null) {
                        adjustEvent.setRevenue(dFieldToDouble.doubleValue(), strFieldToString);
                    }
                    String[] strArrJsonArrayToArray = AdjustBridgeUtil.jsonArrayToArray((JSONArray) obj4);
                    if (strArrJsonArrayToArray != null) {
                        for (int i = 0; i < strArrJsonArrayToArray.length; i += 2) {
                            adjustEvent.addCallbackParameter(strArrJsonArrayToArray[i], strArrJsonArrayToArray[i + 1]);
                        }
                    }
                    String[] strArrJsonArrayToArray2 = AdjustBridgeUtil.jsonArrayToArray((JSONArray) obj5);
                    if (strArrJsonArrayToArray2 != null) {
                        for (int i2 = 0; i2 < strArrJsonArrayToArray2.length; i2 += 2) {
                            adjustEvent.addPartnerParameter(strArrJsonArrayToArray2[i2], strArrJsonArrayToArray2[i2 + 1]);
                        }
                    }
                    String strFieldToString2 = AdjustBridgeUtil.fieldToString(obj6);
                    if (strFieldToString2 != null) {
                        adjustEvent.setDeduplicationId(strFieldToString2);
                    }
                    String strFieldToString3 = AdjustBridgeUtil.fieldToString(obj7);
                    if (strFieldToString3 != null) {
                        adjustEvent.setCallbackId(strFieldToString3);
                    }
                    Adjust.trackEvent(adjustEvent);
                }
            } catch (Exception e) {
                AdjustFactory.getLogger().error("AdjustBridgeInstance trackEvent: %s", e.getMessage());
            }
        }
    }

    @JavascriptInterface
    public void trackMeasurementConsent(String str, String str2) {
        Boolean boolFieldToBoolean;
        if (isBridgeAuthorized(str2) && isInitialized() && (boolFieldToBoolean = AdjustBridgeUtil.fieldToBoolean(str)) != null) {
            Adjust.trackMeasurementConsent(boolFieldToBoolean.booleanValue());
        }
    }

    @JavascriptInterface
    public void trackThirdPartySharing(String str, String str2) {
        if (isBridgeAuthorized(str2) && isInitialized()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Object obj = jSONObject.get("isEnabled");
                Object obj2 = jSONObject.get("granularOptions");
                Object obj3 = jSONObject.get("partnerSharingSettings");
                AdjustThirdPartySharing adjustThirdPartySharing = new AdjustThirdPartySharing(AdjustBridgeUtil.fieldToBoolean(obj));
                String[] strArrJsonArrayToArray = AdjustBridgeUtil.jsonArrayToArray((JSONArray) obj2);
                if (strArrJsonArrayToArray != null) {
                    for (int i = 0; i < strArrJsonArrayToArray.length; i += 3) {
                        adjustThirdPartySharing.addGranularOption(strArrJsonArrayToArray[i], strArrJsonArrayToArray[i + 1], strArrJsonArrayToArray[i + 2]);
                    }
                }
                String[] strArrJsonArrayToArray2 = AdjustBridgeUtil.jsonArrayToArray((JSONArray) obj3);
                if (strArrJsonArrayToArray2 != null) {
                    for (int i2 = 0; i2 < strArrJsonArrayToArray2.length; i2 += 3) {
                        String str3 = strArrJsonArrayToArray2[i2];
                        String str4 = strArrJsonArrayToArray2[i2 + 1];
                        Boolean boolFieldToBoolean = AdjustBridgeUtil.fieldToBoolean(strArrJsonArrayToArray2[i2 + 2]);
                        if (boolFieldToBoolean != null) {
                            adjustThirdPartySharing.addPartnerSharingSetting(str3, str4, boolFieldToBoolean.booleanValue());
                        } else {
                            AdjustFactory.getLogger().error("Cannot add partner sharing setting with non boolean value", new Object[0]);
                        }
                    }
                }
                Adjust.trackThirdPartySharing(adjustThirdPartySharing);
            } catch (Exception e) {
                AdjustFactory.getLogger().error("AdjustBridgeInstance trackThirdPartySharing: %s", e.getMessage());
            }
        }
    }

    public void unregister() {
        if (isInitialized()) {
            this.webView.removeJavascriptInterface(JAVASCRIPT_INTERFACE_NAME);
            unregisterFacebookSDKJSInterface();
            this.application = null;
            this.webView = null;
            this.isInitialized = false;
            this.isBridgeSecurityEnabled = false;
            this.bridgeSecurityToken = null;
        }
    }

    public void unregisterFacebookSDKJSInterface() {
        String applicationId;
        if (!isInitialized() || this.facebookSDKJSInterface == null || (applicationId = FacebookSDKJSInterface.getApplicationId(this.application.getApplicationContext())) == null) {
            return;
        }
        this.webView.removeJavascriptInterface(FB_JAVASCRIPT_INTERFACE_NAME_PREFIX.concat(applicationId));
        this.facebookSDKJSInterface = null;
    }

    @JavascriptInterface
    public void initSdk(String str, String str2) {
        AdjustConfig adjustConfig;
        FacebookSDKJSInterface facebookSDKJSInterface;
        if (isBridgeAuthorized(str2)) {
            if (this.isInitialized) {
                AdjustBridgeUtil.getLogger().warn("Adjust bridge is already initialized. Ignoring further attempts", new Object[0]);
                return;
            }
            if (isInitialized()) {
                try {
                    AdjustBridgeUtil.getLogger().verbose("Web bridge onCreate adjustConfigString: " + str, new Object[0]);
                    JSONObject jSONObject = new JSONObject(str);
                    Object obj = jSONObject.get("appToken");
                    Object obj2 = jSONObject.get(UtilKt.ENVIRONMENT_KEY);
                    Object obj3 = jSONObject.get("allowSuppressLogLevel");
                    Object obj4 = jSONObject.get("isSendingInBackgroundEnabled");
                    Object obj5 = jSONObject.get("logLevel");
                    Object obj6 = jSONObject.get("sdkPrefix");
                    Object obj7 = jSONObject.get("processName");
                    Object obj8 = jSONObject.get("defaultTracker");
                    Object obj9 = jSONObject.get("externalDeviceId");
                    Object obj10 = jSONObject.get("attributionCallbackName");
                    Object obj11 = jSONObject.get("thirdPartySharingSettingsChangedCallbackName");
                    Object obj12 = jSONObject.get("isCostDataInAttributionEnabled");
                    Object obj13 = jSONObject.get("eventSuccessCallbackName");
                    Object obj14 = jSONObject.get("eventFailureCallbackName");
                    Object obj15 = jSONObject.get("sessionSuccessCallbackName");
                    Object obj16 = jSONObject.get("sessionFailureCallbackName");
                    Object obj17 = jSONObject.get("isOpeningDeferredDeeplinkEnabled");
                    Object obj18 = jSONObject.get("deferredDeeplinkCallbackName");
                    Object obj19 = jSONObject.get("remoteTriggerCallbackName");
                    Object obj20 = jSONObject.get("fbPixelDefaultEventToken");
                    Object obj21 = jSONObject.get("fbPixelMapping");
                    Object obj22 = jSONObject.get("urlStrategyDomains");
                    Object obj23 = jSONObject.get("useSubdomains");
                    Object obj24 = jSONObject.get("isDataResidency");
                    Object obj25 = jSONObject.get("isPreinstallTrackingEnabled");
                    Object obj26 = jSONObject.get("preinstallFilePath");
                    Object obj27 = jSONObject.get("coppaComplianceEnabled");
                    Object obj28 = jSONObject.get("playStoreKidsComplianceEnabled");
                    Object obj29 = jSONObject.get("fbAppId");
                    Object obj30 = jSONObject.get("shouldReadDeviceIdsOnce");
                    Object obj31 = jSONObject.get("eventDeduplicationIdsMaxSize");
                    Object obj32 = jSONObject.get("isFirstSessionDelayEnabled");
                    Object obj33 = jSONObject.get("storeInfo");
                    Object obj34 = jSONObject.get("isAppSetIdReadingEnabled");
                    Object obj35 = jSONObject.get("isFbIdReadingEnabled");
                    String strFieldToString = AdjustBridgeUtil.fieldToString(obj);
                    String strFieldToString2 = AdjustBridgeUtil.fieldToString(obj2);
                    Boolean boolFieldToBoolean = AdjustBridgeUtil.fieldToBoolean(obj3);
                    if (boolFieldToBoolean == null) {
                        adjustConfig = new AdjustConfig(this.application.getApplicationContext(), strFieldToString, strFieldToString2);
                    } else {
                        adjustConfig = new AdjustConfig(this.application.getApplicationContext(), strFieldToString, strFieldToString2, boolFieldToBoolean.booleanValue());
                    }
                    if (adjustConfig.isValid()) {
                        Boolean boolFieldToBoolean2 = AdjustBridgeUtil.fieldToBoolean(obj4);
                        if (boolFieldToBoolean2 != null && boolFieldToBoolean2.booleanValue()) {
                            adjustConfig.enableSendingInBackground();
                        }
                        String strFieldToString3 = AdjustBridgeUtil.fieldToString(obj5);
                        if (strFieldToString3 != null) {
                            if (strFieldToString3.equalsIgnoreCase(LOG_LEVEL_VERBOSE)) {
                                adjustConfig.setLogLevel(LogLevel.VERBOSE);
                            } else if (strFieldToString3.equalsIgnoreCase(LOG_LEVEL_DEBUG)) {
                                adjustConfig.setLogLevel(LogLevel.DEBUG);
                            } else if (strFieldToString3.equalsIgnoreCase(LOG_LEVEL_INFO)) {
                                adjustConfig.setLogLevel(LogLevel.INFO);
                            } else if (strFieldToString3.equalsIgnoreCase(LOG_LEVEL_WARN)) {
                                adjustConfig.setLogLevel(LogLevel.WARN);
                            } else if (strFieldToString3.equalsIgnoreCase(LOG_LEVEL_ERROR)) {
                                adjustConfig.setLogLevel(LogLevel.ERROR);
                            } else if (strFieldToString3.equalsIgnoreCase(LOG_LEVEL_ASSERT)) {
                                adjustConfig.setLogLevel(LogLevel.ASSERT);
                            } else if (strFieldToString3.equalsIgnoreCase(LOG_LEVEL_SUPPRESS)) {
                                adjustConfig.setLogLevel(LogLevel.SUPPRESS);
                            }
                        }
                        String strFieldToString4 = AdjustBridgeUtil.fieldToString(obj6);
                        if (strFieldToString4 != null) {
                            adjustConfig.setSdkPrefix(strFieldToString4);
                            this.adjustSdkPrefix = strFieldToString4;
                        }
                        String strFieldToString5 = AdjustBridgeUtil.fieldToString(obj7);
                        if (strFieldToString5 != null) {
                            adjustConfig.setProcessName(strFieldToString5);
                        }
                        String strFieldToString6 = AdjustBridgeUtil.fieldToString(obj8);
                        if (strFieldToString6 != null) {
                            adjustConfig.setDefaultTracker(strFieldToString6);
                        }
                        String strFieldToString7 = AdjustBridgeUtil.fieldToString(obj9);
                        if (strFieldToString7 != null) {
                            adjustConfig.setExternalDeviceId(strFieldToString7);
                        }
                        final String strFieldToString8 = AdjustBridgeUtil.fieldToString(obj10);
                        if (strFieldToString8 != null) {
                            adjustConfig.setOnAttributionChangedListener(new OnAttributionChangedListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.1
                                @Override // com.adjust.sdk.OnAttributionChangedListener
                                public void onAttributionChanged(AdjustAttribution adjustAttribution) {
                                    AdjustBridgeUtil.execAttributionCallbackCommand(AdjustBridgeInstance.this.webView, strFieldToString8, adjustAttribution);
                                }
                            });
                        }
                        final String strFieldToString9 = AdjustBridgeUtil.fieldToString(obj11);
                        if (strFieldToString9 != null) {
                            adjustConfig.setOnThirdPartySharingSettingsChangedListener(new OnThirdPartySharingSettingsChangedListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.2
                                @Override // com.adjust.sdk.OnThirdPartySharingSettingsChangedListener
                                public void onThirdPartySharingSettingsChanged(AdjustThirdPartySharingResult adjustThirdPartySharingResult) {
                                    AdjustBridgeUtil.execThirdPartySharingSettingsCallbackCommand(AdjustBridgeInstance.this.webView, strFieldToString9, adjustThirdPartySharingResult);
                                }
                            });
                        }
                        Boolean boolFieldToBoolean3 = AdjustBridgeUtil.fieldToBoolean(obj12);
                        if (boolFieldToBoolean3 != null && boolFieldToBoolean3.booleanValue()) {
                            adjustConfig.enableCostDataInAttribution();
                        }
                        final String strFieldToString10 = AdjustBridgeUtil.fieldToString(obj13);
                        if (strFieldToString10 != null) {
                            adjustConfig.setOnEventTrackingSucceededListener(new OnEventTrackingSucceededListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.3
                                @Override // com.adjust.sdk.OnEventTrackingSucceededListener
                                public void onEventTrackingSucceeded(AdjustEventSuccess adjustEventSuccess) {
                                    AdjustBridgeUtil.execEventSuccessCallbackCommand(AdjustBridgeInstance.this.webView, strFieldToString10, adjustEventSuccess);
                                }
                            });
                        }
                        final String strFieldToString11 = AdjustBridgeUtil.fieldToString(obj14);
                        if (strFieldToString11 != null) {
                            adjustConfig.setOnEventTrackingFailedListener(new OnEventTrackingFailedListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.4
                                @Override // com.adjust.sdk.OnEventTrackingFailedListener
                                public void onEventTrackingFailed(AdjustEventFailure adjustEventFailure) {
                                    AdjustBridgeUtil.execEventFailureCallbackCommand(AdjustBridgeInstance.this.webView, strFieldToString11, adjustEventFailure);
                                }
                            });
                        }
                        final String strFieldToString12 = AdjustBridgeUtil.fieldToString(obj15);
                        if (strFieldToString12 != null) {
                            adjustConfig.setOnSessionTrackingSucceededListener(new OnSessionTrackingSucceededListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.5
                                @Override // com.adjust.sdk.OnSessionTrackingSucceededListener
                                public void onSessionTrackingSucceeded(AdjustSessionSuccess adjustSessionSuccess) {
                                    AdjustBridgeUtil.execSessionSuccessCallbackCommand(AdjustBridgeInstance.this.webView, strFieldToString12, adjustSessionSuccess);
                                }
                            });
                        }
                        final String strFieldToString13 = AdjustBridgeUtil.fieldToString(obj16);
                        if (strFieldToString13 != null) {
                            adjustConfig.setOnSessionTrackingFailedListener(new OnSessionTrackingFailedListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.6
                                @Override // com.adjust.sdk.OnSessionTrackingFailedListener
                                public void onSessionTrackingFailed(AdjustSessionFailure adjustSessionFailure) {
                                    AdjustBridgeUtil.execSessionFailureCallbackCommand(AdjustBridgeInstance.this.webView, strFieldToString13, adjustSessionFailure);
                                }
                            });
                        }
                        Boolean boolFieldToBoolean4 = AdjustBridgeUtil.fieldToBoolean(obj17);
                        if (boolFieldToBoolean4 != null) {
                            this.isOpeningDeferredDeeplinkEnabled = boolFieldToBoolean4.booleanValue();
                        }
                        final String strFieldToString14 = AdjustBridgeUtil.fieldToString(obj18);
                        if (strFieldToString14 != null) {
                            adjustConfig.setOnDeferredDeeplinkResponseListener(new OnDeferredDeeplinkResponseListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.7
                                @Override // com.adjust.sdk.OnDeferredDeeplinkResponseListener
                                public boolean launchReceivedDeeplink(Uri uri) {
                                    AdjustBridgeUtil.execSingleValueCallback(AdjustBridgeInstance.this.webView, strFieldToString14, uri.toString());
                                    return AdjustBridgeInstance.this.isOpeningDeferredDeeplinkEnabled;
                                }
                            });
                        }
                        final String strFieldToString15 = AdjustBridgeUtil.fieldToString(obj19);
                        if (strFieldToString15 != null) {
                            adjustConfig.setOnRemoteTriggerListener(new OnRemoteTriggerListener() { // from class: com.adjust.sdk.webbridge.AdjustBridgeInstance.8
                                @Override // com.adjust.sdk.OnRemoteTriggerListener
                                public void onRemoteTrigger(AdjustRemoteTrigger adjustRemoteTrigger) {
                                    AdjustBridgeUtil.execRemoteTriggerCallbackCommand(AdjustBridgeInstance.this.webView, strFieldToString15, adjustRemoteTrigger);
                                }
                            });
                        }
                        String strFieldToString16 = AdjustBridgeUtil.fieldToString(obj20);
                        if (strFieldToString16 != null && (facebookSDKJSInterface = this.facebookSDKJSInterface) != null) {
                            facebookSDKJSInterface.setDefaultEventToken(strFieldToString16);
                        }
                        try {
                            String[] strArrJsonArrayToArray = AdjustBridgeUtil.jsonArrayToArray((JSONArray) obj21);
                            if (strArrJsonArrayToArray != null && this.facebookSDKJSInterface != null) {
                                for (int i = 0; i < strArrJsonArrayToArray.length; i += 2) {
                                    this.facebookSDKJSInterface.addFbPixelEventTokenMapping(strArrJsonArrayToArray[i], strArrJsonArrayToArray[i + 1]);
                                }
                            }
                        } catch (Exception e) {
                            AdjustFactory.getLogger().error("AdjustBridgeInstance.configureFbPixel: %s", e.getMessage());
                        }
                        List<String> listAsList = Arrays.asList(AdjustBridgeUtil.jsonArrayToArray((JSONArray) obj22));
                        Boolean boolFieldToBoolean5 = AdjustBridgeUtil.fieldToBoolean(obj23);
                        Boolean boolFieldToBoolean6 = AdjustBridgeUtil.fieldToBoolean(obj24);
                        if (listAsList != null && !listAsList.isEmpty() && boolFieldToBoolean5 != null && boolFieldToBoolean6 != null) {
                            adjustConfig.setUrlStrategy(listAsList, boolFieldToBoolean5.booleanValue(), boolFieldToBoolean6.booleanValue());
                        }
                        Boolean boolFieldToBoolean7 = AdjustBridgeUtil.fieldToBoolean(obj25);
                        if (boolFieldToBoolean7 != null && boolFieldToBoolean7.booleanValue()) {
                            adjustConfig.enablePreinstallTracking();
                        }
                        String strFieldToString17 = AdjustBridgeUtil.fieldToString(obj26);
                        if (strFieldToString17 != null) {
                            adjustConfig.setPreinstallFilePath(strFieldToString17);
                        }
                        Boolean boolFieldToBoolean8 = AdjustBridgeUtil.fieldToBoolean(obj27);
                        if (boolFieldToBoolean8 != null && boolFieldToBoolean8.booleanValue()) {
                            adjustConfig.enableCoppaCompliance();
                        }
                        Boolean boolFieldToBoolean9 = AdjustBridgeUtil.fieldToBoolean(obj28);
                        if (boolFieldToBoolean9 != null && boolFieldToBoolean9.booleanValue()) {
                            adjustConfig.enablePlayStoreKidsCompliance();
                        }
                        String strFieldToString18 = AdjustBridgeUtil.fieldToString(obj29);
                        if (strFieldToString18 != null) {
                            adjustConfig.setFbAppId(strFieldToString18);
                        }
                        Boolean boolFieldToBoolean10 = AdjustBridgeUtil.fieldToBoolean(obj30);
                        if (boolFieldToBoolean10 != null && boolFieldToBoolean10.booleanValue()) {
                            adjustConfig.enableDeviceIdsReadingOnce();
                        }
                        Integer numFieldToInteger = AdjustBridgeUtil.fieldToInteger(obj31);
                        if (numFieldToInteger != null) {
                            adjustConfig.setEventDeduplicationIdsMaxSize(numFieldToInteger);
                        }
                        Boolean boolFieldToBoolean11 = AdjustBridgeUtil.fieldToBoolean(obj32);
                        if (boolFieldToBoolean11 != null && boolFieldToBoolean11.booleanValue()) {
                            adjustConfig.enableFirstSessionDelay();
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject(AdjustBridgeUtil.fieldToString(obj33));
                            Object obj36 = jSONObject2.get("storeName");
                            Object obj37 = jSONObject2.get("storeAppId");
                            String strFieldToString19 = AdjustBridgeUtil.fieldToString(obj36);
                            String strFieldToString20 = AdjustBridgeUtil.fieldToString(obj37);
                            AdjustStoreInfo adjustStoreInfo = new AdjustStoreInfo(strFieldToString19);
                            adjustStoreInfo.setStoreAppId(strFieldToString20);
                            adjustConfig.setStoreInfo(adjustStoreInfo);
                        } catch (Exception e2) {
                            AdjustFactory.getLogger().error("AdjustBridgeInstance storeInfo: %s", e2.getMessage());
                        }
                        Boolean boolFieldToBoolean12 = AdjustBridgeUtil.fieldToBoolean(obj34);
                        if (boolFieldToBoolean12 != null && !boolFieldToBoolean12.booleanValue()) {
                            adjustConfig.disableAppSetIdReading();
                        }
                        Boolean boolFieldToBoolean13 = AdjustBridgeUtil.fieldToBoolean(obj35);
                        if (boolFieldToBoolean13 != null && !boolFieldToBoolean13.booleanValue()) {
                            adjustConfig.disableFbIdReading();
                        }
                        enableBridgeSecurity();
                        Adjust.initSdk(adjustConfig);
                        this.isInitialized = true;
                    }
                } catch (Exception e3) {
                    AdjustFactory.getLogger().error("AdjustBridgeInstance onCreate: %s", e3.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public void teardown(String str) {
        if (isBridgeAuthorized(str)) {
            this.isInitialized = false;
            this.isOpeningDeferredDeeplinkEnabled = true;
            this.isBridgeSecurityEnabled = false;
            this.bridgeSecurityToken = null;
        }
    }

    @JavascriptInterface
    public void fbPixelEvent(String str, String str2, String str3) {
        fbPixelEvent(str, str2, str3, null);
    }

    @JavascriptInterface
    public void addGlobalCallbackParameter(String str, String str2) {
        addGlobalCallbackParameter(str, str2, null);
    }

    @JavascriptInterface
    public void addGlobalPartnerParameter(String str, String str2) {
        addGlobalPartnerParameter(str, str2, null);
    }

    @JavascriptInterface
    public void disable() {
        disable(null);
    }

    @JavascriptInterface
    public void disableCoppaComplianceInDelay() {
        disableCoppaComplianceInDelay(null);
    }

    @JavascriptInterface
    public void disablePlayStoreKidsComplianceInDelay() {
        disablePlayStoreKidsComplianceInDelay(null);
    }

    @JavascriptInterface
    public void enable() {
        enable(null);
    }

    @JavascriptInterface
    public void enableCoppaComplianceInDelay() {
        enableCoppaComplianceInDelay(null);
    }

    @JavascriptInterface
    public void enablePlayStoreKidsComplianceInDelay() {
        enablePlayStoreKidsComplianceInDelay(null);
    }

    @JavascriptInterface
    public void endFirstSessionDelay() {
        endFirstSessionDelay(null);
    }

    @JavascriptInterface
    public void onPause() {
        onPause(null);
    }

    @JavascriptInterface
    public void onResume() {
        onResume(null);
    }

    @JavascriptInterface
    public void removeGlobalCallbackParameter(String str) {
        removeGlobalCallbackParameter(str, null);
    }

    @JavascriptInterface
    public void removeGlobalCallbackParameters() {
        removeGlobalCallbackParameters(null);
    }

    @JavascriptInterface
    public void removeGlobalPartnerParameter(String str) {
        removeGlobalPartnerParameter(str, null);
    }

    @JavascriptInterface
    public void removeGlobalPartnerParameters() {
        removeGlobalPartnerParameters(null);
    }

    @JavascriptInterface
    public void setExternalDeviceIdInDelay(String str) {
        setExternalDeviceIdInDelay(str, null);
    }

    @JavascriptInterface
    public void switchBackToOnlineMode() {
        switchBackToOnlineMode(null);
    }

    @JavascriptInterface
    public void switchToOfflineMode() {
        switchToOfflineMode(null);
    }

    @JavascriptInterface
    public void teardown() {
        teardown(null);
    }

    @JavascriptInterface
    public void getAdid(String str) {
        getAdid(str, null);
    }

    @JavascriptInterface
    public void getAttribution(String str) {
        getAttribution(str, null);
    }

    @JavascriptInterface
    public void getSdkVersion(String str) {
        getSdkVersion(str, null);
    }

    public AdjustBridgeInstance() {
    }

    @JavascriptInterface
    public void gdprForgetMe() {
        gdprForgetMe(null);
    }

    @JavascriptInterface
    public void setReferrer(String str) {
        setReferrer(str, null);
    }

    @JavascriptInterface
    public void trackMeasurementConsent(String str) {
        trackMeasurementConsent(str, null);
    }

    @JavascriptInterface
    public void getAdidWithTimeout(long j, String str) {
        getAdidWithTimeout(j, str, null);
    }

    @JavascriptInterface
    public void getAmazonAdId(String str) {
        getAmazonAdId(str, null);
    }

    @JavascriptInterface
    public void getAttributionWithTimeout(long j, String str) {
        getAttributionWithTimeout(j, str, null);
    }

    @JavascriptInterface
    public void getGoogleAdId(String str) {
        getGoogleAdId(str, null);
    }

    @JavascriptInterface
    public void getThirdPartySharingSettingsWithTimeout(long j, String str) {
        getThirdPartySharingSettingsWithTimeout(j, str, null);
    }

    @JavascriptInterface
    public void isEnabled(String str) {
        isEnabled(str, null);
    }

    @JavascriptInterface
    public void trackThirdPartySharing(String str) {
        trackThirdPartySharing(str, null);
    }

    @JavascriptInterface
    public void trackEvent(String str) {
        trackEvent(str, null);
    }

    @JavascriptInterface
    public void initSdk(String str) {
        initSdk(str, null);
    }
}
