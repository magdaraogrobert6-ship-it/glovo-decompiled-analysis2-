package com.deliveryhero.fwf_customer_profile;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ShortNewsContentCardView;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerProfileConfig {
    private final AuthProvider authProvider;
    private String globalEntityId;
    private final long profileExpirationTime;
    private final long requestTimeout;
    private final boolean updateProfile;

    public interface AuthProvider {
        Object getJWT(ShortNewsContentCardView<? super String> shortNewsContentCardView);
    }

    public final String component1() {
        return this.globalEntityId;
    }

    public final long component2() {
        return this.requestTimeout;
    }

    public final long component3() {
        return this.profileExpirationTime;
    }

    public final boolean component4() {
        return this.updateProfile;
    }

    public final AuthProvider component5() {
        return this.authProvider;
    }

    public final AuthProvider getAuthProvider() {
        return this.authProvider;
    }

    public final String getGlobalEntityId() {
        return this.globalEntityId;
    }

    public final long getProfileExpirationTime() {
        return this.profileExpirationTime;
    }

    public final long getRequestTimeout() {
        return this.requestTimeout;
    }

    public final boolean getUpdateProfile() {
        return this.updateProfile;
    }

    public int hashCode() {
        return this.authProvider.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.globalEntityId.hashCode() * 31, 31, this.requestTimeout), 31, this.profileExpirationTime), 31, this.updateProfile);
    }

    public final boolean isValid$fwf_client_release() {
        return ConstantsKt.getGlobalEntityIdRegex().read(this.globalEntityId) && this.profileExpirationTime >= 10800;
    }

    public String toString() {
        String str = this.globalEntityId;
        long j = this.requestTimeout;
        long j2 = this.profileExpirationTime;
        boolean z = this.updateProfile;
        AuthProvider authProvider = this.authProvider;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("CustomerProfileConfig(globalEntityId=", str, j, ", requestTimeout=");
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", profileExpirationTime=", j2, ", updateProfile=");
        sbM.append(z);
        sbM.append(", authProvider=");
        sbM.append(authProvider);
        sbM.append(")");
        return sbM.toString();
    }

    public final CustomerProfileConfig copy(String str, long j, long j2, boolean z, AuthProvider authProvider) {
        str.getClass();
        authProvider.getClass();
        return new CustomerProfileConfig(str, j, j2, z, authProvider);
    }

    public final boolean isValidJWT$fwf_client_release(String str) {
        str.getClass();
        return !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) && hideCurrentlyDisplayingInAppMessage.serializer(str, new String[]{"."}, 6).size() == 3;
    }

    public final void setGlobalEntityId(String str) {
        str.getClass();
        this.globalEntityId = str;
    }

    public static /* synthetic */ CustomerProfileConfig copy$default(CustomerProfileConfig customerProfileConfig, String str, long j, long j2, boolean z, AuthProvider authProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerProfileConfig.globalEntityId;
        }
        if ((i & 2) != 0) {
            j = customerProfileConfig.requestTimeout;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = customerProfileConfig.profileExpirationTime;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            z = customerProfileConfig.updateProfile;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            authProvider = customerProfileConfig.authProvider;
        }
        return customerProfileConfig.copy(str, j3, j4, z2, authProvider);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerProfileConfig)) {
            return false;
        }
        CustomerProfileConfig customerProfileConfig = (CustomerProfileConfig) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, customerProfileConfig.globalEntityId}, getCieXyz.write())).booleanValue() || this.requestTimeout != customerProfileConfig.requestTimeout || this.profileExpirationTime != customerProfileConfig.profileExpirationTime || this.updateProfile != customerProfileConfig.updateProfile) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.authProvider, customerProfileConfig.authProvider}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ CustomerProfileConfig(String str, long j, long j2, boolean z, AuthProvider authProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 3000L : j, (i & 4) != 0 ? 86400L : j2, (i & 8) != 0 ? true : z, authProvider);
    }

    public CustomerProfileConfig(String str, long j, long j2, boolean z, AuthProvider authProvider) {
        str.getClass();
        authProvider.getClass();
        this.globalEntityId = str;
        this.requestTimeout = j;
        this.profileExpirationTime = j2;
        this.updateProfile = z;
        this.authProvider = authProvider;
    }
}
