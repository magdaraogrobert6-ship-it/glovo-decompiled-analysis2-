package o;

import com.roadrunner.bubble.presentation.BubbleContentKt;
import com.roadrunner.instant.shifts.presentation.InstantShiftsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class findKNearestNeighbors implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ findKNearestNeighbors(String str, String str2, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.serializer = i2;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = modifier;
        this.read = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 121;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.read;
        androidx.compose.ui.Modifier modifier = this.RemoteActionCompatParcelizer;
        String str = this.write;
        String str2 = this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 != 0) {
            InstantShiftsKt.InstantShiftsTitle(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str2, str);
            return createfromparcel;
        }
        BubbleContentKt.BubbleButtonColumn(ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str2, str);
        int i6 = MediaDescriptionCompat + 85;
        MediaSessionCompatQueueItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return createfromparcel;
    }
}
