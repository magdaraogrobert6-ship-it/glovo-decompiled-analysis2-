package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class getContentHints {
    public final int IconCompatParcelizer;
    public final ArrayList MediaBrowserCompatMediaItem;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final ArrayList read;
    public final animateToWithDecay serializer;
    public int write;

    public getContentHints(int i, ArrayList arrayList) {
        this.read = arrayList;
        this.IconCompatParcelizer = i;
        if (i < 0) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("Invalid start index");
        }
        this.MediaBrowserCompatMediaItem = new ArrayList();
        animateToWithDecay animatetowithdecay = new animateToWithDecay();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) this.read.get(i3);
            int i4 = contentCaptureEvent.IconCompatParcelizer;
            int i5 = contentCaptureEvent.serializer;
            animatetowithdecay.IconCompatParcelizer(i4, new AndroidContentCaptureManagerboundsUpdatesEventLoop1(i3, i2, i5));
            i2 += i5;
        }
        this.serializer = animatetowithdecay;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new getPostalCodeExtended(0, this));
    }

    public final boolean RemoteActionCompatParcelizer(int i, int i2) {
        AndroidContentCaptureManagerboundsUpdatesEventLoop1 androidContentCaptureManagerboundsUpdatesEventLoop1;
        int i3;
        int i4;
        animateToWithDecay animatetowithdecay = this.serializer;
        AndroidContentCaptureManagerboundsUpdatesEventLoop1 androidContentCaptureManagerboundsUpdatesEventLoop2 = (AndroidContentCaptureManagerboundsUpdatesEventLoop1) animatetowithdecay.serializer(i);
        if (androidContentCaptureManagerboundsUpdatesEventLoop2 == null) {
            return false;
        }
        int i5 = androidContentCaptureManagerboundsUpdatesEventLoop2.serializer;
        int i6 = i2 - androidContentCaptureManagerboundsUpdatesEventLoop2.RemoteActionCompatParcelizer;
        androidContentCaptureManagerboundsUpdatesEventLoop2.RemoteActionCompatParcelizer = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = animatetowithdecay.IconCompatParcelizer;
        long[] jArr = animatetowithdecay.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (androidContentCaptureManagerboundsUpdatesEventLoop1 = (AndroidContentCaptureManagerboundsUpdatesEventLoop1) objArr[(i7 << 3) + i9]).serializer) >= i5 && androidContentCaptureManagerboundsUpdatesEventLoop1 != androidContentCaptureManagerboundsUpdatesEventLoop2 && (i4 = i3 + i6) >= 0) {
                        androidContentCaptureManagerboundsUpdatesEventLoop1.serializer = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
