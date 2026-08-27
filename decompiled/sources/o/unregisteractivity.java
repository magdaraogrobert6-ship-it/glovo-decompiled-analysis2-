package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class unregisteractivity extends BaseAdapter {
    public final /* synthetic */ register RemoteActionCompatParcelizer;
    public int read = -1;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public unregisteractivity(register registerVar) {
        this.RemoteActionCompatParcelizer = registerVar;
        RemoteActionCompatParcelizer();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final Keep getItem(int i) {
        AlertControllerButtonHandler alertControllerButtonHandler = this.RemoteActionCompatParcelizer.write;
        alertControllerButtonHandler.serializer();
        ArrayList arrayList = alertControllerButtonHandler.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i2 = this.read;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (Keep) arrayList.get(i);
    }

    public final void RemoteActionCompatParcelizer() {
        AlertControllerButtonHandler alertControllerButtonHandler = this.RemoteActionCompatParcelizer.write;
        Keep keep = alertControllerButtonHandler.RatingCompat;
        if (keep != null) {
            alertControllerButtonHandler.serializer();
            ArrayList arrayList = alertControllerButtonHandler.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Keep) arrayList.get(i)) == keep) {
                    this.read = i;
                    return;
                }
            }
        }
        this.read = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        AlertControllerButtonHandler alertControllerButtonHandler = this.RemoteActionCompatParcelizer.write;
        alertControllerButtonHandler.serializer();
        int size = alertControllerButtonHandler.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.size();
        return this.read < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.RemoteActionCompatParcelizer.serializer.inflate(com.logistics.rider.glovo.R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((getSupportActionBar) view).initialize(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        RemoteActionCompatParcelizer();
        super.notifyDataSetChanged();
    }
}
