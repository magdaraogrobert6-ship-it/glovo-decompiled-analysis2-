package com.roadrunner.delivery.overdue.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.FocusGroupPropertiesNodeonExit1;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class IssueRepository$reportIssue$1 extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public int IconCompatParcelizer;
    public FocusGroupPropertiesNodeonExit1 read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ IssueRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueRepository$reportIssue$1(IssueRepository issueRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = issueRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4921reportIssueyxL6bBk = this.write.m4921reportIssueyxL6bBk(null, null, null, null, this);
        if (objM4921reportIssueyxL6bBk != CoroutineSingletons.COROUTINE_SUSPENDED) {
            onItemDismiss onitemdismiss = new onItemDismiss(objM4921reportIssueyxL6bBk);
            int i2 = RemoteActionCompatParcelizer + 41;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return onitemdismiss;
        }
        int i4 = RemoteActionCompatParcelizer;
        int i5 = i4 + 63;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 59;
        MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return objM4921reportIssueyxL6bBk;
        }
        throw null;
    }
}
