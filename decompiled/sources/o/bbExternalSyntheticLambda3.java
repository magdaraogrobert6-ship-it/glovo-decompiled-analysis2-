package o;

import com.roadrunner.login.presentation.otp.OtpViewModel;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bbExternalSyntheticLambda3 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ OtpViewModel serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ bbExternalSyntheticLambda3(OtpViewModel otpViewModel, int i) {
        this.write = i;
        this.serializer = otpViewModel;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        boolean z;
        int i = 2 % 2;
        int i2 = read + 21;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        OtpViewModel otpViewModel = this.serializer;
        if (i4 != 0) {
            BrazeLogger brazeLogger = otpViewModel.MediaMetadataCompat;
            brazeLogger.getClass();
            brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(bbExternalSyntheticLambda0.IconCompatParcelizer((bbExternalSyntheticLambda0) brazeLogger.write(), null, false, true, false, 23));
            return createfromparcel;
        }
        RectListDebuggerModifierNode rectListDebuggerModifierNode = (RectListDebuggerModifierNode) obj;
        rectListDebuggerModifierNode.getClass();
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) otpViewModel.IconCompatParcelizer;
        firebaseRemoteConfigImpl.getClass();
        if (firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_PERSIST_TIMER_IN_RESET_PASSWORD_ENABLED) || !(!rectListDebuggerModifierNode.serializer)) {
            z = false;
        } else {
            int i5 = IconCompatParcelizer + 29;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            z = true;
        }
        int i7 = read + 107;
        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        BrazeLogger brazeLogger2 = otpViewModel.MediaMetadataCompat;
        brazeLogger2.getClass();
        brazeLogger2.IconCompatParcelizer.RemoteActionCompatParcelizer(bbExternalSyntheticLambda0.IconCompatParcelizer((bbExternalSyntheticLambda0) brazeLogger2.write(), rectListDebuggerModifierNode, false, false, z, 13));
        return createfromparcel;
    }
}
