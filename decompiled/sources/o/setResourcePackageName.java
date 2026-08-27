package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public class setResourcePackageName {
    public static final java.util.logging.Logger IconCompatParcelizer = java.util.logging.Logger.getLogger(setResourcePackageName.class.getName());
    public static final setResourcePackageName write = new setResourcePackageName();

    public static setResourcePackageName read() {
        ((constructObjectQuietly) r8lambdaMoJg2Lf6y92Yb4SyAXDmAYofuA.read).getClass();
        setResourcePackageName setresourcepackagename = (setResourcePackageName) constructObjectQuietly.RemoteActionCompatParcelizer.get();
        setResourcePackageName setresourcepackagename2 = write;
        if (setresourcepackagename == null) {
            setresourcepackagename = setresourcepackagename2;
        }
        return setresourcepackagename == null ? setresourcepackagename2 : setresourcepackagename;
    }

    public final setResourcePackageName IconCompatParcelizer() {
        ((constructObjectQuietly) r8lambdaMoJg2Lf6y92Yb4SyAXDmAYofuA.read).getClass();
        ThreadLocal threadLocal = constructObjectQuietly.RemoteActionCompatParcelizer;
        setResourcePackageName setresourcepackagename = (setResourcePackageName) threadLocal.get();
        setResourcePackageName setresourcepackagename2 = write;
        if (setresourcepackagename == null) {
            setresourcepackagename = setresourcepackagename2;
        }
        threadLocal.set(this);
        return setresourcepackagename == null ? setresourcepackagename2 : setresourcepackagename;
    }

    public final void IconCompatParcelizer(setResourcePackageName setresourcepackagename) {
        if (setresourcepackagename == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("toAttach");
            return;
        }
        constructObjectQuietly constructobjectquietly = (constructObjectQuietly) r8lambdaMoJg2Lf6y92Yb4SyAXDmAYofuA.read;
        ThreadLocal threadLocal = constructObjectQuietly.RemoteActionCompatParcelizer;
        constructobjectquietly.getClass();
        setResourcePackageName setresourcepackagename2 = (setResourcePackageName) threadLocal.get();
        setResourcePackageName setresourcepackagename3 = write;
        if (setresourcepackagename2 == null) {
            setresourcepackagename2 = setresourcepackagename3;
        }
        if (setresourcepackagename2 != this) {
            constructObjectQuietly.IconCompatParcelizer.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (setresourcepackagename != setresourcepackagename3) {
            threadLocal.set(setresourcepackagename);
        } else {
            threadLocal.set(null);
        }
    }
}
