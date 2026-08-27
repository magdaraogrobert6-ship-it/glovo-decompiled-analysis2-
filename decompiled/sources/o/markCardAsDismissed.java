package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.login.presentation.signin.SignInViewModel;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class markCardAsDismissed implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ SignInViewModel IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ markCardAsDismissed(SignInViewModel signInViewModel, int i) {
        this.read = i;
        this.IconCompatParcelizer = signInViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007d  */
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.read;
        SignInViewModel signInViewModel = this.IconCompatParcelizer;
        if (i3 == 0) {
            return ((SemanticsProperties_androidKtSemanticsPropertyKey1) signInViewModel.write).serializer("SignIn VM for decryption");
        }
        isImportantForAccessibilityui isimportantforaccessibilityui = (isImportantForAccessibilityui) ((getMergePolicyui) signInViewModel.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
        SignInDataStore signInDataStore = isimportantforaccessibilityui.IconCompatParcelizer;
        setTextCompositionRangepsREZIo settextcompositionrangepsrezio = (setTextCompositionRangepsREZIo) signInDataStore.read;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) ((transferSessionPackageI) signInDataStore.serializer);
        firebaseRemoteConfigImpl.getClass();
        boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_BIOMETRICS_ENABLED);
        if (((showTextSubstitution) signInDataStore.RemoteActionCompatParcelizer).IconCompatParcelizer() && zIconCompatParcelizer) {
            int i4 = write + 55;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                settextcompositionrangepsrezio.RemoteActionCompatParcelizer().contains("SHARED_PREF_BIOMETRIC_PASSWORD");
                obj.hashCode();
                throw null;
            }
            if (!settextcompositionrangepsrezio.RemoteActionCompatParcelizer().contains("SHARED_PREF_BIOMETRIC_PASSWORD") || (!settextcompositionrangepsrezio.serializer())) {
                isimportantforaccessibilityui.RemoteActionCompatParcelizer.IconCompatParcelizer();
                int i5 = RemoteActionCompatParcelizer + 27;
                write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Launching decryption flow", new Object[0]);
                isimportantforaccessibilityui.read.serializer(SemanticsPropertyReceiver.serializer);
            }
        } else {
            isimportantforaccessibilityui.RemoteActionCompatParcelizer.IconCompatParcelizer();
            int i7 = RemoteActionCompatParcelizer + 27;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        return createFromParcel.INSTANCE;
    }
}
