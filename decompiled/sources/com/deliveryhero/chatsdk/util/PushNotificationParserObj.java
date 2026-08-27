package com.deliveryhero.chatsdk.util;

import com.deliveryhero.chatsdk.domain.model.PushDataType;
import com.deliveryhero.chatsdk.domain.model.PushNotificationData;
import java.util.Map;
import o.onMove;

/* JADX INFO: loaded from: classes2.dex */
public final class PushNotificationParserObj {
    public static final String BODY_KEY = "body";
    public static final String CHANNEL_ID_KEY = "channel_id";
    public static final String CHANNEL_TYPE_KEY = "channel_type";
    public static final String CORRELATION_KEY = "correlation";
    public static final String COUNTRY_KEY = "country";
    public static final PushNotificationParserObj INSTANCE = new PushNotificationParserObj();
    public static final String MESSAGE_ID_KEY = "message_id";
    public static final String MESSAGE_KEY = "message";
    public static final String PUSH_ALERT_KEY = "push_alert";
    public static final String PUSH_ID_KEY = "uid";
    public static final String SENDER_NAME_KEY = "sender_name";
    public static final String TITLE_KEY = "title";
    public static final String VERSION_KEY = "version";

    private PushNotificationParserObj() {
    }

    public final boolean canParse(Map<String, String> map) {
        map.getClass();
        if (map.containsKey(CHANNEL_ID_KEY) && map.containsKey(SENDER_NAME_KEY) && map.containsKey(COUNTRY_KEY) && map.containsKey(CORRELATION_KEY) && map.containsKey(PUSH_ID_KEY) && map.containsKey(MESSAGE_ID_KEY) && map.containsKey(CHANNEL_TYPE_KEY)) {
            return map.containsKey("message") || map.containsKey(BODY_KEY);
        }
        return false;
    }

    public final PushNotificationData parse(Map<String, String> map) {
        map.getClass();
        String str = (String) onMove.read(map, CHANNEL_ID_KEY);
        String str2 = (String) onMove.read(map, SENDER_NAME_KEY);
        String str3 = (String) onMove.read(map, COUNTRY_KEY);
        String str4 = (String) onMove.read(map, CORRELATION_KEY);
        String str5 = (String) onMove.read(map, MESSAGE_ID_KEY);
        String str6 = (String) onMove.read(map, PUSH_ID_KEY);
        String str7 = map.get(PUSH_ALERT_KEY);
        String str8 = map.get("message");
        if (str8 == null && (str8 = map.get(BODY_KEY)) == null) {
            str8 = "";
        }
        return new PushNotificationData(str4, str8, (String) onMove.read(map, CHANNEL_TYPE_KEY), PushDataType.Legacy, str, null, str2, str3, str5, str6, str7, map.get(TITLE_KEY));
    }
}
