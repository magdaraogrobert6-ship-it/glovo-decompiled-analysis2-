package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class roundslo4al4 extends toBitsimpl {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object write;

    public roundslo4al4() {
        this.IconCompatParcelizer = 2;
        this.write = new ArrayList(3);
    }

    @Override // o.toBitsimpl
    public final void RemoteActionCompatParcelizer(int i) {
        int i2 = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i2 == 0) {
            androidx.viewpager2.widget.ViewPager2 viewPager2 = (androidx.viewpager2.widget.ViewPager2) obj;
            if (viewPager2.write != i) {
                viewPager2.write = i;
                viewPager2.serializer.ParcelableVolumeInfo();
                return;
            }
            return;
        }
        if (i2 == 1) {
            androidx.viewpager2.widget.ViewPager2 viewPager3 = (androidx.viewpager2.widget.ViewPager2) obj;
            viewPager3.clearFocus();
            if (viewPager3.hasFocus()) {
                viewPager3.MediaSessionCompatToken.requestFocus(2);
                return;
            }
            return;
        }
        try {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                ((toBitsimpl) it.next()).RemoteActionCompatParcelizer(i);
            }
        } catch (ConcurrentModificationException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // o.toBitsimpl
    public void serializer(int i) {
        int i2 = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i2 == 0) {
            if (i == 0) {
                ((androidx.viewpager2.widget.ViewPager2) obj).serializer();
            }
        } else {
            if (i2 != 2) {
                return;
            }
            try {
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((toBitsimpl) it.next()).serializer(i);
                }
            } catch (ConcurrentModificationException e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Adding and removing callbacks during dispatch to callbacks is not supported", e);
            }
        }
    }

    @Override // o.toBitsimpl
    public void read(int i, float f, int i2) {
        if (this.IconCompatParcelizer != 2) {
            return;
        }
        try {
            Iterator it = ((ArrayList) this.write).iterator();
            while (it.hasNext()) {
                ((toBitsimpl) it.next()).read(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    public /* synthetic */ roundslo4al4(androidx.viewpager2.widget.ViewPager2 viewPager2, int i) {
        this.IconCompatParcelizer = i;
        this.write = viewPager2;
    }
}
