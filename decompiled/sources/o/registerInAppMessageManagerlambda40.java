package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class registerInAppMessageManagerlambda40 {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    public final requestDisplayInAppMessagelambda2 read;
    public final registerInAppMessageManagerlambda50 serializer;

    public final int hashCode() {
        requestDisplayInAppMessagelambda2 requestdisplayinappmessagelambda2 = this.read;
        int iHashCode = requestdisplayinappmessagelambda2 == null ? 0 : requestdisplayinappmessagelambda2.hashCode();
        registerInAppMessageManagerlambda50 registerinappmessagemanagerlambda50 = this.serializer;
        return (iHashCode * 31) + (registerinappmessagemanagerlambda50 != null ? registerinappmessagemanagerlambda50.hashCode() : 0);
    }

    public final String toString() {
        requestDisplayInAppMessagelambda2 requestdisplayinappmessagelambda2 = this.read;
        int i = requestdisplayinappmessagelambda2 == null ? -1 : requestDisplayInAppMessagelambda3.IconCompatParcelizer[requestdisplayinappmessagelambda2.ordinal()];
        if (i == -1) {
            return "*";
        }
        registerInAppMessageManagerlambda50 registerinappmessagemanagerlambda50 = this.serializer;
        if (i == 1) {
            return String.valueOf(registerinappmessagemanagerlambda50);
        }
        if (i == 2) {
            return "in " + registerinappmessagemanagerlambda50;
        }
        if (i != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        return "out " + registerinappmessagemanagerlambda50;
    }

    static {
        new registerInAppMessageManagerlambda40(null, null);
    }

    public registerInAppMessageManagerlambda40(requestDisplayInAppMessagelambda2 requestdisplayinappmessagelambda2, displayInAppMessagelambda0 displayinappmessagelambda0) {
        String str;
        this.read = requestdisplayinappmessagelambda2;
        this.serializer = displayinappmessagelambda0;
        if ((requestdisplayinappmessagelambda2 == null) == (displayinappmessagelambda0 == null)) {
            return;
        }
        if (requestdisplayinappmessagelambda2 == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + requestdisplayinappmessagelambda2 + " requires type to be specified.";
        }
        DrawableTransformation.serializer((Object) str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof registerInAppMessageManagerlambda40)) {
            return false;
        }
        registerInAppMessageManagerlambda40 registerinappmessagemanagerlambda40 = (registerInAppMessageManagerlambda40) obj;
        if (this.read != registerinappmessagemanagerlambda40.read) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, registerinappmessagemanagerlambda40.serializer}, getCieXyz.write())).booleanValue();
    }
}
