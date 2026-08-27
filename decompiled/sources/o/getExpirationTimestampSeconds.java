package o;

import android.util.Base64;
import com.sentiance.sdk.InjectUsing;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "Encryptor")
public class getExpirationTimestampSeconds {
    private final forJsonPutlambda1 read;
    private final parseLonglambda0 write;

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final String IconCompatParcelizer(String str) {
        try {
            SecretKey secretKey = this.read.read();
            byte[] bArrDecode = Base64.decode(str, 2);
            bArrDecode.getClass();
            byte[] bArrIconCompatParcelizer = onContentCardClicked.IconCompatParcelizer(bArrDecode, 0, 12);
            byte[] bArrIconCompatParcelizer2 = onContentCardClicked.IconCompatParcelizer(bArrDecode, 12, bArrDecode.length);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(androidx.compose.ui.graphics.Fields.SpotShadowColor, bArrIconCompatParcelizer));
            byte[] bArrDoFinal = cipher.doFinal(bArrIconCompatParcelizer2);
            bArrDoFinal.getClass();
            return new String(bArrDoFinal, ensureSubscribedToInAppMessageEvents.write);
        } catch (Exception e) {
            this.write.IconCompatParcelizer(false, e, "Failed to decrypt the value", new Object[0]);
            return null;
        }
    }

    public final String serializer(String str) {
        try {
            SecretKey secretKey = this.read.read();
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            byte[] iv = cipher.getIV();
            byte[] bytes = str.getBytes(ensureSubscribedToInAppMessageEvents.write);
            bytes.getClass();
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            byte[] bArr = new byte[iv.length + bArrDoFinal.length];
            System.arraycopy(iv, 0, bArr, 0, iv.length);
            System.arraycopy(bArrDoFinal, 0, bArr, iv.length, bArrDoFinal.length);
            return Base64.encodeToString(bArr, 2);
        } catch (Exception e) {
            this.write.IconCompatParcelizer(false, e, "Failed to encrypt the value", new Object[0]);
            return null;
        }
    }

    static {
        new RemoteActionCompatParcelizer(null);
    }

    public getExpirationTimestampSeconds(forJsonPutlambda1 forjsonputlambda1, parseLonglambda0 parselonglambda0) {
        forjsonputlambda1.getClass();
        parselonglambda0.getClass();
        this.read = forjsonputlambda1;
        this.write = parselonglambda0;
    }
}
