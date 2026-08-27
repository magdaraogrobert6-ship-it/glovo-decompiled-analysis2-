package o;

import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.face.verification.domain.detection.DetectFaceWithFirebase;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.mapper.ErrorSnackbarMessageMapper;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.SharedResourcePool;
import io.sentry.util.network.NetworkBody;

/* JADX INFO: loaded from: classes3.dex */
public final class PreferenceGroupAdapter implements getColorIntegerOrNulllambda0 {
    private static int read = 1;
    private static int write;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;

    public PreferenceGroupAdapter(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.RemoteActionCompatParcelizer = 1;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public static final PreferenceGroupAdapter RemoteActionCompatParcelizer(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        int i = 2 % 2;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        PreferenceGroupAdapter preferenceGroupAdapter = new PreferenceGroupAdapter(r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
        int i2 = write + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return preferenceGroupAdapter;
    }

    public static final PreferenceGroupAdapter read(publishErrorlambda1 publisherrorlambda1, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45) {
        int i = 2 % 2;
        publisherrorlambda1.getClass();
        PreferenceGroupAdapter preferenceGroupAdapter = new PreferenceGroupAdapter((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) publisherrorlambda1, lambdaverifyplaystorepurchase45);
        int i2 = read + 125;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return preferenceGroupAdapter;
    }

    public static PreferenceGroupAdapter serializer(AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt, AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt2) {
        int i = 2 % 2;
        PreferenceGroupAdapter preferenceGroupAdapter = new PreferenceGroupAdapter((mergeJsonObjects) androidIndirectPointerEvent_androidKt, (getColorIntegerOrNulllambda0) androidIndirectPointerEvent_androidKt2, 5);
        int i2 = write + 91;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return preferenceGroupAdapter;
    }

    public static PreferenceGroupAdapter IconCompatParcelizer(r8lambdapkx6kfYbgP4lEOWkebovjPb0ug r8lambdapkx6kfybgp4leowkebovjpb0ug, getFailureMessage getfailuremessage) {
        int i = 2 % 2;
        PreferenceGroupAdapter preferenceGroupAdapter = new PreferenceGroupAdapter((getColorIntegerOrNulllambda0) r8lambdapkx6kfybgp4leowkebovjpb0ug, (mergeJsonObjects) getfailuremessage, 11);
        int i2 = write + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return preferenceGroupAdapter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PreferenceGroupAdapter IconCompatParcelizer(mergeJsonObjects mergejsonobjects, lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15) {
        int i = 2 % 2;
        PreferenceGroupAdapter preferenceGroupAdapter = new PreferenceGroupAdapter(mergejsonobjects, lambdaprocessandresolvedeeplink15, 12);
        int i2 = write + 117;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return preferenceGroupAdapter;
    }

    public /* synthetic */ PreferenceGroupAdapter(mergeJsonObjects mergejsonobjects, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = mergejsonobjects;
        this.IconCompatParcelizer = getcolorintegerornulllambda0;
    }

    public static PreferenceGroupAdapter write(applyLayoutFeatures applylayoutfeatures, PreferenceGroupAdapter preferenceGroupAdapter) {
        int i = 2 % 2;
        PreferenceGroupAdapter preferenceGroupAdapter2 = new PreferenceGroupAdapter((mergeJsonObjects) applylayoutfeatures, (getColorIntegerOrNulllambda0) preferenceGroupAdapter, 13);
        int i2 = read + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return preferenceGroupAdapter2;
        }
        throw null;
    }

    public PreferenceGroupAdapter(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45) {
        this.RemoteActionCompatParcelizer = 14;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = lambdaverifyplaystorepurchase45;
    }

    public static PreferenceGroupAdapter serializer(PreferenceGroupAdapter preferenceGroupAdapter, mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        PreferenceGroupAdapter preferenceGroupAdapter2 = new PreferenceGroupAdapter(preferenceGroupAdapter, mergejsonobjects, 3);
        int i2 = read + 43;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return preferenceGroupAdapter2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PreferenceGroupAdapter read(ImageHeaderParserImageType imageHeaderParserImageType, r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv8, mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        PreferenceGroupAdapter preferenceGroupAdapter = new PreferenceGroupAdapter(imageHeaderParserImageType, r8lambdahmuf48geqgedwlhl7mczo1q1bv8, mergejsonobjects);
        int i2 = write + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return preferenceGroupAdapter;
    }

    public /* synthetic */ PreferenceGroupAdapter(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = getcolorintegerornulllambda0;
        this.serializer = mergejsonobjects;
    }

    public PreferenceGroupAdapter(ImageHeaderParserImageType imageHeaderParserImageType, r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8 r8lambdahmuf48geqgedwlhl7mczo1q1bv8, mergeJsonObjects mergejsonobjects) {
        this.RemoteActionCompatParcelizer = 16;
        this.IconCompatParcelizer = r8lambdahmuf48geqgedwlhl7mczo1q1bv8;
        this.serializer = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.serializer;
        switch (i2) {
            case 0:
                return new SignInDataStore((IBraze) ((SeekBarPreferenceSavedState) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (NestComponentRepositoryImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 1:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite.getClass();
                stopInstancelambda11 stopinstancelambda11 = new stopInstancelambda11(1);
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite2.getClass();
                return new SemanticsProperties((setVerticalStyle) objWrite, stopinstancelambda11, (transferSessionPackageI) objWrite2);
            case 2:
                return new com.huawei.agconnect.config.impl.m((setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (AnalyticsServiceImpl) ((AndroidIndirectPointerEvent_androidKt) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 3:
                return new GetCrowdSourcingEntryPointScreenImpl((Vw$Vw) ((PreferenceGroupAdapter) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 4:
                return new Vw$Vw((BrazeExternalSyntheticLambda28) ((AndroidIndirectPointerEvent_androidKt) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 5:
                return new Vw$Vw((sendInputCommandlambda0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (SendTestPushUseCase) ((AndroidIndirectPointerEvent_androidKt) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 6:
                return new Parser.Pair((SendTestPushUseCase) ((executeQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (EnumColumnAdapter) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 7:
                Vw$Vw vw$Vw = new Vw$Vw((DetectFaceWithFirebase) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (OtpLogger) ((executeQuery) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                int i3 = write + 9;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return vw$Vw;
            case 8:
                return new afExternalSyntheticLambda3((afExternalSyntheticOutline0) ((lambda31) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (ErrorSnackbarMessageMapper) ((getDataStoreFileName) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 9:
                return new NetworkBody((BrazeExternalSyntheticLambda28) ((lambdaprocessAndResolveDeeplink15) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (DiskLruCacheEditor) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 10:
                N$b n$b = (N$b) ((isHiddenannotations) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                getSdkEnablementProviderandroid_sdk_base_release getsdkenablementproviderandroid_sdk_base_release = (getSdkEnablementProviderandroid_sdk_base_release) readLicenseVerificationData.serializer.write();
                isOpenInternalroom_runtime isopeninternalroom_runtime = (isOpenInternalroom_runtime) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                n$b.getClass();
                getsdkenablementproviderandroid_sdk_base_release.getClass();
                isopeninternalroom_runtime.getClass();
                C$b c$b = new C$b();
                c$b.serializer = n$b;
                c$b.write = getsdkenablementproviderandroid_sdk_base_release;
                c$b.IconCompatParcelizer = isopeninternalroom_runtime;
                return c$b;
            case 11:
                return new disable((disableCoppaComplianceInDelay) ((r8lambdapkx6kfYbgP4lEOWkebovjPb0ug) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (getFirstErrorCode) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 12:
                return new enablePlayStoreKidsComplianceInDelay((transferSessionPackageI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (a9) ((lambdaprocessAndResolveDeeplink15) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 13:
                return new setOnDeferredDeeplinkResponseListener((getPurchaseVerificationCallback) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (disable) ((PreferenceGroupAdapter) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
            case 14:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                return new GetAppStateImpl((GetRiderStateImpl) objWrite3, (setSubscriptionUrl) ((lambdaverifyPlayStorePurchase45) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write());
            case 15:
                return new getOriginatingPackageName((NetworkBody) ((setSdkAuthenticationSignature) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (BrazeExternalSyntheticLambda28) ((lambdaprocessAndResolveDeeplink15) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), new SharedResourcePool(24));
            case 16:
                r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds r8lambdah04qyyeozrxd4cfrstnkpb99_ds = (r8lambdaH04qYyeOzRXd4CFrSTNkPB99_Ds) ((r8lambdaHmuf48gEQGEdwlHL7mczO1q1bv8) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
                settransactionsuccessful.getClass();
                return new r8lambdaPnQjar0gr6y5YvWKJl7PF6WWjMM(r8lambdah04qyyeozrxd4cfrstnkpb99_ds, settransactionsuccessful);
            default:
                r8lambda3qHeHeNIFAPgIpDR5PEtHuRNY r8lambda3qhehenifapgipdr5pethurny = new r8lambda3qHeHeNIFAPgIpDR5PEtHuRNY((getPivotOffsetF1C5BW0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (subscribeToBannersDismissedEventandroid_sdk_base_release) ((setSdkAuthenticationSignature) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write());
                int i5 = write + 105;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return r8lambda3qhehenifapgipdr5pethurny;
        }
    }
}
