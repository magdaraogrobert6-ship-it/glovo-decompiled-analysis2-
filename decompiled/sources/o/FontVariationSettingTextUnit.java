package o;

import bo.app.c8$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class FontVariationSettingTextUnit {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final shouldSkipDump write;

    public FontVariationSettingTextUnit(setTransactionSuccessful settransactionsuccessful, shouldSkipDump shouldskipdump) {
        this.write = shouldskipdump;
    }

    public final String write(Throwable th) {
        int i = 2 % 2;
        th.getClass();
        if (!pauseWebviewIfNecessarylambda10.IconCompatParcelizer(th)) {
            int i2 = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            String localizedMessage = th.getLocalizedMessage();
            if (localizedMessage != null && localizedMessage.length() != 0) {
                String localizedMessage2 = th.getLocalizedMessage();
                if (localizedMessage2 == null) {
                    localizedMessage2 = c8$$ExternalSyntheticOutline0.m(th.getClass(), "Exception: ");
                    int i4 = IconCompatParcelizer + 31;
                    RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                }
                int i6 = IconCompatParcelizer + 123;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 39 / 0;
                }
                return localizedMessage2;
            }
        }
        return this.write.serializer.IconCompatParcelizer(com.logistics.rider.glovo.R.string.no_internet_connection_message);
    }
}
