package com.roadrunner.rider.state.polling;

import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.roadrunner.map.container.context.GetMapScope$invoke$4;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.domain.GetRiderStateImpl$invoke$1;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getConnectivityType;
import o.getContentViewGroupParentLayout;
import o.getFireAdvertisingIdAsync;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.scaleimpl;
import o.translateimpldefault;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ getConnectivityType read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RiderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1(getConnectivityType getconnectivitytype, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = getconnectivitytype;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 5;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        getConnectivityType getconnectivitytype = this.read;
        if (i4 != 0) {
            return new RiderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1(getconnectivitytype, shortNewsContentCardView, 1);
        }
        RiderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1 riderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1 = new RiderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1(getconnectivitytype, shortNewsContentCardView, 0);
        int i5 = write + 57;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return riderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 113;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((RiderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((RiderStatusPollingSchedulerImpl$observeRiderStatusAndSchedulePolling$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = write + 85;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zM;
        Flow flowIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = write + 107;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getConnectivityType getconnectivitytype = this.read;
        int i5 = 0;
        int i6 = 1;
        if (i4 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.RemoteActionCompatParcelizer;
            if (i7 != 0) {
                int i8 = serializer + 105;
                write = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0 ? i7 != 1 : i7 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            WorkManagerImpl workManagerImpl = getconnectivitytype.MediaSessionCompatToken;
            scaleimpl scaleimplVarMediaMetadataCompat = workManagerImpl.PlaybackStateCompat.MediaMetadataCompat();
            CoroutineDispatcher coroutineDispatcher = workManagerImpl.MediaSessionCompatToken.serializer;
            scaleimplVarMediaMetadataCompat.getClass();
            coroutineDispatcher.getClass();
            translateimpldefault translateimpldefaultVar = (translateimpldefault) scaleimplVarMediaMetadataCompat;
            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(FlowKt.RemoteActionCompatParcelizer(FlowKt.serializer(new WorkSpecDaoKt$dedup$$inlined$map$1(0, DelayKt.RemoteActionCompatParcelizer(translateimpldefaultVar.IconCompatParcelizer, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new RoomDatabase$$ExternalSyntheticLambda2(11, translateimpldefaultVar)))), coroutineDispatcher), new GetMapScope$invoke$4(3, 5, null));
            getFireAdvertisingIdAsync getfireadvertisingidasync = new getFireAdvertisingIdAsync(getconnectivitytype, i6);
            this.RemoteActionCompatParcelizer = 1;
            return flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.collect(getfireadvertisingidasync, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = this.RemoteActionCompatParcelizer;
        if (i9 != 0) {
            if (i9 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) getconnectivitytype.RatingCompat;
        String str = firebaseRemoteConfigImpl.read.read();
        if (str == null) {
            zM = false;
        } else {
            zM = m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_SMART_POLLING_RACE_CONDITION_FIX_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, str, firebaseRemoteConfigImpl);
        }
        GetRiderStatusImpl getRiderStatusImpl = getconnectivitytype.write;
        if (zM) {
            int i10 = write + 125;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            flowIconCompatParcelizer = FlowKt.write(getRiderStatusImpl.IconCompatParcelizer(), DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
        } else {
            flowIconCompatParcelizer = getRiderStatusImpl.IconCompatParcelizer();
        }
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(flowIconCompatParcelizer, new GetRiderStateImpl$invoke$1(getconnectivitytype, null));
        getFireAdvertisingIdAsync getfireadvertisingidasync2 = new getFireAdvertisingIdAsync(getconnectivitytype, i5);
        this.RemoteActionCompatParcelizer = 1;
        return flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.collect(getfireadvertisingidasync2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
    }
}
