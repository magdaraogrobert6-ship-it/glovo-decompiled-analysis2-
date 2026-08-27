package o;

import com.roadrunner.rrds.compose.component.indicators.progress.SectionedCircleProgressorKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uncaughtException implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int PlaybackStateCompat = 1;
    private static int PlaybackStateCompatCustomAction;
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ androidx.compose.ui.Modifier MediaBrowserCompatMediaItem;
    public final /* synthetic */ long MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ String MediaSessionCompatQueueItem;
    public final /* synthetic */ long RatingCompat;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ float write;

    public /* synthetic */ uncaughtException(float f, int i, long j, long j2, String str, long j3, long j4, androidx.compose.ui.Modifier modifier, int i2) {
        this.write = f;
        this.read = i;
        this.RemoteActionCompatParcelizer = j;
        this.serializer = j2;
        this.MediaSessionCompatQueueItem = str;
        this.RatingCompat = j3;
        this.MediaDescriptionCompat = j4;
        this.MediaBrowserCompatMediaItem = modifier;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ uncaughtException(float f, String str, long j, long j2, long j3, long j4, int i, androidx.compose.ui.Modifier modifier, int i2) {
        this.write = f;
        this.MediaSessionCompatQueueItem = str;
        this.RemoteActionCompatParcelizer = j;
        this.serializer = j2;
        this.RatingCompat = j3;
        this.MediaDescriptionCompat = j4;
        this.read = i;
        this.MediaBrowserCompatMediaItem = modifier;
        this.MediaMetadataCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 47;
        PlaybackStateCompatCustomAction = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaMetadataCompat;
        if (i4 != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
            SectionedCircleProgressorKt.m5047BigProgressorCirclexBv1rpU(this.write, this.read, iRemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer, this.serializer, this.RatingCompat, this.MediaDescriptionCompat, (getBirthDateFull) obj, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        SectionedCircleProgressorKt.IconCompatParcelizer(this.write, this.read, iRemoteActionCompatParcelizer2, this.RemoteActionCompatParcelizer, this.serializer, this.RatingCompat, this.MediaDescriptionCompat, (getBirthDateFull) obj, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatQueueItem);
        int i6 = PlaybackStateCompatCustomAction + 71;
        PlaybackStateCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
