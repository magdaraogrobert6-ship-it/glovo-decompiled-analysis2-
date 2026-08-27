package o;

/* JADX INFO: loaded from: classes.dex */
public final class notifyContentCaptureChanges implements PopulateViewStructure_androidKtpopulate7, getContentViewGroupParentLayout {
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 read;
    public final TextAnnouncementContentCardView write;

    @Override // o.getContentViewGroupParentLayout
    public final TextAnnouncementContentCardView getCoroutineContext() {
        return this.write;
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final Object component1() {
        return this.read.component1();
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM component2() {
        return this.read.component2();
    }

    @Override // o.onViewAttachedToWindow
    public final Object getValue() {
        return this.read.getValue();
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public final void setValue(Object obj) {
        this.read.setValue(obj);
    }

    public notifyContentCaptureChanges(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.read = populateViewStructure_androidKtpopulate7;
        this.write = textAnnouncementContentCardView;
    }
}
