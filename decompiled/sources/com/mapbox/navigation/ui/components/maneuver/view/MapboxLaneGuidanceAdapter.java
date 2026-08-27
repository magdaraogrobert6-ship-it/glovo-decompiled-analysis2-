package com.mapbox.navigation.ui.components.maneuver.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.tripdata.maneuver.model.LaneIcon;
import com.mapbox.navigation.tripdata.maneuver.model.LaneIndicator;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.order.history.databinding.LayoutNoDeliveryBinding;
import com.sentiance.core.model.events.R0$b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o.getCieXyz;
import o.getIndexOfFirstFeature;
import o.getNonefv9h1I;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxLaneGuidanceAdapter extends RecyclerView.Adapter {
    public final Context context;
    public final LayoutInflater inflater;
    public getIndexOfFirstFeature wrapper;
    public final ArrayList laneIndicatorList = new ArrayList();
    public final AnalyticsServiceImpl laneApi = new AnalyticsServiceImpl(13);

    public final class MapboxLaneGuidanceViewHolder extends RecyclerView.ViewHolder {
        public final LayoutNoDeliveryBinding viewBinding;

        public MapboxLaneGuidanceViewHolder(LayoutNoDeliveryBinding layoutNoDeliveryBinding) {
            super((LinearLayout) layoutNoDeliveryBinding.IconCompatParcelizer);
            this.viewBinding = layoutNoDeliveryBinding;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.laneIndicatorList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        LaneIcon laneIcon;
        int iIndexOf;
        boolean zIconCompatParcelizer;
        MapboxLaneGuidanceViewHolder mapboxLaneGuidanceViewHolder = (MapboxLaneGuidanceViewHolder) viewHolder;
        mapboxLaneGuidanceViewHolder.getClass();
        LaneIndicator laneIndicator = (LaneIndicator) this.laneIndicatorList.get(i);
        laneIndicator.getClass();
        MapboxLaneGuidanceAdapter mapboxLaneGuidanceAdapter = MapboxLaneGuidanceAdapter.this;
        AnalyticsServiceImpl analyticsServiceImpl = mapboxLaneGuidanceAdapter.laneApi;
        analyticsServiceImpl.getClass();
        Map map = ((R0$b) analyticsServiceImpl.locationProvider).read;
        String str = laneIndicator.drivingSide;
        String str2 = laneIndicator.activeDirection;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(laneIndicator.directions);
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            if (R0$b.isLaneLeftward(str3, str)) {
                z2 = true;
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str3, "uturn"}, getCieXyz.write())).booleanValue()) {
                    zIconCompatParcelizer = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "left"}, getCieXyz.write())).booleanValue();
                } else {
                    zIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str3, (CharSequence) "right", false);
                }
                if (zIconCompatParcelizer) {
                    z3 = true;
                }
            }
        }
        if (z2 && z3) {
            if (str2 != null && R0$b.isLaneLeftward(str2, str)) {
                R0$b.prependOpposite(str, arrayList, false);
            } else {
                R0$b.prependOpposite(str, arrayList, true);
                z = false;
            }
        } else if (!z2) {
            z = false;
        }
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                String strWrite = str2 != null ? setCarryoverInAppMessage.write(setCarryoverInAppMessage.write(str2, "left", "turn"), "right", "turn") : null;
                if (arrayList.size() > 3) {
                    if (strWrite != null && (iIndexOf = arrayList.indexOf(strWrite)) >= 0) {
                        arrayList.remove(iIndexOf);
                        arrayList.add(0, strWrite);
                    }
                    arrayList = new ArrayList(onContentCardDismissed.read(arrayList, 3));
                }
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.contains("opposite sharp turn")) {
                    arrayList2.add("opposite sharp turn");
                }
                if (arrayList.contains("opposite turn")) {
                    arrayList2.add("opposite turn");
                }
                if (arrayList.contains("opposite slight turn")) {
                    arrayList2.add("opposite slight turn");
                }
                if (arrayList.contains("straight")) {
                    arrayList2.add("straight");
                }
                if (arrayList.contains("slight turn")) {
                    arrayList2.add("slight turn");
                }
                if (arrayList.contains("turn")) {
                    arrayList2.add("turn");
                }
                if (arrayList.contains("sharp turn")) {
                    arrayList2.add("sharp turn");
                }
                if (arrayList.contains("uturn")) {
                    arrayList2.add("uturn");
                }
                String strConcat = "lane ".concat(onContentCardDismissed.IconCompatParcelizer(arrayList2, " or ", null, null, null, 62));
                if (strWrite != null) {
                    strConcat = af$$ExternalSyntheticOutline0.m(strConcat, " using ", strWrite);
                }
                if (map.containsKey(strConcat)) {
                    Object obj = map.get(strConcat);
                    obj.getClass();
                    laneIcon = new LaneIcon(((Number) obj).intValue(), z);
                } else if (str2 != null) {
                    String strWrite2 = setCarryoverInAppMessage.write(setCarryoverInAppMessage.write(str2, "right", "turn"), "left", "turn");
                    String strM = af$$ExternalSyntheticOutline0.m("lane ", strWrite2, " using ", strWrite2);
                    if (map.containsKey(strConcat)) {
                        Object obj2 = map.get(strM);
                        obj2.getClass();
                        laneIcon = new LaneIcon(((Number) obj2).intValue(), z);
                    } else {
                        Object obj3 = map.get("lane straight");
                        obj3.getClass();
                        laneIcon = new LaneIcon(((Number) obj3).intValue(), z);
                    }
                } else {
                    Object obj4 = map.get("lane straight");
                    obj4.getClass();
                    laneIcon = new LaneIcon(((Number) obj4).intValue(), z);
                }
                MapboxLaneGuidance mapboxLaneGuidance = (MapboxLaneGuidance) mapboxLaneGuidanceViewHolder.viewBinding.serializer;
                getIndexOfFirstFeature getindexoffirstfeature = mapboxLaneGuidanceAdapter.wrapper;
                getindexoffirstfeature.getClass();
                mapboxLaneGuidance.setRotationY(laneIcon.shouldFlip ? 180.0f : 0.0f);
                mapboxLaneGuidance.setImageDrawable(getNonefv9h1I.RemoteActionCompatParcelizer(mapboxLaneGuidance.getContext().getResources(), laneIcon.drawableResId, getindexoffirstfeature.getTheme()));
                return;
            }
            Object next = it2.next();
            if (i2 < 0) {
                SQLite.serializer();
                throw null;
            }
            arrayList.set(i2, setCarryoverInAppMessage.write(setCarryoverInAppMessage.write((String) next, "left", "turn"), "right", "turn"));
            i2++;
        }
    }

    public MapboxLaneGuidanceAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.wrapper = new getIndexOfFirstFeature(context, R.style.MapboxStyleTurnIconManeuver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = this.inflater.inflate(R.layout.mapbox_item_lane_guidance_layout, viewGroup, false);
        MapboxLaneGuidance mapboxLaneGuidance = (MapboxLaneGuidance) ExtrasKt.RemoteActionCompatParcelizer(R.id.itemLaneGuidance, viewInflate);
        if (mapboxLaneGuidance != null) {
            return new MapboxLaneGuidanceViewHolder(new LayoutNoDeliveryBinding(1, mapboxLaneGuidance, (LinearLayout) viewInflate));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.itemLaneGuidance)));
        return null;
    }
}
