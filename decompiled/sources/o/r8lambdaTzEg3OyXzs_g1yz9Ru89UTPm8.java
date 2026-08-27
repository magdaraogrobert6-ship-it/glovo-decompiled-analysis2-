package o;

import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.settings.data.PreferencesRepository$observeStringPreference$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asSingle$1;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8 extends androidx.lifecycle.ViewModel {
    public final unpackInt2 IconCompatParcelizer;
    public final setTransactionSuccessful MediaDescriptionCompat;
    public final StateFlow RatingCompat;
    public final Flow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final OtpLogger serializer;
    public final r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds write;

    public r8lambdaTzEg3OyXzs_g1yz9Ru89UTPm8(setTransactionSuccessful settransactionsuccessful, r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds r8lambdah04qyyeozrxd4cfrstnkpb99_ds, unpackInt2 unpackint2, OtpLogger otpLogger) {
        settransactionsuccessful.getClass();
        r8lambdah04qyyeozrxd4cfrstnkpb99_ds.getClass();
        unpackint2.getClass();
        otpLogger.getClass();
        this.MediaDescriptionCompat = settransactionsuccessful;
        this.write = r8lambdah04qyyeozrxd4cfrstnkpb99_ds;
        this.IconCompatParcelizer = unpackint2;
        this.serializer = otpLogger;
        ShortNewsContentCardView shortNewsContentCardView = null;
        this.RemoteActionCompatParcelizer = FlowKt.write(new PreferencesRepository$observeStringPreference$1(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.preference_chat_language), shortNewsContentCardView, 0));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new r8lambdaTgPsXaTTZ8gJI5Nphc8TulxhY9I(SimpleItemTouchHelperCallback.serializer, ""));
        this.read = mutableStateFlow;
        this.RatingCompat = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RxConvertKt$asSingle$1(this, shortNewsContentCardView, 3), 3);
    }
}
