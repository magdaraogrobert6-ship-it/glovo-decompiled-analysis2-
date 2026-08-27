package o;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Updater$$ExternalSyntheticLambda1;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import bo.app.c8$$ExternalSyntheticOutline0;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.util.UrlUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class setSpread {
    public boolean MediaDescriptionCompat;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem;
    public OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 read;
    public BlockInnerShadowElement write;
    public final AtomicReference MediaMetadataCompat = new AtomicReference(null);
    public final Updater$$ExternalSyntheticLambda1 IconCompatParcelizer = new Updater$$ExternalSyntheticLambda1(7, this);
    public final RoomDatabase$$ExternalSyntheticLambda2 MediaBrowserCompatMediaItem = new RoomDatabase$$ExternalSyntheticLambda2(9, this);
    public final onCreateVirtualViewTranslationRequests RemoteActionCompatParcelizer = new onCreateVirtualViewTranslationRequests(new BlockInnerShadowElement[16]);
    public final Object RatingCompat = new Object();
    public long serializer = -1;

    public final void read() {
        Updater$$ExternalSyntheticLambda1 updater$$ExternalSyntheticLambda1 = this.IconCompatParcelizer;
        getOffsetF1C5BW0.write(getOffsetF1C5BW0.RemoteActionCompatParcelizer);
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            getOffsetF1C5BW0.write = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getOffsetF1C5BW0.write, (Object) updater$$ExternalSyntheticLambda1);
        }
        this.read = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(1, updater$$ExternalSyntheticLambda1);
    }

    public final boolean write() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.RatingCompat) {
            z = this.MediaDescriptionCompat;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.MediaMetadataCompat;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                objSubList = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        getCreditCardExpirationDay.IconCompatParcelizer("Unexpected notification");
                        DrawableTransformation.read();
                        return false;
                    }
                    List list = (List) obj;
                    set2 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                }
                do {
                    if (atomicReference.compareAndSet(obj, objSubList)) {
                        set = set2;
                        break;
                    }
                } while (atomicReference.get() == obj);
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.RatingCompat) {
                onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.RemoteActionCompatParcelizer;
                Object[] objArr = oncreatevirtualviewtranslationrequests.write;
                int i = oncreatevirtualviewtranslationrequests.read;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((BlockInnerShadowElement) objArr[i2]).read(set) || z2;
                }
            }
        }
    }

    public setSpread(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0072 A[Catch: all -> 0x009e, LOOP:1: B:14:0x002e->B:25:0x0072, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0007, B:8:0x0011, B:26:0x0079, B:28:0x0081, B:31:0x008e, B:30:0x0086, B:11:0x0022, B:14:0x002e, B:16:0x0043, B:18:0x004f, B:20:0x0059, B:21:0x0064, B:25:0x0072, B:32:0x0094), top: B:38:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0079 A[EDGE_INSN: B:45:0x0079->B:26:0x0079 BREAK  A[LOOP:1: B:14:0x002e->B:25:0x0072], SYNTHETIC] */
    public final void RemoteActionCompatParcelizer(Object obj) {
        int i;
        synchronized (this.RatingCompat) {
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.RemoteActionCompatParcelizer;
            int i2 = oncreatevirtualviewtranslationrequests.read;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                Object[] objArr = oncreatevirtualviewtranslationrequests.write;
                if (i3 < i2) {
                    BlockInnerShadowElement blockInnerShadowElement = (BlockInnerShadowElement) objArr[i3];
                    AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) blockInnerShadowElement.PlaybackStateCompat.IconCompatParcelizer(obj);
                    if (anchoredDraggableState == null) {
                        i = i3;
                    } else {
                        Object[] objArr2 = anchoredDraggableState.IconCompatParcelizer;
                        int[] iArr = anchoredDraggableState.MediaMetadataCompat;
                        long[] jArr = anchoredDraggableState.write;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j = jArr[i5];
                                i = i3;
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((j & 255) < 128) {
                                            int i8 = (i5 << 3) + i7;
                                            Object obj2 = objArr2[i8];
                                            int i9 = iArr[i8];
                                            blockInnerShadowElement.IconCompatParcelizer(obj, obj2);
                                        }
                                        j >>= 8;
                                    }
                                    if (i6 != 8) {
                                        break;
                                    }
                                    if (i5 != length) {
                                        break;
                                    }
                                    i5++;
                                    i3 = i;
                                } else if (i5 != length) {
                                    break;
                                    break;
                                } else {
                                    i5++;
                                    i3 = i;
                                }
                            }
                        } else {
                            i = i3;
                        }
                    }
                    if (!blockInnerShadowElement.PlaybackStateCompat.write()) {
                        i4++;
                    } else if (i4 > 0) {
                        Object[] objArr3 = oncreatevirtualviewtranslationrequests.write;
                        objArr3[i - i4] = objArr3[i];
                    }
                    i3 = i + 1;
                } else {
                    int i10 = i2 - i4;
                    Arrays.fill(objArr, i10, i2, (Object) null);
                    oncreatevirtualviewtranslationrequests.read = i10;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x028c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x023b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [o.BlockInnerShadowElement] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [long] */
    public final void serializer(Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        Object obj2;
        ?? r9;
        BlockInnerShadowElement blockInnerShadowElement;
        BlockInnerShadowElement blockInnerShadowElement2;
        long j;
        onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests;
        long j2;
        int i;
        getBrush blurredEdgeTreatment;
        BlockInnerShadowElement blockInnerShadowElement3;
        long[] jArr;
        long[] jArr2;
        int iIconCompatParcelizer = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer2 = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer3 = trackEventI.IconCompatParcelizer();
        ?? IconCompatParcelizer = trackEventI.IconCompatParcelizer();
        long jLongValue = ((Long) UrlUtils.RemoteActionCompatParcelizer(iIconCompatParcelizer, IconCompatParcelizer, iIconCompatParcelizer2, -1993279031, 1993279036, iIconCompatParcelizer3, new Object[0])).longValue();
        synchronized (this.RatingCompat) {
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests2 = this.RemoteActionCompatParcelizer;
            Object[] objArr = oncreatevirtualviewtranslationrequests2.write;
            int i2 = oncreatevirtualviewtranslationrequests2.read;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((BlockInnerShadowElement) obj2).MediaDescriptionCompat == r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
                    break;
                } else {
                    i3++;
                }
            }
            BlockInnerShadowElement blockInnerShadowElement4 = (BlockInnerShadowElement) obj2;
            r9 = 1;
            if (blockInnerShadowElement4 == null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{1, r8lambdaunavo3sxub_pc9xroryotnrlvsm}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
                blockInnerShadowElement4 = new BlockInnerShadowElement(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                oncreatevirtualviewtranslationrequests2.IconCompatParcelizer(blockInnerShadowElement4);
            }
            blockInnerShadowElement = blockInnerShadowElement4;
            blockInnerShadowElement2 = this.write;
            j = this.serializer;
        }
        if (j != -1 && j != jLongValue) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbM.append(jLongValue);
            sbM.append(", name=");
            sbM.append(Thread.currentThread().getName());
            sbM.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            getContentCaptureSessionuiannotations.RemoteActionCompatParcelizer(sbM.toString());
        }
        try {
            synchronized (this.RatingCompat) {
                try {
                    this.write = blockInnerShadowElement;
                    this.serializer = jLongValue;
                } catch (Throwable th) {
                    th = th;
                }
            }
            RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2 = this.MediaBrowserCompatMediaItem;
            Object obj3 = blockInnerShadowElement.serializer;
            AnchoredDraggableState anchoredDraggableState = blockInnerShadowElement.IconCompatParcelizer;
            int i4 = blockInnerShadowElement.RemoteActionCompatParcelizer;
            blockInnerShadowElement.serializer = obj;
            blockInnerShadowElement.IconCompatParcelizer = (AnchoredDraggableState) blockInnerShadowElement.PlaybackStateCompat.MediaBrowserCompatMediaItem(obj);
            if (blockInnerShadowElement.RemoteActionCompatParcelizer == -1) {
                blockInnerShadowElement.RemoteActionCompatParcelizer = Long.hashCode(getOffsetF1C5BW0.write().r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            }
            getSmsOtpCode getsmsotpcode = blockInnerShadowElement.MediaBrowserCompatMediaItem;
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequestsIconCompatParcelizer = androidx.compose.runtime.CompositionKt.IconCompatParcelizer();
            try {
                oncreatevirtualviewtranslationrequestsIconCompatParcelizer.IconCompatParcelizer(getsmsotpcode);
                if (roomDatabase$$ExternalSyntheticLambda2 == null) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                    i = i4;
                    oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequestsIconCompatParcelizer;
                    j2 = j;
                } else {
                    getBrush getbrush = (getBrush) getOffsetF1C5BW0.ParcelableVolumeInfo.RemoteActionCompatParcelizer();
                    if (getbrush instanceof BlurredEdgeTreatment) {
                        try {
                            i = i4;
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequestsIconCompatParcelizer;
                            j2 = j;
                            try {
                                if (((BlurredEdgeTreatment) getbrush).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == ((Long) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -1993279031, 1993279036, trackEventI.IconCompatParcelizer(), new Object[0])).longValue()) {
                                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = ((BlurredEdgeTreatment) getbrush).r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = ((BlurredEdgeTreatment) getbrush).ComponentActivity;
                                    try {
                                        ((BlurredEdgeTreatment) getbrush).r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getOffsetF1C5BW0.write((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) roomDatabase$$ExternalSyntheticLambda2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, true);
                                        ((BlurredEdgeTreatment) getbrush).ComponentActivity = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                                        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                                        ((BlurredEdgeTreatment) getbrush).r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                                        ((BlurredEdgeTreatment) getbrush).ComponentActivity = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                                    } catch (Throwable th2) {
                                        ((BlurredEdgeTreatment) getbrush).r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                                        ((BlurredEdgeTreatment) getbrush).ComponentActivity = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                oncreatevirtualviewtranslationrequests.write(oncreatevirtualviewtranslationrequests.read - 1);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequestsIconCompatParcelizer;
                            j2 = j;
                        }
                    } else {
                        i = i4;
                        oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequestsIconCompatParcelizer;
                        j2 = j;
                    }
                    if (getbrush != null && !(getbrush instanceof updateDensity)) {
                        blurredEdgeTreatment = getbrush.read(roomDatabase$$ExternalSyntheticLambda2);
                    } else {
                        blurredEdgeTreatment = new BlurredEdgeTreatment(getbrush instanceof updateDensity ? (updateDensity) getbrush : null, roomDatabase$$ExternalSyntheticLambda2, null, true, false);
                    }
                    getBrush getbrush2 = blurredEdgeTreatment;
                    try {
                        getBrush getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getbrush2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                        try {
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                            getBrush.write(getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                            getbrush2.serializer();
                        } catch (Throwable th5) {
                            try {
                                getBrush.write(getbrushR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
                                throw th5;
                            } catch (Throwable th6) {
                                th = th6;
                                try {
                                    getbrush2.serializer();
                                    throw th;
                                } catch (Throwable th7) {
                                    th = th7;
                                    oncreatevirtualviewtranslationrequests.write(oncreatevirtualviewtranslationrequests.read - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                }
                try {
                    oncreatevirtualviewtranslationrequests.write(oncreatevirtualviewtranslationrequests.read - 1);
                    Object obj4 = blockInnerShadowElement.serializer;
                    obj4.getClass();
                    int i5 = blockInnerShadowElement.RemoteActionCompatParcelizer;
                    AnchoredDraggableState anchoredDraggableState2 = blockInnerShadowElement.IconCompatParcelizer;
                    if (anchoredDraggableState2 != null) {
                        try {
                            long[] jArr3 = anchoredDraggableState2.write;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j3 = jArr3[i6];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8;
                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            if ((j3 & 255) < 128) {
                                                int i10 = (i6 << 3) + i9;
                                                jArr2 = jArr3;
                                                Object obj5 = anchoredDraggableState2.IconCompatParcelizer[i10];
                                                blockInnerShadowElement3 = blockInnerShadowElement2;
                                                try {
                                                    boolean z = anchoredDraggableState2.MediaMetadataCompat[i10] != i5;
                                                    if (z) {
                                                        blockInnerShadowElement.IconCompatParcelizer(obj4, obj5);
                                                    }
                                                    if (z) {
                                                        anchoredDraggableState2.IconCompatParcelizer(i10);
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    IconCompatParcelizer = blockInnerShadowElement3;
                                                    r9 = j2;
                                                    synchronized (this.RatingCompat) {
                                                        this.write = IconCompatParcelizer;
                                                        this.serializer = r9;
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                blockInnerShadowElement3 = blockInnerShadowElement2;
                                                jArr2 = jArr3;
                                            }
                                            i9++;
                                            j3 >>= 8;
                                            i7 = 8;
                                            jArr3 = jArr2;
                                            blockInnerShadowElement2 = blockInnerShadowElement3;
                                        }
                                        blockInnerShadowElement3 = blockInnerShadowElement2;
                                        jArr = jArr3;
                                        if (i8 != i7) {
                                            break;
                                        }
                                    } else {
                                        blockInnerShadowElement3 = blockInnerShadowElement2;
                                        jArr = jArr3;
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    jArr3 = jArr;
                                    blockInnerShadowElement2 = blockInnerShadowElement3;
                                }
                            } else {
                                blockInnerShadowElement3 = blockInnerShadowElement2;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            blockInnerShadowElement3 = blockInnerShadowElement2;
                            IconCompatParcelizer = blockInnerShadowElement3;
                            r9 = j2;
                            synchronized (this.RatingCompat) {
                                this.write = IconCompatParcelizer;
                                this.serializer = r9;
                                throw th;
                            }
                        }
                    } else {
                        blockInnerShadowElement3 = blockInnerShadowElement2;
                    }
                    blockInnerShadowElement.serializer = obj3;
                    blockInnerShadowElement.IconCompatParcelizer = anchoredDraggableState;
                    blockInnerShadowElement.RemoteActionCompatParcelizer = i;
                    synchronized (this.RatingCompat) {
                        this.write = blockInnerShadowElement3;
                        this.serializer = j2;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    IconCompatParcelizer = blockInnerShadowElement2;
                }
            } catch (Throwable th12) {
                th = th12;
                oncreatevirtualviewtranslationrequests = oncreatevirtualviewtranslationrequestsIconCompatParcelizer;
            }
        } catch (Throwable th13) {
            th = th13;
            IconCompatParcelizer = blockInnerShadowElement2;
            r9 = j;
        }
    }

    public final void serializer() {
        synchronized (this.RatingCompat) {
            onCreateVirtualViewTranslationRequests oncreatevirtualviewtranslationrequests = this.RemoteActionCompatParcelizer;
            Object[] objArr = oncreatevirtualviewtranslationrequests.write;
            int i = oncreatevirtualviewtranslationrequests.read;
            for (int i2 = 0; i2 < i; i2++) {
                BlockInnerShadowElement blockInnerShadowElement = (BlockInnerShadowElement) objArr[i2];
                blockInnerShadowElement.MediaSessionCompatToken.IconCompatParcelizer();
                blockInnerShadowElement.PlaybackStateCompat.IconCompatParcelizer();
                blockInnerShadowElement.read.IconCompatParcelizer();
                blockInnerShadowElement.RatingCompat.clear();
            }
        }
    }
}
