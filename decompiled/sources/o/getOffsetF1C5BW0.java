package o;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class getOffsetF1C5BW0 {
    public static final resizeGraphicFrameIfAppropriate IconCompatParcelizer;
    public static getFontScale MediaBrowserCompatMediaItem;
    public static final onDensityChange MediaMetadataCompat;
    public static long MediaSessionCompatQueueItem;
    public static final DragAndDropNodeacceptDragAndDropTransfer1 RatingCompat;
    public static final SaversKt$$ExternalSyntheticLambda2 RemoteActionCompatParcelizer;
    public static List read;
    public static final setShape serializer;
    public static List write;
    public static final androidx.emoji2.text.EmojiProcessor ParcelableVolumeInfo = new androidx.emoji2.text.EmojiProcessor(3);
    public static final Object MediaDescriptionCompat = new Object();

    public static final void RemoteActionCompatParcelizer() {
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = IconCompatParcelizer;
        int i = resizegraphicframeifappropriate.serializer;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            traverseSelfAndDescendants traverseselfanddescendants = ((traverseSelfAndDescendants[]) resizegraphicframeifappropriate.write)[i2];
            Object obj = traverseselfanddescendants != null ? traverseselfanddescendants.get() : null;
            if (obj != null && IconCompatParcelizer((blur1fqSgw) obj)) {
                if (i3 != i2) {
                    ((traverseSelfAndDescendants[]) resizegraphicframeifappropriate.write)[i3] = traverseselfanddescendants;
                    int[] iArr = (int[]) resizegraphicframeifappropriate.read;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((traverseSelfAndDescendants[]) resizegraphicframeifappropriate.write)[i4] = null;
            ((int[]) resizegraphicframeifappropriate.read)[i4] = 0;
        }
        if (i3 != i) {
            resizegraphicframeifappropriate.serializer = i3;
        }
    }

    public static final void read() {
        write(RemoteActionCompatParcelizer);
    }

    public static final void read(getBrush getbrush) {
        long j;
        if (MediaBrowserCompatMediaItem.serializer(getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        sb.append(", disposed=");
        sb.append(getbrush.MediaSessionCompatToken);
        sb.append(", applied=");
        updateDensity updatedensity = getbrush instanceof updateDensity ? (updateDensity) getbrush : null;
        sb.append(updatedensity != null ? Boolean.valueOf(updatedensity.serializer) : "read-only");
        sb.append(", lowestPin=");
        synchronized (MediaDescriptionCompat) {
            onDensityChange ondensitychange = MediaMetadataCompat;
            j = ondensitychange.IconCompatParcelizer > 0 ? ondensitychange.RemoteActionCompatParcelizer[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final void serializer(int i) {
        onDensityChange ondensitychange = MediaMetadataCompat;
        int i2 = ondensitychange.write[i];
        ondensitychange.read(i2, ondensitychange.IconCompatParcelizer - 1);
        ondensitychange.IconCompatParcelizer--;
        long[] jArr = ondensitychange.RemoteActionCompatParcelizer;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (removeNodeAtDepth.read(jArr[i4], j) <= 0) {
                break;
            }
            ondensitychange.read(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = ondensitychange.RemoteActionCompatParcelizer;
        int i5 = ondensitychange.IconCompatParcelizer;
        while (i2 < (i5 >> 1)) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < ondensitychange.IconCompatParcelizer && removeNodeAtDepth.read(jArr2[i6], jArr2[i7]) < 0) {
                if (removeNodeAtDepth.read(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                ondensitychange.read(i6, i2);
                i2 = i6;
            } else {
                if (removeNodeAtDepth.read(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                ondensitychange.read(i7, i2);
                i2 = i7;
            }
        }
        ondensitychange.write[i] = ondensitychange.serializer;
        ondensitychange.serializer = i;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x008b A[LOOP:1: B:27:0x0054->B:37:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x008e A[EDGE_INSN: B:54:0x008e->B:38:0x008e BREAK  A[LOOP:1: B:27:0x0054->B:37:0x008b], SYNTHETIC] */
    public static final Object write(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        relocationOffsetfbGrOKE relocationoffsetfbgroke;
        Object objWrite;
        setShape setshape = serializer;
        synchronized (MediaDescriptionCompat) {
            relocationoffsetfbgroke = setshape.read;
            if (relocationoffsetfbgroke != null) {
                RatingCompat.addAndGet(1);
            }
            objWrite = write(setshape, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
        if (relocationoffsetfbgroke != null) {
            try {
                List list = write;
                onVirtualViewTranslationResponses onvirtualviewtranslationresponses = new onVirtualViewTranslationResponses(relocationoffsetfbgroke);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) list.get(i)).invoke(onvirtualviewtranslationresponses, setshape);
                }
                RatingCompat.addAndGet(-1);
            } catch (Throwable th) {
                RatingCompat.addAndGet(-1);
                throw th;
            }
        }
        synchronized (MediaDescriptionCompat) {
            RemoteActionCompatParcelizer();
            if (relocationoffsetfbgroke != null) {
                Object[] objArr = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
                long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 != length) {
                                break;
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    serializer((blur1fqSgw) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                            if (i2 != length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return objWrite;
    }

    public static final Object write(setShape setshape, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        long j = setshape.ResultReceiver;
        Object objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(MediaBrowserCompatMediaItem.read(j));
        long j2 = MediaSessionCompatQueueItem;
        MediaSessionCompatQueueItem = 1 + j2;
        getFontScale getfontscale = MediaBrowserCompatMediaItem.read(j);
        MediaBrowserCompatMediaItem = getfontscale;
        setshape.ResultReceiver = j2;
        setshape.PlaybackStateCompat = getfontscale;
        setshape.MediaBrowserCompatMediaItem = 0;
        setshape.read = null;
        setshape.ComponentActivity();
        MediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(j2);
        return objInvoke;
    }

    public static final getBrush write() {
        getBrush getbrush = (getBrush) ParcelableVolumeInfo.RemoteActionCompatParcelizer();
        return getbrush == null ? serializer : getbrush;
    }

    static {
        int i = 2;
        RemoteActionCompatParcelizer = new SaversKt$$ExternalSyntheticLambda2(i);
        getFontScale getfontscale = getFontScale.IconCompatParcelizer;
        MediaBrowserCompatMediaItem = getfontscale;
        MediaSessionCompatQueueItem = 2L;
        onDensityChange ondensitychange = new onDensityChange();
        ondensitychange.RemoteActionCompatParcelizer = new long[16];
        ondensitychange.read = new int[16];
        int[] iArr = new int[16];
        byte b = 0;
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        ondensitychange.write = iArr;
        MediaMetadataCompat = ondensitychange;
        resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = new resizeGraphicFrameIfAppropriate(b, i);
        resizegraphicframeifappropriate.read = new int[16];
        resizegraphicframeifappropriate.write = new traverseSelfAndDescendants[16];
        IconCompatParcelizer = resizegraphicframeifappropriate;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        write = instance_delegatelambda0Var;
        read = instance_delegatelambda0Var;
        long j = MediaSessionCompatQueueItem;
        MediaSessionCompatQueueItem = 1 + j;
        setShape setshape = new setShape(j, getfontscale, null, new SaversKt$$ExternalSyntheticLambda2(1));
        MediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(setshape.ResultReceiver);
        serializer = setshape;
        RatingCompat = new DragAndDropNodeacceptDragAndDropTransfer1(0);
    }

    public static final BlurKt IconCompatParcelizer(BlurKt blurKt) {
        BlurKt blurKtWrite;
        getBrush getbrushWrite = write();
        BlurKt blurKtWrite2 = write(blurKt, getbrushWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), getbrushWrite.ResultReceiver());
        if (blurKtWrite2 != null) {
            return blurKtWrite2;
        }
        synchronized (MediaDescriptionCompat) {
            getBrush getbrushWrite2 = write();
            blurKtWrite = write(blurKt, getbrushWrite2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), getbrushWrite2.ResultReceiver());
        }
        if (blurKtWrite != null) {
            return blurKtWrite;
        }
        serializer();
        throw null;
    }

    public static final BlurKt IconCompatParcelizer(BlurKt blurKt, blur1fqSgw blur1fqsgw) {
        BlurKt blurKtWrite;
        getBrush getbrushWrite = write();
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrushWrite.MediaSessionCompatQueueItem();
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem.invoke(blur1fqsgw);
        }
        BlurKt blurKtWrite2 = write(blurKt, getbrushWrite.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), getbrushWrite.ResultReceiver());
        if (blurKtWrite2 != null) {
            return blurKtWrite2;
        }
        synchronized (MediaDescriptionCompat) {
            getBrush getbrushWrite2 = write();
            BlurKt blurKtIconCompatParcelizer = blur1fqsgw.IconCompatParcelizer();
            blurKtIconCompatParcelizer.getClass();
            blurKtWrite = write(blurKtIconCompatParcelizer, getbrushWrite2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), getbrushWrite2.ResultReceiver());
            if (blurKtWrite == null) {
                serializer();
                throw null;
            }
        }
        return blurKtWrite;
    }

    public static final boolean IconCompatParcelizer(blur1fqSgw blur1fqsgw) {
        BlurKt blurKt;
        long j = MediaSessionCompatQueueItem;
        onDensityChange ondensitychange = MediaMetadataCompat;
        if (ondensitychange.IconCompatParcelizer > 0) {
            j = ondensitychange.RemoteActionCompatParcelizer[0];
        }
        BlurKt blurKt2 = null;
        BlurKt blurKtIconCompatParcelizer = null;
        int i = 0;
        for (BlurKt blurKtIconCompatParcelizer2 = blur1fqsgw.IconCompatParcelizer(); blurKtIconCompatParcelizer2 != null; blurKtIconCompatParcelizer2 = blurKtIconCompatParcelizer2.MediaSessionCompatQueueItem) {
            long j2 = blurKtIconCompatParcelizer2.MediaBrowserCompatMediaItem;
            if (j2 != 0) {
                if (removeNodeAtDepth.read(j2, j) >= 0) {
                    i++;
                } else if (blurKt2 == null) {
                    i++;
                    blurKt2 = blurKtIconCompatParcelizer2;
                } else {
                    if (removeNodeAtDepth.read(blurKtIconCompatParcelizer2.MediaBrowserCompatMediaItem, blurKt2.MediaBrowserCompatMediaItem) < 0) {
                        blurKt = blurKtIconCompatParcelizer2;
                    } else {
                        blurKt = blurKt2;
                        blurKt2 = blurKtIconCompatParcelizer2;
                    }
                    if (blurKtIconCompatParcelizer == null) {
                        blurKtIconCompatParcelizer = blur1fqsgw.IconCompatParcelizer();
                        BlurKt blurKt3 = blurKtIconCompatParcelizer;
                        while (true) {
                            if (blurKtIconCompatParcelizer == null) {
                                blurKtIconCompatParcelizer = blurKt3;
                                break;
                            }
                            if (removeNodeAtDepth.read(blurKtIconCompatParcelizer.MediaBrowserCompatMediaItem, j) >= 0) {
                                break;
                            }
                            if (removeNodeAtDepth.read(blurKt3.MediaBrowserCompatMediaItem, blurKtIconCompatParcelizer.MediaBrowserCompatMediaItem) < 0) {
                                blurKt3 = blurKtIconCompatParcelizer;
                            }
                            blurKtIconCompatParcelizer = blurKtIconCompatParcelizer.MediaSessionCompatQueueItem;
                        }
                    }
                    blurKt.MediaBrowserCompatMediaItem = 0L;
                    blurKt.RemoteActionCompatParcelizer(blurKtIconCompatParcelizer);
                }
            }
        }
        return i > 1;
    }

    public static final BlurKt RemoteActionCompatParcelizer(BlurKt blurKt, blur1fqSgw blur1fqsgw) {
        long j = MediaSessionCompatQueueItem;
        onDensityChange ondensitychange = MediaMetadataCompat;
        if (ondensitychange.IconCompatParcelizer > 0) {
            j = ondensitychange.RemoteActionCompatParcelizer[0];
        }
        BlurKt blurKt2 = null;
        BlurKt blurKt3 = null;
        for (BlurKt blurKtIconCompatParcelizer = blur1fqsgw.IconCompatParcelizer(); blurKtIconCompatParcelizer != null; blurKtIconCompatParcelizer = blurKtIconCompatParcelizer.MediaSessionCompatQueueItem) {
            long j2 = blurKtIconCompatParcelizer.MediaBrowserCompatMediaItem;
            if (j2 != 0) {
                if (j2 != 0 && removeNodeAtDepth.read(j2, j - 1) <= 0 && !getFontScale.IconCompatParcelizer.serializer(j2)) {
                    if (blurKt3 != null) {
                        if (removeNodeAtDepth.read(blurKtIconCompatParcelizer.MediaBrowserCompatMediaItem, blurKt3.MediaBrowserCompatMediaItem) >= 0) {
                            blurKt2 = blurKt3;
                            break;
                        }
                        break;
                    }
                    blurKt3 = blurKtIconCompatParcelizer;
                }
            }
            blurKt2 = blurKtIconCompatParcelizer;
            break;
        }
        if (blurKt2 != null) {
            blurKt2.MediaBrowserCompatMediaItem = Long.MAX_VALUE;
            return blurKt2;
        }
        BlurKt blurKtWrite = blurKt.write(Long.MAX_VALUE);
        blurKtWrite.MediaSessionCompatQueueItem = blur1fqsgw.IconCompatParcelizer();
        blur1fqsgw.serializer(blurKtWrite);
        return blurKtWrite;
    }

    public static final void serializer() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final getFontScale IconCompatParcelizer(getFontScale getfontscale, long j, long j2) {
        while (removeNodeAtDepth.read(j, j2) < 0) {
            getfontscale = getfontscale.RemoteActionCompatParcelizer(j);
            j++;
        }
        return getfontscale;
    }

    public static final BlurKt RemoteActionCompatParcelizer(BlurKt blurKt, blur1fqSgw blur1fqsgw, getBrush getbrush) {
        BlurKt blurKtWrite;
        if (getbrush.PlaybackStateCompat()) {
            getbrush.IconCompatParcelizer(blur1fqsgw);
        }
        long jR8lambda54BeH8ZsBru0CXI2CCSP2syNys = getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        BlurKt blurKtWrite2 = write(blurKt, jR8lambda54BeH8ZsBru0CXI2CCSP2syNys, getbrush.ResultReceiver());
        if (blurKtWrite2 == null) {
            serializer();
            throw null;
        }
        if (blurKtWrite2.MediaBrowserCompatMediaItem == getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys()) {
            return blurKtWrite2;
        }
        synchronized (MediaDescriptionCompat) {
            blurKtWrite = write(blur1fqsgw.IconCompatParcelizer(), jR8lambda54BeH8ZsBru0CXI2CCSP2syNys, getbrush.ResultReceiver());
            if (blurKtWrite == null) {
                serializer();
                throw null;
            }
            if (blurKtWrite.MediaBrowserCompatMediaItem != jR8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                BlurKt blurKtRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(blurKtWrite, blur1fqsgw);
                blurKtRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(blurKtWrite);
                blurKtRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem = getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                blurKtWrite = blurKtRemoteActionCompatParcelizer;
            }
        }
        if (blurKtWrite2.MediaBrowserCompatMediaItem != 1) {
            getbrush.IconCompatParcelizer(blur1fqsgw);
        }
        return blurKtWrite;
    }

    public static final BlurKt read(BlurKt blurKt, BlockInnerShadowNodeobtainPainter1 blockInnerShadowNodeobtainPainter1, getBrush getbrush, BlurKt blurKt2) {
        BlurKt blurKtRemoteActionCompatParcelizer;
        if (getbrush.PlaybackStateCompat()) {
            getbrush.IconCompatParcelizer(blockInnerShadowNodeobtainPainter1);
        }
        long jR8lambda54BeH8ZsBru0CXI2CCSP2syNys = getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        if (blurKt2.MediaBrowserCompatMediaItem == jR8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
            return blurKt2;
        }
        synchronized (MediaDescriptionCompat) {
            blurKtRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(blurKt, blockInnerShadowNodeobtainPainter1);
        }
        blurKtRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem = jR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (blurKt2.MediaBrowserCompatMediaItem != 1) {
            getbrush.IconCompatParcelizer(blockInnerShadowNodeobtainPainter1);
        }
        return blurKtRemoteActionCompatParcelizer;
    }

    public static final void serializer(blur1fqSgw blur1fqsgw) {
        if (IconCompatParcelizer(blur1fqsgw)) {
            resizeGraphicFrameIfAppropriate resizegraphicframeifappropriate = IconCompatParcelizer;
            int i = resizegraphicframeifappropriate.serializer;
            int iIdentityHashCode = System.identityHashCode(blur1fqsgw);
            int i2 = -1;
            if (i > 0) {
                int i3 = resizegraphicframeifappropriate.serializer - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) resizegraphicframeifappropriate.read)[i5];
                    if (i6 < iIdentityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > iIdentityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        traverseSelfAndDescendants traverseselfanddescendants = ((traverseSelfAndDescendants[]) resizegraphicframeifappropriate.write)[i5];
                        if (blur1fqsgw == (traverseselfanddescendants != null ? traverseselfanddescendants.get() : null)) {
                            i2 = i5;
                            break;
                        }
                        int i7 = i5 - 1;
                        while (true) {
                            if (-1 >= i7 || ((int[]) resizegraphicframeifappropriate.read)[i7] != iIdentityHashCode) {
                                i5++;
                                int i8 = resizegraphicframeifappropriate.serializer;
                                while (true) {
                                    if (i5 >= i8) {
                                        i2 = -(resizegraphicframeifappropriate.serializer + 1);
                                        break;
                                    }
                                    if (((int[]) resizegraphicframeifappropriate.read)[i5] != iIdentityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    traverseSelfAndDescendants traverseselfanddescendants2 = ((traverseSelfAndDescendants[]) resizegraphicframeifappropriate.write)[i5];
                                    if ((traverseselfanddescendants2 != null ? traverseselfanddescendants2.get() : null) == blur1fqsgw) {
                                        i2 = i5;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                traverseSelfAndDescendants traverseselfanddescendants3 = ((traverseSelfAndDescendants[]) resizegraphicframeifappropriate.write)[i7];
                                if ((traverseselfanddescendants3 != null ? traverseselfanddescendants3.get() : null) == blur1fqsgw) {
                                    i2 = i7;
                                    break;
                                }
                                i7--;
                            }
                        }
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            traverseSelfAndDescendants[] traverseselfanddescendantsArr = (traverseSelfAndDescendants[]) resizegraphicframeifappropriate.write;
            int length = traverseselfanddescendantsArr.length;
            if (i == length) {
                int i10 = length * 2;
                traverseSelfAndDescendants[] traverseselfanddescendantsArr2 = new traverseSelfAndDescendants[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(traverseselfanddescendantsArr, i9, traverseselfanddescendantsArr2, i11, i - i9);
                System.arraycopy((traverseSelfAndDescendants[]) resizegraphicframeifappropriate.write, 0, traverseselfanddescendantsArr2, 0, i9);
                onContentCardClicked.IconCompatParcelizer((int[]) resizegraphicframeifappropriate.read, i11, iArr, i9, i);
                onContentCardClicked.read((int[]) resizegraphicframeifappropriate.read, 0, iArr, i9, 6);
                resizegraphicframeifappropriate.write = traverseselfanddescendantsArr2;
                resizegraphicframeifappropriate.read = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(traverseselfanddescendantsArr, i9, traverseselfanddescendantsArr, i12, i - i9);
                int[] iArr2 = (int[]) resizegraphicframeifappropriate.read;
                onContentCardClicked.IconCompatParcelizer(iArr2, i12, iArr2, i9, i);
            }
            ((traverseSelfAndDescendants[]) resizegraphicframeifappropriate.write)[i9] = new traverseSelfAndDescendants(blur1fqsgw);
            ((int[]) resizegraphicframeifappropriate.read)[i9] = iIdentityHashCode;
            resizegraphicframeifappropriate.serializer++;
        }
    }

    public static final void write(getBrush getbrush, blur1fqSgw blur1fqsgw) {
        getbrush.serializer(getbrush.PlaybackStateCompatCustomAction() + 1);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmParcelableVolumeInfo = getbrush.ParcelableVolumeInfo();
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsmParcelableVolumeInfo != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsmParcelableVolumeInfo.invoke(blur1fqsgw);
        }
    }

    public static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null || r8lambdaunavo3sxub_pc9xroryotnrlvsm2 == null || r8lambdaunavo3sxub_pc9xroryotnrlvsm == r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm == null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm2 : r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
        return new PathGeometryKtWhenMappings(r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 2);
    }

    public static final getBrush read(getBrush getbrush, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        boolean z2 = getbrush instanceof updateDensity;
        if (z2 || getbrush == null) {
            return new BlurredEdgeTreatment(z2 ? (updateDensity) getbrush : null, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, false, z);
        }
        return new blurF8QBwvsdefault(getbrush, r8lambdaunavo3sxub_pc9xroryotnrlvsm, false, z);
    }

    public static final HashMap write(long j, updateDensity updatedensity, getFontScale getfontscale) {
        long[] jArr;
        long j2;
        getFontScale getfontscale2;
        long[] jArr2;
        long j3;
        relocationOffsetfbGrOKE relocationoffsetfbgrokeMediaDescriptionCompat = updatedensity.MediaDescriptionCompat();
        if (relocationoffsetfbgrokeMediaDescriptionCompat == null) {
            return null;
        }
        long jR8lambda54BeH8ZsBru0CXI2CCSP2syNys = updatedensity.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        getFontScale getfontscaleSerializer = updatedensity.ResultReceiver().RemoteActionCompatParcelizer(jR8lambda54BeH8ZsBru0CXI2CCSP2syNys).serializer(updatedensity.RemoteActionCompatParcelizer);
        Object[] objArr = relocationoffsetfbgrokeMediaDescriptionCompat.RemoteActionCompatParcelizer;
        long[] jArr3 = relocationoffsetfbgrokeMediaDescriptionCompat.IconCompatParcelizer;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        int i = 0;
        HashMap map = null;
        while (true) {
            long j4 = jArr3[i];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8;
                int i3 = 8 - ((~(i - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((j4 & 255) < 128) {
                        blur1fqSgw blur1fqsgw = (blur1fqSgw) objArr[(i << 3) + i4];
                        BlurKt blurKtIconCompatParcelizer = blur1fqsgw.IconCompatParcelizer();
                        jArr2 = jArr3;
                        long j5 = jR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        BlurKt blurKtWrite = write(blurKtIconCompatParcelizer, j, getfontscale);
                        if (blurKtWrite == null) {
                            j3 = j5;
                        } else {
                            j3 = j5;
                            BlurKt blurKtWrite2 = write(blurKtIconCompatParcelizer, j3, getfontscaleSerializer);
                            if (blurKtWrite2 != null && !blurKtWrite.equals(blurKtWrite2)) {
                                BlurKt blurKtWrite3 = write(blurKtIconCompatParcelizer, j3, updatedensity.ResultReceiver());
                                if (blurKtWrite3 == null) {
                                    serializer();
                                    throw null;
                                }
                                BlurKt blurKtRemoteActionCompatParcelizer = blur1fqsgw.RemoteActionCompatParcelizer(blurKtWrite2, blurKtWrite, blurKtWrite3);
                                if (blurKtRemoteActionCompatParcelizer == null) {
                                    return null;
                                }
                                if (map == null) {
                                    map = new HashMap();
                                }
                                map.put(blurKtWrite, blurKtRemoteActionCompatParcelizer);
                            }
                            j4 >>= 8;
                            i4++;
                            i2 = 8;
                            jR8lambda54BeH8ZsBru0CXI2CCSP2syNys = j3;
                            getfontscaleSerializer = getfontscaleSerializer;
                            jArr3 = jArr2;
                        }
                    } else {
                        jArr2 = jArr3;
                        j3 = jR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    }
                    j4 >>= 8;
                    i4++;
                    i2 = 8;
                    jR8lambda54BeH8ZsBru0CXI2CCSP2syNys = j3;
                    getfontscaleSerializer = getfontscaleSerializer;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                j2 = jR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                getfontscale2 = getfontscaleSerializer;
                if (i3 != i2) {
                    return map;
                }
            } else {
                jArr = jArr3;
                j2 = jR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                getfontscale2 = getfontscaleSerializer;
            }
            if (i == length) {
                return map;
            }
            i++;
            jR8lambda54BeH8ZsBru0CXI2CCSP2syNys = j2;
            getfontscaleSerializer = getfontscale2;
            jArr3 = jArr;
        }
    }

    public static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, boolean z) {
        if (!z) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = null;
        }
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm == null || r8lambdaunavo3sxub_pc9xroryotnrlvsm2 == null || r8lambdaunavo3sxub_pc9xroryotnrlvsm == r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm == null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm2 : r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
        return new PathGeometryKtWhenMappings(r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, 1);
    }

    public static final BlurKt serializer(BlurKt blurKt, getBrush getbrush) {
        BlurKt blurKtWrite;
        BlurKt blurKtWrite2 = write(blurKt, getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), getbrush.ResultReceiver());
        if (blurKtWrite2 != null) {
            return blurKtWrite2;
        }
        synchronized (MediaDescriptionCompat) {
            blurKtWrite = write(blurKt, getbrush.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), getbrush.ResultReceiver());
        }
        if (blurKtWrite != null) {
            return blurKtWrite;
        }
        serializer();
        throw null;
    }

    public static final BlurKt write(BlurKt blurKt, long j, getFontScale getfontscale) {
        BlurKt blurKt2 = null;
        while (blurKt != null) {
            long j2 = blurKt.MediaBrowserCompatMediaItem;
            if (j2 != 0 && removeNodeAtDepth.read(j2, j) <= 0 && !getfontscale.serializer(j2) && (blurKt2 == null || removeNodeAtDepth.read(blurKt2.MediaBrowserCompatMediaItem, blurKt.MediaBrowserCompatMediaItem) < 0)) {
                blurKt2 = blurKt;
            }
            blurKt = blurKt.MediaSessionCompatQueueItem;
        }
        if (blurKt2 != null) {
            return blurKt2;
        }
        return null;
    }
}
