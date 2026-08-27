package com.mapbox.maps.plugin.indoorselector;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.util.Base64;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.ui.graphics.Fields;
import com.google.android.material.snackbar.Snackbar$$ExternalSyntheticLambda0;
import com.incognia.internal.ZM$$ExternalSyntheticLambda2;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.IndoorFloor;
import com.mapbox.maps.IndoorManager;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class IndoorSelectorViewImpl extends FrameLayout {
    private static int IconCompatParcelizer = 1;
    private static byte serializer = -112;
    private static int write;
    public final ImageView bottomArrow;
    public final ImageView buildingButton;
    public final LinearLayout containerLayout;
    public List indoorFloors;
    public boolean isBuildingSelected;
    public final int itemHeightPx;
    public IndoorSelectorPluginImpl presenter;
    public final SnappingScrollView scrollView;
    public String selectedFloorId;
    public final ImageView topArrow;

    public final class SnappingScrollView extends ScrollView {
        public final /* synthetic */ IndoorSelectorViewImpl this$0;

        public final void smoothSnapTo(int i) {
            int height = getChildAt(0).getHeight() - getHeight();
            if (height < 0) {
                height = 0;
            }
            smoothScrollTo(0, RangesKt.RemoteActionCompatParcelizer(i, 0, height));
        }

        @Override // android.widget.ScrollView
        public final void fling(int i) {
            IndoorSelectorViewImpl indoorSelectorViewImpl = this.this$0;
            int i2 = indoorSelectorViewImpl.itemHeightPx;
            if (getChildCount() == 0) {
                return;
            }
            smoothSnapTo(RangesKt.RemoteActionCompatParcelizer((((i2 / 2) + getScrollY()) / i2) + MathKt.write(i / 1000.0f), 0, indoorSelectorViewImpl.indoorFloors.size() - 1) * i2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SnappingScrollView(IndoorSelectorViewImpl indoorSelectorViewImpl, Context context) {
            super(context);
            context.getClass();
            this.this$0 = indoorSelectorViewImpl;
        }

        @Override // android.widget.ScrollView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            motionEvent.getClass();
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return zOnTouchEvent;
            }
            float scrollY = getScrollY();
            int i = this.this$0.itemHeightPx;
            smoothSnapTo(MathKt.write(scrollY / i) * i);
            return zOnTouchEvent;
        }
    }

    public final void updateArrows() {
        int size = this.indoorFloors.size();
        ImageView imageView = this.bottomArrow;
        ImageView imageView2 = this.topArrow;
        if (size <= 4) {
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
            return;
        }
        int scrollY = this.scrollView.getScrollY();
        int size2 = this.indoorFloors.size();
        int i = this.itemHeightPx;
        imageView2.setVisibility(scrollY > 5 ? 0 : 8);
        imageView.setVisibility(scrollY < ((size2 * i) - (i * 4)) - 5 ? 0 : 8);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0075  */
    public final void updateSelectionHighlight(String str) {
        boolean z;
        this.selectedFloorId = str;
        int color = getContext().getColor(R.color.mapbox_indoor_selected_bg);
        int color2 = getContext().getColor(R.color.mapbox_indoor_selected_text);
        int color3 = getContext().getColor(R.color.mapbox_indoor_text);
        LinearLayout linearLayout = this.containerLayout;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            childAt.getClass();
            TextView textView = (TextView) childAt;
            IndoorFloor indoorFloor = (IndoorFloor) onContentCardDismissed.read(i, this.indoorFloors);
            if (indoorFloor != null) {
                if (this.isBuildingSelected) {
                    z = false;
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{indoorFloor.getId(), str}, getCieXyz.write())).booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                textView.setBackgroundColor(z ? color : 0);
                textView.setTextColor(z ? color2 : color3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        motionEvent.getClass();
        if (motionEvent.getAction() == 0) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setIndoorSelectorVisible(boolean z) {
        setVisibility((!z || this.indoorFloors.isEmpty()) ? 8 : 0);
    }

    public final void updateFloors(String str, List list) {
        int i;
        list.getClass();
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.indoorFloors, list}, getCieXyz.write())).booleanValue();
        this.indoorFloors = list;
        this.selectedFloorId = str;
        if (!zBooleanValue) {
            LinearLayout linearLayout = this.containerLayout;
            linearLayout.removeAllViews();
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                i = this.itemHeightPx;
                if (!zHasNext) {
                    break;
                }
                IndoorFloor indoorFloor = (IndoorFloor) it.next();
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new LinearLayout.LayoutParams(i, i));
                textView.setGravity(17);
                textView.setIncludeFontPadding(false);
                textView.setText(hideCurrentlyDisplayingInAppMessage.write(3, indoorFloor.getName()));
                textView.setTextSize(2, 16.0f);
                textView.setOnClickListener(new Snackbar$$ExternalSyntheticLambda0(this, 2, indoorFloor));
                linearLayout.addView(textView);
            }
            int size = this.indoorFloors.size();
            if (size > 4) {
                size = 4;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.height = (size + 1) * i;
                layoutParams2.width = i;
                setLayoutParams(layoutParams2);
            }
            post(new ZM$$ExternalSyntheticLambda2(7, this));
        }
        updateSelectionHighlight(str);
        setIndoorSelectorVisible(!this.indoorFloors.isEmpty());
    }

    public void setIndoorGravity(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = i;
            setLayoutParams(layoutParams2);
        }
    }

    public final void updateBuildingButtonStyle() {
        int color = this.isBuildingSelected ? getContext().getColor(R.color.mapbox_indoor_selected_bg) : getContext().getColor(R.color.mapbox_indoor_bg);
        int color2 = this.isBuildingSelected ? getContext().getColor(R.color.mapbox_indoor_selected_text) : getContext().getColor(R.color.mapbox_indoor_text);
        ImageView imageView = this.buildingButton;
        imageView.setBackgroundColor(color);
        imageView.setColorFilter(color2, PorterDuff.Mode.SRC_IN);
        updateSelectionHighlight(this.selectedFloorId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndoorSelectorViewImpl(Context context) {
        super(context, null, 0);
        context.getClass();
        final int i = 0;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mapbox_indoor_item_height);
        this.itemHeightPx = dimensionPixelSize;
        float dimension = getResources().getDimension(R.dimen.mapbox_indoor_corner_radius);
        LinearLayout linearLayout = new LinearLayout(context);
        final int i2 = 1;
        linearLayout.setOrientation(1);
        this.containerLayout = linearLayout;
        SnappingScrollView snappingScrollView = new SnappingScrollView(this, context);
        snappingScrollView.setVerticalScrollBarEnabled(false);
        final int i3 = 2;
        snappingScrollView.setOverScrollMode(2);
        snappingScrollView.setFillViewport(true);
        snappingScrollView.addView(linearLayout);
        this.scrollView = snappingScrollView;
        this.indoorFloors = instance_delegatelambda0.write;
        setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, -2));
        setElevation(TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
        setClipToOutline(true);
        setClickable(true);
        setFocusable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorStateList.valueOf(context.getColor(R.color.mapbox_indoor_bg)));
        gradientDrawable.setCornerRadius(dimension);
        setBackground(gradientDrawable);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackgroundColor(imageView.getContext().getColor(R.color.mapbox_indoor_bg));
        imageView.setImageResource(R.drawable.mapbox_indoor_selector_building);
        imageView.setContentDescription(imageView.getContext().getString(R.string.mapbox_indoorselector_building));
        imageView.setColorFilter(imageView.getContext().getColor(R.color.mapbox_indoor_text), PorterDuff.Mode.SRC_IN);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 48;
        imageView.setLayoutParams(layoutParams);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.mapbox.maps.plugin.indoorselector.IndoorSelectorViewImpl$$ExternalSyntheticLambda1
            public final /* synthetic */ IndoorSelectorViewImpl f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                IndoorSelectorViewImpl indoorSelectorViewImpl = this.f$0;
                if (i4 == 0) {
                    IndoorSelectorViewImpl.SnappingScrollView snappingScrollView2 = indoorSelectorViewImpl.scrollView;
                    snappingScrollView2.smoothSnapTo((indoorSelectorViewImpl.itemHeightPx * (-1)) + snappingScrollView2.getScrollY());
                    return;
                }
                if (i4 == 1) {
                    IndoorSelectorViewImpl.SnappingScrollView snappingScrollView3 = indoorSelectorViewImpl.scrollView;
                    snappingScrollView3.smoothSnapTo(indoorSelectorViewImpl.itemHeightPx + snappingScrollView3.getScrollY());
                    return;
                }
                if (indoorSelectorViewImpl.isBuildingSelected) {
                    return;
                }
                indoorSelectorViewImpl.isBuildingSelected = true;
                indoorSelectorViewImpl.updateBuildingButtonStyle();
                IndoorSelectorPluginImpl indoorSelectorPluginImpl = indoorSelectorViewImpl.presenter;
                if (indoorSelectorPluginImpl != null) {
                    indoorSelectorPluginImpl.selectedFloorId = null;
                    IndoorManager indoorManager = indoorSelectorPluginImpl.indoorManager;
                    if (indoorManager == null) {
                        removeNodeAtDepth.serializer("indoorManager");
                        throw null;
                    }
                    indoorManager.selectFloor(null);
                    IndoorSelectorViewImpl indoorSelectorViewImpl2 = indoorSelectorPluginImpl.indoorSelectorView;
                    if (indoorSelectorViewImpl2 != null) {
                        indoorSelectorViewImpl2.updateFloors(null, indoorSelectorPluginImpl.currentFloors);
                    } else {
                        removeNodeAtDepth.serializer("indoorSelectorView");
                        throw null;
                    }
                }
            }
        });
        this.buildingButton = imageView;
        addView(imageView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(dimensionPixelSize, -2);
        layoutParams2.topMargin = dimensionPixelSize;
        addView(snappingScrollView, layoutParams2);
        ImageView imageViewCreateArrowButton = createArrowButton(true);
        this.topArrow = imageViewCreateArrowButton;
        ImageView imageViewCreateArrowButton2 = createArrowButton(false);
        this.bottomArrow = imageViewCreateArrowButton2;
        ViewGroup.LayoutParams layoutParams3 = imageViewCreateArrowButton.getLayoutParams();
        layoutParams3.getClass();
        ((FrameLayout.LayoutParams) layoutParams3).topMargin = dimensionPixelSize;
        ViewGroup.LayoutParams layoutParams4 = imageViewCreateArrowButton2.getLayoutParams();
        layoutParams4.getClass();
        ((FrameLayout.LayoutParams) layoutParams4).topMargin = dimensionPixelSize;
        addView(imageViewCreateArrowButton);
        addView(imageViewCreateArrowButton2);
        snappingScrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.mapbox.maps.plugin.indoorselector.IndoorSelectorViewImpl$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f$0.updateArrows();
            }
        });
        imageViewCreateArrowButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.mapbox.maps.plugin.indoorselector.IndoorSelectorViewImpl$$ExternalSyntheticLambda1
            public final /* synthetic */ IndoorSelectorViewImpl f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                IndoorSelectorViewImpl indoorSelectorViewImpl = this.f$0;
                if (i4 == 0) {
                    IndoorSelectorViewImpl.SnappingScrollView snappingScrollView2 = indoorSelectorViewImpl.scrollView;
                    snappingScrollView2.smoothSnapTo((indoorSelectorViewImpl.itemHeightPx * (-1)) + snappingScrollView2.getScrollY());
                    return;
                }
                if (i4 == 1) {
                    IndoorSelectorViewImpl.SnappingScrollView snappingScrollView3 = indoorSelectorViewImpl.scrollView;
                    snappingScrollView3.smoothSnapTo(indoorSelectorViewImpl.itemHeightPx + snappingScrollView3.getScrollY());
                    return;
                }
                if (indoorSelectorViewImpl.isBuildingSelected) {
                    return;
                }
                indoorSelectorViewImpl.isBuildingSelected = true;
                indoorSelectorViewImpl.updateBuildingButtonStyle();
                IndoorSelectorPluginImpl indoorSelectorPluginImpl = indoorSelectorViewImpl.presenter;
                if (indoorSelectorPluginImpl != null) {
                    indoorSelectorPluginImpl.selectedFloorId = null;
                    IndoorManager indoorManager = indoorSelectorPluginImpl.indoorManager;
                    if (indoorManager == null) {
                        removeNodeAtDepth.serializer("indoorManager");
                        throw null;
                    }
                    indoorManager.selectFloor(null);
                    IndoorSelectorViewImpl indoorSelectorViewImpl2 = indoorSelectorPluginImpl.indoorSelectorView;
                    if (indoorSelectorViewImpl2 != null) {
                        indoorSelectorViewImpl2.updateFloors(null, indoorSelectorPluginImpl.currentFloors);
                    } else {
                        removeNodeAtDepth.serializer("indoorSelectorView");
                        throw null;
                    }
                }
            }
        });
        imageViewCreateArrowButton2.setOnClickListener(new View.OnClickListener(this) { // from class: com.mapbox.maps.plugin.indoorselector.IndoorSelectorViewImpl$$ExternalSyntheticLambda1
            public final /* synthetic */ IndoorSelectorViewImpl f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i2;
                IndoorSelectorViewImpl indoorSelectorViewImpl = this.f$0;
                if (i4 == 0) {
                    IndoorSelectorViewImpl.SnappingScrollView snappingScrollView2 = indoorSelectorViewImpl.scrollView;
                    snappingScrollView2.smoothSnapTo((indoorSelectorViewImpl.itemHeightPx * (-1)) + snappingScrollView2.getScrollY());
                    return;
                }
                if (i4 == 1) {
                    IndoorSelectorViewImpl.SnappingScrollView snappingScrollView3 = indoorSelectorViewImpl.scrollView;
                    snappingScrollView3.smoothSnapTo(indoorSelectorViewImpl.itemHeightPx + snappingScrollView3.getScrollY());
                    return;
                }
                if (indoorSelectorViewImpl.isBuildingSelected) {
                    return;
                }
                indoorSelectorViewImpl.isBuildingSelected = true;
                indoorSelectorViewImpl.updateBuildingButtonStyle();
                IndoorSelectorPluginImpl indoorSelectorPluginImpl = indoorSelectorViewImpl.presenter;
                if (indoorSelectorPluginImpl != null) {
                    indoorSelectorPluginImpl.selectedFloorId = null;
                    IndoorManager indoorManager = indoorSelectorPluginImpl.indoorManager;
                    if (indoorManager == null) {
                        removeNodeAtDepth.serializer("indoorManager");
                        throw null;
                    }
                    indoorManager.selectFloor(null);
                    IndoorSelectorViewImpl indoorSelectorViewImpl2 = indoorSelectorPluginImpl.indoorSelectorView;
                    if (indoorSelectorViewImpl2 != null) {
                        indoorSelectorViewImpl2.updateFloors(null, indoorSelectorPluginImpl.currentFloors);
                    } else {
                        removeNodeAtDepth.serializer("indoorSelectorView");
                        throw null;
                    }
                }
            }
        });
    }

    private static void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ serializer);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public final ImageView createArrowButton(boolean z) {
        int i;
        int i2 = 2 % 2;
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setBackgroundColor(imageView.getContext().getColor(R.color.mapbox_indoor_bg));
        if (z) {
            int i3 = write + 37;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i = R.drawable.mapbox_indoor_selector_arrow_up;
            if (i4 == 0) {
                int i5 = 95 / 0;
            }
        } else {
            i = R.drawable.mapbox_indoor_selector_arrow_down;
        }
        imageView.setImageResource(i);
        String string = imageView.getContext().getString(z ? R.string.mapbox_indoorselector_scroll_up : R.string.mapbox_indoorselector_scroll_down);
        if (string.startsWith("%('")) {
            int i6 = write + 91;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                ((String) objArr[0]).intern();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            a(string.substring(3), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        imageView.setContentDescription(string);
        imageView.setColorFilter(imageView.getContext().getColor(R.color.mapbox_indoor_text), PorterDuff.Mode.SRC_IN);
        int i7 = this.itemHeightPx;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i7);
        layoutParams.gravity = z ? 48 : 80;
        imageView.setLayoutParams(layoutParams);
        int i8 = IconCompatParcelizer + 115;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return imageView;
    }
}
