package com.roadrunner.helpcenter.data.unread_message_count.repo;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.login.logging.RouterLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes4.dex */
public final class UnreadMessageRepository$getUnreadMessageCount$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ RouterLogger serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreadMessageRepository$getUnreadMessageCount$1(RouterLogger routerLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = routerLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4989getUnreadMessageCountgIAlus = this.serializer.m4989getUnreadMessageCountgIAlus(null, this);
        if (objM4989getUnreadMessageCountgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            onItemDismiss onitemdismiss = new onItemDismiss(objM4989getUnreadMessageCountgIAlus);
            int i4 = RemoteActionCompatParcelizer + 117;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return onitemdismiss;
        }
        int i6 = RemoteActionCompatParcelizer + 39;
        int i7 = i6 % Fields.SpotShadowColor;
        write = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 57;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return objM4989getUnreadMessageCountgIAlus;
    }
}
