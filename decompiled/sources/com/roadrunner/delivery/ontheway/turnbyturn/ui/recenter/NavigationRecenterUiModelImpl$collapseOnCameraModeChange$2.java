package com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCenterPIaL0Z0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.serialize;

/* JADX INFO: loaded from: classes3.dex */
public final class NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getCenterPIaL0Z0 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2(getCenterPIaL0Z0 getcenterpial0z0, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = getcenterpial0z0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        getCenterPIaL0Z0 getcenterpial0z0 = this.write;
        int i3 = 0;
        if (i2 != 0) {
            NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2 navigationRecenterUiModelImpl$collapseOnCameraModeChange$2 = new NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2(getcenterpial0z0, shortNewsContentCardView, 1);
            int i4 = serializer + 99;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
            return navigationRecenterUiModelImpl$collapseOnCameraModeChange$2;
        }
        NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2 navigationRecenterUiModelImpl$collapseOnCameraModeChange$3 = new NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2(getcenterpial0z0, shortNewsContentCardView, i3);
        int i6 = read + 77;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return navigationRecenterUiModelImpl$collapseOnCameraModeChange$3;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 43;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            ((NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2) create((serialize) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2) create((createFromParcel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        int i5 = serializer + 29;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return createfromparcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r9.read() == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r1 = r4.MediaDescriptionCompat.RemoteActionCompatParcelizer;
        kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r1.write, null, null, new com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger$logNavigationArrival$1(r1, null, 7), 3);
        r1 = com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter.NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2.serializer + 23;
        com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter.NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2.read = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r9.IconCompatParcelizer((java.lang.String) r4.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r9);
        r4.read.IconCompatParcelizer(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r9);
        r9 = r4.read;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter.NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2.serializer
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter.NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2.read = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1c
            int r1 = r8.IconCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getCenterPIaL0Z0 r4 = r8.write
            r5 = 19
            int r5 = r5 / 0
            if (r1 == 0) goto L57
            goto L24
        L1c:
            int r1 = r8.IconCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getCenterPIaL0Z0 r4 = r8.write
            if (r1 == 0) goto L57
        L24:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            kotlinx.coroutines.flow.MutableStateFlow r9 = r4.read
            java.lang.Object r1 = r9.read()
            if (r1 == 0) goto L32
            goto L4b
        L32:
            o.getLooseusljTpc r1 = r4.MediaDescriptionCompat
            com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger r1 = r1.RemoteActionCompatParcelizer
            o.getContentViewGroupParentLayout r5 = r1.write
            com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger$logNavigationArrival$1 r6 = new com.roadrunner.delivery.ontheway.turnbyturn.analytics.loggers.TurnByTurnNavigationLogger$logNavigationArrival$1
            r7 = 7
            r6.<init>(r1, r2, r7)
            r1 = 3
            kotlinx.coroutines.BuildersKt.RemoteActionCompatParcelizer(r5, r2, r2, r6, r1)
            int r1 = com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter.NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2.serializer
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter.NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2.read = r2
            int r1 = r1 % r0
        L4b:
            o.isAdapterPositionOnScreen r0 = r4.MediaMetadataCompat
            java.lang.Object r0 = r0.MediaSessionCompatResultReceiverWrapper()
            java.lang.String r0 = (java.lang.String) r0
            r9.IconCompatParcelizer(r0)
            return r3
        L57:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            kotlinx.coroutines.flow.MutableStateFlow r9 = r4.read
            r9.IconCompatParcelizer(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.turnbyturn.ui.recenter.NavigationRecenterUiModelImpl$collapseOnCameraModeChange$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
