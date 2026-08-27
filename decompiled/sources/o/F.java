package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements accessgetPositiveInfinitycp {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final FrameLayout RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ F(FrameLayout frameLayout, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = frameLayout;
    }

    @Override // o.accessgetPositiveInfinitycp
    public final View getRoot() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 87;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        View view = this.RemoteActionCompatParcelizer;
        if (i5 != 0) {
            view = (androidx.fragment.app.FragmentContainerView) view;
        }
        int i6 = i2 + 23;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return view;
    }

    public FrameLayout serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        FrameLayout frameLayout = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 51;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return frameLayout;
    }

    public androidx.fragment.app.FragmentContainerView RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        androidx.fragment.app.FragmentContainerView fragmentContainerView = (androidx.fragment.app.FragmentContainerView) this.RemoteActionCompatParcelizer;
        int i5 = i3 + 45;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return fragmentContainerView;
    }

    public static F write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate;
        int i = 2 % 2;
        int i2 = read + 43;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = 0;
        if (i2 % 2 == 0 ? (viewInflate = layoutInflater.inflate(com.logistics.rider.glovo.R.layout.fragment_map_error, viewGroup, false)) != null : (viewInflate = layoutInflater.inflate(com.logistics.rider.glovo.R.layout.fragment_map_error, viewGroup, true)) != null) {
            return new F((FrameLayout) viewInflate, i3);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("rootView");
        int i4 = read + 47;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return null;
    }

    public static F read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = read + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(com.logistics.rider.glovo.R.layout.fragment_book_shift_confirmation_nav_container, viewGroup, false);
        if (viewInflate != null) {
            return new F((androidx.fragment.app.FragmentContainerView) viewInflate, 1);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("rootView");
        int i4 = IconCompatParcelizer + 79;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return null;
    }
}
