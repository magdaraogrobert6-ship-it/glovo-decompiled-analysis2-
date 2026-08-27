package com.huawei.wisesecurity.ucs.credential;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.wisesecurity.kfs.exception.KfsValidationException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsParamException;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs.credential.outer.GrsCapability;
import com.huawei.wisesecurity.ucs.credential.outer.HACapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.Selector;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.UUID;
import o.ClearAndSetSemanticsElement;
import o.LiveRegionMode;
import o.LtrBoundsComparator;
import o.ProgressBarRangeInfo;
import o.accessgetCheckboxcp;
import o.accessgetDropdownListcp;
import o.accessgetSwitchcp;
import o.accessgetValuePickercp;
import o.getCarouselo7Vup1c;
import o.getColumnSpan;
import o.getImageo7Vup1c;
import o.getSteps;

/* JADX INFO: loaded from: classes2.dex */
public class CredentialClient {
    private static final String TAG = "CredentialClient";
    private String appId;
    private Context context;
    private getCarouselo7Vup1c credentialManager;
    private HACapability haCapability;

    public static class Builder {
        private String appId;

        @LiveRegionMode
        private Context context;
        private GrsCapability grsCapability;
        private HACapability haCapability;
        private NetworkCapability networkCapability;
        private String serCountry;
        private int networkTimeOut = 15000;
        private int networkRetryTime = 2;
        private ProgressBarRangeInfo reportOption = ProgressBarRangeInfo.REPORT_NORMAL;

        public Builder appId(String str) {
            this.appId = str;
            return this;
        }

        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        public Builder grsCapability(GrsCapability grsCapability) {
            this.grsCapability = grsCapability;
            return this;
        }

        public Builder haCapability(HACapability hACapability) {
            this.haCapability = hACapability;
            return this;
        }

        public Builder networkCapability(NetworkCapability networkCapability) {
            this.networkCapability = networkCapability;
            return this;
        }

        public Builder networkRetryTime(int i) {
            this.networkRetryTime = i;
            return this;
        }

        public Builder networkTimeOut(int i) {
            this.networkTimeOut = i;
            return this;
        }

        public Builder reportOption(ProgressBarRangeInfo progressBarRangeInfo) {
            this.reportOption = progressBarRangeInfo;
            return this;
        }

        public Builder serCountry(String str) {
            this.serCountry = str;
            return this;
        }

        public Builder logInstance(LtrBoundsComparator ltrBoundsComparator) {
            if (ltrBoundsComparator != null) {
                getSteps.write = ltrBoundsComparator;
            }
            return this;
        }

        public CredentialClient build() throws UcsException {
            try {
                String str = this.appId;
                if (str != null && str.length() > 30) {
                    throw new UcsParamException("appId length is too long");
                }
                getColumnSpan.RemoteActionCompatParcelizer(this);
                getImageo7Vup1c getimageo7vup1cSelectGrsCapability = Selector.selectGrsCapability(this.grsCapability, this.context, this.serCountry);
                return new CredentialClient(this.context, this.appId, getimageo7vup1cSelectGrsCapability, Selector.selectNetWorkCapability(this.networkCapability, this.context, this.networkTimeOut, this.networkRetryTime), Selector.selectHACapability(this.haCapability, getimageo7vup1cSelectGrsCapability, this.reportOption));
            } catch (KfsValidationException e) {
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("CredentialClient check param error : ");
                sbIconCompatParcelizer.append(e.getMessage());
                throw new UcsParamException(sbIconCompatParcelizer.toString());
            } catch (UcsException e2) {
                long j = e2.IconCompatParcelizer.delayRemaining;
                getSteps.serializer(CredentialClient.TAG, "CredentialClient build get UCS exception : errorCode : {0} errorMsg : {1}", Long.valueOf(j), e2.getMessage());
                throw e2;
            } catch (Throwable th) {
                StringBuilder sbIconCompatParcelizer2 = accessgetSwitchcp.IconCompatParcelizer("CredentialClient build get exception : ");
                sbIconCompatParcelizer2.append(th.getMessage());
                String string = sbIconCompatParcelizer2.toString();
                throw accessgetDropdownListcp.IconCompatParcelizer(CredentialClient.TAG, string, new Object[0], 2001L, string);
            }
        }
    }

