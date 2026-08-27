package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class readFloatlambda0 {
    private static readFloatlambda0 RemoteActionCompatParcelizer;
    private final HashSet serializer = new HashSet();

    public static readFloatlambda0 read() {
        readFloatlambda0 readfloatlambda0;
        synchronized (readFloatlambda0.class) {
            if (RemoteActionCompatParcelizer == null) {
                RemoteActionCompatParcelizer = new readFloatlambda0();
            }
            readfloatlambda0 = RemoteActionCompatParcelizer;
        }
        return readfloatlambda0;
    }

    public final ArrayList IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.serializer);
        arrayList.addAll(Arrays.asList(requestSingleLocationUpdateFromGooglePlaylambda4.class, initializeGeofenceslambda1.class, r8lambdaJvvdxZf_wI8IlMo_UBnPuJBuDT0.class, setInlineImagePush.class, BrazeNotificationPayloadActionButton.class, getSubtitleGravity.class, getInstanceannotations.class, BrazeNotificationUtilsExternalSyntheticLambda34.class, r8lambdaI90we4_tg_9aaM1nBxPMKmLPck.class, migrateContentCardsMetadataToJson.class, r8lambda5l9iaoWfq17IIiUdmbHKrQzx4oA.class, migrateTriggersStorageToJsonlambda20.class));
        return arrayList;
    }

    public final void serializer() {
        this.serializer.clear();
    }

    private readFloatlambda0() {
    }

    public final void serializer(Class<? extends createOrGetDataStorelambda00> cls) {
        this.serializer.add(cls);
    }
}
