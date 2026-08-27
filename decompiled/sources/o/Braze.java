package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Braze extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    public static final Braze write = new Braze(3, SharedPreferences.Editor.class, "putString", "putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", 0);

    static {
        int i = serializer + 109;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SharedPreferences.Editor editorPutString;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
            editor.getClass();
            editorPutString = editor.putString((String) obj2, (String) obj3);
            int i3 = 67 / 0;
        } else {
            SharedPreferences.Editor editor2 = (SharedPreferences.Editor) obj;
            editor2.getClass();
            editorPutString = editor2.putString((String) obj2, (String) obj3);
        }
        int i4 = read + 19;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return editorPutString;
    }

    public Braze(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
