package o;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getDiscounts implements OnFailureListener {
    public final /* synthetic */ getTotalDiscounts RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getDiscounts(getTotalDiscounts gettotaldiscounts, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = gettotaldiscounts;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i = this.write;
        getTotalDiscounts gettotaldiscounts = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            getTotalDiscounts.write(gettotaldiscounts, exc);
        } else {
            getTotalDiscounts.read(gettotaldiscounts, exc);
        }
    }
}
