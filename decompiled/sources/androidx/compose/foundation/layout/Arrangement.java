package androidx.compose.foundation.layout;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.FlingCancellationException;
import o.PlatformMagnifierFactoryApi29Impl;
import o.accessgetWcp;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.snapElevation;

/* JADX INFO: loaded from: classes.dex */
public abstract class Arrangement {
    public static final PlaybackStateCompatCustomAction MediaBrowserCompatMediaItem = new PlaybackStateCompatCustomAction(1);
    public static final getIntentArrayWithConfiguredBackStacklambda4 RemoteActionCompatParcelizer = new getIntentArrayWithConfiguredBackStacklambda4(1);
    public static final FlingCancellationException MediaDescriptionCompat = new FlingCancellationException(2);
    public static final accessgetWcp write = new accessgetWcp(2);
    public static final Arrangement$Center$1 IconCompatParcelizer = new Arrangement$Center$1(0);
    public static final Arrangement$Center$1 serializer = new Arrangement$Center$1(2);
    public static final Arrangement$Center$1 read = new Arrangement$Center$1(1);

    public interface Horizontal {
        void RemoteActionCompatParcelizer(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo64getSpacingD9Ej5fM() {
            return Dp.m3673constructorimpl(0.0f);
        }
    }

    public interface Vertical {
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        default float mo64getSpacingD9Ej5fM() {
            return Dp.m3673constructorimpl(0.0f);
        }

        void read(Density density, int i, int[] iArr, int[] iArr2);
    }

    static {
        Dp.m3673constructorimpl(0.0f);
    }

    public static void serializer(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i2] = i3;
                i3 += i4;
                i++;
                i2++;
            }
            return;
        }
        for (int length2 = iArr.length - 1; -1 < length2; length2--) {
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }

    public static snapElevation IconCompatParcelizer(float f) {
        return new snapElevation(f, true, new PlatformMagnifierFactoryApi29Impl());
    }

    public static void placeSpaceBetween$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float fMax = (i - i3) / Math.max(iArr.length - 1, 1);
        float f = (z && iArr.length == 1) ? fMax : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i5 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f);
            f += i7 + fMax;
            i2++;
            i6++;
        }
    }

    public static void RemoteActionCompatParcelizer(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                iArr2[length] = i5;
                i5 += i6;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i2 < length2) {
            int i8 = iArr[i2];
            iArr2[i7] = i5;
            i5 += i8;
            i2++;
            i7++;
        }
    }

    public static void placeCenter$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i5;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f);
            f += i7;
            i2++;
            i6++;
        }
    }

    public static void placeSpaceEvenly$foundation_layout(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (z) {
            float f = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f2 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    public static snapElevation serializer(float f, Alignment.Horizontal horizontal) {
        return new snapElevation(f, true, new StreamSharing$$ExternalSyntheticLambda0(14, horizontal));
    }
}
