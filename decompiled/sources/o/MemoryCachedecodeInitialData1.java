package o;

import java.security.AccessController;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class MemoryCachedecodeInitialData1 extends java.security.Provider {
    public static final String[] IconCompatParcelizer;

    static {
        new HashMap();
        IconCompatParcelizer = new String[]{"SPHINCS", "LMS", "NH", "XMSS", "SPHINCSPlus", "CMCE", "Frodo", "SABER", "Picnic", "NTRU", "Falcon", "Kyber", "Dilithium", "NTRUPrime", "BIKE", "HQC", "Rainbow"};
    }

    public MemoryCachedecodeInitialData1() {
        super("BCPQC", 1.7801d, "BouncyCastle Post-Quantum Security Provider v1.78.1");
        AccessController.doPrivileged(new accessupdateFeatures(this));
    }
}
