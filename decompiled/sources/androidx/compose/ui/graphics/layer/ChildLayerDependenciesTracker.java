package androidx.compose.ui.graphics.layer;

import androidx.compose.ui.graphics.InlineClassHelperKt;
import o.awaitLongPressOrCancellationrnUCldI;
import o.awaitTouchSlopOrCancellationjO51t88;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.relocationOffsetfbGrOKE;

/* JADX INFO: loaded from: classes.dex */
public final class ChildLayerDependenciesTracker {
    public static final int $stable = 8;
    private relocationOffsetfbGrOKE dependenciesSet;
    private GraphicsLayer dependency;
    private relocationOffsetfbGrOKE oldDependenciesSet;
    private GraphicsLayer oldDependency;
    private boolean trackingInProgress;

    /* JADX WARN: Code duplicated, block: B:29:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008c A[LOOP:0: B:20:0x0057->B:30:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008f A[EDGE_INSN: B:34:0x008f->B:31:0x008f BREAK  A[LOOP:0: B:20:0x0057->B:30:0x008c], SYNTHETIC] */
    public final void withTracking(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.oldDependency = this.dependency;
        relocationOffsetfbGrOKE relocationoffsetfbgroke = this.dependenciesSet;
        if (relocationoffsetfbgroke != null && relocationoffsetfbgroke.read()) {
            relocationOffsetfbGrOKE relocationoffsetfbgroke2 = this.oldDependenciesSet;
            if (relocationoffsetfbgroke2 == null) {
                relocationOffsetfbGrOKE relocationoffsetfbgroke3 = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
                relocationoffsetfbgroke2 = new relocationOffsetfbGrOKE();
                this.oldDependenciesSet = relocationoffsetfbgroke2;
            }
            relocationoffsetfbgroke2.serializer((awaitTouchSlopOrCancellationjO51t88) relocationoffsetfbgroke);
            relocationoffsetfbgroke.serializer();
        }
        this.trackingInProgress = true;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        this.trackingInProgress = false;
        GraphicsLayer graphicsLayer = this.oldDependency;
        if (graphicsLayer != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(graphicsLayer);
        }
        relocationOffsetfbGrOKE relocationoffsetfbgroke4 = this.oldDependenciesSet;
        if (relocationoffsetfbgroke4 == null || !relocationoffsetfbgroke4.read()) {
            return;
        }
        Object[] objArr = relocationoffsetfbgroke4.RemoteActionCompatParcelizer;
        long[] jArr = relocationoffsetfbgroke4.IconCompatParcelizer;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        relocationoffsetfbgroke4.serializer();
    }

    public final boolean onDependencyAdded(GraphicsLayer graphicsLayer) {
        if (!this.trackingInProgress) {
            InlineClassHelperKt.throwIllegalArgumentException("Only add dependencies during a tracking");
        }
        relocationOffsetfbGrOKE relocationoffsetfbgroke = this.dependenciesSet;
        if (relocationoffsetfbgroke != null) {
            relocationoffsetfbgroke.serializer(graphicsLayer);
        } else if (this.dependency != null) {
            relocationOffsetfbGrOKE relocationoffsetfbgroke2 = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
            relocationOffsetfbGrOKE relocationoffsetfbgroke3 = new relocationOffsetfbGrOKE();
            GraphicsLayer graphicsLayer2 = this.dependency;
            graphicsLayer2.getClass();
            relocationoffsetfbgroke3.serializer(graphicsLayer2);
            relocationoffsetfbgroke3.serializer(graphicsLayer);
            this.dependenciesSet = relocationoffsetfbgroke3;
            this.dependency = null;
        } else {
            this.dependency = graphicsLayer;
        }
        relocationOffsetfbGrOKE relocationoffsetfbgroke4 = this.oldDependenciesSet;
        if (relocationoffsetfbgroke4 != null) {
            return !relocationoffsetfbgroke4.write(graphicsLayer);
        }
        if (this.oldDependency != graphicsLayer) {
            return true;
        }
        this.oldDependency = null;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a A[LOOP:0: B:11:0x0025->B:21:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005d A[EDGE_INSN: B:25:0x005d->B:22:0x005d BREAK  A[LOOP:0: B:11:0x0025->B:21:0x005a], SYNTHETIC] */
    public final void removeDependencies(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        GraphicsLayer graphicsLayer = this.dependency;
        if (graphicsLayer != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(graphicsLayer);
            this.dependency = null;
        }
        relocationOffsetfbGrOKE relocationoffsetfbgroke = this.dependenciesSet;
        if (relocationoffsetfbgroke != null) {
            Object[] objArr = relocationoffsetfbgroke.RemoteActionCompatParcelizer;
            long[] jArr = relocationoffsetfbgroke.IconCompatParcelizer;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            relocationoffsetfbgroke.serializer();
        }
    }
}
