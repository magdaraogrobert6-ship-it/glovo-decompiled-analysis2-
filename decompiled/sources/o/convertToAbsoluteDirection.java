package o;

import com.roadrunner.home.nest.profile.RiderProfileContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class convertToAbsoluteDirection implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ MultiSelectListPreferenceDialogFragment write;

    public /* synthetic */ convertToAbsoluteDirection(MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.write = multiSelectListPreferenceDialogFragment;
        this.RemoteActionCompatParcelizer = modifier;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 125;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.IconCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.RemoteActionCompatParcelizer;
        MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            RiderProfileContentKt.RiderProfileContent(multiSelectListPreferenceDialogFragment, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        RiderProfileContentKt.Avatar(multiSelectListPreferenceDialogFragment, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = read + 67;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 88 / 0;
        }
        return createfromparcel;
    }
}
