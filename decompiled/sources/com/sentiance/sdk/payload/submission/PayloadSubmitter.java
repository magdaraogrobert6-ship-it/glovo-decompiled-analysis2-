package com.sentiance.sdk.payload.submission;

import android.content.IntentFilter;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.pNP$$ExternalSyntheticLambda5;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.payload.batching.BatchingEvaluation;
import com.sentiance.sdk.payload.batching.PayloadBatcher;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.quota.BandwidthQuotaMonitor;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import com.sentiance.sdk.util.Optional;
import com.sentiance.sdk.util.database.WhereClause;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import o.BannerPendingDismissal;
import o.BrazeNotificationUtilsExternalSyntheticLambda0;
import o.BrazeNotificationUtilsExternalSyntheticLambda34;
import o.ServerConfigDataStoreProviderCompanion;
import o.addBannerViewMonitor;
import o.getAnalyticsEnabledEnterannotations;
import o.isGeofencesEnabledFromEnvironmentlambda1;
import o.parseLonglambda0;
import o.r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38;
import o.r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M;
import o.r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k;
import o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I;
import o.r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.readandroid_sdk_base_release;
import o.removeGeofencesRegisteredWithGeofencingClientlambda2;
import o.removeGeofencesRegisteredWithGeofencingClientlambda22;
import o.requestSingleLocationUpdatelambda4;
import o.routeUserWithNotificationOpenedIntentandroid_sdk_ui_release;
import o.setShouldPersistWebViewWhenBackgroundingApp;
import o.setSmallNotificationIconNameandroid_sdk_base_release;
import o.setSummaryTextIfPresentAndSupportedlambda1;
import o.setVisibilityIfPresentAndSupported;
import o.setVisibilityIfPresentAndSupportedlambda0;
import o.setVisibilityIfPresentAndSupportedlambda1;
import o.wakeScreenIfAppropriate;
import o.wakeScreenIfAppropriatelambda0;
import o.wakeScreenIfAppropriatelambda3;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "PayloadSubmitter", guardType = Guard$Type.REFERENCE_COUNTED)
public class PayloadSubmitter extends r8lambdaQAShlesJf6NzG1CuBMO3e9m802I implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final BrazeNotificationUtilsExternalSyntheticLambda0 IconCompatParcelizer;
    private final getAnalyticsEnabledEnterannotations MediaBrowserCompatMediaItem;
    private final ServerConfigDataStoreProviderCompanion MediaDescriptionCompat;
    private final BandwidthQuotaMonitor MediaMetadataCompat;
    private final requestSingleLocationUpdatelambda4 MediaSessionCompatQueueItem;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 MediaSessionCompatResultReceiverWrapper;
    private boolean ParcelableVolumeInfo;
    private final readandroid_sdk_base_release PlaybackStateCompat;
    private final isGeofencesEnabledFromEnvironmentlambda1 RatingCompat;
    private final PayloadBatcher RemoteActionCompatParcelizer;
    private final wakeScreenIfAppropriatelambda3 read;
    private final ConfigurationManager serializer;
    private final parseLonglambda0 write;
    private final LinkedList PlaybackStateCompatCustomAction = new LinkedList();
    private final ArrayList ResultReceiver = new ArrayList();
    private setVisibilityIfPresentAndSupportedlambda1 ComponentActivity = null;
    private wakeScreenIfAppropriatelambda0 r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
    private final removeGeofencesRegisteredWithGeofencingClientlambda22 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new setSummaryTextIfPresentAndSupportedlambda1(this);
    private final LinkedList MediaSessionCompatToken = new LinkedList();

    public enum SubmissionResult {
        SUCCESS,
        FAILURE,
        SKIPPED,
        CANCELLED
    }

    public static void read(PayloadSubmitter payloadSubmitter, boolean z) {
        synchronized (payloadSubmitter) {
            int i = 1;
            if (payloadSubmitter.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                payloadSubmitter.write.IconCompatParcelizer("Cannot complete the request due to null ongoing request data.", new Object[0]);
                payloadSubmitter.MediaSessionCompatResultReceiverWrapper.read();
                payloadSubmitter.PlaybackStateCompat.RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(i, payloadSubmitter));
                payloadSubmitter.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
                return;
            }
            for (wakeScreenIfAppropriatelambda3.serializer serializerVar : payloadSubmitter.PlaybackStateCompatCustomAction) {
                if (!payloadSubmitter.IconCompatParcelizer.read(serializerVar.write) && !payloadSubmitter.ResultReceiver.contains(serializerVar.IconCompatParcelizer)) {
                    payloadSubmitter.read.serializer(serializerVar.IconCompatParcelizer);
                }
            }
            payloadSubmitter.write.IconCompatParcelizer("Bytes on disk after backlog submission: " + payloadSubmitter.read.RemoteActionCompatParcelizer(), new Object[0]);
            payloadSubmitter.MediaBrowserCompatMediaItem.IconCompatParcelizer(ControlMessage.PAYLOAD_SUBMISSION_RESULT, new BannerPendingDismissal("PayloadSubmitter", payloadSubmitter.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer, payloadSubmitter.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read, z));
            if (payloadSubmitter.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer != null) {
                payloadSubmitter.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer.serializer(!z);
            }
            payloadSubmitter.read();
            payloadSubmitter.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        }
    }

    public static /* synthetic */ void serializer(PayloadSubmitter payloadSubmitter) {
        boolean z;
        synchronized (payloadSubmitter) {
            if (payloadSubmitter.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
                payloadSubmitter.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (wakeScreenIfAppropriatelambda0) payloadSubmitter.MediaSessionCompatToken.peek();
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            payloadSubmitter.read();
        }
        payloadSubmitter.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.MediaSessionCompatToken.clear();
            setVisibilityIfPresentAndSupportedlambda1 setvisibilityifpresentandsupportedlambda1 = this.ComponentActivity;
            if (setvisibilityifpresentandsupportedlambda1 != null && setvisibilityifpresentandsupportedlambda1.serializer != null) {
                this.ComponentActivity.serializer.serializer();
            }
        }
        this.MediaDescriptionCompat.serializer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
    }

    @Override // o.r8lambdaQAShlesJf6NzG1CuBMO3e9m802I
    public final void serializer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, setShouldPersistWebViewWhenBackgroundingApp setshouldpersistwebviewwhenbackgroundingapp, setSmallNotificationIconNameandroid_sdk_base_release setsmallnotificationiconnameandroid_sdk_base_release) {
        wakeScreenIfAppropriatelambda3.serializer serializerVar;
        SubmissionResult submissionResult;
        synchronized (this) {
            setVisibilityIfPresentAndSupportedlambda1 setvisibilityifpresentandsupportedlambda1 = this.ComponentActivity;
            serializerVar = setvisibilityifpresentandsupportedlambda1 != null ? setvisibilityifpresentandsupportedlambda1.RemoteActionCompatParcelizer : null;
        }
        boolean z = false;
        if (serializerVar == null) {
            this.write.RemoteActionCompatParcelizer("onResponse: Could not find the payload entry", new Object[0]);
            RemoteActionCompatParcelizer();
            this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
            return;
        }
        if (setshouldpersistwebviewwhenbackgroundingapp.write() && setshouldpersistwebviewwhenbackgroundingapp.RatingCompat.write().contains("_rs")) {
            z = true;
        }
        if (setshouldpersistwebviewwhenbackgroundingapp.serializer != 413) {
            if (!z) {
                submissionResult = SubmissionResult.FAILURE;
            }
            read(serializerVar, submissionResult);
            this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        }
        IconCompatParcelizer(serializerVar.IconCompatParcelizer, "Server responded with 413 (payload too large).");
        submissionResult = SubmissionResult.SUCCESS;
        read(serializerVar, submissionResult);
        this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
    }

    public final void write(wakeScreenIfAppropriatelambda0 wakescreenifappropriatelambda0) {
        BrazeNotificationUtilsExternalSyntheticLambda34 brazeNotificationUtilsExternalSyntheticLambda34;
        synchronized (this) {
            this.MediaSessionCompatToken.remove(wakescreenifappropriatelambda0);
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null || !wakescreenifappropriatelambda0.RemoteActionCompatParcelizer().equals(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer())) {
                this.write.IconCompatParcelizer("Removing queued request for %s.", wakescreenifappropriatelambda0.serializer);
                brazeNotificationUtilsExternalSyntheticLambda34 = wakescreenifappropriatelambda0.IconCompatParcelizer;
            } else {
                this.write.IconCompatParcelizer("Stopping submissions for %s.", wakescreenifappropriatelambda0.serializer);
                this.ParcelableVolumeInfo = false;
                setVisibilityIfPresentAndSupportedlambda1 setvisibilityifpresentandsupportedlambda1 = this.ComponentActivity;
                if (setvisibilityifpresentandsupportedlambda1 != null && setvisibilityifpresentandsupportedlambda1.serializer != null) {
                    this.ComponentActivity.serializer.serializer();
                }
                brazeNotificationUtilsExternalSyntheticLambda34 = null;
            }
        }
        if (brazeNotificationUtilsExternalSyntheticLambda34 != null) {
            brazeNotificationUtilsExternalSyntheticLambda34.serializer(true);
        }
    }

    public static void RatingCompat(PayloadSubmitter payloadSubmitter) {
        payloadSubmitter.MediaDescriptionCompat.RemoteActionCompatParcelizer(payloadSubmitter.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:121:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:144:0x024a  */
    public void RemoteActionCompatParcelizer() {
        Byte b;
        r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38Write;
        if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
            this.write.IconCompatParcelizer("Cannot submit next entry. The ongoing request is null.", new Object[0]);
        } else {
            if (this.ParcelableVolumeInfo) {
                wakeScreenIfAppropriatelambda3.serializer serializerVar = (wakeScreenIfAppropriatelambda3.serializer) this.PlaybackStateCompatCustomAction.poll();
                if (serializerVar == null) {
                    RemoteActionCompatParcelizer(true);
                    return;
                }
                r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38 = null;
                if (!this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read && !this.IconCompatParcelizer.RemoteActionCompatParcelizer(serializerVar.write)) {
                    String str = serializerVar.write;
                    Locale locale = Locale.US;
                    serializer(serializerVar.MediaSessionCompatQueueItem, (IOException) null, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Network conditions no longer suitable for type ", str));
                    read(serializerVar, SubmissionResult.FAILURE);
                    return;
                }
                synchronized (this) {
                    this.ComponentActivity = new setVisibilityIfPresentAndSupportedlambda1(serializerVar);
                }
                boolean z = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read;
                if (this.MediaMetadataCompat.serializer()) {
                    parseLonglambda0 parselonglambda0 = this.write;
                    if (!z) {
                        parselonglambda0.IconCompatParcelizer("Could not submit payload due to quota", new Object[0]);
                        read(serializerVar, SubmissionResult.FAILURE);
                        return;
                    }
                    parselonglambda0.IconCompatParcelizer("Quota exceeded, but forceSubmit=true: submitting anyway", new Object[0]);
                }
                File fileRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(serializerVar.IconCompatParcelizer);
                if (fileRemoteActionCompatParcelizer == null) {
                    IconCompatParcelizer(serializerVar.IconCompatParcelizer, "File not found");
                    read(serializerVar, SubmissionResult.SKIPPED);
                    return;
                }
                ConfigurationManager configurationManager = this.serializer;
                String str2 = serializerVar.write;
                configurationManager.getClass();
                if (str2 != null) {
                    switch (str2) {
                        case "tripEvent|trip_end":
                            b = (byte) 5;
                            break;
                        case "timeline":
                            b = (byte) 19;
                            break;
                        case "status_update":
                            b = (byte) 25;
                            break;
                        case "stationaryEvent|stationary_end":
                            b = (byte) 9;
                            break;
                        case "device_info":
                            b = (byte) 2;
                            break;
                        case "step_count":
                            b = (byte) 22;
                            break;
                        case "app_foreground_session":
                            b = (byte) 21;
                            break;
                        case "stationaryEvent|stationary_start":
                            b = (byte) 8;
                            break;
                        case "metadata":
                            b = (byte) 3;
                            break;
                        case "sdk_reset":
                            b = (byte) 24;
                            break;
                        case "tripEvent|motion_activity_event":
                            b = (byte) 7;
                            break;
                        case "externalEvent":
                            b = (byte) 12;
                            break;
                        case "trip":
                            b = (byte) 1;
                            break;
                        case "tripEvent|trip_start":
                            b = (byte) 4;
                            break;
                        case "sleep":
                            b = (byte) 11;
                            break;
                        case "stationaryEvent|waypoint":
                            b = (byte) 10;
                            break;
                        case "offTheGridEvent":
                            b = (byte) 13;
                            break;
                        case "tripEvent|crash":
                            b = (byte) 16;
                            break;
                        case "user_segments":
                            b = (byte) 23;
                            break;
                        case "tripEvent|waypoint":
                            b = (byte) 6;
                            break;
                        default:
                            b = null;
                            break;
                    }
                } else {
                    b = null;
                }
                try {
                    r8lambda4gsaww0uf5fhes0li0lym_jwy38Write = this.MediaSessionCompatQueueItem.write(fileRemoteActionCompatParcelizer, z, serializerVar.MediaBrowserCompatMediaItem, b);
                } catch (FileNotFoundException e) {
                    this.write.IconCompatParcelizer(false, e, "Payload file not found", new Object[0]);
                    r8lambda4gsaww0uf5fhes0li0lym_jwy38Write = null;
                }
                synchronized (this) {
                    setVisibilityIfPresentAndSupportedlambda1 setvisibilityifpresentandsupportedlambda1 = this.ComponentActivity;
                    if (setvisibilityifpresentandsupportedlambda1 != null) {
                        setvisibilityifpresentandsupportedlambda1.serializer = r8lambda4gsaww0uf5fhes0li0lym_jwy38Write;
                        if (this.ParcelableVolumeInfo) {
                            r8lambda4gsaww0uf5fhes0li0lym_jwy38 = r8lambda4gsaww0uf5fhes0li0lym_jwy38Write;
                        } else {
                            this.write.IconCompatParcelizer("Cannot keep submitting, aborting", new Object[0]);
                        }
                        if (r8lambda4gsaww0uf5fhes0li0lym_jwy38 != null) {
                            this.MediaSessionCompatResultReceiverWrapper.read();
                            r8lambda4gsaww0uf5fhes0li0lym_jwy38.serializer(this);
                        }
                        r8lambda4gsaww0uf5fhes0li0lym_jwy38Write = r8lambda4gsaww0uf5fhes0li0lym_jwy38;
                    }
                }
                if (r8lambda4gsaww0uf5fhes0li0lym_jwy38Write == null) {
                    read(serializerVar, SubmissionResult.FAILURE);
                    return;
                }
                return;
            }
            this.write.IconCompatParcelizer("Cannot keep submitting, aborting", new Object[0]);
        }
        RemoteActionCompatParcelizer(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(boolean z) {
        this.MediaSessionCompatResultReceiverWrapper.read();
        this.PlaybackStateCompat.RemoteActionCompatParcelizer(new pNP$$ExternalSyntheticLambda5(this, z, 4));
    }

    private void read() {
        Optional<WhereClause> optionalWrite;
        synchronized (this) {
            this.ParcelableVolumeInfo = true;
            wakeScreenIfAppropriatelambda0 wakescreenifappropriatelambda0 = (wakeScreenIfAppropriatelambda0) this.MediaSessionCompatToken.poll();
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = wakescreenifappropriatelambda0;
            if (wakescreenifappropriatelambda0 == null) {
                return;
            }
            long jRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
            this.write.IconCompatParcelizer("Bytes on disk before backlog submission: %d", Long.valueOf(jRemoteActionCompatParcelizer));
            if (jRemoteActionCompatParcelizer == 0) {
                RemoteActionCompatParcelizer(true);
                return;
            }
            int i = 0;
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read) {
                this.write.IconCompatParcelizer("Force submitting payloads: quotas and current network type will be ignored", new Object[0]);
                optionalWrite = this.read.write();
            } else {
                optionalWrite = this.IconCompatParcelizer.read();
            }
            Long l = (Long) this.read.serializer(-1L, new routeUserWithNotificationOpenedIntentandroid_sdk_ui_release(i));
            long jLongValue = l.longValue();
            if (!optionalWrite.IconCompatParcelizer()) {
                this.write.IconCompatParcelizer("No payloads are eligible right now (%d payloads are ineligible)", l);
                RemoteActionCompatParcelizer(true);
                return;
            }
            List<wakeScreenIfAppropriatelambda3.serializer> listWrite = this.read.read(optionalWrite.write());
            this.write.IconCompatParcelizer("About to submit %d payloads (%d are ineligible, eligible types: %s)", Integer.valueOf(listWrite.size()), Long.valueOf(jLongValue - listWrite.size()), r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(Arrays.asList(optionalWrite.write().RemoteActionCompatParcelizer()), ","));
            if (!this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read) {
                listWrite = this.IconCompatParcelizer.write(listWrite);
            }
            this.IconCompatParcelizer.IconCompatParcelizer(listWrite);
            this.IconCompatParcelizer.serializer(listWrite);
            this.ResultReceiver.clear();
            this.PlaybackStateCompatCustomAction.clear();
            this.PlaybackStateCompatCustomAction.addAll(listWrite);
            RemoteActionCompatParcelizer();
        }
    }

    public PayloadSubmitter(parseLonglambda0 parselonglambda0, BrazeNotificationUtilsExternalSyntheticLambda0 brazeNotificationUtilsExternalSyntheticLambda0, ConfigurationManager configurationManager, wakeScreenIfAppropriatelambda3 wakescreenifappropriatelambda3, BandwidthQuotaMonitor bandwidthQuotaMonitor, requestSingleLocationUpdatelambda4 requestsinglelocationupdatelambda4, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, PayloadBatcher payloadBatcher, ServerConfigDataStoreProviderCompanion serverConfigDataStoreProviderCompanion, r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        this.MediaSessionCompatResultReceiverWrapper = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.write = parselonglambda0;
        this.IconCompatParcelizer = brazeNotificationUtilsExternalSyntheticLambda0;
        this.serializer = configurationManager;
        this.RemoteActionCompatParcelizer = payloadBatcher;
        this.read = wakescreenifappropriatelambda3;
        this.MediaMetadataCompat = bandwidthQuotaMonitor;
        this.MediaSessionCompatQueueItem = requestsinglelocationupdatelambda4;
        this.MediaBrowserCompatMediaItem = getanalyticsenabledenterannotations;
        this.RatingCompat = isgeofencesenabledfromenvironmentlambda1;
        this.MediaDescriptionCompat = serverConfigDataStoreProviderCompanion;
        this.PlaybackStateCompat = readandroid_sdk_base_releaseVar;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        ControlMessage controlMessage = ControlMessage.PAYLOAD_FORCE_SUBMISSION;
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.PlaybackStateCompat;
        setVisibilityIfPresentAndSupportedlambda0 setvisibilityifpresentandsupportedlambda0 = new setVisibilityIfPresentAndSupportedlambda0(this, readandroid_sdk_base_releaseVar, 0);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.MediaBrowserCompatMediaItem;
        getanalyticsenabledenterannotations.read(controlMessage, setvisibilityifpresentandsupportedlambda0);
        getanalyticsenabledenterannotations.read(ControlMessage.PAYLOAD_READY, new setVisibilityIfPresentAndSupportedlambda0(this, readandroid_sdk_base_releaseVar, 1));
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new setVisibilityIfPresentAndSupported(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.read(ControlMessage.SUBMIT_BATCHED_PAYLOADS, new setVisibilityIfPresentAndSupportedlambda0(this, readandroid_sdk_base_releaseVar, 2));
    }

    public static void RemoteActionCompatParcelizer(PayloadSubmitter payloadSubmitter, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wakeScreenIfAppropriatelambda3.serializer serializerVar = (wakeScreenIfAppropriatelambda3.serializer) it.next();
            BatchingEvaluation batchingEvaluationRemoteActionCompatParcelizer = payloadSubmitter.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(serializerVar);
            if (batchingEvaluationRemoteActionCompatParcelizer == BatchingEvaluation.SUCCESS) {
                String str = serializerVar.write;
                Locale locale = Locale.US;
                payloadSubmitter.serializer(serializerVar.MediaSessionCompatQueueItem, (IOException) null, ff$$ExternalSyntheticOutline0.m("Payload of type ", str, " was batched"));
            } else {
                String str2 = serializerVar.write;
                String strName = batchingEvaluationRemoteActionCompatParcelizer.name();
                Locale locale2 = Locale.US;
                payloadSubmitter.serializer(serializerVar.MediaSessionCompatQueueItem, (IOException) null, af$$ExternalSyntheticOutline0.m("Payload of type ", str2, " was not batched due to reason ", strName));
                payloadSubmitter.read(new wakeScreenIfAppropriatelambda0("PayloadSubmitter", null));
                return;
            }
        }
    }

    public final void read(wakeScreenIfAppropriatelambda0 wakescreenifappropriatelambda0) {
        this.write.IconCompatParcelizer("Submission request came in from %s", wakescreenifappropriatelambda0.serializer());
        synchronized (this) {
            this.MediaSessionCompatToken.add(wakescreenifappropriatelambda0);
        }
        this.MediaSessionCompatResultReceiverWrapper.read();
        this.PlaybackStateCompat.RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(1, this));
    }

    private void read(wakeScreenIfAppropriatelambda3.serializer serializerVar, SubmissionResult submissionResult) {
        this.MediaSessionCompatResultReceiverWrapper.read();
        this.PlaybackStateCompat.RemoteActionCompatParcelizer(new wakeScreenIfAppropriate(this, serializerVar, submissionResult), "PayloadSubmitter");
    }

    @Override // o.r8lambda2qd0WTXYngtMHSpVeuMB06dloAQ
    public final void RemoteActionCompatParcelizer(r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 r8lambda4gsaww0uf5fhes0li0lym_jwy38, IOException iOException) {
        wakeScreenIfAppropriatelambda3.serializer serializerVar;
        synchronized (this) {
            setVisibilityIfPresentAndSupportedlambda1 setvisibilityifpresentandsupportedlambda1 = this.ComponentActivity;
            serializerVar = setvisibilityifpresentandsupportedlambda1 != null ? setvisibilityifpresentandsupportedlambda1.RemoteActionCompatParcelizer : null;
        }
        if (serializerVar == null) {
            this.write.RemoteActionCompatParcelizer("onFailure: Could not find the payload entry", new Object[0]);
            RemoteActionCompatParcelizer();
            this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        } else {
            serializer(serializerVar.IconCompatParcelizer, iOException, "Error submitting payload");
            read(serializerVar, r8lambda4gsaww0uf5fhes0li0lym_jwy38.write() ? SubmissionResult.CANCELLED : SubmissionResult.FAILURE);
            this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
        }
    }

    public static void RemoteActionCompatParcelizer(PayloadSubmitter payloadSubmitter, wakeScreenIfAppropriatelambda3.serializer serializerVar, Object[] objArr) {
        payloadSubmitter.serializer(serializerVar.MediaSessionCompatQueueItem, (IOException) null, String.format(Locale.US, "Payload submission %s: %s", objArr));
    }

    private void serializer(String str, IOException iOException, String str2) {
        String strM;
        if (str == null) {
            strM = "[no-id]";
        } else {
            strM = m1$$ExternalSyntheticOutline0.m(']', "[", str);
        }
        String str3 = strM + ' ' + str2;
        parseLonglambda0 parselonglambda0 = this.write;
        if (iOException == null) {
            parselonglambda0.IconCompatParcelizer(str3, new Object[0]);
        } else {
            parselonglambda0.IconCompatParcelizer(false, iOException, str3, new Object[0]);
        }
    }

    private void IconCompatParcelizer(String str, String str2) {
        String strM;
        if (str == null) {
            strM = "[no-id]";
        } else {
            strM = m1$$ExternalSyntheticOutline0.m(']', "[", str);
        }
        this.write.IconCompatParcelizer(strM + ' ' + str2, new Object[0]);
    }
}
