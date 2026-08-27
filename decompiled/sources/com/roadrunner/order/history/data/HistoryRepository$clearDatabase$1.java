package com.roadrunner.order.history.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryRepository$clearDatabase$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public int IconCompatParcelizer;
    public final /* synthetic */ HistoryRepository serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryRepository$clearDatabase$1(HistoryRepository historyRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = historyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4996clearDatabaseIoAF18A = this.serializer.m4996clearDatabaseIoAF18A(this);
        if (objM4996clearDatabaseIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4996clearDatabaseIoAF18A);
        }
        int i4 = RemoteActionCompatParcelizer;
        int i5 = i4 + 53;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 9;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return objM4996clearDatabaseIoAF18A;
        }
        throw null;
    }
}
