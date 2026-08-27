package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.model.IvrState;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getMaxDuration;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerUnavailableViewModel$updateCallInitiated$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ CustomerUnavailableViewModel read;
    public final /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerUnavailableViewModel$updateCallInitiated$1(CustomerUnavailableViewModel customerUnavailableViewModel, String str, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = customerUnavailableViewModel;
        this.write = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 65;
        serializer = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = this.IconCompatParcelizer;
        String str = this.write;
        CustomerUnavailableViewModel customerUnavailableViewModel = this.read;
        if (i4 != 0) {
            return i4 != 1 ? new CustomerUnavailableViewModel$updateCallInitiated$1(customerUnavailableViewModel, str, shortNewsContentCardView, i) : new CustomerUnavailableViewModel$updateCallInitiated$1(customerUnavailableViewModel, str, shortNewsContentCardView, 1);
        }
        CustomerUnavailableViewModel$updateCallInitiated$1 customerUnavailableViewModel$updateCallInitiated$1 = new CustomerUnavailableViewModel$updateCallInitiated$1(customerUnavailableViewModel, str, shortNewsContentCardView, 0);
        int i5 = RemoteActionCompatParcelizer + 57;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return customerUnavailableViewModel$updateCallInitiated$1;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        ((com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1) create(r6, r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        ((com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1) create(r6, r7)).invokeSuspend(r3);
        r6 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1.RemoteActionCompatParcelizer + 15;
        com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1.serializer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if ((r6 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1.serializer
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L20
            int r1 = r5.IconCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            r4 = 28
            int r4 = r4 / 0
            if (r1 == 0) goto L4d
            if (r1 == r2) goto L36
            goto L2c
        L20:
            int r1 = r5.IconCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            if (r1 == 0) goto L4d
            if (r1 == r2) goto L36
        L2c:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1 r6 = (com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1) r6
            r6.invokeSuspend(r3)
            return r3
        L36:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1 r6 = (com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1) r6
            r6.invokeSuspend(r3)
            int r6 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1.RemoteActionCompatParcelizer
            int r6 = r6 + 15
            int r7 = r6 % 128
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1.serializer = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L4b
            return r3
        L4b:
            r6 = 0
            throw r6
        L4d:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1 r6 = (com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1) r6
            r6.invokeSuspend(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$updateCallInitiated$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        getMaxDuration getmaxduration;
        Object obj3;
        getMaxDuration getmaxdurationRemoteActionCompatParcelizer;
        Map mapWrite;
        boolean z;
        boolean z2;
        Long l;
        Long l2;
        IvrState ivrState;
        int i;
        Object obj4;
        getMaxDuration getmaxduration2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        String str = this.write;
        CustomerUnavailableViewModel customerUnavailableViewModel = this.read;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableStateFlow mutableStateFlow = customerUnavailableViewModel.serializer;
            do {
                obj2 = mutableStateFlow.read();
                getmaxduration = (getMaxDuration) obj2;
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, getmaxduration != null ? getMaxDuration.RemoteActionCompatParcelizer(getmaxduration, false, true, null, null, null, CustomerUnavailableViewModel.write(str, getmaxduration.tasksStatus), 125) : null));
            int i4 = RemoteActionCompatParcelizer + 71;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        if (i3 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableStateFlow mutableStateFlow2 = customerUnavailableViewModel.serializer;
            do {
                obj4 = mutableStateFlow2.read();
                getmaxduration2 = (getMaxDuration) obj4;
            } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj4, getmaxduration2 != null ? getMaxDuration.RemoteActionCompatParcelizer(getmaxduration2, false, false, null, null, null, CustomerUnavailableViewModel.write(str, getmaxduration2.tasksStatus), 95) : null));
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        MutableStateFlow mutableStateFlow3 = customerUnavailableViewModel.serializer;
        do {
            obj3 = mutableStateFlow3.read();
            getMaxDuration getmaxduration3 = (getMaxDuration) obj3;
            if (getmaxduration3 != null) {
                int i6 = serializer + 111;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    mapWrite = CustomerUnavailableViewModel.write(str, getmaxduration3.tasksStatus);
                    z = false;
                    z2 = false;
                    l = null;
                    l2 = null;
                    ivrState = null;
                    i = 94;
                } else {
                    mapWrite = CustomerUnavailableViewModel.write(str, getmaxduration3.tasksStatus);
                    z = true;
                    z2 = false;
                    l = null;
                    l2 = null;
                    ivrState = null;
                    i = 126;
                }
                getmaxdurationRemoteActionCompatParcelizer = getMaxDuration.RemoteActionCompatParcelizer(getmaxduration3, z, z2, l, l2, ivrState, mapWrite, i);
            } else {
                getmaxdurationRemoteActionCompatParcelizer = null;
            }
        } while (!mutableStateFlow3.RemoteActionCompatParcelizer(obj3, getmaxdurationRemoteActionCompatParcelizer));
        return createfromparcel;
    }
}
