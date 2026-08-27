package com.roadrunner.heatmap.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ValidateAndSaveHeatmapResponseImpl$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public int serializer;
    public final /* synthetic */ ValidateAndSaveHeatmapResponseImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateAndSaveHeatmapResponseImpl$invoke$1(ValidateAndSaveHeatmapResponseImpl validateAndSaveHeatmapResponseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = validateAndSaveHeatmapResponseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4965invokegIAlus = this.write.m4965invokegIAlus(null, this);
        if (objM4965invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = read + 99;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return objM4965invokegIAlus;
            }
            obj2.hashCode();
            throw null;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4965invokegIAlus);
        int i3 = read + 87;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return onitemdismiss;
        }
        throw null;
    }
}
