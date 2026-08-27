package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class findViewById implements invalidateOptionsMenu, getResources, AdapterView.OnItemClickListener {
    public android.graphics.Rect r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;

    public static int RemoteActionCompatParcelizer(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        FrameLayout frameLayout = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public abstract void IconCompatParcelizer(int i);

    @Override // o.getResources
    public final void IconCompatParcelizer(Context context, AlertControllerButtonHandler alertControllerButtonHandler) {
    }

    public abstract void IconCompatParcelizer(PopupWindow.OnDismissListener onDismissListener);

    public abstract void IconCompatParcelizer(boolean z);

    public abstract void RemoteActionCompatParcelizer(boolean z);

    @Override // o.getResources
    public final boolean RemoteActionCompatParcelizer(Keep keep) {
        return false;
    }

    public abstract void read(int i);

    public abstract void serializer(View view);

    public abstract void write(int i);

    public abstract void write(AlertControllerButtonHandler alertControllerButtonHandler);

    @Override // o.getResources
    public final boolean write(Keep keep) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (onRestoreInstanceState) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (onRestoreInstanceState) listAdapter).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((MenuItem) listAdapter.getItem(i), this, !(this instanceof r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0) ? 0 : 4);
    }
}
