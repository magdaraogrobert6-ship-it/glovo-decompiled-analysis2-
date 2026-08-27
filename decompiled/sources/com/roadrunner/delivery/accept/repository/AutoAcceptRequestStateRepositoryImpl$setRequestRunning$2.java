package com.roadrunner.delivery.accept.repository;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2(boolean z, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 65;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = 0;
        if (this.IconCompatParcelizer == 0) {
            AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2 autoAcceptRequestStateRepositoryImpl$setRequestRunning$2 = new AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2(this.write, shortNewsContentCardView, i4);
            autoAcceptRequestStateRepositoryImpl$setRequestRunning$2.read = obj;
            return autoAcceptRequestStateRepositoryImpl$setRequestRunning$2;
        }
        AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2 autoAcceptRequestStateRepositoryImpl$setRequestRunning$3 = new AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2(this.write, shortNewsContentCardView, 1);
        autoAcceptRequestStateRepositoryImpl$setRequestRunning$3.read = obj;
        int i5 = RemoteActionCompatParcelizer + 85;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return autoAcceptRequestStateRepositoryImpl$setRequestRunning$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            ((AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        ((AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2) create(backwardfocussearch, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 79;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return createfromparcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7);
        r4.write(com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl.serializer, java.lang.Boolean.valueOf(r3));
        r7 = com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2.serializer + 45;
        com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2.RemoteActionCompatParcelizer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if ((r7 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        r7 = null;
        r7.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7);
        r4.write(o.weight.read, java.lang.Boolean.valueOf(r3));
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2.RemoteActionCompatParcelizer
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2.serializer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1f
            int r1 = r6.IconCompatParcelizer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            boolean r3 = r6.write
            java.lang.Object r4 = r6.read
            o.backwardFocusSearch r4 = (o.backwardFocusSearch) r4
            r5 = 10
            int r5 = r5 / 0
            if (r1 == 0) goto L3a
            goto L2b
        L1f:
            int r1 = r6.IconCompatParcelizer
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            boolean r3 = r6.write
            java.lang.Object r4 = r6.read
            o.backwardFocusSearch r4 = (o.backwardFocusSearch) r4
            if (r1 == 0) goto L3a
        L2b:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            o.isRoot r7 = o.weight.read
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r4.write(r7, r0)
            return r2
        L3a:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            o.isRoot r7 = com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl.serializer
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r4.write(r7, r1)
            int r7 = com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2.serializer
            int r7 = r7 + 45
            int r1 = r7 % 128
            com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2.RemoteActionCompatParcelizer = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L54
            return r2
        L54:
            r7 = 0
            r7.hashCode()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.repository.AutoAcceptRequestStateRepositoryImpl$setRequestRunning$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
