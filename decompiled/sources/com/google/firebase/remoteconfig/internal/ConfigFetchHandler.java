package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.LazyKt__LazyJVMKt;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AndroidComposeViewCompanion;
import o.accesssetInstancecp;
import o.logTree;
import o.setFrameEndSchedulerui;
import o.setLastMatrixRecalculationAnimationTimeui;
import o.setOnReadyForComposition;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class ConfigFetchHandler {
    public static final int[] IconCompatParcelizer = {2, 4, 8, 16, 32, 64, Fields.SpotShadowColor, Fields.RotationX};
    public final AndroidComposeViewCompanion MediaDescriptionCompat;
    public final ConfigFetchHttpClient MediaMetadataCompat;
    public final Random MediaSessionCompatQueueItem;
    public final accesssetInstancecp RatingCompat;
    public final Map RemoteActionCompatParcelizer;
    public final setOnReadyForComposition read;
    public final Executor serializer;
    public final AbstractComposeViewExternalSyntheticLambda0 write;

    public final setLastMatrixRecalculationAnimationTimeui IconCompatParcelizer(String str, String str2, Date date, HashMap map) throws FirebaseRemoteConfigException {
        String str3;
        try {
            HttpURLConnection httpURLConnectionRemoteActionCompatParcelizer = this.MediaMetadataCompat.RemoteActionCompatParcelizer();
            ConfigFetchHttpClient configFetchHttpClient = this.MediaMetadataCompat;
            HashMap mapSerializer = serializer();
            String string = this.MediaDescriptionCompat.read.getString("last_fetch_etag", null);
            logTree logtree = (logTree) this.write.write();
            setLastMatrixRecalculationAnimationTimeui setlastmatrixrecalculationanimationtimeuiFetch = configFetchHttpClient.fetch(httpURLConnectionRemoteActionCompatParcelizer, str, str2, mapSerializer, string, map, logtree == null ? null : (Long) logtree.IconCompatParcelizer(true).get("_fot"), date, this.MediaDescriptionCompat.read());
            if (setlastmatrixrecalculationanimationtimeuiFetch.RemoteActionCompatParcelizer() != null) {
                AndroidComposeViewCompanion androidComposeViewCompanion = this.MediaDescriptionCompat;
                long j = setlastmatrixrecalculationanimationtimeuiFetch.RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem;
                synchronized (androidComposeViewCompanion.RemoteActionCompatParcelizer) {
                    androidComposeViewCompanion.read.edit().putLong("last_template_version", j).apply();
                }
            }
            if (setlastmatrixrecalculationanimationtimeuiFetch.serializer() != null) {
                AndroidComposeViewCompanion androidComposeViewCompanion2 = this.MediaDescriptionCompat;
                String strSerializer = setlastmatrixrecalculationanimationtimeuiFetch.serializer();
                synchronized (androidComposeViewCompanion2.RemoteActionCompatParcelizer) {
                    androidComposeViewCompanion2.read.edit().putString("last_fetch_etag", strSerializer).apply();
                }
            }
            this.MediaDescriptionCompat.read(0, AndroidComposeViewCompanion.serializer);
            return setlastmatrixrecalculationanimationtimeuiFetch;
        } catch (FirebaseRemoteConfigServerException e) {
            int i = e.read;
            AndroidComposeViewCompanion androidComposeViewCompanion3 = this.MediaDescriptionCompat;
            if (i == 429 || i == 502 || i == 503 || i == 504) {
                int iWrite = androidComposeViewCompanion3.write().write() + 1;
                long millis = TimeUnit.MINUTES.toMillis(IconCompatParcelizer[Math.min(iWrite, 8) - 1]);
                androidComposeViewCompanion3.read(iWrite, new Date(date.getTime() + (millis / 2) + ((long) this.MediaSessionCompatQueueItem.nextInt((int) millis))));
            }
            DeltaDecoder deltaDecoderWrite = androidComposeViewCompanion3.write();
            int i2 = e.read;
            if (deltaDecoderWrite.write() > 1 || i2 == 429) {
                deltaDecoderWrite.RemoteActionCompatParcelizer().getTime();
                throw new FirebaseRemoteConfigFetchThrottledException();
            }
            int i3 = e.read;
            if (i3 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i3 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i3 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i3 != 500) {
                    switch (i3) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(e.read, "Fetch failed: ".concat(str3), e);
        }
    }

    public final Task RemoteActionCompatParcelizer(Task task, long j, HashMap map) {
        Task taskContinueWithTask;
        Date date = new Date(System.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        AndroidComposeViewCompanion androidComposeViewCompanion = this.MediaDescriptionCompat;
        if (zIsSuccessful) {
            Date date2 = new Date(androidComposeViewCompanion.read.getLong("last_fetch_time_in_millis", -1L));
            if (!date2.equals(AndroidComposeViewCompanion.IconCompatParcelizer) && date.before(new Date(TimeUnit.SECONDS.toMillis(j) + date2.getTime()))) {
                return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(setLastMatrixRecalculationAnimationTimeui.IconCompatParcelizer());
            }
        }
        Date dateRemoteActionCompatParcelizer = androidComposeViewCompanion.write().RemoteActionCompatParcelizer();
        if (!date.before(dateRemoteActionCompatParcelizer)) {
            dateRemoteActionCompatParcelizer = null;
        }
        Executor executor = this.serializer;
        if (dateRemoteActionCompatParcelizer != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime((dateRemoteActionCompatParcelizer.getTime() - date.getTime()) / 1000);
            dateRemoteActionCompatParcelizer.getTime();
            taskContinueWithTask = (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{new FirebaseRemoteConfigFetchThrottledException(str)});
        } else {
            FirebaseInstallations firebaseInstallations = (FirebaseInstallations) this.RatingCompat;
            zzw zzwVarWrite = firebaseInstallations.write();
            zzw zzwVar = firebaseInstallations.read();
            taskContinueWithTask = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(zzwVarWrite, zzwVar).continueWithTask(executor, new ConfigFetchHandler$$ExternalSyntheticLambda1(this, zzwVarWrite, zzwVar, date, map));
        }
        return taskContinueWithTask.continueWithTask(executor, new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, 3, date));
    }

    public final Task RemoteActionCompatParcelizer(setFrameEndSchedulerui setframeendschedulerui, int i) {
        HashMap map = new HashMap(this.RemoteActionCompatParcelizer);
        map.put("X-Firebase-RC-Fetch-Type", setframeendschedulerui.getValue() + "/" + i);
        return this.read.read().continueWithTask(this.serializer, new ArrivalProgressObserver$$ExternalSyntheticLambda0(this, 4, map));
    }

    public final HashMap serializer() {
        HashMap map = new HashMap();
        logTree logtree = (logTree) this.write.write();
        if (logtree != null) {
            for (Map.Entry entry : logtree.IconCompatParcelizer(false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    public ConfigFetchHandler(accesssetInstancecp accesssetinstancecp, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0, Executor executor, Random random, setOnReadyForComposition setonreadyforcomposition, ConfigFetchHttpClient configFetchHttpClient, AndroidComposeViewCompanion androidComposeViewCompanion, HashMap map) {
        this.RatingCompat = accesssetinstancecp;
        this.write = abstractComposeViewExternalSyntheticLambda0;
        this.serializer = executor;
        this.MediaSessionCompatQueueItem = random;
        this.read = setonreadyforcomposition;
        this.MediaMetadataCompat = configFetchHttpClient;
        this.MediaDescriptionCompat = androidComposeViewCompanion;
        this.RemoteActionCompatParcelizer = map;
    }
}
