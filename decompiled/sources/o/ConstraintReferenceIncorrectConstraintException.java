package o;

import android.content.SharedPreferences;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import dagger.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public final class ConstraintReferenceIncorrectConstraintException implements setFirstVerticalBias {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final Lazy IconCompatParcelizer;
    public final setHorizontalStyle RemoteActionCompatParcelizer;
    public final setTransactionSuccessful read;
    public volatile setFirstVerticalStyle serializer;
    public final isAdapterPositionOnScreen write;

    public ConstraintReferenceIncorrectConstraintException(Lazy lazy, setTransactionSuccessful settransactionsuccessful, setHorizontalStyle sethorizontalstyle) {
        lazy.getClass();
        settransactionsuccessful.getClass();
        this.IconCompatParcelizer = lazy;
        this.read = settransactionsuccessful;
        this.RemoteActionCompatParcelizer = sethorizontalstyle;
        this.write = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(21, this));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[DONT_INVERT, PHI: r1
  0x002c: PHI (r1v7 int) = (r1v6 int), (r1v11 int) binds: [B:8:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean write() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = MediaBrowserCompatMediaItem + 71;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            i = setHorizontalAlign.IconCompatParcelizer[RemoteActionCompatParcelizer().ordinal()];
            if (i != 0) {
                if (i != 2) {
                    return false;
                }
                i2 = MediaBrowserCompatMediaItem + 35;
                RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0 ? i != 3 : i != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return false;
                }
                if ((this.read.RemoteActionCompatParcelizer.getResources().getConfiguration().uiMode & 48) != 32) {
                    return false;
                }
            }
        } else {
            i = setHorizontalAlign.IconCompatParcelizer[RemoteActionCompatParcelizer().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                i2 = MediaBrowserCompatMediaItem + 35;
                RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return false;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return false;
            }
        }
        return true;
    }

    public final setFirstVerticalStyle RemoteActionCompatParcelizer() {
        setFirstVerticalStyle setfirstverticalstyle;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 97;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            setFirstVerticalStyle setfirstverticalstyle2 = this.serializer;
            int i3 = 87 / 0;
            if (setfirstverticalstyle2 != null) {
                return setfirstverticalstyle2;
            }
        } else {
            setFirstVerticalStyle setfirstverticalstyle3 = this.serializer;
            if (setfirstverticalstyle3 != null) {
                return setfirstverticalstyle3;
            }
        }
        if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) {
            String string = ((SharedPreferences) this.write.MediaSessionCompatResultReceiverWrapper()).getString("design_system_mode_key", null);
            setFirstVerticalStyle.Companion.getClass();
            setfirstverticalstyle = (setFirstVerticalStyle) setFirstVerticalStyle.access$getMap$cp().get(string);
            if (setfirstverticalstyle == null) {
                setfirstverticalstyle = setFirstVerticalStyle.LIGHT;
            }
        } else {
            int i4 = MediaBrowserCompatMediaItem + 35;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            setfirstverticalstyle = setFirstVerticalStyle.LIGHT;
        }
        setFirstVerticalStyle setfirstverticalstyle4 = setfirstverticalstyle;
        this.serializer = setfirstverticalstyle4;
        return setfirstverticalstyle4;
    }
}
