package com.roadrunner.delivery.overdue.data;

import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class IssueDataSource$reportIssue$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ N$b RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueDataSource$reportIssue$1(N$b n$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = n$b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        return new o.onItemDismiss(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (r8 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (r8 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r1 = com.roadrunner.delivery.overdue.data.IssueDataSource$reportIssue$1.serializer + 53;
        com.roadrunner.delivery.overdue.data.IssueDataSource$reportIssue$1.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.overdue.data.IssueDataSource$reportIssue$1.serializer
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.roadrunner.delivery.overdue.data.IssueDataSource$reportIssue$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L2b
            r7.write = r8
            int r8 = r7.read
            r8 = r8 | r2
            r7.read = r8
            com.sentiance.core.model.events.N$b r1 = r7.RemoteActionCompatParcelizer
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r7
            java.lang.Object r8 = r1.m5081reportIssueyxL6bBk(r2, r3, r4, r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2 = 74
            int r2 = r2 / 0
            if (r8 != r1) goto L4b
            goto L41
        L2b:
            r7.write = r8
            int r8 = r7.read
            r8 = r8 | r2
            r7.read = r8
            com.sentiance.core.model.events.N$b r1 = r7.RemoteActionCompatParcelizer
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r7
            java.lang.Object r8 = r1.m5081reportIssueyxL6bBk(r2, r3, r4, r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r8 != r1) goto L4b
        L41:
            int r1 = com.roadrunner.delivery.overdue.data.IssueDataSource$reportIssue$1.serializer
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.roadrunner.delivery.overdue.data.IssueDataSource$reportIssue$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            return r8
        L4b:
            o.onItemDismiss r0 = new o.onItemDismiss
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.overdue.data.IssueDataSource$reportIssue$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
