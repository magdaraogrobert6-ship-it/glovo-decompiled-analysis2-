package o;

import java.util.List;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationEntrancePictureFragmentExternalSyntheticLambda1 {
    public final androidx.navigation.NavArgsLazy IconCompatParcelizer;
    public float MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final accessanimateTo MediaSessionCompatToken;
    public final RadioButtonTokens ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public final animateToWithDecay PlaybackStateCompatCustomAction;
    public final animateToWithDecay RatingCompat;
    public final androidx.camera.view.PendingValue RemoteActionCompatParcelizer;
    public final drag read;
    public int serializer;
    public int write;

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void IconCompatParcelizer(androidx.navigation.NavArgsLazy navArgsLazy, int i, int i2) {
        int i3;
        animateToWithDecay animatetowithdecay = this.PlaybackStateCompatCustomAction;
        inspectableProperties inspectableproperties = (inspectableProperties) animatetowithdecay.serializer(i);
        DraggableAnchorsNode draggableAnchorsNode = inspectableProperties.serializer;
        if (inspectableproperties != null) {
            inspectableproperties.RemoteActionCompatParcelizer = i2;
            inspectableproperties.IconCompatParcelizer = draggableAnchorsNode;
        } else {
            inspectableproperties = new inspectableProperties();
            inspectableproperties.IconCompatParcelizer = draggableAnchorsNode;
            inspectableproperties.RemoteActionCompatParcelizer = i2;
        }
        animatetowithdecay.IconCompatParcelizer(i, inspectableproperties);
        if (i > this.MediaMetadataCompat) {
            this.MediaMetadataCompat = i;
            this.write -= i2;
        } else if (i < this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = i;
            this.MediaSessionCompatQueueItem -= i2;
        }
        int i4 = 1;
        if (Math.signum(this.MediaBrowserCompatMediaItem) <= 0.0f) {
            if (this.write > 0) {
                i3 = this.MediaMetadataCompat + 1;
            } else {
                i3 = -1;
            }
        } else if (Math.signum(this.MediaBrowserCompatMediaItem) <= 0.0f || this.MediaSessionCompatQueueItem <= 0) {
            i3 = -1;
        } else {
            i3 = this.MediaDescriptionCompat - 1;
        }
        if (i3 > 0) {
            navArgsLazy.getClass();
            if (i3 != -1 && i3 < this.serializer) {
                TextFieldImplKt textFieldImplKt = new TextFieldImplKt(this, navArgsLazy, i4);
                long j = navArgsLazy.MediaBrowserCompatMediaItem().IconCompatParcelizer;
                RadioButtonTokens radioButtonTokens = (RadioButtonTokens) navArgsLazy.RatingCompat;
                if (radioButtonTokens == null) {
                    removeNodeAtDepth.serializer("state");
                    throw null;
                }
                this.RatingCompat.IconCompatParcelizer(i3, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{radioButtonTokens.write(i3, j, true, new waitForFirstLayout(textFieldImplKt, 20, navArgsLazy))}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
            }
        }
        read();
    }

    public final void RemoteActionCompatParcelizer(float f, androidx.compose.foundation.pager.PagerMeasureResult pagerMeasureResult) {
        int i;
        int i2;
        androidx.navigation.NavArgsLazy navArgsLazy = this.IconCompatParcelizer;
        navArgsLazy.read = pagerMeasureResult;
        navArgsLazy.RatingCompat = this.ParcelableVolumeInfo;
        float f2 = -f;
        read();
        if (navArgsLazy.IconCompatParcelizer()) {
            MultiSubscriptionSnapshotFlowManager.write(navArgsLazy.MediaBrowserCompatMediaItem());
            navArgsLazy.MediaBrowserCompatMediaItem();
            this.serializer = navArgsLazy.PlaybackStateCompatCustomAction();
            int i3 = navArgsLazy.read();
            int iMediaDescriptionCompat = navArgsLazy.MediaDescriptionCompat();
            int iPlaybackStateCompatCustomAction = navArgsLazy.PlaybackStateCompatCustomAction();
            int iMediaMetadataCompat = navArgsLazy.MediaMetadataCompat();
            int iMediaSessionCompatQueueItem = navArgsLazy.MediaSessionCompatQueueItem();
            animateToWithDecay animatetowithdecay = this.PlaybackStateCompatCustomAction;
            if (f2 <= 0.0f) {
                this.MediaSessionCompatQueueItem = 0 - iMediaMetadataCompat;
                this.MediaDescriptionCompat = i3;
                while (this.MediaSessionCompatQueueItem > 0 && (i2 = this.MediaDescriptionCompat) > 0 && animatetowithdecay.RemoteActionCompatParcelizer(i2 - 1)) {
                    Object objSerializer = animatetowithdecay.serializer(this.MediaDescriptionCompat - 1);
                    objSerializer.getClass();
                    int i4 = ((inspectableProperties) objSerializer).RemoteActionCompatParcelizer;
                    this.MediaDescriptionCompat--;
                    this.MediaSessionCompatQueueItem -= i4;
                }
                serializer(0, this.MediaDescriptionCompat - 1);
            } else {
                this.write = 0 - iMediaSessionCompatQueueItem;
                this.MediaMetadataCompat = iMediaDescriptionCompat;
                while (this.write > 0 && (i = this.MediaMetadataCompat) < iPlaybackStateCompatCustomAction - 1 && animatetowithdecay.RemoteActionCompatParcelizer(i + 1)) {
                    Object objSerializer2 = animatetowithdecay.serializer(this.MediaMetadataCompat + 1);
                    objSerializer2.getClass();
                    int i5 = ((inspectableProperties) objSerializer2).RemoteActionCompatParcelizer;
                    this.MediaMetadataCompat++;
                    this.write -= i5;
                }
                serializer(this.MediaMetadataCompat + 1, iPlaybackStateCompatCustomAction - 1);
            }
        }
        if (navArgsLazy.IconCompatParcelizer()) {
            MultiSubscriptionSnapshotFlowManager.write(navArgsLazy.MediaBrowserCompatMediaItem());
            write(navArgsLazy, navArgsLazy.read(), navArgsLazy.MediaDescriptionCompat(), navArgsLazy.MediaBrowserCompatMediaItem().MediaSessionCompatQueueItem != null ? ((androidx.compose.foundation.pager.PagerState) this.RemoteActionCompatParcelizer.serializer).ComponentActivity : 0, navArgsLazy.MediaSessionCompatQueueItem(), navArgsLazy.MediaMetadataCompat(), f2, f2 <= 0.0f);
        }
        this.MediaBrowserCompatMediaItem = f2;
        read();
    }

    public final int read(androidx.navigation.NavArgsLazy navArgsLazy, int i, boolean z) {
        List list;
        List list2;
        animateToWithDecay animatetowithdecay = this.PlaybackStateCompatCustomAction;
        if (animatetowithdecay.RemoteActionCompatParcelizer(i)) {
            Object objSerializer = animatetowithdecay.serializer(i);
            objSerializer.getClass();
            return ((inspectableProperties) objSerializer).RemoteActionCompatParcelizer;
        }
        animateToWithDecay animatetowithdecay2 = this.RatingCompat;
        int i2 = 0;
        if (animatetowithdecay2.RemoteActionCompatParcelizer(i)) {
            if (!z || (list2 = (List) animatetowithdecay2.serializer(i)) == null) {
                return -1;
            }
            int size = list2.size();
            while (i2 < size) {
                ((LinearProgressIndicatorTokens) list2.get(i2)).RemoteActionCompatParcelizer();
                i2++;
            }
            return -1;
        }
        TextFieldImplKt textFieldImplKt = new TextFieldImplKt(this, navArgsLazy, i2);
        long j = navArgsLazy.MediaBrowserCompatMediaItem().IconCompatParcelizer;
        RadioButtonTokens radioButtonTokens = (RadioButtonTokens) navArgsLazy.RatingCompat;
        if (radioButtonTokens == null) {
            removeNodeAtDepth.serializer("state");
            throw null;
        }
        animatetowithdecay2.IconCompatParcelizer(i, (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{radioButtonTokens.write(i, j, true, new waitForFirstLayout(textFieldImplKt, 20, navArgsLazy))}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()));
        if (!z || (list = (List) animatetowithdecay2.serializer(i)) == null) {
            return -1;
        }
        int size2 = list.size();
        while (i2 < size2) {
            ((LinearProgressIndicatorTokens) list.get(i2)).RemoteActionCompatParcelizer();
            i2++;
        }
        return -1;
    }

    public invokecomroadrunnerdeliveryonthewayentrancepicturedetailspresentationEntrancePictureFragmentExternalSyntheticLambda1(androidx.camera.view.PendingValue pendingValue, RadioButtonTokens radioButtonTokens, RecomposerrunRecomposeAndApplyChanges2 recomposerrunRecomposeAndApplyChanges2) {
        this.RemoteActionCompatParcelizer = pendingValue;
        animateToWithDecay animatetowithdecay = VerticalScrollableClipShape.IconCompatParcelizer;
        this.RatingCompat = new animateToWithDecay();
        this.read = new drag();
        int i = ScrollNode.read;
        this.MediaSessionCompatToken = new accessanimateTo();
        this.PlaybackStateCompatCustomAction = new animateToWithDecay();
        this.PlaybackStateCompat = -1;
        this.MediaDescriptionCompat = Integer.MAX_VALUE;
        this.MediaMetadataCompat = Integer.MIN_VALUE;
        this.ParcelableVolumeInfo = radioButtonTokens;
        this.IconCompatParcelizer = new androidx.navigation.NavArgsLazy(recomposerrunRecomposeAndApplyChanges2);
    }

    public final void write() {
        this.MediaDescriptionCompat = Integer.MAX_VALUE;
        this.MediaMetadataCompat = Integer.MIN_VALUE;
        this.MediaSessionCompatQueueItem = 0;
        this.write = 0;
        this.MediaSessionCompatResultReceiverWrapper = false;
        this.MediaSessionCompatToken.read();
        this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer();
        animateToWithDecay animatetowithdecay = this.RatingCompat;
        long[] jArr = animatetowithdecay.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = animatetowithdecay.serializer[i4];
                        List list = (List) animatetowithdecay.IconCompatParcelizer[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((LinearProgressIndicatorTokens) list.get(i6)).read();
                        }
                        animatetowithdecay.MediaMetadataCompat(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void write(androidx.navigation.NavArgsLazy navArgsLazy, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        int i7;
        boolean z2 = Math.signum(f) == Math.signum(this.MediaBrowserCompatMediaItem);
        if (!z) {
            if (!z2 || this.MediaSessionCompatResultReceiverWrapper) {
                this.MediaSessionCompatQueueItem = i3 - i5;
                this.MediaDescriptionCompat = i;
            } else {
                int iWrite = MathKt.write(Math.abs(f)) + this.MediaSessionCompatQueueItem;
                int i8 = i3 - i5;
                if (iWrite > i8) {
                    iWrite = i8;
                }
                this.MediaSessionCompatQueueItem = iWrite;
            }
            while (this.MediaSessionCompatQueueItem > 0 && (i6 = this.MediaDescriptionCompat) > 0) {
                int i9 = read(navArgsLazy, this.MediaDescriptionCompat - 1, i6 + (-1) == i + (-1) && ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i5));
                if (i9 == -1) {
                    return;
                }
                this.MediaDescriptionCompat--;
                this.MediaSessionCompatQueueItem -= i9;
            }
            return;
        }
        if (!z2 || this.MediaSessionCompatResultReceiverWrapper) {
            this.write = i3 - i4;
            this.MediaMetadataCompat = i2;
        } else {
            int iWrite2 = MathKt.write(Math.abs(f)) + this.write;
            int i10 = i3 - i4;
            if (iWrite2 > i10) {
                iWrite2 = i10;
            }
            this.write = iWrite2;
        }
        while (this.write > 0) {
            int i11 = this.MediaMetadataCompat;
            navArgsLazy.getClass();
            if (i11 == -1 || (i7 = this.MediaMetadataCompat) >= this.serializer - 1) {
                return;
            }
            int i12 = read(navArgsLazy, this.MediaMetadataCompat + 1, i7 + 1 == i2 + 1 && ((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) != 0) && Math.abs(f) >= ((float) i4));
            if (i12 == -1) {
                return;
            }
            this.MediaMetadataCompat++;
            this.write -= i12;
        }
    }

    public final void read() {
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("prefetchWindowStartExtraSpace", this.MediaSessionCompatQueueItem);
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("prefetchWindowEndExtraSpace", this.write);
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("prefetchWindowStartIndex", this.MediaDescriptionCompat);
        androidx.compose.ui.util.AndroidTrace_androidKt.traceValue("prefetchWindowEndIndex", this.MediaMetadataCompat);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[LOOP:0: B:5:0x001a->B:18:0x0052, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x009b A[LOOP:2: B:22:0x0061->B:35:0x009b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9 A[LOOP:4: B:39:0x00ab->B:53:0x00e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0055 A[EDGE_INSN: B:83:0x0055->B:19:0x0055 BREAK  A[LOOP:0: B:5:0x001a->B:18:0x0052], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x009f A[EDGE_INSN: B:90:0x009f->B:36:0x009f BREAK  A[LOOP:2: B:22:0x0061->B:35:0x009b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00ee A[EDGE_INSN: B:97:0x00ee->B:54:0x00ee BREAK  A[LOOP:4: B:39:0x00ab->B:53:0x00e9], SYNTHETIC] */
    public final void serializer(int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        drag dragVar = this.read;
        dragVar.RemoteActionCompatParcelizer();
        animateToWithDecay animatetowithdecay = this.RatingCompat;
        int[] iArr2 = animatetowithdecay.serializer;
        long[] jArr = animatetowithdecay.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        char c = 7;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            while (true) {
                long j = jArr[i6];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i6 != length) {
                        break;
                        break;
                    }
                    i6++;
                } else {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i8 = 0; i8 < i7; i8++) {
                        if ((j & 255) < 128 && i <= (i4 = iArr2[(i6 << 3) + i8]) && i4 <= i2) {
                            dragVar.RemoteActionCompatParcelizer(i4);
                        }
                        j >>= 8;
                    }
                    if (i7 != 8) {
                        break;
                    } else if (i6 != length) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        accessanimateTo accessanimateto = this.MediaSessionCompatToken;
        int[] iArr3 = accessanimateto.RemoteActionCompatParcelizer;
        long[] jArr2 = accessanimateto.IconCompatParcelizer;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j2 = jArr2[i9];
                if ((((~j2) << c) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((j2 & 255) < 128 && i <= (i3 = iArr3[(i9 << 3) + i11]) && i3 <= i2) {
                            dragVar.RemoteActionCompatParcelizer(i3);
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i9 != length2) {
                        break;
                    }
                    i9++;
                    c = 7;
                } else if (i9 != length2) {
                    break;
                    break;
                } else {
                    i9++;
                    c = 7;
                }
            }
        }
        animateToWithDecay animatetowithdecay2 = this.PlaybackStateCompatCustomAction;
        int[] iArr4 = animatetowithdecay2.serializer;
        long[] jArr3 = animatetowithdecay2.RemoteActionCompatParcelizer;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j3 = jArr3[i12];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j3 & 255) < 128) {
                            int i15 = iArr4[(i12 << 3) + i14];
                            if (i <= i15 && i15 <= i2) {
                                dragVar.RemoteActionCompatParcelizer(i15);
                            }
                            i5 = 8;
                        }
                        j3 >>= i5;
                    }
                    if (i13 != i5) {
                        break;
                    }
                    if (i12 != length3) {
                        break;
                    }
                    i12++;
                    i5 = 8;
                } else if (i12 != length3) {
                    break;
                    break;
                } else {
                    i12++;
                    i5 = 8;
                }
            }
        }
        int[] iArr5 = dragVar.RemoteActionCompatParcelizer;
        long[] jArr4 = dragVar.serializer;
        int length4 = jArr4.length - 2;
        if (length4 < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j4 = jArr4[i16];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8 - ((~(i16 - length4)) >>> 31);
                int i18 = 0;
                while (i18 < i17) {
                    if ((j4 & 255) < 128) {
                        int i19 = iArr5[(i16 << 3) + i18];
                        List list = (List) animatetowithdecay.MediaBrowserCompatMediaItem(i19);
                        if (list != null) {
                            int size = list.size();
                            for (int i20 = 0; i20 < size; i20++) {
                                ((LinearProgressIndicatorTokens) list.get(i20)).read();
                            }
                        }
                        int iWrite = accessanimateto.write(i19);
                        if (iWrite >= 0) {
                            accessanimateto.serializer--;
                            long[] jArr5 = accessanimateto.IconCompatParcelizer;
                            int i21 = accessanimateto.write;
                            int i22 = iWrite >> 3;
                            int i23 = (iWrite & 7) << 3;
                            long j5 = (jArr5[i22] & (~(255 << i23))) | (254 << i23);
                            jArr5[i22] = j5;
                            jArr5[(((iWrite - 7) & i21) + (i21 & 7)) >> 3] = j5;
                        }
                        animatetowithdecay2.MediaBrowserCompatMediaItem(i19);
                    } else {
                        iArr5 = iArr5;
                    }
                    j4 >>= 8;
                    i18++;
                    iArr5 = iArr5;
                }
                iArr = iArr5;
                if (i17 != 8) {
                    return;
                }
            } else {
                iArr = iArr5;
            }
            if (i16 == length4) {
                return;
            }
            i16++;
            iArr5 = iArr;
        }
    }
}
