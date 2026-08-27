package com.roadrunner.nafath.logger;

import android.content.Context;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.common_ui.databinding.ItemSingleChoiceBinding;
import com.common_ui.databinding.LayoutTileBinding;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.ViewAnnotationAnchor;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.route.RouterFailure;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverExitOptions;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverPrimaryOptions;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverSecondaryOptions;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverSubOptions;
import com.mapbox.navigation.ui.components.maneuver.model.ManeuverViewOptions;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxLaneGuidanceAdapter;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxManeuverView;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxManeuversList;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxPrimaryManeuver;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxSecondaryManeuver;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxStepDistance;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxSubManeuver;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxTurnIconManeuver;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxUpcomingManeuverAdapter;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import java.util.Map;
import kotlin.math.MathKt;
import o.AndroidPathEffect;
import o.UncheckedColordefault;
import o._get_messageWebView_lambda3;
import o.createFromParcel;
import o.getDefaultJoinLxFBmk8;
import o.getEnterdhqQ8s;
import o.getIndexOfFirstFeature;
import o.getSetText;
import o.getShowTextSubstitution;
import o.installForLifecycle;
import o.onTouch;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.teardownAllGlobalParametersS;
import o.tintxETnrds;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NafathLogger$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ NafathLogger$$ExternalSyntheticLambda0(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = read + 107;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i4) {
            case 0:
                ((Map) obj).getClass();
                return createfromparcel;
            case 1:
                AndroidPathEffect androidPathEffect = (AndroidPathEffect) obj;
                androidPathEffect.getClass();
                androidPathEffect.serializer("welcome");
                androidPathEffect.RemoteActionCompatParcelizer(-1);
                androidPathEffect.write = true;
                androidPathEffect.RemoteActionCompatParcelizer = false;
                return createfromparcel;
            case 2:
                AndroidPathEffect androidPathEffect2 = (AndroidPathEffect) obj;
                androidPathEffect2.getClass();
                androidPathEffect2.serializer("welcome");
                androidPathEffect2.RemoteActionCompatParcelizer(-1);
                androidPathEffect2.write = true;
                androidPathEffect2.RemoteActionCompatParcelizer = false;
                return createfromparcel;
            case 3:
                ViewAnnotationAnchorConfig.Builder builder = (ViewAnnotationAnchorConfig.Builder) obj;
                builder.getClass();
                builder.anchor(ViewAnnotationAnchor.BOTTOM);
                return createfromparcel;
            case 4:
                RouterFailure routerFailure = (RouterFailure) obj;
                routerFailure.getClass();
                return routerFailure.message;
            case 5:
                NavigationRoute navigationRoute = (NavigationRoute) obj;
                navigationRoute.getClass();
                Double dDuration = navigationRoute.getDirectionsRoute().duration();
                dDuration.getClass();
                return String.valueOf(MathKt.write(dDuration.doubleValue() / 60.0d));
            case 6:
                ViewAnnotationAnchorConfig.Builder builder2 = (ViewAnnotationAnchorConfig.Builder) obj;
                builder2.getClass();
                builder2.anchor(ViewAnnotationAnchor.TOP_RIGHT);
                return createfromparcel;
            case 7:
                ViewAnnotationAnchorConfig.Builder builder3 = (ViewAnnotationAnchorConfig.Builder) obj;
                builder3.getClass();
                builder3.anchor(ViewAnnotationAnchor.TOP_LEFT);
                return createfromparcel;
            case 8:
                ViewAnnotationAnchorConfig.Builder builder4 = (ViewAnnotationAnchorConfig.Builder) obj;
                builder4.getClass();
                builder4.anchor(ViewAnnotationAnchor.BOTTOM_RIGHT);
                return createfromparcel;
            case 9:
                ViewAnnotationAnchorConfig.Builder builder5 = (ViewAnnotationAnchorConfig.Builder) obj;
                builder5.getClass();
                builder5.anchor(ViewAnnotationAnchor.BOTTOM_LEFT);
                return createfromparcel;
            case 10:
                Context context = (Context) obj;
                context.getClass();
                MapboxManeuverView mapboxManeuverView = new MapboxManeuverView(context);
                ManeuverPrimaryOptions maneuverPrimaryOptions = new ManeuverPrimaryOptions(R.style.DhPrimaryManeuverTextAppearance, new ManeuverExitOptions(R.style.MapboxStyleExitTextForPrimary, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna)));
                ManeuverSecondaryOptions maneuverSecondaryOptions = new ManeuverSecondaryOptions(R.style.DhSecondaryManeuverTextAppearance, new ManeuverExitOptions(R.style.MapboxStyleExitTextForSecondary, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna)));
                ManeuverSubOptions maneuverSubOptions = new ManeuverSubOptions(R.style.DhSubManeuverTextAppearance, new ManeuverExitOptions(R.style.MapboxStyleExitTextForSub, new getSetText(R.drawable.mapbox_ic_exit_arrow_right_mutcd, R.drawable.mapbox_ic_exit_arrow_left_mutcd, R.drawable.mapbox_ic_exit_arrow_right_mutcd), new getShowTextSubstitution(R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_left_vienna, R.drawable.mapbox_ic_exit_arrow_right_vienna)));
                mapboxManeuverView.maneuverViewOptions = new ManeuverViewOptions(R.color.neutral_100, R.color.neutral_80, R.color.neutral_80, R.style.DhManeuverTurnIconStyle, R.style.DhStepDistanceTextAppearance, R.style.DhManeuverTurnIconStyle, maneuverPrimaryOptions, maneuverSecondaryOptions, maneuverSubOptions);
                getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8 = mapboxManeuverView.subLayoutBinding;
                ((MapboxSubManeuver) getdefaultjoinlxfbmk8.write).options = maneuverSubOptions;
                LayoutTileBinding layoutTileBinding = mapboxManeuverView.mainLayoutBinding;
                MapboxPrimaryManeuver mapboxPrimaryManeuver = (MapboxPrimaryManeuver) layoutTileBinding.read;
                mapboxPrimaryManeuver.options = maneuverPrimaryOptions;
                MapboxSecondaryManeuver mapboxSecondaryManeuver = (MapboxSecondaryManeuver) layoutTileBinding.serializer;
                mapboxSecondaryManeuver.options = maneuverSecondaryOptions;
                mapboxPrimaryManeuver.setTextAppearance(R.style.DhPrimaryManeuverTextAppearance);
                mapboxSecondaryManeuver.setTextAppearance(mapboxManeuverView.maneuverViewOptions.secondaryManeuverOptions.textAppearance);
                ((MapboxSubManeuver) getdefaultjoinlxfbmk8.write).setTextAppearance(mapboxManeuverView.maneuverViewOptions.subManeuverOptions.textAppearance);
                ((MapboxStepDistance) layoutTileBinding.write).setTextAppearance(mapboxManeuverView.maneuverViewOptions.stepDistanceTextAppearance);
                ItemSingleChoiceBinding itemSingleChoiceBinding = mapboxManeuverView.binding;
                ((ConstraintLayout) itemSingleChoiceBinding.read).setBackgroundColor(mapboxManeuverView.getContext().getColor(mapboxManeuverView.maneuverViewOptions.maneuverBackgroundColor));
                ((ConstraintLayout) itemSingleChoiceBinding.serializer).setBackgroundColor(mapboxManeuverView.getContext().getColor(mapboxManeuverView.maneuverViewOptions.subManeuverBackgroundColor));
                int i5 = mapboxManeuverView.maneuverViewOptions.laneGuidanceTurnIconManeuver;
                MapboxLaneGuidanceAdapter mapboxLaneGuidanceAdapter = mapboxManeuverView.laneGuidanceAdapter;
                mapboxLaneGuidanceAdapter.getClass();
                mapboxLaneGuidanceAdapter.wrapper = new getIndexOfFirstFeature(mapboxLaneGuidanceAdapter.context, i5);
                mapboxLaneGuidanceAdapter.notifyDataSetChanged();
                ((MapboxTurnIconManeuver) layoutTileBinding.RemoteActionCompatParcelizer).contextThemeWrapper = new getIndexOfFirstFeature(mapboxManeuverView.getContext(), mapboxManeuverView.maneuverViewOptions.turnIconManeuver);
                ((MapboxTurnIconManeuver) getdefaultjoinlxfbmk8.read).contextThemeWrapper = new getIndexOfFirstFeature(mapboxManeuverView.getContext(), mapboxManeuverView.maneuverViewOptions.turnIconManeuver);
                ((MapboxManeuversList) itemSingleChoiceBinding.write).setBackgroundColor(mapboxManeuverView.getContext().getColor(mapboxManeuverView.maneuverViewOptions.upcomingManeuverBackgroundColor));
                ManeuverViewOptions maneuverViewOptions = mapboxManeuverView.maneuverViewOptions;
                MapboxUpcomingManeuverAdapter mapboxUpcomingManeuverAdapter = mapboxManeuverView.upcomingManeuverAdapter;
                mapboxUpcomingManeuverAdapter.getClass();
                maneuverViewOptions.getClass();
                mapboxUpcomingManeuverAdapter.options = maneuverViewOptions;
                mapboxUpcomingManeuverAdapter.turnIconContextThemeWrapper = new getIndexOfFirstFeature(mapboxManeuverView.getContext(), mapboxManeuverView.maneuverViewOptions.turnIconManeuver);
                return mapboxManeuverView;
            case 11:
                Throwable th = (Throwable) obj;
                th.getClass();
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Failed to update rider state on Nafath Tweety notification", new Object[0]);
                return createfromparcel;
            case 12:
                onTouch ontouch = (onTouch) obj;
                ontouch.getClass();
                ontouch.MediaDescriptionCompat = true;
                ontouch.MediaSessionCompatQueueItem = true;
                return createfromparcel;
            case 13:
                tintxETnrds tintxetnrds = (tintxETnrds) obj;
                tintxetnrds.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("DELETE FROM history");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer();
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                    int i6 = read + 85;
                    serializer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return createfromparcel;
                } catch (Throwable th2) {
                    uncheckedColordefaultRemoteActionCompatParcelizer.close();
                    throw th2;
                }
            case 14:
                installForLifecycle installforlifecycle = (installForLifecycle) obj;
                installforlifecycle.getClass();
                TncContentKt$$ExternalSyntheticLambda2 tncContentKt$$ExternalSyntheticLambda2 = new TncContentKt$$ExternalSyntheticLambda2(4, installforlifecycle);
                if (installforlifecycle.write != null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("bind { ... } is already defined. Only one bind { ... } is allowed.");
                    return null;
                }
                int i8 = read + 1;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                installforlifecycle.write = tncContentKt$$ExternalSyntheticLambda2;
                return createfromparcel;
            case 15:
                ((getEnterdhqQ8s) obj).getClass();
                return createfromparcel;
            case 16:
                onTouch ontouch2 = (onTouch) obj;
                ontouch2.getClass();
                ontouch2.MediaDescriptionCompat = true;
                int i10 = serializer + 63;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 27 / 0;
                }
                return createfromparcel;
            case 17:
                onTouch ontouch3 = (onTouch) obj;
                ontouch3.getClass();
                ontouch3.MediaDescriptionCompat = true;
                return createfromparcel;
            case 18:
                teardownAllGlobalParametersS teardownallglobalparameterss = (teardownAllGlobalParametersS) obj;
                teardownallglobalparameterss.getClass();
                return teardownAllGlobalParametersS.write(teardownallglobalparameterss, false, !teardownallglobalparameterss.MediaSessionCompatQueueItem, 1919);
            case 19:
                _get_messageWebView_lambda3 _get_messagewebview_lambda3 = (_get_messageWebView_lambda3) obj;
                _get_messagewebview_lambda3.getClass();
                return _get_messagewebview_lambda3.MediaMetadataCompat();
            case 20:
                onTouch ontouch4 = (onTouch) obj;
                ontouch4.getClass();
                ontouch4.MediaDescriptionCompat = true;
                ontouch4.MediaMetadataCompat = true;
                ontouch4.MediaSessionCompatQueueItem = true;
                return createfromparcel;
            case 21:
                ((FocusState) obj).getClass();
                return createfromparcel;
            case 22:
                ((Throwable) obj).getClass();
                return createfromparcel;
            case 23:
                onTouch ontouch5 = (onTouch) obj;
                ontouch5.getClass();
                ontouch5.MediaDescriptionCompat = true;
                ontouch5.MediaMetadataCompat = true;
                return createfromparcel;
            case 24:
                onTouch ontouch6 = (onTouch) obj;
                ontouch6.getClass();
                ontouch6.MediaDescriptionCompat = true;
                ontouch6.MediaSessionCompatQueueItem = true;
                return createfromparcel;
            case 25:
                onTouch ontouch7 = (onTouch) obj;
                ontouch7.getClass();
                ontouch7.MediaDescriptionCompat = true;
                return createfromparcel;
            case 26:
                AndroidPathEffect androidPathEffect3 = (AndroidPathEffect) obj;
                androidPathEffect3.getClass();
                androidPathEffect3.serializer("OtpVerification/{otpPhoneNumber}/{email}");
                androidPathEffect3.RemoteActionCompatParcelizer(-1);
                androidPathEffect3.write = true;
                androidPathEffect3.RemoteActionCompatParcelizer = false;
                return createfromparcel;
            case 27:
                ((Map) obj).getClass();
                return createfromparcel;
            case 28:
                tintxETnrds tintxetnrds2 = (tintxETnrds) obj;
                tintxetnrds2.getClass();
                UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer2 = tintxetnrds2.RemoteActionCompatParcelizer("DELETE FROM status");
                try {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.IconCompatParcelizer();
                    return createfromparcel;
                } finally {
                    uncheckedColordefaultRemoteActionCompatParcelizer2.close();
                }
            default:
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                graphicsLayerScope.getClass();
                graphicsLayerScope.mo924setCompositingStrategyaDBOjCE(CompositingStrategy.Companion.m816getOffscreenNrFUSI());
                return createfromparcel;
        }
    }
}
