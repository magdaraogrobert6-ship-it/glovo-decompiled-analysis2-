package o;

import com.roadrunner.rrds.compose.component.indicators.skeleton.SkeletonViewKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class NativeLibHelper implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ float read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier write;

    public /* synthetic */ NativeLibHelper(androidx.compose.ui.Modifier modifier, float f, float f2, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.write = modifier;
        this.read = f;
        this.RemoteActionCompatParcelizer = f2;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 13;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.serializer;
        float f = this.RemoteActionCompatParcelizer;
        float f2 = this.read;
        androidx.compose.ui.Modifier modifier = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            SkeletonViewKt.serializer(modifier, f2, f, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        SkeletonViewKt.RemoteActionCompatParcelizer(modifier, f2, f, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaMetadataCompat + 59;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
