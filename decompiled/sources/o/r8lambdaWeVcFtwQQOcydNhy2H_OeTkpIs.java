package o;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaWeVcFtwQQOcydNhy2H_OeTkpIs extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public static final r8lambdaWeVcFtwQQOcydNhy2H_OeTkpIs IconCompatParcelizer = new r8lambdaWeVcFtwQQOcydNhy2H_OeTkpIs(3, SharedPreferences.Editor.class, "putStringSet", "putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;", 0);
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 89;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = read + 99;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
        editor.getClass();
        SharedPreferences.Editor editorPutStringSet = editor.putStringSet((String) obj2, (Set) obj3);
        int i4 = read + 43;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return editorPutStringSet;
    }

    public r8lambdaWeVcFtwQQOcydNhy2H_OeTkpIs(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
