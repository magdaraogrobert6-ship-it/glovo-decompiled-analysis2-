package o;

import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPathMeasure_androidKt implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ cubicTo IconCompatParcelizer;
    public final /* synthetic */ PathMeasure RemoteActionCompatParcelizer;
    public final /* synthetic */ setPath read;
    public final /* synthetic */ AlphaKt serializer;
    public final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList write;

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getPostalCode getpostalcode;
        cubicTo cubicto;
        boolean zIconCompatParcelizer;
        setPath setpath;
        boolean zIconCompatParcelizer2;
        Object objComponentActivity;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
            if (getpostalcode2.MediaSessionCompatToken()) {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            } else {
                getpostalcode = (getPostalCode) getbirthdatefull;
                cubicto = this.IconCompatParcelizer;
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(cubicto);
                setpath = this.read;
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(setpath);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(this.write, cubicto, setpath, 20);
                    getpostalcode.write(objComponentActivity);
                }
                getPhoneNumberNational.serializer(cubicto, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
                getTangenttuRUvjQ.serializer(cubicto, this.serializer, coil3.ExtrasKt.write(-497631156, new AndroidPath_androidKtWhenMappings(this.RemoteActionCompatParcelizer, cubicto), getpostalcode), getpostalcode, 384);
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            cubicto = this.IconCompatParcelizer;
            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(cubicto);
            setpath = this.read;
            zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(setpath);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer && !zIconCompatParcelizer2) {
                objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(this.write, cubicto, setpath, 20);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(this.write, cubicto, setpath, 20);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.serializer(cubicto, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
            getTangenttuRUvjQ.serializer(cubicto, this.serializer, coil3.ExtrasKt.write(-497631156, new AndroidPath_androidKtWhenMappings(this.RemoteActionCompatParcelizer, cubicto), getpostalcode), getpostalcode, 384);
        }
        return createFromParcel.INSTANCE;
    }

    public AndroidPathMeasure_androidKt(cubicTo cubicto, setPath setpath, BlockDropShadowNode blockDropShadowNode, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, PathMeasure pathMeasure) {
        this.IconCompatParcelizer = cubicto;
        this.read = setpath;
        this.serializer = blockDropShadowNode;
        this.write = snapshotStateList;
        this.RemoteActionCompatParcelizer = pathMeasure;
    }
}
