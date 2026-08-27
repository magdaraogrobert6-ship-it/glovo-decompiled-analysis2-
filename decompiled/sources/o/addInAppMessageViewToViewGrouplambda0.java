package o;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;

/* JADX INFO: loaded from: classes4.dex */
public final class addInAppMessageViewToViewGrouplambda0 extends AbstractCollection {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final getContentCardsViewFromCache read;

    public /* synthetic */ addInAppMessageViewToViewGrouplambda0(getContentCardsViewFromCache getcontentcardsviewfromcache, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = getcontentcardsviewfromcache;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.RemoteActionCompatParcelizer;
        getContentCardsViewFromCache getcontentcardsviewfromcache = this.read;
        if (i != 0) {
            return i != 1 ? ((addInAppMessageViewToViewGrouplambda20) getcontentcardsviewfromcache).containsValue(obj) : ((getSizeYbymL2gui) getcontentcardsviewfromcache).containsValue(obj);
        }
        return ((r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg) getcontentcardsviewfromcache).containsValue(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        int i = this.RemoteActionCompatParcelizer;
        getContentCardsViewFromCache getcontentcardsviewfromcache = this.read;
        if (i != 0) {
            return i != 1 ? ((addInAppMessageViewToViewGrouplambda20) getcontentcardsviewfromcache).size() : ((getSizeYbymL2gui) getcontentcardsviewfromcache).size();
        }
        return ((r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg) getcontentcardsviewfromcache).size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.RemoteActionCompatParcelizer;
        getContentCardsViewFromCache getcontentcardsviewfromcache = this.read;
        int i2 = 0;
        if (i == 0) {
            r8lambdazCa9f5hibLISCeY3u5lKyCauzY r8lambdazca9f5hibliscey3u5lkycauzy = ((r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg) getcontentcardsviewfromcache).IconCompatParcelizer;
            r8lambdazca9f5hibliscey3u5lkycauzy.getClass();
            accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[] accessgetshouldignoreopenandcloselifecyclecallbackspArr = new accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[8];
            while (i2 < 8) {
                accessgetshouldignoreopenandcloselifecyclecallbackspArr[i2] = new addInAppMessageViewToViewGrouplambda1(2);
                i2++;
            }
            return new addDismissRunnablelambda0(r8lambdazca9f5hibliscey3u5lkycauzy, accessgetshouldignoreopenandcloselifecyclecallbackspArr);
        }
        if (i != 1) {
            return new addInAppMessageViewToViewGrouplambda5((addInAppMessageViewToViewGrouplambda20) getcontentcardsviewfromcache, 2);
        }
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m = ((getSizeYbymL2gui) getcontentcardsviewfromcache).RemoteActionCompatParcelizer;
        startDragAndDropTransferd4ec7I[] startdraganddroptransferd4ec7iArr = new startDragAndDropTransferd4ec7I[8];
        while (i2 < 8) {
            startdraganddroptransferd4ec7iArr[i2] = new DragAndDropNodeCompanion(2);
            i2++;
        }
        return new setSizeozmzZPIui(requestdraganddroptransferk4lq0m, startdraganddroptransferd4ec7iArr);
    }
}
