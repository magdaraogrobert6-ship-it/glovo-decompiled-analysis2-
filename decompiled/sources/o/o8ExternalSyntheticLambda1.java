package o;

import com.roadrunner.map.navigateview.NavigationInformationKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o8ExternalSyntheticLambda1 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Integer serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ o8ExternalSyntheticLambda1(String str, androidx.compose.ui.Modifier modifier, Integer num, int i) {
        this.write = str;
        this.RemoteActionCompatParcelizer = modifier;
        this.serializer = num;
        this.read = i;
    }

    public /* synthetic */ o8ExternalSyntheticLambda1(String str, Integer num, androidx.compose.ui.Modifier modifier, int i) {
        this.write = str;
        this.serializer = num;
        this.RemoteActionCompatParcelizer = modifier;
        this.read = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 21;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.read;
        androidx.compose.ui.Modifier modifier = this.RemoteActionCompatParcelizer;
        Integer num = this.serializer;
        String str = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            NavigationInformationKt.DestinationTitle(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, num, str);
            return createfromparcel;
        }
        ComposeViewAdapterFakeViewModelStoreOwner1.serializer(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, num, str);
        int i6 = RatingCompat + 97;
        MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
