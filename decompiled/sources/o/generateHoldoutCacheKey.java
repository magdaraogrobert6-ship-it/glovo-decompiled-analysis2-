package o;

import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class generateHoldoutCacheKey extends KeyFactorySpi implements getCurrencyCode {
    public final Set write;

    public generateHoldoutCacheKey(Set set) {
        this.write = set;
    }

    @Override // java.security.KeyFactorySpi
    public final PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            UserInfoCompanion userInfoCompanionWrite = UserInfoCompanion.write(((PKCS8EncodedKeySpec) keySpec).getEncoded());
            getNetworkModule getnetworkmodule = userInfoCompanionWrite.serializer.IconCompatParcelizer;
            if (this.write.contains(getnetworkmodule)) {
                return IconCompatParcelizer(userInfoCompanionWrite);
            }
            throw new InvalidKeySpecException("incorrect algorithm OID for key: " + getnetworkmodule);
        } catch (Exception e) {
            UserAgentHeaderInterceptor.write(e);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            UserAgentHeaderInterceptor.write(keySpec, "Unknown key specification: ");
            return null;
        }
        try {
            CustomerChatModule customerChatModule = CustomerChatModule.read(((X509EncodedKeySpec) keySpec).getEncoded());
            getNetworkModule getnetworkmodule = customerChatModule.RemoteActionCompatParcelizer.IconCompatParcelizer;
            if (this.write.contains(getnetworkmodule)) {
                return serializer(customerChatModule);
            }
            throw new InvalidKeySpecException("incorrect algorithm OID for key: " + getnetworkmodule);
        } catch (Exception e) {
            UserAgentHeaderInterceptor.write(e);
            return null;
        }
    }
}
