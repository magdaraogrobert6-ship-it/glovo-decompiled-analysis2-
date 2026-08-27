package o;

import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.EventUploadResult;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.quota.BandwidthQuotaMonitor;
import com.sentiance.sdk.tile.j$$ExternalSyntheticLambda1;
import com.sentiance.sdk.util.Optional;
import com.sentiance.sdk.util.database.WhereClause;
import io.sentry.Scopes$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "EventUploader", guardType = Guard$Type.REFERENCE_COUNTED)
public class forJsonPutlambda0 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final readandroid_sdk_base_release MediaBrowserCompatMediaItem;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 MediaDescriptionCompat;
    private final r8lambdaJvvdxZf_wI8IlMo_UBnPuJBuDT0 MediaMetadataCompat;
    private final requestSingleLocationUpdatelambda6 MediaSessionCompatQueueItem;
    private final isGeofencesEnabledFromEnvironmentlambda1 MediaSessionCompatResultReceiverWrapper;
    private final BandwidthQuotaMonitor MediaSessionCompatToken;
    private int ParcelableVolumeInfo;
    private final retrieveRegisteredGeofencesFromLocalStoragelambda0 PlaybackStateCompat;
    private final parseLonglambda0 RatingCompat;
    private final component4android_sdk_base_release RemoteActionCompatParcelizer;
    private final getVerticalAccuracy read;
    private final ConfigurationManager serializer;
    private final getCooldownEnterSeconds write;
    private getEnabledannotations r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
    private r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
    private final LinkedList PlaybackStateCompatCustomAction = new LinkedList();

    private void IconCompatParcelizer() {
        synchronized (this) {
            getEnabledannotations getenabledannotations = (getEnabledannotations) this.PlaybackStateCompatCustomAction.poll();
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getenabledannotations;
            if (getenabledannotations == null) {
                return;
            }
            this.RatingCompat.IconCompatParcelizer("Starting upload for %s", getenabledannotations.serializer());
            this.ParcelableVolumeInfo = 0;
            if (this.MediaSessionCompatToken.serializer()) {
                this.RatingCompat.IconCompatParcelizer("Network quota has exceeded", new Object[0]);
                read(EventUploadResult.ResultType.FAILURE_QUOTA);
                return;
            }
            long j = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.read().read();
            long j2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer().read();
            List<Integer> onBackPressedInput = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaBrowserCompatMediaItem() ? this.serializer.getOnBackPressedInput() : this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write();
            getCooldownEnterSeconds getcooldownenterseconds = this.write;
            getcooldownenterseconds.getClass();
            List list = (List) getcooldownenterseconds.serializer(Collections.EMPTY_LIST, new getEnterEvents(getcooldownenterseconds, 1, WhereClause.serializer("event_time").RemoteActionCompatParcelizer(Long.valueOf(j)).IconCompatParcelizer("event_time").write(Long.valueOf(j2)).IconCompatParcelizer("is_submitted").write(0).IconCompatParcelizer("is_valid").write(1).IconCompatParcelizer("type").read(onBackPressedInput)));
            _init_lambda00 _init_lambda00Var = !list.isEmpty() ? new _init_lambda00(list, this.read, this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer, this.RatingCompat) : null;
            parseLonglambda0 parselonglambda0 = this.RatingCompat;
            if (_init_lambda00Var == null) {
                parselonglambda0.IconCompatParcelizer("Nothing to do for %s", this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer());
                read(EventUploadResult.ResultType.SUCCESS);
            } else {
                parselonglambda0.IconCompatParcelizer("About to submit %d events for %s", Integer.valueOf(_init_lambda00Var.IconCompatParcelizer().size()), this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.serializer());
                IconCompatParcelizer(_init_lambda00Var);
            }
        }
    }

    public static void RemoteActionCompatParcelizer(forJsonPutlambda0 forjsonputlambda0, String str) {
        synchronized (forjsonputlambda0) {
            getEnabledannotations getenabledannotations = forjsonputlambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            if (getenabledannotations == null || !str.equals(getenabledannotations.serializer())) {
                Iterator it = forjsonputlambda0.PlaybackStateCompatCustomAction.iterator();
                while (it.hasNext()) {
                    if (((getEnabledannotations) it.next()).serializer().equals(str)) {
                        it.remove();
                        break;
                    }
                }
            } else {
                r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38 = forjsonputlambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (r8lambda4gsaww0uf5fhes0li0lym_jwy38 != null) {
                    r8lambda4gsaww0uf5fhes0li0lym_jwy38.serializer();
                }
                forjsonputlambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
            }
        }
        forjsonputlambda0.MediaDescriptionCompat.IconCompatParcelizer();
    }

    public static /* synthetic */ void read(forJsonPutlambda0 forjsonputlambda0) {
        boolean z;
        synchronized (forjsonputlambda0) {
            if (forjsonputlambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
                forjsonputlambda0.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (getEnabledannotations) forjsonputlambda0.PlaybackStateCompatCustomAction.peek();
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            forjsonputlambda0.IconCompatParcelizer();
        }
        forjsonputlambda0.MediaDescriptionCompat.IconCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.PlaybackStateCompatCustomAction.clear();
            r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (r8lambda4gsaww0uf5fhes0li0lym_jwy38 != null) {
                r8lambda4gsaww0uf5fhes0li0lym_jwy38.serializer();
            }
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        }
        this.MediaDescriptionCompat.write();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
    }

    public static void IconCompatParcelizer(forJsonPutlambda0 forjsonputlambda0, getEnabledannotations getenabledannotations) {
        forjsonputlambda0.RatingCompat.IconCompatParcelizer("Received on-demand event upload request with ID %s", getenabledannotations.serializer());
        synchronized (forjsonputlambda0) {
            forjsonputlambda0.PlaybackStateCompatCustomAction.add(getenabledannotations);
        }
        forjsonputlambda0.MediaDescriptionCompat.read();
        forjsonputlambda0.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new ZM$$ExternalSyntheticLambda2(21, forjsonputlambda0));
        forjsonputlambda0.MediaDescriptionCompat.IconCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(getEnabledannotations getenabledannotations) {
        this.MediaDescriptionCompat.read();
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 5, getenabledannotations));
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        getCooldownEnterSeconds getcooldownenterseconds;
        ConfigurationManager configurationManager = this.serializer;
        List<Integer> onBackPressedInput = configurationManager.getOnBackPressedInput();
        if (onBackPressedInput.isEmpty()) {
            return null;
        }
        this.IconCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.DAYS.toMillis(configurationManager.read());
        HashMap map = new HashMap();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Iterator<Integer> it = onBackPressedInput.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            getcooldownenterseconds = this.write;
            if (!zHasNext) {
                break;
            }
            Integer next = it.next();
            next.getClass();
            getcooldownenterseconds.getClass();
            List list = (List) getcooldownenterseconds.serializer(Collections.EMPTY_LIST, new getEnterEvents(getcooldownenterseconds, 0, Collections.singletonList(next)));
            Long lValueOf = !list.isEmpty() ? Long.valueOf(Math.max(((getCooldownEnterSeconds.read) list.get(0)).RemoteActionCompatParcelizer(), jCurrentTimeMillis - millis)) : null;
            if (lValueOf != null) {
                int iIntValue = next.intValue();
                this.read.getClass();
                map.put(getVerticalAccuracy.write(iIntValue), lValueOf);
                jCurrentTimeMillis2 = Math.min(jCurrentTimeMillis2, lValueOf.longValue());
            }
        }
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI.class, Long.valueOf(jCurrentTimeMillis2));
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, r8lambdaRSLn0N_71NX5fiy5YO7KnSgyI.class);
        }
        return map;
    }

    public forJsonPutlambda0(getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, component4android_sdk_base_release component4android_sdk_base_releaseVar, requestSingleLocationUpdatelambda6 requestsinglelocationupdatelambda6, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, ConfigurationManager configurationManager, r8lambdaJvvdxZf_wI8IlMo_UBnPuJBuDT0 r8lambdajvvdxzf_wi8ilmo_ubnpujbudt0, parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, BandwidthQuotaMonitor bandwidthQuotaMonitor, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, retrieveRegisteredGeofencesFromLocalStoragelambda0 retrieveregisteredgeofencesfromlocalstoragelambda0) {
        this.write = getcooldownenterseconds;
        this.serializer = configurationManager;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.read = getverticalaccuracy;
        this.RemoteActionCompatParcelizer = component4android_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = requestsinglelocationupdatelambda6;
        this.MediaMetadataCompat = r8lambdajvvdxzf_wi8ilmo_ubnpujbudt0;
        this.RatingCompat = parselonglambda0;
        this.MediaBrowserCompatMediaItem = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatToken = bandwidthQuotaMonitor;
        this.MediaSessionCompatResultReceiverWrapper = isgeofencesenabledfromenvironmentlambda1;
        this.PlaybackStateCompat = retrieveregisteredgeofencesfromlocalstoragelambda0;
        this.MediaDescriptionCompat = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IconCompatParcelizer(_init_lambda00 _init_lambda00Var) {
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            boolean z = false;
            if (this.MediaSessionCompatToken.serializer()) {
                this.RatingCompat.IconCompatParcelizer("Network quota has exceeded", new Object[0]);
                read(EventUploadResult.ResultType.FAILURE_QUOTA);
                return;
            }
            isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1 = this.MediaSessionCompatResultReceiverWrapper;
            boolean zMediaDescriptionCompat = isgeofencesenabledfromenvironmentlambda1.MediaDescriptionCompat();
            boolean zRatingCompat = isgeofencesenabledfromenvironmentlambda1.RatingCompat();
            boolean zRemoteActionCompatParcelizer = this.PlaybackStateCompat.RemoteActionCompatParcelizer();
            this.RatingCompat.IconCompatParcelizer("%s; %s; %s", zMediaDescriptionCompat ? "Connected to WiFi" : "Not connected to WiFi", zRatingCompat ? "has network connection" : "has no network connection", zRemoteActionCompatParcelizer ? "allowed to upload logs over mobile data" : "not allowed to upload logs over mobile data");
            if (!zMediaDescriptionCompat && (!zRatingCompat || !zRemoteActionCompatParcelizer)) {
                this.RatingCompat.IconCompatParcelizer("Network conditions are not suitable, aborting upload.", new Object[0]);
                read(EventUploadResult.ResultType.FAILURE_OTHER);
                return;
            }
            _init_lambda00Var.RemoteActionCompatParcelizer();
            r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38IconCompatParcelizer = this.MediaSessionCompatQueueItem.IconCompatParcelizer(_init_lambda00Var);
            synchronized (this) {
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda4gsaww0uf5fhes0li0lym_jwy38IconCompatParcelizer;
                if (r8lambda4gsaww0uf5fhes0li0lym_jwy38IconCompatParcelizer != null) {
                    this.MediaDescriptionCompat.read();
                    r8lambda4gsaww0uf5fhes0li0lym_jwy38IconCompatParcelizer.serializer(new copyandroid_sdk_base_releasedefault(this, _init_lambda00Var));
                    z = true;
                }
            }
            if (z) {
                return;
            }
        }
        read(EventUploadResult.ResultType.FAILURE_OTHER);
    }

    public static void read(forJsonPutlambda0 forjsonputlambda0, getEnabledannotations getenabledannotations, EventUploadResult.ResultType resultType) {
        int i = forjsonputlambda0.ParcelableVolumeInfo;
        if (i > 0) {
            forjsonputlambda0.RatingCompat.IconCompatParcelizer("%d events uploaded successfully for %s", Integer.valueOf(i), getenabledannotations.serializer());
            forjsonputlambda0.MediaMetadataCompat.serializer();
        }
        getenabledannotations.IconCompatParcelizer().IconCompatParcelizer(new EventUploadResult(getenabledannotations.serializer(), resultType));
        forjsonputlambda0.IconCompatParcelizer();
        forjsonputlambda0.MediaDescriptionCompat.IconCompatParcelizer();
    }

    public final void write(String str) {
        synchronized (this) {
            this.MediaDescriptionCompat.read();
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new Scopes$$ExternalSyntheticLambda0(this, 6, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(EventUploadResult.ResultType resultType) {
        getEnabledannotations getenabledannotations = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (getenabledannotations != null) {
            this.MediaDescriptionCompat.read();
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new j$$ExternalSyntheticLambda1(this, getenabledannotations, resultType, 7), "EventUploader");
        }
    }
}
