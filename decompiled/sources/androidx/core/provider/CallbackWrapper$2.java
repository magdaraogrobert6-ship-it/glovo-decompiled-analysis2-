package androidx.core.provider;

import androidx.camera.view.PendingValue;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class CallbackWrapper$2 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final Object read;

    public CallbackWrapper$2(int i, ViewPager2.RecyclerViewImpl recyclerViewImpl) {
        this.IconCompatParcelizer = 1;
        this.RemoteActionCompatParcelizer = i;
        this.read = recyclerViewImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i == 0) {
            ResourcesCompat$FontCallback resourcesCompat$FontCallback = (ResourcesCompat$FontCallback) ((PendingValue) obj).serializer;
            if (resourcesCompat$FontCallback != null) {
                resourcesCompat$FontCallback.onFontRetrievalFailed(i2);
                return;
            }
            return;
        }
        if (i == 1) {
            ((RecyclerView) obj).smoothScrollToPosition(i2);
        } else if (i != 2) {
            ((MaterialCalendar) obj).RatingCompat.smoothScrollToPosition(i2);
        } else {
            ((zabk) obj).read(i2);
        }
    }

    public /* synthetic */ CallbackWrapper$2(Object obj, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.read = obj;
        this.RemoteActionCompatParcelizer = i;
    }
}
