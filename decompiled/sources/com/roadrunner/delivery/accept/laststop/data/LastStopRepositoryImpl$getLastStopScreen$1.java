package com.roadrunner.delivery.accept.laststop.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class LastStopRepositoryImpl$getLastStopScreen$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public int read;
    public final /* synthetic */ LastStopRepositoryImpl serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LastStopRepositoryImpl$getLastStopScreen$1(LastStopRepositoryImpl lastStopRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = lastStopRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            this.serializer.m4902getLastStopScreengIAlus(null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4902getLastStopScreengIAlus = this.serializer.m4902getLastStopScreengIAlus(null, this);
        if (objM4902getLastStopScreengIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4902getLastStopScreengIAlus);
        }
        int i3 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objM4902getLastStopScreengIAlus;
        }
        throw null;
    }
}
