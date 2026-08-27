package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class onDrag extends isEnabledannotations {
    public static final onDrag RemoteActionCompatParcelizer = new onDrag(1, 0, 2);

    @Override // o.isEnabledannotations
    public final void write(accessgetDragAndDropManager accessgetdraganddropmanager, getAddressCountry getaddresscountry, getType gettype, firstDescendantOrNull firstdescendantornull, drag12SF9DM drag12sf9dm) {
        int[] iArr;
        AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes1;
        int iRemoteActionCompatParcelizer;
        int i;
        int i2 = 0;
        int i3 = accessgetdraganddropmanager.read(0);
        if (gettype.MediaSessionCompatResultReceiverWrapper != 0) {
            getCreditCardExpirationDay.read("Cannot move a group while inserting");
        }
        if (i3 < 0) {
            getCreditCardExpirationDay.read("Parameter offset is out of bounds");
        }
        if (i3 == 0) {
            return;
        }
        int i4 = gettype.IconCompatParcelizer;
        int i5 = gettype.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i6 = gettype.read;
        int i7 = i4;
        while (true) {
            iArr = gettype.PlaybackStateCompatCustomAction;
            if (i3 <= 0) {
                break;
            }
            i7 += iArr[(gettype.MediaBrowserCompatMediaItem(i7) * 5) + 3];
            if (i7 > i6) {
                getCreditCardExpirationDay.read("Parameter offset is out of bounds");
            }
            i3--;
        }
        int i8 = iArr[(gettype.MediaBrowserCompatMediaItem(i7) * 5) + 3];
        int i9 = gettype.read(gettype.PlaybackStateCompatCustomAction, gettype.MediaBrowserCompatMediaItem(gettype.IconCompatParcelizer));
        int i10 = gettype.read(gettype.PlaybackStateCompatCustomAction, gettype.MediaBrowserCompatMediaItem(i7));
        int i11 = i7 + i8;
        int i12 = gettype.read(gettype.PlaybackStateCompatCustomAction, gettype.MediaBrowserCompatMediaItem(i11));
        int i13 = i12 - i10;
        gettype.read(i13, Math.max(gettype.IconCompatParcelizer - 1, 0));
        gettype.PlaybackStateCompat(i8);
        int[] iArr2 = gettype.PlaybackStateCompatCustomAction;
        int iMediaBrowserCompatMediaItem = gettype.MediaBrowserCompatMediaItem(i11) * 5;
        onContentCardClicked.IconCompatParcelizer(iArr2, gettype.MediaBrowserCompatMediaItem(i4) * 5, iArr2, iMediaBrowserCompatMediaItem, (i8 * 5) + iMediaBrowserCompatMediaItem);
        if (i13 > 0) {
            Object[] objArr = gettype.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            int iRemoteActionCompatParcelizer2 = gettype.RemoteActionCompatParcelizer(i10 + i13);
            System.arraycopy(objArr, iRemoteActionCompatParcelizer2, objArr, i9, gettype.RemoteActionCompatParcelizer(i12 + i13) - iRemoteActionCompatParcelizer2);
        }
        int i14 = i10 + i13;
        int i15 = i14 - i9;
        int i16 = gettype.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        int i17 = gettype.ResultReceiver;
        int length = gettype.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.length;
        int i18 = gettype.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i19 = i4;
        while (i19 < i4 + i8) {
            int iMediaBrowserCompatMediaItem2 = gettype.MediaBrowserCompatMediaItem(i19);
            int i20 = gettype.read(iArr2, iMediaBrowserCompatMediaItem2);
            if (i18 < iMediaBrowserCompatMediaItem2) {
                i = i16;
            } else {
                i = i16;
                i2 = i;
            }
            iArr2[(iMediaBrowserCompatMediaItem2 * 5) + 4] = getType.write(getType.write(i20 - i15, i2, i17, length), gettype.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, gettype.ResultReceiver, gettype.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.length);
            i19++;
            i16 = i;
            i15 = i15;
            i17 = i17;
            i2 = 0;
        }
        int iIconCompatParcelizer = gettype.IconCompatParcelizer();
        int iSerializer = AbstractC0170getTimestamp.serializer(gettype.write, i11, iIconCompatParcelizer);
        ArrayList arrayList = new ArrayList();
        if (iSerializer >= 0) {
            while (iSerializer < gettype.write.size() && (iRemoteActionCompatParcelizer = gettype.RemoteActionCompatParcelizer((androidContentCaptureManagercurrentSemanticsNodes1 = (AndroidContentCaptureManagercurrentSemanticsNodes1) gettype.write.get(iSerializer)))) >= i11 && iRemoteActionCompatParcelizer < i11 + i8) {
                arrayList.add(androidContentCaptureManagercurrentSemanticsNodes1);
            }
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            AndroidContentCaptureManagercurrentSemanticsNodes1 androidContentCaptureManagercurrentSemanticsNodes2 = (AndroidContentCaptureManagercurrentSemanticsNodes1) arrayList.get(i21);
            int iRemoteActionCompatParcelizer3 = gettype.RemoteActionCompatParcelizer(androidContentCaptureManagercurrentSemanticsNodes2) + (i4 - i11);
            if (iRemoteActionCompatParcelizer3 >= gettype.MediaSessionCompatToken) {
                androidContentCaptureManagercurrentSemanticsNodes2.IconCompatParcelizer = -(iIconCompatParcelizer - iRemoteActionCompatParcelizer3);
            } else {
                androidContentCaptureManagercurrentSemanticsNodes2.IconCompatParcelizer = iRemoteActionCompatParcelizer3;
            }
            gettype.write.add(AbstractC0170getTimestamp.serializer(gettype.write, iRemoteActionCompatParcelizer3, iIconCompatParcelizer), androidContentCaptureManagercurrentSemanticsNodes2);
        }
        if (gettype.write(i11, i8)) {
            getCreditCardExpirationDay.read("Unexpectedly removed anchors");
        }
        gettype.read(i5, gettype.read, i4);
        if (i13 > 0) {
            gettype.write(i14, i13, i11 - 1);
        }
    }

    public onDrag(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
