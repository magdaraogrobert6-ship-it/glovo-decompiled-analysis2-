package o;

import com.roadrunner.rrds.compose.component.indicators.progress.SectionedCircleProgressorKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ThreadFactoryWrapper implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ float write;

    public /* synthetic */ ThreadFactoryWrapper(float f, int i, long j, long j2, androidx.compose.ui.Modifier modifier, int i2, int i3) {
        this.RemoteActionCompatParcelizer = i3;
        this.write = f;
        this.serializer = i;
        this.read = j;
        this.IconCompatParcelizer = j2;
        this.MediaDescriptionCompat = modifier;
        this.MediaMetadataCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 1;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaMetadataCompat;
        if (i4 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            SectionedCircleProgressorKt.read(this.write, this.serializer, this.read, this.IconCompatParcelizer, this.MediaDescriptionCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        SectionedCircleProgressorKt.IconCompatParcelizer(this.write, this.serializer, this.read, this.IconCompatParcelizer, this.MediaDescriptionCompat, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2);
        int i6 = MediaBrowserCompatMediaItem + 17;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
