package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.mapper;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.AmountTextInputState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.CalculatorState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferButtonState;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeViewState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.openSessionlambda1;
import o.r8lambda2nqU30QZRcXKrMiZfMd0NFoe95Q;
import o.r8lambdaEH6JkTefaTFFm8vtM3ckzQ8RLxw;
import o.r8lambdaQr9o1sD2sFcQv5PQz66nKB1Wzkg;
import o.r8lambdaUXVkaZAuUQGBNIXILrAHYRyC1qs;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdariYSjVayzlYnf6n5A5_kREM1s;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class TransferChangeViewStateMapper$map$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ SignInDataStore RemoteActionCompatParcelizer;
    public final /* synthetic */ double read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ r8lambdaUXVkaZAuUQGBNIXILrAHYRyC1qs write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferChangeViewStateMapper$map$2(r8lambdaUXVkaZAuUQGBNIXILrAHYRyC1qs r8lambdauxvkazauuqgbnixilrahyryc1qs, SignInDataStore signInDataStore, double d, String str, String str2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.write = r8lambdauxvkazauuqgbnixilrahyryc1qs;
        this.RemoteActionCompatParcelizer = signInDataStore;
        this.read = d;
        this.IconCompatParcelizer = str;
        this.serializer = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        TransferChangeViewStateMapper$map$2 transferChangeViewStateMapper$map$2 = new TransferChangeViewStateMapper$map$2(this.write, this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer, this.serializer, shortNewsContentCardView);
        int i2 = MediaSessionCompatQueueItem + 89;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return transferChangeViewStateMapper$map$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 81;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((TransferChangeViewStateMapper$map$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaSessionCompatQueueItem + 57;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strSerializer;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 73;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        r8lambdaUXVkaZAuUQGBNIXILrAHYRyC1qs r8lambdauxvkazauuqgbnixilrahyryc1qs = this.write;
        boolean z4 = r8lambdauxvkazauuqgbnixilrahyryc1qs instanceof r8lambdariYSjVayzlYnf6n5A5_kREM1s;
        SignInDataStore signInDataStore = this.RemoteActionCompatParcelizer;
        boolean z5 = true;
        boolean z6 = false;
        if (!z4) {
            if (r8lambdauxvkazauuqgbnixilrahyryc1qs instanceof r8lambda2nqU30QZRcXKrMiZfMd0NFoe95Q) {
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) signInDataStore.serializer;
                openSessionlambda1 opensessionlambda1 = (openSessionlambda1) signInDataStore.RemoteActionCompatParcelizer;
                str = settransactionsuccessful.read(R.string.transfer_change_invalid_amount_error_message, opensessionlambda1.serializer(this.read, opensessionlambda1.serializer.read.write().currency, false));
                z3 = true;
                z5 = false;
                z2 = false;
            } else if (r8lambdauxvkazauuqgbnixilrahyryc1qs instanceof r8lambdaEH6JkTefaTFFm8vtM3ckzQ8RLxw) {
                str = "";
                z2 = true;
                z3 = true;
                z5 = false;
            } else {
                if (!(r8lambdauxvkazauuqgbnixilrahyryc1qs instanceof r8lambdaQr9o1sD2sFcQv5PQz66nKB1Wzkg)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                strSerializer = this.IconCompatParcelizer;
                z = true;
            }
            strSerializer = "--";
            signInDataStore.getClass();
            return new TransferChangeViewState(new AmountTextInputState(this.serializer, z3, z2, z3, str), new CalculatorState(strSerializer, i, z6), new TransferButtonState(z5));
        }
        int i5 = MediaDescriptionCompat + 43;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        openSessionlambda1 opensessionlambda2 = (openSessionlambda1) signInDataStore.RemoteActionCompatParcelizer;
        strSerializer = opensessionlambda2.serializer(((r8lambdariYSjVayzlYnf6n5A5_kREM1s) r8lambdauxvkazauuqgbnixilrahyryc1qs).IconCompatParcelizer, opensessionlambda2.serializer.read.write().currency, false);
        z = false;
        str = "";
        z2 = false;
        z3 = false;
        z6 = z;
        signInDataStore.getClass();
        return new TransferChangeViewState(new AmountTextInputState(this.serializer, z3, z2, z3, str), new CalculatorState(strSerializer, i, z6), new TransferButtonState(z5));
    }
}
