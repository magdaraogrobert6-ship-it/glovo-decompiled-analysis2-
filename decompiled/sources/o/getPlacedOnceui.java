package o;

import com.google.android.gms.dynamite.zzj;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class getPlacedOnceui implements onApproachPlacementui {
    public static final zzj IconCompatParcelizer = new zzj(27);
    public final Object RemoteActionCompatParcelizer;
    public Object read;

    @Override // o.onApproachPlacementui
    public void RemoteActionCompatParcelizer(notifyChildrenUsingLookaheadCoordinatesWhilePlacing notifychildrenusinglookaheadcoordinateswhileplacing, int i) throws IOException {
        int[] iArr = (int[]) this.read;
        try {
            notifychildrenusinglookaheadcoordinateswhileplacing.read((byte[]) this.RemoteActionCompatParcelizer, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            notifychildrenusinglookaheadcoordinateswhileplacing.close();
        }
    }

    public getPlacedOnceui(androidx.work.impl.WorkerWrapper.Builder builder) {
        this.RemoteActionCompatParcelizer = builder;
        this.read = IconCompatParcelizer;
    }

    public getPlacedOnceui(int[] iArr, byte[] bArr) {
        this.RemoteActionCompatParcelizer = bArr;
        this.read = iArr;
    }
}
