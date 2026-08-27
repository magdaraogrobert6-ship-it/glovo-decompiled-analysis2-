package o;

import com.mapbox.common.HttpHeaders;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class floatToHalf implements InvocationHandler {
    public final getAmbientShadowColor0d7_KjU read;
    public final r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk serializer;

    public floatToHalf(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, getAmbientShadowColor0d7_KjU getambientshadowcolor0d7_kju) {
        this.serializer = r8lambdaucgighn8fiyv_vccodeafjfpedk;
        this.read = getambientshadowcolor0d7_kju;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{method.getName(), HttpHeaders.ACCEPT}, getCieXyz.write())).booleanValue();
        getAmbientShadowColor0d7_KjU getambientshadowcolor0d7_kju = this.read;
        if (zBooleanValue && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(this.serializer, obj2);
            getambientshadowcolor0d7_kju.invoke(obj2);
            return createFromParcel.INSTANCE;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{method.getName(), "equals"}, getCieXyz.write())).booleanValue() && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{method.getName(), "hashCode"}, getCieXyz.write())).booleanValue() && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(getambientshadowcolor0d7_kju.hashCode());
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{method.getName(), "toString"}, getCieXyz.write())).booleanValue() && method.getReturnType().equals(String.class) && objArr == null) {
            return getambientshadowcolor0d7_kju.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
