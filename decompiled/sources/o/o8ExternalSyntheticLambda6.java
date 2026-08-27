package o;

import com.roadrunner.delivery.accept.orderitems.presentation.compose.OrderItemsBottomSheetKt;
import com.roadrunner.map.navigateview.NavigationInformationKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o8ExternalSyntheticLambda6 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ String write;

    public /* synthetic */ o8ExternalSyntheticLambda6(int i, String str, androidx.compose.ui.Modifier modifier, int i2) {
        this.RemoteActionCompatParcelizer = i;
        this.write = str;
        this.read = modifier;
        this.serializer = i2;
    }

    public /* synthetic */ o8ExternalSyntheticLambda6(String str, int i, androidx.compose.ui.Modifier modifier, int i2) {
        this.write = str;
        this.RemoteActionCompatParcelizer = i;
        this.read = modifier;
        this.serializer = i2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 23;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.serializer;
        androidx.compose.ui.Modifier modifier = this.read;
        String str = this.write;
        int i6 = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 == 0) {
            NavigationInformationKt.DestinationDetails(i6, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
            return createfromparcel;
        }
        OrderItemsBottomSheetKt.OrderInstruction(i6, ContentType_androidKt.RemoteActionCompatParcelizer(i5 | 1), getbirthdatefull, modifier, str);
        int i7 = MediaSessionCompatQueueItem + 91;
        RatingCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return createfromparcel;
    }
}
