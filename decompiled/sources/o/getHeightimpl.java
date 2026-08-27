package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getHeightimpl implements getGreen0d7_KjU {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ getHeightimpl(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }

    @Override // o.getGreen0d7_KjU
    public final Bundle saveState() {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        return i != 0 ? ((androidx.fragment.app.FragmentActivity) obj).lambda$init$0() : ((div7Ah8Wj8) obj).PlaybackStateCompatCustomAction();
    }
}
