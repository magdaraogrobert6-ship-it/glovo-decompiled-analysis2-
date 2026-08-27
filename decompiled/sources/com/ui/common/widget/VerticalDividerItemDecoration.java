package com.ui.common.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.logistics.rider.glovo.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.BlockGraphicsLayerElement;
import o.Remeasurement;
import o.RemeasurementModifierDefaultImpls;
import o.getIntrinsicSizeNHjbRc;
import o.ilambda0;
import o.resetForTesting;
import o.setPrevious;
import o.vdefault;

/* JADX INFO: loaded from: classes4.dex */
public final class VerticalDividerItemDecoration extends RecyclerView.ItemDecoration {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final Object write;

    public VerticalDividerItemDecoration() {
        Paint paint = new Paint();
        this.write = paint;
        this.IconCompatParcelizer = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        float dimension;
        int color;
        int paddingBottom;
        int paddingRight;
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        Object obj2 = this.write;
        int i2 = 0;
        if (i != 0) {
            super.onDrawOver(canvas, recyclerView, getintrinsicsizenhjbrc);
            Paint paint = (Paint) obj2;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                ((RemeasurementModifierDefaultImpls) it.next()).getClass();
                paint.setColor(setPrevious.IconCompatParcelizer(0.0f, -65281, -16776961));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).RemoteActionCompatParcelizer()) {
                    Remeasurement remeasurement = ((CarouselLayoutManager) recyclerView.getLayoutManager()).IconCompatParcelizer;
                    float paddingTop = remeasurement.IconCompatParcelizer != 0 ? remeasurement.write.getPaddingTop() : 0;
                    Remeasurement remeasurement2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).IconCompatParcelizer;
                    if (remeasurement2.IconCompatParcelizer != 0) {
                        CarouselLayoutManager carouselLayoutManager = remeasurement2.write;
                        paddingBottom = carouselLayoutManager.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 - carouselLayoutManager.getPaddingBottom();
                    } else {
                        paddingBottom = remeasurement2.write.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                    }
                    canvas.drawLine(0.0f, paddingTop, 0.0f, paddingBottom, paint);
                } else {
                    Remeasurement remeasurement3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).IconCompatParcelizer;
                    float paddingLeft = remeasurement3.IconCompatParcelizer != 0 ? 0 : remeasurement3.write.getPaddingLeft();
                    Remeasurement remeasurement4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).IconCompatParcelizer;
                    if (remeasurement4.IconCompatParcelizer != 0) {
                        paddingRight = remeasurement4.write.menuHostHelperlambda0;
                    } else {
                        CarouselLayoutManager carouselLayoutManager2 = remeasurement4.write;
                        paddingRight = carouselLayoutManager2.menuHostHelperlambda0 - carouselLayoutManager2.getPaddingRight();
                    }
                    canvas.drawLine(paddingLeft, 0.0f, paddingRight, 0.0f, paint);
                }
            }
            return;
        }
        ilambda0 ilambda0Var = (ilambda0) obj;
        canvas.getClass();
        recyclerView.getClass();
        getintrinsicsizenhjbrc.getClass();
        Context context = (Context) obj2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.layout_spacing_06);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.layout_spacing_04);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.layout_spacing_06);
        int paddingStart = recyclerView.getPaddingStart();
        int width = recyclerView.getWidth();
        int paddingEnd = recyclerView.getPaddingEnd();
        int childCount = recyclerView.getChildCount();
        while (i2 < childCount - 1) {
            View childAt = recyclerView.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.getClass();
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((BlockGraphicsLayerElement) layoutParams)).bottomMargin + dimensionPixelSize2;
            int[] iArr = resetForTesting.write;
            int i3 = iArr[ilambda0Var.ordinal()];
            if (i3 == 1) {
                dimension = context.getResources().getDimension(R.dimen.component_dimension_divider_thin);
            } else if (i3 == 2) {
                dimension = context.getResources().getDimension(R.dimen.component_dimension_divider_medium);
            } else {
                if (i3 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                dimension = context.getResources().getDimension(R.dimen.component_dimension_divider_thick);
            }
            int i4 = (int) dimension;
            Paint paint2 = new Paint();
            int i5 = iArr[ilambda0Var.ordinal()];
            if (i5 == 1) {
                color = context.getColor(R.color.component_background_divider_thin);
            } else if (i5 == 2) {
                color = context.getColor(R.color.component_background_divider_medium);
            } else {
                if (i5 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                color = context.getColor(R.color.component_background_divider_thick);
            }
            paint2.setColor(color);
            canvas.drawRect(new Rect(paddingStart + dimensionPixelSize, bottom, (width - paddingEnd) - dimensionPixelSize3, i4 + bottom), paint2);
            i2++;
            dimensionPixelSize = dimensionPixelSize;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (this.RemoteActionCompatParcelizer != 0) {
            super.getItemOffsets(rect, view, recyclerView, getintrinsicsizenhjbrc);
            return;
        }
        rect.getClass();
        view.getClass();
        getintrinsicsizenhjbrc.getClass();
        super.getItemOffsets(rect, view, recyclerView, getintrinsicsizenhjbrc);
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        int absoluteAdapterPosition = childViewHolderInt != null ? childViewHolderInt.getAbsoluteAdapterPosition() : -1;
        Context context = (Context) this.write;
        rect.top = context.getResources().getDimensionPixelSize(R.dimen.layout_spacing_04);
        rect.bottom = context.getResources().getDimensionPixelSize(R.dimen.layout_spacing_04);
        if (absoluteAdapterPosition == 0) {
            rect.top = 0;
        }
    }

    public VerticalDividerItemDecoration(Context context, ilambda0 ilambda0Var, vdefault vdefaultVar) {
        ilambda0Var.getClass();
        this.write = context;
        this.IconCompatParcelizer = ilambda0Var;
    }
}
