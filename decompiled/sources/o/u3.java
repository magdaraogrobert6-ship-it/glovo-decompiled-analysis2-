package o;

import com.roadrunner.delivery.accept.deliverydetails.presentation.compose.DeliveryDetailsContentKt;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.TagOverlayKt;
import com.roadrunner.opportunities.calendar.HourlyBonusListKt;
import com.roadrunner.recentdeliveries.presentation.components.DeliveryItemsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u3 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Modifier read;
    public final /* synthetic */ int write;

    public /* synthetic */ u3(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, androidx.compose.ui.Modifier modifier, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.read = modifier;
        this.write = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ((Integer) obj2).getClass();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.write;
        androidx.compose.ui.Modifier modifier = this.read;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).getClass();
        if (i3 == 0) {
            HourlyBonusListKt.HourlyBonusList(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            return createfromparcel2;
        }
        if (i3 == 1) {
            DeliveryDetailsContentKt.Tags(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            int i5 = serializer + 77;
            MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel2;
        }
        if (i3 == 2) {
            TagOverlayKt.serializer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            return createfromparcel2;
        }
        if (i3 != 3) {
            DeliveryItemsKt.DeliveryItems(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            return createfromparcel2;
        }
        com.roadrunner.delivery.pickupdropoff.tasks.takepicture.presentation.picture_with_tag.TagOverlayKt.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, modifier, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
        return createfromparcel2;
    }
}
