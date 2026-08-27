package com.braze.enums;

import coil3.util.UtilsKt;
import com.braze.models.IPutIntoJson;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.accessgetInstancedelegatecp;
import o.onMove;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes.dex */
public enum NotificationSubscriptionType implements IPutIntoJson<String> {
    OPTED_IN("opted_in"),
    SUBSCRIBED("subscribed"),
    UNSUBSCRIBED("unsubscribed");

    private static final Map<String, NotificationSubscriptionType> map;
    private final String key;
    private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
    public static final Companion Companion = new Companion(null);

    public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }

    public static final NotificationSubscriptionType fromValue(String str) {
        return Companion.fromValue(str);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NotificationSubscriptionType fromValue(String str) {
            String lowerCase;
            Map map = NotificationSubscriptionType.map;
            if (str != null) {
                Locale locale = Locale.US;
                locale.getClass();
                lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            Object obj = map.get(lowerCase);
            return (NotificationSubscriptionType) (obj != null ? obj : null);
        }
    }

    NotificationSubscriptionType(String str) {
        this.key = str;
    }

    @Override // com.braze.models.IPutIntoJson
    public String forJsonPut() {
        return this.key;
    }

    static {
        r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U entries = getEntries();
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(entries, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer < 16 ? 16 : iRemoteActionCompatParcelizer);
        for (Object obj : entries) {
            linkedHashMap.put(((NotificationSubscriptionType) obj).key, obj);
        }
        map = linkedHashMap;
    }
}
