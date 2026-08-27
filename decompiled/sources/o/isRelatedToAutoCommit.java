package o;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class isRelatedToAutoCommit implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ Object ComponentActivity;
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaBrowserCompatMediaItem;
    public final /* synthetic */ boolean MediaDescriptionCompat;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ int MediaSessionCompatQueueItem;
    public final /* synthetic */ int MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ androidx.compose.ui.text.TextStyle MediaSessionCompatToken;
    public final /* synthetic */ int ParcelableVolumeInfo;
    public final /* synthetic */ int PlaybackStateCompat;
    public final /* synthetic */ long PlaybackStateCompatCustomAction;
    public final /* synthetic */ int RatingCompat;
    public final /* synthetic */ androidx.compose.ui.text.style.TextAlign RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.text.font.FontWeight r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final /* synthetic */ long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final /* synthetic */ long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final /* synthetic */ CharSequence read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ long write;

    public /* synthetic */ isRelatedToAutoCommit(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, long j3, androidx.compose.ui.text.style.TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.text.TextStyle textStyle, int i4, int i5, int i6) {
        this.read = annotatedString;
        this.serializer = modifier;
        this.PlaybackStateCompatCustomAction = j;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = j2;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = fontWeight;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = j3;
        this.RemoteActionCompatParcelizer = textAlign;
        this.write = j4;
        this.MediaMetadataCompat = i;
        this.MediaDescriptionCompat = z;
        this.MediaSessionCompatQueueItem = i2;
        this.RatingCompat = i3;
        this.ComponentActivity = map;
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatToken = textStyle;
        this.ParcelableVolumeInfo = i4;
        this.MediaSessionCompatResultReceiverWrapper = i5;
        this.PlaybackStateCompat = i6;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = this.MediaSessionCompatResultReceiverWrapper;
        int i3 = this.ParcelableVolumeInfo;
        Object obj3 = this.ComponentActivity;
        CharSequence charSequence = this.read;
        if (i != 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
            androidx.compose.material3.TextKt.m132TextZ58ophY((androidx.compose.ui.text.AnnotatedString) charSequence, this.serializer, this.PlaybackStateCompatCustomAction, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.RemoteActionCompatParcelizer, this.write, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.RatingCompat, (Map) obj3, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatToken, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, this.PlaybackStateCompat);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
        int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
        androidx.compose.material3.TextKt.m131TextNvy7gAk((String) charSequence, this.serializer, this.PlaybackStateCompatCustomAction, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, (androidx.compose.ui.text.font.FontFamily) obj3, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.RemoteActionCompatParcelizer, this.write, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.MediaSessionCompatQueueItem, this.RatingCompat, this.MediaBrowserCompatMediaItem, this.MediaSessionCompatToken, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer4, this.PlaybackStateCompat);
        return createfromparcel;
    }

    public /* synthetic */ isRelatedToAutoCommit(String str, androidx.compose.ui.Modifier modifier, long j, long j2, androidx.compose.ui.text.font.FontWeight fontWeight, androidx.compose.ui.text.font.FontFamily fontFamily, long j3, androidx.compose.ui.text.style.TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.text.TextStyle textStyle, int i4, int i5, int i6) {
        this.read = str;
        this.serializer = modifier;
        this.PlaybackStateCompatCustomAction = j;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = j2;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = fontWeight;
        this.ComponentActivity = fontFamily;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = j3;
        this.RemoteActionCompatParcelizer = textAlign;
        this.write = j4;
        this.MediaMetadataCompat = i;
        this.MediaDescriptionCompat = z;
        this.MediaSessionCompatQueueItem = i2;
        this.RatingCompat = i3;
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatToken = textStyle;
        this.ParcelableVolumeInfo = i4;
        this.MediaSessionCompatResultReceiverWrapper = i5;
        this.PlaybackStateCompat = i6;
    }
}
