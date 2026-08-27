package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaVZe7H5z6ClbV3hZjfK9rquExLiM extends AnchoredDragFinishedSignal implements displayInAppMessagelambda122 {
    public final Object IconCompatParcelizer;
    public Object RatingCompat;
    public final /* synthetic */ int serializer = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaVZe7H5z6ClbV3hZjfK9rquExLiM(Map map, Object obj, addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda2) {
        super(obj, 2, addinappmessageviewtoviewgrouplambda2.write);
        map.getClass();
        this.IconCompatParcelizer = map;
        this.RatingCompat = addinappmessageviewtoviewgrouplambda2;
    }

    @Override // o.AnchoredDragFinishedSignal, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.serializer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.IconCompatParcelizer;
        if (i != 0) {
            addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda2 = (addInAppMessageViewToViewGrouplambda2) this.RatingCompat;
            Object obj4 = addinappmessageviewtoviewgrouplambda2.write;
            addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda3 = new addInAppMessageViewToViewGrouplambda2(obj, addinappmessageviewtoviewgrouplambda2.IconCompatParcelizer, addinappmessageviewtoviewgrouplambda2.serializer);
            this.RatingCompat = addinappmessageviewtoviewgrouplambda3;
            ((Map) obj3).put(obj2, addinappmessageviewtoviewgrouplambda3);
            return obj4;
        }
        Object obj5 = this.RatingCompat;
        this.RatingCompat = obj;
        r8lambdaotS9jB7634FKsznRjR0YfctBM r8lambdaots9jb7634fksznrjr0yfctbm = (r8lambdaotS9jB7634FKsznRjR0YfctBM) ((ContentCardsDividerItemDecoration) obj3).read;
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = r8lambdaots9jb7634fksznrjr0yfctbm.read;
        if (!r8lambdayvdweaikwvq_ojtermd5bm8okkq.containsKey(obj2)) {
            return obj5;
        }
        boolean z = r8lambdaots9jb7634fksznrjr0yfctbm.write;
        if (!z) {
            r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj2, obj);
        } else {
            if (!z) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp accessgetshouldignoreopenandcloselifecyclecallbacksp = r8lambdaots9jb7634fksznrjr0yfctbm.RemoteActionCompatParcelizer[r8lambdaots9jb7634fksznrjr0yfctbm.serializer];
            Object obj6 = accessgetshouldignoreopenandcloselifecyclecallbacksp.RemoteActionCompatParcelizer[accessgetshouldignoreopenandcloselifecyclecallbacksp.serializer];
            r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj2, obj);
            r8lambdaots9jb7634fksznrjr0yfctbm.RemoteActionCompatParcelizer(obj6 != null ? obj6.hashCode() : 0, r8lambdayvdweaikwvq_ojtermd5bm8okkq.IconCompatParcelizer, obj6, 0, 0, false);
        }
        r8lambdaots9jb7634fksznrjr0yfctbm.IconCompatParcelizer = r8lambdayvdweaikwvq_ojtermd5bm8okkq.RemoteActionCompatParcelizer;
        return obj5;
    }

    @Override // o.AnchoredDragFinishedSignal, java.util.Map.Entry
    public final Object getValue() {
        return this.serializer != 0 ? ((addInAppMessageViewToViewGrouplambda2) this.RatingCompat).write : this.RatingCompat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaVZe7H5z6ClbV3hZjfK9rquExLiM(ContentCardsDividerItemDecoration contentCardsDividerItemDecoration, Object obj, Object obj2) {
        super(obj, 2, obj2);
        contentCardsDividerItemDecoration.getClass();
        this.IconCompatParcelizer = contentCardsDividerItemDecoration;
        this.RatingCompat = obj2;
    }
}
