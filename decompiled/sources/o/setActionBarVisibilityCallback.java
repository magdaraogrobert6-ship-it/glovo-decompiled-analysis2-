package o;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public abstract class setActionBarVisibilityCallback {
    public static void IconCompatParcelizer(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }

    public static boolean serializer(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }
}
