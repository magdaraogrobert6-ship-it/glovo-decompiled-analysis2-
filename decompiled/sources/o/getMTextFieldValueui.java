package o;

import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getMTextFieldValueui implements KeyboardCapitalization {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final SignInDataStore IconCompatParcelizer;

    public getMTextFieldValueui(SignInDataStore signInDataStore) {
        this.IconCompatParcelizer = signInDataStore;
    }

    public static getDoubleOrNull serializer(SignInDataStore signInDataStore) {
        int i = 2 % 2;
        getDoubleOrNull getdoubleornullWrite = getDoubleOrNull.write(new getMTextFieldValueui(signInDataStore));
        int i2 = write + 75;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return getdoubleornullWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final sendSynthesizedKeyEvent read(ContextScope contextScope) {
        int i = 2 % 2;
        SignInDataStore signInDataStore = this.IconCompatParcelizer;
        sendSynthesizedKeyEvent sendsynthesizedkeyevent = new sendSynthesizedKeyEvent((transferSessionPackageI) ((mergeJsonObjects) signInDataStore.serializer).write(), contextScope, new getQueryContext(), (SignInDataStore) ((applyLayoutFeatures) signInDataStore.RemoteActionCompatParcelizer).write(), (GetCrowdSourcingEntryPointScreenImpl) ((mergeJsonObjects) signInDataStore.read).write());
        int i2 = RemoteActionCompatParcelizer + 97;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return sendsynthesizedkeyevent;
        }
        throw null;
    }
}
