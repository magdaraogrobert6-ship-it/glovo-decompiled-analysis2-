package o;

import java.util.List;
import java.util.Map;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class DefaultInAppMessageFullViewFactoryCompanion implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int read;
    public final /* synthetic */ DefaultInAppMessageHtmlFullViewFactory serializer;

    public /* synthetic */ DefaultInAppMessageFullViewFactoryCompanion(DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory, int i) {
        this.read = i;
        this.serializer = defaultInAppMessageHtmlFullViewFactory;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        DefaultInAppMessageHtmlFullViewFactory defaultInAppMessageHtmlFullViewFactory = this.serializer;
        r8lambdaXTprrz59IiooUoChp937ds3kuBc r8lambdaxtprrz59iioouochp937ds3kubc = (r8lambdaXTprrz59IiooUoChp937ds3kuBc) obj;
        if (i != 0) {
            r8lambdaxtprrz59iioouochp937ds3kubc.getClass();
            for (Map.Entry entry : defaultInAppMessageHtmlFullViewFactory.read.entrySet()) {
                r8lambdaxtprrz59iioouochp937ds3kubc.write((String) entry.getKey(), ((setGraphicModalMaxWidthDp) entry.getValue()).getDescriptor());
            }
            return createfromparcel;
        }
        r8lambdaxtprrz59iioouochp937ds3kubc.getClass();
        r8lambdaxtprrz59iioouochp937ds3kubc.write("type", beforeInAppMessageViewClosed.read);
        r8lambdaxtprrz59iioouochp937ds3kubc.write("value", RangesKt.write("kotlinx.serialization.Sealed<" + defaultInAppMessageHtmlFullViewFactory.serializer.IconCompatParcelizer() + '>', createInAppMessageViewlambda10.write, new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0], new DefaultInAppMessageFullViewFactoryCompanion(defaultInAppMessageHtmlFullViewFactory, 1)));
        List list = defaultInAppMessageHtmlFullViewFactory.RemoteActionCompatParcelizer;
        list.getClass();
        r8lambdaxtprrz59iioouochp937ds3kubc.write = list;
        return createfromparcel;
    }
}
