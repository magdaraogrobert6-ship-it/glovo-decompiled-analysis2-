package o;

import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.data.ExecuteTwoFaApiRequest;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.common.data.api.MapApiError;
import com.roadrunner.customerchat.legacy.core.usecases.PhoneNumberUseCase;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.rider.state.domain.GetRiderStateImpl;
import io.grpc.CallOptions$Builder;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class SemanticsPropertiesInvisibleToUser1 implements getColorIntegerOrNulllambda0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final /* synthetic */ int serializer;
    public final mergeJsonObjects write;

    public /* synthetic */ SemanticsPropertiesInvisibleToUser1(int i, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5) {
        this.serializer = i;
        this.write = mergejsonobjects;
        this.RemoteActionCompatParcelizer = mergejsonobjects2;
        this.MediaMetadataCompat = mergejsonobjects3;
        this.MediaDescriptionCompat = getcolorintegerornulllambda0;
        this.IconCompatParcelizer = mergejsonobjects4;
        this.MediaSessionCompatQueueItem = mergejsonobjects5;
        this.read = getcolorintegerornulllambda1;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 117;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        mergeJsonObjects mergejsonobjects = this.read;
        mergeJsonObjects mergejsonobjects2 = this.MediaSessionCompatQueueItem;
        mergeJsonObjects mergejsonobjects3 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects4 = this.MediaDescriptionCompat;
        mergeJsonObjects mergejsonobjects5 = this.MediaMetadataCompat;
        mergeJsonObjects mergejsonobjects6 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects7 = this.write;
        if (i4 == 0) {
            AuthRepository authRepository = new AuthRepository((SemanticsPropertiesHideFromAccessibility1) mergejsonobjects7.write(), (ExecuteApiRequest) mergejsonobjects6.write(), (LocalAuthDataSource) mergejsonobjects5.write(), (withRect) mergejsonobjects4.write(), (lottieComposition) mergejsonobjects3.write(), new MapApiError(), (transferSessionPackageI) mergejsonobjects2.write(), (ExecuteTwoFaApiRequest) mergejsonobjects.write());
            int i5 = MediaBrowserCompatMediaItem + 23;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return authRepository;
        }
        if (i4 == 1) {
            return new registerOnGlobalChange((forEachNewCallbackNeverInvoked) mergejsonobjects7.write(), (getHasNonTranslationComponents) mergejsonobjects6.write(), (transferSessionPackageI) mergejsonobjects5.write(), (PhoneNumberUseCase) mergejsonobjects4.write(), (getPlatformStyle) mergejsonobjects3.write(), (localeSpan) mergejsonobjects2.write(), (Clock) mergejsonobjects.write());
        }
        OpportunitiesRepository opportunitiesRepository = (OpportunitiesRepository) mergejsonobjects7.write();
        setLastHorizontalStyle setlasthorizontalstyle = (setLastHorizontalStyle) mergejsonobjects6.write();
        GetRiderStateImpl getRiderStateImpl = (GetRiderStateImpl) mergejsonobjects5.write();
        vd vdVar = (vd) mergejsonobjects4.write();
        v4 v4Var = (v4) mergejsonobjects3.write();
        getActionList getactionlist = (getActionList) mergejsonobjects2.write();
        o7 o7Var = (o7) mergejsonobjects.write();
        AndroidUiFrameClock androidUiFrameClock = new AndroidUiFrameClock();
        opportunitiesRepository.getClass();
        setlasthorizontalstyle.getClass();
        getRiderStateImpl.getClass();
        vdVar.getClass();
        v4Var.getClass();
        getactionlist.getClass();
        o7Var.getClass();
        CallOptions$Builder callOptions$Builder = new CallOptions$Builder();
        callOptions$Builder.serializer = opportunitiesRepository;
        callOptions$Builder.RemoteActionCompatParcelizer = setlasthorizontalstyle;
        callOptions$Builder.read = getRiderStateImpl;
        callOptions$Builder.write = vdVar;
        callOptions$Builder.MediaMetadataCompat = v4Var;
        callOptions$Builder.RatingCompat = getactionlist;
        callOptions$Builder.IconCompatParcelizer = o7Var;
        callOptions$Builder.MediaSessionCompatQueueItem = androidUiFrameClock;
        return callOptions$Builder;
    }
}
