package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Absolutevsh68fgdefault extends FrameLayout {
    public final float IconCompatParcelizer;
    public final ArrayList RemoteActionCompatParcelizer;
    public final float read;
    public final DisplayMetrics serializer;

    public DisplayMetrics getDisplayMetrics() {
        return this.serializer;
    }

    public float getMaxHeightPct() {
        return this.IconCompatParcelizer;
    }

    public float getMaxWidthPct() {
        return this.read;
    }

    public List<View> getVisibleChildren() {
        return this.RemoteActionCompatParcelizer;
    }

    public static void read(View view, int i, int i2, int i3, int i4) {
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
        int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer4, -1540001960, new Object[0], iRemoteActionCompatParcelizer3);
        view.layout(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
        super.measureChildWithMargins(view, i, i2, i3, i4);
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer4, -1540001960, new Object[0], iRemoteActionCompatParcelizer3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
        int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer4, -1540001960, new Object[0], iRemoteActionCompatParcelizer3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer);
        int i3 = getDisplayMetrics().widthPixels;
        int i4 = getDisplayMetrics().heightPixels;
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer2);
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        arrayList.clear();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            } else {
                int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
                BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer3);
            }
        }
    }

    public Absolutevsh68fgdefault(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.RemoteActionCompatParcelizer = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, RootForTestUncaughtExceptionHandler.ModalLayout, 0, 0);
        try {
            this.read = typedArrayObtainStyledAttributes.getFloat(1, -1.0f);
            this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(0, -1.0f);
            typedArrayObtainStyledAttributes.recycle();
            this.serializer = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int IconCompatParcelizer(int i) {
        if (getMaxWidthPct() <= 0.0f) {
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer);
            return View.MeasureSpec.getSize(i);
        }
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer2);
        return Math.round(((int) (getMaxWidthPct() * getDisplayMetrics().widthPixels)) / 4.0f) * 4;
    }

    public final int serializer(int i) {
        if (getMaxHeightPct() <= 0.0f) {
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer);
            return View.MeasureSpec.getSize(i);
        }
        int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer2);
        return Math.round(((int) (getMaxHeightPct() * getDisplayMetrics().heightPixels)) / 4.0f) * 4;
    }

    public final View write(int i) {
        View viewFindViewById = findViewById(i);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(i, "No such child: "));
        return null;
    }

    public static int read(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredHeight();
    }

    public static int serializer(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return view.getMeasuredWidth();
    }
}