    private accessgetCheckboxcp createReportMsgBuilder(String str, String str2) {
        accessgetCheckboxcp accessgetcheckboxcp = new accessgetCheckboxcp();
        accessgetcheckboxcp.read.put("flavor", "developers");
        accessgetcheckboxcp.read.put("credentialPackageName", str);
        accessgetcheckboxcp.read.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, str2);
        accessgetcheckboxcp.write("appAuth.applyCredential");
        accessgetcheckboxcp.IconCompatParcelizer();
        return accessgetcheckboxcp;
    }

    public void reportLogs(ClearAndSetSemanticsElement clearAndSetSemanticsElement) {
        clearAndSetSemanticsElement.read.put("appId", this.appId);
        String packageName = this.context.getPackageName();
        LinkedHashMap linkedHashMap = clearAndSetSemanticsElement.read;
        linkedHashMap.put("packageName", packageName);
        linkedHashMap.put("version", "1.0.4.320");
        Context context = this.context;
        HACapability hACapability = this.haCapability;
        try {
            String strRemoteActionCompatParcelizer = clearAndSetSemanticsElement.RemoteActionCompatParcelizer();
            linkedHashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf((System.nanoTime() - clearAndSetSemanticsElement.IconCompatParcelizer) / 1000000));
            hACapability.onEvent(context, strRemoteActionCompatParcelizer, clearAndSetSemanticsElement);
        } catch (Throwable th) {
            StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("onEvent get exception : ");
            sbIconCompatParcelizer.append(th.getMessage());
            getSteps.read("ReportUtil", sbIconCompatParcelizer.toString(), new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CredentialClient(Context context, String str, getImageo7Vup1c getimageo7vup1c, NetworkCapability networkCapability, HACapability hACapability) throws UcsException {
        this.context = context;
        this.appId = str;
        this.haCapability = hACapability;
        getCarouselo7Vup1c getcarouselo7vup1c = new getCarouselo7Vup1c();
        getcarouselo7vup1c.MediaSessionCompatQueueItem = this;
        getcarouselo7vup1c.write = context;
        getcarouselo7vup1c.RemoteActionCompatParcelizer = networkCapability;
        getcarouselo7vup1c.IconCompatParcelizer = str;
        getcarouselo7vup1c.serializer = getimageo7vup1c;
        x xVar = new x(0, (boolean) (0 == true ? 1 : 0));
        xVar.RemoteActionCompatParcelizer = context;
        xVar.read = networkCapability;
        xVar.IconCompatParcelizer = getimageo7vup1c;
        getcarouselo7vup1c.read = xVar;
        this.credentialManager = getcarouselo7vup1c;
        UcsLib.checkNativeLibrary();
    }

    private void checkThread() throws UcsException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        MapboxMap$$ExternalSyntheticLambda0.m(1015L, "can not apply in main looper...");
    }

    public Credential applyCredential(String str, String str2) throws UcsException {
        checkParams(str);
        checkThread();
        accessgetCheckboxcp accessgetcheckboxcpCreateReportMsgBuilder = createReportMsgBuilder(str, str2);
        getSteps.read(TAG, "start apply credential for {0} , appId is {1},", str, this.appId);
        try {
            try {
                Credential credentialWrite = this.credentialManager.write(1, str, str2);
                getSteps.read(TAG, "finish apply credential for {0} , appId is {1}", str, this.appId);
                accessgetcheckboxcpCreateReportMsgBuilder.read.put("cty", this.credentialManager.MediaDescriptionCompat);
                accessgetcheckboxcpCreateReportMsgBuilder.read(0);
                reportLogs(accessgetcheckboxcpCreateReportMsgBuilder);
                return credentialWrite;
            } catch (UcsException e) {
                getSteps.serializer(TAG, "get Credential get UcsException : " + e.getMessage(), new Object[0]);
                accessgetcheckboxcpCreateReportMsgBuilder.read((int) e.IconCompatParcelizer.delayRemaining);
                accessgetcheckboxcpCreateReportMsgBuilder.IconCompatParcelizer(e.getMessage());
                throw e;
            } catch (Exception e2) {
                String str3 = "get Credential get exception : " + e2.getMessage();
                getSteps.serializer(TAG, str3, new Object[0]);
                accessgetcheckboxcpCreateReportMsgBuilder.read(2001);
                accessgetcheckboxcpCreateReportMsgBuilder.IconCompatParcelizer(str3);
                throw new UcsException(2001L, str3);
            }
        } catch (Throwable th) {
            reportLogs(accessgetcheckboxcpCreateReportMsgBuilder);
            throw th;
        }
    }

    public Credential applyCredentialByEC(String str, String str2) throws UcsException {
        checkParams(str);
        checkThread();
        accessgetCheckboxcp accessgetcheckboxcpCreateReportMsgBuilder = createReportMsgBuilder(str, str2);
        getSteps.read(TAG, "start apply credential by EC for {0} , appId is {1}", str, this.appId);
        try {
            try {
                Credential credentialWrite = this.credentialManager.write(2, str, str2);
                getSteps.read(TAG, "finish apply credential by EC for {0} , appId is {1}", str, this.appId);
                accessgetcheckboxcpCreateReportMsgBuilder.read.put("cty", this.credentialManager.MediaDescriptionCompat);
                accessgetcheckboxcpCreateReportMsgBuilder.read(0);
                reportLogs(accessgetcheckboxcpCreateReportMsgBuilder);
                return credentialWrite;
            } catch (UcsException e) {
                getSteps.serializer(TAG, "get Credential by EC get UcsException : " + e.getMessage(), new Object[0]);
                accessgetcheckboxcpCreateReportMsgBuilder.read((int) e.IconCompatParcelizer.delayRemaining);
                accessgetcheckboxcpCreateReportMsgBuilder.IconCompatParcelizer(e.getMessage());
                throw e;
            } catch (Exception e2) {
                String str3 = "get Credential by EC get exception : " + e2.getMessage();
                getSteps.serializer(TAG, str3, new Object[0]);
                accessgetcheckboxcpCreateReportMsgBuilder.read(2001);
                accessgetcheckboxcpCreateReportMsgBuilder.IconCompatParcelizer(str3);
                throw new UcsException(2001L, str3);
            }
        } catch (Throwable th) {
            reportLogs(accessgetcheckboxcpCreateReportMsgBuilder);
            throw th;
        }
    }

    public Credential genCredentialFromString(String str) throws UcsException {
        accessgetValuePickercp accessgetvaluepickercp = new accessgetValuePickercp();
        accessgetvaluepickercp.read.put("flavor", "developers");
        accessgetvaluepickercp.write("appAuth.credentialFromString");
        accessgetvaluepickercp.IconCompatParcelizer();
        try {
            try {
                Credential credentialFromString = Credential.fromString(this.context, str, accessgetvaluepickercp);
                accessgetvaluepickercp.read(0);
                reportLogs(accessgetvaluepickercp);
                return credentialFromString;
            } catch (UcsException e) {
                getSteps.serializer(TAG, "credential from string get UcsException : {0}", e.getMessage());
                accessgetvaluepickercp.read((int) e.IconCompatParcelizer.delayRemaining);
                accessgetvaluepickercp.IconCompatParcelizer(e.getMessage());
                throw e;
            } catch (Exception e2) {
                String str2 = "credential from string get exception : " + e2.getMessage();
                getSteps.serializer(TAG, "{0}", str2);
                accessgetvaluepickercp.read(2001);
                accessgetvaluepickercp.IconCompatParcelizer(str2);
                throw new UcsException(2001L, str2);
            }
        } catch (Throwable th) {
            reportLogs(accessgetvaluepickercp);
            throw th;
        }
    }

    private void checkParams(String str) throws UcsException {
        if (TextUtils.isEmpty(str)) {
            MapboxMap$$ExternalSyntheticLambda0.m(1001L, "serviceName illegal...");
        }
    }

    public Credential applyCredential(String str) throws UcsException {
        return applyCredential(str, UUID.randomUUID().toString());
    }

    public Credential applyCredentialByEC(String str) throws UcsException {
        return applyCredentialByEC(str, UUID.randomUUID().toString());
    }
}
