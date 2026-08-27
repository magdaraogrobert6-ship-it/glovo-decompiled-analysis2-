package o;

import com.roadrunner.rrds.compose.component.indicators.TagsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class submit implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int MediaBrowserCompatMediaItem;
    public final /* synthetic */ int MediaDescriptionCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ CharSequence serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ submit(CharSequence charSequence, androidx.compose.ui.Modifier modifier, int i, int i2, int i3, int i4, int i5) {
        this.IconCompatParcelizer = i5;
        this.serializer = charSequence;
        this.read = modifier;
        this.RemoteActionCompatParcelizer = i;
        this.write = i2;
        this.MediaBrowserCompatMediaItem = i3;
        this.MediaDescriptionCompat = i4;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.MediaBrowserCompatMediaItem;
        if (i2 == 0) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            TagsKt.RemoteActionCompatParcelizer(this.serializer, this.read, this.RemoteActionCompatParcelizer, this.write, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, this.MediaDescriptionCompat);
            return createfromparcel;
        }
        if (i2 == 1) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            TagsKt.MediaBrowserCompatMediaItem(this.serializer, this.read, this.RemoteActionCompatParcelizer, this.write, (getBirthDateFull) obj, iRemoteActionCompatParcelizer2, this.MediaDescriptionCompat);
            return createfromparcel;
        }
        if (i2 == 2) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer3 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            TagsKt.write(this.serializer, this.read, this.RemoteActionCompatParcelizer, this.write, (getBirthDateFull) obj, iRemoteActionCompatParcelizer3, this.MediaDescriptionCompat);
            int i4 = MediaSessionCompatQueueItem + 19;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
            }
            return createfromparcel;
        }
        if (i2 == 3) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer4 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            CharSequence charSequence = this.serializer;
            androidx.compose.ui.Modifier modifier = this.read;
            int i6 = this.RemoteActionCompatParcelizer;
            int i7 = this.write;
            int i8 = this.MediaDescriptionCompat;
            Object[] objArr = {charSequence, modifier, Integer.valueOf(i6), Integer.valueOf(i7), (getBirthDateFull) obj, Integer.valueOf(iRemoteActionCompatParcelizer4), Integer.valueOf(i8)};
            int iIconCompatParcelizer = onMessageReceived.IconCompatParcelizer();
            int iIconCompatParcelizer2 = onMessageReceived.IconCompatParcelizer();
            TagsKt.serializer(2032277805, iIconCompatParcelizer, onMessageReceived.IconCompatParcelizer(), -2032277804, objArr, onMessageReceived.IconCompatParcelizer(), iIconCompatParcelizer2);
            return createfromparcel;
        }
        if (i2 == 4) {
            ((Integer) obj2).getClass();
            int iRemoteActionCompatParcelizer5 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
            TagsKt.serializer(this.serializer, this.read, this.RemoteActionCompatParcelizer, this.write, (getBirthDateFull) obj, iRemoteActionCompatParcelizer5, this.MediaDescriptionCompat);
            return createfromparcel;
        }
        ((Integer) obj2).getClass();
        int iRemoteActionCompatParcelizer6 = ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1);
        CharSequence charSequence2 = this.serializer;
        androidx.compose.ui.Modifier modifier2 = this.read;
        int i9 = this.RemoteActionCompatParcelizer;
        int i10 = this.write;
        int i11 = this.MediaDescriptionCompat;
        Object[] objArr2 = {charSequence2, modifier2, Integer.valueOf(i9), Integer.valueOf(i10), (getBirthDateFull) obj, Integer.valueOf(iRemoteActionCompatParcelizer6), Integer.valueOf(i11)};
        int iIconCompatParcelizer3 = onMessageReceived.IconCompatParcelizer();
        int iIconCompatParcelizer4 = onMessageReceived.IconCompatParcelizer();
        TagsKt.serializer(-1744438842, iIconCompatParcelizer3, onMessageReceived.IconCompatParcelizer(), 1744438842, objArr2, onMessageReceived.IconCompatParcelizer(), iIconCompatParcelizer4);
        int i12 = MediaSessionCompatQueueItem + 69;
        RatingCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return createfromparcel;
    }
}
