package o;

import com.google.android.gms.internal.gtm.zzbv;
import io.grpc.LoadBalancer$Helper;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class getEqualsEK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public static final Pattern write = Pattern.compile("(.+)/(.+)/(.+)");

    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        int length = getfunctionek5ggoqArr.length;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(length >= 3);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[1] instanceof getInfoEK5gGoQ);
        String strIconCompatParcelizer = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[0]);
        String strIconCompatParcelizer2 = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[1]);
        String strIconCompatParcelizer3 = LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[2]);
        String strIconCompatParcelizer4 = length < 4 ? "AES/CBC/NoPadding" : LoadBalancer$Helper.IconCompatParcelizer(getfunctionek5ggoqArr[3]);
        Matcher matcher = write.matcher(strIconCompatParcelizer4);
        if (!matcher.matches()) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Encrypt: invalid transformation:".concat(String.valueOf(strIconCompatParcelizer4)));
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(strIconCompatParcelizer2.getBytes(), matcher.group(1));
        IvParameterSpec ivParameterSpec = new IvParameterSpec(strIconCompatParcelizer3.getBytes());
        try {
            Cipher cipher = Cipher.getInstance(strIconCompatParcelizer4);
            if (strIconCompatParcelizer == null || strIconCompatParcelizer.length() == 0) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Encrypt: empty input string");
                return null;
            }
            try {
                cipher.init(1, secretKeySpec, ivParameterSpec);
                return new getInfoEK5gGoQ(getButton13EK5gGoQ.read(cipher.doFinal(strIconCompatParcelizer.getBytes())));
            } catch (Exception e) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Encrypt: ".concat(String.valueOf(e.getMessage())));
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Encrypt: invalid transformation:".concat(String.valueOf(strIconCompatParcelizer4)));
            return null;
        }
    }
}
