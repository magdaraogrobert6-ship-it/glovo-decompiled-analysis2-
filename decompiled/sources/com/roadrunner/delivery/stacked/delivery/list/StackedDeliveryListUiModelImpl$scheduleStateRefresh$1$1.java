package com.roadrunner.delivery.stacked.delivery.list;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.time.Instant;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.initlambda20;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class StackedDeliveryListUiModelImpl$scheduleStateRefresh$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public final /* synthetic */ StackedDeliveryListUiModelImpl IconCompatParcelizer;
    public final /* synthetic */ Instant RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StackedDeliveryListUiModelImpl$scheduleStateRefresh$1$1(StackedDeliveryListUiModelImpl stackedDeliveryListUiModelImpl, Instant instant, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = stackedDeliveryListUiModelImpl;
        this.RemoteActionCompatParcelizer = instant;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 75;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        Instant instant = this.RemoteActionCompatParcelizer;
        StackedDeliveryListUiModelImpl stackedDeliveryListUiModelImpl = this.IconCompatParcelizer;
        if (i3 != 0) {
            return new StackedDeliveryListUiModelImpl$scheduleStateRefresh$1$1(stackedDeliveryListUiModelImpl, instant, shortNewsContentCardView, 1);
        }
        StackedDeliveryListUiModelImpl$scheduleStateRefresh$1$1 stackedDeliveryListUiModelImpl$scheduleStateRefresh$1$1 = new StackedDeliveryListUiModelImpl$scheduleStateRefresh$1$1(stackedDeliveryListUiModelImpl, instant, shortNewsContentCardView, 0);
        int i4 = write + 87;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return stackedDeliveryListUiModelImpl$scheduleStateRefresh$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 109;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((StackedDeliveryListUiModelImpl$scheduleStateRefresh$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((StackedDeliveryListUiModelImpl$scheduleStateRefresh$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaMetadataCompat + 3;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Instant instant = this.RemoteActionCompatParcelizer;
        StackedDeliveryListUiModelImpl stackedDeliveryListUiModelImpl = this.IconCompatParcelizer;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.serializer;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Flow flowRemoteActionCompatParcelizer = stackedDeliveryListUiModelImpl.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(instant);
            StackedDeliveryListUiModelImpl$refreshState$1 stackedDeliveryListUiModelImpl$refreshState$1 = new StackedDeliveryListUiModelImpl$refreshState$1(stackedDeliveryListUiModelImpl, null, 2);
            this.serializer = 1;
            if (FlowKt.collectLatest(flowRemoteActionCompatParcelizer, stackedDeliveryListUiModelImpl$refreshState$1, this) != coroutineSingletons) {
                return createfromparcel;
            }
            int i4 = write + 47;
            MediaMetadataCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 80 / 0;
            }
            return coroutineSingletons;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.serializer;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            initlambda20 initlambda20Var = stackedDeliveryListUiModelImpl.PlaybackStateCompatCustomAction;
            instant.getClass();
            Flow flowRemoteActionCompatParcelizer2 = initlambda20Var.RemoteActionCompatParcelizer(instant);
            StackedDeliveryListUiModelImpl$refreshState$1 stackedDeliveryListUiModelImpl$refreshState$2 = new StackedDeliveryListUiModelImpl$refreshState$1(stackedDeliveryListUiModelImpl, null, 1);
            this.serializer = 1;
            return FlowKt.collectLatest(flowRemoteActionCompatParcelizer2, stackedDeliveryListUiModelImpl$refreshState$2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i6 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i7 = MediaMetadataCompat + 77;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return null;
        }
        int i9 = MediaMetadataCompat + 45;
        write = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        throw null;
    }
}
