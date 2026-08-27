package o;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public class updateDensity extends getBrush {
    public static final int[] write = new int[0];
    public ArrayList IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaDescriptionCompat;
    public int[] MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RatingCompat;
    public getFontScale RemoteActionCompatParcelizer;
    public relocationOffsetfbGrOKE read;
    public boolean serializer;

    @Override // o.getBrush
    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: merged with bridge method [inline-methods] */
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem() {
        return this.RatingCompat;
    }

    public relocationOffsetfbGrOKE MediaDescriptionCompat() {
        return this.read;
    }

    @Override // o.getBrush
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM ParcelableVolumeInfo() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.getBrush
    public boolean PlaybackStateCompat() {
        return false;
    }

    @Override // o.getBrush
    public int PlaybackStateCompatCustomAction() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // o.getBrush
    public void serializer(int i) {
        this.MediaBrowserCompatMediaItem = i;
    }

    public void write(relocationOffsetfbGrOKE relocationoffsetfbgroke) {
        this.read = relocationoffsetfbgroke;
    }

    @Override // o.getBrush
    public final void MediaSessionCompatToken() {
        int length = this.MediaMetadataCompat.length;
        for (int i = 0; i < length; i++) {
            getOffsetF1C5BW0.serializer(this.MediaMetadataCompat[i]);
        }
        ComponentActivity();
    }

    @Override // o.getBrush
    public final void RatingCompat() {
        getOffsetF1C5BW0.MediaBrowserCompatMediaItem = getOffsetF1C5BW0.MediaBrowserCompatMediaItem.read(r8lambda54BeH8ZsBru0CXI2CCSP2syNys()).read(this.RemoteActionCompatParcelizer);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[LOOP:0: B:18:0x0039->B:35:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0091 A[EDGE_INSN: B:39:0x0091->B:36:0x0091 BREAK  A[LOOP:0: B:18:0x0039->B:35:0x008e], SYNTHETIC] */
    @Override // o.getBrush
    public void RemoteActionCompatParcelizer() {
        if (this.MediaSessionCompatQueueItem <= 0) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("no pending nested snapshots");
        }
        int i = this.MediaSessionCompatQueueItem - 1;
        this.MediaSessionCompatQueueItem = i;
        if (i != 0 || this.serializer) {
            return;
        }
        relocationOffsetfbGrOKE relocationoffsetfbgrokeMediaDescriptionCompat = MediaDescriptionCompat();
        if (relocationoffsetfbgrokeMediaDescriptionCompat != null) {
            if (this.serializer) {
                getContentCaptureSessionuiannotations.write("Unsupported operation on a snapshot that has been applied");
            }
            write((relocationOffsetfbGrOKE) null);
            long jR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            Object[] objArr = relocationoffsetfbgrokeMediaDescriptionCompat.RemoteActionCompatParcelizer;
            long[] jArr = relocationoffsetfbgrokeMediaDescriptionCompat.IconCompatParcelizer;
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
                                for (BlurKt blurKtIconCompatParcelizer = ((blur1fqSgw) objArr[(i2 << 3) + i4]).IconCompatParcelizer(); blurKtIconCompatParcelizer != null; blurKtIconCompatParcelizer = blurKtIconCompatParcelizer.MediaSessionCompatQueueItem) {
                                    long j2 = blurKtIconCompatParcelizer.MediaBrowserCompatMediaItem;
                                    if (j2 == jR8lambda54BeH8ZsBru0CXI2CCSP2syNys || onContentCardDismissed.write(this.RemoteActionCompatParcelizer, Long.valueOf(j2))) {
                                        SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = getOffsetF1C5BW0.RemoteActionCompatParcelizer;
                                        blurKtIconCompatParcelizer.MediaBrowserCompatMediaItem = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 != length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        MediaSessionCompatResultReceiverWrapper();
    }

    public final void read(long j) {
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            this.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x010a A[Catch: all -> 0x0175, LOOP:2: B:46:0x00da->B:56:0x010a, LOOP_END, TryCatch #0 {, blocks: (B:41:0x00c0, B:43:0x00d0, B:46:0x00da, B:48:0x00e4, B:50:0x00ee, B:52:0x00f8, B:53:0x0102, B:56:0x010a, B:58:0x0110, B:61:0x011a, B:63:0x0124, B:65:0x012e, B:67:0x0138, B:68:0x0143, B:74:0x0154, B:75:0x0157, B:77:0x015b, B:79:0x0162, B:80:0x016e), top: B:90:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x010e A[EDGE_INSN: B:96:0x010e->B:57:0x010e BREAK  A[LOOP:2: B:46:0x00da->B:56:0x010a], SYNTHETIC] */
    public TuplesKt write() {
        HashMap mapWrite;
        List list;
        relocationOffsetfbGrOKE relocationoffsetfbgroke;
        relocationOffsetfbGrOKE relocationoffsetfbgrokeMediaDescriptionCompat = MediaDescriptionCompat();
        if (relocationoffsetfbgrokeMediaDescriptionCompat != null) {
            long j = getOffsetF1C5BW0.serializer.ResultReceiver;
            mapWrite = getOffsetF1C5BW0.write(j, this, getOffsetF1C5BW0.MediaBrowserCompatMediaItem.read(j));
        } else {
            mapWrite = null;
        }
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            getOffsetF1C5BW0.read(this);
            if (relocationoffsetfbgrokeMediaDescriptionCompat == null || relocationoffsetfbgrokeMediaDescriptionCompat.write == 0) {
                RatingCompat();
                setShape setshape = getOffsetF1C5BW0.serializer;
                relocationOffsetfbGrOKE relocationoffsetfbgroke2 = setshape.read;
                getOffsetF1C5BW0.write(setshape, getOffsetF1C5BW0.RemoteActionCompatParcelizer);
                if (relocationoffsetfbgroke2 == null || !relocationoffsetfbgroke2.read()) {
                    list = instance_delegatelambda0Var;
                    relocationoffsetfbgroke = null;
                } else {
                    list = getOffsetF1C5BW0.write;
                    relocationoffsetfbgroke = relocationoffsetfbgroke2;
                }
            } else {
                setShape setshape2 = getOffsetF1C5BW0.serializer;
                TuplesKt tuplesKtWrite = write(getOffsetF1C5BW0.MediaSessionCompatQueueItem, relocationoffsetfbgrokeMediaDescriptionCompat, mapWrite, getOffsetF1C5BW0.MediaBrowserCompatMediaItem.read(setshape2.ResultReceiver));
                if (!tuplesKtWrite.equals(getDensity.write)) {
                    return tuplesKtWrite;
                }
                RatingCompat();
                relocationoffsetfbgroke = setshape2.read;
                getOffsetF1C5BW0.write(setshape2, getOffsetF1C5BW0.RemoteActionCompatParcelizer);
                write((relocationOffsetfbGrOKE) null);
                setshape2.read = null;
                list = getOffsetF1C5BW0.write;
            }
            this.serializer = true;
            if (relocationoffsetfbgroke != null) {
                onVirtualViewTranslationResponses onvirtualviewtranslationresponses = new onVirtualViewTranslationResponses(relocationoffsetfbgroke);
                if (!relocationoffsetfbgroke.write()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) list.get(i)).invoke(onvirtualviewtranslationresponses, this);
                    }
                }
            }
            if (relocationoffsetfbgrokeMediaDescriptionCompat != null && relocationoffsetfbgrokeMediaDescriptionCompat.read()) {
                onVirtualViewTranslationResponses onvirtualviewtranslationresponses2 = new onVirtualViewTranslationResponses(relocationoffsetfbgrokeMediaDescriptionCompat);
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) list.get(i2)).invoke(onvirtualviewtranslationresponses2, this);
                }
            }
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                MediaSessionCompatToken();
                getOffsetF1C5BW0.RemoteActionCompatParcelizer();
                if (relocationoffsetfbgroke != null) {
                    Object[] objArr = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
                    long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j2 = jArr[i3];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i3 != length) {
                                    break;
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j2 & 255) < 128) {
                                        getOffsetF1C5BW0.serializer((blur1fqSgw) objArr[(i3 << 3) + i5]);
                                    }
                                    j2 >>= 8;
                                }
                                if (i4 != 8) {
                                    break;
                                }
                                if (i3 != length) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                }
                if (relocationoffsetfbgrokeMediaDescriptionCompat != null) {
                    Object[] objArr2 = relocationoffsetfbgrokeMediaDescriptionCompat.RemoteActionCompatParcelizer;
                    long[] jArr2 = relocationoffsetfbgrokeMediaDescriptionCompat.IconCompatParcelizer;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j3 = jArr2[i6];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j3 & 255) < 128) {
                                        getOffsetF1C5BW0.serializer((blur1fqSgw) objArr2[(i6 << 3) + i8]);
                                    }
                                    j3 >>= 8;
                                }
                                if (i7 != 8) {
                                    break;
                                }
                            }
                            if (i6 == length2) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
                ArrayList arrayList = this.IconCompatParcelizer;
                if (arrayList != null) {
                    int size3 = arrayList.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        getOffsetF1C5BW0.serializer((blur1fqSgw) arrayList.get(i9));
                    }
                }
                this.IconCompatParcelizer = null;
            }
            return getDensity.write;
        }
    }

    public updateDensity(long j, getFontScale getfontscale, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        super(j, getfontscale);
        this.RatingCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.RemoteActionCompatParcelizer = getFontScale.IconCompatParcelizer;
        this.MediaMetadataCompat = write;
        this.MediaSessionCompatQueueItem = 1;
    }

    @Override // o.getBrush
    public void IconCompatParcelizer() {
        this.MediaSessionCompatQueueItem++;
    }

    public final void MediaMetadataCompat() {
        read(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        if (this.serializer || this.MediaSessionCompatToken) {
            return;
        }
        long jR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            long j = getOffsetF1C5BW0.MediaSessionCompatQueueItem;
            getOffsetF1C5BW0.MediaSessionCompatQueueItem = j + 1;
            serializer(j);
            getOffsetF1C5BW0.MediaBrowserCompatMediaItem = getOffsetF1C5BW0.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        }
        read(getOffsetF1C5BW0.IconCompatParcelizer(ResultReceiver(), jR8lambda54BeH8ZsBru0CXI2CCSP2syNys + 1, r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
    }

    @Override // o.getBrush
    public void read() {
        if (this.serializer || this.MediaSessionCompatToken) {
            return;
        }
        MediaMetadataCompat();
    }

    @Override // o.getBrush
    public void serializer() {
        if (this.MediaSessionCompatToken) {
            return;
        }
        this.MediaSessionCompatToken = true;
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            ComponentActivity();
        }
        RemoteActionCompatParcelizer();
    }

    @Override // o.getBrush
    public void IconCompatParcelizer(blur1fqSgw blur1fqsgw) {
        relocationOffsetfbGrOKE relocationoffsetfbgrokeMediaDescriptionCompat = MediaDescriptionCompat();
        if (relocationoffsetfbgrokeMediaDescriptionCompat == null) {
            relocationOffsetfbGrOKE relocationoffsetfbgroke = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
            relocationoffsetfbgrokeMediaDescriptionCompat = new relocationOffsetfbGrOKE();
            write(relocationoffsetfbgrokeMediaDescriptionCompat);
        }
        relocationoffsetfbgrokeMediaDescriptionCompat.serializer(blur1fqsgw);
    }

    @Override // o.getBrush
    public getBrush read(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        getAlpha getalpha;
        if (this.MediaSessionCompatToken) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("Cannot use a disposed snapshot");
        }
        if (this.serializer && this.MediaSessionCompatResultReceiverWrapper < 0) {
            getContentCaptureSessionuiannotations.write("Unsupported operation on a disposed or applied snapshot");
        }
        long jR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        read(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        Object obj = getOffsetF1C5BW0.MediaDescriptionCompat;
        synchronized (obj) {
            long j = getOffsetF1C5BW0.MediaSessionCompatQueueItem;
            getOffsetF1C5BW0.MediaSessionCompatQueueItem = j + 1;
            getOffsetF1C5BW0.MediaBrowserCompatMediaItem = getOffsetF1C5BW0.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(j);
            getalpha = new getAlpha(j, getOffsetF1C5BW0.IconCompatParcelizer(ResultReceiver(), jR8lambda54BeH8ZsBru0CXI2CCSP2syNys + 1, j), getOffsetF1C5BW0.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm, MediaSessionCompatQueueItem(), true), this);
        }
        if (this.serializer || this.MediaSessionCompatToken) {
            return getalpha;
        }
        long jR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        synchronized (obj) {
            long j2 = getOffsetF1C5BW0.MediaSessionCompatQueueItem;
            getOffsetF1C5BW0.MediaSessionCompatQueueItem = j2 + 1;
            serializer(j2);
            getOffsetF1C5BW0.MediaBrowserCompatMediaItem = getOffsetF1C5BW0.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        }
        read(getOffsetF1C5BW0.IconCompatParcelizer(ResultReceiver(), jR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 + 1, r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
        return getalpha;
    }

    public updateDensity serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        getBlendMode0nO6VwU getblendmode0no6vwu;
        if (this.MediaSessionCompatToken) {
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer("Cannot use a disposed snapshot");
        }
        if (this.serializer && this.MediaSessionCompatResultReceiverWrapper < 0) {
            getContentCaptureSessionuiannotations.write("Unsupported operation on a disposed or applied snapshot");
        }
        read(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        Object obj = getOffsetF1C5BW0.MediaDescriptionCompat;
        synchronized (obj) {
            long j = getOffsetF1C5BW0.MediaSessionCompatQueueItem;
            getOffsetF1C5BW0.MediaSessionCompatQueueItem = j + 1;
            getOffsetF1C5BW0.MediaBrowserCompatMediaItem = getOffsetF1C5BW0.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(j);
            getFontScale getfontscaleResultReceiver = ResultReceiver();
            read(getfontscaleResultReceiver.RemoteActionCompatParcelizer(j));
            getblendmode0no6vwu = new getBlendMode0nO6VwU(j, getOffsetF1C5BW0.IconCompatParcelizer(getfontscaleResultReceiver, r8lambda54BeH8ZsBru0CXI2CCSP2syNys() + 1, j), getOffsetF1C5BW0.write(r8lambdaunavo3sxub_pc9xroryotnrlvsm, MediaSessionCompatQueueItem(), true), getOffsetF1C5BW0.RemoteActionCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, ParcelableVolumeInfo()), this);
        }
        if (this.serializer || this.MediaSessionCompatToken) {
            return getblendmode0no6vwu;
        }
        long jR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
        synchronized (obj) {
            long j2 = getOffsetF1C5BW0.MediaSessionCompatQueueItem;
            getOffsetF1C5BW0.MediaSessionCompatQueueItem = j2 + 1;
            serializer(j2);
            getOffsetF1C5BW0.MediaBrowserCompatMediaItem = getOffsetF1C5BW0.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        }
        read(getOffsetF1C5BW0.IconCompatParcelizer(ResultReceiver(), jR8lambda54BeH8ZsBru0CXI2CCSP2syNys + 1, r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
        return getblendmode0no6vwu;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0150  */
    /* JADX WARN: Code duplicated, block: B:64:0x015a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x0188 A[LOOP:3: B:74:0x0186->B:75:0x0188, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final TuplesKt write(long j, relocationOffsetfbGrOKE relocationoffsetfbgroke, HashMap map, getFontScale getfontscale) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayListIconCompatParcelizer;
        int size;
        int i;
        ArrayList arrayList3;
        int size2;
        int i2;
        blur1fqSgw blur1fqsgw;
        BlurKt blurKt;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        BlurKt blurKtWrite;
        BlurKt blurKtRemoteActionCompatParcelizer;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        getFontScale getfontscaleSerializer = ResultReceiver().RemoteActionCompatParcelizer(r8lambda54BeH8ZsBru0CXI2CCSP2syNys()).serializer(this.RemoteActionCompatParcelizer);
        Object[] objArr3 = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
        long[] jArr3 = relocationoffsetfbgroke.IconCompatParcelizer;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            arrayListIconCompatParcelizer = null;
            arrayList2 = null;
            while (true) {
                long j2 = jArr3[i6];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j2 & 255) < 128) {
                            objArr2 = objArr3;
                            blur1fqSgw blur1fqsgw2 = (blur1fqSgw) objArr3[(i6 << 3) + i8];
                            jArr2 = jArr3;
                            BlurKt blurKtIconCompatParcelizer = blur1fqsgw2.IconCompatParcelizer();
                            i3 = length;
                            BlurKt blurKtWrite2 = getOffsetF1C5BW0.write(blurKtIconCompatParcelizer, j, getfontscale);
                            if (blurKtWrite2 == null || (blurKtWrite = getOffsetF1C5BW0.write(blurKtIconCompatParcelizer, r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), getfontscaleSerializer)) == null) {
                                i4 = i7;
                                i5 = i8;
                            } else {
                                i4 = i7;
                                i5 = i8;
                                if (blurKtWrite.MediaBrowserCompatMediaItem != 1 && !blurKtWrite2.equals(blurKtWrite)) {
                                    BlurKt blurKtWrite3 = getOffsetF1C5BW0.write(blurKtIconCompatParcelizer, r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), ResultReceiver());
                                    if (blurKtWrite3 == null) {
                                        getOffsetF1C5BW0.serializer();
                                        throw null;
                                    }
                                    if (map == null || (blurKtRemoteActionCompatParcelizer = (BlurKt) map.get(blurKtWrite2)) == null) {
                                        blurKtRemoteActionCompatParcelizer = blur1fqsgw2.RemoteActionCompatParcelizer(blurKtWrite, blurKtWrite2, blurKtWrite3);
                                    }
                                    if (blurKtRemoteActionCompatParcelizer == null) {
                                        return new getSpread(this);
                                    }
                                    if (!blurKtRemoteActionCompatParcelizer.equals(blurKtWrite3)) {
                                        if (blurKtRemoteActionCompatParcelizer.equals(blurKtWrite2)) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(new onViewAttachedToWindowlambda0(blur1fqsgw2, blurKtWrite2.write(r8lambda54BeH8ZsBru0CXI2CCSP2syNys())));
                                            if (arrayListIconCompatParcelizer == null) {
                                                arrayListIconCompatParcelizer = new ArrayList();
                                            }
                                            arrayListIconCompatParcelizer.add(blur1fqsgw2);
                                        } else {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            if (!blurKtRemoteActionCompatParcelizer.equals(blurKtWrite)) {
                                                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(blur1fqsgw2, blurKtRemoteActionCompatParcelizer);
                                            } else {
                                                onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(blur1fqsgw2, blurKtWrite.write(r8lambda54BeH8ZsBru0CXI2CCSP2syNys()));
                                            }
                                            arrayList2.add(onviewattachedtowindowlambda0);
                                        }
                                    }
                                }
                            }
                        } else {
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = length;
                            i4 = i7;
                            i5 = i8;
                        }
                        j2 >>= 8;
                        i8 = i5 + 1;
                        i7 = i4;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        length = i3;
                        j = j;
                    }
                    objArr = objArr3;
                    jArr = jArr3;
                    int i9 = length;
                    if (i7 != 8) {
                        break;
                    }
                    length = i9;
                } else {
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i6 != length) {
                    i6++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                } else {
                    arrayList = arrayListIconCompatParcelizer;
                }
            }
            if (arrayList2 != null) {
                MediaMetadataCompat();
                size2 = arrayList2.size();
                for (i2 = 0; i2 < size2; i2++) {
                    onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) arrayList2.get(i2);
                    blur1fqsgw = (blur1fqSgw) onviewattachedtowindowlambda1.serializer;
                    blurKt = (BlurKt) onviewattachedtowindowlambda1.write;
                    blurKt.MediaBrowserCompatMediaItem = j;
                    synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                        blurKt.MediaSessionCompatQueueItem = blur1fqsgw.IconCompatParcelizer();
                        blur1fqsgw.serializer(blurKt);
                    }
                }
            }
            if (arrayListIconCompatParcelizer != null) {
                size = arrayListIconCompatParcelizer.size();
                for (i = 0; i < size; i++) {
                    relocationoffsetfbgroke.write((blur1fqSgw) arrayListIconCompatParcelizer.get(i));
                }
                arrayList3 = this.IconCompatParcelizer;
                if (arrayList3 != null) {
                    arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayListIconCompatParcelizer, arrayList3);
                }
                this.IconCompatParcelizer = arrayListIconCompatParcelizer;
            }
            return getDensity.write;
        }
        arrayList = null;
        arrayList2 = null;
        arrayListIconCompatParcelizer = arrayList;
        if (arrayList2 != null) {
            MediaMetadataCompat();
            size2 = arrayList2.size();
            while (i2 < size2) {
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = (onViewAttachedToWindowlambda0) arrayList2.get(i2);
                blur1fqsgw = (blur1fqSgw) onviewattachedtowindowlambda2.serializer;
                blurKt = (BlurKt) onviewattachedtowindowlambda2.write;
                blurKt.MediaBrowserCompatMediaItem = j;
                synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                    blurKt.MediaSessionCompatQueueItem = blur1fqsgw.IconCompatParcelizer();
                    blur1fqsgw.serializer(blurKt);
                }
            }
        }
        if (arrayListIconCompatParcelizer != null) {
            size = arrayListIconCompatParcelizer.size();
            while (i < size) {
                relocationoffsetfbgroke.write((blur1fqSgw) arrayListIconCompatParcelizer.get(i));
            }
            arrayList3 = this.IconCompatParcelizer;
            if (arrayList3 != null) {
                arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(arrayListIconCompatParcelizer, arrayList3);
            }
            this.IconCompatParcelizer = arrayListIconCompatParcelizer;
        }
        return getDensity.write;
    }
}
