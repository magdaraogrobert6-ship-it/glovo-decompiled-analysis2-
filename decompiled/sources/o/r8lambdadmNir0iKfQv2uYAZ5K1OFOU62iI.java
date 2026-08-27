package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI {
    private final ArrayList IconCompatParcelizer;
    private final r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk RemoteActionCompatParcelizer;
    private int read;
    private final r8lambdaoqJTd6zX2vbP1MOrSGbf1Qi5V0 serializer;

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.clear();
            Iterator it = this.IconCompatParcelizer.iterator();
            while (it.hasNext()) {
                ((TriggerAssetDataStoreProviderCompanion) it.next()).clear();
            }
            int i = this.read - 1;
            this.read = i;
            if (i < 0) {
                this.read = 0;
            }
            if (this.read == 0) {
                this.serializer.serializer(this);
            }
        }
    }

    public final r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer.size();
    }

    public final void serializer(float[] fArr, long j) {
        this.RemoteActionCompatParcelizer.serializer(j);
        for (int i = 0; i < fArr.length; i++) {
            ((TriggerAssetDataStoreProviderCompanion) this.IconCompatParcelizer.get(i)).IconCompatParcelizer(fArr[i]);
        }
    }

    public final int write() {
        return this.RemoteActionCompatParcelizer.size();
    }

    public r8lambdadmNir0iKfQv2uYAZ5K1OFOU62iI(int i, r8lambdaoqJTd6zX2vbP1MOrSGbf1Qi5V0 r8lambdaoqjtd6zx2vbp1morsgbf1qi5v0) {
        this.IconCompatParcelizer = new ArrayList(i);
        this.serializer = r8lambdaoqjtd6zx2vbp1morsgbf1qi5v0;
        for (int i2 = 0; i2 < i; i2++) {
            this.IconCompatParcelizer.add(new TriggerAssetDataStoreProviderCompanion());
        }
        this.RemoteActionCompatParcelizer = new r8lambdaK_msz2dNaNoyi5bWwE2HzkAcTFk();
    }

    public final TriggerAssetDataStoreProviderCompanion read(int i) {
        return (TriggerAssetDataStoreProviderCompanion) this.IconCompatParcelizer.get(i);
    }

    public final void serializer() {
        synchronized (this) {
            this.read++;
        }
    }
}
