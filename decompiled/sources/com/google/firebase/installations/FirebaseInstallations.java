package com.google.firebase.installations;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import kotlin.LazyKt__LazyJVMKt;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AbstractComposeViewensureCompositionCreated11;
import o.AccessibilityIteratorsCharacterTextSegmentIterator;
import o.AccessibilityIteratorsLineTextSegmentIterator;
import o.AccessibilityIteratorsLineTextSegmentIteratorCompanion;
import o.AccessibilityIteratorsPageTextSegmentIterator;
import o.AccessibilityIteratorsParagraphTextSegmentIterator;
import o.LookaheadDelegate;
import o.ParentDataModifierDefaultImpls;
import o.accessgetInstancecp;
import o.accessgetLineInstancecp;
import o.accessgetPageInstancecp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetWcp;
import o.accesssetInstancecp;
import o.following;
import o.getInstance;
import o.getLineEdgeIndex;
import o.getRange;
import o.isEndBoundary;
import o.onLocaleChanged;
import o.preceding;
import o.provideRulerValue;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInstallations implements accesssetInstancecp {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public String IconCompatParcelizer;
    public final Object MediaBrowserCompatMediaItem;
    public final FirebaseApp MediaDescriptionCompat;
    public final LookaheadDelegate MediaMetadataCompat;
    public final ArrayList MediaSessionCompatQueueItem;
    public final zzbv MediaSessionCompatResultReceiverWrapper;
    public final AccessibilityIteratorsLineTextSegmentIterator MediaSessionCompatToken;
    public final FirebaseInstallationServiceClient PlaybackStateCompatCustomAction;
    public final provideRulerValue RatingCompat;
    public final HashSet read;
    public final ExecutorService serializer;
    public final getRange write;

    static {
        new AtomicInteger(1);
    }

    public FirebaseInstallations(FirebaseApp firebaseApp, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0, ExecutorService executorService, LookaheadDelegate lookaheadDelegate) {
        firebaseApp.IconCompatParcelizer();
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = new FirebaseInstallationServiceClient(firebaseApp.read, abstractComposeViewExternalSyntheticLambda0);
        zzbv zzbvVar = new zzbv((Object) firebaseApp, false, 25);
        if (accessgetWcp.read == null) {
            accessgetWcp.read = new accessgetWcp(29);
        }
        accessgetWcp accessgetwcp = accessgetWcp.read;
        if (AccessibilityIteratorsLineTextSegmentIterator.read == null) {
            AccessibilityIteratorsLineTextSegmentIterator.read = new AccessibilityIteratorsLineTextSegmentIterator(accessgetwcp);
        }
        AccessibilityIteratorsLineTextSegmentIterator accessibilityIteratorsLineTextSegmentIterator = AccessibilityIteratorsLineTextSegmentIterator.read;
        provideRulerValue providerulervalue = new provideRulerValue(new ComponentDiscovery$$ExternalSyntheticLambda0(2, firebaseApp));
        getRange getrange = new getRange();
        this.MediaBrowserCompatMediaItem = new Object();
        this.read = new HashSet();
        this.MediaSessionCompatQueueItem = new ArrayList();
        this.MediaDescriptionCompat = firebaseApp;
        this.PlaybackStateCompatCustomAction = firebaseInstallationServiceClient;
        this.MediaSessionCompatResultReceiverWrapper = zzbvVar;
        this.MediaSessionCompatToken = accessibilityIteratorsLineTextSegmentIterator;
        this.RatingCompat = providerulervalue;
        this.write = getrange;
        this.serializer = executorService;
        this.MediaMetadataCompat = lookaheadDelegate;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:5:0x000e, B:7:0x001a, B:9:0x001e, B:11:0x002f, B:18:0x005c, B:19:0x0063, B:13:0x003c, B:15:0x0042, B:17:0x0054), top: B:33:0x000e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0042 A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:5:0x000e, B:7:0x001a, B:9:0x001e, B:11:0x002f, B:18:0x005c, B:19:0x0063, B:13:0x003c, B:15:0x0042, B:17:0x0054), top: B:33:0x000e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:5:0x000e, B:7:0x001a, B:9:0x001e, B:11:0x002f, B:18:0x005c, B:19:0x0063, B:13:0x003c, B:15:0x0042, B:17:0x0054), top: B:33:0x000e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:5:0x000e, B:7:0x001a, B:9:0x001e, B:11:0x002f, B:18:0x005c, B:19:0x0063, B:13:0x003c, B:15:0x0042, B:17:0x0054), top: B:33:0x000e, outer: #0 }] */
    public final void IconCompatParcelizer() {
        following followingVarIconCompatParcelizer;
        String strIconCompatParcelizer;
        synchronized (RemoteActionCompatParcelizer) {
            FirebaseApp firebaseApp = this.MediaDescriptionCompat;
            firebaseApp.IconCompatParcelizer();
            zzbv zzbvVarRemoteActionCompatParcelizer = zzbv.RemoteActionCompatParcelizer(firebaseApp.read);
            try {
                followingVarIconCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer();
                getInstance getinstance = followingVarIconCompatParcelizer.RatingCompat;
                if (getinstance == getInstance.NOT_GENERATED || getinstance == getInstance.ATTEMPT_MIGRATION) {
                    getRange getrange = this.write;
                    FirebaseApp firebaseApp2 = this.MediaDescriptionCompat;
                    firebaseApp2.IconCompatParcelizer();
                    if (!firebaseApp2.ParcelableVolumeInfo.equals("CHIME_ANDROID_SDK")) {
                        firebaseApp2.IconCompatParcelizer();
                        if (!"[DEFAULT]".equals(firebaseApp2.ParcelableVolumeInfo)) {
                            getrange.getClass();
                            strIconCompatParcelizer = getRange.IconCompatParcelizer();
                        } else if (followingVarIconCompatParcelizer.RatingCompat == getInstance.ATTEMPT_MIGRATION) {
                            strIconCompatParcelizer = ((IidStore) this.RatingCompat.write()).read();
                            if (TextUtils.isEmpty(strIconCompatParcelizer)) {
                                getrange.getClass();
                                strIconCompatParcelizer = getRange.IconCompatParcelizer();
                            }
                        } else {
                            getrange.getClass();
                            strIconCompatParcelizer = getRange.IconCompatParcelizer();
                        }
                    } else if (followingVarIconCompatParcelizer.RatingCompat == getInstance.ATTEMPT_MIGRATION) {
                        strIconCompatParcelizer = ((IidStore) this.RatingCompat.write()).read();
                        if (TextUtils.isEmpty(strIconCompatParcelizer)) {
                            getrange.getClass();
                            strIconCompatParcelizer = getRange.IconCompatParcelizer();
                        }
                    } else {
                        getrange.getClass();
                        strIconCompatParcelizer = getRange.IconCompatParcelizer();
                    }
                    zzbv zzbvVar = this.MediaSessionCompatResultReceiverWrapper;
                    preceding precedingVarSerializer = followingVarIconCompatParcelizer.serializer();
                    precedingVarSerializer.write = strIconCompatParcelizer;
                    precedingVarSerializer.RemoteActionCompatParcelizer(getInstance.UNREGISTERED);
                    followingVarIconCompatParcelizer = precedingVarSerializer.read();
                    zzbvVar.write(followingVarIconCompatParcelizer);
                }
                if (zzbvVarRemoteActionCompatParcelizer != null) {
                    zzbvVarRemoteActionCompatParcelizer.MediaMetadataCompat();
                }
            } catch (Throwable th) {
                if (zzbvVarRemoteActionCompatParcelizer != null) {
                    zzbvVarRemoteActionCompatParcelizer.MediaMetadataCompat();
                }
                throw th;
            }
        }
        RemoteActionCompatParcelizer(followingVarIconCompatParcelizer);
        this.MediaMetadataCompat.execute(new FirebaseInstallations$$ExternalSyntheticLambda1(this, 2));
    }

    public final void IconCompatParcelizer(Exception exc) {
        synchronized (this.MediaBrowserCompatMediaItem) {
            Iterator it = this.MediaSessionCompatQueueItem.iterator();
            while (it.hasNext()) {
                if (((AccessibilityIteratorsCharacterTextSegmentIterator) it.next()).RemoteActionCompatParcelizer(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        FirebaseApp firebaseApp = this.MediaDescriptionCompat;
        firebaseApp.IconCompatParcelizer();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(firebaseApp.PlaybackStateCompatCustomAction.IconCompatParcelizer, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.IconCompatParcelizer();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(firebaseApp.PlaybackStateCompatCustomAction.MediaDescriptionCompat, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.IconCompatParcelizer();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(firebaseApp.PlaybackStateCompatCustomAction.write, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        firebaseApp.IconCompatParcelizer();
        String str = firebaseApp.PlaybackStateCompatCustomAction.IconCompatParcelizer;
        Pattern pattern = AccessibilityIteratorsLineTextSegmentIterator.RemoteActionCompatParcelizer;
        accessgetSystemNavigationDowncp.write("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        firebaseApp.IconCompatParcelizer();
        accessgetSystemNavigationDowncp.write("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", AccessibilityIteratorsLineTextSegmentIterator.RemoteActionCompatParcelizer.matcher(firebaseApp.PlaybackStateCompatCustomAction.write).matches());
    }

    public final void RemoteActionCompatParcelizer(following followingVar) {
        synchronized (this.MediaBrowserCompatMediaItem) {
            Iterator it = this.MediaSessionCompatQueueItem.iterator();
            while (it.hasNext()) {
                if (((AccessibilityIteratorsCharacterTextSegmentIterator) it.next()).RemoteActionCompatParcelizer(followingVar)) {
                    it.remove();
                }
            }
        }
    }

    public final following read(following followingVar) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnectionWrite;
        getLineEdgeIndex getlineedgeindexWrite;
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.PlaybackStateCompatCustomAction;
        FirebaseApp firebaseApp = this.MediaDescriptionCompat;
        firebaseApp.IconCompatParcelizer();
        String str = firebaseApp.PlaybackStateCompatCustomAction.write;
        String str2 = followingVar.read;
        FirebaseApp firebaseApp2 = this.MediaDescriptionCompat;
        firebaseApp2.IconCompatParcelizer();
        String str3 = firebaseApp2.PlaybackStateCompatCustomAction.MediaDescriptionCompat;
        String str4 = followingVar.MediaMetadataCompat;
        isEndBoundary isendboundary = firebaseInstallationServiceClient.serializer;
        if (!isendboundary.RemoteActionCompatParcelizer()) {
            FirebaseInstallationsException.serializer serializerVar = FirebaseInstallationsException.serializer.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL url = FirebaseInstallationServiceClient.read("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                FirebaseInstallationsException.serializer serializerVar2 = FirebaseInstallationsException.serializer.BAD_CONFIG;
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            httpURLConnectionWrite = firebaseInstallationServiceClient.write(url, str);
            try {
                httpURLConnectionWrite.setRequestMethod("POST");
                httpURLConnectionWrite.addRequestProperty("Authorization", "FIS_v2 " + str4);
                httpURLConnectionWrite.setDoOutput(true);
                FirebaseInstallationServiceClient.write(httpURLConnectionWrite);
                int responseCode = httpURLConnectionWrite.getResponseCode();
                isendboundary.serializer(responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    getlineedgeindexWrite = FirebaseInstallationServiceClient.IconCompatParcelizer(httpURLConnectionWrite);
                    break;
                }
                FirebaseInstallationServiceClient.serializer(httpURLConnectionWrite, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    accessgetLineInstancecp accessgetlineinstancecpWrite = getLineEdgeIndex.write();
                    accessgetlineinstancecpWrite.RemoteActionCompatParcelizer(AccessibilityIteratorsParagraphTextSegmentIterator.AUTH_ERROR);
                    getlineedgeindexWrite = accessgetlineinstancecpWrite.write();
                    break;
                }
                if (responseCode == 429) {
                    FirebaseInstallationsException.serializer serializerVar3 = FirebaseInstallationsException.serializer.BAD_CONFIG;
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    SentryLogcatAdapter.serializer("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    accessgetLineInstancecp accessgetlineinstancecpWrite2 = getLineEdgeIndex.write();
                    accessgetlineinstancecpWrite2.RemoteActionCompatParcelizer(AccessibilityIteratorsParagraphTextSegmentIterator.BAD_CONFIG);
                    getlineedgeindexWrite = accessgetlineinstancecpWrite2.write();
                    break;
                }
                httpURLConnectionWrite.disconnect();
                TrafficStats.clearThreadStatsTag();
                i++;
            } catch (IOException | AssertionError unused) {
            } catch (Throwable th) {
                httpURLConnectionWrite.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        httpURLConnectionWrite.disconnect();
        TrafficStats.clearThreadStatsTag();
        int i2 = AbstractComposeViewensureCompositionCreated11.read[getlineedgeindexWrite.read().ordinal()];
        if (i2 == 1) {
            String strIconCompatParcelizer = getlineedgeindexWrite.IconCompatParcelizer();
            long jSerializer = getlineedgeindexWrite.serializer();
            this.MediaSessionCompatToken.serializer.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            preceding precedingVarSerializer = followingVar.serializer();
            precedingVarSerializer.serializer = strIconCompatParcelizer;
            precedingVarSerializer.read = jSerializer;
            byte b = (byte) (precedingVarSerializer.MediaDescriptionCompat | 1);
            precedingVarSerializer.MediaMetadataCompat = jCurrentTimeMillis;
            precedingVarSerializer.MediaDescriptionCompat = (byte) (b | 2);
            return precedingVarSerializer.read();
        }
        if (i2 == 2) {
            preceding precedingVarSerializer2 = followingVar.serializer();
            precedingVarSerializer2.RemoteActionCompatParcelizer = "BAD CONFIG";
            precedingVarSerializer2.RemoteActionCompatParcelizer(getInstance.REGISTER_ERROR);
            return precedingVarSerializer2.read();
        }
        if (i2 != 3) {
            FirebaseInstallationsException.serializer serializerVar4 = FirebaseInstallationsException.serializer.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.IconCompatParcelizer = null;
        }
        preceding precedingVarSerializer3 = followingVar.serializer();
        precedingVarSerializer3.RemoteActionCompatParcelizer(getInstance.NOT_GENERATED);
        return precedingVarSerializer3.read();
    }

    public final zzw write() {
        String str;
        RemoteActionCompatParcelizer();
        synchronized (this) {
            str = this.IconCompatParcelizer;
        }
        if (str != null) {
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(str);
        }
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        onLocaleChanged onlocalechanged = new onLocaleChanged(parentDataModifierDefaultImpls);
        synchronized (this.MediaBrowserCompatMediaItem) {
            this.MediaSessionCompatQueueItem.add(onlocalechanged);
        }
        zzw zzwVar = parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
        this.serializer.execute(new FirebaseInstallations$$ExternalSyntheticLambda1(this, 0));
        return zzwVar;
    }

    public final following write(following followingVar) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnectionWrite;
        AccessibilityIteratorsPageTextSegmentIterator accessibilityIteratorsPageTextSegmentIterator;
        String str = followingVar.read;
        String strIconCompatParcelizer = (str == null || str.length() != 11) ? null : ((IidStore) this.RatingCompat.write()).IconCompatParcelizer();
        FirebaseApp firebaseApp = this.MediaDescriptionCompat;
        firebaseApp.IconCompatParcelizer();
        String str2 = firebaseApp.PlaybackStateCompatCustomAction.write;
        firebaseApp.IconCompatParcelizer();
        String str3 = firebaseApp.PlaybackStateCompatCustomAction.MediaDescriptionCompat;
        firebaseApp.IconCompatParcelizer();
        String str4 = firebaseApp.PlaybackStateCompatCustomAction.IconCompatParcelizer;
        FirebaseInstallationServiceClient firebaseInstallationServiceClient = this.PlaybackStateCompatCustomAction;
        isEndBoundary isendboundary = firebaseInstallationServiceClient.serializer;
        if (isendboundary.RemoteActionCompatParcelizer()) {
            URL url = FirebaseInstallationServiceClient.read("projects/" + str3 + "/installations");
            int i = 0;
            while (true) {
                if (i <= 1) {
                    TrafficStats.setThreadStatsTag(32769);
                    httpURLConnectionWrite = firebaseInstallationServiceClient.write(url, str2);
                    try {
                        try {
                            httpURLConnectionWrite.setRequestMethod("POST");
                            httpURLConnectionWrite.setDoOutput(true);
                            if (strIconCompatParcelizer != null) {
                                httpURLConnectionWrite.addRequestProperty("x-goog-fis-android-iid-migration-auth", strIconCompatParcelizer);
                            }
                            FirebaseInstallationServiceClient.serializer(httpURLConnectionWrite, str, str4);
                            int responseCode = httpURLConnectionWrite.getResponseCode();
                            isendboundary.serializer(responseCode);
                            if (responseCode >= 200 && responseCode < 300) {
                                accessibilityIteratorsPageTextSegmentIterator = FirebaseInstallationServiceClient.read(httpURLConnectionWrite);
                                break;
                            }
                            FirebaseInstallationServiceClient.serializer(httpURLConnectionWrite, str4, str2, str3);
                            if (responseCode == 429) {
                                FirebaseInstallationsException.serializer serializerVar = FirebaseInstallationsException.serializer.BAD_CONFIG;
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode >= 500 && responseCode < 600) {
                                httpURLConnectionWrite.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i++;
                            } else {
                                SentryLogcatAdapter.serializer("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                AccessibilityIteratorsLineTextSegmentIteratorCompanion accessibilityIteratorsLineTextSegmentIteratorCompanionSerializer = AccessibilityIteratorsPageTextSegmentIterator.serializer();
                                accessibilityIteratorsLineTextSegmentIteratorCompanionSerializer.serializer(accessgetPageInstancecp.BAD_CONFIG);
                                accessibilityIteratorsPageTextSegmentIterator = accessibilityIteratorsLineTextSegmentIteratorCompanionSerializer.read();
                                break;
                            }
                        } catch (IOException | AssertionError unused) {
                        }
                    } catch (Throwable th) {
                        httpURLConnectionWrite.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        throw th;
                    }
                } else {
                    FirebaseInstallationsException.serializer serializerVar2 = FirebaseInstallationsException.serializer.BAD_CONFIG;
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
            }
            httpURLConnectionWrite.disconnect();
            TrafficStats.clearThreadStatsTag();
            int i2 = AbstractComposeViewensureCompositionCreated11.write[accessibilityIteratorsPageTextSegmentIterator.read().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    preceding precedingVarSerializer = followingVar.serializer();
                    precedingVarSerializer.RemoteActionCompatParcelizer = "BAD CONFIG";
                    precedingVarSerializer.RemoteActionCompatParcelizer(getInstance.REGISTER_ERROR);
                    return precedingVarSerializer.read();
                }
                FirebaseInstallationsException.serializer serializerVar3 = FirebaseInstallationsException.serializer.BAD_CONFIG;
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            String strRemoteActionCompatParcelizer = accessibilityIteratorsPageTextSegmentIterator.RemoteActionCompatParcelizer();
            String strWrite = accessibilityIteratorsPageTextSegmentIterator.write();
            this.MediaSessionCompatToken.serializer.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            String strIconCompatParcelizer2 = accessibilityIteratorsPageTextSegmentIterator.IconCompatParcelizer().IconCompatParcelizer();
            long jSerializer = accessibilityIteratorsPageTextSegmentIterator.IconCompatParcelizer().serializer();
            preceding precedingVarSerializer2 = followingVar.serializer();
            precedingVarSerializer2.write = strRemoteActionCompatParcelizer;
            precedingVarSerializer2.RemoteActionCompatParcelizer(getInstance.REGISTERED);
            precedingVarSerializer2.serializer = strIconCompatParcelizer2;
            precedingVarSerializer2.IconCompatParcelizer = strWrite;
            precedingVarSerializer2.read = jSerializer;
            byte b = (byte) (precedingVarSerializer2.MediaDescriptionCompat | 1);
            precedingVarSerializer2.MediaMetadataCompat = jCurrentTimeMillis;
            precedingVarSerializer2.MediaDescriptionCompat = (byte) (b | 2);
            return precedingVarSerializer2.read();
        }
        FirebaseInstallationsException.serializer serializerVar4 = FirebaseInstallationsException.serializer.BAD_CONFIG;
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final zzw read() {
        RemoteActionCompatParcelizer();
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        accessgetInstancecp accessgetinstancecp = new accessgetInstancecp(this.MediaSessionCompatToken, parentDataModifierDefaultImpls);
        synchronized (this.MediaBrowserCompatMediaItem) {
            this.MediaSessionCompatQueueItem.add(accessgetinstancecp);
        }
        zzw zzwVar = parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
        this.serializer.execute(new FirebaseInstallations$$ExternalSyntheticLambda1(this, 1));
        return zzwVar;
    }
}
