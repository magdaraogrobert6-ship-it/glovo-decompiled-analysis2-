package com.roadrunner.customerchat.selfservice.domain.analytics;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.huawei.agconnect.config.impl.m;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest$invoke$2;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetsDownloadingWorker;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AnnotationType;
import o.BulletCompanion;
import o.ShortNewsContentCardView;
import o.accessanalyzeComponents58bKbWc;
import o.accessgetOldDependencyp;
import o.copyw_4Rhrwdefault;
import o.createFromParcel;
import o.getDrawStyle;
import o.getWidthXSAIIZE;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.registerOnChangedCallback;
import o.startPrefixMapping;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeCacheEventsTrackerImpl implements copyw_4Rhrwdefault {
    private static int RatingCompat = 1;
    private static int write;
    public final m IconCompatParcelizer;
    public final isOpenInternalroom_runtime RemoteActionCompatParcelizer;
    public final registerOnChangedCallback read;
    public final AnalyticsImpl serializer;

    /* JADX INFO: renamed from: com.roadrunner.customerchat.selfservice.domain.analytics.NativeCacheEventsTrackerImpl$trackNativeCacheDeviceStatsEvent$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int MediaMetadataCompat = 0;
        private static int MediaSessionCompatQueueItem = 1;
        public final /* synthetic */ String IconCompatParcelizer;
        public int RatingCompat;
        public final /* synthetic */ AnnotationType RemoteActionCompatParcelizer;
        public final /* synthetic */ boolean read;
        public final /* synthetic */ startPrefixMapping serializer;
        public final /* synthetic */ List write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, String str, startPrefixMapping startprefixmapping, List list, AnnotationType annotationType, ShortNewsContentCardView shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
            this.read = z;
            this.IconCompatParcelizer = str;
            this.serializer = startprefixmapping;
            this.write = list;
            this.RemoteActionCompatParcelizer = annotationType;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = MediaMetadataCompat + 3;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((AnonymousClass2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
            int i4 = MediaMetadataCompat + 125;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 19 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            AnonymousClass2 anonymousClass2 = NativeCacheEventsTrackerImpl.this.new AnonymousClass2(this.read, this.IconCompatParcelizer, this.serializer, this.write, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
            int i2 = MediaSessionCompatQueueItem + 117;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 52 / 0;
            }
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 57;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                obj2.hashCode();
                throw null;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RatingCompat;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                NativeCacheEventsTrackerImpl nativeCacheEventsTrackerImpl = NativeCacheEventsTrackerImpl.this;
                AnalyticsImpl analyticsImpl = nativeCacheEventsTrackerImpl.serializer;
                m mVar = nativeCacheEventsTrackerImpl.IconCompatParcelizer;
                mVar.getClass();
                String str = this.IconCompatParcelizer;
                str.getClass();
                startPrefixMapping startprefixmapping = this.serializer;
                startprefixmapping.getClass();
                List list = this.write;
                list.getClass();
                AnnotationType annotationType = this.RemoteActionCompatParcelizer;
                annotationType.getClass();
                String str2 = startprefixmapping.write;
                String str3 = ((DateTimeFormatter) ((zzz) mVar.RemoteActionCompatParcelizer).serializer).format(Instant.now());
                str3.getClass();
                String str4 = startprefixmapping.serializer;
                Map mapSingletonMap = Collections.singletonMap("source", "native_wrapper");
                mapSingletonMap.getClass();
                BulletCompanion bulletCompanion = new BulletCompanion(str4, mapSingletonMap);
                ((accessgetOldDependencyp) mVar.read).getClass();
                getWidthXSAIIZE getwidthxsaiize = new getWidthXSAIIZE(str2, str3, mVar.serializer("HELP_CENTER_MOBILE_SDK_NATIVE_CACHE_DEVICE_STATS", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("available_release_ids", onContentCardDismissed.IconCompatParcelizer(list, ",", null, null, null, 62)), new onViewAttachedToWindowlambda0("available_disk_space_bytes", String.valueOf(annotationType.IconCompatParcelizer)), new onViewAttachedToWindowlambda0("battery_level_percent", String.valueOf(annotationType.RemoteActionCompatParcelizer)), new onViewAttachedToWindowlambda0("is_download_success", String.valueOf(this.read)), new onViewAttachedToWindowlambda0("target_release_id", str), new onViewAttachedToWindowlambda0("is_charging", String.valueOf(annotationType.serializer)), new onViewAttachedToWindowlambda0("is_power_save_mode_enabled", String.valueOf(annotationType.read)), new onViewAttachedToWindowlambda0("is_data_saver_enabled", String.valueOf(annotationType.write)), new onViewAttachedToWindowlambda0("network_type", annotationType.RatingCompat), new onViewAttachedToWindowlambda0("network_tier", annotationType.MediaMetadataCompat))), new getDrawStyle(1), bulletCompanion, null, null);
                this.RatingCompat = 1;
                if (analyticsImpl.track(getwidthxsaiize, this) == coroutineSingletons2) {
                    int i4 = MediaSessionCompatQueueItem + 73;
                    MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return coroutineSingletons2;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i6 = MediaMetadataCompat + 57;
                MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            return createFromParcel.INSTANCE;
        }
    }

    public NativeCacheEventsTrackerImpl(AnalyticsImpl analyticsImpl, m mVar, isOpenInternalroom_runtime isopeninternalroom_runtime, registerOnChangedCallback registeronchangedcallback) {
        analyticsImpl.getClass();
        mVar.getClass();
        isopeninternalroom_runtime.getClass();
        registeronchangedcallback.getClass();
        this.serializer = analyticsImpl;
        this.IconCompatParcelizer = mVar;
        this.RemoteActionCompatParcelizer = isopeninternalroom_runtime;
        this.read = registeronchangedcallback;
    }

    public final Object trackNativeCacheDeviceStatsEvent(boolean z, String str, startPrefixMapping startprefixmapping, List list, AnnotationType annotationType, ChatAssetsDownloadingWorker.AnonymousClass1 anonymousClass1) {
        int i = 2 % 2;
        Object objIfTrackingEnabled = ifTrackingEnabled(new AnonymousClass2(z, str, startprefixmapping, list, annotationType, null), anonymousClass1);
        if (objIfTrackingEnabled != CoroutineSingletons.COROUTINE_SUSPENDED) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i2 = write + 21;
            RatingCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return createfromparcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = RatingCompat + 123;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objIfTrackingEnabled;
    }

    public final Object ifTrackingEnabled(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        int i2 = RatingCompat + 85;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (((FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) this.read).serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_CHAT_TRACKING_ENABLED.getFirebaseFlagName())) {
            ((inCompatibilityMode) this.RemoteActionCompatParcelizer).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new ExecuteDatabaseRequest$invoke$2(5, null, r8lambdaunavo3sxub_pc9xroryotnrlvsm), continuationImpl);
            if (objWithContext == CoroutineSingletons.COROUTINE_SUSPENDED) {
                int i4 = RatingCompat + 85;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return objWithContext;
            }
        }
        return createFromParcel.INSTANCE;
    }
}
