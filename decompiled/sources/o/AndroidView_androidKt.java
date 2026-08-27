package o;

import kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidView_androidKt extends AdaptedFunctionReference implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public static final AndroidView_androidKt read = new AndroidView_androidKt(backwardFocusSearch.class, "clear", "clear()V");
    private static int serializer = 1;
    private static int write;

    static {
        int i = IconCompatParcelizer + 45;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((backwardFocusSearch) obj).write();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i4 = RemoteActionCompatParcelizer + 1;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return createfromparcel;
    }

    public AndroidView_androidKt(Class cls, String str, String str2) {
        super(cls, str, str2);
    }
}
