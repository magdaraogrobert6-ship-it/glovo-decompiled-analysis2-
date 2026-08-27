package o;

/* JADX INFO: loaded from: classes.dex */
public final class onLayoutNodeDeactivatedui implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ String read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ setRootAutofillId write;

    public onLayoutNodeDeactivatedui(long j, setRootAutofillId setrootautofillid, String str) {
        this.serializer = j;
        this.write = setrootautofillid;
        this.read = str;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            SwitchDefaults switchDefaults = androidx.compose.material3.ButtonDefaults.serializer;
            androidx.compose.ui.graphics.Color.Companion companion = androidx.compose.ui.graphics.Color.Companion;
            long jM758getUnspecified0d7_KjU = companion.m758getUnspecified0d7_KjU();
            long jM758getUnspecified0d7_KjU2 = companion.m758getUnspecified0d7_KjU();
            long jM758getUnspecified0d7_KjU3 = companion.m758getUnspecified0d7_KjU();
            getViewingDistancetKroMQ getviewingdistancetkromq = (getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer);
            androidx.compose.material3.ButtonColors buttonColors = getviewingdistancetkromq.MediaBrowserCompatMediaItem;
            if (buttonColors == null) {
                androidx.compose.ui.graphics.Color.Companion companion2 = androidx.compose.ui.graphics.Color.Companion;
                buttonColors = new androidx.compose.material3.ButtonColors(companion2.m757getTransparent0d7_KjU(), getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, getChildren.Primary), companion2.m757getTransparent0d7_KjU(), androidx.compose.ui.graphics.Color.m721copywmQWz5c$default(getWindowPosturem18o9QQ.serializer(getviewingdistancetkromq, ContentDataType_androidKt.RemoteActionCompatParcelizer()), ContentDataType_androidKt.IconCompatParcelizer(), 0.0f, 0.0f, 0.0f, 14, null));
                getviewingdistancetkromq.MediaBrowserCompatMediaItem = buttonColors;
            }
            androidx.compose.material3.ButtonColors buttonColorsM113copyjRlVdoo = buttonColors.m113copyjRlVdoo(jM758getUnspecified0d7_KjU, this.serializer, jM758getUnspecified0d7_KjU2, jM758getUnspecified0d7_KjU3);
            setRootAutofillId setrootautofillid = this.write;
            boolean z = getpostalcode.read(setrootautofillid);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new onPostAttachui(setrootautofillid, 0);
                getpostalcode.write(objComponentActivity);
            }
            androidx.compose.material3.ButtonKt.read((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, null, false, null, buttonColorsM113copyjRlVdoo, null, null, coil3.ExtrasKt.write(521110564, new AndroidAutofill_androidKt(i, this.read), getpostalcode), getpostalcode, 805306368, 494);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
