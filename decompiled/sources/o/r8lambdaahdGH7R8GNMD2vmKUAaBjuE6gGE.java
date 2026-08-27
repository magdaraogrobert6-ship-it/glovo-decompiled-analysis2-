package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import java.util.Map;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.internal.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE implements setGraphicModalMaxWidthDp {
    public final /* synthetic */ int IconCompatParcelizer;
    public final setGraphicModalMaxWidthDp RemoteActionCompatParcelizer;
    public final setGraphicModalMaxWidthDp serializer;
    public final getAppropriateModalView write;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2, int i) {
        this(setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2, (byte) 0);
        this.IconCompatParcelizer = i;
        setgraphicmodalmaxwidthdp.getClass();
        setgraphicmodalmaxwidthdp2.getClass();
        if (i == 1) {
            this(setgraphicmodalmaxwidthdp, setgraphicmodalmaxwidthdp2, (byte) 0);
            this.write = RangesKt.write("kotlin.collections.Map.Entry", r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer, new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0], new TncContentKt$$ExternalSyntheticLambda1(setgraphicmodalmaxwidthdp, 24, setgraphicmodalmaxwidthdp2));
            return;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] r8lambda92m0p9sit5uf70mvjf4rwmrudaArr = new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0];
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) "kotlin.Pair")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Blank serial names are prohibited");
            throw null;
        }
        r8lambdaXTprrz59IiooUoChp937ds3kuBc r8lambdaxtprrz59iioouochp937ds3kubc = new r8lambdaXTprrz59IiooUoChp937ds3kuBc("kotlin.Pair");
        r8lambdaxtprrz59iioouochp937ds3kubc.write("first", setgraphicmodalmaxwidthdp.getDescriptor());
        r8lambdaxtprrz59iioouochp937ds3kubc.write("second", setgraphicmodalmaxwidthdp2.getDescriptor());
        this.write = new getAppropriateModalView("kotlin.Pair", r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer, r8lambdaxtprrz59iioouochp937ds3kubc.serializer.size(), onContentCardClicked.RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmrudaArr), r8lambdaxtprrz59iioouochp937ds3kubc);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor);
        createinappmessageviewlambda1Serializer.getClass();
        Object obj = TuplesKt.RemoteActionCompatParcelizer;
        Object objIconCompatParcelizer = obj;
        Object objIconCompatParcelizer2 = objIconCompatParcelizer;
        while (true) {
            int i = createinappmessageviewlambda1Serializer.read(getDescriptor());
            if (i == -1) {
                if (objIconCompatParcelizer == obj) {
                    DrawableTransformation.serializer("Element 'key' is missing");
                    return null;
                }
                if (objIconCompatParcelizer2 == obj) {
                    DrawableTransformation.serializer("Element 'value' is missing");
                    return null;
                }
                Object defaultInAppMessageViewLifecycleListenerWhenMappings = this.IconCompatParcelizer != 0 ? new DefaultInAppMessageViewLifecycleListenerWhenMappings(objIconCompatParcelizer, objIconCompatParcelizer2) : new onViewAttachedToWindowlambda0(objIconCompatParcelizer, objIconCompatParcelizer2);
                createinappmessageviewlambda1Serializer.write(descriptor);
                return defaultInAppMessageViewLifecycleListenerWhenMappings;
            }
            if (i == 0) {
                objIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(getDescriptor(), 0, this.RemoteActionCompatParcelizer, null);
            } else {
                if (i != 1) {
                    DrawableTransformation.serializer(c8$$ExternalSyntheticOutline0.m(i, "Invalid index: "));
                    return null;
                }
                objIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(getDescriptor(), 1, this.serializer, null);
            }
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        Object key;
        Object value;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(getDescriptor());
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = this.RemoteActionCompatParcelizer;
        int i = this.IconCompatParcelizer;
        if (i != 0) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            key = entry.getKey();
        } else {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) obj;
            onviewattachedtowindowlambda0.getClass();
            key = onviewattachedtowindowlambda0.serializer;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor, 0, setgraphicmodalmaxwidthdp, key);
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor2 = getDescriptor();
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = this.serializer;
        if (i != 0) {
            Map.Entry entry2 = (Map.Entry) obj;
            entry2.getClass();
            value = entry2.getValue();
        } else {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = (onViewAttachedToWindowlambda0) obj;
            onviewattachedtowindowlambda1.getClass();
            value = onviewattachedtowindowlambda1.write;
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor2, 1, setgraphicmodalmaxwidthdp2, value);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(getDescriptor());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.IconCompatParcelizer != 0 ? this.write : this.write;
    }

    public r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2, byte b) {
        this.RemoteActionCompatParcelizer = setgraphicmodalmaxwidthdp;
        this.serializer = setgraphicmodalmaxwidthdp2;
    }
}
