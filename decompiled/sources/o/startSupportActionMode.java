package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class startSupportActionMode extends getOverflowIcon {
    public startSupportActionMode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int serializer(View view) {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return serializer(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    @Override // o.getOverflowIcon, android.view.View
    public final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iSerializer;
        int measuredHeight;
        int measuredHeight2;
        int i3;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == com.logistics.rider.glovo.R.id.topPanel) {
                    view = childAt;
                } else if (id == com.logistics.rider.glovo.R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != com.logistics.rider.glovo.R.id.contentPanel && id != com.logistics.rider.glovo.R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iSerializer = serializer(view2);
            measuredHeight = view2.getMeasuredHeight() - iSerializer;
            paddingBottom += iSerializer;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iSerializer = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i5 = size - paddingBottom;
        if (view2 != null) {
            int iMin = Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                i3 = iMin + iSerializer;
            } else {
                i3 = iSerializer;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            paddingBottom = (paddingBottom - iSerializer) + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i5 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i5 + measuredHeight2, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt3 = getChildAt(i7);
                if (childAt3.getVisibility() != 8) {
                    setWindowTitle setwindowtitle = (setWindowTitle) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) setwindowtitle).width == -1) {
                        int i8 = ((LinearLayout.LayoutParams) setwindowtitle).height;
                        ((LinearLayout.LayoutParams) setwindowtitle).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i2, 0);
                        ((LinearLayout.LayoutParams) setwindowtitle).height = i8;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    @Override // o.getOverflowIcon, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = getPaddingRight();
        int paddingRight2 = getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i9 = gravity & 112;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                setWindowTitle setwindowtitle = (setWindowTitle) childAt.getLayoutParams();
                int i11 = ((LinearLayout.LayoutParams) setwindowtitle).gravity;
                if (i11 < 0) {
                    i11 = 8388615 & gravity;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i7 = ((LinearLayout.LayoutParams) setwindowtitle).leftMargin + paddingLeft;
                    } else {
                        i5 = (i8 - paddingRight) - measuredWidth;
                        i6 = ((LinearLayout.LayoutParams) setwindowtitle).rightMargin;
                    }
                    if (write(i10)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i12 = paddingTop + ((LinearLayout.LayoutParams) setwindowtitle).topMargin;
                    childAt.layout(i7, i12, measuredWidth + i7, i12 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) setwindowtitle).bottomMargin + i12;
                } else {
                    i5 = ((((i8 - paddingLeft) - paddingRight2) - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) setwindowtitle).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) setwindowtitle).rightMargin;
                }
                i7 = i5 - i6;
                if (write(i10)) {
                    paddingTop += intrinsicHeight;
                }
                int i13 = paddingTop + ((LinearLayout.LayoutParams) setwindowtitle).topMargin;
                childAt.layout(i7, i13, measuredWidth + i7, i13 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) setwindowtitle).bottomMargin + i13;
            }
        }
    }
}
