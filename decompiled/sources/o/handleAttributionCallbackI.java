package o;

import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class handleAttributionCallbackI {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final getInAppMessageEventMap serializer = new getInAppMessageEventMap("[^\\p{Print}]");
    private static int write;

    static {
        int i = IconCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final CharSequence serializer(String str) {
        String str2;
        int i = 2 % 2;
        int i2 = write + 123;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        String strRemoteActionCompatParcelizer = serializer.RemoteActionCompatParcelizer(str, "");
        if (strRemoteActionCompatParcelizer.length() >= 100) {
            CharSequence charSequenceSubSequence = strRemoteActionCompatParcelizer.subSequence(0, 100);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Push message stripped: " + ((Object) charSequenceSubSequence), new Object[0]);
            str2 = charSequenceSubSequence;
        } else {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Push message: ".concat(strRemoteActionCompatParcelizer), new Object[0]);
            int i4 = read + 61;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            str2 = strRemoteActionCompatParcelizer;
        }
        CharSequence charSequence = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2);
        int i6 = write + 19;
        read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return charSequence;
    }
}
