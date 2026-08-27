package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class dropShadow extends androidx.constraintlayout.widget.ConstraintHelper {
    public PainterModifierKt IconCompatParcelizer;
    public int serializer;
    public int write;

    public int getType() {
        return this.write;
    }

    public void setType(int i) {
        this.write = i;
    }

    public boolean getAllowsGoneWidget() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer;
    }

    public int getMargin() {
        return this.IconCompatParcelizer.IconCompatParcelizer;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void serializer(setAlignment setalignment, boolean z) {
        int i = this.write;
        this.serializer = i;
        if (z) {
            if (i == 5) {
                this.serializer = 1;
            } else if (i == 6) {
                this.serializer = 0;
            }
        } else if (i == 5) {
            this.serializer = 0;
        } else if (i == 6) {
            this.serializer = 1;
        }
        if (setalignment instanceof PainterModifierKt) {
            ((PainterModifierKt) setalignment).write = this.serializer;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer = z;
    }

    public void setMargin(int i) {
        this.IconCompatParcelizer.IconCompatParcelizer = i;
    }

    public void setDpMargin(int i) {
        this.IconCompatParcelizer.IconCompatParcelizer = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public dropShadow(Context context) {
        super(context);
        this.MediaSessionCompatQueueItem = new int[32];
        this.RatingCompat = new HashMap();
        this.PlaybackStateCompatCustomAction = context;
        write(null);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void write(AttributeSet attributeSet) {
        super.write(attributeSet);
        this.IconCompatParcelizer = new PainterModifierKt();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, BeyondBoundsLayoutKt.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.IconCompatParcelizer.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.IconCompatParcelizer.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.MediaDescriptionCompat = this.IconCompatParcelizer;
        RemoteActionCompatParcelizer();
    }

    public dropShadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
