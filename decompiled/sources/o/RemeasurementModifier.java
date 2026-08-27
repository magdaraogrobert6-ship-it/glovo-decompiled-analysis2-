package o;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public final class RemeasurementModifier extends androidx.recyclerview.widget.LinearSmoothScroller {
    public final /* synthetic */ int ResultReceiver = 1;

    public /* synthetic */ RemeasurementModifier(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public PointF read(int i) {
        if (this.ResultReceiver != 0) {
            return super.read(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int serializer(View view, int i) {
        if (this.ResultReceiver != 0) {
            return super.serializer(view, i);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public float write(DisplayMetrics displayMetrics) {
        return this.ResultReceiver != 1 ? super.write(displayMetrics) : 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int write(View view, int i) {
        if (this.ResultReceiver != 0) {
            return super.write(view, i);
        }
        return 0;
    }

    public RemeasurementModifier(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
