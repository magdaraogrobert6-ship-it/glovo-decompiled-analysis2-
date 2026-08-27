package o;

import com.roadrunner.delivery.ontheway.header.implementation.presentation.compose.DestinationHeaderKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getShadowui_text implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ AndroidStringDelegate read;
    public final /* synthetic */ int write;

    public /* synthetic */ getShadowui_text(AndroidStringDelegate androidStringDelegate, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.RemoteActionCompatParcelizer = i2;
        this.read = androidStringDelegate;
        this.IconCompatParcelizer = modifier;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 89;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ((Integer) obj2).getClass();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.write;
        androidx.compose.ui.Modifier modifier = this.IconCompatParcelizer;
        AndroidStringDelegate androidStringDelegate = this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i3 != 0) {
            if (i3 != 1) {
                DestinationHeaderKt.DestinationArrivalContainer(androidStringDelegate, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
                return createfromparcel2;
            }
            DestinationHeaderKt.DestinationOrderSummaryContainer(androidStringDelegate, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            return createfromparcel2;
        }
        DestinationHeaderKt.DestinationTextContainer(androidStringDelegate, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
        int i5 = MediaDescriptionCompat + 31;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
