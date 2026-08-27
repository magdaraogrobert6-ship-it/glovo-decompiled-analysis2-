package o;

import io.sentry.JsonObjectSerializer;
import java.util.ArrayList;
import org.koin.core.error.InstanceCreationException;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getLoggerfwf_client_release {
    public final getExposureHandlerfwf_client_release write;

    public abstract Object serializer(io.sentry.util.ComponentActivity componentActivity);

    public final int hashCode() {
        return this.write.hashCode();
    }

    public getLoggerfwf_client_release(getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release) {
        this.write = getexposurehandlerfwf_client_release;
    }

    public Object read(io.sentry.util.ComponentActivity componentActivity) throws InstanceCreationException {
        JsonObjectSerializer jsonObjectSerializer = (JsonObjectSerializer) componentActivity.serializer;
        StringBuilder sb = new StringBuilder("| (+) '");
        getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release = this.write;
        sb.append(getexposurehandlerfwf_client_release);
        sb.append('\'');
        String string = sb.toString();
        jsonObjectSerializer.getClass();
        jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.DEBUG, string);
        try {
            getTrackingServicefwf_client_release gettrackingservicefwf_client_release = (getTrackingServicefwf_client_release) componentActivity.read;
            if (gettrackingservicefwf_client_release == null) {
                gettrackingservicefwf_client_release = new getTrackingServicefwf_client_release(3, null);
            }
            return getexposurehandlerfwf_client_release.IconCompatParcelizer.invoke((Scope) componentActivity.write, gettrackingservicefwf_client_release);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) className, (CharSequence) "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(onContentCardDismissed.IconCompatParcelizer(arrayList, "\n\t", null, null, null, 62));
            jsonObjectSerializer.serializer(getProvidedCachefwf_client_release.ERROR, "* Instance creation error : could not create instance for '" + getexposurehandlerfwf_client_release + "': " + sb2.toString());
            throw new InstanceCreationException("Could not create instance for '" + getexposurehandlerfwf_client_release + '\'', e);
        }
    }

    public final boolean equals(Object obj) {
        getLoggerfwf_client_release getloggerfwf_client_release = obj instanceof getLoggerfwf_client_release ? (getLoggerfwf_client_release) obj : null;
        return this.write.equals(getloggerfwf_client_release != null ? getloggerfwf_client_release.write : null);
    }
}
