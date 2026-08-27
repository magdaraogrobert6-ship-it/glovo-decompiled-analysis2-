package com.roadrunner.delivery.pickupdropoff.details.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class PickUpDropOffDetailsUiModelImpl$refreshState$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ PickUpDropOffDetailsUiModelImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PickUpDropOffDetailsUiModelImpl$refreshState$1(PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = pickUpDropOffDetailsUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 25;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.serializer;
        PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl = this.write;
        if (i5 == 0) {
            return new PickUpDropOffDetailsUiModelImpl$refreshState$1(pickUpDropOffDetailsUiModelImpl, shortNewsContentCardView, 0);
        }
        int i6 = 1;
        if (i5 == 1) {
            return new PickUpDropOffDetailsUiModelImpl$refreshState$1(pickUpDropOffDetailsUiModelImpl, shortNewsContentCardView, i6);
        }
        PickUpDropOffDetailsUiModelImpl$refreshState$1 pickUpDropOffDetailsUiModelImpl$refreshState$1 = new PickUpDropOffDetailsUiModelImpl$refreshState$1(pickUpDropOffDetailsUiModelImpl, shortNewsContentCardView, i);
        int i7 = IconCompatParcelizer + 67;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return pickUpDropOffDetailsUiModelImpl$refreshState$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 != 0) {
            if (i4 != 1) {
                ((PickUpDropOffDetailsUiModelImpl$refreshState$1) create((createFromParcel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            }
            ((PickUpDropOffDetailsUiModelImpl$refreshState$1) create((createFromParcel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((PickUpDropOffDetailsUiModelImpl$refreshState$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        PickUpDropOffDetailsUiModelImpl pickUpDropOffDetailsUiModelImpl = this.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 != 0) {
            if (i4 != 1) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BuildersKt.RemoteActionCompatParcelizer(pickUpDropOffDetailsUiModelImpl.RemoteActionCompatParcelizer, null, null, new PickUpDropOffDetailsUiModelImpl$refreshState$1(pickUpDropOffDetailsUiModelImpl, shortNewsContentCardView, 0), 3);
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            pickUpDropOffDetailsUiModelImpl.RemoteActionCompatParcelizer();
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        MutableStateFlow mutableStateFlow = pickUpDropOffDetailsUiModelImpl.write;
        mutableStateFlow.IconCompatParcelizer(Boolean.TRUE);
        UpdateStateUseCaseImpl.write(pickUpDropOffDetailsUiModelImpl.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        mutableStateFlow.IconCompatParcelizer(Boolean.FALSE);
        int i5 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return createfromparcel;
        }
        throw null;
    }
}
