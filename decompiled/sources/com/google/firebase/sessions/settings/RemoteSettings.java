package com.google.firebase.sessions.settings;

import android.os.Build;
import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import coil3.ExtrasKt;
import coil3.RealImageLoader$execute$2$job$1;
import coil3.UriKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.sessions.InstallationId$Companion;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.sync.MutexImpl;
import o.AndroidComposeViewAccessibilityDelegateCompat;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.ShortNewsContentCardView;
import o.accessgetSendingFocusAffectingEventp;
import o.accessnotifySubtreeAccessibilityStateChangedIfNeeded;
import o.accesssetInstancecp;
import o.addNotificationForSysPropsChangelambda0010;
import o.boundsInScreen;
import o.createFromParcel;
import o.getDoesClickOutsideModalViewDismissInAppMessageView;
import o.getInAppMessageEventMap;
import o.onInitializeAccessibilityNodeInfo;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.setCustomInAppMessageAnimationFactorylambda0;
import o.setUnregisteredInAppMessage;
import o.unregisterInAppMessageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteSettings implements boundsInScreen {
    public static final int serializer;
    public static final getInAppMessageEventMap write;
    public final addNotificationForSysPropsChangelambda0010 IconCompatParcelizer;
    public final accesssetInstancecp MediaBrowserCompatMediaItem;
    public final AndroidComposeViewAccessibilityDelegateCompat MediaDescriptionCompat;
    public final SettingsCacheImpl MediaMetadataCompat;
    public final accessgetSendingFocusAffectingEventp RemoteActionCompatParcelizer;
    public final MutexImpl read;

    @Override // o.boundsInScreen
    public final Double IconCompatParcelizer() {
        return this.MediaMetadataCompat.read().sessionSamplingRate;
    }

    @Override // o.boundsInScreen
    public final BrazeInAppMessageManagerExternalSyntheticLambda2 RemoteActionCompatParcelizer() {
        Integer num = this.MediaMetadataCompat.read().sessionTimeoutSeconds;
        if (num == null) {
            return null;
        }
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        return new BrazeInAppMessageManagerExternalSyntheticLambda2(UriKt.RemoteActionCompatParcelizer(num.intValue(), setUnregisteredInAppMessage.SECONDS));
    }

    @Override // o.boundsInScreen
    public final Boolean write() {
        return this.MediaMetadataCompat.read().sessionsEnabled;
    }

    public RemoteSettings(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, accesssetInstancecp accesssetinstancecp, addNotificationForSysPropsChangelambda0010 addnotificationforsyspropschangelambda0010, accessgetSendingFocusAffectingEventp accessgetsendingfocusaffectingeventp, SettingsCacheImpl settingsCacheImpl) {
        androidComposeViewAccessibilityDelegateCompat.getClass();
        accesssetinstancecp.getClass();
        addnotificationforsyspropschangelambda0010.getClass();
        accessgetsendingfocusaffectingeventp.getClass();
        settingsCacheImpl.getClass();
        this.MediaDescriptionCompat = androidComposeViewAccessibilityDelegateCompat;
        this.MediaBrowserCompatMediaItem = accesssetinstancecp;
        this.IconCompatParcelizer = addnotificationforsyspropschangelambda0010;
        this.RemoteActionCompatParcelizer = accessgetsendingfocusaffectingeventp;
        this.MediaMetadataCompat = settingsCacheImpl;
        this.read = getDoesClickOutsideModalViewDismissInAppMessageView.IconCompatParcelizer();
    }

    static {
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        serializer = (int) BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(UriKt.RemoteActionCompatParcelizer(24, setUnregisteredInAppMessage.HOURS), setUnregisteredInAppMessage.SECONDS);
        write = new getInAppMessageEventMap("/");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ab A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:42:0x00a1, B:44:0x00ab, B:47:0x00b6), top: B:60:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6 A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:42:0x00a1, B:44:0x00ab, B:47:0x00b6), top: B:60:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x014b  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x00b6, please report this as an issue */
    @Override // o.boundsInScreen
    public final Object updateSettings(ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        accessnotifySubtreeAccessibilityStateChangedIfNeeded accessnotifysubtreeaccessibilitystatechangedifneeded;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda0;
        RemoteSettings remoteSettings;
        setCustomInAppMessageAnimationFactorylambda0 setcustominappmessageanimationfactorylambda1;
        Object obj;
        String str;
        Object objWithContext;
        Object obj2;
        if (shortNewsContentCardView instanceof accessnotifySubtreeAccessibilityStateChangedIfNeeded) {
            accessnotifysubtreeaccessibilitystatechangedifneeded = (accessnotifySubtreeAccessibilityStateChangedIfNeeded) shortNewsContentCardView;
            int i = accessnotifysubtreeaccessibilitystatechangedifneeded.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                accessnotifysubtreeaccessibilitystatechangedifneeded.serializer = i - Integer.MIN_VALUE;
            } else {
                accessnotifysubtreeaccessibilitystatechangedifneeded = new accessnotifySubtreeAccessibilityStateChangedIfNeeded(this, (ContinuationImpl) shortNewsContentCardView);
            }
        } else {
            accessnotifysubtreeaccessibilitystatechangedifneeded = new accessnotifySubtreeAccessibilityStateChangedIfNeeded(this, (ContinuationImpl) shortNewsContentCardView);
        }
        Object objCreate = accessnotifysubtreeaccessibilitystatechangedifneeded.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accessnotifysubtreeaccessibilitystatechangedifneeded.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = 1;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objCreate);
                MutexImpl mutexImpl = this.read;
                if (!mutexImpl.read() && !this.MediaMetadataCompat.RemoteActionCompatParcelizer()) {
                    return createfromparcel;
                }
                accessnotifysubtreeaccessibilitystatechangedifneeded.write = this;
                accessnotifysubtreeaccessibilitystatechangedifneeded.read = mutexImpl;
                accessnotifysubtreeaccessibilitystatechangedifneeded.serializer = 1;
                if (mutexImpl.lock(accessnotifysubtreeaccessibilitystatechangedifneeded) != coroutineSingletons) {
                    setcustominappmessageanimationfactorylambda0 = mutexImpl;
                    remoteSettings = this;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    setcustominappmessageanimationfactorylambda0 = accessnotifysubtreeaccessibilitystatechangedifneeded.read;
                    remoteSettings = (RemoteSettings) accessnotifysubtreeaccessibilitystatechangedifneeded.write;
                    try {
                        ExtrasKt.RemoteActionCompatParcelizer(objCreate);
                        str = ((onInitializeAccessibilityNodeInfo) objCreate).write;
                        if (str.equals("")) {
                            SentryLogcatAdapter.IconCompatParcelizer("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            setcustominappmessageanimationfactorylambda0.write(null);
                            return createfromparcel;
                        }
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("X-Crashlytics-Installation-ID", str);
                        String str2 = Build.MANUFACTURER + Build.MODEL;
                        remoteSettings.getClass();
                        getInAppMessageEventMap getinappmessageeventmap = write;
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("X-Crashlytics-Device-Model", getinappmessageeventmap.RemoteActionCompatParcelizer(str2, ""));
                        String str3 = Build.VERSION.INCREMENTAL;
                        str3.getClass();
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("X-Crashlytics-OS-Build-Version", getinappmessageeventmap.RemoteActionCompatParcelizer(str3, ""));
                        String str4 = Build.VERSION.RELEASE;
                        str4.getClass();
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 = new onViewAttachedToWindowlambda0("X-Crashlytics-OS-Display-Version", getinappmessageeventmap.RemoteActionCompatParcelizer(str4, ""));
                        remoteSettings.IconCompatParcelizer.getClass();
                        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, onviewattachedtowindowlambda3, new onViewAttachedToWindowlambda0("X-Crashlytics-API-Client-Version", "3.0.4"));
                        accessgetSendingFocusAffectingEventp accessgetsendingfocusaffectingeventp = remoteSettings.RemoteActionCompatParcelizer;
                        RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$1 = new RealImageLoader$execute$2$job$1(remoteSettings, (ShortNewsContentCardView) null, 15);
                        SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(i3);
                        accessnotifysubtreeaccessibilitystatechangedifneeded.write = setcustominappmessageanimationfactorylambda0;
                        accessnotifysubtreeaccessibilitystatechangedifneeded.read = null;
                        accessnotifysubtreeaccessibilitystatechangedifneeded.serializer = 3;
                        objWithContext = BuildersKt.withContext(accessgetsendingfocusaffectingeventp.read, new NavHostKt$NavHost$29$1(accessgetsendingfocusaffectingeventp, mapRemoteActionCompatParcelizer, realImageLoader$execute$2$job$1, signInDataStore$clear$2, null, 10), accessnotifysubtreeaccessibilitystatechangedifneeded);
                        if (objWithContext != coroutineSingletons) {
                            objWithContext = createfromparcel;
                        }
                        if (objWithContext != coroutineSingletons) {
                            setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                            obj2 = null;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th) {
                        th = th;
                        setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                        obj = null;
                        setcustominappmessageanimationfactorylambda1.write(obj);
                        throw th;
                    }
                }
                if (i2 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                setcustominappmessageanimationfactorylambda1 = (setCustomInAppMessageAnimationFactorylambda0) accessnotifysubtreeaccessibilitystatechangedifneeded.write;
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(objCreate);
                    obj2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    obj = null;
                    setcustominappmessageanimationfactorylambda1.write(obj);
                    throw th;
                }
                setcustominappmessageanimationfactorylambda1.write(obj2);
                return createfromparcel;
            }
            setcustominappmessageanimationfactorylambda0 = accessnotifysubtreeaccessibilitystatechangedifneeded.read;
            remoteSettings = (RemoteSettings) accessnotifysubtreeaccessibilitystatechangedifneeded.write;
            ExtrasKt.RemoteActionCompatParcelizer(objCreate);
            if (!remoteSettings.MediaMetadataCompat.RemoteActionCompatParcelizer()) {
                setcustominappmessageanimationfactorylambda0.write(null);
                return createfromparcel;
            }
            InstallationId$Companion installationId$Companion = onInitializeAccessibilityNodeInfo.serializer;
            accesssetInstancecp accesssetinstancecp = remoteSettings.MediaBrowserCompatMediaItem;
            accessnotifysubtreeaccessibilitystatechangedifneeded.write = remoteSettings;
            accessnotifysubtreeaccessibilitystatechangedifneeded.read = setcustominappmessageanimationfactorylambda0;
            accessnotifysubtreeaccessibilitystatechangedifneeded.serializer = 2;
            objCreate = installationId$Companion.create(accesssetinstancecp, accessnotifysubtreeaccessibilitystatechangedifneeded);
            if (objCreate != coroutineSingletons) {
                str = ((onInitializeAccessibilityNodeInfo) objCreate).write;
                if (str.equals("")) {
                    SentryLogcatAdapter.IconCompatParcelizer("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    setcustominappmessageanimationfactorylambda0.write(null);
                    return createfromparcel;
                }
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda4 = new onViewAttachedToWindowlambda0("X-Crashlytics-Installation-ID", str);
                String str5 = Build.MANUFACTURER + Build.MODEL;
                remoteSettings.getClass();
                getInAppMessageEventMap getinappmessageeventmap2 = write;
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda5 = new onViewAttachedToWindowlambda0("X-Crashlytics-Device-Model", getinappmessageeventmap2.RemoteActionCompatParcelizer(str5, ""));
                String str6 = Build.VERSION.INCREMENTAL;
                str6.getClass();
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda6 = new onViewAttachedToWindowlambda0("X-Crashlytics-OS-Build-Version", getinappmessageeventmap2.RemoteActionCompatParcelizer(str6, ""));
                String str7 = Build.VERSION.RELEASE;
                str7.getClass();
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda7 = new onViewAttachedToWindowlambda0("X-Crashlytics-OS-Display-Version", getinappmessageeventmap2.RemoteActionCompatParcelizer(str7, ""));
                remoteSettings.IconCompatParcelizer.getClass();
                Map mapRemoteActionCompatParcelizer2 = onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda4, onviewattachedtowindowlambda5, onviewattachedtowindowlambda6, onviewattachedtowindowlambda7, new onViewAttachedToWindowlambda0("X-Crashlytics-API-Client-Version", "3.0.4"));
                accessgetSendingFocusAffectingEventp accessgetsendingfocusaffectingeventp2 = remoteSettings.RemoteActionCompatParcelizer;
                RealImageLoader$execute$2$job$1 realImageLoader$execute$2$job$2 = new RealImageLoader$execute$2$job$1(remoteSettings, (ShortNewsContentCardView) null, 15);
                SignInDataStore$clear$2 signInDataStore$clear$3 = new SignInDataStore$clear$2(i3);
                accessnotifysubtreeaccessibilitystatechangedifneeded.write = setcustominappmessageanimationfactorylambda0;
                accessnotifysubtreeaccessibilitystatechangedifneeded.read = null;
                accessnotifysubtreeaccessibilitystatechangedifneeded.serializer = 3;
                objWithContext = BuildersKt.withContext(accessgetsendingfocusaffectingeventp2.read, new NavHostKt$NavHost$29$1(accessgetsendingfocusaffectingeventp2, mapRemoteActionCompatParcelizer2, realImageLoader$execute$2$job$2, signInDataStore$clear$3, null, 10), accessnotifysubtreeaccessibilitystatechangedifneeded);
                if (objWithContext != coroutineSingletons) {
                    objWithContext = createfromparcel;
                }
                if (objWithContext != coroutineSingletons) {
                    setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
                    obj2 = null;
                    setcustominappmessageanimationfactorylambda1.write(obj2);
                    return createfromparcel;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            setcustominappmessageanimationfactorylambda1 = setcustominappmessageanimationfactorylambda0;
            obj = null;
            setcustominappmessageanimationfactorylambda1.write(obj);
            throw th;
        }
    }
}
