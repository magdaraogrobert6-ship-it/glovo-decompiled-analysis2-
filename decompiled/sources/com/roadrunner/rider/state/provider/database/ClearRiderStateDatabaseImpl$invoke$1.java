package com.roadrunner.rider.state.provider.database;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ClearRiderStateDatabaseImpl$invoke$1 extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ClearRiderStateDatabaseImpl read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearRiderStateDatabaseImpl$invoke$1(ClearRiderStateDatabaseImpl clearRiderStateDatabaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = clearRiderStateDatabaseImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        r0 = 2 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return new o.onItemDismiss(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r1 = com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl$invoke$1.write + 91;
        com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl$invoke$1.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl$invoke$1.write
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl$invoke$1.serializer = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L26
            r3.IconCompatParcelizer = r4
            int r4 = r3.RemoteActionCompatParcelizer
            r4 = r4 | r2
            r3.RemoteActionCompatParcelizer = r4
            com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl r4 = r3.read
            java.lang.Object r4 = r4.m5030invokeIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 98
            int r2 = r2 / 0
            if (r4 != r1) goto L45
            goto L37
        L26:
            r3.IconCompatParcelizer = r4
            int r4 = r3.RemoteActionCompatParcelizer
            r4 = r4 | r2
            r3.RemoteActionCompatParcelizer = r4
            com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl r4 = r3.read
            java.lang.Object r4 = r4.m5030invokeIoAF18A(r3)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r4 != r1) goto L45
        L37:
            int r1 = com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl$invoke$1.write
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl$invoke$1.serializer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L44
            int r0 = r0 / 0
        L44:
            return r4
        L45:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.state.provider.database.ClearRiderStateDatabaseImpl$invoke$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
