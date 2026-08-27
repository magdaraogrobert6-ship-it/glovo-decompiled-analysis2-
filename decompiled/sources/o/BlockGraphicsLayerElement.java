package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class BlockGraphicsLayerElement extends ViewGroup.MarginLayoutParams {
    public boolean IconCompatParcelizer;
    public androidx.recyclerview.widget.RecyclerView.ViewHolder MediaMetadataCompat;
    public boolean read;
    public final android.graphics.Rect serializer;

    public BlockGraphicsLayerElement(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.serializer = new android.graphics.Rect();
        this.IconCompatParcelizer = true;
        this.read = false;
    }

    public BlockGraphicsLayerElement(int i, int i2) {
        super(i, i2);
        this.serializer = new android.graphics.Rect();
        this.IconCompatParcelizer = true;
        this.read = false;
    }

    public BlockGraphicsLayerElement(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.serializer = new android.graphics.Rect();
        this.IconCompatParcelizer = true;
        this.read = false;
    }

    public BlockGraphicsLayerElement(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.serializer = new android.graphics.Rect();
        this.IconCompatParcelizer = true;
        this.read = false;
    }

    public BlockGraphicsLayerElement(BlockGraphicsLayerElement blockGraphicsLayerElement) {
        super((ViewGroup.LayoutParams) blockGraphicsLayerElement);
        this.serializer = new android.graphics.Rect();
        this.IconCompatParcelizer = true;
        this.read = false;
    }
}
