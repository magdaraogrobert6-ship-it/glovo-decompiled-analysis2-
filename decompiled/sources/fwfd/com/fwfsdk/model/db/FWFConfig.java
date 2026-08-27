package fwfd.com.fwfsdk.model.db;

import fwfd.com.fwfsdk.constant.FWFConstants;
import fwfd.com.fwfsdk.util.FWFLogger;
import java.util.ArrayList;
import java.util.List;
import o.getShortEdge;

/* JADX INFO: loaded from: classes5.dex */
public class FWFConfig {
    private String accessToken;
    private String apiVersion;
    private String baseUrl;
    private final Boolean cleanDBOnVersionUpdate;
    private float connectionTimeout;
    private final List<getShortEdge> customInterceptors;
    private boolean debugMode;
    private Float featureExpirationTime;
    private Float flagKeysExpirationTime;
    private String localUrl;
    private final FWFLogger.FWFLogLevel logLevel;

    private String getApiVersionValue(FWFConstants.API api) {
        return api.getValue();
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getApiVersion() {
        return this.apiVersion;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public Boolean getCleanDBOnVersionUpdate() {
        return this.cleanDBOnVersionUpdate;
    }

    public float getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public List<getShortEdge> getCustomInterceptors() {
        return this.customInterceptors;
    }

    public Float getFeatureExpirationTime() {
        return this.featureExpirationTime;
    }

    public Float getFlagKeysExpirationTime() {
        return this.flagKeysExpirationTime;
    }

    public String getLocalUrl() {
        return this.localUrl;
    }

    public FWFLogger.FWFLogLevel getLogLevel() {
        return this.logLevel;
    }

    public boolean isDebugMode() {
        return this.debugMode;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setConnectionTimeout(float f) {
        this.connectionTimeout = f;
    }

    public void setFlagKeysExpirationTime(Float f) {
        this.flagKeysExpirationTime = f;
    }

    public static class Builder {
        private final String accessToken;
        private Float flagKeysExpirationTime;
        private FWFConstants.Region region;
        private String localUrl = "";
        private FWFConstants.API apiVersion = FWFConstants.API.API_VERSION_V2;
        private float connectionTimeout = FWFConstants.Time.CONNECTIONTIMEOUT.getValue();
        private Float featureExpirationTime = Float.valueOf(FWFConstants.Time.FEATUREEXPIRATIONTIME.getValue());
        private boolean debugMode = false;
        FWFLogger.FWFLogLevel logLevel = FWFConstants.Defaults.LOG_LEVEL.getValue();
        private Boolean cleanDBOnVersionUpdate = Boolean.TRUE;

        public Builder apiVersion(FWFConstants.API api) {
            this.apiVersion = api;
            return this;
        }

        public Builder cleanDBOnVersionUpdate(Boolean bool) {
            this.cleanDBOnVersionUpdate = bool;
            return this;
        }

        public Builder connectionTimeout(float f) {
            this.connectionTimeout = f;
            return this;
        }

        public Builder debugMode(boolean z) {
            this.debugMode = z;
            return this;
        }

        public Builder localUrl(String str) {
            this.localUrl = str;
            return this;
        }

        public Builder logLevel(FWFLogger.FWFLogLevel fWFLogLevel) {
            this.logLevel = fWFLogLevel;
            return this;
        }

        public Builder region(FWFConstants.Region region) {
            this.region = region;
            return this;
        }

        public FWFConfig build() {
            return new FWFConfig(this);
        }

        public Builder featureExpirationTime(float f) {
            this.featureExpirationTime = Float.valueOf(f);
            return this;
        }

        public Builder flagKeysExpirationTime(float f) {
            this.flagKeysExpirationTime = Float.valueOf(f);
            return this;
        }

        public Builder(String str) {
            this.accessToken = str;
        }
    }

    private String getFormattedLocalUrl(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        if (sb.charAt(str.length() - 1) == '/') {
            sb.deleteCharAt(str.length() - 1);
        }
        return sb.toString();
    }

    public void addCustomInterceptor(getShortEdge getshortedge) {
        this.customInterceptors.add(getshortedge);
    }

    public void removeLocalUrl() {
        this.localUrl = "";
    }

    public void setDebugMode(boolean z) {
        FWFLogger.logLevel = FWFLogger.FWFLogLevel.debug;
        this.debugMode = z;
    }

    public void setApiVersion(FWFConstants.API api) {
        this.apiVersion = getApiVersionValue(api);
    }

    public void setBaseUrl(FWFConstants.Region region) {
        this.baseUrl = getBaseUrlFromRegion(region);
    }

    public void setFeatureExpirationTime(float f) {
        this.featureExpirationTime = Float.valueOf(f);
    }

    public void setLocalUrl(String str) {
        String formattedLocalUrl = getFormattedLocalUrl(str);
        if (formattedLocalUrl.isEmpty()) {
            return;
        }
        this.localUrl = formattedLocalUrl;
    }

    private FWFConfig(Builder builder) {
        this.baseUrl = "";
        this.localUrl = "";
        this.apiVersion = "";
        this.accessToken = "";
        this.connectionTimeout = 0.0f;
        this.featureExpirationTime = Float.valueOf(900.0f);
        this.customInterceptors = new ArrayList();
        this.baseUrl = getBaseUrlFromRegion(builder.region);
        this.localUrl = getFormattedLocalUrl(builder.localUrl);
        this.apiVersion = getApiVersionValue(builder.apiVersion);
        this.debugMode = builder.debugMode;
        this.accessToken = builder.accessToken;
        this.connectionTimeout = builder.connectionTimeout;
        this.featureExpirationTime = builder.featureExpirationTime;
        this.flagKeysExpirationTime = builder.flagKeysExpirationTime;
        this.logLevel = builder.logLevel;
        this.cleanDBOnVersionUpdate = builder.cleanDBOnVersionUpdate;
    }

    private String getBaseUrlFromRegion(FWFConstants.Region region) {
        if (region != null) {
            return "https://" + region.getValue() + "-client.fwf.deliveryhero.net";
        }
        return "https://client-api.fwf.deliveryhero.net";
    }
}
