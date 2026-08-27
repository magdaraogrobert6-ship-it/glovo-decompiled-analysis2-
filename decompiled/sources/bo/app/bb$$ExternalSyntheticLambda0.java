package bo.app;

import android.content.Context;
import coil3.ComponentRegistry$Builder;
import com.braze.Braze;
import com.braze.configuration.CachedConfigurationProvider;
import com.braze.models.inappmessage.IInAppMessage;
import java.util.Map;
import o.DragAndDropNodeacceptDragAndDropTransfer1;
import o.DragAndDropNodeonMovedinlinedfirstDescendantOrNull1;
import o.InAppMessageBaseViewCompanion;
import o.applyDisplayCutoutMarginsToCloseButton;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.createFromParcel;
import o.getHttpClientfwf_client_release;
import o.getMessageClickableView;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bb$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ bb$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i;
        int i2 = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (i2) {
            case 0:
                return bb.b((td) obj3, (Map) obj2, (JSONObject) obj);
            case 1:
                ((DragAndDropNodeonMovedinlinedfirstDescendantOrNull1) obj3).RemoteActionCompatParcelizer();
                DragAndDropNodeacceptDragAndDropTransfer1 dragAndDropNodeacceptDragAndDropTransfer1 = (DragAndDropNodeacceptDragAndDropTransfer1) ((ComponentRegistry$Builder) obj2).RemoteActionCompatParcelizer;
                int i3 = ((createBrazeUserChangeEventSubscriberlambda01) obj).read;
                do {
                    i = dragAndDropNodeacceptDragAndDropTransfer1.get();
                } while (!dragAndDropNodeacceptDragAndDropTransfer1.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return createFromParcel.INSTANCE;
            case 2:
                return o2.a((o2) obj3, (a4) obj2, (String) obj);
            case 3:
                return o2.a((o2) obj3, (IInAppMessage) obj2, (String) obj);
            case 4:
                return z7.a((z7) obj3, (Class) obj2, obj);
            case 5:
                return Braze.changeUser$lambda$1((String) obj3, (Braze) obj2, (String) obj);
            case 6:
                return CachedConfigurationProvider.readResourceValue$lambda$2((l3) obj3, (String) obj2, obj);
            case 7:
                return com.braze.storage.f.a((Context) obj3, (String) obj2, (String) obj);
            default:
                getHttpClientfwf_client_release gethttpclientfwf_client_release = ((InAppMessageBaseViewCompanion) obj3).certificateChainCleaner;
                gethttpclientfwf_client_release.getClass();
                return gethttpclientfwf_client_release.IconCompatParcelizer(((getMessageClickableView) obj).url.host, ((applyDisplayCutoutMarginsToCloseButton) obj2).RemoteActionCompatParcelizer());
        }
    }
}
