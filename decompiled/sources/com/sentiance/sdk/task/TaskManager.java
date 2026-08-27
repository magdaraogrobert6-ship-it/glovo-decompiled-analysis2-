package com.sentiance.sdk.task;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;
import com.sentiance.sdk.threading.executors.Executors;
import com.sentiance.sdk.util.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.BrazeNotificationPayloadActionButton;
import o.accessgetDataStoreInstanceCachecp;
import o.accessgetDataStoreScopeMapcp;
import o.accessgetScopeCreationLockcp;
import o.addBannerViewMonitor;
import o.containsandroid_sdk_base_release;
import o.createOrGetDataStoredefault;
import o.createOrGetDataStorelambda00;
import o.createOrGetDataStorelambda01;
import o.createOrGetDataStorelambda010;
import o.getAnalyticsEnabledEnterannotations;
import o.migrateTriggersReeligibilityToJsonlambda1;
import o.parseLonglambda0;
import o.r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdagt3oK5KQTHEeIi2U7fLzQ1_MnQY;
import o.r8lambdarI00A69l7k7NAO4I9NDF7haFpGI;
import o.readFloatlambda0;
import o.readList;
import o.readandroid_sdk_base_release;
import o.removeGeofencesRegisteredWithGeofencingClientlambda2;
import o.setPushUniqueId;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TaskManager implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final r8lambdarI00A69l7k7NAO4I9NDF7haFpGI MediaBrowserCompatMediaItem;
    private final ConfigurationManager MediaDescriptionCompat;
    private final parseLonglambda0 MediaMetadataCompat;
    private final readandroid_sdk_base_release MediaSessionCompatQueueItem;
    private final containsandroid_sdk_base_release MediaSessionCompatToken;
    private ArrayList ParcelableVolumeInfo;
    private final readFloatlambda0 PlaybackStateCompat;
    private final r8lambdagt3oK5KQTHEeIi2U7fLzQ1_MnQY RatingCompat;
    private final Executors RemoteActionCompatParcelizer;
    private final Context read;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI serializer;
    private final c write;
    private int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
    private final HashMap PlaybackStateCompatCustomAction = new HashMap();
    private final migrateTriggersReeligibilityToJsonlambda1<Map<String, Integer>> MediaSessionCompatResultReceiverWrapper = new accessgetDataStoreInstanceCachecp(this);

    private void serializer(createOrGetDataStorelambda00 createorgetdatastorelambda00, TaskStage taskStage, long j) {
        synchronized (this) {
            createOrGetDataStorelambda01 createorgetdatastorelambda01Serializer = serializer(createorgetdatastorelambda00);
            if (taskStage == TaskStage.STOP) {
                r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = this.serializer;
                long jWrite = createorgetdatastorelambda01Serializer.write();
                r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
                this.RatingCompat.serializer(j, createorgetdatastorelambda00.RemoteActionCompatParcelizer().MediaMetadataCompat(), taskStage.name, Long.valueOf(j - (System.currentTimeMillis() - (SystemClock.elapsedRealtime() - jWrite))));
            } else {
                this.RatingCompat.serializer(j, createorgetdatastorelambda00.RemoteActionCompatParcelizer().MediaMetadataCompat(), taskStage.name);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(createOrGetDataStorelambda00 createorgetdatastorelambda00, boolean z) {
        synchronized (this) {
            createOrGetDataStorelambda01 createorgetdatastorelambda01Serializer = serializer(createorgetdatastorelambda00);
            if (createorgetdatastorelambda01Serializer.serializer()) {
                synchronized (this) {
                    this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY--;
                    serializer();
                    serializer(createorgetdatastorelambda00, TaskStage.STOPPING);
                    boolean z2 = serializer(createorgetdatastorelambda01Serializer.write()) > DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
                    if (!z && this.MediaBrowserCompatMediaItem.serializer() && z2) {
                        this.MediaMetadataCompat.IconCompatParcelizer("Task %s will assist with guarding", createorgetdatastorelambda00.RemoteActionCompatParcelizer().MediaMetadataCompat());
                        createorgetdatastorelambda01Serializer.write(true);
                        serializer(true);
                    } else {
                        serializer(createorgetdatastorelambda00).write(false);
                        RemoteActionCompatParcelizer(createorgetdatastorelambda00, z);
                    }
                    createorgetdatastorelambda01Serializer.read();
                    serializer(createorgetdatastorelambda00, TaskStage.STOP);
                }
            }
        }
    }

    public abstract void RemoteActionCompatParcelizer(createOrGetDataStorelambda00 createorgetdatastorelambda00, boolean z);

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            for (createOrGetDataStorelambda00 createorgetdatastorelambda00 : (ArrayList) write()) {
                read(createorgetdatastorelambda00.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer());
                write(createorgetdatastorelambda00.RemoteActionCompatParcelizer().MediaMetadataCompat());
            }
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
        }
    }

    public abstract void read(createOrGetDataStorelambda00 createorgetdatastorelambda00, boolean z);

    public abstract boolean serializer(int i);

    public abstract void write(String str);

    public enum TaskStage {
        START("start"),
        STOPPING("stopping"),
        STOP("stop");

        String name;

        TaskStage(String str) {
            this.name = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap IconCompatParcelizer() {
        HashMap map;
        synchronized (this.PlaybackStateCompatCustomAction) {
            map = new HashMap(this.PlaybackStateCompatCustomAction);
        }
        return map;
    }

    public static void IconCompatParcelizer(TaskManager taskManager) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) taskManager.write()).iterator();
        while (it.hasNext()) {
            arrayList.add(((createOrGetDataStorelambda00) it.next()).RemoteActionCompatParcelizer().MediaMetadataCompat());
        }
        for (String str : taskManager.MediaSessionCompatResultReceiverWrapper.read().keySet()) {
            if (!arrayList.contains(str)) {
                taskManager.write(str);
            }
        }
    }

    public final HashMap RemoteActionCompatParcelizer() {
        HashMap map = new HashMap();
        String strWrite = this.write.write("task_info_hashes", "{\"task_info_hashes\":[]}");
        try {
            JSONObject jSONObject = new JSONObject(strWrite);
            HashMap map2 = new HashMap();
            if (jSONObject.has("task_info_hashes")) {
                map2 = new HashMap();
                JSONArray jSONArray = jSONObject.getJSONArray("task_info_hashes");
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                    String str = (String) jSONArray2.get(0);
                    Integer num = (Integer) jSONArray2.get(1);
                    num.getClass();
                    map2.put(str, num);
                }
            }
            return map2;
        } catch (ClassCastException | JSONException e) {
            this.MediaMetadataCompat.IconCompatParcelizer(false, e, "Failed to deserialize the task info has list: %s", strWrite);
            return map;
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new createOrGetDataStoredefault(this, this.MediaSessionCompatQueueItem));
    }

    public TaskManager(Context context, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, Executors executors, r8lambdagt3oK5KQTHEeIi2U7fLzQ1_MnQY r8lambdagt3ok5kqtheeii2u7flzq1_mnqy, c cVar, parseLonglambda0 parselonglambda0, r8lambdarI00A69l7k7NAO4I9NDF7haFpGI r8lambdari00a69l7k7nao4i9ndf7hafpgi, ConfigurationManager configurationManager, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, readList readlist, readFloatlambda0 readfloatlambda0) {
        this.read = context;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.serializer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RemoteActionCompatParcelizer = executors;
        this.write = cVar;
        this.MediaMetadataCompat = parselonglambda0;
        this.MediaBrowserCompatMediaItem = r8lambdari00a69l7k7nao4i9ndf7hafpgi;
        this.MediaDescriptionCompat = configurationManager;
        this.MediaSessionCompatQueueItem = readandroid_sdk_base_releaseVar;
        this.RatingCompat = r8lambdagt3ok5kqtheeii2u7flzq1_mnqy;
        this.PlaybackStateCompat = readfloatlambda0;
        containsandroid_sdk_base_release containsandroid_sdk_base_releaseVarWrite = readlist.write();
        this.MediaSessionCompatToken = containsandroid_sdk_base_releaseVarWrite;
        containsandroid_sdk_base_releaseVarWrite.RemoteActionCompatParcelizer(new accessgetDataStoreScopeMapcp(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void serializer(boolean z) {
        synchronized (this) {
            if (!z) {
                Iterator it = IconCompatParcelizer().values().iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!((createOrGetDataStorelambda01) it.next()).IconCompatParcelizer());
            }
            if (!this.MediaSessionCompatToken.write(9)) {
                this.MediaSessionCompatToken.read(9, DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
            }
        }
    }

    public static void write(TaskManager taskManager) {
        migrateTriggersReeligibilityToJsonlambda1<Map<String, Integer>> migratetriggersreeligibilitytojsonlambda1 = taskManager.MediaSessionCompatResultReceiverWrapper;
        HashMap map = new HashMap();
        for (createOrGetDataStorelambda00 createorgetdatastorelambda00 : (ArrayList) taskManager.write()) {
            map.put(createorgetdatastorelambda00.RemoteActionCompatParcelizer().MediaMetadataCompat(), Integer.valueOf(createorgetdatastorelambda00.RemoteActionCompatParcelizer().hashCode()));
        }
        migratetriggersreeligibilitytojsonlambda1.read().clear();
        migratetriggersreeligibilitytojsonlambda1.read().putAll(map);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, Integer> entry : migratetriggersreeligibilitytojsonlambda1.read().entrySet()) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(entry.getKey());
            jSONArray2.put(entry.getValue());
            jSONArray.put(jSONArray2);
        }
        try {
            jSONObject.put("task_info_hashes", jSONArray);
        } catch (JSONException e) {
            taskManager.MediaMetadataCompat.IconCompatParcelizer(false, e, "Failed to add task info hash list", new Object[0]);
        }
        taskManager.write.RemoteActionCompatParcelizer("task_info_hashes", jSONObject.toString());
    }

    private void serializer() {
        this.MediaMetadataCompat.IconCompatParcelizer("Notifying of new running task count: %d", Integer.valueOf(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY));
        this.MediaBrowserCompatMediaItem.write(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
    }

    public final List<createOrGetDataStorelambda00> write() {
        if (this.ParcelableVolumeInfo == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.PlaybackStateCompat.IconCompatParcelizer().iterator();
            while (it.hasNext()) {
                arrayList.add((createOrGetDataStorelambda00) setPushUniqueId.read((Class) it.next()));
            }
            this.ParcelableVolumeInfo = arrayList;
        }
        return this.ParcelableVolumeInfo;
    }

    public static boolean RemoteActionCompatParcelizer(TaskManager taskManager) {
        return taskManager.MediaBrowserCompatMediaItem.serializer();
    }

    public final void read() {
        synchronized (this) {
            for (Map.Entry entry : IconCompatParcelizer().entrySet()) {
                createOrGetDataStorelambda01 createorgetdatastorelambda01 = (createOrGetDataStorelambda01) entry.getValue();
                if (createorgetdatastorelambda01.serializer() || createorgetdatastorelambda01.IconCompatParcelizer()) {
                    createOrGetDataStorelambda00 createorgetdatastorelambda00 = (createOrGetDataStorelambda00) entry.getKey();
                    serializer(createorgetdatastorelambda00).write(false);
                    RemoteActionCompatParcelizer(createorgetdatastorelambda00, false);
                }
            }
        }
    }

    public final boolean read(createOrGetDataStorelambda00 createorgetdatastorelambda00, long j) {
        synchronized (this) {
            if (this.MediaDescriptionCompat.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw()) {
                return false;
            }
            createOrGetDataStorelambda01 createorgetdatastorelambda01Serializer = serializer(createorgetdatastorelambda00);
            createorgetdatastorelambda01Serializer.write(j);
            this.serializer.getClass();
            serializer(createorgetdatastorelambda00, TaskStage.START, System.currentTimeMillis() - (SystemClock.elapsedRealtime() - j));
            synchronized (this) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY++;
                serializer();
                createorgetdatastorelambda01Serializer.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(new accessgetScopeCreationLockcp((createOrGetDataStorelambda010) this, createorgetdatastorelambda00), "TaskManager");
            }
            return true;
        }
    }

    private createOrGetDataStorelambda01 serializer(createOrGetDataStorelambda00 createorgetdatastorelambda00) {
        createOrGetDataStorelambda01 createorgetdatastorelambda01;
        synchronized (this.PlaybackStateCompatCustomAction) {
            createorgetdatastorelambda01 = (createOrGetDataStorelambda01) this.PlaybackStateCompatCustomAction.get(createorgetdatastorelambda00);
            if (createorgetdatastorelambda01 == null) {
                createorgetdatastorelambda01 = new createOrGetDataStorelambda01(createorgetdatastorelambda00, this.RemoteActionCompatParcelizer.read());
                this.PlaybackStateCompatCustomAction.put(createorgetdatastorelambda00, createorgetdatastorelambda01);
            }
        }
        return createorgetdatastorelambda01;
    }

    private void serializer(createOrGetDataStorelambda00 createorgetdatastorelambda00, TaskStage taskStage) {
        synchronized (this) {
            this.serializer.getClass();
            serializer(createorgetdatastorelambda00, taskStage, System.currentTimeMillis());
        }
    }

    public final void serializer(createOrGetDataStorelambda00 createorgetdatastorelambda00, boolean z) {
        this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(new f$$ExternalSyntheticLambda1(this, createorgetdatastorelambda00, z, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long serializer(long j) {
        long jMax;
        synchronized (this) {
            this.serializer.getClass();
            jMax = Math.max(0L, 540000 - (SystemClock.elapsedRealtime() - j));
        }
        return jMax;
    }

    public final createOrGetDataStorelambda00 write(int i) {
        for (createOrGetDataStorelambda00 createorgetdatastorelambda00 : (ArrayList) write()) {
            if (createorgetdatastorelambda00.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer() == i) {
                return createorgetdatastorelambda00;
            }
        }
        return null;
    }

    public static void serializer(TaskManager taskManager, createOrGetDataStorelambda00 createorgetdatastorelambda00) {
        taskManager.serializer(createorgetdatastorelambda00).write(false);
        taskManager.RemoteActionCompatParcelizer(createorgetdatastorelambda00, false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    public static void read(TaskManager taskManager) {
        boolean z;
        for (createOrGetDataStorelambda00 createorgetdatastorelambda00 : (ArrayList) taskManager.write()) {
            createorgetdatastorelambda00.getClass();
            if (!(createorgetdatastorelambda00 instanceof BrazeNotificationPayloadActionButton)) {
                Integer num = taskManager.MediaSessionCompatResultReceiverWrapper.read().get(createorgetdatastorelambda00.RemoteActionCompatParcelizer().MediaMetadataCompat());
                if (num != null) {
                    try {
                        z = num.intValue() != createorgetdatastorelambda00.RemoteActionCompatParcelizer().hashCode();
                    } catch (NumberFormatException e) {
                        taskManager.MediaMetadataCompat.IconCompatParcelizer(false, e, "Task hash is not numeric", new Object[0]);
                    }
                }
                taskManager.read(createorgetdatastorelambda00, z);
            }
        }
    }

    public final boolean read(int i) {
        boolean zSerializer;
        synchronized (this) {
            createOrGetDataStorelambda00 createorgetdatastorelambda00Write = write(i);
            if (createorgetdatastorelambda00Write == null) {
                return false;
            }
            createOrGetDataStorelambda01 createorgetdatastorelambda01Serializer = serializer(createorgetdatastorelambda00Write);
            if (!createorgetdatastorelambda01Serializer.serializer()) {
                return false;
            }
            synchronized (this) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY--;
                serializer();
                createorgetdatastorelambda01Serializer.read();
                createorgetdatastorelambda01Serializer.write(false);
                serializer(createorgetdatastorelambda00Write, TaskStage.STOPPING);
                zSerializer = serializer(i);
                serializer(createorgetdatastorelambda00Write, TaskStage.STOP);
            }
            return zSerializer;
        }
    }
}
