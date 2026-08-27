package com.mapbox.navigation.ui.components.maneuver.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.tripdata.maneuver.model.ExitNumberComponentNode;
import com.mapbox.navigation.ui.components.maneuver.model.MapboxExitProperties;
import o.dispatchKeyEventYhN2O0w;
import o.getCieXyz;
import o.getSetText;
import o.getShowTextSubstitution;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxExitText extends AppCompatTextView {
    public Drawable exitBackground;
    public MapboxExitProperties exitProperties;
    public final Drawable leftDrawable;
    public final Drawable rightDrawable;

    public MapboxExitText(Context context) {
        super(context, null);
        this.leftDrawable = getContext().getDrawable(R.drawable.mapbox_ic_exit_arrow_left_mutcd);
        this.rightDrawable = getContext().getDrawable(R.drawable.mapbox_ic_exit_arrow_right_mutcd);
        this.exitBackground = getContext().getDrawable(R.drawable.mapbox_exit_board_background);
    }

    public final Bitmap getViewAsBitmap() {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        measure(iMakeMeasureSpec, iMakeMeasureSpec);
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        bitmapCreateBitmap.eraseColor(0);
        draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public final BitmapDrawable adjustDrawableHeight(Drawable drawable) {
        Bitmap bitmap = drawable != null ? dispatchKeyEventYhN2O0w.read(drawable, getLineHeight(), getLineHeight(), Bitmap.Config.ARGB_8888) : null;
        if (bitmap == null) {
            return null;
        }
        Resources resources = getContext().getResources();
        resources.getClass();
        return new BitmapDrawable(resources, bitmap);
    }

    public final void setExit(String str, ExitNumberComponentNode exitNumberComponentNode) {
        BitmapDrawable bitmapDrawableAdjustDrawableHeight;
        BitmapDrawable bitmapDrawableAdjustDrawableHeight2;
        String str2 = exitNumberComponentNode.text;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "left"}, getCieXyz.write())).booleanValue()) {
            MapboxExitProperties mapboxExitProperties = this.exitProperties;
            Integer numValueOf = mapboxExitProperties != null ? Integer.valueOf(mapboxExitProperties.exitLeftDrawable) : null;
            if (numValueOf != null) {
                bitmapDrawableAdjustDrawableHeight2 = adjustDrawableHeight(getContext().getDrawable(numValueOf.intValue()));
            } else {
                bitmapDrawableAdjustDrawableHeight2 = null;
            }
            if (bitmapDrawableAdjustDrawableHeight2 == null) {
                bitmapDrawableAdjustDrawableHeight2 = adjustDrawableHeight(this.leftDrawable);
            }
            setCompoundDrawablesWithIntrinsicBounds(bitmapDrawableAdjustDrawableHeight2, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "right"}, getCieXyz.write())).booleanValue();
            MapboxExitProperties mapboxExitProperties2 = this.exitProperties;
            Drawable drawable = this.rightDrawable;
            if (zBooleanValue) {
                Integer numValueOf2 = mapboxExitProperties2 != null ? Integer.valueOf(mapboxExitProperties2.exitRightDrawable) : null;
                if (numValueOf2 != null) {
                    bitmapDrawableAdjustDrawableHeight = adjustDrawableHeight(getContext().getDrawable(numValueOf2.intValue()));
                } else {
                    bitmapDrawableAdjustDrawableHeight = null;
                }
                if (bitmapDrawableAdjustDrawableHeight == null) {
                    bitmapDrawableAdjustDrawableHeight = adjustDrawableHeight(drawable);
                }
                setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, bitmapDrawableAdjustDrawableHeight, (Drawable) null);
            } else if (mapboxExitProperties2 == null) {
                setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            } else if (mapboxExitProperties2 instanceof getSetText) {
                setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, adjustDrawableHeight(getContext().getDrawable(mapboxExitProperties2.fallbackDrawable)), (Drawable) null);
            } else {
                if (!(mapboxExitProperties2 instanceof getShowTextSubstitution)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                setCompoundDrawablesWithIntrinsicBounds(adjustDrawableHeight(getContext().getDrawable(mapboxExitProperties2.fallbackDrawable)), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        setText(str2);
        setBackground(this.exitBackground);
    }
}
