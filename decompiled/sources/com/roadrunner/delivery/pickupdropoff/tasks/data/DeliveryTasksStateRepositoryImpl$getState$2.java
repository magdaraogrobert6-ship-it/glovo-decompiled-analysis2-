package com.roadrunner.delivery.pickupdropoff.tasks.data;

import androidx.compose.ui.graphics.Fields;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryTasksStateRepositoryImpl$getState$2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 IconCompatParcelizer;
    public /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public /* synthetic */ Throwable serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryTasksStateRepositoryImpl$getState$2(long j, AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1 animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.read = j;
        this.IconCompatParcelizer = animatedVisibilityClockgetTransitionslambda0inlinedsortedBy1;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        DeliveryTasksStateRepositoryImpl$getState$2 deliveryTasksStateRepositoryImpl$getState$2 = new DeliveryTasksStateRepositoryImpl$getState$2(this.read, this.IconCompatParcelizer, (ShortNewsContentCardView) obj3);
        deliveryTasksStateRepositoryImpl$getState$2.RemoteActionCompatParcelizer = (FlowCollector) obj;
        deliveryTasksStateRepositoryImpl$getState$2.serializer = (Throwable) obj2;
        Object objInvokeSuspend = deliveryTasksStateRepositoryImpl$getState$2.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = RatingCompat + 63;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        FlowCollector flowCollector = this.RemoteActionCompatParcelizer;
        Throwable th = this.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            long j = this.read;
            forest.RemoteActionCompatParcelizer(th, m1$$ExternalSyntheticOutline0.m(j, "delivery_task_state: Could not decode the data for deliveryId ", ", deleting entry."), new Object[0]);
            this.RemoteActionCompatParcelizer = flowCollector;
            this.serializer = null;
            this.write = 1;
            Object objDelete = this.IconCompatParcelizer.read.delete(AnimatedVisibilityClockgetTransitionslambda0inlinedsortedBy1.read(j), this);
            if (objDelete == coroutineSingletons) {
                int i3 = RatingCompat + 101;
                MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            } else {
                objDelete = createfromparcel;
            }
            if (objDelete != coroutineSingletons) {
            }
        }
        int i5 = RatingCompat;
        int i6 = i5 + 67;
        MediaMetadataCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0 ? i2 != 1 : i2 != 0) {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = i5 + 109;
            MediaMetadataCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        this.RemoteActionCompatParcelizer = null;
        this.serializer = null;
        this.write = 2;
        return flowCollector.emit(null, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
    }
}
