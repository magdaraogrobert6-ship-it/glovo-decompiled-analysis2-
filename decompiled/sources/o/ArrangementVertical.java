package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ArrangementVertical implements accessanimateDecay {
    public final tryMinWidthJN0ABg serializer;

    @Override // o.TrackpadScrollingLogic
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final SizeNode serializer(requiredSizeInqDBjuR0default requiredsizeinqdbjur0default) {
        int[] iArr;
        int i;
        tryMinWidthJN0ABg tryminwidthjn0abg = this.serializer;
        animateToWithDecay animatetowithdecay = tryminwidthjn0abg.RemoteActionCompatParcelizer;
        AnchoredDraggableKt anchoredDraggableKt = new AnchoredDraggableKt(animatetowithdecay.read + 2);
        animateToWithDecay animatetowithdecay2 = new animateToWithDecay(animatetowithdecay.read);
        int[] iArr2 = animatetowithdecay.serializer;
        Object[] objArr = animatetowithdecay.IconCompatParcelizer;
        long[] jArr = animatetowithdecay.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            AspectRatioKt aspectRatioKt = (AspectRatioKt) objArr[i6];
                            anchoredDraggableKt.IconCompatParcelizer(i7);
                            animatetowithdecay2.IconCompatParcelizer(i7, new onViewAttachedToWindowlambda0(requiredsizeinqdbjur0default.serializer.invoke(aspectRatioKt.IconCompatParcelizer), aspectRatioKt.write));
                            i = 8;
                        } else {
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr2 = iArr2;
                    }
                    iArr = iArr2;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr2 = iArr;
            }
        }
        if (!animatetowithdecay.RemoteActionCompatParcelizer(0)) {
            anchoredDraggableKt.write();
        }
        if (!animatetowithdecay.RemoteActionCompatParcelizer(tryminwidthjn0abg.write)) {
            anchoredDraggableKt.IconCompatParcelizer(tryminwidthjn0abg.write);
        }
        int i8 = anchoredDraggableKt.RemoteActionCompatParcelizer;
        if (i8 != 0) {
            int[] iArr3 = anchoredDraggableKt.read;
            iArr3.getClass();
            Arrays.sort(iArr3, 0, i8);
        }
        return new width3ABfNKs(anchoredDraggableKt, animatetowithdecay2, tryminwidthjn0abg.write);
    }

    public ArrangementVertical(tryMinWidthJN0ABg tryminwidthjn0abg) {
        this.serializer = tryminwidthjn0abg;
    }
}
