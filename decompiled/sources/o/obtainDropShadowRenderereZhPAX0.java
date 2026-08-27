package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class obtainDropShadowRenderereZhPAX0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer = 0;
    private static byte write = -112;
    public final LayerSnapshotV21 read;

    public obtainDropShadowRenderereZhPAX0(LayerSnapshotV21 layerSnapshotV21) {
        this.read = layerSnapshotV21;
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ write);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    public final String write(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 113;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(this.read.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, new int[]{i});
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        String string = context.getString(resourceId);
        if (!(!string.startsWith("%('"))) {
            int i5 = serializer + 33;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            a(string.substring(3), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        string.getClass();
        return string;
    }
}
