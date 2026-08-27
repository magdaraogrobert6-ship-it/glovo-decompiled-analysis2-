package com.roadrunner.diagnostics.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class NotificationsDiagnosticsRepository$sendTestPush$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ NotificationsDiagnosticsRepository serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDiagnosticsRepository$sendTestPush$1(NotificationsDiagnosticsRepository notificationsDiagnosticsRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = notificationsDiagnosticsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 119;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.serializer.m4953sendTestPush0E7RQCE(null, null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4953sendTestPush0E7RQCE = this.serializer.m4953sendTestPush0E7RQCE(null, null, this);
        if (objM4953sendTestPush0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4953sendTestPush0E7RQCE);
        }
        int i3 = write + 1;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objM4953sendTestPush0E7RQCE;
    }
}
