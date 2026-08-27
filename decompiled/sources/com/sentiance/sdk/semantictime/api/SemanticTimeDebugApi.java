package com.sentiance.sdk.semantictime.api;

import android.util.Pair;
import com.sentiance.sdk.DontObfuscate;
import java.util.HashMap;
import java.util.Map;
import o.handlePushNotificationPayloadlambda7;
import o.handlePushNotificationPayloadlambda8;
import o.runlambda0;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes5.dex */
@runlambda0
@DontObfuscate
class SemanticTimeDebugApi {
    public static HashMap<SemanticTime, Pair<Integer, Integer>> getSemanticTimes() {
        Map<SemanticTime, handlePushNotificationPayloadlambda7> mapRemoteActionCompatParcelizer = ((handlePushNotificationPayloadlambda8) setPushUniqueId.read(handlePushNotificationPayloadlambda8.class)).RemoteActionCompatParcelizer();
        if (mapRemoteActionCompatParcelizer == null) {
            return new HashMap<>();
        }
        HashMap<SemanticTime, Pair<Integer, Integer>> map = new HashMap<>();
        for (Map.Entry<SemanticTime, handlePushNotificationPayloadlambda7> entry : mapRemoteActionCompatParcelizer.entrySet()) {
            map.put(entry.getKey(), new Pair<>(Integer.valueOf(entry.getValue().RemoteActionCompatParcelizer()), Integer.valueOf(entry.getValue().IconCompatParcelizer())));
        }
        return map;
    }
}
