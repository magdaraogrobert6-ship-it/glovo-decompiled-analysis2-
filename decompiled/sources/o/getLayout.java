package o;

import com.roadrunner.delivery.accept.deliverydetails.presentation.compose.DeliveryDetailsContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getLayout implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ CharSequenceCharacterIterator IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ getLayout(CharSequenceCharacterIterator charSequenceCharacterIterator, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.read = i2;
        this.IconCompatParcelizer = charSequenceCharacterIterator;
        this.RemoteActionCompatParcelizer = modifier;
        this.serializer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 7;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.serializer;
        androidx.compose.ui.Modifier modifier = this.RemoteActionCompatParcelizer;
        CharSequenceCharacterIterator charSequenceCharacterIterator = this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            DeliveryDetailsContentKt.Destination(charSequenceCharacterIterator, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        if (i4 == 1) {
            DeliveryDetailsContentKt.RemoteActionCompatParcelizer(charSequenceCharacterIterator, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        if (i4 == 2) {
            DeliveryDetailsContentKt.write(charSequenceCharacterIterator, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            int i6 = write + 99;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return createfromparcel;
        }
        if (i4 == 3) {
            DeliveryDetailsContentKt.read(charSequenceCharacterIterator, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            int i8 = write + 55;
            MediaSessionCompatQueueItem = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return createfromparcel;
        }
        if (i4 == 4) {
            DeliveryDetailsContentKt.MediaBrowserCompatMediaItem(charSequenceCharacterIterator, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        if (i4 != 5) {
            DeliveryDetailsContentKt.serializer(charSequenceCharacterIterator, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        Object[] objArr = {charSequenceCharacterIterator, modifier, getbirthdatefull, Integer.valueOf(ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5))};
        int iIconCompatParcelizer = ff.IconCompatParcelizer();
        DeliveryDetailsContentKt.write(1957866164, objArr, -1957866163, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), iIconCompatParcelizer, ff.IconCompatParcelizer());
        return createfromparcel;
    }
}
