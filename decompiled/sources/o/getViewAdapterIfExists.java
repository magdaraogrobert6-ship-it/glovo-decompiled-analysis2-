package o;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import io.reactivex.MaybeEmitter;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class getViewAdapterIfExists implements OnSuccessListener, OnFailureListener {
    public final /* synthetic */ MaybeEmitter RemoteActionCompatParcelizer;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        MaybeEmitter maybeEmitter = this.RemoteActionCompatParcelizer;
        maybeEmitter.read(exc);
        maybeEmitter.RemoteActionCompatParcelizer();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        MaybeEmitter maybeEmitter = this.RemoteActionCompatParcelizer;
        maybeEmitter.IconCompatParcelizer(obj);
        maybeEmitter.RemoteActionCompatParcelizer();
    }
}
