package o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getCacheable implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 serializer;
    public final /* synthetic */ minIntrinsicWidth[] write;

    public /* synthetic */ getCacheable(minIntrinsicWidth[] minintrinsicwidthArr, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.read = i;
        this.write = minintrinsicwidthArr;
        this.serializer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.read;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.serializer;
        minIntrinsicWidth[] minintrinsicwidthArr = this.write;
        getPersonNamePrefix getpersonnameprefix = (getPersonNamePrefix) obj;
        if (i3 == 0) {
            getpersonnameprefix.getClass();
            return new addVisibleLineBounds(minintrinsicwidthArr, populateViewStructure_androidKtpopulate7, 0);
        }
        getpersonnameprefix.getClass();
        addVisibleLineBounds addvisiblelinebounds = new addVisibleLineBounds(minintrinsicwidthArr, populateViewStructure_androidKtpopulate7, 1);
        int i4 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return addvisiblelinebounds;
        }
        throw null;
    }
}
