package o;

import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.domain.logout.ClearDataUseCaseImpl$invoke$2;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.push.presentation.BasePushMessagesViewModel;
import com.sentiance.core.model.events.N$b;
import io.reactivex.disposables.Disposable;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class debounceEntryb8qMvQI extends BasePushMessagesViewModel {
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final BrazeExternalSyntheticLambda28 IconCompatParcelizer;
    public final StateFlow MediaDescriptionCompat;
    public final getHasNonTranslationComponents RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final MutableStateFlow serializer;
    public final SignInDataStore write;

    public final StateFlow serializer() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        StateFlow stateFlow = this.MediaDescriptionCompat;
        int i4 = i3 + 39;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    public final getQueryContext write() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 61;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3;
        int i4 = i2 % 2;
        getQueryContext getquerycontext = this.read;
        int i5 = i3 + 23;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getquerycontext;
    }

    public debounceEntryb8qMvQI(BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, getHasNonTranslationComponents gethasnontranslationcomponents, SignInDataStore signInDataStore, getQueryContext getquerycontext) {
        this.IconCompatParcelizer = brazeExternalSyntheticLambda28;
        this.RemoteActionCompatParcelizer = gethasnontranslationcomponents;
        this.write = signInDataStore;
        this.read = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(multiForEach.IconCompatParcelizer);
        this.serializer = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new ClearDataUseCaseImpl$invoke$2(this, (ShortNewsContentCardView) null, 7), 3);
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new MapboxNavigation$parsing$2(this, null, 6));
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 103;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void IconCompatParcelizer(fractionVisibleInRect fractionvisibleinrect) {
        int i = 2 % 2;
        this.read.serializer(new getPositionInScreennOccac(fractionvisibleinrect.IconCompatParcelizer));
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 55;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 57;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getHasNonTranslationComponents gethasnontranslationcomponents = this.RemoteActionCompatParcelizer;
        gethasnontranslationcomponents.RemoteActionCompatParcelizer.IconCompatParcelizer("Delivery Chats List", null);
        gethasnontranslationcomponents.MediaBrowserCompatMediaItem.getClass();
        int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 121;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void read() {
        int i = 2 % 2;
        this.serializer.IconCompatParcelizer(multiForEach.IconCompatParcelizer);
        SignInDataStore signInDataStore = this.write;
        N$b n$b = (N$b) signInDataStore.RemoteActionCompatParcelizer;
        calculateOcclusions calculateocclusions = new calculateOcclusions(signInDataStore, 2);
        calculateOcclusions calculateocclusions2 = new calculateOcclusions(signInDataStore, 3);
        n$b.getClass();
        Disposable disposable = (Disposable) n$b.write;
        int i2 = 1;
        if (disposable != null) {
            int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 1;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                disposable.dispose();
                int i4 = 46 / 0;
            } else {
                disposable.dispose();
            }
        }
        n$b.write = ((CustomerChatProviderImpl) ((forEachNewCallbackNeverInvoked) n$b.read)).IconCompatParcelizer(true).subscribe(new MapboxNavigation$$ExternalSyntheticLambda4(21, new SessionDao_Impl$$ExternalSyntheticLambda1(calculateocclusions, 6, n$b)), new MapboxNavigation$$ExternalSyntheticLambda4(22, new BarcodeAnalyzer$$ExternalSyntheticLambda0(i2, calculateocclusions2)));
        int i5 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 53;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }
}
