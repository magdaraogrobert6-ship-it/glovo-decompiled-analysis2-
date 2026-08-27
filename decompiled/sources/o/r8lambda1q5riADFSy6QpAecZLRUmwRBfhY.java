package o;

import android.app.Application;
import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.roadrunner.secure.preferences.SecureSharedPreferencesException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambda1q5riADFSy6QpAecZLRUmwRBfhY {
    private static int serializer = 1;
    private static int write;
    public final Context IconCompatParcelizer;

    public r8lambda1q5riADFSy6QpAecZLRUmwRBfhY(Application application) {
        Context baseContext = application.getBaseContext();
        baseContext.getClass();
        this.IconCompatParcelizer = baseContext;
    }

    public static ColorFilter IconCompatParcelizer(r8lambda1q5riADFSy6QpAecZLRUmwRBfhY r8lambda1q5riadfsy6qpaeczlrumwrbfhy) {
        int i = 2 % 2;
        Object obj = null;
        try {
            Context context = r8lambda1q5riadfsy6qpaeczlrumwrbfhy.IconCompatParcelizer;
            androidx.emoji2.text.EmojiProcessor emojiProcessor = new androidx.emoji2.text.EmojiProcessor(context, 7);
            tintxETnrdsdefault tintxetnrdsdefault = tintxETnrdsdefault.AES256_GCM;
            if (tintxetnrdsdefault.ordinal() == 0) {
                if (((KeyGenParameterSpec) emojiProcessor.read) != null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("KeyScheme set after setting a KeyGenParamSpec");
                    int i2 = serializer + 91;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                } else {
                    int i4 = serializer + 7;
                    write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        emojiProcessor.IconCompatParcelizer = tintxetnrdsdefault;
                    } else {
                        emojiProcessor.IconCompatParcelizer = tintxetnrdsdefault;
                        obj.hashCode();
                        throw null;
                    }
                }
            } else {
                Gson$$ExternalSyntheticBUOutline0.m(tintxetnrdsdefault, "Unsupported scheme: ");
            }
            return ColorFilter.write(context, "secure_default", emojiProcessor.read(), getYellow0d7_KjU.AES256_SIV, colorMatrixjHGOpc.AES256_GCM);
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.write(new SecureSharedPreferencesException(e));
            return null;
        }
    }
}
