package com.mapbox.navigation.ui.components.maneuver.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil3.ExtrasKt;
import com.common_ui.databinding.ItemSingleChoiceBinding;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.navigation.tripdata.maneuver.model.Component;
import com.mapbox.navigation.tripdata.maneuver.model.ComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.DelimiterComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.ExitNumberComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.RoadShieldComponentNode;
import com.mapbox.navigation.tripdata.maneuver.model.SubManeuver;
import com.mapbox.navigation.tripdata.maneuver.model.TextComponentNode;
import com.mapbox.navigation.ui.components.R$styleable;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverExitOptions;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverInstructionGenerator;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverPrimaryOptions;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverSecondaryOptions;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverSubOptions;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverViewOptions;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.SimpleInnerShadowElement;
import o.createFromParcel;
import o.drawWithRotationAndOffsetubNVwUQ;
import o.getDefaultJoinLxFBmk8;
import o.getIndexOfFirstFeature;
import o.getSetText;
import o.getShowTextSubstitution;
import o.shadows4CzXIIdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxManeuverView extends ConstraintLayout {
    public final MutableStateFlow _maneuverViewState;
    public final ItemSingleChoiceBinding binding;
    public final ArrayList currentlyRenderedManeuvers;
    public final MapboxLaneGuidanceAdapter laneGuidanceAdapter;
    public final LayoutTileBinding mainLayoutBinding;
    public ManeuverViewOptions maneuverViewOptions;
    public final StateFlow maneuverViewState;
    public final LinkedHashSet routeShields;
    public final getDefaultJoinLxFBmk8 subLayoutBinding;
    public final MapboxUpcomingManeuverAdapter upcomingManeuverAdapter;
    public boolean upcomingManeuverRenderingEnabled;

    public final StateFlow<MapboxManeuverViewState$EXPANDED> getManeuverViewState() {
        return this.maneuverViewState;
    }

    public final MapboxUpcomingManeuverAdapter getUpcomingManeuverAdapter$ui_components_release() {
        return this.upcomingManeuverAdapter;
    }

    public final boolean getUpcomingManeuverRenderingEnabled() {
        return this.upcomingManeuverRenderingEnabled;
    }

    public MapboxManeuverView(Context context) {
        context.getClass();
        ManeuverViewOptions maneuverViewOptions = new ManeuverViewOptions(R.color.mapbox_main_maneuver_background_color, R.color.mapbox_sub_maneuver_background_color, R.color.mapbox_upcoming_maneuver_background_color, R.style.MapboxStyleTurnIconManeuver, R.style.MapboxStyleStepDistance, R.style.MapboxStyleTurnIconManeuver, new ManeuverPrimaryOptions(R.style.MapboxStylePrimaryManeuver, new ManeuverExitOptions(R.style.MapboxStyleExitTextForPrimary, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna))), new ManeuverSecondaryOptions(R.style.MapboxStyleSecondaryManeuver, new ManeuverExitOptions(R.style.MapboxStyleExitTextForSecondary, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna))), new ManeuverSubOptions(R.style.MapboxStyleSubManeuver, new ManeuverExitOptions(R.style.MapboxStyleExitTextForSub, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna))));
        super(context, null, R.style.MapboxStyleManeuverView);
        MutableStateFlow mutableStateFlow = StateFlowKt.read(MapboxManeuverViewState$EXPANDED.INSTANCE$1);
        this._maneuverViewState = mutableStateFlow;
        this.maneuverViewState = FlowKt.write(mutableStateFlow);
        this.maneuverViewOptions = new ManeuverViewOptions(R.color.mapbox_main_maneuver_background_color, R.color.mapbox_sub_maneuver_background_color, R.color.mapbox_upcoming_maneuver_background_color, R.style.MapboxStyleTurnIconManeuver, R.style.MapboxStyleStepDistance, R.style.MapboxStyleTurnIconManeuver, new ManeuverPrimaryOptions(R.style.MapboxStylePrimaryManeuver, new ManeuverExitOptions(R.style.MapboxStyleExitTextForPrimary, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna))), new ManeuverSecondaryOptions(R.style.MapboxStyleSecondaryManeuver, new ManeuverExitOptions(R.style.MapboxStyleExitTextForSecondary, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna))), new ManeuverSubOptions(R.style.MapboxStyleSubManeuver, new ManeuverExitOptions(R.style.MapboxStyleExitTextForSub, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna))));
        Context context2 = getContext();
        context2.getClass();
        MapboxLaneGuidanceAdapter mapboxLaneGuidanceAdapter = new MapboxLaneGuidanceAdapter(context2);
        this.laneGuidanceAdapter = mapboxLaneGuidanceAdapter;
        Context context3 = getContext();
        context3.getClass();
        MapboxUpcomingManeuverAdapter mapboxUpcomingManeuverAdapter = new MapboxUpcomingManeuverAdapter(context3);
        this.upcomingManeuverAdapter = mapboxUpcomingManeuverAdapter;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.mapbox_maneuver_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.laneGuidanceRecycler;
        RecyclerView recyclerView = (RecyclerView) ExtrasKt.RemoteActionCompatParcelizer(R.id.laneGuidanceRecycler, viewInflate);
        if (recyclerView != null) {
            i = R.id.mainManeuverLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ExtrasKt.RemoteActionCompatParcelizer(R.id.mainManeuverLayout, viewInflate);
            if (constraintLayout != null) {
                i = R.id.maneuver;
                if (((drawWithRotationAndOffsetubNVwUQ) ExtrasKt.RemoteActionCompatParcelizer(R.id.maneuver, viewInflate)) != null) {
                    i = R.id.subManeuverLayout;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ExtrasKt.RemoteActionCompatParcelizer(R.id.subManeuverLayout, viewInflate);
                    if (constraintLayout2 != null) {
                        i = R.id.upcomingManeuverRecycler;
                        MapboxManeuversList mapboxManeuversList = (MapboxManeuversList) ExtrasKt.RemoteActionCompatParcelizer(R.id.upcomingManeuverRecycler, viewInflate);
                        if (mapboxManeuversList != null) {
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                            this.binding = new ItemSingleChoiceBinding(constraintLayout3, recyclerView, constraintLayout, constraintLayout2, mapboxManeuversList);
                            LayoutTileBinding layoutTileBindingBind = LayoutTileBinding.bind(constraintLayout3);
                            this.mainLayoutBinding = layoutTileBindingBind;
                            int i2 = R.id.subManeuverGuideline;
                            if (((SimpleInnerShadowElement) ExtrasKt.RemoteActionCompatParcelizer(R.id.subManeuverGuideline, constraintLayout3)) != null) {
                                MapboxTurnIconManeuver mapboxTurnIconManeuver = (MapboxTurnIconManeuver) ExtrasKt.RemoteActionCompatParcelizer(R.id.subManeuverIcon, constraintLayout3);
                                if (mapboxTurnIconManeuver != null) {
                                    MapboxSubManeuver mapboxSubManeuver = (MapboxSubManeuver) ExtrasKt.RemoteActionCompatParcelizer(R.id.subManeuverText, constraintLayout3);
                                    if (mapboxSubManeuver != null) {
                                        this.subLayoutBinding = new getDefaultJoinLxFBmk8(constraintLayout3, mapboxTurnIconManeuver, mapboxSubManeuver, 6);
                                        this.routeShields = new LinkedHashSet();
                                        this.currentlyRenderedManeuvers = new ArrayList();
                                        this.upcomingManeuverRenderingEnabled = true;
                                        recyclerView.getContext();
                                        recyclerView.setLayoutManager(new LinearLayoutManager(0));
                                        recyclerView.setAdapter(mapboxLaneGuidanceAdapter);
                                        mapboxManeuversList.getContext();
                                        mapboxManeuversList.setLayoutManager(new LinearLayoutManager(1));
                                        mapboxManeuversList.setAdapter(mapboxUpcomingManeuverAdapter);
                                        setOnClickListener(new ThrottledButton$$ExternalSyntheticLambda0(9, this));
                                        ManeuverViewOptions maneuverViewOptions2 = this.maneuverViewOptions;
                                        mapboxSubManeuver.options = maneuverViewOptions2.subManeuverOptions;
                                        ((MapboxPrimaryManeuver) layoutTileBindingBind.read).options = maneuverViewOptions2.primaryManeuverOptions;
                                        ((MapboxSecondaryManeuver) layoutTileBindingBind.serializer).options = maneuverViewOptions2.secondaryManeuverOptions;
                                        this.maneuverViewOptions = maneuverViewOptions;
                                        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.MapboxManeuverView, 0, R.style.MapboxStyleManeuverView);
                                        typedArrayObtainStyledAttributes.getClass();
                                        constraintLayout.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(1, getContext().getColor(R.color.mapbox_main_maneuver_background_color)));
                                        constraintLayout2.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(3, getContext().getColor(R.color.mapbox_sub_maneuver_background_color)));
                                        mapboxManeuversList.setBackgroundColor(typedArrayObtainStyledAttributes.getColor(5, getContext().getColor(R.color.mapbox_upcoming_maneuver_background_color)));
                                        mapboxLaneGuidanceAdapter.wrapper = new getIndexOfFirstFeature(mapboxLaneGuidanceAdapter.context, typedArrayObtainStyledAttributes.getResourceId(0, R.style.MapboxStyleTurnIconManeuver));
                                        mapboxLaneGuidanceAdapter.notifyDataSetChanged();
                                        ((MapboxTurnIconManeuver) layoutTileBindingBind.RemoteActionCompatParcelizer).contextThemeWrapper = new getIndexOfFirstFeature(getContext(), typedArrayObtainStyledAttributes.getResourceId(2, R.style.MapboxStyleTurnIconManeuver));
                                        mapboxTurnIconManeuver.contextThemeWrapper = new getIndexOfFirstFeature(getContext(), typedArrayObtainStyledAttributes.getResourceId(2, R.style.MapboxStyleTurnIconManeuver));
                                        mapboxUpcomingManeuverAdapter.turnIconContextThemeWrapper = new getIndexOfFirstFeature(getContext(), typedArrayObtainStyledAttributes.getResourceId(4, R.style.MapboxStyleTurnIconManeuver));
                                        typedArrayObtainStyledAttributes.recycle();
                                        return;
                                    }
                                    i2 = R.id.subManeuverText;
                                } else {
                                    i2 = R.id.subManeuverIcon;
                                }
                            }
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(constraintLayout3.getResources().getResourceName(i2)));
                            throw null;
                        }
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void hideSecondaryManeuver(int i) {
        LayoutTileBinding layoutTileBinding = this.mainLayoutBinding;
        ((MapboxSecondaryManeuver) layoutTileBinding.serializer).setVisibility(i);
        MapboxPrimaryManeuver mapboxPrimaryManeuver = (MapboxPrimaryManeuver) layoutTileBinding.read;
        ViewGroup.LayoutParams layoutParams = mapboxPrimaryManeuver.getLayoutParams();
        layoutParams.getClass();
        shadows4CzXIIdefault shadows4czxiidefault = (shadows4CzXIIdefault) layoutParams;
        shadows4czxiidefault.getDefaultViewModelCreationExtras = 0;
        shadows4czxiidefault.RemoteActionCompatParcelizer = 0;
        requestLayout();
        mapboxPrimaryManeuver.setMaxLines(2);
    }

    public final void renderSub(SubManeuver subManeuver, Set set) {
        createFromParcel createfromparcel;
        getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8 = this.subLayoutBinding;
        MapboxSubManeuver mapboxSubManeuver = (MapboxSubManeuver) getdefaultjoinlxfbmk8.write;
        Context context = mapboxSubManeuver.getContext();
        context.getClass();
        MapboxExitText mapboxExitText = new MapboxExitText(context);
        mapboxExitText.setTextAppearance(mapboxSubManeuver.options.exitOptions.textAppearance);
        mapboxExitText.exitProperties = mapboxSubManeuver.options.exitOptions.mutcdExitProperties;
        mapboxExitText.exitBackground = mapboxExitText.getContext().getDrawable(R.drawable.mapbox_exit_board_background);
        Context context2 = mapboxSubManeuver.getContext();
        context2.getClass();
        int lineHeight = mapboxSubManeuver.getLineHeight();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (subManeuver != null) {
            Iterator it = subManeuver.componentList.iterator();
            while (it.hasNext()) {
                ComponentNode componentNode = ((Component) it.next()).node;
                if (componentNode instanceof TextComponentNode) {
                    spannableStringBuilder.append((CharSequence) ((TextComponentNode) componentNode).text);
                    spannableStringBuilder.append((CharSequence) " ");
                } else if (componentNode instanceof ExitNumberComponentNode) {
                    ExitNumberComponentNode exitNumberComponentNode = (ExitNumberComponentNode) componentNode;
                    mapboxExitText.setExit(subManeuver.modifier, exitNumberComponentNode);
                    String str = exitNumberComponentNode.text;
                    Resources resources = context2.getResources();
                    resources.getClass();
                    ManeuverInstructionGenerator.addExitToBuilder(str, mapboxExitText, lineHeight, resources, spannableStringBuilder);
                } else if (componentNode instanceof RoadShieldComponentNode) {
                    RoadShieldComponentNode roadShieldComponentNode = (RoadShieldComponentNode) componentNode;
                    String str2 = roadShieldComponentNode.text;
                    Resources resources2 = context2.getResources();
                    resources2.getClass();
                    ManeuverInstructionGenerator.getShieldToRender(roadShieldComponentNode, set);
                    ManeuverInstructionGenerator.addShieldToBuilder(str2, resources2, spannableStringBuilder);
                } else if (componentNode instanceof DelimiterComponentNode) {
                    spannableStringBuilder.append((CharSequence) ((DelimiterComponentNode) componentNode).text);
                    spannableStringBuilder.append((CharSequence) " ");
                }
            }
        }
        mapboxSubManeuver.setText(spannableStringBuilder);
        MapboxTurnIconManeuver mapboxTurnIconManeuver = (MapboxTurnIconManeuver) getdefaultjoinlxfbmk8.read;
        if (subManeuver != null) {
            AnalyticsServiceImpl analyticsServiceImpl = mapboxTurnIconManeuver.turnIconsApi;
            String str3 = subManeuver.type;
            Double d = subManeuver.degrees;
            analyticsServiceImpl.generateTurnIcon(str3, d != null ? Float.valueOf((float) d.doubleValue()) : null, subManeuver.modifier, subManeuver.drivingSide).fold(new Snapshotter$$ExternalSyntheticLambda0(22), new MapboxTurnIconManeuver$$ExternalSyntheticLambda1(mapboxTurnIconManeuver, 0));
            createfromparcel = createFromParcel.INSTANCE;
        } else {
            createfromparcel = null;
        }
        if (createfromparcel == null) {
            mapboxTurnIconManeuver.setImageDrawable(null);
        }
    }

    public final void updateUpcomingManeuversVisibility(int i) {
        MutableStateFlow mutableStateFlow = this._maneuverViewState;
        if (i == 0) {
            mutableStateFlow.IconCompatParcelizer(MapboxManeuverViewState$EXPANDED.INSTANCE);
        } else {
            mutableStateFlow.IconCompatParcelizer(MapboxManeuverViewState$EXPANDED.INSTANCE$1);
        }
        ((MapboxManeuversList) this.binding.write).setVisibility(i);
    }

    public final void setUpcomingManeuverRenderingEnabled(boolean z) {
        if (z != this.upcomingManeuverRenderingEnabled && !z && ((MapboxManeuversList) this.binding.write).getVisibility() == 0) {
            updateUpcomingManeuversVisibility(8);
        }
        this.upcomingManeuverRenderingEnabled = z;
    }

    public final void updateSecondaryManeuverVisibility(int i) {
        if (i != 0) {
            if (i == 4) {
                hideSecondaryManeuver(4);
                return;
            } else {
                if (i != 8) {
                    return;
                }
                hideSecondaryManeuver(8);
                return;
            }
        }
        LayoutTileBinding layoutTileBinding = this.mainLayoutBinding;
        MapboxSecondaryManeuver mapboxSecondaryManeuver = (MapboxSecondaryManeuver) layoutTileBinding.serializer;
        MapboxPrimaryManeuver mapboxPrimaryManeuver = (MapboxPrimaryManeuver) layoutTileBinding.read;
        mapboxSecondaryManeuver.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = mapboxPrimaryManeuver.getLayoutParams();
        layoutParams.getClass();
        shadows4CzXIIdefault shadows4czxiidefault = (shadows4CzXIIdefault) layoutParams;
        shadows4czxiidefault.getDefaultViewModelCreationExtras = -1;
        shadows4czxiidefault.RemoteActionCompatParcelizer = -1;
        shadows4czxiidefault.MediaDescriptionCompat = ((MapboxSecondaryManeuver) layoutTileBinding.serializer).getId();
        requestLayout();
        mapboxPrimaryManeuver.setMaxLines(1);
    }
}
