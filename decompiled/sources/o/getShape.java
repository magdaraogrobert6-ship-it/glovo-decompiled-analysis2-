package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public final class getShape implements alpha {
    public onRemeasuredozmzZPI read;
    public final onRemeasuredozmzZPI serializer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM write;

    @Override // o.alpha
    public final Object consumeRestored(String str) {
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.serializer;
        List list = onremeasuredozmzzpi != null ? (List) onremeasuredozmzzpi.IconCompatParcelizer(str) : null;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && onremeasuredozmzzpi != null) {
            List listSubList = list.subList(1, list.size());
            int iWrite = onremeasuredozmzzpi.write(str);
            if (iWrite < 0) {
                iWrite = ~iWrite;
            }
            Object[] objArr = onremeasuredozmzzpi.MediaMetadataCompat;
            Object obj = objArr[iWrite];
            onremeasuredozmzzpi.IconCompatParcelizer[iWrite] = str;
            objArr[iWrite] = listSubList;
        }
        return list.get(0);
    }

    @Override // o.alpha
    public final boolean canBeSaved(Object obj) {
        return ((Boolean) this.write.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[LOOP:0: B:20:0x0037->B:30:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x007a A[EDGE_INSN: B:74:0x007a->B:31:0x007a BREAK  A[LOOP:0: B:20:0x0037->B:30:0x0072], SYNTHETIC] */
    @Override // o.alpha
    public final Map performSave() {
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        onRemeasuredozmzZPI onremeasuredozmzzpi = this.serializer;
        if (onremeasuredozmzzpi == null && this.read == null) {
            return SimpleItemTouchHelperCallback.serializer;
        }
        int i3 = onremeasuredozmzzpi != null ? onremeasuredozmzzpi.serializer : 0;
        onRemeasuredozmzZPI onremeasuredozmzzpi2 = this.read;
        HashMap map = new HashMap(i3 + (onremeasuredozmzzpi2 != null ? onremeasuredozmzzpi2.serializer : 0));
        long j = -9187201950435737472L;
        char c = 7;
        int i4 = 8;
        if (onremeasuredozmzzpi != null) {
            Object[] objArr = onremeasuredozmzzpi.IconCompatParcelizer;
            Object[] objArr2 = onremeasuredozmzzpi.MediaMetadataCompat;
            long[] jArr3 = onremeasuredozmzzpi.write;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr3[i5];
                    if ((((~j2) << 7) & j2 & j) == j) {
                        if (i5 != length) {
                            break;
                            break;
                        }
                        i5++;
                        j = -9187201950435737472L;
                    } else {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j2 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                map.put((String) objArr[i8], (List) objArr2[i8]);
                            }
                            j2 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                        if (i5 != length) {
                            break;
                        }
                        i5++;
                        j = -9187201950435737472L;
                    }
                }
            }
        }
        onRemeasuredozmzZPI onremeasuredozmzzpi3 = this.read;
        if (onremeasuredozmzzpi3 != null) {
            Object[] objArr3 = onremeasuredozmzzpi3.IconCompatParcelizer;
            Object[] objArr4 = onremeasuredozmzzpi3.MediaMetadataCompat;
            long[] jArr4 = onremeasuredozmzzpi3.write;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i9 = 0;
                while (true) {
                    long j3 = jArr4[i9];
                    if ((((~j3) << c) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                Object obj = objArr3[i12];
                                List list = (List) objArr4[i12];
                                String str = (String) obj;
                                if (list.size() == 1) {
                                    Object objInvoke = ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) list.get(0)).invoke();
                                    if (objInvoke != null) {
                                        if (!canBeSaved(objInvoke)) {
                                            DrawableTransformation.read((Object) getEventType.serializer(objInvoke));
                                            return null;
                                        }
                                        map.put(str, androidx.sqlite.SQLite.write(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    int i13 = 0;
                                    while (i13 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) list.get(i13)).invoke();
                                        if (objInvoke2 != null && !canBeSaved(objInvoke2)) {
                                            DrawableTransformation.read((Object) getEventType.serializer(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i13++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr4;
                                i2 = i4;
                            }
                            j3 >>= i2;
                            i11++;
                            i4 = i2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        i = i4;
                        if (i10 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i4;
                    }
                    if (i9 == length2) {
                        break;
                    }
                    i9++;
                    i4 = i;
                    jArr4 = jArr;
                    c = 7;
                }
            }
        }
        return map;
    }

    public getShape(Map map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        onRemeasuredozmzZPI onremeasuredozmzzpi;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        if (map == null || map.isEmpty()) {
            onremeasuredozmzzpi = null;
        } else {
            onremeasuredozmzzpi = new onRemeasuredozmzZPI(map.size());
            for (Map.Entry entry : map.entrySet()) {
                onremeasuredozmzzpi.write(entry.getKey(), entry.getValue());
            }
        }
        this.serializer = onremeasuredozmzzpi;
    }

    @Override // o.alpha
    public final BlockDropShadowElement registerProvider(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            Object[] objArr = {Character.valueOf(str.charAt(i))};
            if (!((Boolean) TuplesKt.RemoteActionCompatParcelizer(2031304659, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), -2031304657)).booleanValue()) {
                onRemeasuredozmzZPI onremeasuredozmzzpi = this.read;
                if (onremeasuredozmzzpi == null) {
                    long[] jArr = detectDragGestures.write;
                    onremeasuredozmzzpi = new onRemeasuredozmzZPI();
                    this.read = onremeasuredozmzzpi;
                }
                Object objMediaBrowserCompatMediaItem = onremeasuredozmzzpi.MediaBrowserCompatMediaItem(str);
                if (objMediaBrowserCompatMediaItem == null) {
                    objMediaBrowserCompatMediaItem = new ArrayList();
                    onremeasuredozmzzpi.write(str, objMediaBrowserCompatMediaItem);
                }
                ((List) objMediaBrowserCompatMediaItem).add(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                return new androidx.navigation.NavArgsLazy(onremeasuredozmzzpi, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Registered key is empty or blank");
        return null;
    }
}
