package o;

/* JADX INFO: loaded from: classes2.dex */
public enum IntrinsicsPolicy {
    ALGORITHM_NOT_FIPS { // from class: o.IntrinsicsPolicy.2
        @Override // o.IntrinsicsPolicy
        public boolean isCompatible() {
            return !getLayoutNode.IconCompatParcelizer();
        }
    },
    ALGORITHM_REQUIRES_BORINGCRYPTO { // from class: o.IntrinsicsPolicy.4
        @Override // o.IntrinsicsPolicy
        public boolean isCompatible() {
            Boolean bool;
            if (getLayoutNode.IconCompatParcelizer()) {
                try {
                    bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                } catch (Exception unused) {
                    getLayoutNode.IconCompatParcelizer.info("Conscrypt is not available or does not support checking for FIPS build.");
                    bool = Boolean.FALSE;
                }
                if (!bool.booleanValue()) {
                    return false;
                }
            }
            return true;
        }
    };

    public abstract boolean isCompatible();
}
