package androidx.compose.runtime.snapshots;

import androidx.compose.ui.graphics.Fields;
import java.util.Collection;
import java.util.List;
import o.createFromParcel;
import o.getAdvertisingInfoObject;
import o.getOnLoggedCallbackannotations;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateList$$ExternalSyntheticLambda1 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ SnapshotStateList$$ExternalSyntheticLambda1(int i, Collection collection) {
        this.RemoteActionCompatParcelizer = i;
        this.read = collection;
    }

    public /* synthetic */ SnapshotStateList$$ExternalSyntheticLambda1(getAdvertisingInfoObject getadvertisinginfoobject, int i) {
        this.read = getadvertisinginfoobject;
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = write + 51;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.read;
        if (i3 == 0) {
            return Boolean.valueOf(((List) obj).addAll(i4, (Collection) obj2));
        }
        getAdvertisingInfoObject getadvertisinginfoobject = (getAdvertisingInfoObject) obj2;
        getOnLoggedCallbackannotations getonloggedcallbackannotations = (getOnLoggedCallbackannotations) obj;
        getonloggedcallbackannotations.getClass();
        getonloggedcallbackannotations.setPrimaryLabel(getadvertisinginfoobject.MediaSessionCompatQueueItem);
        getonloggedcallbackannotations.setSecondaryLabel(i4);
        getonloggedcallbackannotations.setChecked(getadvertisinginfoobject.write);
        getonloggedcallbackannotations.setToggleEnabled(getadvertisinginfoobject.RemoteActionCompatParcelizer);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = serializer + 105;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }
}
