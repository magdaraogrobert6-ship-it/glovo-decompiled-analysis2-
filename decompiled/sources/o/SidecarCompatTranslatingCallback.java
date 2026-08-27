package o;

import android.location.Location;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SidecarCompatTranslatingCallback implements getOutlineProvider {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ RoomDatabase$$ExternalSyntheticLambda2 IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ SidecarCompatTranslatingCallback(RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = roomDatabase$$ExternalSyntheticLambda2;
    }

    @Override // o.getOutlineProvider, com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = read + 81;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2 = this.IconCompatParcelizer;
        Location location = (Location) obj;
        if (i4 == 0) {
            roomDatabase$$ExternalSyntheticLambda2.invoke(location);
            return;
        }
        roomDatabase$$ExternalSyntheticLambda2.invoke(location);
        int i5 = read + 99;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
