package com.roadrunner.delivery.stacked.delivery.list;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class StackedDeliveryListUiModelImpl$refreshState$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ StackedDeliveryListUiModelImpl IconCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StackedDeliveryListUiModelImpl$refreshState$1(StackedDeliveryListUiModelImpl stackedDeliveryListUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.IconCompatParcelizer = stackedDeliveryListUiModelImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r0 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return new com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1(r3, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r0 = new com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1(r3, r7, r2);
        r7 = com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.read + 1;
        com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.serializer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0 != 1) goto L11;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r6, o.ShortNewsContentCardView r7) {
        /*
            r5 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.read
            int r0 = r0 + 109
            int r1 = r0 % 128
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.serializer = r1
            int r0 = r0 % r6
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1c
            int r0 = r5.write
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl r3 = r5.IconCompatParcelizer
            r4 = 42
            int r4 = r4 / r1
            if (r0 == 0) goto L38
            if (r0 == r2) goto L2a
            goto L24
        L1c:
            int r0 = r5.write
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl r3 = r5.IconCompatParcelizer
            if (r0 == 0) goto L38
            if (r0 == r2) goto L2a
        L24:
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1 r0 = new com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1
            r0.<init>(r3, r7, r6)
            return r0
        L2a:
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1 r0 = new com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1
            r0.<init>(r3, r7, r2)
            int r7 = com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.read
            int r7 = r7 + r2
            int r1 = r7 % 128
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.serializer = r1
            int r7 = r7 % r6
            return r0
        L38:
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1 r6 = new com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1
            r6.<init>(r3, r7, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 79;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        StackedDeliveryListUiModelImpl stackedDeliveryListUiModelImpl = this.IconCompatParcelizer;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            UpdateStateUseCaseImpl.write(stackedDeliveryListUiModelImpl.PlaybackStateCompat);
            return createfromparcel;
        }
        if (i4 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            BuildersKt.RemoteActionCompatParcelizer(stackedDeliveryListUiModelImpl.read, null, null, new StackedDeliveryListUiModelImpl$refreshState$1(stackedDeliveryListUiModelImpl, null, 0), 3);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        stackedDeliveryListUiModelImpl.RemoteActionCompatParcelizer();
        int i5 = serializer + 29;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        ((com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1) create((o.createFromParcel) r6, (o.ShortNewsContentCardView) r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        ((com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1) create((o.createFromParcel) r6, (o.ShortNewsContentCardView) r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
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
            int r1 = com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.read
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.serializer = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L1c
            int r1 = r5.write
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            r4 = 82
            int r4 = r4 / 0
            if (r1 == 0) goto L40
            if (r1 == r2) goto L32
            goto L24
        L1c:
            int r1 = r5.write
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            if (r1 == 0) goto L40
            if (r1 == r2) goto L32
        L24:
            o.createFromParcel r6 = (o.createFromParcel) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1 r6 = (com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1) r6
            r6.invokeSuspend(r3)
            return r3
        L32:
            o.createFromParcel r6 = (o.createFromParcel) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1 r6 = (com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1) r6
            r6.invokeSuspend(r3)
            return r3
        L40:
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1 r6 = (com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1) r6
            r6.invokeSuspend(r3)
            int r6 = com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.serializer
            int r6 = r6 + 99
            int r7 = r6 % 128
            com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.read = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L5c
            r6 = 47
            int r6 = r6 / 0
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.stacked.delivery.list.StackedDeliveryListUiModelImpl$refreshState$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
