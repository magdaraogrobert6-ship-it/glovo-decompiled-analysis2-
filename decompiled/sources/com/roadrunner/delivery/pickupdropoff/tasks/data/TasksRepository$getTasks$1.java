package com.roadrunner.delivery.pickupdropoff.tasks.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class TasksRepository$getTasks$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ TasksRepository read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TasksRepository$getTasks$1(TasksRepository tasksRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = tasksRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 93;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4936getTasks0E7RQCE$implementation = this.read.m4936getTasks0E7RQCE$implementation(0L, null, this);
        if (objM4936getTasks0E7RQCE$implementation == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = IconCompatParcelizer + 13;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 35 / 0;
            }
            return objM4936getTasks0E7RQCE$implementation;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4936getTasks0E7RQCE$implementation);
        int i6 = IconCompatParcelizer + 115;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return onitemdismiss;
        }
        obj2.hashCode();
        throw null;
    }
}
