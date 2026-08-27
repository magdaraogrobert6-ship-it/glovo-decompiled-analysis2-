package o;

import com.sentiance.core.model.events.E$b;

/* JADX INFO: loaded from: classes3.dex */
public final class getRegistrationDataProviderandroid_sdk_base_release implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final mergeJsonObjects read;
    public final /* synthetic */ int serializer;
    public final isContainerannotations write;

    public /* synthetic */ getRegistrationDataProviderandroid_sdk_base_release(isContainerannotations iscontainerannotations, setPresentationView setpresentationview, int i) {
        this.serializer = i;
        this.write = iscontainerannotations;
        this.read = setpresentationview;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        mergeJsonObjects mergejsonobjects = this.read;
        isContainerannotations iscontainerannotations = this.write;
        if (i4 != 0) {
            return new getConfigurationProviderSafeandroid_sdk_base_release((E$b) iscontainerannotations.write(), (getSdkEnablementProviderandroid_sdk_base_release) getFeatureFlag.RemoteActionCompatParcelizer.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
        }
        getRegisteredPushToken getregisteredpushtoken = new getRegisteredPushToken((E$b) iscontainerannotations.write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
        int i5 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return getregisteredpushtoken;
    }
}
