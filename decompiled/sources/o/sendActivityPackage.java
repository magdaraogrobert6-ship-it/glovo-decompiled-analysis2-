package o;

import com.roadrunner.delivery.accept.laststop.presentation.compose.LastStopOptionKt;
import com.roadrunner.rrds.compose.component.forms.DropdownKt;
import com.roadrunner.rrds.compose.component.forms.TextInputBigV2Kt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sendActivityPackage implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ androidx.compose.ui.Modifier IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ boolean write;

    public /* synthetic */ sendActivityPackage(String str, boolean z, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.read = i2;
        this.serializer = str;
        this.write = z;
        this.IconCompatParcelizer = modifier;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 87;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = this.RemoteActionCompatParcelizer;
        androidx.compose.ui.Modifier modifier = this.IconCompatParcelizer;
        boolean z = this.write;
        String str = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i4 != 0) {
            if (i4 != 1) {
                TextInputBigV2Kt.TitleAndRequiredText(str, z, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
                return createfromparcel;
            }
            LastStopOptionKt.LastStopOptionWithDescription(str, z, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
            return createfromparcel;
        }
        DropdownKt.TitleAndRequiredText(str, z, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i5));
        int i6 = MediaSessionCompatQueueItem + 53;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return createfromparcel;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
