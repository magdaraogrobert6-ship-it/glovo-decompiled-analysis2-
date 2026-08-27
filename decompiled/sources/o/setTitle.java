package o;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class setTitle implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ setTitle(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.IconCompatParcelizer;
        if (i == 0) {
            androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = (androidx.appcompat.widget.AppCompatSpinner) obj;
            if (!appCompatSpinner.getInternalPopup().serializer()) {
                appCompatSpinner.serializer.write(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                return;
            }
            return;
        }
        if (i == 1) {
            r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0 r8lambdatwvtypfkihdx0rbtwvlevvlt0 = (r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0) obj;
            ArrayList arrayList = r8lambdatwvtypfkihdx0rbtwvlevvlt0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (!r8lambdatwvtypfkihdx0rbtwvlevvlt0.serializer() || arrayList.size() <= 0 || ((dispatchResult) arrayList.get(0)).IconCompatParcelizer.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
                return;
            }
            View view = r8lambdatwvtypfkihdx0rbtwvlevvlt0.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            if (view == null || !view.isShown()) {
                r8lambdatwvtypfkihdx0rbtwvlevvlt0.RemoteActionCompatParcelizer();
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((dispatchResult) it.next()).IconCompatParcelizer.b_();
            }
            return;
        }
        if (i == 2) {
            getSupportParentActivityIntent getsupportparentactivityintent = (getSupportParentActivityIntent) obj;
            getSupportBackgroundTintList getsupportbackgroundtintlist = getsupportparentactivityintent.PlaybackStateCompat;
            if (!getsupportparentactivityintent.serializer() || getsupportbackgroundtintlist.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) {
                return;
            }
            View view2 = getsupportparentactivityintent.ComponentActivity;
            if (view2 == null || !view2.isShown()) {
                getsupportparentactivityintent.RemoteActionCompatParcelizer();
                return;
            } else {
                getsupportbackgroundtintlist.b_();
                return;
            }
        }
        if (i != 3) {
            if (i != 4) {
                ((computeLeftimplui) obj).IconCompatParcelizer.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                return;
            } else {
                ((getStartYimpl) obj).MediaMetadataCompat.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                return;
            }
        }
        getInflater getinflater = (getInflater) obj;
        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner2 = getinflater.read;
        if (!appCompatSpinner2.isAttachedToWindow() || !appCompatSpinner2.getGlobalVisibleRect(getinflater.RemoteActionCompatParcelizer)) {
            getinflater.RemoteActionCompatParcelizer();
        } else {
            getinflater.MediaMetadataCompat();
            getinflater.b_();
        }
    }
}
