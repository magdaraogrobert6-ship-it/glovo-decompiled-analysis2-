package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class logRiderSafetyPermissionGranted extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final logRiderSafetyPermissionGranted serializer = new logRiderSafetyPermissionGranted(3, SharedPreferences.Editor.class, "putFloat", "putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;", 0);
    private static int write;

    static {
        int i = read + 111;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
            float fFloatValue = ((Number) obj3).floatValue();
            editor.getClass();
            editor.putFloat((String) obj2, fFloatValue);
            Object obj4 = null;
            obj4.hashCode();
            throw null;
        }
        SharedPreferences.Editor editor2 = (SharedPreferences.Editor) obj;
        float fFloatValue2 = ((Number) obj3).floatValue();
        editor2.getClass();
        SharedPreferences.Editor editorPutFloat = editor2.putFloat((String) obj2, fFloatValue2);
        int i3 = write + 67;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return editorPutFloat;
    }

    public logRiderSafetyPermissionGranted(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
