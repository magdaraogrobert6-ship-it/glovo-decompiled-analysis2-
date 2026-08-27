package com.google.android.gms.internal.gtm;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.cardview.widget.CardView$1;
import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ComponentRegistry$Builder;
import coil3.memory.MemoryCacheService;
import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.inappmessaging.internal.SharedPreferencesUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.logistics.rider.glovo.R;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.android.gestures.ProgressiveGesture;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.plugin.annotation.AnnotationManagerImpl;
import com.mapbox.maps.plugin.gestures.GestureState$Type;
import com.mapbox.maps.plugin.gestures.GestureState$WhenMappings;
import com.roadrunner.home.CreateHomeScope;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyKt__LazyJVMKt;
import o.AbstractComposeView;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.FlingCancellationException;
import o.LayoutModifierNodeKt;
import o.LookaheadAlignmentLines;
import o.LookaheadCapablePlaceable;
import o.LookaheadScopeKtLookaheadScope221;
import o.MeasureScopeMarker;
import o.ModifierNodeElement;
import o.MotionReferencePlacementDelegate;
import o.ParentDataModifierDefaultImpls;
import o.PausedPrecompositionImpl;
import o.PinnableContainer;
import o.accessaddNotificationForSysPropsChange;
import o.accessgetNumPadRightParenthesiscp;
import o.accessgetOuterCoordinator;
import o.accessgetScp;
import o.accessgetSystemNavigationDowncp;
import o.assertConsistent;
import o.checkChildrenPlaceOrderForUpdates;
import o.following;
import o.getActiveFocusTargetNode;
import o.getButtonThumbLeftEK5gGoQ;
import o.getFocusEK5gGoQ;
import o.getFunctionEK5gGoQ;
import o.getInstance;
import o.getIsShowingLayoutBounds;
import o.getLookaheadDelegate;
import o.getMaximumhdzbrEE;
import o.getPositionInRoot;
import o.getProgramYellowEK5gGoQ;
import o.getSafeGestures;
import o.getSourceValueInsetshdzbrEE;
import o.hasui;
import o.nodeToString;
import o.performingMeasureK40F9xA;
import o.preceding;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaxBWoEIk739JmIh5aNadkBGsRfs;
import o.removeLast;
import o.setOnReadyForComposition;
import o.setPrimaryDirectionalMotionAxisOverrider2epLt8ui;
import o.updatePlacedUnderMotionFrameOfReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class zzbv implements PinnableContainer, accessgetNumPadRightParenthesiscp, MeasureScopeMarker, getSafeGestures, assertConsistent, nodeToString, PausedPrecompositionImpl, MotionReferencePlacementDelegate {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static byte read = -112;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public Object write;

    public zzbv(zzbv zzbvVar) {
        this.serializer = 16;
        Context context = (Context) zzbvVar.write;
        int iWrite = accessgetOuterCoordinator.write(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (iWrite != 0) {
            this.write = "Unity";
            String string = context.getResources().getString(iWrite);
            if (string.startsWith("%('")) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                string = ((String) objArr[0]).intern();
                int i = 2 % 2;
            }
            this.RemoteActionCompatParcelizer = string;
            Log.isLoggable("FirebaseCrashlytics", 2);
        } else {
            if (context.getAssets() == null) {
                int i2 = 2 % 2;
            } else {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        int i3 = MediaBrowserCompatMediaItem + 75;
                        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                        inputStreamOpen.close();
                    }
                    this.write = "Flutter";
                    this.RemoteActionCompatParcelizer = null;
                    Log.isLoggable("FirebaseCrashlytics", 2);
                } catch (IOException unused) {
                    this.write = null;
                    this.RemoteActionCompatParcelizer = null;
                }
            }
            this.write = null;
            this.RemoteActionCompatParcelizer = null;
        }
        int i5 = MediaBrowserCompatMediaItem + 69;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
    }

    public following IconCompatParcelizer() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Fields.Clip];
        try {
            File fileSerializer = serializer();
            FileInputStream fileInputStreamWrite = getActiveFocusTargetNode.write(fileSerializer, new FileInputStream(fileSerializer));
            while (true) {
                try {
                    int i = fileInputStreamWrite.read(bArr, 0, Fields.Clip);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStreamWrite.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStreamWrite.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        getInstance getinstance = getInstance.ATTEMPT_MIGRATION;
        int iOptInt = jSONObject.optInt("Status", getinstance.ordinal());
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = following.IconCompatParcelizer;
        preceding precedingVar = new preceding();
        precedingVar.MediaMetadataCompat = 0L;
        precedingVar.MediaDescriptionCompat = (byte) (precedingVar.MediaDescriptionCompat | 2);
        precedingVar.RemoteActionCompatParcelizer(getinstance);
        precedingVar.read = 0L;
        precedingVar.MediaDescriptionCompat = (byte) (precedingVar.MediaDescriptionCompat | 1);
        precedingVar.write = strOptString;
        precedingVar.RemoteActionCompatParcelizer(getInstance.values()[iOptInt]);
        precedingVar.serializer = strOptString2;
        precedingVar.IconCompatParcelizer = strOptString3;
        precedingVar.MediaMetadataCompat = jOptLong;
        byte b = (byte) (precedingVar.MediaDescriptionCompat | 2);
        precedingVar.read = jOptLong2;
        precedingVar.MediaDescriptionCompat = (byte) (b | 1);
        precedingVar.RemoteActionCompatParcelizer = strOptString4;
        return precedingVar.read();
    }

    public void MediaMetadataCompat() {
        try {
            ((FileLock) this.RemoteActionCompatParcelizer).release();
            ((FileChannel) this.write).close();
        } catch (IOException e) {
            SentryLogcatAdapter.read("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    public void RatingCompat() {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(serializer("gtm.globals.eventName"));
        HashMap map = (HashMap) this.RemoteActionCompatParcelizer;
        if (map == null || !map.containsKey("gtm.globals.eventName")) {
            ((zzbv) this.write).RatingCompat();
        } else {
            ((HashMap) this.RemoteActionCompatParcelizer).remove("gtm.globals.eventName");
        }
    }

    public InputStream RemoteActionCompatParcelizer(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        this.write = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            this.RemoteActionCompatParcelizer = inputStream;
            return inputStream;
        }
        String strM = c8$$ExternalSyntheticOutline0.m(responseCode, "Bad response: ");
        if (responseCode == 404) {
            throw new FileNotFoundException(strM);
        }
        if (responseCode == 503) {
            throw new zzjs(strM);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer(strM);
        return null;
    }

    public void RemoteActionCompatParcelizer() {
        String str = (String) this.write;
        try {
            WorkerWrapper.Builder builder = (WorkerWrapper.Builder) this.RemoteActionCompatParcelizer;
            builder.getClass();
            new File((File) builder.read, str).createNewFile();
        } catch (IOException e) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    @Override // o.nodeToString
    public void RemoteActionCompatParcelizer(int i, Bundle bundle) {
        Locale locale = Locale.US;
        Objects.toString(bundle);
        Log.isLoggable("FirebaseCrashlytics", 2);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            performingMeasureK40F9xA performingmeasurek40f9xa = "clx".equals(bundle2.getString("_o")) ? (ProtobufEncoder) this.write : (CreateHomeScope) this.RemoteActionCompatParcelizer;
            if (performingmeasurek40f9xa == null) {
                return;
            }
            performingmeasurek40f9xa.RemoteActionCompatParcelizer(bundle2, string);
        }
    }

    public void RemoteActionCompatParcelizer(getFunctionEK5gGoQ getfunctionek5ggoq, String str) {
        HashMap map = (HashMap) this.RemoteActionCompatParcelizer;
        if (map != null && map.containsKey(str)) {
            ((HashMap) this.RemoteActionCompatParcelizer).put(str, getfunctionek5ggoq);
            return;
        }
        zzbv zzbvVar = (zzbv) this.write;
        if (zzbvVar != null) {
            zzbvVar.RemoteActionCompatParcelizer(getfunctionek5ggoq, str);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Trying to modify a non existent symbol: ".concat(String.valueOf(str)));
        }
    }

    public void clear() {
        MapboxMap mapboxMap = (MapboxMap) ((AnnotationManagerImpl) this.RemoteActionCompatParcelizer).delegateProvider.mapStyleManagerDelegate;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.write;
        for (String str : linkedHashMap.keySet()) {
            if (mapboxMap.hasStyleImage(str)) {
                mapboxMap.removeStyleImage(str);
            }
        }
        linkedHashMap.clear();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095 A[LOOP:0: B:24:0x008f->B:26:0x0095, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public ArrayList read() {
        Bundle bundle;
        ?? arrayList;
        Iterator it;
        ArrayList arrayList2 = new ArrayList();
        zzz zzzVar = (zzz) this.RemoteActionCompatParcelizer;
        Context context = (Context) this.write;
        Class cls = (Class) zzzVar.serializer;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), Fields.SpotShadowColor);
                if (serviceInfo == null) {
                    SentryLogcatAdapter.IconCompatParcelizer("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
                if (bundle == null) {
                    SentryLogcatAdapter.IconCompatParcelizer("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList();
                    for (String str : bundle.keySet()) {
                        if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                            arrayList.add(str.substring(31));
                        }
                    }
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new ComponentDiscovery$$ExternalSyntheticLambda0(0, (String) it.next()));
                }
                return arrayList2;
            }
            SentryLogcatAdapter.IconCompatParcelizer("ComponentDiscovery", "Context has no PackageManager.");
        } catch (PackageManager.NameNotFoundException unused) {
            SentryLogcatAdapter.IconCompatParcelizer("ComponentDiscovery", "Application info not found.");
        }
        bundle = null;
        if (bundle == null) {
            SentryLogcatAdapter.IconCompatParcelizer("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            while (r3.hasNext()) {
                if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str))) {
                }
            }
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ComponentDiscovery$$ExternalSyntheticLambda0(0, (String) it.next()));
        }
        return arrayList2;
    }

    public accessaddNotificationForSysPropsChange read(setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8ui) throws FirebaseRemoteConfigClientException {
        String string;
        JSONArray jSONArray = setprimarydirectionalmotionaxisoverrider2eplt8ui.MediaSessionCompatQueueItem;
        long j = setprimarydirectionalmotionaxisoverrider2eplt8ui.MediaBrowserCompatMediaItem;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    SentryLogcatAdapter.IconCompatParcelizer("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer = ((setOnReadyForComposition) this.write).serializer();
                String string3 = null;
                if (setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer == null) {
                    string = null;
                } else {
                    try {
                        string = setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer.write.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer2 = ((setOnReadyForComposition) this.RemoteActionCompatParcelizer).serializer();
                    if (setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer2 != null) {
                        try {
                            string3 = setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer2.write.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                r8lambdaxBWoEIk739JmIh5aNadkBGsRfs r8lambdaxbwoeik739jmih5anadkbgsrfsMediaBrowserCompatMediaItem = getIsShowingLayoutBounds.MediaBrowserCompatMediaItem();
                r8lambdaxbwoeik739jmih5anadkbgsrfsMediaBrowserCompatMediaItem.read(string2);
                r8lambdaxbwoeik739jmih5anadkbgsrfsMediaBrowserCompatMediaItem.IconCompatParcelizer(jSONObject.getString("variantId"));
                r8lambdaxbwoeik739jmih5anadkbgsrfsMediaBrowserCompatMediaItem.write(strOptString);
                r8lambdaxbwoeik739jmih5anadkbgsrfsMediaBrowserCompatMediaItem.serializer(string);
                r8lambdaxbwoeik739jmih5anadkbgsrfsMediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(j);
                hashSet.add(r8lambdaxbwoeik739jmih5anadkbgsrfsMediaBrowserCompatMediaItem.IconCompatParcelizer());
            } catch (JSONException e) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", (Exception) e);
            }
        }
        return new accessaddNotificationForSysPropsChange(hashSet);
    }

    public getFunctionEK5gGoQ read(String str) {
        HashMap map = (HashMap) this.RemoteActionCompatParcelizer;
        if (map != null && map.containsKey(str)) {
            return (getFunctionEK5gGoQ) ((HashMap) this.RemoteActionCompatParcelizer).get(str);
        }
        zzbv zzbvVar = (zzbv) this.write;
        if (zzbvVar != null) {
            return zzbvVar.read(str);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Trying to get a non existent symbol: ".concat(String.valueOf(str)));
        return null;
    }

    public File serializer() {
        if (((File) this.write) == null) {
            synchronized (this) {
                if (((File) this.write) == null) {
                    String str = "PersistedInstallation." + ((FirebaseApp) this.RemoteActionCompatParcelizer).serializer() + ".json";
                    FirebaseApp firebaseApp = (FirebaseApp) this.RemoteActionCompatParcelizer;
                    firebaseApp.IconCompatParcelizer();
                    File file = new File(firebaseApp.read.getNoBackupFilesDir(), str);
                    this.write = file;
                    if (file.exists()) {
                        return (File) this.write;
                    }
                    FirebaseApp firebaseApp2 = (FirebaseApp) this.RemoteActionCompatParcelizer;
                    firebaseApp2.IconCompatParcelizer();
                    File file2 = new File(firebaseApp2.read.getFilesDir(), str);
                    if (file2.exists() && !file2.renameTo((File) this.write)) {
                        SentryLogcatAdapter.read("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                        return file2;
                    }
                }
            }
        }
        return (File) this.write;
    }

    @Override // o.accessgetNumPadRightParenthesiscp
    public /* synthetic */ void serializer(Object obj, Object obj2) {
        ((zzdz) obj).read((r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) this.write, (LocationRequest) this.RemoteActionCompatParcelizer, (ParentDataModifierDefaultImpls) obj2);
    }

    @Override // o.assertConsistent
    public void serializer(Set set) {
        LookaheadCapablePlaceable lookaheadCapablePlaceable = (LookaheadCapablePlaceable) this.RemoteActionCompatParcelizer;
        String str = (String) this.write;
        if (str.isEmpty()) {
            lookaheadCapablePlaceable.getClass();
            return;
        }
        ConcurrentHashMap concurrentHashMap = lookaheadCapablePlaceable.RemoteActionCompatParcelizer;
        if (!concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null || !str.equals("fiam") || set == null || set.isEmpty()) {
            return;
        }
        ((LookaheadAlignmentLines) lookaheadCapablePlaceable.RemoteActionCompatParcelizer.get(str)).serializer(set);
    }

    public void serializer(getFunctionEK5gGoQ getfunctionek5ggoq, String str) {
        if (((HashMap) this.RemoteActionCompatParcelizer) == null) {
            this.RemoteActionCompatParcelizer = new HashMap();
        }
        ((HashMap) this.RemoteActionCompatParcelizer).put(str, getfunctionek5ggoq);
    }

    public boolean serializer(String str) {
        HashMap map = (HashMap) this.RemoteActionCompatParcelizer;
        if (map != null && map.containsKey(str)) {
            return true;
        }
        zzbv zzbvVar = (zzbv) this.write;
        if (zzbvVar != null) {
            return zzbvVar.serializer(str);
        }
        return false;
    }

    @Override // o.PausedPrecompositionImpl
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        checkChildrenPlaceOrderForUpdates checkchildrenplaceorderforupdates = (checkChildrenPlaceOrderForUpdates) this.RemoteActionCompatParcelizer;
        if (bool.booleanValue()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            boolean zBooleanValue = bool.booleanValue();
            ComponentRegistry$Builder componentRegistry$Builder = checkchildrenplaceorderforupdates.MediaMetadataCompat;
            if (zBooleanValue) {
                ((ParentDataModifierDefaultImpls) componentRegistry$Builder.serializer).write(null);
                return ((Task) this.write).onSuccessTask(checkchildrenplaceorderforupdates.MediaDescriptionCompat.read, new zzz(this));
            }
            componentRegistry$Builder.getClass();
            ScreenStartObserver$$ExternalSyntheticLambda0.write("An invalid data collection token was used.");
            return null;
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        WorkerWrapper.Builder builder = checkchildrenplaceorderforupdates.MediaSessionCompatQueueItem;
        Iterator it = WorkerWrapper.Builder.serializer(((File) builder.read).listFiles(checkChildrenPlaceOrderForUpdates.IconCompatParcelizer)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        WorkerWrapper.Builder builder2 = ((ModifierNodeElement) checkchildrenplaceorderforupdates.ParcelableVolumeInfo.MediaSessionCompatQueueItem).MediaBrowserCompatMediaItem;
        ModifierNodeElement.RemoteActionCompatParcelizer(WorkerWrapper.Builder.serializer(((File) builder2.MediaMetadataCompat).listFiles()));
        ModifierNodeElement.RemoteActionCompatParcelizer(WorkerWrapper.Builder.serializer(((File) builder2.IconCompatParcelizer).listFiles()));
        ModifierNodeElement.RemoteActionCompatParcelizer(WorkerWrapper.Builder.serializer(((File) builder2.RemoteActionCompatParcelizer).listFiles()));
        checkchildrenplaceorderforupdates.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(null);
        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
    }

    public void write(following followingVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", followingVar.read);
            jSONObject.put("Status", followingVar.RatingCompat.ordinal());
            jSONObject.put("AuthToken", followingVar.serializer);
            jSONObject.put("RefreshToken", followingVar.MediaMetadataCompat);
            jSONObject.put("TokenCreationEpochInSecs", followingVar.MediaBrowserCompatMediaItem);
            jSONObject.put("ExpiresInSecs", followingVar.write);
            jSONObject.put("FisError", followingVar.RemoteActionCompatParcelizer);
            FirebaseApp firebaseApp = (FirebaseApp) this.RemoteActionCompatParcelizer;
            firebaseApp.IconCompatParcelizer();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", firebaseApp.read.getFilesDir());
            FileOutputStream fileOutputStreamWrite = getPositionInRoot.write(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
            fileOutputStreamWrite.write(jSONObject.toString().getBytes(Constants.ENCODING));
            fileOutputStreamWrite.close();
            if (fileCreateTempFile.renameTo(serializer())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void write(removeLast removelast) throws GeneralSecurityException {
        HashMap map = (HashMap) this.write;
        if (removelast == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("wrapper must be non-null");
            return;
        }
        Class cls = removelast.read();
        if (!map.containsKey(cls)) {
            map.put(cls, removelast);
            return;
        }
        removeLast removelast2 = (removeLast) map.get(cls);
        if (!removelast2.equals(removelast) || !removelast.equals(removelast2)) {
            throw new GeneralSecurityException(c8$$ExternalSyntheticOutline0.m(cls, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"));
        }
    }

    public boolean write() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ApplicationInfo applicationInfo2;
        Bundle bundle2;
        SharedPreferencesUtils sharedPreferencesUtils = (SharedPreferencesUtils) this.write;
        FirebaseApp firebaseApp = sharedPreferencesUtils.serializer;
        firebaseApp.IconCompatParcelizer();
        boolean zContains = ((Application) firebaseApp.read).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains("auto_init");
        FirebaseApp firebaseApp2 = sharedPreferencesUtils.serializer;
        if (!zContains) {
            firebaseApp2.IconCompatParcelizer();
            Application application = (Application) firebaseApp2.read;
            try {
                PackageManager packageManager = application.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), Fields.SpotShadowColor)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                    firebaseApp2.IconCompatParcelizer();
                    Application application2 = (Application) firebaseApp2.read;
                    try {
                        PackageManager packageManager2 = application2.getPackageManager();
                        if (packageManager2 != null && (applicationInfo2 = packageManager2.getApplicationInfo(application2.getPackageName(), Fields.SpotShadowColor)) != null && (bundle2 = applicationInfo2.metaData) != null && bundle2.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                            return applicationInfo2.metaData.getBoolean("firebase_inapp_messaging_auto_data_collection_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            return ((AtomicBoolean) this.RemoteActionCompatParcelizer).get();
        }
        firebaseApp2.IconCompatParcelizer();
        SharedPreferences sharedPreferences = ((Application) firebaseApp2.read).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return sharedPreferences.getBoolean("auto_init", true);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static zzbv RemoteActionCompatParcelizer(Context context) {
        Throwable e;
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new zzbv(channel, 24, fileLockLock);
                } catch (IOException e2) {
                    e = e2;
                    SentryLogcatAdapter.read("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e3) {
                    e = e3;
                    SentryLogcatAdapter.read("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e4) {
                    e = e4;
                    SentryLogcatAdapter.read("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e5) {
                e = e5;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e6) {
            e = e6;
            channel = null;
            fileLockLock = null;
        }
    }

    @Override // o.MeasureScopeMarker
    public void RemoteActionCompatParcelizer(long j, Bundle bundle, String str, String str2) {
        try {
            ((getProgramYellowEK5gGoQ) this.write).serializer(j, bundle, str, str2);
        } catch (RemoteException e) {
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = ((AppMeasurementDynamiteService) this.RemoteActionCompatParcelizer).zza;
            if (lookaheadScopeKtLookaheadScope221 != null) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Event interceptor threw exception");
            }
        }
    }

    public int read(Context context, accessgetScp accessgetscp) {
        int i;
        int iIsGooglePlayServicesAvailable;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(accessgetscp);
        int i2 = accessgetscp.read();
        SparseIntArray sparseIntArray = (SparseIntArray) this.write;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(i2, -1);
        }
        if (i != -1) {
            return i;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.write;
        synchronized (sparseIntArray2) {
            iIsGooglePlayServicesAvailable = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= sparseIntArray2.size()) {
                    iIsGooglePlayServicesAvailable = -1;
                    break;
                }
                int iKeyAt = sparseIntArray2.keyAt(i3);
                if (iKeyAt > i2 && sparseIntArray2.get(iKeyAt) == 0) {
                    break;
                }
                i3++;
            }
            if (iIsGooglePlayServicesAvailable == -1) {
                iIsGooglePlayServicesAvailable = ((GoogleApiAvailabilityLight) this.RemoteActionCompatParcelizer).isGooglePlayServicesAvailable(context, i2);
            }
            sparseIntArray2.put(i2, iIsGooglePlayServicesAvailable);
        }
        return iIsGooglePlayServicesAvailable;
    }

    public void restore(GestureState$Type gestureState$Type) {
        gestureState$Type.getClass();
        Boolean bool = (Boolean) ((LinkedHashMap) this.RemoteActionCompatParcelizer).remove(gestureState$Type);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            int i = GestureState$WhenMappings.$EnumSwitchMapping$0[gestureState$Type.ordinal()];
            AndroidGesturesManager androidGesturesManager = (AndroidGesturesManager) this.write;
            ProgressiveGesture progressiveGesture = i == 1 ? androidGesturesManager.rotateGestureDetector : androidGesturesManager.moveGestureDetector;
            progressiveGesture.isEnabled = zBooleanValue;
            if (zBooleanValue || !progressiveGesture.isInProgress) {
                return;
            }
            progressiveGesture.interrupted = true;
        }
    }

    public void saveAndDisable(GestureState$Type gestureState$Type) {
        gestureState$Type.getClass();
        int i = GestureState$WhenMappings.$EnumSwitchMapping$0[gestureState$Type.ordinal()];
        AndroidGesturesManager androidGesturesManager = (AndroidGesturesManager) this.write;
        ProgressiveGesture progressiveGesture = i == 1 ? androidGesturesManager.rotateGestureDetector : androidGesturesManager.moveGestureDetector;
        ((LinkedHashMap) this.RemoteActionCompatParcelizer).put(gestureState$Type, Boolean.valueOf(progressiveGesture.isEnabled));
        progressiveGesture.isEnabled = false;
        if (progressiveGesture.isInProgress) {
            progressiveGesture.interrupted = true;
        }
    }

    @Override // o.PinnableContainer
    public void onComplete(Task task) {
        if (this.serializer == 1) {
            ((Map) ((CardView$1) this.RemoteActionCompatParcelizer).IconCompatParcelizer).remove((ParentDataModifierDefaultImpls) this.write);
            return;
        }
        zzx zzxVar = (zzx) this.write;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) this.RemoteActionCompatParcelizer;
        synchronized (zzxVar.RatingCompat) {
            zzxVar.MediaBrowserCompatMediaItem.remove(parentDataModifierDefaultImpls);
        }
    }

    @Override // o.MotionReferencePlacementDelegate
    public StackTraceElement[] read(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        MotionReferencePlacementDelegate[] motionReferencePlacementDelegateArr = (MotionReferencePlacementDelegate[]) this.write;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            MotionReferencePlacementDelegate motionReferencePlacementDelegate = motionReferencePlacementDelegateArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = motionReferencePlacementDelegate.read(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((FlingCancellationException) this.RemoteActionCompatParcelizer).read(stackTraceElementArr2) : stackTraceElementArr2;
    }

    public String write(String str) {
        int i = 2 % 2;
        String str2 = (String) this.RemoteActionCompatParcelizer;
        Resources resources = (Resources) this.write;
        int identifier = resources.getIdentifier(str, "string", str2);
        Object obj = null;
        if (identifier == 0) {
            int i2 = MediaBrowserCompatMediaItem + 91;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return null;
        }
        String string = resources.getString(identifier);
        if (string.startsWith("%('")) {
            Object[] objArr = new Object[1];
            a(string.substring(3), objArr);
            string = ((String) objArr[0]).intern();
        }
        int i4 = IconCompatParcelizer + 107;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public void MediaDescriptionCompat() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.write;
        try {
            InputStream inputStream = (InputStream) this.RemoteActionCompatParcelizer;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e) {
            getButtonThumbLeftEK5gGoQ.IconCompatParcelizer("HttpUrlConnectionNetworkClient: Error when closing http input stream: ".concat(String.valueOf(e.getMessage())), e);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // o.getSafeGestures
    public Object m_() {
        return new getMaximumhdzbrEE(((getFocusEK5gGoQ) ((MemoryCacheService) this.write).RemoteActionCompatParcelizer).write, (getSourceValueInsetshdzbrEE) ((getSafeGestures) this.RemoteActionCompatParcelizer).m_());
    }

    public /* synthetic */ zzbv(int i, Object obj) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = null;
        this.write = obj;
    }

    public /* synthetic */ zzbv(Object obj, int i, Object obj2) {
        this.serializer = i;
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    public /* synthetic */ zzbv(Object obj, Object obj2, boolean z, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.write = obj2;
    }

    public /* synthetic */ zzbv(Object obj, boolean z, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    public zzbv(Context context) {
        this.serializer = 2;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        Resources resources = context.getResources();
        this.write = resources;
        this.RemoteActionCompatParcelizer = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public zzbv(CardView$1 cardView$1, ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this.serializer = 1;
        this.write = parentDataModifierDefaultImpls;
        Objects.requireNonNull(cardView$1);
        this.RemoteActionCompatParcelizer = cardView$1;
    }

    public zzbv(GoogleApiAvailability googleApiAvailability) {
        this.serializer = 3;
        this.write = new SparseIntArray();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(googleApiAvailability);
        this.RemoteActionCompatParcelizer = googleApiAvailability;
    }

    public zzbv(AndroidGesturesManager androidGesturesManager) {
        this.serializer = 29;
        this.write = androidGesturesManager;
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
    }

    public zzbv(MotionReferencePlacementDelegate[] motionReferencePlacementDelegateArr) {
        this.serializer = 20;
        this.write = motionReferencePlacementDelegateArr;
        this.RemoteActionCompatParcelizer = new FlingCancellationException(28);
    }

    public zzbv(updatePlacedUnderMotionFrameOfReference updateplacedundermotionframeofreference, hasui hasuiVar) {
        this.serializer = 23;
        AbstractComposeView abstractComposeView = new AbstractComposeView();
        abstractComposeView.serializer = updateplacedundermotionframeofreference;
        updateplacedundermotionframeofreference.IconCompatParcelizer(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(28, abstractComposeView));
        this.write = abstractComposeView;
        this.RemoteActionCompatParcelizer = hasuiVar;
    }

    public zzbv() {
        this.serializer = 12;
        this.RemoteActionCompatParcelizer = new HashMap();
        this.write = new HashMap();
    }

    public zzbv(Context context, String str, String str2) {
        this.serializer = 11;
        if (str != null) {
            this.RemoteActionCompatParcelizer = str;
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                this.write = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
                return;
            } else {
                this.write = applicationContext.getSharedPreferences(str2, 0).edit();
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("keysetName cannot be null");
        throw null;
    }

    public zzbv(LayoutModifierNodeKt layoutModifierNodeKt) {
        this.serializer = 12;
        this.RemoteActionCompatParcelizer = new HashMap(layoutModifierNodeKt.serializer);
        this.write = new HashMap(layoutModifierNodeKt.write);
    }

    public zzbv(AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        this.serializer = 26;
        this.RemoteActionCompatParcelizer = Collections.synchronizedMap(new HashMap());
        this.write = abstractComposeViewExternalSyntheticLambda0;
    }

    public /* synthetic */ zzbv(int i) {
        this.serializer = i;
    }

    public zzbv(AnnotationManagerImpl annotationManagerImpl) {
        this.serializer = 28;
        this.RemoteActionCompatParcelizer = annotationManagerImpl;
        this.write = new LinkedHashMap();
    }
}
