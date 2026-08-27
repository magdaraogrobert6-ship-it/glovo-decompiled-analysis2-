package o;

/* JADX INFO: loaded from: classes.dex */
public final class accessisWideGamut {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public static final accessisWideGamut serializer = new accessisWideGamut(0);
    public static final accessisWideGamut read = new accessisWideGamut(1);
    public static final accessisWideGamut IconCompatParcelizer = new accessisWideGamut(2);

    public /* synthetic */ accessisWideGamut(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public final boolean read(r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I r8lambdayjgjsam_wcskwad6z3tn2h9p74i) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return false;
        }
        if (i != 1) {
            return r8lambdayjgjsam_wcskwad6z3tn2h9p74i == r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.REMOTE;
        }
        return (r8lambdayjgjsam_wcskwad6z3tn2h9p74i == r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.DATA_DISK_CACHE || r8lambdayjgjsam_wcskwad6z3tn2h9p74i == r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I.MEMORY_CACHE) ? false : true;
    }
}
