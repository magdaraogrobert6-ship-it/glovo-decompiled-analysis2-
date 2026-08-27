package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes4.dex */
public class UploadOptions implements Serializable {
    private final String filePath;
    private HashMap<String, String> headers;
    private final String mediaType;
    private final String metadata;
    private final NetworkRestriction networkRestriction;
    private final SdkInformation sdkInformation;
    private final long timeout;
    private final String url;

    public String getFilePath() {
        return this.filePath;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public String getMetadata() {
        return this.metadata;
    }

    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public SdkInformation getSdkInformation() {
        return this.sdkInformation;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public String getUrl() {
        return this.url;
    }

    public void setHeaders(HashMap<String, String> map) {
        this.headers = map;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.filePath, this.url, this.headers, this.metadata, this.mediaType, this.networkRestriction, this.sdkInformation, Long.valueOf(this.timeout));
    }

    public UploadOptions(String str, String str2, HashMap<String, String> map, String str3, String str4, SdkInformation sdkInformation) {
        this.filePath = str;
        this.url = str2;
        this.headers = map;
        this.metadata = str3;
        this.mediaType = str4;
        this.sdkInformation = sdkInformation;
        this.networkRestriction = NetworkRestriction.NONE;
        this.timeout = 0L;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[filePath: ");
        IconCompatParcelizer.read(sb, this.filePath, ", url: ");
        IconCompatParcelizer.read(sb, this.url, ", headers: ");
        sb.append(RecordUtils.fieldToString(this.headers));
        sb.append(", metadata: ");
        IconCompatParcelizer.read(sb, this.metadata, ", mediaType: ");
        IconCompatParcelizer.read(sb, this.mediaType, ", networkRestriction: ");
        sb.append(RecordUtils.fieldToString(this.networkRestriction));
        sb.append(", sdkInformation: ");
        sb.append(RecordUtils.fieldToString(this.sdkInformation));
        sb.append(", timeout: ");
        return getBitmapFromCache.RemoteActionCompatParcelizer(this.timeout, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadOptions uploadOptions = (UploadOptions) obj;
        return Objects.equals(this.filePath, uploadOptions.filePath) && Objects.equals(this.url, uploadOptions.url) && Objects.equals(this.headers, uploadOptions.headers) && Objects.equals(this.metadata, uploadOptions.metadata) && Objects.equals(this.mediaType, uploadOptions.mediaType) && Objects.equals(this.networkRestriction, uploadOptions.networkRestriction) && Objects.equals(this.sdkInformation, uploadOptions.sdkInformation) && this.timeout == uploadOptions.timeout;
    }

    public UploadOptions(String str, String str2, HashMap<String, String> map, String str3, String str4, NetworkRestriction networkRestriction, SdkInformation sdkInformation, long j) {
        this.filePath = str;
        this.url = str2;
        this.headers = map;
        this.metadata = str3;
        this.mediaType = str4;
        this.networkRestriction = networkRestriction;
        this.sdkInformation = sdkInformation;
        this.timeout = j;
    }
}
