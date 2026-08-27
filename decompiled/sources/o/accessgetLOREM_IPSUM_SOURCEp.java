package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$Companion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.copyMaxDimensionsmsEJaDk;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class accessgetLOREM_IPSUM_SOURCEp implements uiMode {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final TakePictureTaskUiItem$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 67;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            copyMaxDimensionsmsEJaDk copymaxdimensionsmsejadk = copyMaxDimensionsmsEJaDk.RemoteActionCompatParcelizer;
            int i4 = serializer + 7;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return copymaxdimensionsmsejadk;
            }
            throw null;
        }
    };
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final int addIcon;
    public final int buttonIcon;
    public final String buttonText;
    public final String cameraTagsData;
    public final List compression;
    public final int deleteIcon;
    public final String description;
    public final Constraints imageOverlay;
    public final List images;
    public final boolean isOptional;
    public final int limit;
    public final List overlayItems;
    public final String taskId;
    public final String title;
    public final String uploadedPath;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.TakePictureTaskUiItem$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fontScale(20)), null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fontScale(21)), null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new fontScale(22)), null, null};
        int i = read + 121;
        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // o.uiMode
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 33;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.taskId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.images;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.uiMode
    public final boolean read() {
        int i = 2 % 2;
        int i2 = serializer + 87;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.isOptional;
        int i4 = i3 + 59;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public /* synthetic */ accessgetLOREM_IPSUM_SOURCEp(int i, String str, String str2, String str3, List list, int i2, int i3, int i4, String str4, String str5, List list2, int i5, Constraints constraints, List list3, String str6, boolean z) {
        String str7;
        if (23039 != (i & 23039)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 23039, copyMaxDimensionsmsEJaDk.RemoteActionCompatParcelizer.getDescriptor());
            throw null;
        }
        this.taskId = str;
        this.title = str2;
        this.description = str3;
        this.compression = list;
        this.buttonIcon = i2;
        this.addIcon = i3;
        this.deleteIcon = i4;
        this.buttonText = str4;
        this.uploadedPath = str5;
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            this.images = instance_delegatelambda0.write;
        } else {
            this.images = list2;
            int i6 = serializer + 13;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
            int i8 = serializer + 59;
            int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i9;
            int i10 = i8 % 2;
            this.limit = 1;
            int i11 = i9 + 3;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            this.limit = i5;
        }
        int i13 = 2 % 2;
        this.imageOverlay = constraints;
        this.overlayItems = list3;
        if ((i & 8192) == 0) {
            str7 = "";
        } else {
            int i14 = 2 % 2;
            str7 = str6;
        }
        this.cameraTagsData = str7;
        this.isOptional = z;
    }

    @Override // o.uiMode
    public final boolean write() {
        int i = 2 % 2;
        int i2 = serializer + 111;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
            if (this.isOptional) {
                return true;
            }
        } else if (this.isOptional) {
            return true;
        }
        List list = this.images;
        if (!list.isEmpty()) {
            int i4 = RemoteActionCompatParcelizer;
            int i5 = i4 + 11;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            List list2 = list;
            if (list2 instanceof Collection) {
                int i7 = i4 + 21;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 63 / 0;
                    if (list2.isEmpty()) {
                        return true;
                    }
                } else if (list2.isEmpty()) {
                    return true;
                }
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!(((getFocusIndeximpl) it.next()) instanceof getHasFixedWidthimpl)) {
                }
            }
            return true;
        }
        return false;
    }

    public final List serializer() {
        int i = 2 % 2;
        int i2 = serializer + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) this.images);
        if (!arrayListIconCompatParcelizer.isEmpty()) {
            int i4 = serializer + 79;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                arrayListIconCompatParcelizer.isEmpty();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!arrayListIconCompatParcelizer.isEmpty()) {
                Iterator it = arrayListIconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    if (!(((getFocusIndeximpl) it.next()) instanceof getMinHeightimpl)) {
                        if (arrayListIconCompatParcelizer.size() < this.limit) {
                            arrayListIconCompatParcelizer.add(new getHasBoundedWidthimpl(this.addIcon));
                            int i5 = RemoteActionCompatParcelizer + 19;
                            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                        }
                        return onContentCardDismissed.IconCompatParcelizer(arrayListIconCompatParcelizer, 3);
                    }
                }
            }
        }
        return instance_delegatelambda0.write;
    }

    public static accessgetLOREM_IPSUM_SOURCEp serializer(accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep, List list, String str, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 73;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str2 = accessgetlorem_ipsum_sourcep.taskId;
        String str3 = accessgetlorem_ipsum_sourcep.title;
        String str4 = accessgetlorem_ipsum_sourcep.description;
        List list2 = accessgetlorem_ipsum_sourcep.compression;
        int i5 = accessgetlorem_ipsum_sourcep.buttonIcon;
        int i6 = accessgetlorem_ipsum_sourcep.addIcon;
        int i7 = accessgetlorem_ipsum_sourcep.deleteIcon;
        String str5 = accessgetlorem_ipsum_sourcep.buttonText;
        String str6 = accessgetlorem_ipsum_sourcep.uploadedPath;
        int i8 = accessgetlorem_ipsum_sourcep.limit;
        Constraints constraints = accessgetlorem_ipsum_sourcep.imageOverlay;
        List list3 = accessgetlorem_ipsum_sourcep.overlayItems;
        String str7 = (i & 8192) != 0 ? accessgetlorem_ipsum_sourcep.cameraTagsData : str;
        boolean z = accessgetlorem_ipsum_sourcep.isOptional;
        accessgetlorem_ipsum_sourcep.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list2.getClass();
        str5.getClass();
        str6.getClass();
        list.getClass();
        str7.getClass();
        accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep2 = new accessgetLOREM_IPSUM_SOURCEp(str2, str3, str4, list2, i5, i6, i7, str5, str6, list, i8, constraints, list3, str7, z);
        int i9 = serializer + 99;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return accessgetlorem_ipsum_sourcep2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public accessgetLOREM_IPSUM_SOURCEp(String str, String str2, String str3, List list, int i, int i2, int i3, String str4, String str5, List list2, int i4, Constraints constraints, List list3, String str6, boolean z) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.taskId = str;
        this.title = str2;
        this.description = str3;
        this.compression = list;
        this.buttonIcon = i;
        this.addIcon = i2;
        this.deleteIcon = i3;
        this.buttonText = str4;
        this.uploadedPath = str5;
        this.images = list2;
        this.limit = i4;
        this.imageOverlay = constraints;
        this.overlayItems = list3;
        this.cameraTagsData = str6;
        this.isOptional = z;
    }

    public /* synthetic */ accessgetLOREM_IPSUM_SOURCEp(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, int i, Constraints constraints, ArrayList arrayList2, boolean z) {
        this(str, str2, str3, arrayList, com.logistics.rider.glovo.R.drawable.ic_bold_large_essentials_camera, com.logistics.rider.glovo.R.drawable.ic_bold_medium_essentials_plus, com.logistics.rider.glovo.R.drawable.ic_bold_large_essentials_dustbin, str4, str5, instance_delegatelambda0.write, i, constraints, arrayList2, "", z);
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.limit, c8$$ExternalSyntheticOutline0.m(this.images, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.deleteIcon, af$$ExternalSyntheticOutline0.m(this.addIcon, af$$ExternalSyntheticOutline0.m(this.buttonIcon, c8$$ExternalSyntheticOutline0.m(this.compression, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.taskId.hashCode() * 31, 31, this.title), 31, this.description), 31), 31), 31), 31), 31, this.buttonText), 31, this.uploadedPath), 31), 31);
        Constraints constraints = this.imageOverlay;
        if (constraints == null) {
            int i4 = serializer + 121;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = constraints.hashCode();
        }
        List list = this.overlayItems;
        int iHashCode2 = Boolean.hashCode(this.isOptional) + af$$ExternalSyntheticOutline0.m((((iM + iHashCode) * 31) + (list != null ? list.hashCode() : 0)) * 31, 31, this.cameraTagsData);
        int i6 = RemoteActionCompatParcelizer + 5;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("TakePictureTaskUiItem(taskId=", this.taskId, ", title=", this.title, ", description=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.description, ", compression=", this.compression, ", buttonIcon=");
        r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.IconCompatParcelizer(this.buttonIcon, this.addIcon, ", addIcon=", ", deleteIcon=", sbM);
        sbM.append(this.deleteIcon);
        sbM.append(", buttonText=");
        sbM.append(this.buttonText);
        sbM.append(", uploadedPath=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sbM, this.uploadedPath, ", images=", this.images, ", limit=");
        sbM.append(this.limit);
        sbM.append(", imageOverlay=");
        sbM.append(this.imageOverlay);
        sbM.append(", overlayItems=");
        sbM.append(this.overlayItems);
        sbM.append(", cameraTagsData=");
        sbM.append(this.cameraTagsData);
        sbM.append(", isOptional=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.isOptional, ")");
        int i4 = RemoteActionCompatParcelizer + 7;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetLOREM_IPSUM_SOURCEp)) {
            int i2 = serializer + 63;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        accessgetLOREM_IPSUM_SOURCEp accessgetlorem_ipsum_sourcep = (accessgetLOREM_IPSUM_SOURCEp) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.taskId, accessgetlorem_ipsum_sourcep.taskId}, getCieXyz.write())).booleanValue()) {
            int i4 = serializer + 25;
            RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, accessgetlorem_ipsum_sourcep.title}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, accessgetlorem_ipsum_sourcep.description}, getCieXyz.write())).booleanValue()) {
            int i5 = RemoteActionCompatParcelizer + 13;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.compression, accessgetlorem_ipsum_sourcep.compression}, getCieXyz.write())).booleanValue() || this.buttonIcon != accessgetlorem_ipsum_sourcep.buttonIcon || this.addIcon != accessgetlorem_ipsum_sourcep.addIcon || this.deleteIcon != accessgetlorem_ipsum_sourcep.deleteIcon) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.buttonText, accessgetlorem_ipsum_sourcep.buttonText}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.uploadedPath, accessgetlorem_ipsum_sourcep.uploadedPath}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.images, accessgetlorem_ipsum_sourcep.images}, getCieXyz.write())).booleanValue() || this.limit != accessgetlorem_ipsum_sourcep.limit) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.imageOverlay, accessgetlorem_ipsum_sourcep.imageOverlay}, getCieXyz.write())).booleanValue()) {
            int i7 = serializer + 61;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 87 / 0;
            }
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.overlayItems, accessgetlorem_ipsum_sourcep.overlayItems}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.cameraTagsData, accessgetlorem_ipsum_sourcep.cameraTagsData}, getCieXyz.write())).booleanValue() && this.isOptional == accessgetlorem_ipsum_sourcep.isOptional;
        }
        int i9 = RemoteActionCompatParcelizer + 97;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
