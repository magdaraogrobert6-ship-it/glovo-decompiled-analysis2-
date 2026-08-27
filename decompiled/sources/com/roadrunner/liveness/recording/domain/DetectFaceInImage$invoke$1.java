package com.roadrunner.liveness.recording.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.FeatureCombinationQueryImplExternalSyntheticLambda2;
import o.onItemDismiss;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class DetectFaceInImage$invoke$1 extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ FormBody.Builder IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetectFaceInImage$invoke$1(FormBody.Builder builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 13;
        read = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.m5157invokegIAlus((FeatureCombinationQueryImplExternalSyntheticLambda2) null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM5157invokegIAlus = this.IconCompatParcelizer.m5157invokegIAlus((FeatureCombinationQueryImplExternalSyntheticLambda2) null, this);
        if (objM5157invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM5157invokegIAlus);
        }
        int i3 = serializer + 117;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 9 / 0;
        }
        return objM5157invokegIAlus;
    }
}
