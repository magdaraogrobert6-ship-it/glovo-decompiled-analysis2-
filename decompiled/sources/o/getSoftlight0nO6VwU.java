package o;

import android.view.View;
import android.view.ViewGroup;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class getSoftlight0nO6VwU {
    public final androidx.recyclerview.widget.RecyclerView.LayoutManager IconCompatParcelizer;
    public final /* synthetic */ int read;
    public int serializer = Integer.MIN_VALUE;
    public final android.graphics.Rect RemoteActionCompatParcelizer = new android.graphics.Rect();

    public getSoftlight0nO6VwU(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i) {
        this.read = i;
        this.IconCompatParcelizer = layoutManager;
    }

    public final int IconCompatParcelizer(View view) {
        int i;
        int i2;
        int i3 = this.read;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.IconCompatParcelizer;
        if (i3 != 0) {
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
            layoutManager.getClass();
            android.graphics.Rect rect = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer;
            int measuredHeight = view.getMeasuredHeight();
            int i4 = rect.top;
            i = measuredHeight + i4 + rect.bottom + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).bottomMargin;
        } else {
            BlockGraphicsLayerElement blockGraphicsLayerElement2 = (BlockGraphicsLayerElement) view.getLayoutParams();
            layoutManager.getClass();
            android.graphics.Rect rect2 = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer;
            int measuredWidth = view.getMeasuredWidth();
            int i5 = rect2.left;
            i = measuredWidth + i5 + rect2.right + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).rightMargin;
        }
        return i + i2;
    }

    public final int MediaBrowserCompatMediaItem() {
        if (Integer.MIN_VALUE == this.serializer) {
            return 0;
        }
        return MediaDescriptionCompat() - this.serializer;
    }

    public final int MediaDescriptionCompat() {
        int paddingLeft;
        int paddingRight;
        int i = this.read;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.IconCompatParcelizer;
        if (i != 0) {
            paddingLeft = layoutManager.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 - layoutManager.getPaddingTop();
            paddingRight = layoutManager.getPaddingBottom();
        } else {
            paddingLeft = layoutManager.menuHostHelperlambda0 - layoutManager.getPaddingLeft();
            paddingRight = layoutManager.getPaddingRight();
        }
        return paddingLeft - paddingRight;
    }

    public final int MediaSessionCompatQueueItem(View view) {
        int i = this.read;
        android.graphics.Rect rect = this.RemoteActionCompatParcelizer;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.IconCompatParcelizer;
        if (i != 0) {
            layoutManager.RemoteActionCompatParcelizer(view, rect);
            return rect.top;
        }
        layoutManager.RemoteActionCompatParcelizer(view, rect);
        return rect.left;
    }

    public final int RemoteActionCompatParcelizer(View view) {
        int iWrite;
        int i;
        int i2 = this.read;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.IconCompatParcelizer;
        if (i2 != 0) {
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
            layoutManager.getClass();
            iWrite = androidx.recyclerview.widget.RecyclerView.LayoutManager.IconCompatParcelizer(view);
            i = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).topMargin;
        } else {
            BlockGraphicsLayerElement blockGraphicsLayerElement2 = (BlockGraphicsLayerElement) view.getLayoutParams();
            layoutManager.getClass();
            iWrite = androidx.recyclerview.widget.RecyclerView.LayoutManager.write(view);
            i = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).leftMargin;
        }
        return iWrite - i;
    }

    public final int read(View view) {
        int i = this.read;
        android.graphics.Rect rect = this.RemoteActionCompatParcelizer;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.IconCompatParcelizer;
        if (i != 0) {
            layoutManager.RemoteActionCompatParcelizer(view, rect);
            return rect.bottom;
        }
        layoutManager.RemoteActionCompatParcelizer(view, rect);
        return rect.right;
    }

    public final int serializer(View view) {
        int i;
        int i2;
        int i3 = this.read;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.IconCompatParcelizer;
        if (i3 != 0) {
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
            layoutManager.getClass();
            android.graphics.Rect rect = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer;
            int measuredWidth = view.getMeasuredWidth();
            int i4 = rect.left;
            i = measuredWidth + i4 + rect.right + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).rightMargin;
        } else {
            BlockGraphicsLayerElement blockGraphicsLayerElement2 = (BlockGraphicsLayerElement) view.getLayoutParams();
            layoutManager.getClass();
            android.graphics.Rect rect2 = ((BlockGraphicsLayerElement) view.getLayoutParams()).serializer;
            int measuredHeight = view.getMeasuredHeight();
            int i5 = rect2.top;
            i = measuredHeight + i5 + rect2.bottom + ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).bottomMargin;
        }
        return i + i2;
    }

    public final int write() {
        int i;
        int paddingRight;
        int i2 = this.read;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.IconCompatParcelizer;
        if (i2 != 0) {
            i = layoutManager.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            paddingRight = layoutManager.getPaddingBottom();
        } else {
            i = layoutManager.menuHostHelperlambda0;
            paddingRight = layoutManager.getPaddingRight();
        }
        return i - paddingRight;
    }

    public final int write(View view) {
        int iA_;
        int i;
        int i2 = this.read;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.IconCompatParcelizer;
        if (i2 != 0) {
            BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
            layoutManager.getClass();
            iA_ = androidx.recyclerview.widget.RecyclerView.LayoutManager.serializer(view);
            i = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement).bottomMargin;
        } else {
            BlockGraphicsLayerElement blockGraphicsLayerElement2 = (BlockGraphicsLayerElement) view.getLayoutParams();
            layoutManager.getClass();
            iA_ = androidx.recyclerview.widget.RecyclerView.LayoutManager.a_(view);
            i = ((ViewGroup.MarginLayoutParams) blockGraphicsLayerElement2).rightMargin;
        }
        return iA_ + i;
    }

    public final int IconCompatParcelizer() {
        return this.read != 0 ? this.IconCompatParcelizer.getPaddingTop() : this.IconCompatParcelizer.getPaddingLeft();
    }

    public final void IconCompatParcelizer(int i) {
        if (this.read != 0) {
            this.IconCompatParcelizer.offsetChildrenVertical(i);
        } else {
            this.IconCompatParcelizer.offsetChildrenHorizontal(i);
        }
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read != 0 ? this.IconCompatParcelizer.getPaddingBottom() : this.IconCompatParcelizer.getPaddingRight();
    }

    public final int read() {
        return this.read != 0 ? this.IconCompatParcelizer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 : this.IconCompatParcelizer.menuHostHelperlambda0;
    }

    public final int serializer() {
        return this.read != 0 ? this.IconCompatParcelizer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ : this.IconCompatParcelizer.getSavedStateRegistryControllerannotations;
    }

    public static getSoftlight0nO6VwU IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i) {
        if (i == 0) {
            return new getSoftlight0nO6VwU(layoutManager, 0);
        }
        if (i == 1) {
            return new getSoftlight0nO6VwU(layoutManager, 1);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid orientation");
        return null;
    }
}
