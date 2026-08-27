package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView$1;
import io.grpc.LoadBalancer$Helper;

/* JADX INFO: loaded from: classes.dex */
public class drawWithRotationAndOffsetubNVwUQ extends FrameLayout {
    public static final int[] write = {android.R.attr.colorBackground};
    public boolean IconCompatParcelizer;
    public final android.graphics.Rect RatingCompat;
    public final android.graphics.Rect RemoteActionCompatParcelizer;
    public final CardView$1 read;
    public boolean serializer;

    public boolean getPreventCornerOverlap() {
        return this.serializer;
    }

    public boolean getUseCompatPadding() {
        return this.IconCompatParcelizer;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public ColorStateList getCardBackgroundColor() {
        return ((createOutlinePq9zytI) this.read.RemoteActionCompatParcelizer).read;
    }

    public float getCardElevation() {
        return ((drawWithRotationAndOffsetubNVwUQ) this.read.IconCompatParcelizer).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.RemoteActionCompatParcelizer.bottom;
    }

    public int getContentPaddingLeft() {
        return this.RemoteActionCompatParcelizer.left;
    }

    public int getContentPaddingRight() {
        return this.RemoteActionCompatParcelizer.right;
    }

    public int getContentPaddingTop() {
        return this.RemoteActionCompatParcelizer.top;
    }

    public float getMaxCardElevation() {
        return ((createOutlinePq9zytI) this.read.RemoteActionCompatParcelizer).RatingCompat;
    }

    public float getRadius() {
        return ((createOutlinePq9zytI) this.read.RemoteActionCompatParcelizer).MediaDescriptionCompat;
    }

    public void setCardElevation(float f) {
        ((drawWithRotationAndOffsetubNVwUQ) this.read.IconCompatParcelizer).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        LoadBalancer$Helper.serializer(this.read, f);
    }

    public void setRadius(float f) {
        createOutlinePq9zytI createoutlinepq9zyti = (createOutlinePq9zytI) this.read.RemoteActionCompatParcelizer;
        if (f == createoutlinepq9zyti.MediaDescriptionCompat) {
            return;
        }
        createoutlinepq9zyti.MediaDescriptionCompat = f;
        createoutlinepq9zyti.serializer(null);
        createoutlinepq9zyti.invalidateSelf();
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        createOutlinePq9zytI createoutlinepq9zyti = (createOutlinePq9zytI) this.read.RemoteActionCompatParcelizer;
        if (colorStateListValueOf == null) {
            createoutlinepq9zyti.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        createoutlinepq9zyti.read = colorStateListValueOf;
        createoutlinepq9zyti.MediaMetadataCompat.setColor(colorStateListValueOf.getColorForState(createoutlinepq9zyti.getState(), createoutlinepq9zyti.read.getDefaultColor()));
        createoutlinepq9zyti.invalidateSelf();
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.serializer) {
            this.serializer = z;
            CardView$1 cardView$1 = this.read;
            LoadBalancer$Helper.serializer(cardView$1, ((createOutlinePq9zytI) cardView$1.RemoteActionCompatParcelizer).RatingCompat);
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.IconCompatParcelizer != z) {
            this.IconCompatParcelizer = z;
            CardView$1 cardView$1 = this.read;
            LoadBalancer$Helper.serializer(cardView$1, ((createOutlinePq9zytI) cardView$1.RemoteActionCompatParcelizer).RatingCompat);
        }
    }

    public drawWithRotationAndOffsetubNVwUQ(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        android.graphics.Rect rect = new android.graphics.Rect();
        this.RemoteActionCompatParcelizer = rect;
        this.RatingCompat = new android.graphics.Rect();
        CardView$1 cardView$1 = new CardView$1(0, this);
        this.read = cardView$1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, draw.CardView, i, com.logistics.rider.glovo.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(write);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            android.graphics.Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.logistics.rider.glovo.R.color.cardview_light_background) : getResources().getColor(com.logistics.rider.glovo.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.serializer = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        createOutlinePq9zytI createoutlinepq9zyti = new createOutlinePq9zytI(colorStateListValueOf, dimension);
        cardView$1.RemoteActionCompatParcelizer = createoutlinepq9zyti;
        setBackgroundDrawable(createoutlinepq9zyti);
        setClipToOutline(true);
        setElevation(dimension2);
        LoadBalancer$Helper.serializer(cardView$1, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        createOutlinePq9zytI createoutlinepq9zyti = (createOutlinePq9zytI) this.read.RemoteActionCompatParcelizer;
        if (colorStateList == null) {
            createoutlinepq9zyti.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        createoutlinepq9zyti.read = colorStateList;
        createoutlinepq9zyti.MediaMetadataCompat.setColor(colorStateList.getColorForState(createoutlinepq9zyti.getState(), createoutlinepq9zyti.read.getDefaultColor()));
        createoutlinepq9zyti.invalidateSelf();
    }

    public drawWithRotationAndOffsetubNVwUQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.logistics.rider.glovo.R.attr.cardViewStyle);
    }
}
