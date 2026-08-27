package com.google.firebase.sessions;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.settings.SessionsSettings;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidComposeViewRootModifierNodeonKeyEvent1;
import o.AndroidComposeViewpointerIconService1;
import o.AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1;
import o.AndroidComposeViewresendMotionEventOnLayout1;
import o.ShortNewsContentCardView;
import o.accessgetCurrentlyAccessibilityFocusedANIp;
import o.accesssetInstancecp;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getDetachedFromParentLookaheadPlacement;
import o.getLifecycleOwner;
import o.getRulerLambda;
import o.onInitializeAccessibilityNodeInfo;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionFirelogPublisherImpl$mayLogSession$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public onInitializeAccessibilityNodeInfo IconCompatParcelizer;
    public SessionsSettings MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public AndroidComposeViewpointerIconService1 MediaMetadataCompat;
    public final /* synthetic */ SessionFirelogPublisherImpl RatingCompat;
    public final /* synthetic */ AndroidComposeViewpointerIconService1 RemoteActionCompatParcelizer;
    public SessionEvents read;
    public FirebaseApp serializer;
    public SessionFirelogPublisherImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$mayLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService1, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RatingCompat = sessionFirelogPublisherImpl;
        this.RemoteActionCompatParcelizer = androidComposeViewpointerIconService1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new SessionFirelogPublisherImpl$mayLogSession$1(this.RatingCompat, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionFirelogPublisherImpl$mayLogSession$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAccess$shouldLogSession;
        Object objCreate;
        onInitializeAccessibilityNodeInfo oninitializeaccessibilitynodeinfo;
        SessionEvents sessionEvents;
        FirebaseApp firebaseApp;
        SessionsSettings sessionsSettings;
        AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService1;
        Object registeredSubscribers$com_google_firebase_firebase_sessions;
        SessionsSettings sessionsSettings2;
        onInitializeAccessibilityNodeInfo oninitializeaccessibilitynodeinfo2;
        SessionEvents sessionEvents2;
        AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService2;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        FirebaseApp firebaseApp2;
        getDetachedFromParentLookaheadPlacement getdetachedfromparentlookaheadplacement;
        AndroidComposeViewRootModifierNodeonKeyEvent1 androidComposeViewRootModifierNodeonKeyEvent1;
        getDetachedFromParentLookaheadPlacement getdetachedfromparentlookaheadplacement2;
        AndroidComposeViewRootModifierNodeonKeyEvent1 androidComposeViewRootModifierNodeonKeyEvent2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.MediaDescriptionCompat;
        SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = this.RatingCompat;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.MediaDescriptionCompat = 1;
            objAccess$shouldLogSession = SessionFirelogPublisherImpl.access$shouldLogSession(sessionFirelogPublisherImpl2, this);
            if (objAccess$shouldLogSession != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objAccess$shouldLogSession = obj;
        } else {
            if (i == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objCreate = obj;
                oninitializeaccessibilitynodeinfo = (onInitializeAccessibilityNodeInfo) objCreate;
                sessionEvents = SessionEvents.IconCompatParcelizer;
                firebaseApp = sessionFirelogPublisherImpl2.write;
                sessionsSettings = sessionFirelogPublisherImpl2.MediaBrowserCompatMediaItem;
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.read;
                this.IconCompatParcelizer = oninitializeaccessibilitynodeinfo;
                this.write = sessionFirelogPublisherImpl2;
                this.read = sessionEvents;
                this.serializer = firebaseApp;
                androidComposeViewpointerIconService1 = this.RemoteActionCompatParcelizer;
                this.MediaMetadataCompat = androidComposeViewpointerIconService1;
                this.MediaBrowserCompatMediaItem = sessionsSettings;
                this.MediaDescriptionCompat = 3;
                registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (registeredSubscribers$com_google_firebase_firebase_sessions != coroutineSingletons) {
                    sessionsSettings2 = sessionsSettings;
                    oninitializeaccessibilitynodeinfo2 = oninitializeaccessibilitynodeinfo;
                    sessionEvents2 = sessionEvents;
                    androidComposeViewpointerIconService2 = androidComposeViewpointerIconService1;
                    sessionFirelogPublisherImpl = sessionFirelogPublisherImpl2;
                    firebaseApp2 = firebaseApp;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sessionsSettings2 = this.MediaBrowserCompatMediaItem;
            androidComposeViewpointerIconService2 = this.MediaMetadataCompat;
            firebaseApp2 = this.serializer;
            SessionEvents sessionEvents3 = this.read;
            sessionFirelogPublisherImpl = this.write;
            onInitializeAccessibilityNodeInfo oninitializeaccessibilitynodeinfo3 = this.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            oninitializeaccessibilitynodeinfo2 = oninitializeaccessibilitynodeinfo3;
            sessionEvents2 = sessionEvents3;
            registeredSubscribers$com_google_firebase_firebase_sessions = obj;
        }
        Map map = (Map) registeredSubscribers$com_google_firebase_firebase_sessions;
        String str = oninitializeaccessibilitynodeinfo2.write;
        String str2 = oninitializeaccessibilitynodeinfo2.RemoteActionCompatParcelizer;
        sessionEvents2.getClass();
        firebaseApp2.getClass();
        androidComposeViewpointerIconService2.getClass();
        sessionsSettings2.getClass();
        map.getClass();
        str2.getClass();
        getLifecycleOwner getlifecycleowner = getLifecycleOwner.SESSION_START;
        String str3 = androidComposeViewpointerIconService2.sessionId;
        String str4 = androidComposeViewpointerIconService2.firstSessionId;
        int i2 = androidComposeViewpointerIconService2.sessionIndex;
        long j = androidComposeViewpointerIconService2.sessionStartTimestampUs;
        getdetachedfromparentlookaheadplacement = (getDetachedFromParentLookaheadPlacement) map.get(accessgetCurrentlyAccessibilityFocusedANIp.PERFORMANCE);
        if (getdetachedfromparentlookaheadplacement == null) {
            androidComposeViewRootModifierNodeonKeyEvent1 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_SDK_NOT_INSTALLED;
        } else if (getdetachedfromparentlookaheadplacement.serializer.read()) {
            androidComposeViewRootModifierNodeonKeyEvent1 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_ENABLED;
        } else {
            androidComposeViewRootModifierNodeonKeyEvent1 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_DISABLED;
        }
        getdetachedfromparentlookaheadplacement2 = (getDetachedFromParentLookaheadPlacement) map.get(accessgetCurrentlyAccessibilityFocusedANIp.CRASHLYTICS);
        if (getdetachedfromparentlookaheadplacement2 == null) {
            androidComposeViewRootModifierNodeonKeyEvent2 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_SDK_NOT_INSTALLED;
        } else if (getdetachedfromparentlookaheadplacement2.serializer.read()) {
            androidComposeViewRootModifierNodeonKeyEvent2 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_ENABLED;
        } else {
            androidComposeViewRootModifierNodeonKeyEvent2 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_DISABLED;
        }
        AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1 = new AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1(getlifecycleowner, new AndroidComposeViewresendMotionEventOnLayout1(str3, str4, i2, j, new getRulerLambda(androidComposeViewRootModifierNodeonKeyEvent1, androidComposeViewRootModifierNodeonKeyEvent2, sessionsSettings2.RemoteActionCompatParcelizer()), str, str2), SessionEvents.write(firebaseApp2));
        int i3 = SessionFirelogPublisherImpl.serializer;
        sessionFirelogPublisherImpl.getClass();
        try {
            sessionFirelogPublisherImpl.read.read(androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1);
        } catch (RuntimeException e) {
            SentryLogcatAdapter.read("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e);
        }
        return createFromParcel.INSTANCE;
        if (((Boolean) objAccess$shouldLogSession).booleanValue()) {
            accesssetInstancecp accesssetinstancecp = sessionFirelogPublisherImpl2.MediaMetadataCompat;
            this.MediaDescriptionCompat = 2;
            objCreate = onInitializeAccessibilityNodeInfo.serializer.create(accesssetinstancecp, this);
            if (objCreate != coroutineSingletons) {
                oninitializeaccessibilitynodeinfo = (onInitializeAccessibilityNodeInfo) objCreate;
                sessionEvents = SessionEvents.IconCompatParcelizer;
                firebaseApp = sessionFirelogPublisherImpl2.write;
                sessionsSettings = sessionFirelogPublisherImpl2.MediaBrowserCompatMediaItem;
                FirebaseSessionsDependencies firebaseSessionsDependencies2 = FirebaseSessionsDependencies.read;
                this.IconCompatParcelizer = oninitializeaccessibilitynodeinfo;
                this.write = sessionFirelogPublisherImpl2;
                this.read = sessionEvents;
                this.serializer = firebaseApp;
                androidComposeViewpointerIconService1 = this.RemoteActionCompatParcelizer;
                this.MediaMetadataCompat = androidComposeViewpointerIconService1;
                this.MediaBrowserCompatMediaItem = sessionsSettings;
                this.MediaDescriptionCompat = 3;
                registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies2.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (registeredSubscribers$com_google_firebase_firebase_sessions != coroutineSingletons) {
                    sessionsSettings2 = sessionsSettings;
                    oninitializeaccessibilitynodeinfo2 = oninitializeaccessibilitynodeinfo;
                    sessionEvents2 = sessionEvents;
                    androidComposeViewpointerIconService2 = androidComposeViewpointerIconService1;
                    sessionFirelogPublisherImpl = sessionFirelogPublisherImpl2;
                    firebaseApp2 = firebaseApp;
                    Map map2 = (Map) registeredSubscribers$com_google_firebase_firebase_sessions;
                    String str5 = oninitializeaccessibilitynodeinfo2.write;
                    String str6 = oninitializeaccessibilitynodeinfo2.RemoteActionCompatParcelizer;
                    sessionEvents2.getClass();
                    firebaseApp2.getClass();
                    androidComposeViewpointerIconService2.getClass();
                    sessionsSettings2.getClass();
                    map2.getClass();
                    str6.getClass();
                    getLifecycleOwner getlifecycleowner2 = getLifecycleOwner.SESSION_START;
                    String str7 = androidComposeViewpointerIconService2.sessionId;
                    String str8 = androidComposeViewpointerIconService2.firstSessionId;
                    int i4 = androidComposeViewpointerIconService2.sessionIndex;
                    long j2 = androidComposeViewpointerIconService2.sessionStartTimestampUs;
                    getdetachedfromparentlookaheadplacement = (getDetachedFromParentLookaheadPlacement) map2.get(accessgetCurrentlyAccessibilityFocusedANIp.PERFORMANCE);
                    if (getdetachedfromparentlookaheadplacement == null) {
                        androidComposeViewRootModifierNodeonKeyEvent1 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_SDK_NOT_INSTALLED;
                    } else if (getdetachedfromparentlookaheadplacement.serializer.read()) {
                        androidComposeViewRootModifierNodeonKeyEvent1 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_ENABLED;
                    } else {
                        androidComposeViewRootModifierNodeonKeyEvent1 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_DISABLED;
                    }
                    getdetachedfromparentlookaheadplacement2 = (getDetachedFromParentLookaheadPlacement) map2.get(accessgetCurrentlyAccessibilityFocusedANIp.CRASHLYTICS);
                    if (getdetachedfromparentlookaheadplacement2 == null) {
                        androidComposeViewRootModifierNodeonKeyEvent2 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_SDK_NOT_INSTALLED;
                    } else if (getdetachedfromparentlookaheadplacement2.serializer.read()) {
                        androidComposeViewRootModifierNodeonKeyEvent2 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_ENABLED;
                    } else {
                        androidComposeViewRootModifierNodeonKeyEvent2 = AndroidComposeViewRootModifierNodeonKeyEvent1.COLLECTION_DISABLED;
                    }
                    AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1 androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect2 = new AndroidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect1(getlifecycleowner2, new AndroidComposeViewresendMotionEventOnLayout1(str7, str8, i4, j2, new getRulerLambda(androidComposeViewRootModifierNodeonKeyEvent1, androidComposeViewRootModifierNodeonKeyEvent2, sessionsSettings2.RemoteActionCompatParcelizer()), str5, str6), SessionEvents.write(firebaseApp2));
                    int i5 = SessionFirelogPublisherImpl.serializer;
                    sessionFirelogPublisherImpl.getClass();
                    sessionFirelogPublisherImpl.read.read(androidComposeViewrequestFocusBypassUnfocusableComposeViewrequestFocusWithoutPrevRect2);
                }
            }
            return coroutineSingletons;
        }
        return createFromParcel.INSTANCE;
    }
}
