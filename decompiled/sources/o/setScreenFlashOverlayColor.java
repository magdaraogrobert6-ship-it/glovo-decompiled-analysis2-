package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class setScreenFlashOverlayColor implements FocusOwnerImplmodifier1 {
    public final /* synthetic */ int IconCompatParcelizer;
    public Object write;

    public /* synthetic */ setScreenFlashOverlayColor(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.write = obj;
    }

    @Override // o.FocusOwnerImplmodifier1
    public final void accept(Object obj) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            ((FocusOwnerImplmodifier1) this.write).getClass();
            ((FocusOwnerImplmodifier1) this.write).accept(obj);
            return;
        }
        if (i == 1) {
            FocusOwnerdispatchKeyEvent1 focusOwnerdispatchKeyEvent1 = (FocusOwnerdispatchKeyEvent1) obj;
            if (focusOwnerdispatchKeyEvent1 == null) {
                focusOwnerdispatchKeyEvent1 = new FocusOwnerdispatchKeyEvent1(-3);
            }
            ((colorResource) this.write).serializer(focusOwnerdispatchKeyEvent1);
            return;
        }
        FocusOwnerdispatchKeyEvent1 focusOwnerdispatchKeyEvent2 = (FocusOwnerdispatchKeyEvent1) obj;
        synchronized (setFocusCaptured.IconCompatParcelizer) {
            processDragGesture processdraggesture = setFocusCaptured.RemoteActionCompatParcelizer;
            ArrayList arrayList = (ArrayList) processdraggesture.get((String) this.write);
            if (arrayList == null) {
                return;
            }
            processdraggesture.remove((String) this.write);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((FocusOwnerImplmodifier1) arrayList.get(i2)).accept(focusOwnerdispatchKeyEvent2);
            }
        }
    }
}
