package o;

import com.roadrunner.rrds.compose.component.indicators.skeleton.SkeletonViewKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TimerOnce implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ float serializer;
    public final /* synthetic */ float write;

    public /* synthetic */ TimerOnce(androidx.compose.ui.Modifier modifier, float f, float f2, int i, int i2, int i3) {
        this.read = i3;
        this.RemoteActionCompatParcelizer = modifier;
        this.write = f;
        this.serializer = f2;
        this.IconCompatParcelizer = i;
        this.MediaDescriptionCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 109;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.IconCompatParcelizer;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            SkeletonViewKt.m5054SkeletonRowBigdjqsMU(this.RemoteActionCompatParcelizer, this.write, this.serializer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, this.MediaDescriptionCompat);
            return createfromparcel;
        }
        if (i4 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            SkeletonViewKt.m5055SkeletonSquareBigdjqsMU(this.RemoteActionCompatParcelizer, this.write, this.serializer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2, this.MediaDescriptionCompat);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        SkeletonViewKt.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, this.serializer, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3, this.MediaDescriptionCompat);
        int i6 = RatingCompat + 7;
        MediaMetadataCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
