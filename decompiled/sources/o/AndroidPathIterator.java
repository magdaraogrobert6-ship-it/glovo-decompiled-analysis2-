package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPathIterator {
    public static final LinkedHashMap write = new LinkedHashMap();
    public final LinkedHashMap serializer = new LinkedHashMap();

    public final toAndroidPathDashPathEffectStyleoQv6xUo RemoteActionCompatParcelizer(String str) {
        str.getClass();
        if (str.length() <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("navigator name cannot be an empty string");
            return null;
        }
        toAndroidPathDashPathEffectStyleoQv6xUo toandroidpathdashpatheffectstyleoqv6xuo = (toAndroidPathDashPathEffectStyleoQv6xUo) this.serializer.get(str);
        if (toandroidpathdashpatheffectstyleoqv6xuo != null) {
            return toandroidpathdashpatheffectstyleoqv6xuo;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(ff$$ExternalSyntheticOutline0.m("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }

    public final void write(toAndroidPathDashPathEffectStyleoQv6xUo toandroidpathdashpatheffectstyleoqv6xuo) {
        toandroidpathdashpatheffectstyleoqv6xuo.getClass();
        String strWrite = getTolerance.write(toandroidpathdashpatheffectstyleoqv6xuo.getClass());
        if (strWrite.length() <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.serializer;
        toAndroidPathDashPathEffectStyleoQv6xUo toandroidpathdashpatheffectstyleoqv6xuo2 = (toAndroidPathDashPathEffectStyleoQv6xUo) linkedHashMap.get(strWrite);
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{toandroidpathdashpatheffectstyleoqv6xuo2, toandroidpathdashpatheffectstyleoqv6xuo}, iWrite3)).booleanValue()) {
            return;
        }
        if (toandroidpathdashpatheffectstyleoqv6xuo2 != null && toandroidpathdashpatheffectstyleoqv6xuo2.RemoteActionCompatParcelizer) {
            seekAnimationsanimation_core.IconCompatParcelizer("Navigator ", toandroidpathdashpatheffectstyleoqv6xuo, " is replacing an already attached ", toandroidpathdashpatheffectstyleoqv6xuo2);
        } else if (toandroidpathdashpatheffectstyleoqv6xuo.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read("Navigator ", toandroidpathdashpatheffectstyleoqv6xuo, " is already attached to another NavController");
        }
    }
}
