package o;

import com.roadrunner.sidemenu.menuitems.MenuItemContentKt;
import com.roadrunner.sidemenu.presentation.SideMenuViewModel;
import com.roadrunner.sidemenu.presentation.components.SideMenuContentKt;
import com.roadrunner.startworking.equipment.composable.EquipmentContentKt;
import com.roadrunner.startworking.equipment.composable.EquipmentSelectorKt;
import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdatwlPMTrSrus3A7UmaCID8_1F1M implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ r8lambdatwlPMTrSrus3A7UmaCID8_1F1M(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.IconCompatParcelizer = i2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = obj3;
        this.write = obj4;
        this.MediaSessionCompatQueueItem = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.MediaSessionCompatQueueItem;
        Object obj4 = this.write;
        Object obj5 = this.read;
        Object obj6 = this.RemoteActionCompatParcelizer;
        Object obj7 = this.serializer;
        if (i3 == 0) {
            ((Integer) obj2).getClass();
            MenuItemContentKt.MenuItemsScreen((r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8) obj7, (r8lambdav4khHexYF7B8JZECOja6EPumcY4) obj6, (r8lambdakakRSJ0yRWnWIggdAd9IDPYuM) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        if (i3 == 1) {
            ((Integer) obj2).getClass();
            SideMenuContentKt.SideMenuContent((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj7, (_get_deviceId_lambda0) obj6, (N$b) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        if (i3 == 2) {
            ((Integer) obj2).getClass();
            accessgetEndpointProvidercp.RemoteActionCompatParcelizer((SideMenuViewModel) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (N$b) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        if (i3 == 3) {
            ((Integer) obj2).getClass();
            EquipmentContentKt.Components((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        if (i3 != 4) {
            ((Integer) obj2).intValue();
            getCyan0d7_KjU.IconCompatParcelizer((schedulePushDeliveryandroid_sdk_base_release) obj7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
            return createfromparcel2;
        }
        ((Integer) obj2).getClass();
        EquipmentSelectorKt.EquipmentSelector((String) obj7, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj5, (androidx.compose.ui.Modifier) obj4, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
        int i5 = MediaDescriptionCompat + 117;
        MediaBrowserCompatMediaItem = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
