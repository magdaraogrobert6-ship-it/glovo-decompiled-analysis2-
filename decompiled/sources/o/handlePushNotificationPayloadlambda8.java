package o;

import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.semantictime.api.SemanticTime;
import java.io.File;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "SemanticTimeProvider", componentName = "SemanticTimeProvider")
public class handlePushNotificationPayloadlambda8 implements r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private final com.sentiance.sdk.util.c serializer;
    private final migrateTriggersReeligibilityToJsonlambda4<handlePushNotificationPayloadlambda5> write = new handlePushNotificationPayloadlambda9(this);

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    public final SemanticTime IconCompatParcelizer() {
        handlePushNotificationPayloadlambda5 handlepushnotificationpayloadlambda5 = this.write.read();
        if (handlepushnotificationpayloadlambda5 == null) {
            return SemanticTime.UNKNOWN;
        }
        Calendar calendar = Calendar.getInstance();
        this.read.getClass();
        calendar.setTimeInMillis(System.currentTimeMillis());
        long j = calendar.get(11);
        long j2 = calendar.get(12);
        long j3 = calendar.get(13);
        long j4 = calendar.get(14);
        long millis = TimeUnit.HOURS.toMillis(j);
        long millis2 = TimeUnit.MINUTES.toMillis(j2);
        long millis3 = TimeUnit.SECONDS.toMillis(j3);
        TreeMap<handlePushNotificationPayloadlambda7, SemanticTime> treeMap = handlepushnotificationpayloadlambda5.read();
        for (Map.Entry<handlePushNotificationPayloadlambda7, SemanticTime> entry : treeMap.entrySet()) {
            if (millis2 + millis + millis3 + j4 >= entry.getKey().RatingCompat()) {
                return entry.getValue();
            }
        }
        Map.Entry<handlePushNotificationPayloadlambda7, SemanticTime> entryFirstEntry = treeMap.firstEntry();
        return entryFirstEntry == null ? SemanticTime.UNKNOWN : entryFirstEntry.getValue();
    }

    @runlambda0
    public final Map<SemanticTime, handlePushNotificationPayloadlambda7> RemoteActionCompatParcelizer() {
        handlePushNotificationPayloadlambda5 handlepushnotificationpayloadlambda5 = this.write.read();
        if (handlepushnotificationpayloadlambda5 == null) {
            return null;
        }
        return handlepushnotificationpayloadlambda5.IconCompatParcelizer();
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.serializer.read();
        this.write.write();
    }

    public final void serializer(deleteSharedPreferencesFilelambda1 deletesharedpreferencesfilelambda1) {
        HashMap map = new HashMap();
        map.put(SemanticTime.MORNING, serializer(deletesharedpreferencesfilelambda1.a));
        map.put(SemanticTime.LATE_MORNING, serializer(deletesharedpreferencesfilelambda1.b));
        map.put(SemanticTime.LUNCH, serializer(deletesharedpreferencesfilelambda1.c));
        map.put(SemanticTime.AFTERNOON, serializer(deletesharedpreferencesfilelambda1.d));
        map.put(SemanticTime.EARLY_EVENING, serializer(deletesharedpreferencesfilelambda1.e));
        map.put(SemanticTime.EVENING, serializer(deletesharedpreferencesfilelambda1.f));
        map.put(SemanticTime.NIGHT, serializer(deletesharedpreferencesfilelambda1.g));
        handlePushNotificationPayloadlambda5 handlepushnotificationpayloadlambda5 = new handlePushNotificationPayloadlambda5(map);
        Object[] objArr = {handlepushnotificationpayloadlambda5.toString()};
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("New semantic time: %s", objArr);
        try {
            this.write.IconCompatParcelizer(handlepushnotificationpayloadlambda5);
            this.serializer.RemoteActionCompatParcelizer("semantic_time_key", handlepushnotificationpayloadlambda5.write());
        } catch (JSONException e) {
            parselonglambda0.IconCompatParcelizer(false, e, "Failed to cache semantic time: %s", handlepushnotificationpayloadlambda5.toString());
        }
    }

    public handlePushNotificationPayloadlambda8(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.serializer = cVar;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public static handlePushNotificationPayloadlambda5 a(handlePushNotificationPayloadlambda8 handlepushnotificationpayloadlambda8) {
        String strWrite = handlepushnotificationpayloadlambda8.serializer.write("semantic_time_key", (String) null);
        if (strWrite == null) {
            return null;
        }
        try {
            handlePushNotificationPayloadlambda5 handlepushnotificationpayloadlambda5 = new handlePushNotificationPayloadlambda5();
            handlepushnotificationpayloadlambda5.RemoteActionCompatParcelizer(strWrite);
            return handlepushnotificationpayloadlambda5;
        } catch (JSONException e) {
            handlepushnotificationpayloadlambda8.RemoteActionCompatParcelizer.IconCompatParcelizer(false, e, "Failed to get semantic time from cache: %s", strWrite);
            return null;
        }
    }

    private static handlePushNotificationPayloadlambda7 serializer(deleteSharedPreferencesFilelambda0 deletesharedpreferencesfilelambda0) {
        return new handlePushNotificationPayloadlambda7(deletesharedpreferencesfilelambda0.a, deletesharedpreferencesfilelambda0.b);
    }
}
