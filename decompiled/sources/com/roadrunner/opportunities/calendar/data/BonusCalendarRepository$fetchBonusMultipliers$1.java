package com.roadrunner.opportunities.calendar.data;

import androidx.compose.ui.graphics.Fields;
import com.huawei.agconnect.config.impl.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class BonusCalendarRepository$fetchBonusMultipliers$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ m serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BonusCalendarRepository$fetchBonusMultipliers$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4503fetchBonusMultipliers0E7RQCE = this.serializer.m4503fetchBonusMultipliers0E7RQCE(0, null, this);
        if (objM4503fetchBonusMultipliers0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4503fetchBonusMultipliers0E7RQCE);
        }
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 35;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objM4503fetchBonusMultipliers0E7RQCE;
    }
}
