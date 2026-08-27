package com.mapbox.navigation.ui.maps.internal.route.line;

import androidx.annotation.Keep;
import bo.app.ff$$ExternalSyntheticOutline0;
import fwfd.com.fwfsdk.constant.FWFConstants;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class RouteLineViewDataError extends RouteLineViewExpectedInput {
    private final String message;

    public final String component1() {
        return this.message;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public static /* synthetic */ RouteLineViewDataError copy$default(RouteLineViewDataError routeLineViewDataError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = routeLineViewDataError.message;
        }
        return routeLineViewDataError.copy(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RouteLineViewDataError)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.message, ((RouteLineViewDataError) obj).message}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("RouteLineViewDataError(message="), this.message, ')');
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteLineViewDataError(String str) {
        super(FWFConstants.EXPLANATION_TYPE_ERROR);
        str.getClass();
        this.message = str;
    }

    public final RouteLineViewDataError copy(String str) {
        str.getClass();
        return new RouteLineViewDataError(str);
    }
}
