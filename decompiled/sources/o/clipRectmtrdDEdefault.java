package o;

import android.os.RemoteException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hmf.tasks.a.i$d;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Collection;
import java.util.Set;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final class clipRectmtrdDEdefault {
    public final String[] IconCompatParcelizer;
    public final Set read;
    public final int[] serializer;
    public final i$d write;

    public clipRectmtrdDEdefault(i$d i_d, int[] iArr, String[] strArr) {
        i_d.getClass();
        iArr.getClass();
        strArr.getClass();
        this.write = i_d;
        this.serializer = iArr;
        this.IconCompatParcelizer = strArr;
        if (iArr.length == strArr.length) {
            this.read = strArr.length == 0 ? ItemTouchHelperAdapter.serializer : RangesKt.write((Object) strArr[0]);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
            throw null;
        }
    }

    public final void read(Set set) {
        set.getClass();
        int[] iArr = this.serializer;
        int length = iArr.length;
        Collection collectionIconCompatParcelizer = ItemTouchHelperAdapter.serializer;
        if (length != 0) {
            if (length != 1) {
                CaptionedImageContentCardView captionedImageContentCardView = new CaptionedImageContentCardView();
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        captionedImageContentCardView.add(this.IconCompatParcelizer[i2]);
                    }
                    i++;
                    i2++;
                }
                collectionIconCompatParcelizer = RangesKt.IconCompatParcelizer(captionedImageContentCardView);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                collectionIconCompatParcelizer = this.read;
            }
        }
        if (collectionIconCompatParcelizer.isEmpty()) {
            return;
        }
        i$d i_d = this.write;
        i_d.getClass();
        collectionIconCompatParcelizer.getClass();
        androidx.room.MultiInstanceInvalidationClient multiInstanceInvalidationClient = (androidx.room.MultiInstanceInvalidationClient) i_d.read;
        if (multiInstanceInvalidationClient.PlaybackStateCompatCustomAction.get()) {
            return;
        }
        try {
            toShaderBrush toshaderbrush = multiInstanceInvalidationClient.RatingCompat;
            if (toshaderbrush != null) {
                toshaderbrush.read((String[]) collectionIconCompatParcelizer.toArray(new String[0]), multiInstanceInvalidationClient.write);
            }
        } catch (RemoteException e) {
            SentryLogcatAdapter.write("ROOM", "Cannot broadcast invalidation", e);
        }
    }
}
