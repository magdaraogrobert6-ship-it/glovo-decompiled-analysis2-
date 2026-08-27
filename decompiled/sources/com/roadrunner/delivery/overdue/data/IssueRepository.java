package com.roadrunner.delivery.overdue.data;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.FocusGroupPropertiesNodeonExit1;
import o.onItemDismiss;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class IssueRepository {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final N$b write;

    public IssueRepository(N$b n$b) {
        n$b.getClass();
        this.write = n$b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: reportIssue-yxL6bBk, reason: not valid java name */
    public final Object m4921reportIssueyxL6bBk(String str, String str2, String str3, FocusGroupPropertiesNodeonExit1 focusGroupPropertiesNodeonExit1, ContinuationImpl continuationImpl) {
        IssueRepository$reportIssue$1 issueRepository$reportIssue$1;
        Object objM5081reportIssueyxL6bBk;
        int i = 2 % 2;
        if (continuationImpl instanceof IssueRepository$reportIssue$1) {
            issueRepository$reportIssue$1 = (IssueRepository$reportIssue$1) continuationImpl;
            int i2 = issueRepository$reportIssue$1.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                issueRepository$reportIssue$1.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                issueRepository$reportIssue$1 = new IssueRepository$reportIssue$1(this, continuationImpl);
                int i3 = serializer + 65;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        } else {
            issueRepository$reportIssue$1 = new IssueRepository$reportIssue$1(this, continuationImpl);
            int i5 = serializer + 65;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        IssueRepository$reportIssue$1 issueRepository$reportIssue$2 = issueRepository$reportIssue$1;
        int i7 = RemoteActionCompatParcelizer + 79;
        serializer = i7 % Fields.SpotShadowColor;
        Object obj = null;
        if (i7 % 2 != 0) {
            Object obj2 = issueRepository$reportIssue$2.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = issueRepository$reportIssue$2.IconCompatParcelizer;
            throw null;
        }
        Object obj3 = issueRepository$reportIssue$2.serializer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = issueRepository$reportIssue$2.IconCompatParcelizer;
        if (i9 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            issueRepository$reportIssue$2.read = focusGroupPropertiesNodeonExit1;
            issueRepository$reportIssue$2.IconCompatParcelizer = 1;
            objM5081reportIssueyxL6bBk = this.write.m5081reportIssueyxL6bBk(str, str2, str3, focusGroupPropertiesNodeonExit1, issueRepository$reportIssue$2);
            if (objM5081reportIssueyxL6bBk == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i10 = RemoteActionCompatParcelizer + 31;
                serializer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            focusGroupPropertiesNodeonExit1 = issueRepository$reportIssue$2.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            objM5081reportIssueyxL6bBk = ((onItemDismiss) obj3).IconCompatParcelizer;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM5081reportIssueyxL6bBk);
        if (thSerializer != null) {
            int i11 = RemoteActionCompatParcelizer + 15;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            Timber.RemoteActionCompatParcelizer.read(thSerializer, c8$$ExternalSyntheticOutline0.m("reportIssue is failed for ", focusGroupPropertiesNodeonExit1.deliveryIds), new Object[0]);
            int i13 = serializer + 83;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        return objM5081reportIssueyxL6bBk;
    }
}
