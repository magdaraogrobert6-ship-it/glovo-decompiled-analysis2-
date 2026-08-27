package o;

import com.roadrunner.delivery.pickupdropoff.details.presentation.compose.PaymentKt;
import com.roadrunner.liveness.instruction.presentation.compose.InstructionComponentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class processViewInfoslambda1 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int PlaybackStateCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ String MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaMetadataCompat;
    public final /* synthetic */ String MediaSessionCompatQueueItem;
    public final /* synthetic */ androidx.compose.ui.Modifier RatingCompat;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ processViewInfoslambda1(String str, String str2, String str3, String str4, String str5, String str6, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.read = str;
        this.serializer = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.write = str4;
        this.MediaSessionCompatQueueItem = str5;
        this.MediaBrowserCompatMediaItem = str6;
        this.RatingCompat = modifier;
        this.MediaMetadataCompat = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 9;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.MediaMetadataCompat;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            PaymentKt.Payment(this.read, this.serializer, this.RemoteActionCompatParcelizer, this.write, this.MediaSessionCompatQueueItem, this.MediaBrowserCompatMediaItem, this.RatingCompat, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        InstructionComponentKt.Instructions(this.read, this.serializer, this.RemoteActionCompatParcelizer, this.write, this.MediaSessionCompatQueueItem, this.MediaBrowserCompatMediaItem, this.RatingCompat, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
        int i5 = MediaDescriptionCompat + 117;
        PlaybackStateCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
