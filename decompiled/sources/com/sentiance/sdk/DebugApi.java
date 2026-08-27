package com.sentiance.sdk;

import android.content.Context;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.threading.executors.Executors;
import o.clearAllData;
import o.forJsonPutlambda0;
import o.getAnalyticsEnabledEnterannotations;
import o.getBitmapFromCachelambda00;
import o.getBitmapFromCachelambda10;
import o.getEnabledannotations;
import o.getStableKey;
import o.parseNonBlankStringlambda0;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdajlMT1F20UZPc4QzYtuHQ8199M8;
import o.removeGeofencesRegisteredWithGeofencingClientlambda25;
import o.runlambda0;
import o.setPushUniqueId;

/* JADX INFO: loaded from: classes3.dex */
@runlambda0
@DontObfuscate
public class DebugApi {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$uploadEvents$0(getEnabledannotations getenabledannotations) {
        ((forJsonPutlambda0) setPushUniqueId.read(forJsonPutlambda0.class)).RemoteActionCompatParcelizer(getenabledannotations);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$uploadLogs$1(getStableKey getstablekey) {
        ((parseNonBlankStringlambda0) setPushUniqueId.read(parseNonBlankStringlambda0.class)).serializer(getstablekey);
    }

    public static void updateConfig() {
        ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).IconCompatParcelizer(ControlMessage.CONFIG_UPDATE_REQUEST, (Object) null);
    }

    public static void uploadEvents() {
        Context context = (Context) setPushUniqueId.read(Context.class);
        clearAllData clearalldataIconCompatParcelizer = ((Executors) setPushUniqueId.read(Executors.class)).IconCompatParcelizer();
        r8lambdajlMT1F20UZPc4QzYtuHQ8199M8 r8lambdajlmt1f20uzpc4qzytuhq8199m8 = new r8lambdajlMT1F20UZPc4QzYtuHQ8199M8(0L, 0);
        ((r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class)).getClass();
        clearalldataIconCompatParcelizer.RemoteActionCompatParcelizer(new removeGeofencesRegisteredWithGeofencingClientlambda25(1, new getEnabledannotations("DebugApi", r8lambdajlmt1f20uzpc4qzytuhq8199m8, new r8lambdajlMT1F20UZPc4QzYtuHQ8199M8(System.currentTimeMillis(), 0), true, new getBitmapFromCachelambda00(clearalldataIconCompatParcelizer, context))), "DebugApi");
    }

    public static void uploadLogs() {
        Context context = (Context) setPushUniqueId.read(Context.class);
        clearAllData clearalldataIconCompatParcelizer = ((Executors) setPushUniqueId.read(Executors.class)).IconCompatParcelizer();
        clearalldataIconCompatParcelizer.RemoteActionCompatParcelizer(new removeGeofencesRegisteredWithGeofencingClientlambda25(2, new getStableKey("DebugApi", true, new getBitmapFromCachelambda10(clearalldataIconCompatParcelizer, context))), "DebugApi");
    }
}
