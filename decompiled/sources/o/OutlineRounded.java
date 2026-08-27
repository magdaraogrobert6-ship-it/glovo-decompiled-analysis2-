package o;

import android.net.NetworkRequest;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class OutlineRounded {
    public static drawOutlinehn5TExg RemoteActionCompatParcelizer(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                setRotationX setrotationx = setRotationX.read();
                String str = drawOutlinehn5TExg.IconCompatParcelizer;
                String str2 = drawOutlinehn5TExg.IconCompatParcelizer;
                String strM = m1$$ExternalSyntheticOutline0.m("Ignoring adding capability '", i, '\'');
                if (setrotationx.read <= 5) {
                    SentryLogcatAdapter.write(str2, strM, e);
                }
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = addOutline.RemoteActionCompatParcelizer[i2];
            if (!onContentCardClicked.write(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    setRotationX setrotationx2 = setRotationX.read();
                    String str3 = drawOutlinehn5TExg.IconCompatParcelizer;
                    String str4 = drawOutlinehn5TExg.IconCompatParcelizer;
                    String strM2 = m1$$ExternalSyntheticOutline0.m("Ignoring removing default capability '", i3, '\'');
                    if (setrotationx2.read <= 5) {
                        SentryLogcatAdapter.write(str4, strM2, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new drawOutlinehn5TExg(networkRequestBuild);
    }
}
