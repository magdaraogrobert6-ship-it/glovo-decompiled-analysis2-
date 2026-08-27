package o;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class getContentHeight {
    public final Context MediaBrowserCompatMediaItem;
    public final TextView RatingCompat;
    public int IconCompatParcelizer = 0;
    public float serializer = -1.0f;
    public float write = -1.0f;
    public float RemoteActionCompatParcelizer = -1.0f;
    public int[] read = new int[0];
    public boolean MediaMetadataCompat = false;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public final boolean read() {
        return !(this.RatingCompat instanceof AppCompatDialogFragment);
    }

    public getContentHeight(TextView textView) {
        this.RatingCompat = textView;
        this.MediaBrowserCompatMediaItem = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new setSubtitle();
        } else {
            new setTransitioning();
        }
    }

    public static int[] read(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }
}
