package o;

import android.content.Context;
import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setCompositionContext {
    public static String serializer(Context context, String str, long j, int i) {
        Resources resources = context.getApplicationContext().getResources();
        InputStream inputStreamOpenRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", resources.getResourcePackageName(com.logistics.rider.glovo.R.raw.keep_third_party_licenses)));
        byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStreamOpenRawResource.skip(j);
            if (i <= 0) {
                i = Integer.MAX_VALUE;
            }
            while (i > 0) {
                int i2 = inputStreamOpenRawResource.read(bArr, 0, Math.min(i, androidx.compose.ui.graphics.Fields.RotationZ));
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                i -= i2;
            }
            inputStreamOpenRawResource.close();
            try {
                return byteArrayOutputStream.toString(com.adjust.sdk.Constants.ENCODING);
            } catch (UnsupportedEncodingException e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unsupported encoding UTF8. This should always be supported.", e);
                return null;
            }
        } catch (IOException e2) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Failed to read license or metadata text.", e2);
            return null;
        }
    }
}
