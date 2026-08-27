package com.roadrunner.diagnostics.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SendTestPushUseCase$execute$1 extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ SendTestPushUseCase read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendTestPushUseCase$execute$1(SendTestPushUseCase sendTestPushUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = sendTestPushUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SendTestPushUseCase$execute$1 sendTestPushUseCase$execute$1;
        int i = 2 % 2;
        this.IconCompatParcelizer = obj;
        int i2 = this.RemoteActionCompatParcelizer | Integer.MIN_VALUE;
        this.RemoteActionCompatParcelizer = i2;
        boolean z = this instanceof SendTestPushUseCase$execute$1;
        SendTestPushUseCase sendTestPushUseCase = this.read;
        if (!z || (i2 & Integer.MIN_VALUE) == 0) {
            sendTestPushUseCase$execute$1 = new SendTestPushUseCase$execute$1(sendTestPushUseCase, this);
        } else {
            int i3 = serializer + 71;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            this.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            sendTestPushUseCase$execute$1 = this;
        }
        Object obj2 = sendTestPushUseCase$execute$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = sendTestPushUseCase$execute$1.RemoteActionCompatParcelizer;
        Object obj3 = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            throw null;
        }
        if (i5 == 1) {
            int i6 = write + 23;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            obj3 = ((onItemDismiss) obj2).IconCompatParcelizer;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        }
        if (obj3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(obj3);
        }
        int i8 = serializer + 65;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return obj3;
    }
}
