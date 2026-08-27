package o;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public final class setOverflowReserved extends DataSetObserver {
    public final /* synthetic */ setExpandedActionViewsExclusive IconCompatParcelizer;

    public setOverflowReserved(setExpandedActionViewsExclusive setexpandedactionviewsexclusive) {
        this.IconCompatParcelizer = setexpandedactionviewsexclusive;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        setExpandedActionViewsExclusive setexpandedactionviewsexclusive = this.IconCompatParcelizer;
        if (setexpandedactionviewsexclusive.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.isShowing()) {
            setexpandedactionviewsexclusive.b_();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }
}
