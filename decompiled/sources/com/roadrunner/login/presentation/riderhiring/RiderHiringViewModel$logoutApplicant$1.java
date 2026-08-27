package com.roadrunner.login.presentation.riderhiring;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.bc;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderHiringViewModel$logoutApplicant$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public final /* synthetic */ bc read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RiderHiringViewModel$logoutApplicant$1(bc bcVar, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.read = bcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        bc bcVar = this.read;
        Object obj2 = null;
        if (i3 == 0) {
            RiderHiringViewModel$logoutApplicant$1 riderHiringViewModel$logoutApplicant$1 = new RiderHiringViewModel$logoutApplicant$1(bcVar, shortNewsContentCardView, 0);
            int i4 = RemoteActionCompatParcelizer + 53;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return riderHiringViewModel$logoutApplicant$1;
            }
            obj2.hashCode();
            throw null;
        }
        int i5 = 1;
        if (i3 == 1) {
            return new RiderHiringViewModel$logoutApplicant$1(bcVar, shortNewsContentCardView, i5);
        }
        if (i3 == 2) {
            return new RiderHiringViewModel$logoutApplicant$1(bcVar, shortNewsContentCardView, i);
        }
        int i6 = 3;
        if (i3 == 3) {
            return new RiderHiringViewModel$logoutApplicant$1(bcVar, shortNewsContentCardView, i6);
        }
        RiderHiringViewModel$logoutApplicant$1 riderHiringViewModel$logoutApplicant$2 = new RiderHiringViewModel$logoutApplicant$1(bcVar, shortNewsContentCardView, 4);
        int i7 = serializer + 87;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return riderHiringViewModel$logoutApplicant$2;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 == 0) {
            return ((RiderHiringViewModel$logoutApplicant$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i2 == 1) {
            return ((RiderHiringViewModel$logoutApplicant$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object obj3 = null;
        if (i2 == 2) {
            Object objInvokeSuspend = ((RiderHiringViewModel$logoutApplicant$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = serializer + 23;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj3.hashCode();
            throw null;
        }
        if (i2 != 3) {
            return ((RiderHiringViewModel$logoutApplicant$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend2 = ((RiderHiringViewModel$logoutApplicant$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i4 = RemoteActionCompatParcelizer + 37;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend2;
        }
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x0103  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
    
        if (r11 == r1) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.riderhiring.RiderHiringViewModel$logoutApplicant$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
