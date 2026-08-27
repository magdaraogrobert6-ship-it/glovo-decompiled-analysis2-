package o;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigAutoFetch;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import o.removeConnectionToComposeViewContext;
import o.requestClearInvalidObservations;
import o.setLastMatrixRecalculationAnimationTimeui;
import o.setPrimaryDirectionalMotionAxisOverrider2epLt8ui;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class setConfiguration implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ ConfigAutoFetch write;

    @Override // java.lang.Runnable
    public final void run() {
        final ConfigAutoFetch configAutoFetch = this.write;
        int i = this.IconCompatParcelizer;
        final long j = this.read;
        synchronized (configAutoFetch) {
            final int i2 = i - 1;
            final Task taskRemoteActionCompatParcelizer = configAutoFetch.write.RemoteActionCompatParcelizer(setFrameEndSchedulerui.REALTIME, 3 - i2);
            final Task task = configAutoFetch.IconCompatParcelizer.read();
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(taskRemoteActionCompatParcelizer, task).continueWithTask(configAutoFetch.MediaSessionCompatQueueItem, new OuterPlacementScope() { // from class: com.google.firebase.remoteconfig.internal.ConfigAutoFetch$$ExternalSyntheticLambda0
                @Override // o.OuterPlacementScope
                public final Object then(Task task2) throws JSONException {
                    Boolean boolValueOf;
                    ConfigAutoFetch configAutoFetch2 = configAutoFetch;
                    Task task3 = taskRemoteActionCompatParcelizer;
                    Task task4 = task;
                    long j2 = j;
                    int i3 = i2;
                    if (!task3.isSuccessful()) {
                        return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task3.getException(), 0)});
                    }
                    if (!task4.isSuccessful()) {
                        return (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task4.getException(), 0)});
                    }
                    setLastMatrixRecalculationAnimationTimeui setlastmatrixrecalculationanimationtimeui = (setLastMatrixRecalculationAnimationTimeui) task3.getResult();
                    setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer = (setPrimaryDirectionalMotionAxisOverrider2epLt8ui) task4.getResult();
                    setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui = setlastmatrixrecalculationanimationtimeui.IconCompatParcelizer;
                    if (setprimarydirectionalmotionaxisoverrider2eplt8ui != null) {
                        boolValueOf = Boolean.valueOf(setprimarydirectionalmotionaxisoverrider2eplt8ui.MediaBrowserCompatMediaItem >= j2);
                    } else {
                        boolValueOf = Boolean.valueOf(setlastmatrixrecalculationanimationtimeui.read == 1);
                    }
                    if (!boolValueOf.booleanValue()) {
                        configAutoFetch2.read(i3, j2);
                        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
                    }
                    if (setlastmatrixrecalculationanimationtimeui.IconCompatParcelizer == null) {
                        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
                    }
                    if (setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer == null) {
                        setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer = setPrimaryDirectionalMotionAxisOverrider2epLt8ui.RemoteActionCompatParcelizer().serializer();
                    }
                    setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui2 = setlastmatrixrecalculationanimationtimeui.IconCompatParcelizer;
                    JSONObject jSONObject = setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer.MediaMetadataCompat;
                    JSONObject jSONObject2 = setprimarydirectionalmotionaxisoverrider2eplt8ui2.IconCompatParcelizer;
                    JSONObject jSONObject3 = setprimarydirectionalmotionaxisoverrider2eplt8ui2.write;
                    JSONObject jSONObject4 = setprimarydirectionalmotionaxisoverrider2eplt8ui2.MediaMetadataCompat;
                    JSONObject jSONObject5 = setPrimaryDirectionalMotionAxisOverrider2epLt8ui.write(new JSONObject(jSONObject2.toString())).write;
                    HashMap mapWrite = setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer.write();
                    HashMap mapWrite2 = setprimarydirectionalmotionaxisoverrider2eplt8ui2.write();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject6 = setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer.write;
                    Iterator<String> itKeys = jSONObject6.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject6.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else if ((jSONObject.has(next) && !jSONObject4.has(next)) || (!jSONObject.has(next) && jSONObject4.has(next))) {
                            hashSet.add(next);
                        } else if (jSONObject.has(next) && jSONObject4.has(next) && !jSONObject.getJSONObject(next).toString().equals(jSONObject4.getJSONObject(next).toString())) {
                            hashSet.add(next);
                        } else if (mapWrite.containsKey(next) != mapWrite2.containsKey(next)) {
                            hashSet.add(next);
                        } else if (mapWrite.containsKey(next) && mapWrite2.containsKey(next) && !((Map) mapWrite.get(next)).equals(mapWrite2.get(next))) {
                            hashSet.add(next);
                        } else {
                            jSONObject5.remove(next);
                        }
                    }
                    Iterator<String> itKeys2 = jSONObject5.keys();
                    while (itKeys2.hasNext()) {
                        hashSet.add(itKeys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
                    }
                    removeConnectionToComposeViewContext removeconnectiontocomposeviewcontext = new removeConnectionToComposeViewContext(hashSet);
                    synchronized (configAutoFetch2) {
                        Iterator it = configAutoFetch2.serializer.iterator();
                        while (it.hasNext()) {
                            ((requestClearInvalidObservations) it.next()).RemoteActionCompatParcelizer(removeconnectiontocomposeviewcontext);
                        }
                    }
                    return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
                }
            });
        }
    }

    public setConfiguration(ConfigAutoFetch configAutoFetch, int i, long j) {
        this.write = configAutoFetch;
        this.IconCompatParcelizer = i;
        this.read = j;
    }
}
