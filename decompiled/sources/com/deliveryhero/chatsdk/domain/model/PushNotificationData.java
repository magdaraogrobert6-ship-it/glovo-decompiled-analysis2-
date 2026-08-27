package com.deliveryhero.chatsdk.domain.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class PushNotificationData {
    private final String channelID;
    private final String channelType;
    private final String chatID;
    private final String country;
    private final String message;
    private final String messageID;
    private final String orderID;
    private final String pushAlert;
    private final PushDataType pushDataType;
    private final String pushID;
    private final String senderName;
    private final String title;

    public final String component1() {
        return this.orderID;
    }

    public final String component10() {
        return this.pushID;
    }

    public final String component11() {
        return this.pushAlert;
    }

    public final String component12() {
        return this.title;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.channelType;
    }

    public final PushDataType component4() {
        return this.pushDataType;
    }

    public final String component5() {
        return this.channelID;
    }

    public final String component6() {
        return this.chatID;
    }

    public final String component7() {
        return this.senderName;
    }

    public final String component8() {
        return this.country;
    }

    public final String component9() {
        return this.messageID;
    }

    public final String getChannelID() {
        return this.channelID;
    }

    public final String getChannelType() {
        return this.channelType;
    }

    public final String getChatID() {
        return this.chatID;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessageID() {
        return this.messageID;
    }

    public final String getOrderID() {
        return this.orderID;
    }

    public final String getPushAlert() {
        return this.pushAlert;
    }

    public final PushDataType getPushDataType() {
        return this.pushDataType;
    }

    public final String getPushID() {
        return this.pushID;
    }

    public final String getSenderName() {
        return this.senderName;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.orderID.hashCode() * 31, 31, this.message), 31, this.channelType);
        int iHashCode = this.pushDataType.hashCode();
        String str = this.channelID;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.chatID;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.senderName;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.country;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.messageID;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.pushID;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.pushAlert;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.title;
        return ((((((((((((((((iHashCode + iM) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public PushNotificationData(String str, String str2, String str3, PushDataType pushDataType, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        pushDataType.getClass();
        this.orderID = str;
        this.message = str2;
        this.channelType = str3;
        this.pushDataType = pushDataType;
        this.channelID = str4;
        this.chatID = str5;
        this.senderName = str6;
        this.country = str7;
        this.messageID = str8;
        this.pushID = str9;
        this.pushAlert = str10;
        this.title = str11;
    }

    public final PushNotificationData copy(String str, String str2, String str3, PushDataType pushDataType, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        pushDataType.getClass();
        return new PushNotificationData(str, str2, str3, pushDataType, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushNotificationData)) {
            return false;
        }
        PushNotificationData pushNotificationData = (PushNotificationData) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderID, pushNotificationData.orderID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, pushNotificationData.message}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.channelType, pushNotificationData.channelType}, getCieXyz.write())).booleanValue() || this.pushDataType != pushNotificationData.pushDataType) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.channelID, pushNotificationData.channelID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.chatID, pushNotificationData.chatID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.senderName, pushNotificationData.senderName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.country, pushNotificationData.country}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.messageID, pushNotificationData.messageID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pushID, pushNotificationData.pushID}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pushAlert, pushNotificationData.pushAlert}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, pushNotificationData.title}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushNotificationData(orderID=");
        sb.append(this.orderID);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", channelType=");
        sb.append(this.channelType);
        sb.append(", pushDataType=");
        sb.append(this.pushDataType);
        sb.append(", channelID=");
        sb.append(this.channelID);
        sb.append(", chatID=");
        sb.append(this.chatID);
        sb.append(", senderName=");
        sb.append(this.senderName);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", messageID=");
        sb.append(this.messageID);
        sb.append(", pushID=");
        sb.append(this.pushID);
        sb.append(", pushAlert=");
        sb.append(this.pushAlert);
        sb.append(", title=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.title, ')');
    }
}
