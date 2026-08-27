package o;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class setLookaheadLayoutPendingForAlignmentui extends ThreadLocal {
    public final /* synthetic */ setLookaheadMeasurePendingui serializer;

    public setLookaheadLayoutPendingForAlignmentui(setLookaheadMeasurePendingui setlookaheadmeasurependingui) {
        this.serializer = setlookaheadmeasurependingui;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        setLookaheadMeasurePendingui setlookaheadmeasurependingui = this.serializer;
        try {
            setLayoutStateui setlayoutstateui = setLayoutStateui.write;
            Mac mac = (Mac) setlayoutstateui.RemoteActionCompatParcelizer.IconCompatParcelizer(setlookaheadmeasurependingui.IconCompatParcelizer);
            mac.init(setlookaheadmeasurependingui.read);
            return mac;
        } catch (GeneralSecurityException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
            return null;
        }
    }
}
