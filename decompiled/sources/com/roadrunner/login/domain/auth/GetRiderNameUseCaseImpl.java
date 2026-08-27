package com.roadrunner.login.domain.auth;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.TransactionWrapper;
import o.getTextSelectionRange;

/* JADX INFO: loaded from: classes3.dex */
public final class GetRiderNameUseCaseImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final GetUserDataUseCaseImpl serializer;

    public GetRiderNameUseCaseImpl(GetUserDataUseCaseImpl getUserDataUseCaseImpl) {
        getUserDataUseCaseImpl.getClass();
        this.serializer = getUserDataUseCaseImpl;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031 A[PHI: r1 r3
  0x0031: PHI (r1v14 o.TransactionWrapper) = (r1v13 o.TransactionWrapper), (r1v16 o.TransactionWrapper) binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r3v3 int) = (r3v2 int), (r3v5 int) binds: [B:10:0x002f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    public final Object invoke(ContinuationImpl continuationImpl) {
        TransactionWrapper transactionWrapper;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 103;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (continuationImpl instanceof TransactionWrapper) {
            int i6 = i3 + 15;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                transactionWrapper = (TransactionWrapper) continuationImpl;
                i = transactionWrapper.read;
                int i7 = 5 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    transactionWrapper.read = i - Integer.MIN_VALUE;
                } else {
                    transactionWrapper = new TransactionWrapper(this, continuationImpl);
                }
            } else {
                transactionWrapper = (TransactionWrapper) continuationImpl;
                i = transactionWrapper.read;
                if ((i & Integer.MIN_VALUE) != 0) {
                    transactionWrapper.read = i - Integer.MIN_VALUE;
                } else {
                    transactionWrapper = new TransactionWrapper(this, continuationImpl);
                }
            }
        } else {
            transactionWrapper = new TransactionWrapper(this, continuationImpl);
        }
        Object objInvoke = transactionWrapper.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = transactionWrapper.read;
        if (i8 != 0) {
            int i9 = IconCompatParcelizer + 95;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0 ? i8 != 1 : i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            int i10 = IconCompatParcelizer + 93;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            transactionWrapper.read = 1;
            objInvoke = this.serializer.invoke(transactionWrapper);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return ((getTextSelectionRange) objInvoke).PlaybackStateCompat;
    }
}
