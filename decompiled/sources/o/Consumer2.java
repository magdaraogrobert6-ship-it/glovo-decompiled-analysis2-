package o;

import com.google.android.gms.tasks.OnFailureListener;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Consumer2 implements getContainer, OnFailureListener {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ MapApiError$$ExternalSyntheticLambda1 serializer;

    public /* synthetic */ Consumer2(MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = mapApiError$$ExternalSyntheticLambda1;
    }

    @Override // o.getContainer
    public final void onFailure(Exception exc) throws Exception {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1 = this.serializer;
        if (i3 == 0) {
            exc.getClass();
            mapApiError$$ExternalSyntheticLambda1.invoke(exc);
        } else {
            if (i3 != 1) {
                exc.getClass();
                mapApiError$$ExternalSyntheticLambda1.invoke(exc);
                return;
            }
            exc.getClass();
            mapApiError$$ExternalSyntheticLambda1.invoke(exc);
            int i4 = RemoteActionCompatParcelizer + 19;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }
}
