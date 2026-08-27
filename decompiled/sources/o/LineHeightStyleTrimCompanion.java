package o;

import com.roadrunner.delivery.ontheway.turnbyturn.ui.speedlimit.compose.SpeedLimitKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class LineHeightStyleTrimCompanion implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ isTrimLastLineBottomimplui_text serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ LineHeightStyleTrimCompanion(isTrimLastLineBottomimplui_text istrimlastlinebottomimplui_text, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.write = i2;
        this.serializer = istrimlastlinebottomimplui_text;
        this.RemoteActionCompatParcelizer = modifier;
        this.read = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.read;
        androidx.compose.ui.Modifier modifier = this.RemoteActionCompatParcelizer;
        isTrimLastLineBottomimplui_text istrimlastlinebottomimplui_text = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i2 != 0) {
            SpeedLimitKt.SpeedLimitContainer(istrimlastlinebottomimplui_text, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i4 = IconCompatParcelizer + 21;
            MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            return createfromparcel;
        }
        SpeedLimitKt.SpeedLimitWithRiderSpeed(istrimlastlinebottomimplui_text, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
        int i6 = MediaDescriptionCompat + 3;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
