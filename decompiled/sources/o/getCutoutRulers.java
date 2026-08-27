package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class getCutoutRulers extends getDisplayCutout implements WindowInsetsRulerProvider {
    public final int RemoteActionCompatParcelizer;
    public float ResultReceiver;
    public final String[] accessensureViewModelStore;
    public final WindowInsetsAnimation r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final int[] r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final float[] r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final RectF r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final SparseArray r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final android.graphics.Rect r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public final getCutoutRects r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final ColorStateList r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final android.graphics.Rect r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;

    public final void findIntersectingTextView() {
        SparseArray sparseArray;
        android.graphics.Rect rect;
        RectF rectF;
        RectF rectF2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatResultReceiverWrapper;
        float f = Float.MAX_VALUE;
        int i = 0;
        TextView textView = null;
        while (true) {
            sparseArray = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            int size = sparseArray.size();
            rect = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            rectF = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                android.graphics.Rect rect2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(RectF.intersects(rectF2, rectF) ? new android.graphics.RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, rectF2.width() * 0.5f, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, Shader.TileMode.CLAMP) : null);
                textView3.invalidate();
            }
        }
    }

    @Override // o.getDisplayCutout
    public final void serializer() {
        androidx.constraintlayout.widget.ConstraintSet constraintSet = new androidx.constraintlayout.widget.ConstraintSet();
        constraintSet.read(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != com.logistics.rider.glovo.R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(com.logistics.rider.glovo.R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iRound = this._init_lambda4;
            if (iIntValue == 2) {
                iRound = Math.round(iRound * 0.66f);
            }
            Iterator it = list.iterator();
            float size = 0.0f;
            while (it.hasNext()) {
                int id = ((View) it.next()).getId();
                HashMap map2 = constraintSet.RemoteActionCompatParcelizer;
                if (!map2.containsKey(Integer.valueOf(id))) {
                    map2.put(Integer.valueOf(id), new ShadowScope());
                }
                SimpleDropShadowElement simpleDropShadowElement = ((ShadowScope) map2.get(Integer.valueOf(id))).IconCompatParcelizer;
                simpleDropShadowElement.MediaSessionCompatQueueItem = com.logistics.rider.glovo.R.id.circle_center;
                simpleDropShadowElement.PlaybackStateCompatCustomAction = iRound;
                simpleDropShadowElement.MediaBrowserCompatMediaItem = size;
                size += 360.0f / list.size();
            }
        }
        constraintSet.applyToInternal(this);
        setConstraintSet(null);
        requestLayout();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
            if (i3 >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i3)).setVisibility(0);
            i3++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) getHasFocus.write(1, this.accessensureViewModelStore.length, 1).IconCompatParcelizer);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        findIntersectingTextView();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus / Math.max(Math.max(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM / displayMetrics.heightPixels, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public getCutoutRulers(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new android.graphics.Rect();
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new RectF();
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new android.graphics.Rect();
        SparseArray sparseArray = new SparseArray();
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = sparseArray;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMeasuredSizeozmzZPI.ClockFaceView, com.logistics.rider.glovo.R.attr.materialClockStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListIconCompatParcelizer = ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 1);
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = colorStateListIconCompatParcelizer;
        LayoutInflater.from(context).inflate(com.logistics.rider.glovo.R.layout.material_clockface_view, (ViewGroup) this, true);
        WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) findViewById(com.logistics.rider.glovo.R.id.material_clock_hand);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = windowInsetsAnimation;
        this.RemoteActionCompatParcelizer = resources.getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.material_clock_hand_padding);
        int colorForState = colorStateListIconCompatParcelizer.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListIconCompatParcelizer.getDefaultColor());
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new int[]{colorForState, colorForState, colorStateListIconCompatParcelizer.getDefaultColor()};
        windowInsetsAnimation.MediaDescriptionCompat.add(this);
        int defaultColor = FocusListener.write(context, com.logistics.rider.glovo.R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListIconCompatParcelizer2 = ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListIconCompatParcelizer2 != null ? colorStateListIconCompatParcelizer2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new getInsetsListener(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new getCutoutRects(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.accessensureViewModelStore = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.accessensureViewModelStore.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.accessensureViewModelStore.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(com.logistics.rider.glovo.R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.accessensureViewModelStore[i]);
                textView.setTag(com.logistics.rider.glovo.R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(com.logistics.rider.glovo.R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                FocusPropertiesNode.write(textView, this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
                textView.setTextColor(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
            }
        }
        WindowInsetsAnimation windowInsetsAnimation2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (windowInsetsAnimation2.RatingCompat && !z) {
            windowInsetsAnimation2.serializer = 1;
        }
        windowInsetsAnimation2.RatingCompat = z;
        windowInsetsAnimation2.invalidate();
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = resources.getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.material_time_picker_minimum_screen_height);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = resources.getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.material_time_picker_minimum_screen_width);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = resources.getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.material_clock_size);
    }
}
