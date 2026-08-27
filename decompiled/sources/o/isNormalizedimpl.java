package o;

import android.view.View;
import android.view.ViewGroup;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class isNormalizedimpl implements InterfaceC0185m {
    @Override // o.InterfaceC0185m
    public final void read(View view) {
    }

    @Override // o.InterfaceC0185m
    public final void RemoteActionCompatParcelizer(View view) {
        BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).width == -1 && ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).height == -1) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Pages must fill the whole ViewPager2 (use match_parent)");
    }
}
