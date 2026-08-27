package o;

import com.roadrunner.rrds.compose.component.indicators.loading.ProgressorCirclesKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SingleThreadCachedScheduler2 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ String read;
    public final /* synthetic */ androidx.compose.ui.Modifier serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ SingleThreadCachedScheduler2(String str, float f, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.read = str;
        this.RemoteActionCompatParcelizer = f;
        this.serializer = modifier;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 57;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.write;
        androidx.compose.ui.Modifier modifier = this.serializer;
        float f = this.RemoteActionCompatParcelizer;
        String str = this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            ProgressorCirclesKt.write(str, f, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            int i6 = MediaMetadataCompat + 15;
            MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return createfromparcel;
        }
        if (i4 == 1) {
            mergeZ1GrekI.IconCompatParcelizer(str, f, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        if (i4 != 2) {
            ProgressorCirclesKt.ProgressorCircleSuccess(str, f, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        ProgressorCirclesKt.ProgressorCircleError(str, f, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
        return createfromparcel;
    }
}
