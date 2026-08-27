package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public class getHasAdditionOrRemovalimpl extends androidx.appcompat.widget.AppCompatImageView {
    public final int IconCompatParcelizer;

    public getHasAdditionOrRemovalimpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable == null || !adjustViewBounds) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        int i3 = this.IconCompatParcelizer;
        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsIconCompatParcelizer = IconCompatParcelizer((int) Math.ceil((intrinsicWidth * i3) / 160), (int) Math.ceil((intrinsicHeight * i3) / 160));
        int i4 = infiniteAnimationPolicyDefaultImplsIconCompatParcelizer.serializer;
        int i5 = infiniteAnimationPolicyDefaultImplsIconCompatParcelizer.RemoteActionCompatParcelizer;
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        setMeasuredDimension(i4, i5);
        int iMax = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int iMax2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = iMax;
        float f2 = iMax2;
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        float f5 = measuredWidth < iMax ? f / f3 : 1.0f;
        float f6 = measuredHeight < iMax2 ? f2 / f4 : 1.0f;
        if (f5 <= f6) {
            f5 = f6;
        }
        if (f5 > 1.0d) {
            int iCeil = (int) Math.ceil(f3 * f5);
            int iCeil2 = (int) Math.ceil(f4 * f5);
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
            InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsIconCompatParcelizer2 = IconCompatParcelizer(iCeil, iCeil2);
            setMeasuredDimension(infiniteAnimationPolicyDefaultImplsIconCompatParcelizer2.serializer, infiniteAnimationPolicyDefaultImplsIconCompatParcelizer2.RemoteActionCompatParcelizer);
        }
    }

    public final InfiniteAnimationPolicyDefaultImpls IconCompatParcelizer(int i, int i2) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i > maxWidth) {
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, -1540001960, new Object[0], iRemoteActionCompatParcelizer);
            i2 = (i2 * maxWidth) / i;
            i = maxWidth;
        }
        if (i2 > maxHeight) {
            int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer4 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer4, -1540001960, new Object[0], iRemoteActionCompatParcelizer3);
            i = (i * maxHeight) / i2;
        } else {
            maxHeight = i2;
        }
        return new InfiniteAnimationPolicyDefaultImpls(i, maxHeight);
    }
}
