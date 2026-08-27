package o;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaXjDubkIBzFc9zx4at4JX4kzn1Q implements OnFailureListener {
    public final /* synthetic */ r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ r8lambdaXjDubkIBzFc9zx4at4JX4kzn1Q(r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE r8lambdatiezsvb60pafqh0pucdjruvm2qe, int i) {
        this.serializer = i;
        this.read = r8lambdatiezsvb60pafqh0pucdjruvm2qe;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        int i = this.serializer;
        r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE r8lambdatiezsvb60pafqh0pucdjruvm2qe = this.read;
        if (i != 0) {
            r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE.RemoteActionCompatParcelizer(r8lambdatiezsvb60pafqh0pucdjruvm2qe, exc);
        } else {
            r8lambdaTIeZSVb60PaFqh0pucDJrUvm2QE.write(r8lambdatiezsvb60pafqh0pucdjruvm2qe, exc);
        }
    }
}
