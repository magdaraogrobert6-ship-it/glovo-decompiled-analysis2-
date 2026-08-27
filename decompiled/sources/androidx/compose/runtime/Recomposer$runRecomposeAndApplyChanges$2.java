package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCreditCardSecurityCode;
import o.notifyValueChanged;
import o.notifyViewEntered;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.relocationOffsetfbGrOKE;
import o.sendContentCaptureAppearEvents;

/* JADX INFO: loaded from: classes.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public /* synthetic */ notifyViewEntered IconCompatParcelizer;
    public relocationOffsetfbGrOKE MediaBrowserCompatMediaItem;
    public relocationOffsetfbGrOKE MediaDescriptionCompat;
    public relocationOffsetfbGrOKE MediaMetadataCompat;
    public Set MediaSessionCompatQueueItem;
    public final /* synthetic */ sendContentCaptureAppearEvents MediaSessionCompatResultReceiverWrapper;
    public int RatingCompat;
    public List RemoteActionCompatParcelizer;
    public relocationOffsetfbGrOKE read;
    public List serializer;
    public List write;

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.MediaSessionCompatResultReceiverWrapper, (ShortNewsContentCardView) obj3);
        recomposer$runRecomposeAndApplyChanges$2.IconCompatParcelizer = (notifyViewEntered) obj2;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00af A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ef A[Catch: all -> 0x0106, TRY_LEAVE, TryCatch #1 {, blocks: (B:18:0x00e7, B:21:0x00ef), top: B:64:0x00e7 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:29:0x0103  */
    /* JADX WARN: Code duplicated, block: B:33:0x0109  */
    /* JADX WARN: Code duplicated, block: B:35:0x010d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0125  */
    /* JADX WARN: Code duplicated, block: B:42:0x0174  */
    /* JADX WARN: Code duplicated, block: B:60:0x0236  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0174 -> B:43:0x017d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0236 -> B:61:0x0249). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(sendContentCaptureAppearEvents sendcontentcaptureappearevents, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.MediaSessionCompatResultReceiverWrapper = sendcontentcaptureappearevents;
    }

    public static final void serializer(List list, sendContentCaptureAppearEvents sendcontentcaptureappearevents) {
        list.clear();
        synchronized (sendcontentcaptureappearevents.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            ArrayList arrayList = sendcontentcaptureappearevents.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                list.add((notifyValueChanged) arrayList.get(i));
            }
            sendcontentcaptureappearevents.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0082 A[Catch: all -> 0x013e, LOOP:1: B:10:0x003f->B:22:0x0082, LOOP_END, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x002c, B:10:0x003f, B:12:0x004a, B:14:0x0056, B:16:0x0060, B:17:0x0070, B:22:0x0082, B:23:0x008a, B:26:0x0097, B:28:0x00a6, B:30:0x00b2, B:32:0x00bc, B:33:0x00c6, B:37:0x00d2, B:38:0x00d5, B:41:0x00e5, B:43:0x00f4, B:45:0x0100, B:47:0x010a, B:48:0x011a, B:54:0x0136, B:55:0x0139), top: B:61:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2 A[Catch: all -> 0x013e, LOOP:3: B:26:0x0097->B:37:0x00d2, LOOP_END, TryCatch #0 {, blocks: (B:4:0x000d, B:6:0x001d, B:7:0x002c, B:10:0x003f, B:12:0x004a, B:14:0x0056, B:16:0x0060, B:17:0x0070, B:22:0x0082, B:23:0x008a, B:26:0x0097, B:28:0x00a6, B:30:0x00b2, B:32:0x00bc, B:33:0x00c6, B:37:0x00d2, B:38:0x00d5, B:41:0x00e5, B:43:0x00f4, B:45:0x0100, B:47:0x010a, B:48:0x011a, B:54:0x0136, B:55:0x0139), top: B:61:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:65:0x008a A[EDGE_INSN: B:65:0x008a->B:23:0x008a BREAK  A[LOOP:1: B:10:0x003f->B:22:0x0082], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5 A[EDGE_INSN: B:70:0x00d5->B:38:0x00d5 BREAK  A[LOOP:3: B:26:0x0097->B:37:0x00d2], SYNTHETIC] */
    public static final void RemoteActionCompatParcelizer(sendContentCaptureAppearEvents sendcontentcaptureappearevents, List list, List list2, List list3, relocationOffsetfbGrOKE relocationoffsetfbgroke, relocationOffsetfbGrOKE relocationoffsetfbgroke2, relocationOffsetfbGrOKE relocationoffsetfbgroke3, relocationOffsetfbGrOKE relocationoffsetfbgroke4) {
        synchronized (sendcontentcaptureappearevents.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) {
            list.clear();
            list2.clear();
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                getCreditCardSecurityCode getcreditcardsecuritycode = (getCreditCardSecurityCode) list3.get(i);
                getcreditcardsecuritycode.serializer();
                sendcontentcaptureappearevents.read(getcreditcardsecuritycode);
            }
            list3.clear();
            Object[] objArr = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
            long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
            int length = jArr.length - 2;
            long j = -9187201950435737472L;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    int i3 = length;
                    if ((((~j2) << 7) & j2 & j) == j) {
                        length = i3;
                        if (i2 != length) {
                            break;
                            break;
                        } else {
                            i2++;
                            j = -9187201950435737472L;
                        }
                    } else {
                        int i4 = 8 - ((~(i2 - i3)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j2 & 255) < 128) {
                                getCreditCardSecurityCode getcreditcardsecuritycode2 = (getCreditCardSecurityCode) objArr[(i2 << 3) + i5];
                                getcreditcardsecuritycode2.serializer();
                                sendcontentcaptureappearevents.read(getcreditcardsecuritycode2);
                            }
                            j2 >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                        length = i3;
                        if (i2 != length) {
                            break;
                        }
                        i2++;
                        j = -9187201950435737472L;
                    }
                }
            }
            relocationoffsetfbgroke.serializer();
            Object[] objArr2 = relocationoffsetfbgroke2.RemoteActionCompatParcelizer;
            long[] jArr2 = relocationoffsetfbgroke2.IconCompatParcelizer;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i6 = 0;
                while (true) {
                    long j3 = jArr2[i6];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i6 != length2) {
                            break;
                            break;
                        }
                        i6++;
                    } else {
                        int i7 = 8 - ((~(i6 - length2)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j3 & 255) < 128) {
                                ((getCreditCardSecurityCode) objArr2[(i6 << 3) + i8]).IconCompatParcelizer();
                            }
                            j3 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        } else if (i6 != length2) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
            relocationoffsetfbgroke2.serializer();
            relocationoffsetfbgroke3.serializer();
            Object[] objArr3 = relocationoffsetfbgroke4.RemoteActionCompatParcelizer;
            long[] jArr3 = relocationoffsetfbgroke4.IconCompatParcelizer;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i9 = 0;
                while (true) {
                    long j4 = jArr3[i9];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length3)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((j4 & 255) < 128) {
                                getCreditCardSecurityCode getcreditcardsecuritycode3 = (getCreditCardSecurityCode) objArr3[(i9 << 3) + i11];
                                getcreditcardsecuritycode3.serializer();
                                sendcontentcaptureappearevents.read(getcreditcardsecuritycode3);
                            }
                            j4 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i9 == length3) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            relocationoffsetfbgroke4.serializer();
        }
    }
}
