package o;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class setPositionH0pRuoY implements isHardwareAccelerated {
    public final onImageAvailable IconCompatParcelizer;

    public final boolean IconCompatParcelizer(Map map) {
        return com.deliveryhero.chatsdk.util.PushNotificationParserObj.INSTANCE.canParse(map);
    }

    public final beginRecording read(Map map) {
        try {
            com.deliveryhero.chatsdk.util.PushNotificationParserObj pushNotificationParserObj = com.deliveryhero.chatsdk.util.PushNotificationParserObj.INSTANCE;
            if (!pushNotificationParserObj.canParse(map)) {
                throw new IllegalStateException("Unsupported push notification format");
            }
            com.deliveryhero.chatsdk.domain.model.PushNotificationData pushNotificationData = pushNotificationParserObj.parse(map);
            String channelID = pushNotificationData.getChannelID();
            String senderName = pushNotificationData.getSenderName();
            String orderID = pushNotificationData.getOrderID();
            String country = pushNotificationData.getCountry();
            String message = pushNotificationData.getMessage();
            String pushID = pushNotificationData.getPushID();
            String pushAlert = pushNotificationData.getPushAlert();
            return new beginRecording(orderID, message, pushNotificationData.getChannelType(), channelID, pushNotificationData.getChatID(), senderName, country, pushID, pushAlert, pushNotificationData.getPushDataType());
        } catch (Exception e) {
            isIdentityannotations isidentityannotations = this.IconCompatParcelizer.serializer;
            if (isidentityannotations == null) {
                return null;
            }
            isidentityannotations.serializer("GCC_PUSH_PARSING_ERROR", SimpleItemTouchHelperCallback.serializer, e);
            return null;
        }
    }

    public setPositionH0pRuoY(onImageAvailable onimageavailable) {
        this.IconCompatParcelizer = onimageavailable;
    }
}
