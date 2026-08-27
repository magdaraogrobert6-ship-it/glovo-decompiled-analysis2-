package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.pcn;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.accessibleField;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerUnavailableViewModelV2$applyAndPersist$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ accessibleField read;
    public final /* synthetic */ CustomerUnavailableViewModelV2 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerUnavailableViewModelV2$applyAndPersist$1(CustomerUnavailableViewModelV2 customerUnavailableViewModelV2, accessibleField accessiblefield, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.serializer = customerUnavailableViewModelV2;
        this.read = accessiblefield;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 11;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        accessibleField accessiblefield = this.read;
        CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = this.serializer;
        if (i4 != 0) {
            return new CustomerUnavailableViewModelV2$applyAndPersist$1(customerUnavailableViewModelV2, accessiblefield, shortNewsContentCardView, 1);
        }
        CustomerUnavailableViewModelV2$applyAndPersist$1 customerUnavailableViewModelV2$applyAndPersist$1 = new CustomerUnavailableViewModelV2$applyAndPersist$1(customerUnavailableViewModelV2, accessiblefield, shortNewsContentCardView, 0);
        int i5 = RemoteActionCompatParcelizer + 103;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return customerUnavailableViewModelV2$applyAndPersist$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((CustomerUnavailableViewModelV2$applyAndPersist$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((CustomerUnavailableViewModelV2$applyAndPersist$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaDescriptionCompat + 43;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        obj3.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        CustomerUnavailableViewModelV2 customerUnavailableViewModelV2 = this.serializer;
        if (i3 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.write;
            if (i4 != 0) {
                int i5 = RemoteActionCompatParcelizer + 3;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                UpdateTaskUseCaseImpl updateTaskUseCaseImpl = customerUnavailableViewModelV2.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                long jLongValue = ((Long) CustomerUnavailableViewModelV2.RemoteActionCompatParcelizer(1764155832, pcn.serializer(), new Object[]{customerUnavailableViewModelV2}, -1764155832, pcn.serializer(), pcn.serializer(), pcn.serializer())).longValue();
                String str = (String) customerUnavailableViewModelV2.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(accessibleField.class);
                this.write = 1;
                if (updateTaskUseCaseImpl.invoke(jLongValue, str, this.read, r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return createfromparcel2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.write;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            UpdateTaskUseCaseImpl updateTaskUseCaseImpl2 = customerUnavailableViewModelV2.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            long jLongValue2 = ((Long) CustomerUnavailableViewModelV2.RemoteActionCompatParcelizer(1764155832, pcn.serializer(), new Object[]{customerUnavailableViewModelV2}, -1764155832, pcn.serializer(), pcn.serializer(), pcn.serializer())).longValue();
            String str2 = (String) customerUnavailableViewModelV2.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper();
            r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2 = displayInAppMessagelambda1.serializer(accessibleField.class);
            this.write = 1;
            if (updateTaskUseCaseImpl2.invoke(jLongValue2, str2, this.read, r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer2, this) == coroutineSingletons2) {
                int i8 = MediaDescriptionCompat + 41;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return coroutineSingletons2;
                }
                throw null;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i9 = RemoteActionCompatParcelizer + 101;
                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createfromparcel2;
    }
}
