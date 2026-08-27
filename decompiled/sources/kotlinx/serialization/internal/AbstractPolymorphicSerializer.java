package kotlinx.serialization.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DrawableTransformation;
import o.createInAppMessageViewlambda1;
import o.getUnregisteredInAppMessageannotations;
import o.pauseWebviewIfNecessarylambda10;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractPolymorphicSerializer implements setGraphicModalMaxWidthDp {
    public abstract getUnregisteredInAppMessageannotations read();

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        obj.getClass();
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = kotlin.TuplesKt.serializer(this, defaultInAppMessageViewWrapperFactory, obj);
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(descriptor);
        defaultInAppMessageSlideupViewFactorySerializer.serializer(getDescriptor(), 0, setgraphicmodalmaxwidthdpSerializer.getDescriptor().serializer());
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(getDescriptor(), 1, setgraphicmodalmaxwidthdpSerializer, obj);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(descriptor);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor);
        createinappmessageviewlambda1Serializer.getClass();
        Object objIconCompatParcelizer = null;
        String strMediaMetadataCompat = null;
        while (true) {
            int i = createinappmessageviewlambda1Serializer.read(getDescriptor());
            if (i == -1) {
                if (objIconCompatParcelizer != null) {
                    createinappmessageviewlambda1Serializer.write(descriptor);
                    return objIconCompatParcelizer;
                }
                DrawableTransformation.serializer((Object) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Polymorphic value has not been read for class ", strMediaMetadataCompat));
                return null;
            }
            if (i == 0) {
                strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(getDescriptor(), i);
            } else {
                if (i != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strMediaMetadataCompat == null) {
                        strMediaMetadataCompat = "unknown class";
                    }
                    sb.append(strMediaMetadataCompat);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(i);
                    throw new SerializationException(sb.toString());
                }
                if (strMediaMetadataCompat == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot read polymorphic value before its type token");
                    return null;
                }
                objIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(getDescriptor(), i, kotlin.TuplesKt.IconCompatParcelizer(this, createinappmessageviewlambda1Serializer, strMediaMetadataCompat), null);
            }
        }
    }

    public setGraphicModalMaxWidthDp read(createInAppMessageViewlambda1 createinappmessageviewlambda1, String str) {
        prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtmlMediaSessionCompatQueueItem = createinappmessageviewlambda1.MediaSessionCompatQueueItem();
        getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations = read();
        prepareinappmessagewithzippedassethtmlMediaSessionCompatQueueItem.getClass();
        getunregisteredinappmessageannotations.getClass();
        Map map = (Map) prepareinappmessagewithzippedassethtmlMediaSessionCompatQueueItem.IconCompatParcelizer.get(getunregisteredinappmessageannotations);
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = map != null ? (setGraphicModalMaxWidthDp) map.get(str) : null;
        if (!(setgraphicmodalmaxwidthdp instanceof setGraphicModalMaxWidthDp)) {
            setgraphicmodalmaxwidthdp = null;
        }
        if (setgraphicmodalmaxwidthdp != null) {
            return setgraphicmodalmaxwidthdp;
        }
        Object obj = prepareinappmessagewithzippedassethtmlMediaSessionCompatQueueItem.serializer.get(getunregisteredinappmessageannotations);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = pauseWebviewIfNecessarylambda10.write(1, obj) ? (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj : null;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            return (setGraphicModalMaxWidthDp) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str);
        }
        return null;
    }

    public setGraphicModalMaxWidthDp serializer(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        obj.getClass();
        return defaultInAppMessageViewWrapperFactory.MediaSessionCompatQueueItem().read(read(), obj);
    }
}
