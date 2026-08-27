package androidx.compose.foundation.gestures;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.HeightInLinesNode;
import o.ShortNewsContentCardView;
import o.TextFieldCursor_androidKt;
import o.createFromParcel;
import o.getContentCaptureSessionui;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableKt$animateTo$4 extends SuspendLambda implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    public /* synthetic */ Object IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public /* synthetic */ TextFieldCursor_androidKt RemoteActionCompatParcelizer;
    public final /* synthetic */ AnchoredDraggableState read;
    public /* synthetic */ HeightInLinesNode serializer;
    public final /* synthetic */ o.TrackpadScrollingLogic write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$4(AnchoredDraggableState anchoredDraggableState, o.TrackpadScrollingLogic trackpadScrollingLogic, ShortNewsContentCardView shortNewsContentCardView) {
        super(4, shortNewsContentCardView);
        this.read = anchoredDraggableState;
        this.write = trackpadScrollingLogic;
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(this.read, this.write, (ShortNewsContentCardView) obj4);
        anchoredDraggableKt$animateTo$4.serializer = (HeightInLinesNode) obj;
        anchoredDraggableKt$animateTo$4.RemoteActionCompatParcelizer = (TextFieldCursor_androidKt) obj2;
        anchoredDraggableKt$animateTo$4.IconCompatParcelizer = obj3;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.MediaBrowserCompatMediaItem;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            HeightInLinesNode heightInLinesNode = this.serializer;
            TextFieldCursor_androidKt textFieldCursor_androidKt = this.RemoteActionCompatParcelizer;
            Object obj2 = this.IconCompatParcelizer;
            AnchoredDraggableState anchoredDraggableState = this.read;
            float fSerializer = ((getContentCaptureSessionui) anchoredDraggableState.MediaBrowserCompatMediaItem).serializer();
            this.serializer = null;
            this.RemoteActionCompatParcelizer = null;
            this.MediaBrowserCompatMediaItem = 1;
            if (AnchoredDraggableKt.access$animateTo(anchoredDraggableState, fSerializer, heightInLinesNode, textFieldCursor_androidKt, obj2, this.write, this) == coroutineSingletons) {
                return coroutineSingletons;
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
