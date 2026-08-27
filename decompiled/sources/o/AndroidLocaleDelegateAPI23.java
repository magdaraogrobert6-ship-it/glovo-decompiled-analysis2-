package o;

import com.roadrunner.delivery.ontheway.deliverynotes.presentation.compose.DeliveryNotesKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AndroidLocaleDelegateAPI23 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ accessupdateWithEmojiCompat serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ AndroidLocaleDelegateAPI23(accessupdateWithEmojiCompat accessupdatewithemojicompat, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.serializer = accessupdatewithemojicompat;
        this.RemoteActionCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.read = modifier;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 89;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.write;
        androidx.compose.ui.Modifier modifier = this.read;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.RemoteActionCompatParcelizer;
        accessupdateWithEmojiCompat accessupdatewithemojicompat = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            DeliveryNotesKt.read(accessupdatewithemojicompat, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
            return createfromparcel;
        }
        DeliveryNotesKt.DeliveryNotesContent(accessupdatewithemojicompat, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1));
        int i6 = MediaBrowserCompatMediaItem + 49;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
