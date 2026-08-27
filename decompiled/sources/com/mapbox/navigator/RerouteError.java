package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public class RerouteError implements Serializable {
    private final String message;
    private final List<RouterError> routerErrors;
    private final RerouteErrorType type;

    public String getMessage() {
        return this.message;
    }

    public List<RouterError> getRouterErrors() {
        return this.routerErrors;
    }

    public RerouteErrorType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.message, this.type, this.routerErrors);
    }

    public RerouteError(String str, RerouteErrorType rerouteErrorType, List<RouterError> list) {
        this.message = str;
        this.type = rerouteErrorType;
        this.routerErrors = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[message: ");
        IconCompatParcelizer.read(sb, this.message, ", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", routerErrors: ");
        return MediaSessionCompatQueueItem.read(this.routerErrors, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RerouteError rerouteError = (RerouteError) obj;
        return Objects.equals(this.message, rerouteError.message) && Objects.equals(this.type, rerouteError.type) && Objects.equals(this.routerErrors, rerouteError.routerErrors);
    }
}
