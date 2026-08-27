package o;

import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldKt implements BottomSheetDefaults {
    public final /* synthetic */ CoroutineLiveData$$ExternalSyntheticLambda0 RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final /* synthetic */ androidx.compose.foundation.gestures.AnchoredDraggableState write;

    @Override // o.BottomSheetDefaults
    public final float calculateApproachOffset(float f, float f2) {
        return 0.0f;
    }

    @Override // o.BottomSheetDefaults
    public final float calculateSnapOffset(float f) {
        androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState = this.write;
        float fWrite = anchoredDraggableState.write();
        Object value = androidx.compose.foundation.gestures.AnchoredDraggableKt.read(anchoredDraggableState.IconCompatParcelizer(), fWrite, f, this.serializer, this.RemoteActionCompatParcelizer);
        if (!((Boolean) anchoredDraggableState.serializer.invoke(value)).booleanValue()) {
            value = ((onShowTranslationui) anchoredDraggableState.PlaybackStateCompat).getValue();
        }
        return anchoredDraggableState.IconCompatParcelizer().serializer(value) - fWrite;
    }

    public CoreTextFieldKt(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, CoroutineLiveData$$ExternalSyntheticLambda0 coroutineLiveData$$ExternalSyntheticLambda0) {
        this.write = anchoredDraggableState;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = coroutineLiveData$$ExternalSyntheticLambda0;
    }
}
