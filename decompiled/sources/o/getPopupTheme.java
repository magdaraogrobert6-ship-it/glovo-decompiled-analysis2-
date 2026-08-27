package o;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class getPopupTheme implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ setExpandedActionViewsExclusive write;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public getPopupTheme(setExpandedActionViewsExclusive setexpandedactionviewsexclusive) {
        this.write = setexpandedactionviewsexclusive;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        setHasNonEmbeddedTabs sethasnonembeddedtabs;
        if (i == -1 || (sethasnonembeddedtabs = this.write.PlaybackStateCompat) == null) {
            return;
        }
        sethasnonembeddedtabs.setListSelectionHidden(false);
    }
}
