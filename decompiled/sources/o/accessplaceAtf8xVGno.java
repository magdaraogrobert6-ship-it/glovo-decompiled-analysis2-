package o;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzc;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessplaceAtf8xVGno implements getApparentToRealOffsetnOccac, OnSuccessListener, OnFailureListener, PinnableContainerPinnedHandle {
    public final zzw IconCompatParcelizer;
    public final Executor read;
    public final OuterPlacementScope serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ accessplaceAtf8xVGno(Executor executor, OuterPlacementScope outerPlacementScope, zzw zzwVar, int i) {
        this.write = i;
        this.read = executor;
        this.serializer = outerPlacementScope;
        this.IconCompatParcelizer = zzwVar;
    }

    @Override // o.PinnableContainerPinnedHandle
    public void onCanceled() {
        this.IconCompatParcelizer.read();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.IconCompatParcelizer.read(obj);
    }

    @Override // o.getApparentToRealOffsetnOccac
    public final void RemoteActionCompatParcelizer() {
        if (this.write == 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getApparentToRealOffsetnOccac
    public final void read(Task task) {
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (this.write != 0) {
            this.read.execute(new zzc(this, task, z, 17));
        } else {
            this.read.execute(new zzc(this, task, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0));
        }
    }
}
