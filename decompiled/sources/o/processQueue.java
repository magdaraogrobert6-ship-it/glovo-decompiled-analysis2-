package o;

import com.roadrunner.rrds.compose.component.indicators.TagsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class processQueue implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ CharSequence serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ processQueue(CharSequence charSequence, androidx.compose.ui.Modifier modifier, int i, int i2, int i3) {
        this.write = i3;
        this.serializer = charSequence;
        this.IconCompatParcelizer = modifier;
        this.RemoteActionCompatParcelizer = i;
        this.read = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.read;
        int i4 = this.RemoteActionCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.IconCompatParcelizer;
        CharSequence charSequence = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i2 == 0) {
            TagsKt.read(charSequence, modifier, i4, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3));
            int i5 = MediaSessionCompatQueueItem + 87;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }
        if (i2 == 1) {
            TagsKt.serializer(charSequence, modifier, i4, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3));
            return createfromparcel;
        }
        TagsKt.IconCompatParcelizer(charSequence, modifier, i4, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i3));
        int i7 = RatingCompat + 27;
        MediaSessionCompatQueueItem = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
