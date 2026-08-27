package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class onLowMemory extends AndroidGraphicsContext2 {
    public final getSuperCaller ComponentActivity = new getSuperCaller();

    @Override // o.accessunregisterComponentCallback
    public void RemoteActionCompatParcelizer() {
        Iterator it = this.ComponentActivity.iterator();
        while (true) {
            setImageBitmap setimagebitmap = (setImageBitmap) it;
            if (!setimagebitmap.hasNext()) {
                return;
            }
            AndroidGraphicsContextCompanion androidGraphicsContextCompanion = (AndroidGraphicsContextCompanion) ((Map.Entry) setimagebitmap.next()).getValue();
            androidGraphicsContextCompanion.write.read(androidGraphicsContextCompanion);
        }
    }

    @Override // o.accessunregisterComponentCallback
    public void read() {
        Iterator it = this.ComponentActivity.iterator();
        while (true) {
            setImageBitmap setimagebitmap = (setImageBitmap) it;
            if (!setimagebitmap.hasNext()) {
                return;
            } else {
                ((AndroidGraphicsContextCompanion) ((Map.Entry) setimagebitmap.next()).getValue()).RemoteActionCompatParcelizer();
            }
        }
    }

    public void RemoteActionCompatParcelizer(accessunregisterComponentCallback accessunregistercomponentcallback, unregisterComponentCallback unregistercomponentcallback) {
        Object obj;
        if (accessunregistercomponentcallback != null) {
            AndroidGraphicsContextCompanion androidGraphicsContextCompanion = new AndroidGraphicsContextCompanion(accessunregistercomponentcallback, unregistercomponentcallback);
            getSuperCaller getsupercaller = this.ComponentActivity;
            getSupportImageTintMode getsupportimagetintmodeRemoteActionCompatParcelizer = getsupercaller.RemoteActionCompatParcelizer(accessunregistercomponentcallback);
            if (getsupportimagetintmodeRemoteActionCompatParcelizer != null) {
                obj = getsupportimagetintmodeRemoteActionCompatParcelizer.serializer;
            } else {
                getSupportImageTintMode getsupportimagetintmode = new getSupportImageTintMode(accessunregistercomponentcallback, androidGraphicsContextCompanion);
                getsupercaller.read++;
                getSupportImageTintMode getsupportimagetintmode2 = getsupercaller.serializer;
                if (getsupportimagetintmode2 == null) {
                    getsupercaller.IconCompatParcelizer = getsupportimagetintmode;
                    getsupercaller.serializer = getsupportimagetintmode;
                } else {
                    getsupportimagetintmode2.RemoteActionCompatParcelizer = getsupportimagetintmode;
                    getsupportimagetintmode.read = getsupportimagetintmode2;
                    getsupercaller.serializer = getsupportimagetintmode;
                }
                obj = null;
            }
            AndroidGraphicsContextCompanion androidGraphicsContextCompanion2 = (AndroidGraphicsContextCompanion) obj;
            if (androidGraphicsContextCompanion2 != null && androidGraphicsContextCompanion2.read != unregistercomponentcallback) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("This source was already added with the different observer");
                return;
            } else {
                if (androidGraphicsContextCompanion2 == null && this.MediaDescriptionCompat > 0) {
                    accessunregistercomponentcallback.read(androidGraphicsContextCompanion);
                    return;
                }
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("source cannot be null");
    }
}
