package fwfd.com.fwfsdk.model.db;

/* JADX INFO: loaded from: classes5.dex */
public class FWFSDKInfo {
    private String sdkVersion;
    private Integer versionNumber;

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public Integer getVersionNumber() {
        return this.versionNumber;
    }

    public FWFSDKInfo(String str, Integer num) {
        this.sdkVersion = str;
        this.versionNumber = num;
    }

    public String toString() {
        return "FWFSDKInfo{sdkVersion='" + this.sdkVersion + "', versionNumber=" + this.versionNumber + '}';
    }
}
