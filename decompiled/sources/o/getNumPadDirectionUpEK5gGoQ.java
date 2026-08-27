package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadDirectionUpEK5gGoQ implements Iterable, getNumPadMoveHomeEK5gGoQ, getNumPadMultiplyEK5gGoQ {
    public final TreeMap IconCompatParcelizer;
    public final TreeMap RemoteActionCompatParcelizer;

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Boolean serializer() {
        return Boolean.TRUE;
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final String IconCompatParcelizer() {
        return write(",");
    }

    public final Iterator MediaBrowserCompatMediaItem() {
        return this.IconCompatParcelizer.keySet().iterator();
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ MediaDescriptionCompat() {
        getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq = new getNumPadDirectionUpEK5gGoQ();
        for (Map.Entry entry : this.IconCompatParcelizer.entrySet()) {
            boolean z = entry.getValue() instanceof getNumPadMultiplyEK5gGoQ;
            TreeMap treeMap = getnumpaddirectionupek5ggoq.IconCompatParcelizer;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (getNumPadMoveHomeEK5gGoQ) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((getNumPadMoveHomeEK5gGoQ) entry.getValue()).MediaDescriptionCompat());
            }
        }
        return getnumpaddirectionupek5ggoq;
    }

    public final int MediaSessionCompatQueueItem() {
        TreeMap treeMap = this.IconCompatParcelizer;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    public final List RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList(MediaSessionCompatQueueItem());
        for (int i = 0; i < MediaSessionCompatQueueItem(); i++) {
            arrayList.add(IconCompatParcelizer(i));
        }
        return arrayList;
    }

    @Override // o.getNumPadMultiplyEK5gGoQ
    public final boolean RemoteActionCompatParcelizer(String str) {
        return "length".equals(str) || this.RemoteActionCompatParcelizer.containsKey(str);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new getNumPadDirectionLeftEK5gGoQ(this);
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Iterator read() {
        return new getNumPadDirectionRightEK5gGoQ(this, this.IconCompatParcelizer.keySet().iterator(), this.RemoteActionCompatParcelizer.keySet().iterator());
    }

    public final boolean read(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.IconCompatParcelizer;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        DrawableTransformation.read(d$$ExternalSyntheticOutline0.m(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
        return false;
    }

    @Override // o.getNumPadMultiplyEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ serializer(String str) {
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq;
        if ("length".equals(str)) {
            return new getNumPadLeftParenthesisEK5gGoQ(Double.valueOf(MediaSessionCompatQueueItem()));
        }
        return (!RemoteActionCompatParcelizer(str) || (getnumpadmovehomeek5ggoq = (getNumPadMoveHomeEK5gGoQ) this.RemoteActionCompatParcelizer.get(str)) == null) ? getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem : getnumpadmovehomeek5ggoq;
    }

    public final void serializer(int i) {
        TreeMap treeMap = this.IconCompatParcelizer;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem);
            return;
        }
        while (true) {
            int i3 = i + 1;
            if (i3 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i3);
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq = (getNumPadMoveHomeEK5gGoQ) treeMap.get(numValueOf2);
            if (getnumpadmovehomeek5ggoq != null) {
                treeMap.put(Integer.valueOf(i), getnumpadmovehomeek5ggoq);
                treeMap.remove(numValueOf2);
            }
            i = i3;
        }
    }

    public final String toString() {
        return write(",");
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Double write() {
        TreeMap treeMap = this.IconCompatParcelizer;
        if (treeMap.size() == 1) {
            return IconCompatParcelizer(0).write();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final String write(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.IconCompatParcelizer.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= MediaSessionCompatQueueItem()) {
                    break;
                }
                getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqIconCompatParcelizer = IconCompatParcelizer(i);
                sb.append(str2);
                if (!(getnumpadmovehomeek5ggoqIconCompatParcelizer instanceof getOEK5gGoQ) && !(getnumpadmovehomeek5ggoqIconCompatParcelizer instanceof getNumPadPageDownEK5gGoQ)) {
                    sb.append(getnumpadmovehomeek5ggoqIconCompatParcelizer.IconCompatParcelizer());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getNumPadDirectionUpEK5gGoQ)) {
            return false;
        }
        getNumPadDirectionUpEK5gGoQ getnumpaddirectionupek5ggoq = (getNumPadDirectionUpEK5gGoQ) obj;
        if (MediaSessionCompatQueueItem() != getnumpaddirectionupek5ggoq.MediaSessionCompatQueueItem()) {
            return false;
        }
        TreeMap treeMap = this.IconCompatParcelizer;
        if (treeMap.isEmpty()) {
            return getnumpaddirectionupek5ggoq.IconCompatParcelizer.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!IconCompatParcelizer(iIntValue).equals(getnumpaddirectionupek5ggoq.IconCompatParcelizer(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // o.getNumPadMultiplyEK5gGoQ
    public final void RemoteActionCompatParcelizer(String str, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        TreeMap treeMap = this.RemoteActionCompatParcelizer;
        if (getnumpadmovehomeek5ggoq == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, getnumpadmovehomeek5ggoq);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x029e, code lost:
    
        if (o.FwFClientevaluateFeature1.RemoteActionCompatParcelizer(r26, r28, (o.getNumPadMoveEndEK5gGoQ) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).MediaSessionCompatQueueItem() == MediaSessionCompatQueueItem()) goto L162;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.getNumPadMoveHomeEK5gGoQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.getNumPadMoveHomeEK5gGoQ read(java.lang.String r27, androidx.transition.TransitionValuesMaps r28, java.util.ArrayList r29) {
        /*
            Method dump skipped, instruction units count: 2076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getNumPadDirectionUpEK5gGoQ.read(java.lang.String, androidx.transition.TransitionValuesMaps, java.util.ArrayList):o.getNumPadMoveHomeEK5gGoQ");
    }

    public getNumPadDirectionUpEK5gGoQ(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                RemoteActionCompatParcelizer(i, (getNumPadMoveHomeEK5gGoQ) list.get(i));
            }
        }
    }

    public final getNumPadMoveHomeEK5gGoQ IconCompatParcelizer(int i) {
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq;
        if (i < MediaSessionCompatQueueItem()) {
            return (!read(i) || (getnumpadmovehomeek5ggoq = (getNumPadMoveHomeEK5gGoQ) this.IconCompatParcelizer.get(Integer.valueOf(i))) == null) ? getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem : getnumpadmovehomeek5ggoq;
        }
        DrawableTransformation.read("Attempting to get element outside of current array");
        return null;
    }

    public final void RemoteActionCompatParcelizer(int i, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        if (i > 32468) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Array too large");
            return;
        }
        if (i >= 0) {
            TreeMap treeMap = this.IconCompatParcelizer;
            if (getnumpadmovehomeek5ggoq == null) {
                treeMap.remove(Integer.valueOf(i));
                return;
            } else {
                treeMap.put(Integer.valueOf(i), getnumpadmovehomeek5ggoq);
                return;
            }
        }
        DrawableTransformation.read(d$$ExternalSyntheticOutline0.m(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
    }

    public getNumPadDirectionUpEK5gGoQ() {
        this.IconCompatParcelizer = new TreeMap();
        this.RemoteActionCompatParcelizer = new TreeMap();
    }
}
