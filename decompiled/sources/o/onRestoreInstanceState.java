package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class onRestoreInstanceState extends BaseAdapter {
    public int IconCompatParcelizer = -1;
    public final boolean MediaDescriptionCompat;
    public final AlertControllerButtonHandler RemoteActionCompatParcelizer;
    public final int read;
    public boolean serializer;
    public final LayoutInflater write;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListRemoteActionCompatParcelizer;
        boolean z = this.MediaDescriptionCompat;
        AlertControllerButtonHandler alertControllerButtonHandler = this.RemoteActionCompatParcelizer;
        if (z) {
            alertControllerButtonHandler.serializer();
            arrayListRemoteActionCompatParcelizer = alertControllerButtonHandler.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        } else {
            arrayListRemoteActionCompatParcelizer = alertControllerButtonHandler.RemoteActionCompatParcelizer();
        }
        return this.IconCompatParcelizer < 0 ? arrayListRemoteActionCompatParcelizer.size() : arrayListRemoteActionCompatParcelizer.size() - 1;
    }

    public final void read() {
        AlertControllerButtonHandler alertControllerButtonHandler = this.RemoteActionCompatParcelizer;
        Keep keep = alertControllerButtonHandler.RatingCompat;
        if (keep != null) {
            alertControllerButtonHandler.serializer();
            ArrayList arrayList = alertControllerButtonHandler.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Keep) arrayList.get(i)) == keep) {
                    this.IconCompatParcelizer = i;
                    return;
                }
            }
        }
        this.IconCompatParcelizer = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final Keep getItem(int i) {
        ArrayList arrayListRemoteActionCompatParcelizer;
        boolean z = this.MediaDescriptionCompat;
        AlertControllerButtonHandler alertControllerButtonHandler = this.RemoteActionCompatParcelizer;
        if (z) {
            alertControllerButtonHandler.serializer();
            arrayListRemoteActionCompatParcelizer = alertControllerButtonHandler.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        } else {
            arrayListRemoteActionCompatParcelizer = alertControllerButtonHandler.RemoteActionCompatParcelizer();
        }
        int i2 = this.IconCompatParcelizer;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (Keep) arrayListRemoteActionCompatParcelizer.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.write.inflate(this.read, viewGroup, false);
        }
        int i2 = getItem(i).MediaSessionCompatQueueItem;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).MediaSessionCompatQueueItem : i2;
        onLaunch onlaunch = (onLaunch) view;
        if (this.RemoteActionCompatParcelizer.read() && i2 != i4) {
            z = true;
        }
        onlaunch.setGroupDividerEnabled(z);
        getSupportActionBar getsupportactionbar = (getSupportActionBar) view;
        if (this.serializer) {
            onlaunch.setForceShowIcon(true);
        }
        getsupportactionbar.initialize(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        read();
        super.notifyDataSetChanged();
    }

    public onRestoreInstanceState(AlertControllerButtonHandler alertControllerButtonHandler, LayoutInflater layoutInflater, boolean z, int i) {
        this.MediaDescriptionCompat = z;
        this.write = layoutInflater;
        this.RemoteActionCompatParcelizer = alertControllerButtonHandler;
        this.read = i;
        read();
    }
}
