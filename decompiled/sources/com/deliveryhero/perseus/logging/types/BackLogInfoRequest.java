package com.deliveryhero.perseus.logging.types;

import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class BackLogInfoRequest {

    @SerializedName("appVersionCode")
    private final String appVersionName;

    @SerializedName("backlogMetadata")
    private final Map<String, Map<String, Integer>> backlogMetadata;

    @SerializedName("amountOfMessagesInQueue")
    private final int backlogSize;

    @SerializedName("batchSizeDelay")
    private final long batchDelay;

    @SerializedName("batchSize")
    private final int batchSize;

    @SerializedName("brand")
    private final String brand;

    @SerializedName("clientId")
    private final String clientId;

    @SerializedName(PushNotificationParserObj.COUNTRY_KEY)
    private final String country;

    @SerializedName("globalEntityId")
    private final String globalEntityId;

    @SerializedName("numberOfDeletedMessages")
    private final Integer numberOfDeletedMessages;

    @SerializedName("ageOfOldestMessageInQueue")
    private final long oldestMessageAge;

    @SerializedName("platform")
    private final String platform;

    @SerializedName("sdkVersion")
    private final String sdkVersion;

    @SerializedName("sessionId")
    private final String sessionId;

    @SerializedName("timestamp")
    private final String timestamp;

    public final String component1() {
        return this.timestamp;
    }

    public final String component10() {
        return this.country;
    }

    public final String component11() {
        return this.globalEntityId;
    }

    public final String component12() {
        return this.sdkVersion;
    }

    public final String component13() {
        return this.sessionId;
    }

    public final String component14() {
        return this.clientId;
    }

    public final Map<String, Map<String, Integer>> component15() {
        return this.backlogMetadata;
    }

    public final String component2() {
        return this.brand;
    }

    public final int component3() {
        return this.backlogSize;
    }

    public final long component4() {
        return this.oldestMessageAge;
    }

    public final Integer component5() {
        return this.numberOfDeletedMessages;
    }

    public final long component6() {
        return this.batchDelay;
    }

    public final int component7() {
        return this.batchSize;
    }

    public final String component8() {
        return this.appVersionName;
    }

    public final String component9() {
        return this.platform;
    }

    public final String getAppVersionName() {
        return this.appVersionName;
    }

    public final Map<String, Map<String, Integer>> getBacklogMetadata() {
        return this.backlogMetadata;
    }

    public final int getBacklogSize() {
        return this.backlogSize;
    }

    public final long getBatchDelay() {
        return this.batchDelay;
    }

    public final int getBatchSize() {
        return this.batchSize;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getGlobalEntityId() {
        return this.globalEntityId;
    }

    public final Integer getNumberOfDeletedMessages() {
        return this.numberOfDeletedMessages;
    }

    public final long getOldestMessageAge() {
        return this.oldestMessageAge;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.backlogSize, af$$ExternalSyntheticOutline0.m(this.timestamp.hashCode() * 31, 31, this.brand), 31), 31, this.oldestMessageAge);
        Integer num = this.numberOfDeletedMessages;
        int iM2 = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.batchSize, d$$ExternalSyntheticOutline0.m((iM + (num == null ? 0 : num.hashCode())) * 31, 31, this.batchDelay), 31), 31, this.appVersionName), 31, this.platform);
        String str = this.country;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.globalEntityId;
        int iM3 = af$$ExternalSyntheticOutline0.m((((iM2 + iHashCode) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.sdkVersion);
        String str3 = this.sessionId;
        int iHashCode2 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.clientId;
        return this.backlogMetadata.hashCode() + ((((iM3 + iHashCode2) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.timestamp;
        String str2 = this.brand;
        int i = this.backlogSize;
        long j = this.oldestMessageAge;
        Integer num = this.numberOfDeletedMessages;
        long j2 = this.batchDelay;
        int i2 = this.batchSize;
        String str3 = this.appVersionName;
        String str4 = this.platform;
        String str5 = this.country;
        String str6 = this.globalEntityId;
        String str7 = this.sdkVersion;
        String str8 = this.sessionId;
        String str9 = this.clientId;
        Map<String, Map<String, Integer>> map = this.backlogMetadata;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("BackLogInfoRequest(timestamp=", str, ", brand=", str2, ", backlogSize=");
        sbM.append(i);
        sbM.append(", oldestMessageAge=");
        sbM.append(j);
        sbM.append(", numberOfDeletedMessages=");
        sbM.append(num);
        sbM.append(", batchDelay=");
        sbM.append(j2);
        sbM.append(", batchSize=");
        sbM.append(i2);
        c8$$ExternalSyntheticOutline0.m(sbM, ", appVersionName=", str3, ", platform=", str4);
        c8$$ExternalSyntheticOutline0.m(sbM, ", country=", str5, ", globalEntityId=", str6);
        c8$$ExternalSyntheticOutline0.m(sbM, ", sdkVersion=", str7, ", sessionId=", str8);
        sbM.append(", clientId=");
        sbM.append(str9);
        sbM.append(", backlogMetadata=");
        sbM.append(map);
        sbM.append(")");
        return sbM.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BackLogInfoRequest(String str, String str2, int i, long j, Integer num, long j2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, ? extends Map<String, Integer>> map) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str7);
        map.getClass();
        this.timestamp = str;
        this.brand = str2;
        this.backlogSize = i;
        this.oldestMessageAge = j;
        this.numberOfDeletedMessages = num;
        this.batchDelay = j2;
        this.batchSize = i2;
        this.appVersionName = str3;
        this.platform = str4;
        this.country = str5;
        this.globalEntityId = str6;
        this.sdkVersion = str7;
        this.sessionId = str8;
        this.clientId = str9;
        this.backlogMetadata = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackLogInfoRequest)) {
            return false;
        }
        BackLogInfoRequest backLogInfoRequest = (BackLogInfoRequest) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timestamp, backLogInfoRequest.timestamp}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brand, backLogInfoRequest.brand}, getCieXyz.write())).booleanValue() || this.backlogSize != backLogInfoRequest.backlogSize || this.oldestMessageAge != backLogInfoRequest.oldestMessageAge) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.numberOfDeletedMessages, backLogInfoRequest.numberOfDeletedMessages}, getCieXyz.write())).booleanValue() || this.batchDelay != backLogInfoRequest.batchDelay || this.batchSize != backLogInfoRequest.batchSize) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.appVersionName, backLogInfoRequest.appVersionName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.platform, backLogInfoRequest.platform}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.country, backLogInfoRequest.country}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, backLogInfoRequest.globalEntityId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sdkVersion, backLogInfoRequest.sdkVersion}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, backLogInfoRequest.sessionId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.clientId, backLogInfoRequest.clientId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.backlogMetadata, backLogInfoRequest.backlogMetadata}, getCieXyz.write())).booleanValue();
    }

    public final BackLogInfoRequest copy(String str, String str2, int i, long j, Integer num, long j2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, ? extends Map<String, Integer>> map) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str7);
        map.getClass();
        return new BackLogInfoRequest(str, str2, i, j, num, j2, i2, str3, str4, str5, str6, str7, str8, str9, map);
    }
}
