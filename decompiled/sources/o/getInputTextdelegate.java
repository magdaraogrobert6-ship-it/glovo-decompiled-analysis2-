package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.roadrunner.auth.domain.ConflictingLogoutStatesException;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getInputTextdelegate implements getInputText {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final SemanticsPropertiesTestTag1 RemoteActionCompatParcelizer;
    public final AuthStateMachine serializer;
    public final transferSessionPackageI write;

    public getInputTextdelegate(SemanticsPropertiesTestTag1 semanticsPropertiesTestTag1, AuthStateMachine authStateMachine, transferSessionPackageI transfersessionpackagei) {
        semanticsPropertiesTestTag1.getClass();
        authStateMachine.getClass();
        transfersessionpackagei.getClass();
        this.RemoteActionCompatParcelizer = semanticsPropertiesTestTag1;
        this.serializer = authStateMachine;
        this.write = transfersessionpackagei;
    }

    public final boolean read(String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 75;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zWrite = ((FirebaseRemoteConfigImpl) this.write).write();
        SemanticsPropertiesTestTag1 semanticsPropertiesTestTag1 = this.RemoteActionCompatParcelizer;
        boolean zSerializer = semanticsPropertiesTestTag1.serializer();
        AuthStateMachine authStateMachine = this.serializer;
        boolean zIconCompatParcelizer = authStateMachine.IconCompatParcelizer();
        if (zSerializer != zIconCompatParcelizer) {
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            StringBuilder sbM = af$$ExternalSyntheticOutline0.m("2.0. Logout states are conflicting. Called from: ", str, ". Flag is: ", ", LogoutProvider is started value: ", zWrite);
            sbM.append(zSerializer);
            sbM.append(", AuthStateMachine is started value: ");
            sbM.append(zIconCompatParcelizer);
            forest.write(new ConflictingLogoutStatesException(sbM.toString()));
        }
        if (!zWrite) {
            return semanticsPropertiesTestTag1.serializer();
        }
        int i4 = read + 121;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            authStateMachine.IconCompatParcelizer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIconCompatParcelizer2 = authStateMachine.IconCompatParcelizer();
        int i5 = IconCompatParcelizer + 29;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return zIconCompatParcelizer2;
    }
}
