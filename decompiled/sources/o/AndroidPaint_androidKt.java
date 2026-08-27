package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPaint_androidKt implements createImageBitmap {
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ AndroidPaint_androidKt(int i, Object obj) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.createImageBitmap
    public final androidx.lifecycle.ViewModel serializer(Class cls, setStrokeMiterLimit setstrokemiterlimit) {
        setStylek9PVt8s setstylek9pvt8s;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        int i = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            Object objInvoke = ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj).invoke(prepareToDraw.IconCompatParcelizer(setstrokemiterlimit));
            objInvoke.getClass();
            return (androidx.lifecycle.ViewModel) objInvoke;
        }
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(cls);
        setStylek9PVt8s[] setstylek9pvt8sArr = (setStylek9PVt8s[]) obj;
        setStylek9PVt8s[] setstylek9pvt8sArr2 = (setStylek9PVt8s[]) Arrays.copyOf(setstylek9pvt8sArr, setstylek9pvt8sArr.length);
        int length = setstylek9pvt8sArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                setstylek9pvt8s = null;
                break;
            }
            setstylek9pvt8s = setstylek9pvt8sArr2[i2];
            if (setstylek9pvt8s.IconCompatParcelizer.equals(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer)) {
                break;
            }
            i2++;
        }
        androidx.lifecycle.ViewModel viewModel = (setstylek9pvt8s == null || (r8lambdaunavo3sxub_pc9xroryotnrlvsm = setstylek9pvt8s.serializer) == null) ? null : (androidx.lifecycle.ViewModel) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(setstrokemiterlimit);
        if (viewModel != null) {
            return viewModel;
        }
        DrawableTransformation.serializer(r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.RemoteActionCompatParcelizer(), "No initializer set for given class ");
        return null;
    }
}
