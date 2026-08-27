package o;

import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextIndent {
    private static int serializer = 0;
    private static int write = 1;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final transferSessionPackageI read;

    public getTextIndent(transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.read = transfersessionpackagei;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(13, this));
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = serializer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).booleanValue();
        int i4 = write + 87;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }
}
