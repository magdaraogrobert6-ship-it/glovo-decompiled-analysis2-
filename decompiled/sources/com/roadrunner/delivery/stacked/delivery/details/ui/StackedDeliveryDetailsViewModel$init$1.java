package com.roadrunner.delivery.stacked.delivery.details.ui;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.delivery.pickupdropoff.presentation.PickupDropOffSingleDeliveryUiModelImpl;
import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.nafath.NafathModalUiModelImpl$startCountDown$2;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.ContextScope;
import o.ComposableSingletonsComposeViewAdapter_androidKt;
import o.ComposeViewAdapter_androidKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getMToDpValues;
import o.getQueryContext;
import o.getSpUIouoOA;
import o.handleUrlOverridelambda1;
import o.isNullGroup;
import o.lerpMdfbLM;
import o.plusAH228Gc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA;
import o.timesadjELrA;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes3.dex */
public final class StackedDeliveryDetailsViewModel$init$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RatingCompat = 1;
    private static int serializer;
    public final /* synthetic */ timesadjELrA IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StackedDeliveryDetailsViewModel$init$1(timesadjELrA timesadjelra, long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = timesadjelra;
        this.read = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 123;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (this.RemoteActionCompatParcelizer != 0) {
            return new StackedDeliveryDetailsViewModel$init$1(this.IconCompatParcelizer, this.read, shortNewsContentCardView, 1);
        }
        StackedDeliveryDetailsViewModel$init$1 stackedDeliveryDetailsViewModel$init$1 = new StackedDeliveryDetailsViewModel$init$1(this.IconCompatParcelizer, this.read, shortNewsContentCardView, 0);
        int i3 = serializer + 125;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return stackedDeliveryDetailsViewModel$init$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 109;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((StackedDeliveryDetailsViewModel$init$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((StackedDeliveryDetailsViewModel$init$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 125;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        timesadjELrA timesadjelra = this.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getMToDpValues getmtodpvalues = timesadjelra.write;
                this.write = 1;
                final Flow flow = getmtodpvalues.read.read();
                final long j = this.read;
                obj2 = new Flow() { // from class: com.roadrunner.delivery.stacked.delivery.list.usecase.IsStackedDeliveryExpandableImpl$invoke$$inlined$map$1
                    private static int RemoteActionCompatParcelizer = 0;
                    private static int read = 1;

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView2) {
                        int i4 = 2 % 2;
                        Object objCollect = flow.collect(new NafathModalUiModelImpl$startCountDown$2(j, 1, flowCollector), shortNewsContentCardView2);
                        if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            return createFromParcel.INSTANCE;
                        }
                        int i5 = read;
                        int i6 = i5 + 61;
                        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        int i8 = i5 + 125;
                        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            int i9 = 8 / 0;
                        }
                        return objCollect;
                    }
                };
                if (obj2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = serializer + 55;
                RatingCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i5 = 8 / 0;
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            obj2 = obj;
            DividerUiModelImpl$1.AnonymousClass1 anonymousClass1 = new DividerUiModelImpl$1.AnonymousClass1(timesadjelra, shortNewsContentCardView, 5);
            this.write = 2;
            if (FlowKt.collectLatest((Flow) obj2, anonymousClass1, this) != coroutineSingletons) {
                return createfromparcel;
            }
            return coroutineSingletons;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.write;
        if (i6 != 0) {
            int i7 = serializer + 117;
            int i8 = i7 % Fields.SpotShadowColor;
            RatingCompat = i8;
            if (i7 % 2 != 0 ? i6 != 1 : i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = i8 + 119;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i10 = 17 / 0;
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (!((FirebaseRemoteConfigImpl) timesadjelra.serializer).ResultReceiver()) {
            timesadjelra.IconCompatParcelizer.serializer(getSpUIouoOA.read);
            return createfromparcel;
        }
        ComposeViewAdapter_androidKt composeViewAdapter_androidKt = timesadjelra.RemoteActionCompatParcelizer;
        Object[] objArr = {toBitmapConfig1JJdX4A.IconCompatParcelizer(timesadjelra)};
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        ContextScope contextScope = (ContextScope) ExtrasKt.read(702708900, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -702708894, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr);
        composeViewAdapter_androidKt.getClass();
        plusAH228Gc plusah228gc = composeViewAdapter_androidKt.read;
        Object objWrite = plusah228gc.RemoteActionCompatParcelizer.write();
        objWrite.getClass();
        ObservePuDoDeliveriesResponseImpl observePuDoDeliveriesResponseImpl = (ObservePuDoDeliveriesResponseImpl) objWrite;
        Object objWrite2 = plusah228gc.serializer.write();
        objWrite2.getClass();
        UpdateStateUseCaseImpl updateStateUseCaseImpl = (UpdateStateUseCaseImpl) objWrite2;
        Object objWrite3 = plusah228gc.IconCompatParcelizer.write();
        objWrite3.getClass();
        r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA r8lambdatoejz8ebqikfdbp_lhyd8cduqfa = (r8lambdatOEJz8ebqIKFdbp_lhyD8CdUqfA) objWrite3;
        Object objWrite4 = plusah228gc.read.write();
        objWrite4.getClass();
        isNullGroup isnullgroup = (isNullGroup) objWrite4;
        Object objWrite5 = plusah228gc.MediaSessionCompatQueueItem.write();
        objWrite5.getClass();
        Object objWrite6 = plusah228gc.write.write();
        objWrite6.getClass();
        getQueryContext getquerycontext = new getQueryContext();
        PickupDropOffSingleDeliveryUiModelImpl pickupDropOffSingleDeliveryUiModelImpl = new PickupDropOffSingleDeliveryUiModelImpl(contextScope, this.read, observePuDoDeliveriesResponseImpl, updateStateUseCaseImpl, r8lambdatoejz8ebqikfdbp_lhyd8cduqfa, isnullgroup, (lerpMdfbLM) objWrite5, (ComposableSingletonsComposeViewAdapter_androidKt) objWrite6, getquerycontext);
        FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 flowKt__LimitKt$drop$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$drop$$inlined$unsafeFlow$1(pickupDropOffSingleDeliveryUiModelImpl.MediaDescriptionCompat);
        NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1 = new NestViewModel$updateConfiguration$1$1$1$1(timesadjelra, 9, pickupDropOffSingleDeliveryUiModelImpl);
        this.write = 1;
        if (flowKt__LimitKt$drop$$inlined$unsafeFlow$1.collect(nestViewModel$updateConfiguration$1$1$1$1, this) != coroutineSingletons2) {
            return createfromparcel;
        }
        int i11 = serializer + 79;
        RatingCompat = i11 % Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return coroutineSingletons2;
        }
        throw null;
    }
}
