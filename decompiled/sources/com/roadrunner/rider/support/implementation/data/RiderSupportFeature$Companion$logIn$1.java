package com.roadrunner.rider.support.implementation.data;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class RiderSupportFeature$Companion$logIn$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public Throwable RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ Context serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiderSupportFeature$Companion$logIn$1(Context context, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        RiderSupportFeature$Companion$logIn$1 riderSupportFeature$Companion$logIn$1 = new RiderSupportFeature$Companion$logIn$1(this.serializer, shortNewsContentCardView);
        int i2 = IconCompatParcelizer + 107;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return riderSupportFeature$Companion$logIn$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 47;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((RiderSupportFeature$Companion$logIn$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = write + 47;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(com.deliveryhero.fwf_http.ConstantKt.DEFAULT_REQUEST_TIMEOUT, r12) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d1, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(com.deliveryhero.fwf_http.ConstantKt.DEFAULT_REQUEST_TIMEOUT, r12) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e4, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(com.deliveryhero.fwf_http.ConstantKt.DEFAULT_REQUEST_TIMEOUT, r12) == r1) goto L54;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.support.implementation.data.RiderSupportFeature$Companion$logIn$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
