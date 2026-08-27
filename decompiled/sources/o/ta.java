package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.opportunities.api.navigation.BonusCalendarParams;
import com.roadrunner.opportunities.calendar.BonusCalendarViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ta implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ BonusCalendarViewModel write;

    public /* synthetic */ ta(BonusCalendarViewModel bonusCalendarViewModel, int i) {
        this.read = i;
        this.write = bonusCalendarViewModel;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.read;
        BonusCalendarViewModel bonusCalendarViewModel = this.write;
        Object obj = null;
        if (i2 == 0) {
            bonusCalendarViewModel.MediaSessionCompatQueueItem.write.logEvent("bonus_calendar_closed", null);
            bonusCalendarViewModel.RatingCompat.serializer(t8.read);
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i3 = serializer + 89;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return createfromparcel;
            }
            obj.hashCode();
            throw null;
        }
        Object objWrite = bonusCalendarViewModel.MediaMetadataCompat.write("bonus_calendar_params");
        if (objWrite == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Bonus calendar can't be opened without params");
            int i4 = serializer + 125;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return null;
        }
        int i6 = serializer + 83;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return (BonusCalendarParams) objWrite;
        }
        throw null;
    }
}
