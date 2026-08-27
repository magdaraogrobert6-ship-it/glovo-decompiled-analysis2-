package androidx.compose.ui.node;

import androidx.compose.ui.layout.Ruler;
import java.util.Arrays;
import o.awaitLongPressOrCancellationrnUCldI;
import o.awaitTouchSlopOrCancellationjO51t88;
import o.onContentCardClicked;
import o.onRemeasuredozmzZPI;
import o.relocationOffsetfbGrOKE;

/* JADX INFO: loaded from: classes.dex */
final class RulerTrackingMap {
    private relocationOffsetfbGrOKE layoutNodes;
    private final relocationOffsetfbGrOKE newRulers;
    private int size;
    private Ruler[] rulers = new Ruler[32];
    private float[] values = new float[32];
    private byte[] accessFlags = new byte[32];

    public final boolean contains(Ruler ruler) {
        return onContentCardClicked.IconCompatParcelizer(this.rulers, ruler);
    }

    public final float getOrDefault(Ruler ruler, float f) {
        int i = onContentCardClicked.read(this.rulers, ruler);
        return i < 0 ? f : this.values[i];
    }

    public final void set(Ruler ruler, float f) {
        int i = onContentCardClicked.read(this.rulers, ruler);
        if (i >= 0) {
            float[] fArr = this.values;
            if (fArr[i] != f) {
                fArr[i] = f;
                this.accessFlags[i] = 1;
                return;
            } else {
                byte[] bArr = this.accessFlags;
                if (bArr[i] == 2) {
                    bArr[i] = 0;
                    return;
                }
                return;
            }
        }
        int i2 = this.size;
        Ruler[] rulerArr = this.rulers;
        if (i2 == rulerArr.length) {
            int i3 = i2 * 2;
            this.rulers = (Ruler[]) Arrays.copyOf(rulerArr, i3);
            this.values = Arrays.copyOf(this.values, i3);
            this.accessFlags = Arrays.copyOf(this.accessFlags, i3);
        }
        this.rulers[i2] = ruler;
        this.accessFlags[i2] = 3;
        this.values[i2] = f;
        this.size++;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00be A[LOOP:3: B:28:0x0085->B:42:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x00c3 A[EDGE_INSN: B:79:0x00c3->B:43:0x00c3 BREAK  A[LOOP:3: B:28:0x0085->B:42:0x00be], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void notifyChanged(boolean z, LookaheadCapablePlaceable lookaheadCapablePlaceable, onRemeasuredozmzZPI onremeasuredozmzzpi) {
        LayoutNode layoutNode;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = this.accessFlags[i2];
            if (b == 3) {
                relocationOffsetfbGrOKE relocationoffsetfbgroke = this.newRulers;
                Ruler ruler = this.rulers[i2];
                ruler.getClass();
                relocationoffsetfbgroke.RemoteActionCompatParcelizer(ruler);
            } else if (b != 0 && onremeasuredozmzzpi != null) {
                Ruler ruler2 = this.rulers[i2];
                ruler2.getClass();
                relocationOffsetfbGrOKE relocationoffsetfbgroke2 = (relocationOffsetfbGrOKE) onremeasuredozmzzpi.IconCompatParcelizer(ruler2);
                if (relocationoffsetfbgroke2 != null) {
                    this.layoutNodes.serializer((awaitTouchSlopOrCancellationjO51t88) relocationoffsetfbgroke2);
                }
            }
        }
        int i3 = this.size;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte[] bArr = this.accessFlags;
            if (bArr[i5] == 2) {
                i4++;
            } else if (i4 > 0) {
                Ruler[] rulerArr = this.rulers;
                rulerArr[i5 - i4] = rulerArr[i5];
            }
            bArr[i5] = 2;
        }
        int i6 = this.size;
        for (int i7 = i6 - i4; i7 < i6; i7++) {
            this.rulers[i7] = null;
        }
        this.size -= i4;
        LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
        relocationOffsetfbGrOKE relocationoffsetfbgroke3 = this.newRulers;
        Object[] objArr = relocationoffsetfbgroke3.RemoteActionCompatParcelizer;
        long[] jArr = relocationoffsetfbgroke3.IconCompatParcelizer;
        int length = jArr.length - 2;
        long j = 255;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j2 = jArr[i8];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j2 & j) < 128) {
                            (parent == null ? lookaheadCapablePlaceable : parent).invalidateChildrenOfDefiningRuler$ui((Ruler) objArr[(i8 << 3) + i10]);
                        }
                        j2 >>= 8;
                        i10++;
                        j = 255;
                    }
                    if (i9 != 8) {
                        break;
                    }
                    if (i8 != length) {
                        break;
                    }
                    i8++;
                    j = 255;
                } else if (i8 != length) {
                    break;
                    break;
                } else {
                    i8++;
                    j = 255;
                }
            }
        }
        this.newRulers.serializer();
        relocationOffsetfbGrOKE relocationoffsetfbgroke4 = this.layoutNodes;
        Object[] objArr2 = relocationoffsetfbgroke4.RemoteActionCompatParcelizer;
        long[] jArr2 = relocationoffsetfbgroke4.IconCompatParcelizer;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i11 = 0;
            while (true) {
                long j3 = jArr2[i11];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j3 & 255) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr2[(i11 << 3) + i13]).get()) != null) {
                            if (z) {
                                layoutNode.requestLookaheadRelayout$ui(false);
                            } else {
                                layoutNode.requestRelayout$ui(false);
                            }
                        }
                        j3 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length2) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.layoutNodes.serializer();
    }

    public RulerTrackingMap() {
        relocationOffsetfbGrOKE relocationoffsetfbgroke = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
        this.layoutNodes = new relocationOffsetfbGrOKE();
        this.newRulers = new relocationOffsetfbGrOKE();
    }

    public final void clear() {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.rulers[i2] = null;
            this.values[i2] = Float.NaN;
            this.accessFlags[i2] = 0;
        }
        this.size = 0;
    }
}
