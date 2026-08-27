package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class JsonDataException extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 1;
    public static final JsonDataException RemoteActionCompatParcelizer = new JsonDataException(3, SharedPreferences.Editor.class, "putLong", "putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;", 0);
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = IconCompatParcelizer + 97;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = write + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
        long jLongValue = ((Number) obj3).longValue();
        editor.getClass();
        SharedPreferences.Editor editorPutLong = editor.putLong((String) obj2, jLongValue);
        int i4 = serializer + 25;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return editorPutLong;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }

    public JsonDataException(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
