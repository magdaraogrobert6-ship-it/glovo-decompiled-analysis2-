package o;

import com.roadrunner.rrds.compose.component.stepper.TaskStatusIndicatorKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fieldToString implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ int MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int serializer = 1;
    public final /* synthetic */ boolean write;

    public /* synthetic */ fieldToString(fieldToDouble fieldtodouble, androidx.compose.ui.Modifier modifier, Integer num, boolean z, int i, int i2) {
        this.RemoteActionCompatParcelizer = fieldtodouble;
        this.read = modifier;
        this.IconCompatParcelizer = num;
        this.write = z;
        this.MediaSessionCompatQueueItem = i;
        this.MediaMetadataCompat = i2;
    }

    public /* synthetic */ fieldToString(String str, boolean z, String str2, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = str;
        this.write = z;
        this.IconCompatParcelizer = str2;
        this.read = modifier;
        this.MediaSessionCompatQueueItem = i;
        this.MediaMetadataCompat = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 37;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.MediaSessionCompatQueueItem;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            ((Integer) obj2).getClass();
            TaskStatusIndicatorKt.TaskStatusIndicator((fieldToDouble) obj4, this.read, (Integer) obj3, this.write, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), this.MediaMetadataCompat);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1);
        boolean z = this.write;
        ComposeViewAdapterExternalSyntheticLambda6.IconCompatParcelizer((String) obj4, z, (String) obj3, this.read, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, this.MediaMetadataCompat);
        int i6 = RatingCompat + 37;
        MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
