package o;

import android.view.View;
import android.view.ViewGroup;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class h2ExternalSyntheticLambda12 implements View.OnLayoutChangeListener {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ h2ExternalSyntheticLambda12(int i, Object obj) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        float f;
        int i9 = 2 % 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (this.read != 0) {
            throw null;
        }
        gh ghVar = (gh) this.RemoteActionCompatParcelizer;
        g1 g1Var = ghVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        View view2 = ghVar.write;
        view.getClass();
        int i10 = i3 - i;
        int i11 = i4 - i2;
        if (i10 > 0) {
            int i12 = write + 85;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (i11 > 0) {
                view.removeOnLayoutChangeListener(this);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    int i14 = IconCompatParcelizer + 75;
                    write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        layoutParams.width = i10;
                        layoutParams.height = i11;
                        throw null;
                    }
                    layoutParams.width = i10;
                    layoutParams.height = i11;
                } else {
                    layoutParams = null;
                }
                view.setLayoutParams(layoutParams);
                if (view2 != null) {
                    ghVar.MediaBrowserCompatMediaItem = view2.getWidth();
                    ghVar.MediaDescriptionCompat = view2.getHeight();
                }
                View view3 = ghVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if (!(!(layoutParams2 instanceof ViewGroup.MarginLayoutParams))) {
                        int i15 = IconCompatParcelizer + 89;
                        write = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    }
                    ghVar.PlaybackStateCompatCustomAction = (ghVar.MediaBrowserCompatMediaItem - view3.getWidth()) - ((marginLayoutParams != null ? marginLayoutParams.getMarginStart() : 0) + (marginLayoutParams != null ? marginLayoutParams.getMarginEnd() : 0));
                }
                float fMin = view.getContext().getResources().getDisplayMetrics().density * 12.0f;
                int[] iArr = h1.read;
                int i17 = iArr[g1Var.ordinal()];
                if (i17 != 1) {
                    int i18 = write + 125;
                    IconCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    if (i17 != 2) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    }
                    f = fMin;
                } else {
                    f = ghVar.MediaDescriptionCompat / 2.0f;
                }
                ghVar.RatingCompat = f;
                int i20 = iArr[g1Var.ordinal()];
                if (i20 != 1) {
                    int i21 = write + 33;
                    IconCompatParcelizer = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i21 % 2 == 0 ? i20 != 2 : i20 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return;
                    } else {
                        float f2 = ghVar.PlaybackStateCompatCustomAction * 0.35f;
                        if (fMin > f2) {
                            fMin = f2;
                        }
                    }
                } else {
                    fMin = Math.min(ghVar.PlaybackStateCompatCustomAction, ghVar.MediaDescriptionCompat) / 2.0f;
                }
                ghVar.IconCompatParcelizer = fMin;
                int i22 = ghVar.MediaDescriptionCompat;
                int i23 = ghVar.PlaybackStateCompatCustomAction;
                int i24 = (i22 - i23) / 2;
                if (i24 < 0) {
                    int i25 = write + 101;
                    IconCompatParcelizer = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i26 = i25 % 2;
                    i24 = 0;
                }
                ghVar.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i24;
                int i27 = i24 + i23;
                if (i27 > i22) {
                    int i28 = write + 3;
                    IconCompatParcelizer = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i28 % 2 != 0) {
                        int i29 = 17 / 0;
                    }
                    i27 = i22;
                }
                ghVar.read = i27;
                int i30 = ghVar.MediaBrowserCompatMediaItem;
                ghVar.RemoteActionCompatParcelizer = (i30 - i23) / 2.0f;
                ghVar.MediaMetadataCompat = i24;
                ghVar.MediaSessionCompatToken = i30;
                ghVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
                ghVar.PlaybackStateCompat = i22;
                ghVar.ParcelableVolumeInfo = ghVar.RatingCompat;
                if (view2 != null) {
                    view2.setOutlineProvider(new RootMeasurePolicymeasure2(1, ghVar));
                    view2.setClipToOutline(true);
                }
                ghVar.MediaSessionCompatQueueItem = true;
            }
        }
    }
}
