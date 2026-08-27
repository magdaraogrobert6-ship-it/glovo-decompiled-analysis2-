package o;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class migrateSealedSessionsMapToJson implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ com.sentiance.sdk.util.f serializer;

    public /* synthetic */ migrateSealedSessionsMapToJson(com.sentiance.sdk.util.f fVar, Object obj, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = fVar;
        this.read = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        com.sentiance.sdk.util.f fVar = this.serializer;
        if (i != 0) {
            ((OnFailureListener) obj).onFailure(fVar.RemoteActionCompatParcelizer);
        } else {
            ((PinnableContainer) obj).onComplete(fVar);
        }
    }
}
