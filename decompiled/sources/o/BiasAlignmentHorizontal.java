package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BiasAlignmentHorizontal implements r8lambdagdus9EWsajL31FKA79xR2Pb0c4E {
    public final /* synthetic */ int IconCompatParcelizer;

    @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
    public final Object serializer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i3 == 0) {
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            androidx.compose.ui.text.TextRange textRange = (androidx.compose.ui.text.TextRange) obj5;
            String string = ((CharSequence) obj4).subSequence(androidx.compose.ui.text.TextRange.m3074getMinimpl(textRange.m3080unboximpl()), androidx.compose.ui.text.TextRange.m3073getMaximpl(textRange.m3080unboximpl())).toString();
            Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
            ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
            Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
            className.putExtra("android.intent.extra.PROCESS_TEXT", string);
            ((Context) obj).startActivity(className);
            return createfromparcel;
        }
        int i4 = androidx.compose.ui.graphics.Fields.RotationX;
        if (i3 != 1) {
            ComposedModifierKt composedModifierKt = (ComposedModifierKt) obj;
            hashCodeimpl hashcodeimpl = (hashCodeimpl) obj2;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj4;
            int iIntValue = ((Integer) obj5).intValue();
            if ((iIntValue & 6) == 0) {
                i2 = iIntValue | ((iIntValue & 8) == 0 ? ((getPostalCode) getbirthdatefull).read(composedModifierKt) : ((getPostalCode) getbirthdatefull).IconCompatParcelizer(composedModifierKt) ? 4 : 2);
            } else {
                i2 = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i2 |= (iIntValue & 64) == 0 ? ((getPostalCode) getbirthdatefull).read(hashcodeimpl) : ((getPostalCode) getbirthdatefull).IconCompatParcelizer(hashcodeimpl) ? 32 : 16;
            }
            if ((iIntValue & 384) == 0) {
                if (!((getPostalCode) getbirthdatefull).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i4 = 128;
                }
                i2 |= i4;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
                materialize.RemoteActionCompatParcelizer(composedModifierKt, hashcodeimpl, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, i2 & 1022);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        ComposedModifierKt composedModifierKt2 = (ComposedModifierKt) obj;
        hashCodeimpl hashcodeimpl2 = (hashCodeimpl) obj2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj4;
        int iIntValue2 = ((Integer) obj5).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = ((iIntValue2 & 8) == 0 ? ((getPostalCode) getbirthdatefull2).read(composedModifierKt2) : ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(composedModifierKt2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= (iIntValue2 & 64) == 0 ? ((getPostalCode) getbirthdatefull2).read(hashcodeimpl2) : ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(hashcodeimpl2) ? 32 : 16;
        }
        if ((iIntValue2 & 384) == 0) {
            if (!((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i4 = 128;
            }
            i |= i4;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (getpostalcode2.write(i & 1, (i & 1171) != 1170)) {
            materialize.RemoteActionCompatParcelizer(composedModifierKt2, hashcodeimpl2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode2, i & 1022);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
