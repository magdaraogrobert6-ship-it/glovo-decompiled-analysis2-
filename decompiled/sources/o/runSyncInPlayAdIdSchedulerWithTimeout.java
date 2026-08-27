package o;

import com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt;
import com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt;
import com.roadrunner.delivery.accept.individualEarnings.presentation.composable.SingleEarningsContentKt;
import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.compose.AcknowledgmentContentKt;
import com.roadrunner.rider.state.searchshifts.presentation.timepicker.DualColumnTimePickerKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class runSyncInPlayAdIdSchedulerWithTimeout implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ runSyncInPlayAdIdSchedulerWithTimeout(int i, int i2) {
        this.serializer = i2;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 27;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ((Integer) obj2).intValue();
            obj3.hashCode();
            throw null;
        }
        int i3 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).intValue();
        if (i3 == 0) {
            TertiaryKt.write(getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            int i5 = RemoteActionCompatParcelizer + 37;
            write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return createfromparcel2;
            }
            throw null;
        }
        if (i3 == 1) {
            EarningsComposableKt.write(getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            return createfromparcel2;
        }
        if (i3 == 2) {
            EarningsContentKt.read(getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            return createfromparcel2;
        }
        if (i3 == 3) {
            SingleEarningsContentKt.write(getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            return createfromparcel2;
        }
        if (i3 == 4) {
            AcknowledgmentContentKt.serializer(getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            return createfromparcel2;
        }
        if (i3 != 5) {
            TagsKt.RemoteActionCompatParcelizer(getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
            return createfromparcel2;
        }
        DualColumnTimePickerKt.IconCompatParcelizer(getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
        return createfromparcel2;
    }
}
