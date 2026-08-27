package com.roadrunner.push.core.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class PushServiceRepository$registerPushForApplicant$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ PushServiceRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushServiceRepository$registerPushForApplicant$1(PushServiceRepository pushServiceRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = pushServiceRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 27;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5003registerPushForApplicantgIAlus = this.write.m5003registerPushForApplicantgIAlus(null, this);
        if (objM5003registerPushForApplicantgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5003registerPushForApplicantgIAlus);
        }
        int i4 = IconCompatParcelizer + 115;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM5003registerPushForApplicantgIAlus;
        }
        throw null;
    }
}
