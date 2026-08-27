package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class nowInSeconds extends FrameLayout {
    public final getDefaultJoinLxFBmk8 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nowInSeconds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View.inflate(context, com.logistics.rider.glovo.R.layout.layout_summation, this);
        int i = com.logistics.rider.glovo.R.id.layout_summation_expanded_tile_view;
        r8lambda2VqJyNr4bqey7SJ2sPucklkqufo r8lambda2vqjynr4bqey7sj2spucklkqufo = (r8lambda2VqJyNr4bqey7SJ2sPucklkqufo) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_summation_expanded_tile_view, this);
        if (r8lambda2vqjynr4bqey7sj2spucklkqufo != null) {
            i = com.logistics.rider.glovo.R.id.layout_summation_horizontal_tile_list_view;
            HandlerUtils handlerUtils = (HandlerUtils) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.layout_summation_horizontal_tile_list_view, this);
            if (handlerUtils != null) {
                this.write = new getDefaultJoinLxFBmk8(this, r8lambda2vqjynr4bqey7sj2spucklkqufo, handlerUtils, 3);
                return;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void setSummation(nowInSecondsPrecise nowinsecondsprecise) {
        nowinsecondsprecise.getClass();
        ArrayList<parseDatelambda0> arrayList = nowinsecondsprecise.IconCompatParcelizer;
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (parseDatelambda0 parsedatelambda0 : arrayList) {
            arrayList2.add(new getRandom(parsedatelambda0.write, parsedatelambda0.IconCompatParcelizer, parsedatelambda0.RemoteActionCompatParcelizer));
        }
        r8lambdaggfEkPE61mQohm49Y8NPYjeuyH0 r8lambdaggfekpe61mqohm49y8npyjeuyh0 = new r8lambdaggfEkPE61mQohm49Y8NPYjeuyH0(arrayList2);
        getDefaultJoinLxFBmk8 getdefaultjoinlxfbmk8 = this.write;
        r8lambda2VqJyNr4bqey7SJ2sPucklkqufo r8lambda2vqjynr4bqey7sj2spucklkqufo = (r8lambda2VqJyNr4bqey7SJ2sPucklkqufo) getdefaultjoinlxfbmk8.read;
        HandlerUtils handlerUtils = (HandlerUtils) getdefaultjoinlxfbmk8.write;
        r8lambda2vqjynr4bqey7sj2spucklkqufo.setVisibility(8);
        handlerUtils.setVisibility(0);
        handlerUtils.setTiles(r8lambdaggfekpe61mqohm49y8npyjeuyh0);
    }
}
