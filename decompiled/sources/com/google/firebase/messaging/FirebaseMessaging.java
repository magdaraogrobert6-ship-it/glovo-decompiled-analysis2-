package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.w4$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry$Builder;
import com.braze.Braze$Companion$$ExternalSyntheticLambda4;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.internal.measurement.zzfa;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.Metadata;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AndroidAccessibilityManager;
import o.AndroidClipboardManager;
import o.AndroidClipboardManager_androidKt;
import o.FocusListener;
import o.OuterPlacementScope;
import o.OwnerOnLayoutCompletedListener;
import o.ParentDataModifierDefaultImpls;
import o.accessgetButton15cp;
import o.accessgetNinecp;
import o.accessgetNumPad1cp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvInputHdmi1cp;
import o.accesssetInstancecp;
import o.calculateRecommendedTimeoutMillisdefault;
import o.getMethodQuietly;
import o.getNativeClipboard;
import o.getQueryParameterslambda2;
import o.getSelectionEndui_text;
import o.hasText;
import o.hasui;
import o.invalidateAlignmentLinesFromPositionChange;
import o.logTree;
import o.r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;
import o.setClipEntry;
import o.setPlacedUnderMotionFrameOfReference;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MAX_DELAY_SEC = 28800;
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";
    private static hasText store;
    static ScheduledExecutorService syncExecutor;
    static AbstractComposeViewExternalSyntheticLambda0 transportFactory = new invalidateAlignmentLinesFromPositionChange(6);
    private final AutoInit autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final FirebaseApp firebaseApp;
    private final GmsRpc gmsRpc;
    private final OwnerOnLayoutCompletedListener iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final setClipEntry requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Task topicsSubscriberTask;

    /* JADX INFO: loaded from: classes4.dex */
    public final class AutoInit {
        public Boolean IconCompatParcelizer;
        public final hasui RemoteActionCompatParcelizer;
        public Gson$$ExternalSyntheticBUOutline0 serializer;
        public boolean write;

        public final void RemoteActionCompatParcelizer() {
            synchronized (this) {
                if (this.write) {
                    return;
                }
                Boolean boolSerializer = serializer();
                this.IconCompatParcelizer = boolSerializer;
                if (boolSerializer == null) {
                    Gson$$ExternalSyntheticBUOutline0 gson$$ExternalSyntheticBUOutline0 = new Gson$$ExternalSyntheticBUOutline0(11);
                    this.serializer = gson$$ExternalSyntheticBUOutline0;
                    setPlacedUnderMotionFrameOfReference setplacedundermotionframeofreference = (setPlacedUnderMotionFrameOfReference) this.RemoteActionCompatParcelizer;
                    setplacedundermotionframeofreference.write(setplacedundermotionframeofreference.write, gson$$ExternalSyntheticBUOutline0);
                }
                this.write = true;
            }
        }

        public final Boolean serializer() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            FirebaseApp firebaseApp = FirebaseMessaging.this.firebaseApp;
            firebaseApp.IconCompatParcelizer();
            Context context = firebaseApp.read;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Fields.SpotShadowColor)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public AutoInit(hasui hasuiVar) {
            this.RemoteActionCompatParcelizer = hasuiVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ accessgetButton15cp lambda$clearTransportFactoryForTest$12() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ accessgetButton15cp lambda$static$0() {
        return null;
    }

    private void startSync() {
        synchronized (this) {
            if (!this.syncScheduledOrRunning) {
                syncWithDelaySecondsInternal(0L);
            }
        }
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return SQLite.write();
    }

    public Context getApplicationContext() {
        return this.context;
    }

    public Task getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public void setSyncScheduledOrRunning(boolean z) {
        synchronized (this) {
            this.syncScheduledOrRunning = z;
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, OwnerOnLayoutCompletedListener ownerOnLayoutCompletedListener, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0, hasui hasuiVar, final Metadata metadata, final GmsRpc gmsRpc, Executor executor, Executor executor2, Executor executor3) {
        final int i = 0;
        this.syncScheduledOrRunning = false;
        transportFactory = abstractComposeViewExternalSyntheticLambda0;
        this.firebaseApp = firebaseApp;
        this.autoInit = new AutoInit(hasuiVar);
        firebaseApp.IconCompatParcelizer();
        final Context context = firebaseApp.read;
        this.context = context;
        zzfa zzfaVar = new zzfa();
        this.lifecycleCallbacks = zzfaVar;
        this.metadata = metadata;
        this.gmsRpc = gmsRpc;
        this.requestDeduplicator = new setClipEntry(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        firebaseApp.IconCompatParcelizer();
        Context context2 = firebaseApp.read;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(zzfaVar);
        } else {
            SentryLogcatAdapter.IconCompatParcelizer(TAG, "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (ownerOnLayoutCompletedListener != null) {
            ownerOnLayoutCompletedListener.write();
        }
        executor2.execute(new Runnable(this) { // from class: o.AccessibilityManager
            public final /* synthetic */ FirebaseMessaging read;

            {
                this.read = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                FirebaseMessaging firebaseMessaging = this.read;
                if (i2 != 0) {
                    firebaseMessaging.lambda$new$4();
                } else {
                    firebaseMessaging.lambda$new$2();
                }
            }
        });
        final int i2 = 1;
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new accessgetTvInputHdmi1cp("Firebase-Messaging-Topics-Io"));
        zzw zzwVarWrite = LazyKt__LazyJVMKt.write(scheduledThreadPoolExecutor, new Callable() { // from class: o.convertToCharSequence
            @Override // java.util.concurrent.Callable
            public final Object call() {
                toClipMetadata toclipmetadata;
                Context context3 = context;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = scheduledThreadPoolExecutor;
                FirebaseMessaging firebaseMessaging = this;
                Metadata metadata2 = metadata;
                GmsRpc gmsRpc2 = gmsRpc;
                synchronized (toClipMetadata.class) {
                    java.lang.ref.WeakReference weakReference = toClipMetadata.write;
                    toclipmetadata = weakReference != null ? (toClipMetadata) weakReference.get() : null;
                    if (toclipmetadata == null) {
                        SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                        toClipMetadata toclipmetadata2 = new toClipMetadata(sharedPreferences, scheduledThreadPoolExecutor2);
                        synchronized (toclipmetadata2) {
                            toclipmetadata2.read = ComponentRegistry$Builder.RemoteActionCompatParcelizer(sharedPreferences, scheduledThreadPoolExecutor2);
                        }
                        toClipMetadata.write = new java.lang.ref.WeakReference(toclipmetadata2);
                        toclipmetadata = toclipmetadata2;
                    }
                }
                return new r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic(firebaseMessaging, metadata2, toclipmetadata, gmsRpc2, context3, scheduledThreadPoolExecutor2);
            }
        });
        this.topicsSubscriberTask = zzwVarWrite;
        zzwVarWrite.addOnSuccessListener(executor2, new AndroidAccessibilityManager(this, i2));
        executor2.execute(new Runnable(this) { // from class: o.AccessibilityManager
            public final /* synthetic */ FirebaseMessaging read;

            {
                this.read = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                FirebaseMessaging firebaseMessaging = this.read;
                if (i3 != 0) {
                    firebaseMessaging.lambda$new$4();
                } else {
                    firebaseMessaging.lambda$new$2();
                }
            }
        });
    }

    public static void clearStoreForTest() {
        synchronized (FirebaseMessaging.class) {
            store = null;
        }
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = new AbstractComposeViewExternalSyntheticLambda0() { // from class: o.AccessibilityIteratorsWordTextSegmentIteratorCompanion
            @Override // o.AbstractComposeViewExternalSyntheticLambda0
            public final Object write() {
                return FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
            }
        };
    }

    @Keep
    public static FirebaseMessaging getInstance(FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.write(FirebaseMessaging.class);
            accessgetSystemNavigationDowncp.serializer(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    private static hasText getStore(Context context) {
        hasText hastext;
        synchronized (FirebaseMessaging.class) {
            if (store == null) {
                store = new hasText(context);
            }
            hastext = store;
        }
        return hastext;
    }

    private String getSubtype() {
        FirebaseApp firebaseApp = this.firebaseApp;
        firebaseApp.IconCompatParcelizer();
        return "[DEFAULT]".equals(firebaseApp.ParcelableVolumeInfo) ? "" : this.firebaseApp.serializer();
    }

    public static accessgetButton15cp getTransportFactory() {
        return (accessgetButton15cp) transportFactory.write();
    }

    private void handleProxiedNotificationData() {
        Task taskContinueWith;
        int i;
        Rpc rpc = this.gmsRpc.serializer;
        if (rpc.MediaMetadataCompat.read() >= 241100000) {
            r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcekWrite = r8lambdaU31FnmCtqQics3i75Jr9dkZcEk.write(rpc.IconCompatParcelizer);
            Bundle bundle = Bundle.EMPTY;
            synchronized (r8lambdau31fnmctqqics3i75jr9dkzcekWrite) {
                i = r8lambdau31fnmctqqics3i75jr9dkzcekWrite.MediaBrowserCompatMediaItem;
                r8lambdau31fnmctqqics3i75jr9dkzcekWrite.MediaBrowserCompatMediaItem = i + 1;
            }
            taskContinueWith = r8lambdau31fnmctqqics3i75jr9dkzcekWrite.RemoteActionCompatParcelizer(new accessgetNinecp(i, 5, bundle, 1)).continueWith(accessgetNumPad1cp.read, new OuterPlacementScope() { // from class: o.accessgetMoveHomecp
                @Override // o.OuterPlacementScope
                public final Object then(Task task) {
                    Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                    if (intent != null) {
                        return new CloudMessage(intent);
                    }
                    return null;
                }
            });
        } else {
            Object[] objArr = {new IOException("SERVICE_NOT_AVAILABLE")};
            taskContinueWith = (zzw) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -1791064613, 1791064618, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
        }
        taskContinueWith.addOnSuccessListener(this.initExecutor, new AndroidAccessibilityManager(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initializeProxyNotifications, reason: merged with bridge method [inline-methods] */
    public void lambda$new$4() {
        FocusListener.RemoteActionCompatParcelizer(this.context);
        Object[] objArr = {this.context, this.gmsRpc, Boolean.valueOf(shouldRetainProxyNotifications())};
        TuplesKt.RemoteActionCompatParcelizer(1419546143, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1419546138);
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invokeOnTokenRefresh, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(String str) {
        FirebaseApp firebaseApp = this.firebaseApp;
        firebaseApp.IconCompatParcelizer();
        if ("[DEFAULT]".equals(firebaseApp.ParcelableVolumeInfo)) {
            if (Log.isLoggable(TAG, 3)) {
                this.firebaseApp.IconCompatParcelizer();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new calculateRecommendedTimeoutMillisdefault(this.context).write(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task lambda$blockingGetToken$13(String str, AndroidClipboardManager_androidKt androidClipboardManager_androidKt, String str2) throws Exception {
        hasText store2 = getStore(this.context);
        String subtype = getSubtype();
        String strIconCompatParcelizer = this.metadata.IconCompatParcelizer();
        synchronized (store2) {
            String strRemoteActionCompatParcelizer = AndroidClipboardManager_androidKt.RemoteActionCompatParcelizer(System.currentTimeMillis(), str2, strIconCompatParcelizer);
            if (strRemoteActionCompatParcelizer != null) {
                SharedPreferences.Editor editorEdit = store2.write.edit();
                editorEdit.putString(hasText.IconCompatParcelizer(subtype, str), strRemoteActionCompatParcelizer);
                editorEdit.commit();
            }
        }
        if (androidClipboardManager_androidKt == null || !str2.equals(androidClipboardManager_androidKt.read)) {
            lambda$new$1(str2);
        }
        return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(str2);
    }

    private Task lambda$blockingGetToken$14(String str, AndroidClipboardManager_androidKt androidClipboardManager_androidKt) {
        GmsRpc gmsRpc = this.gmsRpc;
        return gmsRpc.serializer(gmsRpc.read(Metadata.IconCompatParcelizer(gmsRpc.RemoteActionCompatParcelizer), "*", new Bundle())).onSuccessTask(this.fileExecutor, new PreviewView$1$$ExternalSyntheticLambda2(this, str, androidClipboardManager_androidKt, 18));
    }

    private /* synthetic */ void lambda$deleteToken$8(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        try {
            Metadata.IconCompatParcelizer(this.firebaseApp);
            throw null;
        } catch (Exception e) {
            parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$deleteToken$9(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        try {
            GmsRpc gmsRpc = this.gmsRpc;
            gmsRpc.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("delete", "1");
            LazyKt__LazyJVMKt.read(gmsRpc.serializer(gmsRpc.read(Metadata.IconCompatParcelizer(gmsRpc.RemoteActionCompatParcelizer), "*", bundle)));
            hasText store2 = getStore(this.context);
            String subtype = getSubtype();
            String strIconCompatParcelizer = Metadata.IconCompatParcelizer(this.firebaseApp);
            synchronized (store2) {
                String strIconCompatParcelizer2 = hasText.IconCompatParcelizer(subtype, strIconCompatParcelizer);
                SharedPreferences.Editor editorEdit = store2.write.edit();
                editorEdit.remove(strIconCompatParcelizer2);
                editorEdit.commit();
            }
            parentDataModifierDefaultImpls.IconCompatParcelizer((Object) null);
        } catch (Exception e) {
            parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleProxiedNotificationData$5(CloudMessage cloudMessage) throws IOException {
        if (cloudMessage != null) {
            Object[] objArr = {cloudMessage.IconCompatParcelizer()};
            int iSerializer = getQueryParameterslambda2.serializer();
            SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 1745115302, objArr, getQueryParameterslambda2.serializer(), -1745115298, iSerializer);
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setNotificationDelegationEnabled$6(Void r10) {
        Object[] objArr = {this.context, this.gmsRpc, Boolean.valueOf(shouldRetainProxyNotifications())};
        TuplesKt.RemoteActionCompatParcelizer(1419546143, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1419546138);
    }

    private boolean shouldRetainProxyNotifications() {
        FocusListener.RemoteActionCompatParcelizer(this.context);
        if (!FocusListener.write(this.context)) {
            return false;
        }
        if (this.firebaseApp.write(logTree.class) != null) {
            return true;
        }
        return SQLite.write() && transportFactory != null;
    }

    @SuppressLint
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new accessgetTvInputHdmi1cp("TAG"));
            }
            syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public Task getToken() {
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        this.initExecutor.execute(new ND$$ExternalSyntheticLambda0(this, 19, parentDataModifierDefaultImpls));
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    public AndroidClipboardManager_androidKt getTokenWithoutTriggeringSync() {
        AndroidClipboardManager_androidKt androidClipboardManager_androidKtIconCompatParcelizer;
        hasText store2 = getStore(this.context);
        String subtype = getSubtype();
        String strIconCompatParcelizer = Metadata.IconCompatParcelizer(this.firebaseApp);
        synchronized (store2) {
            androidClipboardManager_androidKtIconCompatParcelizer = AndroidClipboardManager_androidKt.IconCompatParcelizer(store2.write.getString(hasText.IconCompatParcelizer(subtype, strIconCompatParcelizer), null));
        }
        return androidClipboardManager_androidKtIconCompatParcelizer;
    }

    public boolean isAutoInitEnabled() {
        boolean zBooleanValue;
        AutoInit autoInit = this.autoInit;
        synchronized (autoInit) {
            autoInit.RemoteActionCompatParcelizer();
            Boolean bool = autoInit.IconCompatParcelizer;
            zBooleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.RemoteActionCompatParcelizer();
        }
        return zBooleanValue;
    }

    public boolean isGmsCorePresent() {
        return this.metadata.RemoteActionCompatParcelizer();
    }

    public boolean isNotificationDelegationEnabled() {
        return FocusListener.write(this.context);
    }

    public void setAutoInitEnabled(boolean z) {
        AutoInit autoInit = this.autoInit;
        synchronized (autoInit) {
            autoInit.RemoteActionCompatParcelizer();
            Gson$$ExternalSyntheticBUOutline0 gson$$ExternalSyntheticBUOutline0 = autoInit.serializer;
            if (gson$$ExternalSyntheticBUOutline0 != null) {
                ((setPlacedUnderMotionFrameOfReference) autoInit.RemoteActionCompatParcelizer).write(gson$$ExternalSyntheticBUOutline0);
                autoInit.serializer = null;
            }
            FirebaseApp firebaseApp = FirebaseMessaging.this.firebaseApp;
            firebaseApp.IconCompatParcelizer();
            SharedPreferences.Editor editorEdit = firebaseApp.read.getSharedPreferences("com.google.firebase.messaging", 0).edit();
            editorEdit.putBoolean("auto_init", z);
            editorEdit.apply();
            if (z) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
            autoInit.IconCompatParcelizer = Boolean.valueOf(z);
        }
    }

    public Task setNotificationDelegationEnabled(boolean z) {
        zzw zzwVarRemoteActionCompatParcelizer;
        Executor executor = this.initExecutor;
        Context context = this.context;
        if (Build.VERSION.SDK_INT >= 29) {
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
            executor.execute(new f$$ExternalSyntheticLambda1(context, z, parentDataModifierDefaultImpls, 2));
            zzwVarRemoteActionCompatParcelizer = parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
        } else {
            zzwVarRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
        zzwVarRemoteActionCompatParcelizer.addOnSuccessListener(new getNativeClipboard(), new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(19, this));
        return zzwVarRemoteActionCompatParcelizer;
    }

    public boolean tokenNeedsRefresh(AndroidClipboardManager_androidKt androidClipboardManager_androidKt) {
        if (androidClipboardManager_androidKt != null) {
            return System.currentTimeMillis() > androidClipboardManager_androidKt.write + 604800000 || !this.metadata.IconCompatParcelizer().equals(androidClipboardManager_androidKt.serializer);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getToken$7(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        try {
            parentDataModifierDefaultImpls.IconCompatParcelizer(blockingGetToken());
        } catch (Exception e) {
            parentDataModifierDefaultImpls.RemoteActionCompatParcelizer(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() throws IOException {
        Task taskContinueWithTask;
        AndroidClipboardManager_androidKt tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.read;
        }
        String strIconCompatParcelizer = Metadata.IconCompatParcelizer(this.firebaseApp);
        setClipEntry setclipentry = this.requestDeduplicator;
        synchronized (setclipentry) {
            taskContinueWithTask = (Task) setclipentry.write.get(strIconCompatParcelizer);
            if (taskContinueWithTask != null) {
                Log.isLoggable(TAG, 3);
            } else {
                Log.isLoggable(TAG, 3);
                taskContinueWithTask = lambda$blockingGetToken$14(strIconCompatParcelizer, tokenWithoutTriggeringSync).continueWithTask(setclipentry.RemoteActionCompatParcelizer, new ArrivalProgressObserver$$ExternalSyntheticLambda0(setclipentry, 2, strIconCompatParcelizer));
                setclipentry.write.put(strIconCompatParcelizer, taskContinueWithTask);
            }
        }
        try {
            return (String) LazyKt__LazyJVMKt.read(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    @Deprecated
    public void send(RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.write())) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Missing 'to'");
            return;
        }
        Intent intent = new Intent(SEND_INTENT_ACTION);
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra(EXTRA_DUMMY_P_INTENT, PendingIntent.getBroadcast(this.context, 0, intent2, 67108864));
        intent.setPackage("com.google.android.gms");
        remoteMessage.IconCompatParcelizer(intent);
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        FirebaseApp firebaseAppWrite = FirebaseApp.write();
        firebaseAppWrite.IconCompatParcelizer();
        firebaseAppWrite.read.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
        Object[] objArr = {this.context, this.gmsRpc, Boolean.valueOf(shouldRetainProxyNotifications())};
        TuplesKt.RemoteActionCompatParcelizer(1419546143, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -1419546138);
    }

    @SuppressLint
    public Task subscribeToTopic(String str) {
        return this.topicsSubscriberTask.onSuccessTask(new Braze$Companion$$ExternalSyntheticLambda4(str, 1));
    }

    @SuppressLint
    public Task unsubscribeFromTopic(String str) {
        return this.topicsSubscriberTask.onSuccessTask(new Braze$Companion$$ExternalSyntheticLambda4(str, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic r8lambdagbnkvgshmmv9ltp9y9duexj6ic) {
        if (isAutoInitEnabled()) {
            r8lambdagbnkvgshmmv9ltp9y9duexj6ic.read();
        }
    }

    public void syncWithDelaySecondsInternal(long j) {
        synchronized (this) {
            enqueueTaskWithDelaySeconds(new getMethodQuietly(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j), MAX_DELAY_SEC)), j);
            this.syncScheduledOrRunning = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task lambda$subscribeToTopic$10(String str, r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic r8lambdagbnkvgshmmv9ltp9y9duexj6ic) throws Exception {
        r8lambdagbnkvgshmmv9ltp9y9duexj6ic.getClass();
        zzw zzwVarWrite = r8lambdagbnkvgshmmv9ltp9y9duexj6ic.write(new AndroidClipboardManager("S", str));
        r8lambdagbnkvgshmmv9ltp9y9duexj6ic.read();
        return zzwVarWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task lambda$unsubscribeFromTopic$11(String str, r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic r8lambdagbnkvgshmmv9ltp9y9duexj6ic) throws Exception {
        r8lambdagbnkvgshmmv9ltp9y9duexj6ic.getClass();
        zzw zzwVarWrite = r8lambdagbnkvgshmmv9ltp9y9duexj6ic.write(new AndroidClipboardManager("U", str));
        r8lambdagbnkvgshmmv9ltp9y9duexj6ic.read();
        return zzwVarWrite;
    }

    public Task deleteToken() {
        if (getTokenWithoutTriggeringSync() == null) {
            return LazyKt__LazyJVMKt.RemoteActionCompatParcelizer((Object) null);
        }
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        Executors.newSingleThreadExecutor(new accessgetTvInputHdmi1cp("Firebase-Messaging-Network-Io")).execute(new w4$$ExternalSyntheticLambda0(this, 26, parentDataModifierDefaultImpls));
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    public static FirebaseMessaging getInstance() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(FirebaseApp.write());
        }
        return firebaseMessaging;
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, OwnerOnLayoutCompletedListener ownerOnLayoutCompletedListener, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda1, accesssetInstancecp accesssetinstancecp, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda2, hasui hasuiVar, Metadata metadata) {
        this(firebaseApp, ownerOnLayoutCompletedListener, abstractComposeViewExternalSyntheticLambda2, hasuiVar, metadata, new GmsRpc(firebaseApp, metadata, abstractComposeViewExternalSyntheticLambda0, abstractComposeViewExternalSyntheticLambda1, accesssetinstancecp), Executors.newSingleThreadExecutor(new accessgetTvInputHdmi1cp("Firebase-Messaging-Task")), new ScheduledThreadPoolExecutor(1, new accessgetTvInputHdmi1cp("Firebase-Messaging-Init")), new ThreadPoolExecutor(0, 1, MIN_DELAY_SEC, TimeUnit.SECONDS, new LinkedBlockingQueue(), new accessgetTvInputHdmi1cp("Firebase-Messaging-File-Io")));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FirebaseMessaging(FirebaseApp firebaseApp, OwnerOnLayoutCompletedListener ownerOnLayoutCompletedListener, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda1, accesssetInstancecp accesssetinstancecp, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda2, hasui hasuiVar) {
        this(firebaseApp, ownerOnLayoutCompletedListener, abstractComposeViewExternalSyntheticLambda0, abstractComposeViewExternalSyntheticLambda1, accesssetinstancecp, abstractComposeViewExternalSyntheticLambda2, hasuiVar, new Metadata(firebaseApp.read));
        firebaseApp.IconCompatParcelizer();
    }
}
