package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.remoteconfig.firebase.FetchRemoteConfigUseCaseImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.web.performance.WebViewInitializer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import o.SemanticsInfo;
import o.ShortNewsContentCardView;
import o.c2;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.onItemDismiss;
import o.transferSessionPackageI;
import o.unpackMetaValue;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class RemoteConfigStartupTask implements SemanticsInfo {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final CompletableDeferredImpl IconCompatParcelizer;
    public final getAllSemanticsNodesToMap MediaDescriptionCompat;
    public final FetchRemoteConfigUseCaseImpl RemoteActionCompatParcelizer;
    public final IncogniaManagerImpl read;
    public final transferSessionPackageI serializer;
    public final unpackMetaValue write;

    public RemoteConfigStartupTask(FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl, IncogniaManagerImpl incogniaManagerImpl, unpackMetaValue unpackmetavalue, getAllSemanticsNodesToMap getallsemanticsnodestomap, transferSessionPackageI transfersessionpackagei) {
        fetchRemoteConfigUseCaseImpl.getClass();
        incogniaManagerImpl.getClass();
        unpackmetavalue.getClass();
        getallsemanticsnodestomap.getClass();
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = fetchRemoteConfigUseCaseImpl;
        this.read = incogniaManagerImpl;
        this.write = unpackmetavalue;
        this.MediaDescriptionCompat = getallsemanticsnodestomap;
        this.serializer = transfersessionpackagei;
        this.IconCompatParcelizer = JobKt.write();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) {
        c2 c2Var;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 5;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (shortNewsContentCardView instanceof c2) {
            int i5 = i2 + 121;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = ((c2) shortNewsContentCardView).serializer;
                shortNewsContentCardView2.hashCode();
                throw null;
            }
            c2Var = (c2) shortNewsContentCardView;
            int i7 = c2Var.serializer;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c2Var.serializer = i7 - Integer.MIN_VALUE;
            } else {
                c2Var = new c2(this, (ContinuationImpl) shortNewsContentCardView);
            }
        } else {
            c2Var = new c2(this, (ContinuationImpl) shortNewsContentCardView);
        }
        Object objOfSuspend = c2Var.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = c2Var.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CompletableDeferredImpl completableDeferredImpl = this.IconCompatParcelizer;
        try {
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
                if (!((FirebaseRemoteConfigImpl) this.serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_EARLY_REMOTE_CONFIG_STARTUP_ENABLED.getFirebaseFlagName())) {
                    completableDeferredImpl.MediaSessionCompatQueueItem(createfromparcel);
                    return createfromparcel;
                }
                getAllSemanticsNodesToMap getallsemanticsnodestomap = this.MediaDescriptionCompat;
                WebViewInitializer.AnonymousClass2 anonymousClass2 = new WebViewInitializer.AnonymousClass2(this, shortNewsContentCardView2, 3);
                c2Var.serializer = 1;
                objOfSuspend = ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("asti_router_fetch_remote_config_v2", anonymousClass2, c2Var);
                if (objOfSuspend == coroutineSingletons) {
                    int i9 = MediaSessionCompatQueueItem + 45;
                    MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i8 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i11 = MediaBrowserCompatMediaItem + 113;
                MediaSessionCompatQueueItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(objOfSuspend);
            }
            ((onItemDismiss) objOfSuspend).getClass();
            completableDeferredImpl.MediaSessionCompatQueueItem(createfromparcel);
            return createfromparcel;
        } catch (Throwable th) {
            completableDeferredImpl.MediaSessionCompatQueueItem(createfromparcel);
            throw th;
        }
    }
}
