package o;

import com.roadrunner.rrds.compose.component.indicators.progress.SectionedCircleProgressorKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadExecutor implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ long write;

    public /* synthetic */ ThreadExecutor(String str, long j, long j2, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = j;
        this.write = j2;
        this.read = modifier;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 87;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaMetadataCompat;
        if (i4 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            SectionedCircleProgressorKt.m5049SmallCircleWithIconeopBjH0(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        SectionedCircleProgressorKt.read(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        int i6 = MediaSessionCompatQueueItem + 11;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
