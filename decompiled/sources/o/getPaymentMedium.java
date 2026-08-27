package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.security.AccessController;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class getPaymentMedium extends java.security.Provider {
    public static final String[] IconCompatParcelizer;
    public static final String[] MediaBrowserCompatMediaItem;
    public static final String[] MediaDescriptionCompat;
    public static final r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k[] MediaMetadataCompat;
    public static final String[] MediaSessionCompatQueueItem;
    public static final Class MediaSessionCompatResultReceiverWrapper;
    public static final HashMap PlaybackStateCompatCustomAction;
    public static final String[] RemoteActionCompatParcelizer;
    public static final String[] serializer;
    public static final String[] write;
    public final ConcurrentHashMap PlaybackStateCompat;
    public static final java.util.logging.Logger read = java.util.logging.Logger.getLogger(getPaymentMedium.class.getName());
    public static final String RatingCompat = "BouncyCastle Security Provider v1.78.1";

    public static void read(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            serializer(str, strArr[i]);
        }
    }

    static {
        Class<?> clsLoadClass;
        new ThreadLocal();
        new ThreadLocal();
        new HashSet();
        new HashMap();
        PlaybackStateCompatCustomAction = new HashMap();
        try {
            ClassLoader classLoader = getPaymentMedium.class.getClassLoader();
            clsLoadClass = classLoader != null ? classLoader.loadClass("java.security.cert.PKIXRevocationChecker") : (Class) AccessController.doPrivileged(new bootstrapIfNeeded(1, "java.security.cert.PKIXRevocationChecker"));
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        MediaSessionCompatResultReceiverWrapper = clsLoadClass;
        MediaSessionCompatQueueItem = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        MediaDescriptionCompat = new String[]{"SipHash", "SipHash128", "Poly1305"};
        int i = 16;
        MediaMetadataCompat = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k[]{new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("AES", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("ARC4", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("ARIA", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Blowfish", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Camellia", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("CAST5", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("CAST6", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("ChaCha", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("DES", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("DESede", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("GOST28147", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Grainv1", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Grain128", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("HC128", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("HC256", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("IDEA", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Noekeon", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("RC2", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("RC5", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("RC6", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Rijndael", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Salsa20", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("SEED", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Serpent", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Shacal2", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Skipjack", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("SM4", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("TEA", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Twofish", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Threefish", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("VMPC", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("VMPCKSA3", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("XTEA", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("XSalsa20", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("OpenSSLPBKDF", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("DSTU7624", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("GOST3412_2015", i), new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k("Zuc", i)};
        write = new String[]{"X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures"};
        RemoteActionCompatParcelizer = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU"};
        serializer = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        IconCompatParcelizer = new String[]{"BC", "BCFKS", "PKCS12"};
        MediaBrowserCompatMediaItem = new String[]{"DRBG"};
    }

    public static void serializer(String str, String str2) {
        Class<?> clsLoadClass;
        String strM = af$$ExternalSyntheticOutline0.m(str, str2, "$Mappings");
        try {
            ClassLoader classLoader = getPaymentMedium.class.getClassLoader();
            clsLoadClass = classLoader != null ? classLoader.loadClass(strM) : (Class) AccessController.doPrivileged(new bootstrapIfNeeded(1, strM));
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        if (clsLoadClass == null) {
            return;
        }
        try {
            clsLoadClass.newInstance().getClass();
            throw new ClassCastException();
        } catch (Exception e) {
            throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e);
        }
    }

    public static void serializer(getNetworkModule getnetworkmodule, getCurrencyCode getcurrencycode) {
        HashMap map = PlaybackStateCompatCustomAction;
        synchronized (map) {
            map.put(getnetworkmodule, getcurrencycode);
        }
    }

    public getPaymentMedium() {
        super("BC", 1.7801d, RatingCompat);
        this.PlaybackStateCompat = new ConcurrentHashMap();
        AccessController.doPrivileged(new bootstrapIfNeeded(4, this));
    }

    @Override // java.security.Provider
    public final java.security.Provider.Service getService(String str, String str2) {
        java.security.Provider.Service service;
        String strM = af$$ExternalSyntheticOutline0.m(str, ".", evaluateFeaturefwf_client_releasedefault.IconCompatParcelizer(str2));
        java.security.Provider.Service service2 = (java.security.Provider.Service) this.PlaybackStateCompat.get(strM);
        if (service2 != null) {
            return service2;
        }
        synchronized (this) {
            service = (java.security.Provider.Service) (!this.PlaybackStateCompat.containsKey(strM) ? AccessController.doPrivileged(new ProductJsonAdapter(this, str, str2, strM)) : this.PlaybackStateCompat.get(strM));
        }
        return service;
    }
}
