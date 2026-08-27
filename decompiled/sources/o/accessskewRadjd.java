package o;

import android.os.IInterface;
import android.os.RemoteCallbackList;

/* JADX INFO: loaded from: classes4.dex */
public final class accessskewRadjd extends RemoteCallbackList {
    public final /* synthetic */ accessdrawArcjd write;

    public accessskewRadjd(accessdrawArcjd accessdrawarcjd) {
        this.write = accessdrawarcjd;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((BrushKt) iInterface).getClass();
        obj.getClass();
        this.write.read.remove((Integer) obj);
    }
}
