package com.roadrunner.delivery.accept.declinebutton.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.accept.declinebutton.domain.AcceptOrderClickEventRetriever;
import com.roadrunner.delivery.accept.declinebutton.domain.DeclineOrderClickEventRetriever;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import o.BoringLayoutFactory33ExternalSyntheticApiModelOutline0;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isBoring;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class LasagnaDeclineBottomSheetViewModel$updateState$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ BoringLayoutFactory33ExternalSyntheticApiModelOutline0 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LasagnaDeclineBottomSheetViewModel$updateState$1(BoringLayoutFactory33ExternalSyntheticApiModelOutline0 boringLayoutFactory33ExternalSyntheticApiModelOutline0, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = boringLayoutFactory33ExternalSyntheticApiModelOutline0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 35;
        read = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        BoringLayoutFactory33ExternalSyntheticApiModelOutline0 boringLayoutFactory33ExternalSyntheticApiModelOutline0 = this.serializer;
        if (i4 == 0) {
            return new LasagnaDeclineBottomSheetViewModel$updateState$1(boringLayoutFactory33ExternalSyntheticApiModelOutline0, shortNewsContentCardView, 0);
        }
        int i5 = 1;
        if (i4 == 1) {
            return new LasagnaDeclineBottomSheetViewModel$updateState$1(boringLayoutFactory33ExternalSyntheticApiModelOutline0, shortNewsContentCardView, i5);
        }
        LasagnaDeclineBottomSheetViewModel$updateState$1 lasagnaDeclineBottomSheetViewModel$updateState$1 = new LasagnaDeclineBottomSheetViewModel$updateState$1(boringLayoutFactory33ExternalSyntheticApiModelOutline0, shortNewsContentCardView, i);
        int i6 = read + 5;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return lasagnaDeclineBottomSheetViewModel$updateState$1;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 89;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return i3 != 1 ? ((LasagnaDeclineBottomSheetViewModel$updateState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2) : ((LasagnaDeclineBottomSheetViewModel$updateState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((LasagnaDeclineBottomSheetViewModel$updateState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = write + 71;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        BoringLayoutFactory33ExternalSyntheticApiModelOutline0 boringLayoutFactory33ExternalSyntheticApiModelOutline0 = this.serializer;
        Object obj2 = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flowWrite = TuplesKt.write(UpdateStateUseCaseImpl.write(boringLayoutFactory33ExternalSyntheticApiModelOutline0.PlaybackStateCompatCustomAction));
                isBoring isboring = new isBoring(boringLayoutFactory33ExternalSyntheticApiModelOutline0, 1);
                this.IconCompatParcelizer = 1;
                return ((ChannelFlow) flowWrite).collect(isboring, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i4 = write + 11;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return null;
            }
            int i6 = write + 121;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw null;
        }
        if (i2 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.IconCompatParcelizer;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                DeclineOrderClickEventRetriever declineOrderClickEventRetriever = boringLayoutFactory33ExternalSyntheticApiModelOutline0.read;
                this.IconCompatParcelizer = 1;
                obj = declineOrderClickEventRetriever.invoke(this);
                if (obj == coroutineSingletons2) {
                    int i8 = write + 95;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return coroutineSingletons2;
                }
            } else {
                if (i7 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = write + 95;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            TrackingEvent trackingEvent = (TrackingEvent) obj;
            if (trackingEvent == null) {
                return createfromparcel;
            }
            boringLayoutFactory33ExternalSyntheticApiModelOutline0.MediaBrowserCompatMediaItem.serializer(trackingEvent);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.IconCompatParcelizer;
        if (i12 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AcceptOrderClickEventRetriever acceptOrderClickEventRetriever = boringLayoutFactory33ExternalSyntheticApiModelOutline0.write;
            this.IconCompatParcelizer = 1;
            obj = acceptOrderClickEventRetriever.invoke(this);
            if (obj == coroutineSingletons3) {
                return coroutineSingletons3;
            }
        } else {
            if (i12 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = read + 9;
            write = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obj2.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        TrackingEvent trackingEvent2 = (TrackingEvent) obj;
        if (trackingEvent2 == null) {
            return createfromparcel;
        }
        boringLayoutFactory33ExternalSyntheticApiModelOutline0.MediaBrowserCompatMediaItem.serializer(trackingEvent2);
        return createfromparcel;
    }
}
