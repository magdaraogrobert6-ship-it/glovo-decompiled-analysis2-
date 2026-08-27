package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class DrawBehindElement {
    public int IconCompatParcelizer;
    public androidx.camera.view.PendingValue MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final int RemoteActionCompatParcelizer;
    public final accesstoPxR2X_6ojd read;
    public int serializer;
    public final ArrayList write;

    public static clip read(DrawBehindElement drawBehindElement, onBuildCache[] onbuildcacheArr) throws androidx.constraintlayout.core.parser.CLParsingException {
        float fM3673constructorimpl = androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f);
        int i = drawBehindElement.serializer;
        drawBehindElement.serializer = i + 1;
        DrawCacheModifierDefaultImpls drawCacheModifierDefaultImpls = new DrawCacheModifierDefaultImpls(Integer.valueOf(i));
        accessroundToPxR2X_6ojd accessroundtopxr2x_6ojd = new accessroundToPxR2X_6ojd(new char[0]);
        for (onBuildCache onbuildcache : onbuildcacheArr) {
            accessroundtopxr2x_6ojd.serializer(accesstoDpSizekrfVVMjd.serializer(onbuildcache.read().toString()));
        }
        accesstoPxR2X_6ojd accesstopxr2x_6ojdIconCompatParcelizer = drawBehindElement.IconCompatParcelizer(drawCacheModifierDefaultImpls);
        accesstopxr2x_6ojdIconCompatParcelizer.serializer("type", "barrier");
        accesstopxr2x_6ojdIconCompatParcelizer.serializer(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "start");
        accesstopxr2x_6ojdIconCompatParcelizer.IconCompatParcelizer(fM3673constructorimpl, "margin");
        accesstopxr2x_6ojdIconCompatParcelizer.RemoteActionCompatParcelizer("contains", accessroundtopxr2x_6ojd);
        drawBehindElement.read(10);
        for (onBuildCache onbuildcache2 : onbuildcacheArr) {
            drawBehindElement.read(onbuildcache2.hashCode());
        }
        drawBehindElement.read(androidx.compose.ui.unit.Dp.m3679hashCodeimpl(fM3673constructorimpl));
        return new clip(drawCacheModifierDefaultImpls.MediaSessionCompatQueueItem, 0, drawCacheModifierDefaultImpls);
    }

    public static androidx.compose.ui.Modifier read(androidx.compose.ui.Modifier modifier, ClipKt clipKt, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new DrawCacheModifier(clipKt, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final void read() {
        this.read.RemoteActionCompatParcelizer.clear();
        this.serializer = this.RemoteActionCompatParcelizer;
        this.MediaSessionCompatQueueItem = 0;
        this.IconCompatParcelizer = 0;
    }

    public final accesstoPxR2X_6ojd IconCompatParcelizer(onBuildCache onbuildcache) throws androidx.constraintlayout.core.parser.CLParsingException {
        String string = onbuildcache.read().toString();
        accesstoPxR2X_6ojd accesstopxr2x_6ojd = this.read;
        DropShadowScope dropShadowScopeRemoteActionCompatParcelizer = accesstopxr2x_6ojd.RemoteActionCompatParcelizer(string);
        if ((dropShadowScopeRemoteActionCompatParcelizer instanceof accesstoPxR2X_6ojd ? (accesstoPxR2X_6ojd) dropShadowScopeRemoteActionCompatParcelizer : null) == null) {
            accesstopxr2x_6ojd.RemoteActionCompatParcelizer(string, new accesstoPxR2X_6ojd(new char[0]));
        }
        DropShadowScope dropShadowScope = accesstopxr2x_6ojd.read(string);
        if (dropShadowScope instanceof accesstoPxR2X_6ojd) {
            return (accesstoPxR2X_6ojd) dropShadowScope;
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("no object found for key <", string, ">, found [");
        sbM.append(dropShadowScope.RatingCompat());
        sbM.append("] : ");
        sbM.append(dropShadowScope);
        throw new androidx.constraintlayout.core.parser.CLParsingException(sbM.toString(), accesstopxr2x_6ojd);
    }

    public final ClipKt RemoteActionCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        this.IconCompatParcelizer = i + 1;
        ArrayList arrayList = this.write;
        ClipKt clipKt = (ClipKt) onContentCardDismissed.read(i, arrayList);
        if (clipKt != null) {
            return clipKt;
        }
        ClipKt clipKt2 = new ClipKt(Integer.valueOf(this.IconCompatParcelizer));
        arrayList.add(clipKt2);
        return clipKt2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawBehindElement)) {
            return false;
        }
        Object[] objArr = {this.read, ((DrawBehindElement) obj).read};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public DrawBehindElement() {
        new ArrayList();
        this.read = new accesstoPxR2X_6ojd(new char[0]);
        this.RemoteActionCompatParcelizer = 1000;
        this.serializer = 1000;
        this.IconCompatParcelizer = 0;
        this.write = new ArrayList();
    }

    public final androidx.camera.view.PendingValue serializer() {
        androidx.camera.view.PendingValue pendingValue = this.MediaMetadataCompat;
        if (pendingValue != null) {
            return pendingValue;
        }
        androidx.camera.view.PendingValue pendingValue2 = new androidx.camera.view.PendingValue(22, this);
        this.MediaMetadataCompat = pendingValue2;
        return pendingValue2;
    }

    public final void read(int i) {
        this.MediaSessionCompatQueueItem = ((this.MediaSessionCompatQueueItem * 1009) + i) % 1000000007;
    }
}
