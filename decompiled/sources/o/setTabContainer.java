package o;

import androidx.cardview.widget.CardView$1;

/* JADX INFO: loaded from: classes.dex */
public final class setTabContainer extends CardView$1 {
    public final /* synthetic */ androidx.appcompat.widget.AppCompatTextView write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTabContainer(androidx.appcompat.widget.AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.write = appCompatTextView;
    }

    @Override // androidx.cardview.widget.CardView$1, o.setVisibility
    public final void RemoteActionCompatParcelizer(int i, float f) {
        super/*android.widget.TextView*/.setLineHeight(i, f);
    }
}
