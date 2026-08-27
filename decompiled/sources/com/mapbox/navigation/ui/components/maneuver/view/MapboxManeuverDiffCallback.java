package com.mapbox.navigation.ui.components.maneuver.view;

import androidx.recyclerview.widget.DiffUtil$Callback;
import com.mapbox.navigation.tripdata.maneuver.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxManeuverDiffCallback extends DiffUtil$Callback {
    public final List newList;
    public final List oldList;

    @Override // androidx.recyclerview.widget.DiffUtil$Callback
    public final boolean areContentsTheSame(int i, int i2) {
        Object[] objArr = {this.oldList.get(i), this.newList.get(i2)};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.recyclerview.widget.DiffUtil$Callback
    public final boolean areItemsTheSame(int i, int i2) {
        return ((Maneuver) this.oldList.get(i)).primary.text == ((Maneuver) this.newList.get(i2)).primary.text;
    }

    @Override // androidx.recyclerview.widget.DiffUtil$Callback
    public final int getNewListSize() {
        return this.newList.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil$Callback
    public final int getOldListSize() {
        return this.oldList.size();
    }

    public MapboxManeuverDiffCallback(ArrayList arrayList, List list) {
        arrayList.getClass();
        this.oldList = arrayList;
        this.newList = list;
    }
}
