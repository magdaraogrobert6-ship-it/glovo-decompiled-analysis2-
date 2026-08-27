package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerUnavailableViewModel$initState$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ CustomerUnavailableViewModel read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerUnavailableViewModel$initState$1(CustomerUnavailableViewModel customerUnavailableViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.read = customerUnavailableViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 83;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        CustomerUnavailableViewModel customerUnavailableViewModel = this.read;
        if (i4 == 0) {
            return new CustomerUnavailableViewModel$initState$1(customerUnavailableViewModel, shortNewsContentCardView, 0);
        }
        int i5 = 1;
        if (i4 == 1) {
            return new CustomerUnavailableViewModel$initState$1(customerUnavailableViewModel, shortNewsContentCardView, i5);
        }
        if (i4 == 2) {
            return new CustomerUnavailableViewModel$initState$1(customerUnavailableViewModel, shortNewsContentCardView, i);
        }
        int i6 = 3;
        if (i4 == 3) {
            return new CustomerUnavailableViewModel$initState$1(customerUnavailableViewModel, shortNewsContentCardView, i6);
        }
        int i7 = 4;
        if (i4 == 4) {
            return new CustomerUnavailableViewModel$initState$1(customerUnavailableViewModel, shortNewsContentCardView, i7);
        }
        CustomerUnavailableViewModel$initState$1 customerUnavailableViewModel$initState$1 = new CustomerUnavailableViewModel$initState$1(customerUnavailableViewModel, shortNewsContentCardView, 5);
        int i8 = IconCompatParcelizer + 55;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return customerUnavailableViewModel$initState$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 55;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((CustomerUnavailableViewModel$initState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 == 1) {
            return ((CustomerUnavailableViewModel$initState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 == 2) {
            return ((CustomerUnavailableViewModel$initState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 != 3) {
            return i4 != 4 ? ((CustomerUnavailableViewModel$initState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((CustomerUnavailableViewModel$initState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((CustomerUnavailableViewModel$initState$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = IconCompatParcelizer + 37;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x044b, code lost:
    
        if (r1 == r0) goto L237;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 1131
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel$initState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
