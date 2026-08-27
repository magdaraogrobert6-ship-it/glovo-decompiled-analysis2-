package o;

import android.app.ApplicationExitInfo;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class registerGeofencesWithGooglePlayIfNecessarylambda9 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return Long.valueOf(((ApplicationExitInfo) obj).getTimestamp());
    }
}
