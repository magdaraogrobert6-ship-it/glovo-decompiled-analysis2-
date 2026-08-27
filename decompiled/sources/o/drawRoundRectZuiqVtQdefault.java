package o;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class drawRoundRectZuiqVtQdefault implements drawRectAsUm42wdefault {
    public final getSaturationuksYyKA IconCompatParcelizer;
    public final Context serializer;

    @Override // o.getDefaultFilterQualityfv9h1I
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // o.getDefaultFilterQualityfv9h1I
    public final void serializer() {
        accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccacIconCompatParcelizer = accessgetApparentToRealOffsetnOccac.IconCompatParcelizer(this.serializer);
        getSaturationuksYyKA getsaturationuksyyka = this.IconCompatParcelizer;
        synchronized (accessgetapparenttorealoffsetnoccacIconCompatParcelizer) {
            ((HashSet) accessgetapparenttorealoffsetnoccacIconCompatParcelizer.write).remove(getsaturationuksyyka);
            if (accessgetapparenttorealoffsetnoccacIconCompatParcelizer.read && ((HashSet) accessgetapparenttorealoffsetnoccacIconCompatParcelizer.write).isEmpty()) {
                r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) accessgetapparenttorealoffsetnoccacIconCompatParcelizer.serializer;
                ((ConnectivityManager) ((scale0AR0LA0default) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).B_()).unregisterNetworkCallback((io.sentry.android.core.internal.util.write) r8lambdalmkbrrgswwtv97obrsj7trj7ai.read);
                accessgetapparenttorealoffsetnoccacIconCompatParcelizer.read = false;
            }
        }
    }

    @Override // o.getDefaultFilterQualityfv9h1I
    public final void write() {
        accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccacIconCompatParcelizer = accessgetApparentToRealOffsetnOccac.IconCompatParcelizer(this.serializer);
        getSaturationuksYyKA getsaturationuksyyka = this.IconCompatParcelizer;
        synchronized (accessgetapparenttorealoffsetnoccacIconCompatParcelizer) {
            ((HashSet) accessgetapparenttorealoffsetnoccacIconCompatParcelizer.write).add(getsaturationuksyyka);
            accessgetapparenttorealoffsetnoccacIconCompatParcelizer.read();
        }
    }

    public drawRoundRectZuiqVtQdefault(Context context, getSaturationuksYyKA getsaturationuksyyka) {
        this.serializer = context.getApplicationContext();
        this.IconCompatParcelizer = getsaturationuksyyka;
    }
}
