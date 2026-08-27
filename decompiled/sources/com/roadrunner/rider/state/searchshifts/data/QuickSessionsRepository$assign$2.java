package com.roadrunner.rider.state.searchshifts.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.PurchaseVerificationHandler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.readPayloadFromJsonString;

/* JADX INFO: loaded from: classes3.dex */
public final class QuickSessionsRepository$assign$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ QuickSessionsRepository MediaBrowserCompatMediaItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ String serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickSessionsRepository$assign$2(QuickSessionsRepository quickSessionsRepository, int i, int i2, String str, String str2, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.MediaBrowserCompatMediaItem = quickSessionsRepository;
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
        this.serializer = str;
        this.IconCompatParcelizer = str2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 31;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((QuickSessionsRepository$assign$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        }
        ((QuickSessionsRepository$assign$2) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        QuickSessionsRepository$assign$2 quickSessionsRepository$assign$2 = new QuickSessionsRepository$assign$2(this.MediaBrowserCompatMediaItem, this.RemoteActionCompatParcelizer, this.read, this.serializer, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = RatingCompat + 13;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return quickSessionsRepository$assign$2;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.write;
        if (i3 != 0) {
            if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        readPayloadFromJsonString readpayloadfromjsonstring = (readPayloadFromJsonString) this.MediaBrowserCompatMediaItem.serializer.write();
        PurchaseVerificationHandler purchaseVerificationHandler = new PurchaseVerificationHandler(this.RemoteActionCompatParcelizer, this.serializer, this.read, this.IconCompatParcelizer);
        this.write = 1;
        Object objSerializer = readpayloadfromjsonstring.serializer(purchaseVerificationHandler, this);
        if (objSerializer != coroutineSingletons2) {
            return objSerializer;
        }
        int i4 = RatingCompat + 125;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return coroutineSingletons2;
    }
}
