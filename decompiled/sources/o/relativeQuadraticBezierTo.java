package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class relativeQuadraticBezierTo implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ relativeQuadraticBezierTo(createInAppMessageEventSubscriber createinappmessageeventsubscriber, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.serializer;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.RemoteActionCompatParcelizer;
        boolean z = true;
        if (i == 0) {
            String str = (String) obj;
            str.getClass();
            Object obj2 = createinappmessageeventsubscriber.IconCompatParcelizer;
            if (obj2 != null && ((Bundle) obj2).containsKey(str)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) obj;
            swipeDismissTouchListenerVerticalDismissDirection.getClass();
            createinappmessageeventsubscriber.IconCompatParcelizer = swipeDismissTouchListenerVerticalDismissDirection;
            return createFromParcel.INSTANCE;
        }
        androidx.compose.ui.node.TraversableNode traversableNode = (androidx.compose.ui.node.TraversableNode) obj;
        traversableNode.getClass();
        RadioButtonTokens radioButtonTokens = ((ComposeRuntimeError) traversableNode).serializer;
        List list = (List) createinappmessageeventsubscriber.IconCompatParcelizer;
        if (list != null) {
            list.add(radioButtonTokens);
        } else {
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            list = (ArrayList) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new RadioButtonTokens[]{radioButtonTokens}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer);
        }
        createinappmessageeventsubscriber.IconCompatParcelizer = list;
        return androidx.compose.ui.node.TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
    }
}
