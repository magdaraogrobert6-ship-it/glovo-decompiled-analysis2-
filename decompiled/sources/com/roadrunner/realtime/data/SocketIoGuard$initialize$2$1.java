package com.roadrunner.realtime.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class SocketIoGuard$initialize$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public int IconCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ SocketIoGuard write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SocketIoGuard$initialize$2$1(SocketIoGuard socketIoGuard, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.write = socketIoGuard;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return new com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1(r2, r6, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = new com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1(r2, r6, r1);
        r6 = com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1.RemoteActionCompatParcelizer + 13;
        com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1.read = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r0 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0 != 0) goto L9;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r5, o.ShortNewsContentCardView r6) {
        /*
            r4 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1.RemoteActionCompatParcelizer
            int r0 = r0 + 37
            int r1 = r0 % 128
            com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1.read = r1
            int r0 = r0 % r5
            r1 = 0
            if (r0 == 0) goto L19
            int r0 = r4.serializer
            com.roadrunner.realtime.data.SocketIoGuard r2 = r4.write
            r3 = 83
            int r3 = r3 / r1
            if (r0 == 0) goto L26
            goto L1f
        L19:
            int r0 = r4.serializer
            com.roadrunner.realtime.data.SocketIoGuard r2 = r4.write
            if (r0 == 0) goto L26
        L1f:
            com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1 r5 = new com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1
            r0 = 1
            r5.<init>(r2, r6, r0)
            return r5
        L26:
            com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1 r0 = new com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1
            r0.<init>(r2, r6, r1)
            int r6 = com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1.RemoteActionCompatParcelizer
            int r6 = r6 + 13
            int r1 = r6 % 128
            com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1.read = r1
            int r6 = r6 % r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.realtime.data.SocketIoGuard$initialize$2$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 != 0) {
            return ((SocketIoGuard$initialize$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((SocketIoGuard$initialize$2$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = read + 57;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.serializer;
        Object obj2 = createFromParcel.INSTANCE;
        SocketIoGuard socketIoGuard = this.write;
        Object obj3 = null;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (SocketIoGuard.access$observeDisconnectedStateAndScheduleReconnect(socketIoGuard, this) != coroutineSingletons) {
                    return obj2;
                }
                int i4 = RemoteActionCompatParcelizer + 93;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return coroutineSingletons;
            }
            int i6 = RemoteActionCompatParcelizer + 49;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i3 != 1 : i3 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.IconCompatParcelizer;
        if (i7 != 0) {
            int i8 = RemoteActionCompatParcelizer + 111;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0 ? i7 != 1 : i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i9 = RemoteActionCompatParcelizer + 9;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.IconCompatParcelizer = 1;
            if (SocketIoGuard.access$observeReconnectionTrigger(socketIoGuard, this) == coroutineSingletons2) {
                obj2 = coroutineSingletons2;
            }
        }
        int i11 = read + 19;
        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
        if (i11 % 2 != 0) {
            return obj2;
        }
        obj3.hashCode();
        throw null;
    }
}
