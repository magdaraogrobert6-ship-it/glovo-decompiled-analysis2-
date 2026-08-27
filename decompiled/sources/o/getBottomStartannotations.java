package o;

import bo.app.af$$ExternalSyntheticOutline1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getBottomStartannotations implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.text.HeightInLinesNode write;

    public /* synthetic */ getBottomStartannotations(androidx.compose.foundation.text.HeightInLinesNode heightInLinesNode, int i) {
        this.IconCompatParcelizer = i;
        this.write = heightInLinesNode;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        androidx.compose.foundation.text.HeightInLinesNode heightInLinesNode = this.write;
        if (i != 0) {
            onViewAttachedToWindow onviewattachedtowindow = heightInLinesNode.RemoteActionCompatParcelizer;
            if (onviewattachedtowindow == null) {
                throw af$$ExternalSyntheticOutline1.m("Font resolution state is not set.");
            }
            onviewattachedtowindow.getValue();
            return createfromparcel;
        }
        onViewAttachedToWindow onviewattachedtowindow2 = heightInLinesNode.RemoteActionCompatParcelizer;
        if (onviewattachedtowindow2 == null) {
            throw af$$ExternalSyntheticOutline1.m("Font resolution state is not set.");
        }
        onviewattachedtowindow2.getValue();
        return createfromparcel;
    }
}
