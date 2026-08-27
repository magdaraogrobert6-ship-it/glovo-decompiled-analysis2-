package o;

/* JADX INFO: loaded from: classes.dex */
public interface notifyViewEntered extends ShortNewsContentCardViewViewHolder {
    @Override // o.ShortNewsContentCardViewViewHolder
    default ImageOnlyContentCardViewViewHolder getKey() {
        return AndroidContentCaptureManager.IconCompatParcelizer;
    }

    Object withFrameNanos(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView shortNewsContentCardView);
}
