package o;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class BlendModeColorFilterHelperExternalSyntheticApiModelOutline0 {
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ BlendModeColorFilterHelperExternalSyntheticApiModelOutline0(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = layoutManager;
    }

    public final int read() {
        int i = this.serializer;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.RemoteActionCompatParcelizer;
        return i != 0 ? layoutManager.getPaddingTop() : layoutManager.getPaddingLeft();
    }

    public final int serializer() {
        int i;
        int paddingRight;
        int i2 = this.serializer;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.RemoteActionCompatParcelizer;
        if (i2 != 0) {
            i = layoutManager.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            paddingRight = layoutManager.getPaddingBottom();
        } else {
            i = layoutManager.menuHostHelperlambda0;
            paddingRight = layoutManager.getPaddingRight();
        }
        return i - paddingRight;
    }

    public final int IconCompatParcelizer(View view) {
        int iWrite;
        int i;
        if (this.serializer != 0) {
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
            iWrite = androidx.recyclerview.widget.RecyclerView.LayoutManager.IconCompatParcelizer(view);
            i = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).topMargin;
        } else {
            BlockGraphicsLayerElement blockGraphicsLayerElement2 = (BlockGraphicsLayerElement) view.getLayoutParams();
            iWrite = androidx.recyclerview.widget.RecyclerView.LayoutManager.write(view);
            i = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).leftMargin;
        }
        return iWrite - i;
    }

    public final int RemoteActionCompatParcelizer(View view) {
        int iA_;
        int i;
        if (this.serializer != 0) {
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
            iA_ = androidx.recyclerview.widget.RecyclerView.LayoutManager.serializer(view);
            i = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).bottomMargin;
        } else {
            BlockGraphicsLayerElement blockGraphicsLayerElement2 = (BlockGraphicsLayerElement) view.getLayoutParams();
            iA_ = androidx.recyclerview.widget.RecyclerView.LayoutManager.a_(view);
            i = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).rightMargin;
        }
        return iA_ + i;
    }
}
