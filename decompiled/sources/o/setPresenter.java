package o;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class setPresenter implements AbsListView.OnScrollListener {
    public final /* synthetic */ setExpandedActionViewsExclusive write;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        setExpandedActionViewsExclusive setexpandedactionviewsexclusive = this.write;
        setOnMenuItemClickListener setonmenuitemclicklistener = setexpandedactionviewsexclusive.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        setItemInvoker setiteminvoker = setexpandedactionviewsexclusive.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (i != 1 || setiteminvoker.getInputMethodMode() == 2 || setiteminvoker.getContentView() == null) {
            return;
        }
        setexpandedactionviewsexclusive.ResultReceiver.removeCallbacks(setonmenuitemclicklistener);
        setonmenuitemclicklistener.run();
    }

    public setPresenter(setExpandedActionViewsExclusive setexpandedactionviewsexclusive) {
        this.write = setexpandedactionviewsexclusive;
    }
}
