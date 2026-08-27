package com.roadrunner.home;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.mapbox.maps.MapView;
import com.mapbox.maps.plugin.compass.CompassViewPlugin;
import com.mapbox.maps.plugin.compass.generated.CompassSettings;
import com.roadrunner.map.container.enabled.presentation.MapboxFragment;
import com.roadrunner.map.container.enabled.presentation.MapboxFragment$$ExternalSyntheticLambda0;
import com.ui.common.base.BaseInjectionFragment;
import o.FocusRequesterModifierKt;
import o.g3;
import o.onCreateContextMenu;
import o.onCreateOptionsMenu;
import o.onDestroyOptionsMenu;
import o.onGetLayoutInflater;
import o.requireHost;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class HomeFragment$$ExternalSyntheticLambda4 implements View.OnApplyWindowInsetsListener {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ BaseInjectionFragment read;

    public /* synthetic */ HomeFragment$$ExternalSyntheticLambda4(BaseInjectionFragment baseInjectionFragment, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = baseInjectionFragment;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int i = 2 % 2;
        int i2 = serializer + 75;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        BaseInjectionFragment baseInjectionFragment = this.read;
        int i5 = 1;
        if (i4 != 0) {
            MapboxFragment mapboxFragment = (MapboxFragment) baseInjectionFragment;
            view.getClass();
            windowInsets.getClass();
            int i6 = FocusRequesterModifierKt.write(null, windowInsets).IconCompatParcelizer.getInsets(1).write;
            if (i6 != mapboxFragment.ParcelableVolumeInfo) {
                int i7 = serializer + 49;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                mapboxFragment.ParcelableVolumeInfo = i6;
                ComponentRegistry$Builder componentRegistry$Builder = mapboxFragment.MediaDescriptionCompat;
                if (componentRegistry$Builder != null) {
                    View viewIconCompatParcelizer = ((g3) componentRegistry$Builder.serializer).IconCompatParcelizer();
                    viewIconCompatParcelizer.getClass();
                    CompassViewPlugin compass = SQLite.getCompass((MapView) viewIconCompatParcelizer);
                    MapboxFragment$$ExternalSyntheticLambda0 mapboxFragment$$ExternalSyntheticLambda0 = new MapboxFragment$$ExternalSyntheticLambda0(mapboxFragment, i5);
                    CompassSettings.Builder builder = compass.internalSettings.toBuilder();
                    mapboxFragment$$ExternalSyntheticLambda0.invoke(builder);
                    CompassSettings compassSettingsBuild = builder.build();
                    compass.setEnabled(compassSettingsBuild.enabled);
                    compass.internalSettings = compassSettingsBuild;
                    compass.applySettings();
                }
            }
            return windowInsets;
        }
        HomeFragment homeFragment = (HomeFragment) baseInjectionFragment;
        view.getClass();
        windowInsets.getClass();
        int i9 = FocusRequesterModifierKt.write(null, windowInsets).IconCompatParcelizer.getInsets(1).write;
        if (i9 != homeFragment.getSavedStateRegistry) {
            homeFragment.getSavedStateRegistry = i9;
            onDestroyOptionsMenu ondestroyoptionsmenuSerializer = homeFragment.serializer();
            ondestroyoptionsmenuSerializer.ResultReceiver = i9;
            onGetLayoutInflater ongetlayoutinflater = ondestroyoptionsmenuSerializer.MediaSessionCompatToken;
            ComposeView composeView = ondestroyoptionsmenuSerializer.serializer;
            ComposeView composeView2 = ondestroyoptionsmenuSerializer.RatingCompat;
            ComposeView composeView3 = ondestroyoptionsmenuSerializer.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            onGetLayoutInflater ongetlayoutinflater2 = ondestroyoptionsmenuSerializer.ComponentActivity;
            ComposeView composeView4 = ondestroyoptionsmenuSerializer.IconCompatParcelizer;
            composeView4.removeOnLayoutChangeListener(ongetlayoutinflater2);
            composeView3.removeOnLayoutChangeListener(ongetlayoutinflater2);
            composeView2.removeOnLayoutChangeListener(ongetlayoutinflater2);
            composeView.removeOnLayoutChangeListener(ongetlayoutinflater);
            composeView.addOnLayoutChangeListener(ongetlayoutinflater);
            composeView2.addOnLayoutChangeListener(ongetlayoutinflater2);
            composeView4.addOnLayoutChangeListener(ongetlayoutinflater2);
            composeView3.addOnLayoutChangeListener(ongetlayoutinflater2);
            BottomSheetBehavior bottomSheetBehavior = ondestroyoptionsmenuSerializer.write;
            bottomSheetBehavior.setFitToContents(false);
            bottomSheetBehavior.setHalfExpandedRatio(0.5f);
            bottomSheetBehavior.setHideable(false);
            onCreateContextMenu oncreatecontextmenu = ondestroyoptionsmenuSerializer.RemoteActionCompatParcelizer;
            bottomSheetBehavior.removeBottomSheetCallback(oncreatecontextmenu);
            bottomSheetBehavior.addBottomSheetCallback(oncreatecontextmenu);
            ondestroyoptionsmenuSerializer.MediaSessionCompatQueueItem.addOnLayoutChangeListener(new onCreateOptionsMenu(ondestroyoptionsmenuSerializer, i9));
            int i10 = write + 9;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        int i12 = FocusRequesterModifierKt.write(null, windowInsets).IconCompatParcelizer.getInsets(2).serializer;
        requireHost requirehost = homeFragment.RemoteActionCompatParcelizer;
        requirehost.getClass();
        ComposeView composeView5 = requirehost.ParcelableVolumeInfo;
        composeView5.setPadding(composeView5.getPaddingLeft(), composeView5.getPaddingTop(), composeView5.getPaddingRight(), i12);
        requireHost requirehost2 = homeFragment.RemoteActionCompatParcelizer;
        requirehost2.getClass();
        NestedScrollView nestedScrollView = requirehost2.read.RemoteActionCompatParcelizer;
        nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), nestedScrollView.getPaddingTop(), nestedScrollView.getPaddingRight(), i12);
        return windowInsets;
    }
}
