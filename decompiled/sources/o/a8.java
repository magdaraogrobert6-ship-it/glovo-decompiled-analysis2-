package o;

import com.roadrunner.login.presentation.error.ErrorDialogScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a8 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ a6 IconCompatParcelizer;
    public final /* synthetic */ int read = 0;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ a8(androidx.compose.ui.Modifier modifier, a6 a6Var, int i) {
        this.serializer = modifier;
        this.IconCompatParcelizer = a6Var;
        this.write = i;
    }

    public /* synthetic */ a8(a6 a6Var, androidx.compose.ui.Modifier modifier, int i) {
        this.IconCompatParcelizer = a6Var;
        this.serializer = modifier;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ((Integer) obj2).getClass();
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.write;
        androidx.compose.ui.Modifier modifier = this.serializer;
        a6 a6Var = this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i3 == 0) {
            ErrorDialogScreenKt.IconCompatParcelizer(ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), getbirthdatefull, modifier, a6Var);
            return createfromparcel2;
        }
        ErrorDialogScreenKt.DialogContent(ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1), getbirthdatefull, modifier, a6Var);
        int i5 = RemoteActionCompatParcelizer + 71;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
