package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.location.nlp.scan.FB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class placeApparentToRealOffsetaW9wMui extends androidx.appcompat.widget.Toolbar {
    public static final ImageView.ScaleType[] onBackPressedDispatcher_delegatelambda00 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public boolean addOnConfigurationChangedListener;
    public boolean addOnContextAvailableListener;
    public Boolean onBackPressedDispatcher_delegatelambda0;
    public ImageView.ScaleType onBackPressedDispatcher_delegatelambda010;
    public Integer onBackPressedInput_delegatelambda0;

    public ImageView.ScaleType getLogoScaleType() {
        return this.onBackPressedDispatcher_delegatelambda010;
    }

    public Integer getNavigationIconTint() {
        return this.onBackPressedInput_delegatelambda0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.onBackPressedInput_delegatelambda0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.onBackPressedInput_delegatelambda0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof SubcomposeSlotReusePolicy) {
            SubcomposeLayoutKtSubcomposeLayout2.serializer(this, (SubcomposeSlotReusePolicy) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ImageView imageView2 = null;
        if (this.addOnContextAvailableListener || this.addOnConfigurationChangedListener) {
            ArrayList arrayListIconCompatParcelizer = SLOperationCompanion.IconCompatParcelizer(this, getTitle());
            boolean zIsEmpty = arrayListIconCompatParcelizer.isEmpty();
            FB fb = SLOperationCompanion.read;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListIconCompatParcelizer, fb);
            ArrayList arrayListIconCompatParcelizer2 = SLOperationCompanion.IconCompatParcelizer(this, getSubtitle());
            TextView textView2 = arrayListIconCompatParcelizer2.isEmpty() ? null : (TextView) Collections.max(arrayListIconCompatParcelizer2, fb);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.addOnContextAvailableListener && textView != null) {
                    read(textView, pair);
                }
                if (this.addOnConfigurationChangedListener && textView2 != null) {
                    read(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt2 = getChildAt(i7);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.onBackPressedDispatcher_delegatelambda0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.onBackPressedDispatcher_delegatelambda010;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof SubcomposeSlotReusePolicy) {
            ((SubcomposeSlotReusePolicy) background).MediaBrowserCompatMediaItem(f);
        }
    }

    public final void read(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void serializer(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof AlertControllerButtonHandler;
        if (z) {
            ((AlertControllerButtonHandler) menu).MediaDescriptionCompat();
        }
        super.serializer(i);
        if (z) {
            ((AlertControllerButtonHandler) menu).MediaBrowserCompatMediaItem();
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.onBackPressedDispatcher_delegatelambda0;
        if (bool == null || bool.booleanValue() != z) {
            this.onBackPressedDispatcher_delegatelambda0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.onBackPressedDispatcher_delegatelambda010 != scaleType) {
            this.onBackPressedDispatcher_delegatelambda010 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIconTint(int i) {
        this.onBackPressedInput_delegatelambda0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.addOnConfigurationChangedListener != z) {
            this.addOnConfigurationChangedListener = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.addOnContextAvailableListener != z) {
            this.addOnContextAvailableListener = z;
            requestLayout();
        }
    }

    public placeApparentToRealOffsetaW9wMui(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, com.logistics.rider.glovo.R.attr.toolbarStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArray = getDeactivateOutOfFrameNjRlDlw.read(context2, attributeSet, setMeasuredSizeozmzZPI.MaterialToolbar, com.logistics.rider.glovo.R.attr.toolbarStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArray.hasValue(2)) {
            setNavigationIconTint(typedArray.getColor(2, -1));
        }
        this.addOnContextAvailableListener = typedArray.getBoolean(4, false);
        this.addOnConfigurationChangedListener = typedArray.getBoolean(3, false);
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = onBackPressedDispatcher_delegatelambda00;
            if (i < scaleTypeArr.length) {
                this.onBackPressedDispatcher_delegatelambda010 = scaleTypeArr[i];
            }
        }
        if (typedArray.hasValue(0)) {
            this.onBackPressedDispatcher_delegatelambda0 = Boolean.valueOf(typedArray.getBoolean(0, false));
        }
        typedArray.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy();
            subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            subcomposeSlotReusePolicy.write(context2);
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(getElevation());
            setBackground(subcomposeSlotReusePolicy);
        }
    }
}
