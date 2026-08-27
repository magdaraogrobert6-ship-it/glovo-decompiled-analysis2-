package o;

import android.content.SharedPreferences;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class startOrResume extends FunctionReferenceImpl implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    public static final startOrResume read = new startOrResume(3, SharedPreferences.Editor.class, "putBoolean", "putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;", 0);
    private static int serializer;
    private static int write;

    static {
        int i = serializer + 35;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        editor.getClass();
        SharedPreferences.Editor editorPutBoolean = editor.putBoolean((String) obj2, zBooleanValue);
        int i4 = IconCompatParcelizer + 97;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return editorPutBoolean;
    }

    public startOrResume(int i, Class cls, String str, String str2, int i2) {
        super(i, cls, str, str2, i2);
    }
}
