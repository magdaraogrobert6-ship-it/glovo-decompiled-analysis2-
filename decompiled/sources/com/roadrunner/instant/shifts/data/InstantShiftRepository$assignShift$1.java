package com.roadrunner.instant.shifts.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class InstantShiftRepository$assignShift$1 extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ InstantShiftRepository read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantShiftRepository$assignShift$1(InstantShiftRepository instantShiftRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = instantShiftRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4983assignShiftgIAlus = this.read.m4983assignShiftgIAlus(0, this);
        if (objM4983assignShiftgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4983assignShiftgIAlus);
        }
        int i2 = serializer;
        int i3 = i2 + 121;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 39;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objM4983assignShiftgIAlus;
        }
        throw null;
    }
}
