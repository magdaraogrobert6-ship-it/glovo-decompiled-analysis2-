package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class getInspectorValues {
    public final didUpdate write;
    public static final didInsert RemoteActionCompatParcelizer = new didInsert();
    public static final String read = serializer("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String IconCompatParcelizer = serializer("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final Gson$$ExternalSyntheticBUOutline0 serializer = new Gson$$ExternalSyntheticBUOutline0(5);

    public getInspectorValues(didUpdate didupdate) {
        this.write = didupdate;
    }

    public static String serializer(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
