package com.roadrunner.customerchat.selfservice.domain.analytics;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.huawei.agconnect.config.impl.m;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.Bullet;
import o.BulletCompanion;
import o.ShortNewsContentCardView;
import o.accessgetDefaultIndentationcp;
import o.accessgetDefaultPaddingcp;
import o.accessgetOldDependencyp;
import o.createFromParcel;
import o.getDrawStyle;
import o.getPaddingXSAIIZE;
import o.getWidthXSAIIZE;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class NativeCacheEventsTrackerImpl$trackAssetsServedSummaryEvent$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final /* synthetic */ accessgetDefaultIndentationcp IconCompatParcelizer;
    public final /* synthetic */ NativeCacheEventsTrackerImpl MediaDescriptionCompat;
    public final /* synthetic */ String MediaSessionCompatQueueItem;
    public int RatingCompat;
    public final /* synthetic */ boolean RemoteActionCompatParcelizer;
    public final /* synthetic */ Bullet read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeCacheEventsTrackerImpl$trackAssetsServedSummaryEvent$2(NativeCacheEventsTrackerImpl nativeCacheEventsTrackerImpl, Bullet bullet, boolean z, boolean z2, String str, accessgetDefaultIndentationcp accessgetdefaultindentationcp, String str2, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.MediaDescriptionCompat = nativeCacheEventsTrackerImpl;
        this.read = bullet;
        this.RemoteActionCompatParcelizer = z;
        this.write = z2;
        this.serializer = str;
        this.IconCompatParcelizer = accessgetdefaultindentationcp;
        this.MediaSessionCompatQueueItem = str2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 73;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((NativeCacheEventsTrackerImpl$trackAssetsServedSummaryEvent$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaBrowserCompatMediaItem + 35;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        NativeCacheEventsTrackerImpl$trackAssetsServedSummaryEvent$2 nativeCacheEventsTrackerImpl$trackAssetsServedSummaryEvent$2 = new NativeCacheEventsTrackerImpl$trackAssetsServedSummaryEvent$2(this.MediaDescriptionCompat, this.read, this.RemoteActionCompatParcelizer, this.write, this.serializer, this.IconCompatParcelizer, this.MediaSessionCompatQueueItem, shortNewsContentCardView);
        int i2 = MediaMetadataCompat + 109;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return nativeCacheEventsTrackerImpl$trackAssetsServedSummaryEvent$2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[PHI: r2
  0x0030: PHI (r2v5 kotlin.coroutines.intrinsics.CoroutineSingletons) = (r2v4 kotlin.coroutines.intrinsics.CoroutineSingletons), (r2v6 kotlin.coroutines.intrinsics.CoroutineSingletons) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:16:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:19:0x0117  */
    /* JADX WARN: Code duplicated, block: B:21:0x0123 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0124  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[DONT_INVERT, PHI: r6
  0x0023: PHI (r6v1 int) = (r6v0 int), (r6v4 int) binds: [B:8:0x0021, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons;
        int i;
        AnalyticsImpl analyticsImpl;
        accessgetDefaultIndentationcp accessgetdefaultindentationcp;
        String strName;
        getWidthXSAIIZE getwidthxsaiize;
        int i2;
        int i3 = 2 % 2;
        int i4 = MediaBrowserCompatMediaItem + 41;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = this.RatingCompat;
            int i5 = 87 / 0;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                NativeCacheEventsTrackerImpl nativeCacheEventsTrackerImpl = this.MediaDescriptionCompat;
                analyticsImpl = nativeCacheEventsTrackerImpl.serializer;
                m mVar = nativeCacheEventsTrackerImpl.IconCompatParcelizer;
                mVar.getClass();
                Bullet bullet = this.read;
                String str = bullet.IconCompatParcelizer;
                String str2 = ((DateTimeFormatter) ((zzz) mVar.RemoteActionCompatParcelizer).serializer).format(Instant.now());
                str2.getClass();
                getPaddingXSAIIZE getpaddingxsaiize = new getPaddingXSAIIZE(bullet.serializer);
                accessgetDefaultPaddingcp accessgetdefaultpaddingcp = new accessgetDefaultPaddingcp(bullet.read, onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("sent_from", "mobile_sdk"), new onViewAttachedToWindowlambda0("user_type", "rider")));
                String str3 = bullet.RemoteActionCompatParcelizer;
                Map mapSingletonMap = Collections.singletonMap("source", "native_wrapper");
                mapSingletonMap.getClass();
                BulletCompanion bulletCompanion = new BulletCompanion(str3, mapSingletonMap);
                ((accessgetOldDependencyp) mVar.read).getClass();
                getDrawStyle getdrawstyle = new getDrawStyle(1);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("cache_served", String.valueOf(this.RemoteActionCompatParcelizer));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("is_success", String.valueOf(this.write));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("first_failed_asset_path", this.serializer);
                accessgetdefaultindentationcp = this.IconCompatParcelizer;
                if (accessgetdefaultindentationcp != null) {
                    int i6 = MediaMetadataCompat + 21;
                    MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    strName = accessgetdefaultindentationcp.name();
                } else {
                    strName = null;
                }
                getwidthxsaiize = new getWidthXSAIIZE(str, str2, mVar.serializer("HELP_CENTER_MOBILE_SDK_NATIVE_CACHE_ASSETS_SERVED_SUMMARY", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, new onViewAttachedToWindowlambda0("cache_skip_reason", strName), new onViewAttachedToWindowlambda0("release_id", this.MediaSessionCompatQueueItem))), getdrawstyle, bulletCompanion, getpaddingxsaiize, accessgetdefaultpaddingcp);
                this.RatingCompat = 1;
                if (analyticsImpl.track(getwidthxsaiize, this) == coroutineSingletons) {
                    i2 = MediaMetadataCompat + 125;
                    MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
            } else {
                if (i == 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } else {
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = this.RatingCompat;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                NativeCacheEventsTrackerImpl nativeCacheEventsTrackerImpl2 = this.MediaDescriptionCompat;
                analyticsImpl = nativeCacheEventsTrackerImpl2.serializer;
                m mVar2 = nativeCacheEventsTrackerImpl2.IconCompatParcelizer;
                mVar2.getClass();
                Bullet bullet2 = this.read;
                String str4 = bullet2.IconCompatParcelizer;
                String str5 = ((DateTimeFormatter) ((zzz) mVar2.RemoteActionCompatParcelizer).serializer).format(Instant.now());
                str5.getClass();
                getPaddingXSAIIZE getpaddingxsaiize2 = new getPaddingXSAIIZE(bullet2.serializer);
                accessgetDefaultPaddingcp accessgetdefaultpaddingcp2 = new accessgetDefaultPaddingcp(bullet2.read, onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("sent_from", "mobile_sdk"), new onViewAttachedToWindowlambda0("user_type", "rider")));
                String str6 = bullet2.RemoteActionCompatParcelizer;
                Map mapSingletonMap2 = Collections.singletonMap("source", "native_wrapper");
                mapSingletonMap2.getClass();
                BulletCompanion bulletCompanion2 = new BulletCompanion(str6, mapSingletonMap2);
                ((accessgetOldDependencyp) mVar2.read).getClass();
                getDrawStyle getdrawstyle2 = new getDrawStyle(1);
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda3 = new onViewAttachedToWindowlambda0("cache_served", String.valueOf(this.RemoteActionCompatParcelizer));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda4 = new onViewAttachedToWindowlambda0("is_success", String.valueOf(this.write));
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda5 = new onViewAttachedToWindowlambda0("first_failed_asset_path", this.serializer);
                accessgetdefaultindentationcp = this.IconCompatParcelizer;
                if (accessgetdefaultindentationcp != null) {
                    int i8 = MediaMetadataCompat + 21;
                    MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    strName = accessgetdefaultindentationcp.name();
                } else {
                    strName = null;
                }
                getwidthxsaiize = new getWidthXSAIIZE(str4, str5, mVar2.serializer("HELP_CENTER_MOBILE_SDK_NATIVE_CACHE_ASSETS_SERVED_SUMMARY", onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda3, onviewattachedtowindowlambda4, onviewattachedtowindowlambda5, new onViewAttachedToWindowlambda0("cache_skip_reason", strName), new onViewAttachedToWindowlambda0("release_id", this.MediaSessionCompatQueueItem))), getdrawstyle2, bulletCompanion2, getpaddingxsaiize2, accessgetdefaultpaddingcp2);
                this.RatingCompat = 1;
                if (analyticsImpl.track(getwidthxsaiize, this) == coroutineSingletons) {
                    i2 = MediaMetadataCompat + 125;
                    MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
            } else {
                if (i == 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        }
        return createFromParcel.INSTANCE;
    }
}
