package o;

import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class addVisibleLineBounds implements getPersonMiddleInitial {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ minIntrinsicWidth[] serializer;

    public /* synthetic */ addVisibleLineBounds(minIntrinsicWidth[] minintrinsicwidthArr, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.read = i;
        this.serializer = minintrinsicwidthArr;
        this.RemoteActionCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.getPersonMiddleInitial
    public final void dispose() {
        int i = 2 % 2;
        int i2 = this.read;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.RemoteActionCompatParcelizer;
        minIntrinsicWidth[] minintrinsicwidthArr = this.serializer;
        if (i2 != 0) {
            minIntrinsicWidth minintrinsicwidth = minintrinsicwidthArr[0];
            if (((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue() && minintrinsicwidth != null) {
                try {
                    minintrinsicwidth.read();
                    return;
                } catch (SecurityException e) {
                    Timber.RemoteActionCompatParcelizer.serializer(e, "InAppCameraWithTags: SecurityException during camera cleanup on dispose", new Object[0]);
                    return;
                }
            }
            return;
        }
        minIntrinsicWidth minintrinsicwidth2 = minintrinsicwidthArr[0];
        if (((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue() && minintrinsicwidth2 != null) {
            int i3 = IconCompatParcelizer + 99;
            write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            try {
                minintrinsicwidth2.read();
            } catch (SecurityException e2) {
                Timber.RemoteActionCompatParcelizer.serializer(e2, "InAppCameraWithTags: SecurityException during camera cleanup on dispose", new Object[0]);
            }
        }
        int i5 = IconCompatParcelizer + 29;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
