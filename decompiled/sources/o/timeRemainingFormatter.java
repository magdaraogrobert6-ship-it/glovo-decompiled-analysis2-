package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class timeRemainingFormatter extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    public static final timeRemainingFormatter read = new timeRemainingFormatter(3, SharedPreferences.Editor.class, "putInt", "putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;", 0);
    private static int serializer = 1;
    private static int write = 1;

    static {
        int i = write + 111;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj4 = null;
        if (i2 % 2 == 0) {
            SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
            int iIntValue = ((Number) obj3).intValue();
            editor.getClass();
            editor.putInt((String) obj2, iIntValue);
            obj4.hashCode();
            throw null;
        }
        SharedPreferences.Editor editor2 = (SharedPreferences.Editor) obj;
        int iIntValue2 = ((Number) obj3).intValue();
        editor2.getClass();
        SharedPreferences.Editor editorPutInt = editor2.putInt((String) obj2, iIntValue2);
        int i3 = serializer + 117;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return editorPutInt;
        }
        obj4.hashCode();
        throw null;
    }

    public timeRemainingFormatter(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
