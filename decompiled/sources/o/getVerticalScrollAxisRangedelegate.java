package o;

import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.domain.CompleteIdentityVerificationUseCaseImpl;
import com.roadrunner.auth.domain.GetUserAuthenticationStateUseCaseImpl;
import com.roadrunner.auth.domain.ProcessSuccessfulSignInUseCase;
import com.roadrunner.auth.domain.SaveAuthDataUseCase;
import com.roadrunner.auth.domain.VerifyTwoFaUseCaseImpl;
import com.roadrunner.auth.domain.WebRefreshAccessTokenUseCaseImpl;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getVerticalScrollAxisRangedelegate implements getColorIntegerOrNulllambda0 {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getVerticalScrollAxisRangedelegate(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, int i) {
        this.write = i;
        this.read = mergejsonobjects;
        this.serializer = mergejsonobjects2;
        this.IconCompatParcelizer = mergejsonobjects3;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        mergeJsonObjects mergejsonobjects = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects2 = this.serializer;
        mergeJsonObjects mergejsonobjects3 = this.read;
        if (i4 == 0) {
            return new VerifyTwoFaUseCaseImpl((ProcessSuccessfulSignInUseCase) mergejsonobjects3.write(), (AuthRepository) mergejsonobjects2.write(), (IncogniaManagerImpl) mergejsonobjects.write());
        }
        if (i4 == 1) {
            return new CompleteIdentityVerificationUseCaseImpl((AuthRepository) mergejsonobjects3.write(), (SaveAuthDataUseCase) mergejsonobjects2.write(), (getCustomActionsdelegate) mergejsonobjects.write());
        }
        if (i4 == 2) {
            return new GetUserAuthenticationStateUseCaseImpl((AuthRepository) mergejsonobjects3.write(), (getCustomActionsdelegate) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
        }
        if (i4 == 3) {
            getInputTextdelegate getinputtextdelegate = new getInputTextdelegate((SemanticsPropertiesTestTag1) mergejsonobjects3.write(), (AuthStateMachine) mergejsonobjects2.write(), (transferSessionPackageI) mergejsonobjects.write());
            int i5 = MediaSessionCompatQueueItem + 71;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 13 / 0;
            }
            return getinputtextdelegate;
        }
        WebRefreshAccessTokenUseCaseImpl webRefreshAccessTokenUseCaseImpl = new WebRefreshAccessTokenUseCaseImpl((AuthRepository) mergejsonobjects3.write(), (toNativeBlendMode) mergejsonobjects2.write(), (IncogniaManagerImpl) mergejsonobjects.write());
        int i7 = MediaSessionCompatQueueItem + 121;
        RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return webRefreshAccessTokenUseCaseImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
