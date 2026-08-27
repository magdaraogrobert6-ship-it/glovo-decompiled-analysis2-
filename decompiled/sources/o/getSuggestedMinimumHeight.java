package o;

import com.mapbox.api.directions.v5.models.C$AutoValue_MapboxShield;
import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import com.roadrunner.face.verification.presentation.IdentityVerificationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getSuggestedMinimumHeight implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ IdentityVerificationParams read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ IdentityVerificationActivity write;

    public /* synthetic */ getSuggestedMinimumHeight(IdentityVerificationActivity identityVerificationActivity, IdentityVerificationParams identityVerificationParams, int i) {
        this.serializer = i;
        this.write = identityVerificationActivity;
        this.read = identityVerificationParams;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        IdentityVerificationParams identityVerificationParams = this.read;
        IdentityVerificationActivity identityVerificationActivity = this.write;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (i4 != 0) {
            return IdentityVerificationActivity.IconCompatParcelizer(identityVerificationActivity, identityVerificationParams, getbirthdatefull, iIntValue);
        }
        createFromParcel createfromparcel = (createFromParcel) IdentityVerificationActivity.IconCompatParcelizer(new Object[]{identityVerificationActivity, identityVerificationParams, getbirthdatefull, Integer.valueOf(iIntValue)}, C$AutoValue_MapboxShield.write(), 1499772340, C$AutoValue_MapboxShield.write(), -1499772340, C$AutoValue_MapboxShield.write(), C$AutoValue_MapboxShield.write());
        int i5 = IconCompatParcelizer + 89;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return createfromparcel;
        }
        throw null;
    }
}
