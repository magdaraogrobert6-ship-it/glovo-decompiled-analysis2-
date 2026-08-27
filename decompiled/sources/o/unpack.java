package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.nlp.scan.FB;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
public class unpack extends Absolutevsh68fgdefault {
    public final r8lambdad078OwOGj07HuIusaTc6uXst__s MediaBrowserCompatMediaItem;
    public int write;

    @Override // o.Absolutevsh68fgdefault, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        int i7 = 0;
        while (i7 < size) {
            View view = getVisibleChildren().get(i7);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            if ((layoutParams.gravity & 1) == 1) {
                int i8 = (i3 - i) / 2;
                int i9 = measuredWidth / 2;
                i6 = i8 - i9;
                i5 = i8 + i9;
            } else {
                i5 = paddingLeft + measuredWidth;
                i6 = paddingLeft;
            }
            int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer);
            int iRemoteActionCompatParcelizer2 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer2);
            int iRemoteActionCompatParcelizer3 = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer3);
            view.layout(i6, paddingTop, i5, measuredHeight + paddingTop);
            int measuredHeight2 = view.getMeasuredHeight() + paddingTop;
            if (i7 < size - 1) {
                measuredHeight2 += this.write;
            }
            i7++;
            paddingTop = measuredHeight2;
        }
    }

    public unpack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r8lambdad078OwOGj07HuIusaTc6uXst__s r8lambdad078owogj07huiusatc6uxst__s = new r8lambdad078OwOGj07HuIusaTc6uXst__s();
        r8lambdad078owogj07huiusatc6uxst__s.RemoteActionCompatParcelizer = new ArrayList();
        r8lambdad078owogj07huiusatc6uxst__s.write = 0;
        this.MediaBrowserCompatMediaItem = r8lambdad078owogj07huiusatc6uxst__s;
    }

    @Override // o.Absolutevsh68fgdefault, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        this.write = (int) Math.floor(TypedValue.applyDimension(1, 24.0f, this.serializer));
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        int iIconCompatParcelizer = IconCompatParcelizer(i);
        int iSerializer = serializer(i2);
        int size = ((getVisibleChildren().size() - 1) * this.write) + paddingTop + paddingBottom;
        r8lambdad078OwOGj07HuIusaTc6uXst__s r8lambdad078owogj07huiusatc6uxst__s = this.MediaBrowserCompatMediaItem;
        r8lambdad078owogj07huiusatc6uxst__s.getClass();
        r8lambdad078owogj07huiusatc6uxst__s.write = iSerializer;
        r8lambdad078owogj07huiusatc6uxst__s.RemoteActionCompatParcelizer = new ArrayList();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            boolean z = childAt.getId() == com.logistics.rider.glovo.R.id.body_scroll || childAt.getId() == com.logistics.rider.glovo.R.id.image_view;
            accessunpack accessunpackVar = new accessunpack();
            accessunpackVar.RemoteActionCompatParcelizer = childAt;
            accessunpackVar.IconCompatParcelizer = z;
            accessunpackVar.write = r8lambdad078owogj07huiusatc6uxst__s.write;
            r8lambdad078owogj07huiusatc6uxst__s.RemoteActionCompatParcelizer.add(accessunpackVar);
        }
        Objects.toString(getDisplayMetrics());
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        getMaxWidthPct();
        getMaxHeightPct();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        for (accessunpack accessunpackVar2 : r8lambdad078owogj07huiusatc6uxst__s.RemoteActionCompatParcelizer) {
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
            getCoordinator.read(accessunpackVar2.RemoteActionCompatParcelizer, iIconCompatParcelizer, iSerializer, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
        Iterator it = r8lambdad078owogj07huiusatc6uxst__s.RemoteActionCompatParcelizer.iterator();
        int iWrite = 0;
        while (it.hasNext()) {
            iWrite += ((accessunpack) it.next()).write();
        }
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        boolean z2 = iWrite + size > iSerializer;
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        if (z2) {
            int iWrite2 = 0;
            for (accessunpack accessunpackVar3 : r8lambdad078owogj07huiusatc6uxst__s.RemoteActionCompatParcelizer) {
                if (!accessunpackVar3.IconCompatParcelizer) {
                    iWrite2 += accessunpackVar3.write();
                }
            }
            ArrayList<accessunpack> arrayList = new ArrayList();
            for (accessunpack accessunpackVar4 : r8lambdad078owogj07huiusatc6uxst__s.RemoteActionCompatParcelizer) {
                if (accessunpackVar4.IconCompatParcelizer) {
                    arrayList.add(accessunpackVar4);
                }
            }
            Collections.sort(arrayList, new FB(14));
            Iterator it2 = arrayList.iterator();
            int iWrite3 = 0;
            while (it2.hasNext()) {
                iWrite3 += ((accessunpack) it2.next()).write();
            }
            int size2 = arrayList.size();
            if (size2 >= 6) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("VerticalViewGroupMeasure only supports up to 5 children");
                return;
            }
            float f2 = 0.2f;
            float f3 = 1.0f - ((size2 - 1) * 0.2f);
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
            float f4 = 0.0f;
            for (accessunpack accessunpackVar5 : arrayList) {
                float fWrite = accessunpackVar5.write() / iWrite3;
                if (fWrite > f3) {
                    f4 += fWrite - f3;
                    f = f3;
                } else {
                    f = fWrite;
                }
                if (fWrite < f2) {
                    float fMin = Math.min(f2 - fWrite, f4);
                    f4 -= fMin;
                    f = fMin + fWrite;
                }
                BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
                accessunpackVar5.write = (int) (f * ((iSerializer - size) - iWrite2));
                f2 = 0.2f;
            }
        }
        for (accessunpack accessunpackVar6 : r8lambdad078owogj07huiusatc6uxst__s.RemoteActionCompatParcelizer) {
            BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
            getCoordinator.read(accessunpackVar6.RemoteActionCompatParcelizer, iIconCompatParcelizer - (paddingLeft + paddingRight), accessunpackVar6.write, Integer.MIN_VALUE, Integer.MIN_VALUE);
            size += Absolutevsh68fgdefault.read(accessunpackVar6.RemoteActionCompatParcelizer);
        }
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        setMeasuredDimension(iIconCompatParcelizer, size);
    }
}
