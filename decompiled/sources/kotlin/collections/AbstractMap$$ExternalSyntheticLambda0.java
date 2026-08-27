package kotlin.collections;

import io.reactivex.disposables.Disposable;
import java.util.List;
import java.util.Map;
import kotlin.text.MatcherMatchResult$groups$1;
import kotlinx.coroutines.sync.MutexImpl;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.afterInAppMessageViewOpened;
import o.createFromParcel;
import o.getApplicationContext;
import o.getContentCardsViewFromCache;
import o.onContentCardDismissed;
import o.prepareInAppMessagelambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaXTprrz59IiooUoChp937ds3kuBc;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AbstractMap$$ExternalSyntheticLambda0 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ AbstractMap$$ExternalSyntheticLambda0(MutexImpl mutexImpl, getApplicationContext getapplicationcontext) {
        this.IconCompatParcelizer = 4;
        this.read = mutexImpl;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.read;
        switch (i) {
            case 0:
                getContentCardsViewFromCache getcontentcardsviewfromcache = (getContentCardsViewFromCache) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == getcontentcardsviewfromcache ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != getcontentcardsviewfromcache ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 1:
                return obj == ((AbstractCollection) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 2:
                return ((MatcherMatchResult$groups$1) obj2).RemoteActionCompatParcelizer(((Integer) obj).intValue());
            case 3:
                ((Disposable) obj2).dispose();
                return createfromparcel;
            case 4:
                ((MutexImpl) obj2).write(null);
                return createfromparcel;
            case 5:
                r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(iIntValue) + ": " + r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(iIntValue).serializer();
            case 6:
                afterInAppMessageViewOpened afterinappmessageviewopened = (afterInAppMessageViewOpened) obj2;
                r8lambdaXTprrz59IiooUoChp937ds3kuBc r8lambdaxtprrz59iioouochp937ds3kubc = (r8lambdaXTprrz59IiooUoChp937ds3kuBc) obj;
                r8lambdaxtprrz59iioouochp937ds3kubc.getClass();
                r8lambdaxtprrz59iioouochp937ds3kubc.write("first", afterinappmessageviewopened.write.getDescriptor());
                r8lambdaxtprrz59iioouochp937ds3kubc.write("second", afterinappmessageviewopened.RemoteActionCompatParcelizer.getDescriptor());
                r8lambdaxtprrz59iioouochp937ds3kubc.write("third", afterinappmessageviewopened.serializer.getDescriptor());
                return createfromparcel;
            default:
                prepareInAppMessagelambda0 prepareinappmessagelambda0 = (prepareInAppMessagelambda0) obj2;
                SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) obj;
                swipeDismissTouchListenerVerticalDismissDirection.getClass();
                prepareinappmessagelambda0.write((String) onContentCardDismissed.MediaDescriptionCompat((List) prepareinappmessagelambda0.RatingCompat), swipeDismissTouchListenerVerticalDismissDirection);
                return createfromparcel;
        }
    }

    public /* synthetic */ AbstractMap$$ExternalSyntheticLambda0(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.read = obj;
    }
}
