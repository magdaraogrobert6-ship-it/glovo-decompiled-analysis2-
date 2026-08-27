package o;

import com.roadrunner.vendor.review.data.database.entity.ReviewState;
import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class y5 extends TuplesKt {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ y5(int i, Object obj) {
        this.serializer = i;
    }

    @Override // kotlin.TuplesKt
    public final String serializer() {
        int i = 2 % 2;
        int i2 = read + 5;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i3;
        int i4 = i2 % 2;
        if (this.serializer != 0) {
            return "INSERT OR REPLACE INTO `vendor_review_state` (`delivery_id`,`state`,`updated_at`) VALUES (?,?,?)";
        }
        int i5 = i3 + 11;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return "INSERT OR REPLACE INTO `history` (`date`,`deliveries`) VALUES (?,?)";
    }

    @Override // kotlin.TuplesKt
    public final void write(UncheckedColordefault uncheckedColordefault, Object obj) {
        String strRemoteActionCompatParcelizer;
        int i = 2;
        int i2 = 2 % 2;
        if (this.serializer != 0) {
            areCachedContentCardsStale arecachedcontentcardsstale = (areCachedContentCardsStale) obj;
            uncheckedColordefault.getClass();
            arecachedcontentcardsstale.getClass();
            uncheckedColordefault.RemoteActionCompatParcelizer(1, arecachedcontentcardsstale.serializer);
            ReviewState reviewState = arecachedcontentcardsstale.read;
            reviewState.getClass();
            uncheckedColordefault.IconCompatParcelizer(2, reviewState.name());
            uncheckedColordefault.RemoteActionCompatParcelizer(3, arecachedcontentcardsstale.RemoteActionCompatParcelizer.getTimeInMillis());
            int i3 = read + 109;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 77 / 0;
                return;
            }
            return;
        }
        z0 z0Var = (z0) obj;
        uncheckedColordefault.getClass();
        z0Var.getClass();
        LocalDate localDate = z0Var.write;
        localDate.getClass();
        String string = localDate.toString("yyyy-MM-dd");
        string.getClass();
        uncheckedColordefault.IconCompatParcelizer(1, string);
        ArrayList<y2> arrayList = z0Var.IconCompatParcelizer;
        r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc = getModulateAlphake2Ky5w.serializer;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (y2 y2Var : arrayList) {
            int i5 = IconCompatParcelizer + 45;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % i;
            y2Var.getClass();
            long j = y2Var.id;
            String str = y2Var.confirmationNumber;
            int i7 = y2Var.vendorOrderNumber;
            zExternalSyntheticLambda0 zexternalsyntheticlambda0 = y2Var.vendor;
            yf yfVar = y2Var.customer;
            zExternalSyntheticLambda1 zexternalsyntheticlambda1 = y2Var.payment;
            yb ybVar = y2Var.cashCollection;
            List list = y2Var.items;
            double d = y2Var.distance;
            DateTime dateTime = y2Var.completedAt;
            arrayList2.add(new xf(j, str, i7, zexternalsyntheticlambda0, yfVar, zexternalsyntheticlambda1, ybVar, list, d, dateTime != null ? Long.valueOf(dateTime.getMillis()) : null));
            i = 2;
        }
        try {
            r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc r8lambda3kmch7yklpui_5smgazrgczhglc2 = getModulateAlphake2Ky5w.serializer;
            r8lambda3kmch7yklpui_5smgazrgczhglc2.getClass();
            strRemoteActionCompatParcelizer = r8lambda3kmch7yklpui_5smgazrgczhglc2.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(xf.Companion.serializer(), 0), arrayList2);
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.write(new Throwable(isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                 |Error in serializing the JSON data in type converter\n                 |object serialized = " + arrayList2 + "\n                "), e));
            strRemoteActionCompatParcelizer = null;
        }
        uncheckedColordefault.IconCompatParcelizer(2, String.valueOf(strRemoteActionCompatParcelizer));
    }
}
