package o;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class verticalGradient8A3gB4 {
    public Object RemoteActionCompatParcelizer;
    public Object read;

    public static int IconCompatParcelizer(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i4++;
            if (i4 == i2) {
                i3++;
                i4 = 0;
            } else if (i4 > i2) {
                i3++;
                i4 = 1;
            }
        }
        return i4 + 1 > i2 ? i3 + 1 : i3;
    }

    public View IconCompatParcelizer(int i, int i2, int i3, int i4) {
        sweepGradientUv8p0NA sweepgradientuv8p0na = (sweepGradientUv8p0NA) this.RemoteActionCompatParcelizer;
        BlendModeColorFilterHelperExternalSyntheticApiModelOutline0 blendModeColorFilterHelperExternalSyntheticApiModelOutline0 = (BlendModeColorFilterHelperExternalSyntheticApiModelOutline0) this.read;
        int i5 = blendModeColorFilterHelperExternalSyntheticApiModelOutline0.read();
        int iSerializer = blendModeColorFilterHelperExternalSyntheticApiModelOutline0.serializer();
        int i6 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMediaSessionCompatResultReceiverWrapper = blendModeColorFilterHelperExternalSyntheticApiModelOutline0.serializer != 0 ? blendModeColorFilterHelperExternalSyntheticApiModelOutline0.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper(i) : blendModeColorFilterHelperExternalSyntheticApiModelOutline0.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper(i);
            int iIconCompatParcelizer = blendModeColorFilterHelperExternalSyntheticApiModelOutline0.IconCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
            int iRemoteActionCompatParcelizer = blendModeColorFilterHelperExternalSyntheticApiModelOutline0.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
            sweepgradientuv8p0na.read = i5;
            sweepgradientuv8p0na.IconCompatParcelizer = iSerializer;
            sweepgradientuv8p0na.serializer = iIconCompatParcelizer;
            sweepgradientuv8p0na.write = iRemoteActionCompatParcelizer;
            if (i3 != 0) {
                sweepgradientuv8p0na.RemoteActionCompatParcelizer = i3;
                if (sweepgradientuv8p0na.RemoteActionCompatParcelizer()) {
                    return viewMediaSessionCompatResultReceiverWrapper;
                }
            }
            if (i4 != 0) {
                sweepgradientuv8p0na.RemoteActionCompatParcelizer = i4;
                if (sweepgradientuv8p0na.RemoteActionCompatParcelizer()) {
                    view = viewMediaSessionCompatResultReceiverWrapper;
                }
            }
            i += i6;
        }
        return view;
    }

    public void IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls) {
        processDragGesture processdraggesture = (processDragGesture) this.read;
        linearGradientmHitzGk lineargradientmhitzgk = (linearGradientmHitzGk) processdraggesture.get(viewHolder);
        if (lineargradientmhitzgk == null) {
            lineargradientmhitzgk = linearGradientmHitzGk.read();
            processdraggesture.put(viewHolder, lineargradientmhitzgk);
        }
        lineargradientmhitzgk.read = infiniteAnimationPolicyDefaultImpls;
        lineargradientmhitzgk.serializer |= 8;
    }

    public void RemoteActionCompatParcelizer() {
        ((SparseIntArray) this.read).clear();
    }

    public void read(int i) {
        int[] iArr = (int[]) this.read;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.read = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.read = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.read;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void read(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        linearGradientmHitzGk lineargradientmhitzgk = (linearGradientmHitzGk) ((processDragGesture) this.read).get(viewHolder);
        if (lineargradientmhitzgk == null) {
            return;
        }
        lineargradientmhitzgk.serializer &= -2;
    }

    public boolean read(View view) {
        sweepGradientUv8p0NA sweepgradientuv8p0na = (sweepGradientUv8p0NA) this.RemoteActionCompatParcelizer;
        BlendModeColorFilterHelperExternalSyntheticApiModelOutline0 blendModeColorFilterHelperExternalSyntheticApiModelOutline0 = (BlendModeColorFilterHelperExternalSyntheticApiModelOutline0) this.read;
        int i = blendModeColorFilterHelperExternalSyntheticApiModelOutline0.read();
        int iSerializer = blendModeColorFilterHelperExternalSyntheticApiModelOutline0.serializer();
        int iIconCompatParcelizer = blendModeColorFilterHelperExternalSyntheticApiModelOutline0.IconCompatParcelizer(view);
        int iRemoteActionCompatParcelizer = blendModeColorFilterHelperExternalSyntheticApiModelOutline0.RemoteActionCompatParcelizer(view);
        sweepgradientuv8p0na.read = i;
        sweepgradientuv8p0na.IconCompatParcelizer = iSerializer;
        sweepgradientuv8p0na.serializer = iIconCompatParcelizer;
        sweepgradientuv8p0na.write = iRemoteActionCompatParcelizer;
        sweepgradientuv8p0na.RemoteActionCompatParcelizer = 24579;
        return sweepgradientuv8p0na.RemoteActionCompatParcelizer();
    }

    public void serializer(int i, int i2) {
        int[] iArr = (int[]) this.read;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        read(i3);
        int[] iArr2 = (int[]) this.read;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.read;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.RemoteActionCompatParcelizer;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.RemoteActionCompatParcelizer).get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.write;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.RemoteActionCompatParcelizer).remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.write = i4 - i2;
                }
            }
        }
    }

    public void serializer(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        ContextMenuSpec contextMenuSpec = (ContextMenuSpec) this.RemoteActionCompatParcelizer;
        int iIconCompatParcelizer = contextMenuSpec.IconCompatParcelizer();
        while (true) {
            iIconCompatParcelizer--;
            if (iIconCompatParcelizer < 0) {
                break;
            }
            if (viewHolder == contextMenuSpec.write(iIconCompatParcelizer)) {
                Object[] objArr = contextMenuSpec.serializer;
                Object obj = objArr[iIconCompatParcelizer];
                Object obj2 = ContextMenuScopeExternalSyntheticLambda0.RemoteActionCompatParcelizer;
                if (obj == obj2) {
                    break;
                }
                objArr[iIconCompatParcelizer] = obj2;
                contextMenuSpec.RemoteActionCompatParcelizer = true;
                break;
            }
        }
        linearGradientmHitzGk lineargradientmhitzgk = (linearGradientmHitzGk) ((processDragGesture) this.read).remove(viewHolder);
        if (lineargradientmhitzgk != null) {
            lineargradientmhitzgk.serializer = 0;
            lineargradientmhitzgk.write = null;
            lineargradientmhitzgk.read = null;
            linearGradientmHitzGk.RemoteActionCompatParcelizer.IconCompatParcelizer(lineargradientmhitzgk);
        }
    }

    public InfiniteAnimationPolicyDefaultImpls write(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i) {
        linearGradientmHitzGk lineargradientmhitzgk;
        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls;
        processDragGesture processdraggesture = (processDragGesture) this.read;
        int iIconCompatParcelizer = processdraggesture.IconCompatParcelizer(viewHolder);
        if (iIconCompatParcelizer >= 0 && (lineargradientmhitzgk = (linearGradientmHitzGk) processdraggesture.write(iIconCompatParcelizer)) != null) {
            int i2 = lineargradientmhitzgk.serializer;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                lineargradientmhitzgk.serializer = i3;
                if (i == 4) {
                    infiniteAnimationPolicyDefaultImpls = lineargradientmhitzgk.write;
                } else if (i == 8) {
                    infiniteAnimationPolicyDefaultImpls = lineargradientmhitzgk.read;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    processdraggesture.RemoteActionCompatParcelizer(iIconCompatParcelizer);
                    lineargradientmhitzgk.serializer = 0;
                    lineargradientmhitzgk.write = null;
                    lineargradientmhitzgk.read = null;
                    linearGradientmHitzGk.RemoteActionCompatParcelizer.IconCompatParcelizer(lineargradientmhitzgk);
                }
                return infiniteAnimationPolicyDefaultImpls;
            }
        }
        return null;
    }

    public void write() {
        int[] iArr = (int[]) this.read;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.RemoteActionCompatParcelizer = null;
    }

    public void write(int i, int i2) {
        int[] iArr = (int[]) this.read;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        read(i3);
        int[] iArr2 = (int[]) this.read;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.read, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.RemoteActionCompatParcelizer;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((ArrayList) this.RemoteActionCompatParcelizer).get(size);
            int i4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.write;
            if (i4 >= i) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.write = i4 + i2;
            }
        }
    }

    public verticalGradient8A3gB4(int i) {
        if (i != 3) {
            this.read = new processDragGesture(0);
            this.RemoteActionCompatParcelizer = new ContextMenuSpec((Object) null);
        } else {
            this.read = new SparseIntArray();
            this.RemoteActionCompatParcelizer = new SparseIntArray();
        }
    }

    public verticalGradient8A3gB4(BlendModeColorFilterHelperExternalSyntheticApiModelOutline0 blendModeColorFilterHelperExternalSyntheticApiModelOutline0) {
        this.read = blendModeColorFilterHelperExternalSyntheticApiModelOutline0;
        sweepGradientUv8p0NA sweepgradientuv8p0na = new sweepGradientUv8p0NA();
        sweepgradientuv8p0na.RemoteActionCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = sweepgradientuv8p0na;
    }

    public verticalGradient8A3gB4() {
    }
}
