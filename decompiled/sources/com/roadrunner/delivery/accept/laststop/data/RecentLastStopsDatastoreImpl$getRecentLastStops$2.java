package com.roadrunner.delivery.accept.laststop.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class RecentLastStopsDatastoreImpl$getRecentLastStops$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ RecentLastStopsDatastoreImpl IconCompatParcelizer;
    public final /* synthetic */ int read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecentLastStopsDatastoreImpl$getRecentLastStops$2(RecentLastStopsDatastoreImpl recentLastStopsDatastoreImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = recentLastStopsDatastoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 35;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        RecentLastStopsDatastoreImpl recentLastStopsDatastoreImpl = this.IconCompatParcelizer;
        if (i4 != 0) {
            return new RecentLastStopsDatastoreImpl$getRecentLastStops$2(recentLastStopsDatastoreImpl, shortNewsContentCardView, 1);
        }
        RecentLastStopsDatastoreImpl$getRecentLastStops$2 recentLastStopsDatastoreImpl$getRecentLastStops$2 = new RecentLastStopsDatastoreImpl$getRecentLastStops$2(recentLastStopsDatastoreImpl, shortNewsContentCardView, 0);
        int i5 = RemoteActionCompatParcelizer + 7;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return recentLastStopsDatastoreImpl$getRecentLastStops$2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i2 == 0) {
            Object objInvokeSuspend = ((RecentLastStopsDatastoreImpl$getRecentLastStops$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = RemoteActionCompatParcelizer + 5;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return objInvokeSuspend;
        }
        Object objInvokeSuspend2 = ((RecentLastStopsDatastoreImpl$getRecentLastStops$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = RemoteActionCompatParcelizer + 117;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objInvokeSuspend2;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = r7.read
            com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl r2 = r7.IconCompatParcelizer
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L48
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r6 = r7.write
            if (r6 == 0) goto L26
            if (r6 != r5) goto L22
            int r1 = com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl$getRecentLastStops$2.serializer
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl$getRecentLastStops$2.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L3c
        L22:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r3)
            goto L3e
        L26:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            o.performCustomExitMxy_nc0 r8 = r2.IconCompatParcelizer
            com.roadrunner.auth.data.LocalAuthDataSource$store$2 r3 = new com.roadrunner.auth.data.LocalAuthDataSource$store$2
            r6 = 16
            r3.<init>(r2, r4, r6)
            r7.write = r5
            java.lang.Object r8 = o.pauseWebviewIfNecessarylambda10.serializer(r8, r3, r7)
            if (r8 != r1) goto L3c
            r4 = r1
            goto L3e
        L3c:
            o.createFromParcel r4 = o.createFromParcel.INSTANCE
        L3e:
            int r8 = com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl$getRecentLastStops$2.serializer
            int r8 = r8 + 75
            int r1 = r8 % 128
            com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl$getRecentLastStops$2.RemoteActionCompatParcelizer = r1
            int r8 = r8 % r0
            return r4
        L48:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r6 = r7.write
            if (r6 == 0) goto L67
            if (r6 == r5) goto L63
            if (r6 != r0) goto L5f
            int r1 = com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl$getRecentLastStops$2.serializer
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl$getRecentLastStops$2.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L91
        L5f:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r3)
            goto L98
        L63:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            goto L79
        L67:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r8)
            o.performCustomExitMxy_nc0 r8 = r2.IconCompatParcelizer
            kotlinx.coroutines.flow.Flow r8 = r8.serializer()
            r7.write = r5
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r8, r7)
            if (r8 != r1) goto L79
            goto L8f
        L79:
            o.getNoActiveChildannotations r8 = (o.getNoActiveChildannotations) r8
            if (r8 == 0) goto L96
            o.isRoot r3 = r2.serializer
            java.lang.Object r8 = r8.serializer(r3)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L96
            r7.write = r0
            java.lang.Object r8 = com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl.access$decodeFromJson(r2, r8, r7)
            if (r8 != r1) goto L91
        L8f:
            r4 = r1
            goto L98
        L91:
            r4 = r8
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L98
        L96:
            o.instance_delegatelambda0 r4 = o.instance_delegatelambda0.write
        L98:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl$getRecentLastStops$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
