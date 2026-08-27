package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class getIdentifiersValidationsEnabled {
    public getMessageImageView read;
    public setInAppMessageImageViewAttributes serializer;
    public final ArrayList write = new ArrayList();
    public final ArrayList RemoteActionCompatParcelizer = new ArrayList();

    public final void write(String str) {
        Objects.requireNonNull(str, "baseUrl == null");
        createAppropriateViews createappropriateviews = new createAppropriateViews();
        createappropriateviews.read(null, str);
        setInAppMessageImageViewAttributes setinappmessageimageviewattributesRemoteActionCompatParcelizer = createappropriateviews.RemoteActionCompatParcelizer();
        ArrayList arrayList = setinappmessageimageviewattributesRemoteActionCompatParcelizer.pathSegments;
        if ("".equals(arrayList.get(arrayList.size() - 1))) {
            this.serializer = setinappmessageimageviewattributesRemoteActionCompatParcelizer;
        } else {
            Gson$$ExternalSyntheticBUOutline0.m(setinappmessageimageviewattributesRemoteActionCompatParcelizer, "baseUrl must end in /: ");
        }
    }

    public final void write(FwFClientExtensionKtgetVariations1 fwFClientExtensionKtgetVariations1) {
        Objects.requireNonNull(fwFClientExtensionKtgetVariations1, "factory == null");
        this.RemoteActionCompatParcelizer.add(fwFClientExtensionKtgetVariations1);
    }

    public final void write(accessgetInitialDelayp accessgetinitialdelayp) {
        Objects.requireNonNull(accessgetinitialdelayp, "factory == null");
        this.write.add(accessgetinitialdelayp);
    }

    public final getHoldoutVariation write() {
        if (this.serializer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Base URL required.");
            return null;
        }
        getMessageImageView r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = this.read;
        if (r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 == null) {
            r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0 = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0();
        }
        getMessageImageView getmessageimageview = r8lambdaa_tbhqgr0_qo4afqkbrftkxvvg0;
        getVariationdefault getvariationdefault = ProtoErrorMsgCompanion.RemoteActionCompatParcelizer;
        getChangeVersionControl getchangeversioncontrol = ProtoErrorMsgCompanion.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList(this.RemoteActionCompatParcelizer);
        List listSerializer = getchangeversioncontrol.serializer(getvariationdefault);
        arrayList.addAll(listSerializer);
        List listWrite = getchangeversioncontrol.write();
        int size = listWrite.size();
        ArrayList arrayList2 = this.write;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
        arrayList3.add(new removeCustomerProfileAttributes(0));
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(listWrite);
        setInAppMessageImageViewAttributes setinappmessageimageviewattributes = this.serializer;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
        listSerializer.size();
        return new getHoldoutVariation(getmessageimageview, setinappmessageimageviewattributes, listUnmodifiableList, listUnmodifiableList2, getvariationdefault);
    }
}
