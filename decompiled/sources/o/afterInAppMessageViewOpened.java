package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.collections.AbstractMap$$ExternalSyntheticLambda0;
import kotlinx.serialization.internal.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class afterInAppMessageViewOpened implements setGraphicModalMaxWidthDp {
    public final setGraphicModalMaxWidthDp RemoteActionCompatParcelizer;
    public final getAppropriateModalView read;
    public final setGraphicModalMaxWidthDp serializer;
    public final setGraphicModalMaxWidthDp write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return this.read;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        getAppropriateModalView getappropriatemodalview = this.read;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(getappropriatemodalview);
        createinappmessageviewlambda1Serializer.getClass();
        Object obj = TuplesKt.RemoteActionCompatParcelizer;
        Object objIconCompatParcelizer = obj;
        Object objIconCompatParcelizer2 = objIconCompatParcelizer;
        Object objIconCompatParcelizer3 = objIconCompatParcelizer2;
        while (true) {
            int i = createinappmessageviewlambda1Serializer.read(getappropriatemodalview);
            if (i == -1) {
                createinappmessageviewlambda1Serializer.write(getappropriatemodalview);
                if (objIconCompatParcelizer == obj) {
                    DrawableTransformation.serializer("Element 'first' is missing");
                    return null;
                }
                if (objIconCompatParcelizer2 == obj) {
                    DrawableTransformation.serializer("Element 'second' is missing");
                    return null;
                }
                if (objIconCompatParcelizer3 != obj) {
                    return new ContentCardAdapterExternalSyntheticLambda0(objIconCompatParcelizer, objIconCompatParcelizer2, objIconCompatParcelizer3);
                }
                DrawableTransformation.serializer("Element 'third' is missing");
                return null;
            }
            if (i == 0) {
                objIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(getappropriatemodalview, 0, this.write, null);
            } else if (i == 1) {
                objIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(getappropriatemodalview, 1, this.RemoteActionCompatParcelizer, null);
            } else {
                if (i != 2) {
                    DrawableTransformation.serializer(c8$$ExternalSyntheticOutline0.m(i, "Unexpected index "));
                    return null;
                }
                objIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(getappropriatemodalview, 2, this.serializer, null);
            }
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        ContentCardAdapterExternalSyntheticLambda0 contentCardAdapterExternalSyntheticLambda0 = (ContentCardAdapterExternalSyntheticLambda0) obj;
        contentCardAdapterExternalSyntheticLambda0.getClass();
        getAppropriateModalView getappropriatemodalview = this.read;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(getappropriatemodalview);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(getappropriatemodalview, 0, this.write, contentCardAdapterExternalSyntheticLambda0.serializer);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(getappropriatemodalview, 1, this.RemoteActionCompatParcelizer, contentCardAdapterExternalSyntheticLambda0.RemoteActionCompatParcelizer);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(getappropriatemodalview, 2, this.serializer, contentCardAdapterExternalSyntheticLambda0.IconCompatParcelizer);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(getappropriatemodalview);
    }

    public afterInAppMessageViewOpened(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3) {
        getAppropriateModalView getappropriatemodalview;
        setgraphicmodalmaxwidthdp.getClass();
        setgraphicmodalmaxwidthdp2.getClass();
        setgraphicmodalmaxwidthdp3.getClass();
        this.write = setgraphicmodalmaxwidthdp;
        this.RemoteActionCompatParcelizer = setgraphicmodalmaxwidthdp2;
        this.serializer = setgraphicmodalmaxwidthdp3;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] r8lambda92m0p9sit5uf70mvjf4rwmrudaArr = new r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[0];
        AbstractMap$$ExternalSyntheticLambda0 abstractMap$$ExternalSyntheticLambda0 = new AbstractMap$$ExternalSyntheticLambda0(6, this);
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) "kotlin.Triple")) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Blank serial names are prohibited");
            getappropriatemodalview = null;
        } else {
            r8lambdaXTprrz59IiooUoChp937ds3kuBc r8lambdaxtprrz59iioouochp937ds3kubc = new r8lambdaXTprrz59IiooUoChp937ds3kuBc("kotlin.Triple");
            abstractMap$$ExternalSyntheticLambda0.invoke(r8lambdaxtprrz59iioouochp937ds3kubc);
            getappropriatemodalview = new getAppropriateModalView("kotlin.Triple", r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer, r8lambdaxtprrz59iioouochp937ds3kubc.serializer.size(), onContentCardClicked.RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmrudaArr), r8lambdaxtprrz59iioouochp937ds3kubc);
        }
        this.read = getappropriatemodalview;
    }
}
