package o;

import android.view.View;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class visitScrollCaptureCandidates {
    public final Object RemoteActionCompatParcelizer;
    public int read;
    public final Object serializer;
    public boolean write;

    public void serializer(int i) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.RemoteActionCompatParcelizer;
        java.lang.ref.WeakReference weakReference = sideSheetBehavior.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.read = i;
        if (this.write) {
            return;
        }
        View view = (View) sideSheetBehavior.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.get();
        RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0 = (RxWorker$1$$ExternalSyntheticLambda0) this.serializer;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        view.postOnAnimation(rxWorker$1$$ExternalSyntheticLambda0);
        this.write = true;
    }

    public visitScrollCaptureCandidates(SideSheetBehavior sideSheetBehavior) {
        this.RemoteActionCompatParcelizer = sideSheetBehavior;
        this.serializer = new RxWorker$1$$ExternalSyntheticLambda0(14, this);
    }

    public visitScrollCaptureCandidates(String str, int i, getChildrenForSearch getchildrenforsearch) {
        this.serializer = str;
        this.read = i;
        this.RemoteActionCompatParcelizer = getchildrenforsearch;
        this.write = true;
    }
}
