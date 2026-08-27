package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.AndroidPlatform$Companion;

/* JADX INFO: loaded from: classes4.dex */
public class isCurrentOrientationValidlambda0 implements isRunningOnTablet {
    public static final isMainThread write = new isMainThread(27);
    public final Method IconCompatParcelizer;
    public final Method RemoteActionCompatParcelizer;
    public final Method read;
    public final Class serializer;

    @Override // o.isRunningOnTablet
    public final boolean RemoteActionCompatParcelizer(SSLSocket sSLSocket) {
        return this.serializer.isInstance(sSLSocket);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r8, o.getCieXyz.write())).booleanValue() != false) goto L14;
     */
    @Override // o.isRunningOnTablet
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String write(javax.net.ssl.SSLSocket r11) {
        /*
            r10 = this;
            java.lang.Class r0 = r10.serializer
            boolean r0 = r0.isInstance(r11)
            r1 = 0
            if (r0 != 0) goto La
            goto L53
        La:
            java.lang.reflect.Method r0 = r10.RemoteActionCompatParcelizer     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L58
            java.lang.Object r11 = r0.invoke(r11, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L58
            byte[] r11 = (byte[]) r11     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L58
            if (r11 == 0) goto L53
            java.nio.charset.Charset r0 = o.ensureSubscribedToInAppMessageEvents.write     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L58
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L58
            r2.<init>(r11, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L58
            return r2
        L1c:
            r11 = move-exception
            java.lang.Throwable r0 = r11.getCause()
            boolean r2 = r0 instanceof java.lang.NullPointerException
            if (r2 == 0) goto L54
            java.lang.NullPointerException r0 = (java.lang.NullPointerException) r0
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "ssl == null"
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r2}
            int r3 = o.getCieXyz.write()
            int r7 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            int r6 = o.getCieXyz.write()
            r4 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r5 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            java.lang.Object r0 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L54
        L53:
            return r1
        L54:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r11)
            return r1
        L58:
            r11 = move-exception
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isCurrentOrientationValidlambda0.write(javax.net.ssl.SSLSocket):java.lang.String");
    }

    @Override // o.isRunningOnTablet
    public final boolean write() {
        boolean z = r8lambdayCqONI5qtI0P4J7deuwwogdnEs.read;
        return AndroidPlatform$Companion.serializer();
    }

    public isCurrentOrientationValidlambda0(Class cls) throws NoSuchMethodException {
        this.serializer = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.read = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.RemoteActionCompatParcelizer = cls.getMethod("getAlpnSelectedProtocol", null);
        this.IconCompatParcelizer = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // o.isRunningOnTablet
    public final void RemoteActionCompatParcelizer(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.serializer.isInstance(sSLSocket)) {
            try {
                this.read.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.IconCompatParcelizer;
                getMaxSafeTopInset getmaxsafetopinset = getMaxSafeTopInset.MediaDescriptionCompat;
                method.invoke(sSLSocket, AndroidUiDispatcherCompanioncurrentThread1.serializer(list));
            } catch (IllegalAccessException e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(e);
            } catch (InvocationTargetException e2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(e2);
            }
        }
    }
}
