package o;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class getSavedStateRegistryOwner implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ Context IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getSavedStateRegistryOwner(Context context, int i) {
        this.write = i;
        this.IconCompatParcelizer = context;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() throws IOException {
        int i = this.write;
        Context context = this.IconCompatParcelizer;
        if (i != 0) {
            File file = TuplesKt.read(context, "firebaseSessions/sessionDataStore.data");
            AndroidComposeViewRootModifierNoderulerLambda1.read(file);
            return file;
        }
        File file2 = TuplesKt.read(context, "firebaseSessions/sessionConfigsDataStore.data");
        AndroidComposeViewRootModifierNoderulerLambda1.read(file2);
        return file2;
    }
}
