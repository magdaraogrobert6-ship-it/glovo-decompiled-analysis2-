package o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeviceKey {
    public static final r8lambdaHxndgEp3NZAe65egvieVRgKrMSA serializer;
    public static final r8lambdaHxndgEp3NZAe65egvieVRgKrMSA write = new r8lambdaHxndgEp3NZAe65egvieVRgKrMSA();

    static {
        r8lambdaHxndgEp3NZAe65egvieVRgKrMSA r8lambdahxndgep3nzae65egvievrgkrmsa = null;
        try {
            r8lambdahxndgep3nzae65egvievrgkrmsa = (r8lambdaHxndgEp3NZAe65egvieVRgKrMSA) Class.forName("com.sentiance.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        serializer = r8lambdahxndgep3nzae65egvievrgkrmsa;
    }
}
