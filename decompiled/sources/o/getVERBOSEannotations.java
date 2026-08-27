package o;

import android.content.Context;
import android.util.AttributeSet;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.roadrunner.order.history.presentation.main.HistoryFragment$$ExternalSyntheticLambda0;
import com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class getVERBOSEannotations extends SwipeRefreshLayout {
    public static final /* synthetic */ int ensureViewModelStore = 0;

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public void setRefreshing(boolean z) {
        super.setRefreshing(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getVERBOSEannotations(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public final void read(HistoryFragment$$ExternalSyntheticLambda0 historyFragment$$ExternalSyntheticLambda0) {
        setOnRefreshListener(new d0$$ExternalSyntheticLambda0(13, historyFragment$$ExternalSyntheticLambda0));
    }
}
