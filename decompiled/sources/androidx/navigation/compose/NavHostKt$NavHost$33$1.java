package androidx.navigation.compose;

import androidx.compose.animation.core.Transition;
import coil3.ExtrasKt;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidPathMeasure;
import o.ShortNewsContentCardView;
import o.accessfling;
import o.createFromParcel;
import o.cubicTo;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.relativeMoveTo;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class NavHostKt$NavHost$33$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ Transition IconCompatParcelizer;
    public final /* synthetic */ accessfling RatingCompat;
    public final /* synthetic */ relativeMoveTo RemoteActionCompatParcelizer;
    public final /* synthetic */ onViewAttachedToWindow read;
    public final /* synthetic */ cubicTo serializer;
    public final /* synthetic */ AndroidPathMeasure write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$33$1(Transition transition, relativeMoveTo relativemoveto, cubicTo cubicto, accessfling accessflingVar, onViewAttachedToWindow onviewattachedtowindow, AndroidPathMeasure androidPathMeasure, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = transition;
        this.RemoteActionCompatParcelizer = relativemoveto;
        this.serializer = cubicto;
        this.RatingCompat = accessflingVar;
        this.read = onviewattachedtowindow;
        this.write = androidPathMeasure;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new NavHostKt$NavHost$33$1(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.serializer, this.RatingCompat, this.read, this.write, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = (NavHostKt$NavHost$33$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        navHostKt$NavHost$33$1.invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0089 A[LOOP:0: B:9:0x0083->B:11:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:14:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:17:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:21:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:23:0x010d  */
    /* JADX WARN: Code duplicated, block: B:24:0x013c  */
    /* JADX WARN: Code duplicated, block: B:25:0x013f  */
    /* JADX WARN: Code duplicated, block: B:29:0x015a  */
    /* JADX WARN: Code duplicated, block: B:30:0x015d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0160 A[LOOP:1: B:15:0x00a3->B:32:0x0160, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x016a A[EDGE_INSN: B:36:0x016a->B:33:0x016a BREAK  A[LOOP:1: B:15:0x00a3->B:32:0x0160], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x016a A[EDGE_INSN: B:37:0x016a->B:33:0x016a BREAK  A[LOOP:1: B:15:0x00a3->B:32:0x0160], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        accessfling accessflingVar;
        long[] jArr;
        int length;
        int i;
        long j;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj2;
        int i11;
        int i12;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Transition transition = this.IconCompatParcelizer;
        Object objIconCompatParcelizer = transition.MediaSessionCompatToken.IconCompatParcelizer();
        onShowTranslationui onshowtranslationui = (onShowTranslationui) transition.MediaBrowserCompatMediaItem;
        Object[] objArr = {objIconCompatParcelizer, onshowtranslationui.getValue()};
        int i13 = 1803334089;
        int i14 = -1803334089;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            if (((cubicTo) this.RemoteActionCompatParcelizer.read.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer()) == null) {
                it = ((List) this.read.getValue()).iterator();
                while (it.hasNext()) {
                    this.write.serializer().IconCompatParcelizer((cubicTo) it.next());
                }
                accessflingVar = this.RatingCompat;
                jArr = accessflingVar.RemoteActionCompatParcelizer;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    while (true) {
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            i3 = 8;
                            i4 = 8 - ((~(i - length)) >>> 31);
                            i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i10 = (i << 3) + i5;
                                    obj2 = accessflingVar.read[i10];
                                    float f = accessflingVar.MediaSessionCompatQueueItem[i10];
                                    i11 = i13;
                                    i7 = i5;
                                    i12 = i14;
                                    i8 = i4;
                                    i9 = i3;
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), i11, i12, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) obj2, ((cubicTo) onshowtranslationui.getValue()).serializer}, getCieXyz.write())).booleanValue()) {
                                        accessflingVar.write--;
                                        long[] jArr2 = accessflingVar.RemoteActionCompatParcelizer;
                                        int i15 = accessflingVar.IconCompatParcelizer;
                                        int i16 = i10 >> 3;
                                        int i17 = (i10 & 7) << 3;
                                        long j2 = ((~(255 << i17)) & jArr2[i16]) | (254 << i17);
                                        jArr2[i16] = j2;
                                        jArr2[(((i10 - 7) & i15) + (i15 & 7)) >> 3] = j2;
                                        accessflingVar.read[i10] = null;
                                    }
                                } else {
                                    i7 = i5;
                                    i8 = i4;
                                    i9 = i3;
                                }
                                j >>= i9;
                                i5 = i7 + 1;
                                i4 = i8;
                                i3 = i9;
                                i = i;
                                i13 = 1803334089;
                                i14 = -1803334089;
                            }
                            i6 = i;
                            if (i4 == i3) {
                                break;
                                break;
                            }
                            i2 = i6;
                        } else {
                            i2 = i;
                        }
                        if (i2 != length) {
                            break;
                            break;
                        }
                        i = i2 + 1;
                        i13 = 1803334089;
                        i14 = -1803334089;
                    }
                }
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onshowtranslationui.getValue(), this.serializer}, getCieXyz.write())).booleanValue()) {
                    it = ((List) this.read.getValue()).iterator();
                    while (it.hasNext()) {
                        this.write.serializer().IconCompatParcelizer((cubicTo) it.next());
                    }
                    accessflingVar = this.RatingCompat;
                    jArr = accessflingVar.RemoteActionCompatParcelizer;
                    length = jArr.length - 2;
                    if (length >= 0) {
                        i = 0;
                        while (true) {
                            j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                i3 = 8;
                                i4 = 8 - ((~(i - length)) >>> 31);
                                i5 = 0;
                                while (i5 < i4) {
                                    if ((j & 255) < 128) {
                                        i10 = (i << 3) + i5;
                                        obj2 = accessflingVar.read[i10];
                                        float f2 = accessflingVar.MediaSessionCompatQueueItem[i10];
                                        i11 = i13;
                                        i7 = i5;
                                        i12 = i14;
                                        i8 = i4;
                                        i9 = i3;
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), i11, i12, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) obj2, ((cubicTo) onshowtranslationui.getValue()).serializer}, getCieXyz.write())).booleanValue()) {
                                            accessflingVar.write--;
                                            long[] jArr3 = accessflingVar.RemoteActionCompatParcelizer;
                                            int i18 = accessflingVar.IconCompatParcelizer;
                                            int i19 = i10 >> 3;
                                            int i110 = (i10 & 7) << 3;
                                            long j3 = ((~(255 << i110)) & jArr3[i19]) | (254 << i110);
                                            jArr3[i19] = j3;
                                            jArr3[(((i10 - 7) & i18) + (i18 & 7)) >> 3] = j3;
                                            accessflingVar.read[i10] = null;
                                        }
                                    } else {
                                        i7 = i5;
                                        i8 = i4;
                                        i9 = i3;
                                    }
                                    j >>= i9;
                                    i5 = i7 + 1;
                                    i4 = i8;
                                    i3 = i9;
                                    i = i;
                                    i13 = 1803334089;
                                    i14 = -1803334089;
                                }
                                i6 = i;
                                if (i4 == i3) {
                                    break;
                                }
                                i2 = i6;
                            } else {
                                i2 = i;
                            }
                            if (i2 != length) {
                                break;
                            }
                            i = i2 + 1;
                            i13 = 1803334089;
                            i14 = -1803334089;
                        }
                    }
                }
            }
        }
        return createFromParcel.INSTANCE;
    }
}
