package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.home.nest.api.data.TripPlannerData$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.NavHostKtNavHost291;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class findCentralDirectory {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final TripPlannerData$Companion Companion = new Object() { // from class: com.roadrunner.home.nest.api.data.TripPlannerData$Companion
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            NavHostKtNavHost291 navHostKtNavHost291;
            int i = 2 % 2;
            int i2 = read + 13;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                navHostKtNavHost291 = NavHostKtNavHost291.read;
                int i3 = 23 / 0;
            } else {
                navHostKtNavHost291 = NavHostKtNavHost291.read;
            }
            int i4 = read + 113;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return navHostKtNavHost291;
        }
    };
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final findMethod pagination;
    public final List routes;
    public final String title;
    public final List trackingEvents;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.home.nest.api.data.TripPlannerData$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new RoomDatabaseExternalSyntheticLambda4(17)), LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new RoomDatabaseExternalSyntheticLambda4(18)), null};
        int i = write + 39;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ findCentralDirectory(int i, String str, List list, List list2, findMethod findmethod) {
        if (3 == (i & 3)) {
            this.title = str;
            this.routes = list;
            if ((i & 4) == 0) {
                this.trackingEvents = instance_delegatelambda0.write;
            } else {
                this.trackingEvents = list2;
                int i2 = serializer + 123;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            }
            if ((i & 8) != 0) {
                this.pagination = findmethod;
                return;
            }
            int i4 = RemoteActionCompatParcelizer + 19;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                this.pagination = null;
                int i5 = 83 / 0;
                return;
            } else {
                this.pagination = null;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, NavHostKtNavHost291.read.getDescriptor());
        throw null;
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 27;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.trackingEvents, c8$$ExternalSyntheticOutline0.m(this.routes, this.title.hashCode() * 31, 31), 31);
        findMethod findmethod = this.pagination;
        if (findmethod == null) {
            int i5 = RemoteActionCompatParcelizer + 45;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i = 0;
        } else {
            int iHashCode = findmethod.hashCode();
            int i7 = RemoteActionCompatParcelizer + 113;
            serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i = iHashCode;
        }
        return iM + i;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbSerializer = r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("TripPlannerData(title=", this.title, ", routes=", this.routes, ", trackingEvents=");
        sbSerializer.append(this.trackingEvents);
        sbSerializer.append(", pagination=");
        sbSerializer.append(this.pagination);
        sbSerializer.append(")");
        String string = sbSerializer.toString();
        int i4 = RemoteActionCompatParcelizer + 27;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findCentralDirectory)) {
            return false;
        }
        findCentralDirectory findcentraldirectory = (findCentralDirectory) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, findcentraldirectory.title}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routes, findcentraldirectory.routes}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, findcentraldirectory.trackingEvents}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pagination, findcentraldirectory.pagination}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i2 = serializer + 17;
            int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 21;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = serializer + 121;
        int i8 = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 77;
        serializer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return false;
        }
        throw null;
    }
}
