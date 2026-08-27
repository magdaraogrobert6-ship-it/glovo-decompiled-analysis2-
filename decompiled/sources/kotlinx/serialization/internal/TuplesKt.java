package kotlinx.serialization.internal;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import kotlinx.serialization.SerializationException;
import o.getUnregisteredInAppMessageannotations;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TuplesKt {
    public static final Object RemoteActionCompatParcelizer = new Object();

    public static final void RemoteActionCompatParcelizer(String str, getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
        String string;
        getunregisteredinappmessageannotations.getClass();
        StringBuilder sb = new StringBuilder("in the polymorphic scope of '");
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk = (r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) getunregisteredinappmessageannotations;
        sb.append(r8lambdaucgighn8fiyv_vccodeafjfpedk.IconCompatParcelizer());
        sb.append('\'');
        String string2 = sb.toString();
        if (str == null) {
            string = m1$$ExternalSyntheticOutline0.m('.', "Class discriminator was missing and no default serializers were registered ", string2);
        } else {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Serializer for subclass '", str, "' is not found ", string2, ".\nCheck if class with serial name '");
            c8$$ExternalSyntheticOutline0.m(sbM, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbM.append(r8lambdaucgighn8fiyv_vccodeafjfpedk.IconCompatParcelizer());
            sbM.append("' has to be sealed and '@Serializable'.");
            string = sbM.toString();
        }
        throw new SerializationException(string);
    }

    public static final void serializer(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
        getunregisteredinappmessageannotations.getClass();
        String strIconCompatParcelizer = r8lambdaucgighn8fiyv_vccodeafjfpedk.IconCompatParcelizer();
        if (strIconCompatParcelizer == null) {
            strIconCompatParcelizer = String.valueOf(r8lambdaucgighn8fiyv_vccodeafjfpedk);
        }
        RemoteActionCompatParcelizer(strIconCompatParcelizer, getunregisteredinappmessageannotations);
        throw null;
    }
}
