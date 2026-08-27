package o;

import android.content.res.Resources;
import android.util.Base64;
import curtains.internal.RootViewsSpy$Companion$install$1$1;
import fwfd.com.fwfsdk.util.FWFHelper;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonUtils extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final JsonUtils IconCompatParcelizer;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    private static byte read;
    public static final JsonUtils serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsonUtils(int i, int i2) {
        super(i);
        this.write = i2;
    }

    static {
        read();
        int i = 0;
        serializer = new JsonUtils(i, i);
        IconCompatParcelizer = new JsonUtils(i, 1);
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ read);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        Field field;
        String string;
        int i = 2 % 2;
        int i2 = 0;
        if (this.write != 0) {
            try {
                string = Resources.getSystem().getString(Resources.getSystem().getIdentifier("tooltip_popup_title", "string", FWFHelper.fwfDeviceOS));
                if (string.startsWith("%('")) {
                    Object[] objArr = new Object[1];
                    a(string.substring(3), objArr);
                    string = ((String) objArr[0]).intern();
                }
            } catch (Resources.NotFoundException unused) {
                string = "Tooltip";
            }
            int i3 = MediaBrowserCompatMediaItem + 87;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return string;
        }
        r8lambda82HoCC3VgqgcCAapS2rEcPeH8yE r8lambda82hocc3vgqgccaaps2recpeh8ye = new r8lambda82HoCC3VgqgcCAapS2rEcPeH8yE();
        RootViewsSpy$Companion$install$1$1 rootViewsSpy$Companion$install$1$1 = new RootViewsSpy$Companion$install$1$1(i2, r8lambda82hocc3vgqgccaaps2recpeh8ye);
        try {
            Object objMediaSessionCompatResultReceiverWrapper = r8lambdaiX7krjhLPWSXoXvd8cgdmEPVXyc.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
            if (objMediaSessionCompatResultReceiverWrapper != null && (field = (Field) r8lambdaiX7krjhLPWSXoXvd8cgdmEPVXyc.write.MediaSessionCompatResultReceiverWrapper()) != null) {
                Object obj = field.get(objMediaSessionCompatResultReceiverWrapper);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
                }
                int i5 = MediaBrowserCompatMediaItem + 69;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                field.set(objMediaSessionCompatResultReceiverWrapper, rootViewsSpy$Companion$install$1$1.invoke((ArrayList) obj));
            }
        } catch (Throwable th) {
            SentryLogcatAdapter.IconCompatParcelizer("WindowManagerSpy", th);
        }
        return r8lambda82hocc3vgqgccaaps2recpeh8ye;
    }

    static void read() {
        read = (byte) -112;
    }
}
