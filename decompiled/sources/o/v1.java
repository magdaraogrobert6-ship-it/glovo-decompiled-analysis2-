package o;

import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends androidx.lifecycle.ViewModel {
    public final getQueryContext read;
    public final StateFlow write;

    public v1(getQueryContext getquerycontext, setTransactionSuccessful settransactionsuccessful) {
        getquerycontext.getClass();
        settransactionsuccessful.getClass();
        this.read = getquerycontext;
        this.write = StateFlowKt.read(new uc(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_subtitle), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_promo), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_low_promo), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_high_promo), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_multiplier_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_multiplier_subtitle), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_rush_hour_promo_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_rush_hour_promo_subtitle), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_weather_promo_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_weather_promo_subtitle), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_night_promo_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_night_promo_subtitle), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_holiday_promo_title), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.rush_bonus_legend_holiday_promo_subtitle)));
    }
}
