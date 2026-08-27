package o;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class removeMenuProvider implements getGreen0d7_KjU {
    public final /* synthetic */ int read;
    public final Object serializer;

    public removeMenuProvider(getLightGray0d7_KjU getlightgray0d7_kju) {
        this.read = 1;
        this.serializer = new LinkedHashSet();
        getlightgray0d7_kju.RemoteActionCompatParcelizer("androidx.savedstate.Restarter", this);
    }

    @Override // o.getGreen0d7_KjU
    public final Bundle saveState() {
        int i = this.read;
        Object obj = this.serializer;
        if (i == 0) {
            Bundle bundle = new Bundle();
            ((androidx.appcompat.app.AppCompatActivity) obj).getDelegate().getClass();
            return bundle;
        }
        Object[] objArr = {(onViewAttachedToWindowlambda0[]) Arrays.copyOf(new onViewAttachedToWindowlambda0[0], 0)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        Bundle bundle2 = (Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), objArr, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320);
        bundle2.putStringArrayList("classes_to_restore", getEvaluationsfwf_client_releasedefault.IconCompatParcelizer(onContentCardDismissed.PlaybackStateCompat((LinkedHashSet) obj)));
        return bundle2;
    }

    public removeMenuProvider(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.read = 0;
        this.serializer = appCompatActivity;
    }
}
