package com.roadrunner.delivery.pickupdropoff.tasks.api.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.firstOrNull;
import o.r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class ConfirmationRepository$initiateTransferChange$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ ConfirmationRepository IconCompatParcelizer;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public int serializer;
    public final /* synthetic */ long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationRepository$initiateTransferChange$2(ConfirmationRepository confirmationRepository, long j, long j2, long j3, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.IconCompatParcelizer = confirmationRepository;
        this.read = j;
        this.write = j2;
        this.RemoteActionCompatParcelizer = j3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        ConfirmationRepository$initiateTransferChange$2 confirmationRepository$initiateTransferChange$2 = new ConfirmationRepository$initiateTransferChange$2(this.IconCompatParcelizer, this.read, this.write, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        int i2 = MediaSessionCompatQueueItem + 93;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return confirmationRepository$initiateTransferChange$2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 5;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((ConfirmationRepository$initiateTransferChange$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
            throw null;
        }
        Object objInvokeSuspend = ((ConfirmationRepository$initiateTransferChange$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = MediaSessionCompatQueueItem + 49;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 93;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.serializer;
        if (i3 != 0) {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i4 = MediaSessionCompatQueueItem + 91;
            RatingCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return obj;
            }
            obj2.hashCode();
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        r8lambdaO8CxgYAEJdvf6QoO3mkJZSui8c r8lambdao8cxgyaejdvf6qoo3mkjzsui8c = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
        firstOrNull firstornull = new firstOrNull(this.write, this.RemoteActionCompatParcelizer);
        this.serializer = 1;
        Object objSerializer = r8lambdao8cxgyaejdvf6qoo3mkjzsui8c.serializer(this.read, firstornull, this);
        if (objSerializer != coroutineSingletons2) {
            return objSerializer;
        }
        int i5 = RatingCompat + 23;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return coroutineSingletons2;
        }
        obj2.hashCode();
        throw null;
    }
}
