package o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class getNestedCoroutineScope {
    public static final getNestedCoroutineScope zza;
    public static final getNestedCoroutineScope zzb;
    public static final getNestedCoroutineScope zzc;
    public static final getNestedCoroutineScope zzd;
    public static final getNestedCoroutineScope zze;
    public static final getNestedCoroutineScope zzf;
    public static final getNestedCoroutineScope zzg;
    public static final getNestedCoroutineScope zzh;
    public static final getNestedCoroutineScope zzi;
    public static final getNestedCoroutineScope zzj;
    public static final getNestedCoroutineScope zzk;
    public static final getNestedCoroutineScope zzl;
    public static final getNestedCoroutineScope zzm;
    public static final getNestedCoroutineScope zzn;
    public static final getNestedCoroutineScope zzo;
    public static final getNestedCoroutineScope zzp;
    public static final getNestedCoroutineScope zzq;
    public static final getNestedCoroutineScope zzr;
    private static final /* synthetic */ getNestedCoroutineScope[] zzu;
    private final getParentConnection zzs;
    private final int zzt;

    public final getParentConnection zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }

    static {
        getNestedCoroutineScope getnestedcoroutinescope = new getNestedCoroutineScope("DOUBLE", 0, getParentConnection.DOUBLE, 1);
        zza = getnestedcoroutinescope;
        getNestedCoroutineScope getnestedcoroutinescope2 = new getNestedCoroutineScope("FLOAT", 1, getParentConnection.FLOAT, 5);
        zzb = getnestedcoroutinescope2;
        getParentConnection getparentconnection = getParentConnection.LONG;
        getNestedCoroutineScope getnestedcoroutinescope3 = new getNestedCoroutineScope("INT64", 2, getparentconnection, 0);
        zzc = getnestedcoroutinescope3;
        getNestedCoroutineScope getnestedcoroutinescope4 = new getNestedCoroutineScope("UINT64", 3, getparentconnection, 0);
        zzd = getnestedcoroutinescope4;
        getParentConnection getparentconnection2 = getParentConnection.INT;
        getNestedCoroutineScope getnestedcoroutinescope5 = new getNestedCoroutineScope("INT32", 4, getparentconnection2, 0);
        zze = getnestedcoroutinescope5;
        getNestedCoroutineScope getnestedcoroutinescope6 = new getNestedCoroutineScope("FIXED64", 5, getparentconnection, 1);
        zzf = getnestedcoroutinescope6;
        getNestedCoroutineScope getnestedcoroutinescope7 = new getNestedCoroutineScope("FIXED32", 6, getparentconnection2, 5);
        zzg = getnestedcoroutinescope7;
        getNestedCoroutineScope getnestedcoroutinescope8 = new getNestedCoroutineScope("BOOL", 7, getParentConnection.BOOLEAN, 0);
        zzh = getnestedcoroutinescope8;
        getNestedCoroutineScope getnestedcoroutinescope9 = new getNestedCoroutineScope("STRING", 8, getParentConnection.STRING, 2);
        zzi = getnestedcoroutinescope9;
        getParentConnection getparentconnection3 = getParentConnection.MESSAGE;
        getNestedCoroutineScope getnestedcoroutinescope10 = new getNestedCoroutineScope("GROUP", 9, getparentconnection3, 3);
        zzj = getnestedcoroutinescope10;
        getNestedCoroutineScope getnestedcoroutinescope11 = new getNestedCoroutineScope("MESSAGE", 10, getparentconnection3, 2);
        zzk = getnestedcoroutinescope11;
        getNestedCoroutineScope getnestedcoroutinescope12 = new getNestedCoroutineScope("BYTES", 11, getParentConnection.BYTE_STRING, 2);
        zzl = getnestedcoroutinescope12;
        getNestedCoroutineScope getnestedcoroutinescope13 = new getNestedCoroutineScope("UINT32", 12, getparentconnection2, 0);
        zzm = getnestedcoroutinescope13;
        getNestedCoroutineScope getnestedcoroutinescope14 = new getNestedCoroutineScope("ENUM", 13, getParentConnection.ENUM, 0);
        zzn = getnestedcoroutinescope14;
        getNestedCoroutineScope getnestedcoroutinescope15 = new getNestedCoroutineScope("SFIXED32", 14, getparentconnection2, 5);
        zzo = getnestedcoroutinescope15;
        getNestedCoroutineScope getnestedcoroutinescope16 = new getNestedCoroutineScope("SFIXED64", 15, getparentconnection, 1);
        zzp = getnestedcoroutinescope16;
        getNestedCoroutineScope getnestedcoroutinescope17 = new getNestedCoroutineScope("SINT32", 16, getparentconnection2, 0);
        zzq = getnestedcoroutinescope17;
        getNestedCoroutineScope getnestedcoroutinescope18 = new getNestedCoroutineScope("SINT64", 17, getparentconnection, 0);
        zzr = getnestedcoroutinescope18;
        zzu = new getNestedCoroutineScope[]{getnestedcoroutinescope, getnestedcoroutinescope2, getnestedcoroutinescope3, getnestedcoroutinescope4, getnestedcoroutinescope5, getnestedcoroutinescope6, getnestedcoroutinescope7, getnestedcoroutinescope8, getnestedcoroutinescope9, getnestedcoroutinescope10, getnestedcoroutinescope11, getnestedcoroutinescope12, getnestedcoroutinescope13, getnestedcoroutinescope14, getnestedcoroutinescope15, getnestedcoroutinescope16, getnestedcoroutinescope17, getnestedcoroutinescope18};
    }

    public static getNestedCoroutineScope[] values() {
        return (getNestedCoroutineScope[]) zzu.clone();
    }

    private getNestedCoroutineScope(String str, int i, getParentConnection getparentconnection, int i2) {
        super(str, i);
        this.zzs = getparentconnection;
        this.zzt = i2;
    }
}
