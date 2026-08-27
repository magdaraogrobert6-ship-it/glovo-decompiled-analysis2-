package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getDpannotations implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ setAlpha IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getDpannotations(setAlpha setalpha, int i) {
        this.read = i;
        this.IconCompatParcelizer = setalpha;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        setAlpha setalpha = this.IconCompatParcelizer;
        if (i2 == 0) {
            String str = (String) obj;
            Float f = (Float) obj2;
            f.floatValue();
            str.getClass();
            setalpha.put(str, f);
            return createfromparcel;
        }
        if (i2 == 1) {
            Integer num = (Integer) obj;
            num.intValue();
            Boolean bool = (Boolean) obj2;
            bool.booleanValue();
            setalpha.put(num, bool);
            return createfromparcel;
        }
        if (i2 != 2) {
            Integer num2 = (Integer) obj;
            num2.intValue();
            Boolean bool2 = (Boolean) obj2;
            bool2.booleanValue();
            setalpha.put(num2, bool2);
            int i3 = write + 69;
            RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return createfromparcel;
        }
        String str2 = (String) obj;
        androidx.compose.ui.geometry.Rect rect = (androidx.compose.ui.geometry.Rect) obj2;
        str2.getClass();
        rect.getClass();
        setalpha.put(str2, rect);
        int i5 = write + 37;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
