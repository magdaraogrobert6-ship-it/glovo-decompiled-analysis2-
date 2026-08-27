package com.mapbox.navigation.ui.components.maneuver.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.tripdata.maneuver.model.Maneuver;
import com.mapbox.navigation.tripdata.maneuver.model.PrimaryManeuver;
import com.mapbox.navigation.tripdata.maneuver.model.SecondaryManeuver;
import com.mapbox.navigation.tripdata.maneuver.model.StepDistance;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverViewOptions;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import o.getIndexOfFirstFeature;
import o.shadows4CzXIIdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxUpcomingManeuverAdapter extends RecyclerView.Adapter {
    public final LayoutInflater inflater;
    public ManeuverViewOptions options;
    public getIndexOfFirstFeature turnIconContextThemeWrapper;
    public final ArrayList upcomingManeuverList = new ArrayList();
    public final LinkedHashSet routeShields = new LinkedHashSet();

    public final class MapboxUpcomingManeuverViewHolder extends RecyclerView.ViewHolder {
        public final LayoutTileBinding viewBinding;

        public MapboxUpcomingManeuverViewHolder(LayoutTileBinding layoutTileBinding) {
            super(layoutTileBinding.MediaDescriptionCompat);
            this.viewBinding = layoutTileBinding;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.upcomingManeuverList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MapboxUpcomingManeuverViewHolder mapboxUpcomingManeuverViewHolder = (MapboxUpcomingManeuverViewHolder) viewHolder;
        mapboxUpcomingManeuverViewHolder.getClass();
        Maneuver maneuver = (Maneuver) this.upcomingManeuverList.get(i);
        LayoutTileBinding layoutTileBinding = mapboxUpcomingManeuverViewHolder.viewBinding;
        maneuver.getClass();
        PrimaryManeuver primaryManeuver = maneuver.primary;
        SecondaryManeuver secondaryManeuver = maneuver.secondary;
        StepDistance stepDistance = maneuver.stepDistance;
        MapboxUpcomingManeuverAdapter mapboxUpcomingManeuverAdapter = MapboxUpcomingManeuverAdapter.this;
        getIndexOfFirstFeature getindexoffirstfeature = mapboxUpcomingManeuverAdapter.turnIconContextThemeWrapper;
        LinkedHashSet linkedHashSet = mapboxUpcomingManeuverAdapter.routeShields;
        if (getindexoffirstfeature != null) {
            ((MapboxTurnIconManeuver) layoutTileBinding.RemoteActionCompatParcelizer).contextThemeWrapper = getindexoffirstfeature;
        }
        ManeuverViewOptions maneuverViewOptions = mapboxUpcomingManeuverAdapter.options;
        if (maneuverViewOptions != null) {
            ((MapboxPrimaryManeuver) layoutTileBinding.read).options = maneuverViewOptions.primaryManeuverOptions;
            ((MapboxSecondaryManeuver) layoutTileBinding.serializer).options = maneuverViewOptions.secondaryManeuverOptions;
        }
        MapboxPrimaryManeuver mapboxPrimaryManeuver = (MapboxPrimaryManeuver) layoutTileBinding.read;
        MapboxStepDistance mapboxStepDistance = (MapboxStepDistance) layoutTileBinding.write;
        View view = layoutTileBinding.MediaDescriptionCompat;
        MapboxSecondaryManeuver mapboxSecondaryManeuver = (MapboxSecondaryManeuver) layoutTileBinding.serializer;
        mapboxPrimaryManeuver.renderManeuver(primaryManeuver, linkedHashSet);
        ((MapboxTurnIconManeuver) layoutTileBinding.RemoteActionCompatParcelizer).renderPrimaryTurnIcon(primaryManeuver);
        if (secondaryManeuver != null) {
            mapboxSecondaryManeuver.setVisibility(0);
            mapboxSecondaryManeuver.renderManeuver(secondaryManeuver, linkedHashSet);
            ViewGroup.LayoutParams layoutParams = mapboxPrimaryManeuver.getLayoutParams();
            layoutParams.getClass();
            shadows4CzXIIdefault shadows4czxiidefault = (shadows4CzXIIdefault) layoutParams;
            shadows4czxiidefault.getDefaultViewModelCreationExtras = -1;
            shadows4czxiidefault.RemoteActionCompatParcelizer = -1;
            shadows4czxiidefault.MediaDescriptionCompat = mapboxSecondaryManeuver.getId();
            view.requestLayout();
            mapboxPrimaryManeuver.setMaxLines(1);
        } else {
            ViewGroup.LayoutParams layoutParams2 = mapboxPrimaryManeuver.getLayoutParams();
            layoutParams2.getClass();
            shadows4CzXIIdefault shadows4czxiidefault2 = (shadows4CzXIIdefault) layoutParams2;
            shadows4czxiidefault2.getDefaultViewModelCreationExtras = 0;
            shadows4czxiidefault2.RemoteActionCompatParcelizer = 0;
            view.requestLayout();
            mapboxSecondaryManeuver.setVisibility(8);
            mapboxPrimaryManeuver.setMaxLines(2);
        }
        mapboxStepDistance.setText(((AnalyticsServiceImpl) stepDistance.distanceFormatter).formatDistance(stepDistance.totalDistance));
        ManeuverViewOptions maneuverViewOptions2 = mapboxUpcomingManeuverAdapter.options;
        Integer numValueOf = maneuverViewOptions2 != null ? Integer.valueOf(maneuverViewOptions2.primaryManeuverOptions.textAppearance) : null;
        if (numValueOf != null) {
            mapboxPrimaryManeuver.setTextAppearance(numValueOf.intValue());
        }
        ManeuverViewOptions maneuverViewOptions3 = mapboxUpcomingManeuverAdapter.options;
        Integer numValueOf2 = maneuverViewOptions3 != null ? Integer.valueOf(maneuverViewOptions3.secondaryManeuverOptions.textAppearance) : null;
        if (numValueOf2 != null) {
            mapboxSecondaryManeuver.setTextAppearance(numValueOf2.intValue());
        }
        ManeuverViewOptions maneuverViewOptions4 = mapboxUpcomingManeuverAdapter.options;
        Integer numValueOf3 = maneuverViewOptions4 != null ? Integer.valueOf(maneuverViewOptions4.stepDistanceTextAppearance) : null;
        if (numValueOf3 != null) {
            mapboxStepDistance.setTextAppearance(numValueOf3.intValue());
        }
    }

    public MapboxUpcomingManeuverAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewInflate = this.inflater.inflate(R.layout.mapbox_item_upcoming_maneuvers_layout, viewGroup, false);
        if (viewInflate != null) {
            return new MapboxUpcomingManeuverViewHolder(LayoutTileBinding.bind((ConstraintLayout) viewInflate));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("rootView");
        return null;
    }
}
