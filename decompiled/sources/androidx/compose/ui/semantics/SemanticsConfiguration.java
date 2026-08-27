package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.JvmActuals_jvmKt;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.Map;
import o.accessrestartable;
import o.awaitLongPressOrCancellationrnUCldI;
import o.awaitTouchSlopOrCancellationjO51t88;
import o.detectDragGestures;
import o.displayInAppMessagelambda121;
import o.getCieXyz;
import o.isInvalidIndex;
import o.onRemeasuredozmzZPI;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.relocationOffsetfbGrOKE;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsConfiguration implements SemanticsPropertyReceiver, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, displayInAppMessagelambda121 {
    public static final int $stable = 8;
    private relocationOffsetfbGrOKE _accessibilityExtraKeys;
    private boolean isClearingSemantics;
    private boolean isMergingSemanticsOfDescendants;
    private Map<SemanticsPropertyKey<?>, ? extends Object> mapWrapper;
    private final onRemeasuredozmzZPI props;

    public final awaitTouchSlopOrCancellationjO51t88 getAccessibilityExtraKeys$ui() {
        return this._accessibilityExtraKeys;
    }

    public final onRemeasuredozmzZPI getProps$ui() {
        return this.props;
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public final void setClearingSemantics(boolean z) {
        this.isClearingSemantics = z;
    }

    public final void setMergingSemanticsOfDescendants(boolean z) {
        this.isMergingSemanticsOfDescendants = z;
    }

    public final <T> boolean contains(SemanticsPropertyKey<T> semanticsPropertyKey) {
        return this.props.read(semanticsPropertyKey);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004d A[LOOP:0: B:5:0x000f->B:18:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[SYNTHETIC] */
    public final boolean containsImportantForAccessibility$ui() {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.props;
        Object[] objArr = onremeasuredozmzzpi.IconCompatParcelizer;
        Object[] objArr2 = onremeasuredozmzzpi.MediaMetadataCompat;
        long[] jArr = onremeasuredozmzzpi.write;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            if (((SemanticsPropertyKey) obj).isImportantForAccessibility$ui()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return false;
    }

    public final <T> T get(SemanticsPropertyKey<T> semanticsPropertyKey) {
        T t = (T) this.props.MediaBrowserCompatMediaItem(semanticsPropertyKey);
        if (t != null) {
            return t;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Key not present: ", semanticsPropertyKey, " - consider getOrElse or getOrNull");
        return null;
    }

    public final <T> T getOrElse(SemanticsPropertyKey<T> semanticsPropertyKey, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        T t = (T) this.props.MediaBrowserCompatMediaItem(semanticsPropertyKey);
        return t == null ? (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke() : t;
    }

    public final <T> T getOrElseNullable(SemanticsPropertyKey<T> semanticsPropertyKey, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        T t = (T) this.props.MediaBrowserCompatMediaItem(semanticsPropertyKey);
        return t == null ? (T) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke() : t;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isClearingSemantics) + d$$ExternalSyntheticOutline0.m(this.props.hashCode() * 31, 31, this.isMergingSemanticsOfDescendants);
    }

    public final void mergeChild$ui(SemanticsConfiguration semanticsConfiguration) {
        onRemeasuredozmzZPI onremeasuredozmzzpi = semanticsConfiguration.props;
        Object[] objArr = onremeasuredozmzzpi.IconCompatParcelizer;
        Object[] objArr2 = onremeasuredozmzzpi.MediaMetadataCompat;
        long[] jArr = onremeasuredozmzzpi.write;
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
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        Object objMediaBrowserCompatMediaItem = this.props.MediaBrowserCompatMediaItem(semanticsPropertyKey);
                        semanticsPropertyKey.getClass();
                        Object objMerge = semanticsPropertyKey.merge(objMediaBrowserCompatMediaItem, obj2);
                        if (objMerge != null) {
                            this.props.write(semanticsPropertyKey, objMerge);
                        }
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

    public SemanticsConfiguration() {
        long[] jArr = detectDragGestures.write;
        this.props = new onRemeasuredozmzZPI();
    }

    public final void collapsePeer$ui(SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (semanticsConfiguration.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        onRemeasuredozmzZPI onremeasuredozmzzpi = semanticsConfiguration.props;
        Object[] objArr = onremeasuredozmzzpi.IconCompatParcelizer;
        Object[] objArr2 = onremeasuredozmzzpi.MediaMetadataCompat;
        long[] jArr = onremeasuredozmzzpi.write;
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
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        if (!this.props.serializer(semanticsPropertyKey)) {
                            this.props.write(semanticsPropertyKey, obj2);
                        } else if (obj2 instanceof AccessibilityAction) {
                            Object objMediaBrowserCompatMediaItem = this.props.MediaBrowserCompatMediaItem(semanticsPropertyKey);
                            objMediaBrowserCompatMediaItem.getClass();
                            AccessibilityAction accessibilityAction = (AccessibilityAction) objMediaBrowserCompatMediaItem;
                            onRemeasuredozmzZPI onremeasuredozmzzpi2 = this.props;
                            String label = accessibilityAction.getLabel();
                            if (label == null) {
                                label = ((AccessibilityAction) obj2).getLabel();
                            }
                            String str = label;
                            isInvalidIndex action = accessibilityAction.getAction();
                            if (action == null) {
                                action = ((AccessibilityAction) obj2).getAction();
                            }
                            onremeasuredozmzzpi2.write(semanticsPropertyKey, new AccessibilityAction(str, action));
                        }
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

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005d A[LOOP:0: B:5:0x0026->B:15:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[EDGE_INSN: B:18:0x0060->B:16:0x0060 BREAK  A[LOOP:0: B:5:0x0026->B:15:0x005d], SYNTHETIC] */
    public final SemanticsConfiguration copy() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        semanticsConfiguration.isClearingSemantics = this.isClearingSemantics;
        onRemeasuredozmzZPI onremeasuredozmzzpi = semanticsConfiguration.props;
        onRemeasuredozmzZPI onremeasuredozmzzpi2 = this.props;
        onremeasuredozmzzpi.getClass();
        onremeasuredozmzzpi2.getClass();
        Object[] objArr = onremeasuredozmzzpi2.IconCompatParcelizer;
        Object[] objArr2 = onremeasuredozmzzpi2.MediaMetadataCompat;
        long[] jArr = onremeasuredozmzzpi2.write;
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
                            int i4 = (i << 3) + i3;
                            onremeasuredozmzzpi.write(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return semanticsConfiguration;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.props, semanticsConfiguration.props}, getCieXyz.write())).booleanValue() && this.isMergingSemanticsOfDescendants == semanticsConfiguration.isMergingSemanticsOfDescendants && this.isClearingSemantics == semanticsConfiguration.isClearingSemantics;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        Map<SemanticsPropertyKey<?>, ? extends Object> map = this.mapWrapper;
        if (map == null) {
            onRemeasuredozmzZPI onremeasuredozmzzpi = this.props;
            onremeasuredozmzzpi.getClass();
            accessrestartable accessrestartableVar = new accessrestartable(onremeasuredozmzzpi);
            this.mapWrapper = accessrestartableVar;
            map = accessrestartableVar;
        }
        return map.entrySet().iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.semantics.SemanticsPropertyReceiver
    public <T> void set(SemanticsPropertyKey<T> semanticsPropertyKey, T t) {
        if ((t instanceof AccessibilityAction) && contains(semanticsPropertyKey)) {
            Object objMediaBrowserCompatMediaItem = this.props.MediaBrowserCompatMediaItem(semanticsPropertyKey);
            objMediaBrowserCompatMediaItem.getClass();
            AccessibilityAction accessibilityAction = (AccessibilityAction) objMediaBrowserCompatMediaItem;
            onRemeasuredozmzZPI onremeasuredozmzzpi = this.props;
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) t;
            String label = accessibilityAction2.getLabel();
            if (label == null) {
                label = accessibilityAction.getLabel();
            }
            isInvalidIndex action = accessibilityAction2.getAction();
            if (action == null) {
                action = accessibilityAction.getAction();
            }
            onremeasuredozmzzpi.write(semanticsPropertyKey, new AccessibilityAction(label, action));
        } else {
            this.props.write(semanticsPropertyKey, t);
        }
        if (semanticsPropertyKey.getAccessibilityExtraKey$ui() != null) {
            if (this._accessibilityExtraKeys == null) {
                relocationOffsetfbGrOKE relocationoffsetfbgroke = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
                this._accessibilityExtraKeys = new relocationOffsetfbGrOKE();
            }
            relocationOffsetfbGrOKE relocationoffsetfbgroke2 = this._accessibilityExtraKeys;
            if (relocationoffsetfbgroke2 != null) {
                relocationoffsetfbgroke2.serializer(semanticsPropertyKey);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079 A[DONT_INVERT, PHI: r2
  0x0079: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x0040, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007b A[LOOP:0: B:12:0x0032->B:22:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007e A[EDGE_INSN: B:26:0x007e->B:23:0x007e BREAK  A[LOOP:0: B:12:0x0032->B:22:0x007b], SYNTHETIC] */
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.isMergingSemanticsOfDescendants) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.isClearingSemantics) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.props;
        Object[] objArr = onremeasuredozmzzpi.IconCompatParcelizer;
        Object[] objArr2 = onremeasuredozmzzpi.MediaMetadataCompat;
        long[] jArr = onremeasuredozmzzpi.write;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((SemanticsPropertyKey) obj).getName());
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + "{ " + ((Object) sb) + " }";
    }
}
