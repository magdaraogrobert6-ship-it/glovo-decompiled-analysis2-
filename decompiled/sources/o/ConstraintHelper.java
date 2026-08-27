package o;

import android.app.Application;
import com.roadrunner.diagnostics.data.NotificationsDiagnosticsRepository;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleJust;
import org.bouncycastle.asn1.ASN1UniversalType;

/* JADX INFO: loaded from: classes3.dex */
public final class ConstraintHelper extends ASN1UniversalType {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read = 0;
    public final Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintHelper(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, NotificationsDiagnosticsRepository notificationsDiagnosticsRepository) {
        super(5, ((com.data.util.AndroidScheduleProvider) getpivotoffsetf1c5bw0).IconCompatParcelizer());
        getpivotoffsetf1c5bw0.getClass();
        notificationsDiagnosticsRepository.getClass();
        this.write = notificationsDiagnosticsRepository;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintHelper(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, SaveHeatmapUrlImpl saveHeatmapUrlImpl) {
        super(5, ((com.data.util.AndroidScheduleProvider) getpivotoffsetf1c5bw0).IconCompatParcelizer());
        getpivotoffsetf1c5bw0.getClass();
        saveHeatmapUrlImpl.getClass();
        this.write = saveHeatmapUrlImpl;
    }

    @Override // org.bouncycastle.asn1.ASN1UniversalType
    public final Single IconCompatParcelizer(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.read;
        Object obj3 = this.write;
        if (i3 != 0) {
            return ((getProductId) ((SaveHeatmapUrlImpl) obj3).serializer).write();
        }
        NotificationsDiagnosticsRepository notificationsDiagnosticsRepository = (NotificationsDiagnosticsRepository) obj3;
        com.huawei.wisesecurity.ucs_credential.p0 p0Var = notificationsDiagnosticsRepository.IconCompatParcelizer;
        Application application = notificationsDiagnosticsRepository.read;
        p0Var.getClass();
        application.getClass();
        SingleJust singleJustSerializer = Single.serializer(Boolean.valueOf(androidx.core.app.NotificationManagerCompat.from(application).areNotificationsEnabled()));
        int i4 = RemoteActionCompatParcelizer + 77;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return singleJustSerializer;
        }
        obj2.hashCode();
        throw null;
    }
}
