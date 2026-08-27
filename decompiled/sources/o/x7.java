package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class x7 implements FlowCollector {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ x5 read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ x7(x5 x5Var, int i) {
        this.serializer = i;
        this.read = x5Var;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        x5 x5Var = this.read;
        if (i3 == 0) {
            x5Var.IconCompatParcelizer.IconCompatParcelizer((f9) obj);
            return createfromparcel2;
        }
        f1 f1Var = (f1) obj;
        s7 s7Var = x5Var.MediaBrowserCompatMediaItem;
        getSupportedCipherSuites getsupportedciphersuites = x5Var.MediaDescriptionCompat;
        vg vgVar = x5Var.RatingCompat;
        subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2 = x5Var.serializer;
        if (f1Var instanceof eh) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{subscribetobannersupdateslambda2.read(), "ON_DEMAND"}, getCieXyz.write())).booleanValue()) {
                if (!x5Var.read.RemoteActionCompatParcelizer()) {
                    int i4 = IconCompatParcelizer + 47;
                    RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    getsupportedciphersuites.serializer.MediaDescriptionCompat.IconCompatParcelizer(null);
                    getsupportedciphersuites.read.write.write(Boolean.TRUE);
                }
            } else if (!x5Var.RemoteActionCompatParcelizer.IconCompatParcelizer() && ((sc) vgVar.write.read()) == sc.SCHEDULE) {
                getsupportedciphersuites.serializer.MediaDescriptionCompat.IconCompatParcelizer(null);
                getsupportedciphersuites.read.write.write(Boolean.TRUE);
            }
        } else if (f1Var instanceof f4) {
            f4 f4Var = (f4) f1Var;
            String strWrite = f4Var.write();
            s7Var.getClass();
            if (strWrite != null && (!(!strWrite.equals("calendar_pin")) || strWrite.equals("simple_pin"))) {
                ff$$ExternalSyntheticOutline0.m("pin_type", strWrite, s7Var.write, "pin_on_map_clicked");
                int i6 = IconCompatParcelizer + 13;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{subscribetobannersupdateslambda2.read(), "ON_DEMAND"}, getCieXyz.write())).booleanValue() || ((sc) vgVar.write.read()) == sc.SCHEDULE) {
                String strIconCompatParcelizer = f4Var.IconCompatParcelizer();
                getsupportedciphersuites.getClass();
                strIconCompatParcelizer.getClass();
                OpportunitiesRepository opportunitiesRepository = getsupportedciphersuites.serializer;
                opportunitiesRepository.getClass();
                opportunitiesRepository.MediaDescriptionCompat.IconCompatParcelizer(opportunitiesRepository.write.get(strIconCompatParcelizer));
            }
        } else if (f1Var instanceof ehExternalSyntheticLambda0) {
            ff$$ExternalSyntheticOutline0.m("pin_type", "cluster_pin", s7Var.write, "pin_on_map_clicked");
        }
        return createfromparcel2;
    }
}
