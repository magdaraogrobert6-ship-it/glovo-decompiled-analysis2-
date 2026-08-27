package androidx.compose.material3;

import androidx.compose.animation.core.SuspendAnimationKt;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.Arrangement;
import o.ShortNewsContentCardView;
import o.cancelAutofillForNode;
import o.cancelPendingWebViewPauselambda0;
import o.createFromParcel;
import o.getAutofillTree;
import o.getTextValue;
import o.listValue;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;

/* JADX INFO: loaded from: classes.dex */
public final class SheetState$animateTo$2 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    public final /* synthetic */ float IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final /* synthetic */ SheetState MediaMetadataCompat;
    public /* synthetic */ getAutofillTree RemoteActionCompatParcelizer;
    public /* synthetic */ getTextValue read;
    public /* synthetic */ listValue serializer;
    public final /* synthetic */ Arrangement write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SheetState$animateTo$2(SheetState sheetState, float f, Arrangement arrangement, ShortNewsContentCardView shortNewsContentCardView) {
        super(4, shortNewsContentCardView);
        this.MediaMetadataCompat = sheetState;
        this.IconCompatParcelizer = f;
        this.write = arrangement;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.IconCompatParcelizer;
        Arrangement arrangement = this.write;
        SheetState$animateTo$2 sheetState$animateTo$2 = new SheetState$animateTo$2(this.MediaMetadataCompat, f, arrangement, (ShortNewsContentCardView) obj4);
        sheetState$animateTo$2.read = (getTextValue) obj;
        sheetState$animateTo$2.serializer = (listValue) obj2;
        sheetState$animateTo$2.RemoteActionCompatParcelizer = (getAutofillTree) obj3;
        return sheetState$animateTo$2.invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.MediaBrowserCompatMediaItem;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getTextValue gettextvalue = this.read;
            float f = this.serializer.read(this.RemoteActionCompatParcelizer);
            if (!Float.isNaN(f)) {
                int i2 = 0;
                cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0 = new cancelPendingWebViewPauselambda0(0);
                SheetState sheetState = this.MediaMetadataCompat;
                float fSerializer = Float.isNaN(sheetState.IconCompatParcelizer.serializer()) ? 0.0f : sheetState.IconCompatParcelizer.serializer();
                cancelpendingwebviewpauselambda0.write = fSerializer;
                cancelAutofillForNode cancelautofillfornode = new cancelAutofillForNode(gettextvalue, cancelpendingwebviewpauselambda0, i2);
                this.read = null;
                this.serializer = null;
                this.MediaBrowserCompatMediaItem = 1;
                if (SuspendAnimationKt.animate(fSerializer, f, this.IconCompatParcelizer, this.write, cancelautofillfornode, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }
}
