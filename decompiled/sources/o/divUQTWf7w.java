package o;

import android.content.Context;
import android.util.AttributeSet;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.search.record.RecordsFileStorage;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class divUQTWf7w extends getTookFromPrecomposeMapNjRlDlw {
    public int getIndeterminateAnimationType() {
        return this.RatingCompat.serializer;
    }

    public int getIndicatorDirection() {
        return this.RatingCompat.read;
    }

    public void setIndeterminateAnimationType(int i) {
        getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = this.RatingCompat;
        if (getunspecified_hlwfpcannotations.serializer == i) {
            return;
        }
        if (write() && isIndeterminate()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        getunspecified_hlwfpcannotations.serializer = i;
        getunspecified_hlwfpcannotations.read();
        if (i == 0) {
            ScaleFactorCompanion indeterminateDrawable = getIndeterminateDrawable();
            times44nBxM0 times44nbxm0 = new times44nBxM0(getunspecified_hlwfpcannotations);
            indeterminateDrawable.serializer = times44nbxm0;
            times44nbxm0.serializer = indeterminateDrawable;
        } else {
            ScaleFactorCompanion indeterminateDrawable2 = getIndeterminateDrawable();
            getScaleXimpl getscaleximpl = new getScaleXimpl(getContext(), getunspecified_hlwfpcannotations);
            indeterminateDrawable2.serializer = getscaleximpl;
            getscaleximpl.serializer = indeterminateDrawable2;
        }
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = this.RatingCompat;
        getunspecified_hlwfpcannotations.read = i;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if ((getLayoutDirection() != 1 || getunspecified_hlwfpcannotations.read != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z = false;
            }
        }
        getunspecified_hlwfpcannotations.write = z;
        invalidate();
    }

    public divUQTWf7w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = this.RatingCompat;
        getScaleYimpl getscaleyimpl = new getScaleYimpl(getunspecified_hlwfpcannotations);
        RecordsFileStorage times44nbxm0 = getunspecified_hlwfpcannotations.serializer == 0 ? new times44nBxM0(getunspecified_hlwfpcannotations) : new getScaleXimpl(context2, getunspecified_hlwfpcannotations);
        ScaleFactorCompanion scaleFactorCompanion = new ScaleFactorCompanion(context2, getunspecified_hlwfpcannotations);
        scaleFactorCompanion.IconCompatParcelizer = getscaleyimpl;
        getscaleyimpl.serializer = scaleFactorCompanion;
        scaleFactorCompanion.serializer = times44nbxm0;
        times44nbxm0.serializer = scaleFactorCompanion;
        setIndeterminateDrawable(scaleFactorCompanion);
        setProgressDrawable(new getScaleXannotations(getContext(), getunspecified_hlwfpcannotations, new getScaleYimpl(getunspecified_hlwfpcannotations)));
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = this.RatingCompat;
        boolean z2 = true;
        if (getunspecified_hlwfpcannotations.read != 1) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if ((getLayoutDirection() != 1 || getunspecified_hlwfpcannotations.read != 2) && (getLayoutDirection() != 0 || getunspecified_hlwfpcannotations.read != 3)) {
                z2 = false;
            }
        }
        getunspecified_hlwfpcannotations.write = z2;
    }

    @Override // o.getTookFromPrecomposeMapNjRlDlw
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        this.RatingCompat.read();
    }

    @Override // o.getTookFromPrecomposeMapNjRlDlw
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        this.RatingCompat.read();
        invalidate();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        ScaleFactorCompanion indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        getScaleXannotations progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    @Override // o.getTookFromPrecomposeMapNjRlDlw
    public final void setProgressCompat(int i, boolean z) {
        getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = this.RatingCompat;
        if (getunspecified_hlwfpcannotations != null && getunspecified_hlwfpcannotations.serializer == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i, z);
    }
}
