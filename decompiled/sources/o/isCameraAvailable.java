package o;

/* JADX INFO: loaded from: classes.dex */
public final class isCameraAvailable implements getPersonMiddleInitial {
    public final /* synthetic */ androidx.compose.material3.ModalBottomSheetDialogWrapper read;

    @Override // o.getPersonMiddleInitial
    public final void dispose() {
        androidx.compose.material3.ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = this.read;
        modalBottomSheetDialogWrapper.dismiss();
        modalBottomSheetDialogWrapper.read.disposeComposition();
    }

    public isCameraAvailable(androidx.compose.material3.ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper) {
        this.read = modalBottomSheetDialogWrapper;
    }
}
