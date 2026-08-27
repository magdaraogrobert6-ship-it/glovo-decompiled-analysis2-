package o;

import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.H$b;
import io.sentry.util.network.NetworkBody;
import io.socket.parser.IOParser$Decoder;
import okhttp3.FormBody;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class setSdkAuthenticationSignature implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final /* synthetic */ int write;

    public setSdkAuthenticationSignature(ImageHeaderParserImageType imageHeaderParserImageType, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2) {
        this.write = 5;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
        this.read = mergejsonobjects2;
    }

    public static setSdkAuthenticationSignature RemoteActionCompatParcelizer(ImageHeaderParserImageType imageHeaderParserImageType, r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv8, mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        setSdkAuthenticationSignature setsdkauthenticationsignature = new setSdkAuthenticationSignature(imageHeaderParserImageType, r8lambdahmuf48geqgedwlhl7mczo1q1bv8, mergejsonobjects);
        int i2 = serializer + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 16 / 0;
        }
        return setsdkauthenticationsignature;
    }

    public /* synthetic */ setSdkAuthenticationSignature(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = mergejsonobjects;
        this.read = mergejsonobjects2;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.write;
        mergeJsonObjects mergejsonobjects = this.read;
        mergeJsonObjects mergejsonobjects2 = this.RemoteActionCompatParcelizer;
        switch (i2) {
            case 0:
                return new subscribeToBannersDismissedEventandroid_sdk_base_release((decode) mergejsonobjects2.write(), (QualtricsManagerImpl) mergejsonobjects.write(), 0);
            case 1:
                return new NetworkBody((GetCourierShiftInfoImpl) mergejsonobjects2.write(), (InternalPlatformTextApi) mergejsonobjects.write());
            case 2:
                return new subscribeToBannersDismissedEventandroid_sdk_base_release((decode) mergejsonobjects2.write(), (QualtricsManagerImpl) mergejsonobjects.write(), 2);
            case 3:
                r8lambdaI47kz07hznhDxsNfh4Kg3kp_rE r8lambdai47kz07hznhdxsnfh4kg3kp_re = (r8lambdaI47kz07hznhDxsNfh4Kg3kp_rE) mergejsonobjects2.write();
                ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) mergejsonobjects.write();
                r8lambdai47kz07hznhdxsnfh4kg3kp_re.getClass();
                executeApiRequest.getClass();
                FormBody.Builder builder = new FormBody.Builder();
                builder.serializer = r8lambdai47kz07hznhdxsnfh4kg3kp_re;
                builder.RemoteActionCompatParcelizer = executeApiRequest;
                return builder;
            case 4:
                r8lambdaI47kz07hznhDxsNfh4Kg3kp_rE r8lambdai47kz07hznhdxsnfh4kg3kp_re2 = (r8lambdaI47kz07hznhDxsNfh4Kg3kp_rE) mergejsonobjects2.write();
                ExecuteApiRequest executeApiRequest2 = (ExecuteApiRequest) mergejsonobjects.write();
                r8lambdai47kz07hznhdxsnfh4kg3kp_re2.getClass();
                executeApiRequest2.getClass();
                IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
                iOParser$Decoder.RemoteActionCompatParcelizer = r8lambdai47kz07hznhdxsnfh4kg3kp_re2;
                iOParser$Decoder.read = executeApiRequest2;
                int i3 = serializer + 15;
                IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return iOParser$Decoder;
                }
                throw null;
            case 5:
                r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds r8lambdah04qyyeozrxd4cfrstnkpb99_ds = (r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds) mergejsonobjects2.write();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) mergejsonobjects.write();
                r8lambdah04qyyeozrxd4cfrstnkpb99_ds.getClass();
                settransactionsuccessful.getClass();
                return new r8lambdaP1frYJQmg54QrMLKfwUvXZE4A5U(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, settransactionsuccessful);
            case 6:
                return new NetworkBody((decode) mergejsonobjects2.write(), (getLooseusljTpc) mergejsonobjects.write());
            case 7:
                H$b h$b = new H$b((getInputTextSuggestionStatedelegate) mergejsonobjects2.write(), (setTransactionSuccessful) mergejsonobjects.write());
                int i4 = serializer + 61;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return h$b;
                }
                throw null;
            case 8:
                return new NetworkBody((decode) mergejsonobjects2.write(), (disable) mergejsonobjects.write());
            default:
                setApiKeyPresentandroid_sdk_base_release setapikeypresentandroid_sdk_base_release = (setApiKeyPresentandroid_sdk_base_release) mergejsonobjects2.write();
                logPurchaselambda1 logpurchaselambda1 = (logPurchaselambda1) mergejsonobjects.write();
                setapikeypresentandroid_sdk_base_release.getClass();
                logpurchaselambda1.getClass();
                C$b c$b = new C$b();
                c$b.serializer = setapikeypresentandroid_sdk_base_release;
                c$b.write = logpurchaselambda1;
                c$b.IconCompatParcelizer = new isAdapterPositionOnScreen(new RealWebSocket$$ExternalSyntheticLambda0(12, c$b));
                return c$b;
        }
    }
}
