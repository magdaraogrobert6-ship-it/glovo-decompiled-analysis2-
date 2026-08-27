package kotlinx.serialization.protobuf.internal;

import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.UriKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.SerializationException;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DrawableTransformation;
import o.createInAppMessageViewlambda0;
import o.prepareInAppMessageWithZippedAssetHtmllambda4;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambda9BrKsFW1DpyR2JCA3azkTb5ZXA;
import o.r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
public final class OneOfPolymorphicEncoder extends ProtobufEncoder {
    public final setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOfPolymorphicEncoder(prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        super(prepareinappmessagewithzippedassethtmllambda4, sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        prepareinappmessagewithzippedassethtmllambda4.getClass();
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.write = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        if (r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer() instanceof createInAppMessageViewlambda0) {
            return;
        }
        DrawableTransformation.IconCompatParcelizer("The serializer of one of type ", r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(), " should be using generic polymorphic serializer, but got ", r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), 46);
        throw null;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufEncoder, o.DefaultInAppMessageViewWrapperFactory
    public final DefaultInAppMessageViewWrapperFactory RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        MediaBrowserCompatMediaItem((RemoteActionCompatParcelizer() & 1152921500311879680L) | ((long) ((int) (UriKt.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0) & 2147483647L))));
        return this;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufEncoder, o.DefaultInAppMessageViewWrapperFactory
    public final DefaultInAppMessageSlideupViewFactory serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (r8lambda92m0p9sit5uf70mvjf4rwmruda.equals(this.IconCompatParcelizer)) {
            return this;
        }
        prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = this.MediaSessionCompatQueueItem;
        prepareinappmessagewithzippedassethtmllambda4.getClass();
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.write;
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        r8lambda9BrKsFW1DpyR2JCA3azkTb5ZXA r8lambda9brksfw1dpyr2jca3azktb5zxa = new r8lambda9BrKsFW1DpyR2JCA3azkTb5ZXA(prepareinappmessagewithzippedassethtmllambda4, sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        if (r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer() != 1) {
            DrawableTransformation.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer(), r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(), " should contain only 1 element, but get ", "Implementation of oneOf type ");
            return null;
        }
        List listSerializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSerializer) {
            if (obj instanceof r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw) {
                arrayList.add(obj);
            }
        }
        if (((r8lambdaSyfvZzB8bo4UhFcC48uuJ5_ycw) (arrayList.size() == 1 ? arrayList.get(0) : null)) != null) {
            return r8lambda9brksfw1dpyr2jca3azktb5zxa;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Implementation of oneOf type ", r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer(), " should have @ProtoNumber annotation");
        return null;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufEncoder
    public final long IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (i == 0) {
            return 19501L;
        }
        if (i == 1) {
            return UriKt.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
        }
        StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i, "Unsupported index: ", " in a oneOf type ");
        sbM.append(r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer());
        sbM.append(", which should be using generic polymorphic serializer");
        throw new SerializationException(sbM.toString());
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufEncoder
    public final void write(long j, String str) {
        str.getClass();
        if (j != 19501) {
            super.write(j, str);
        }
    }
}
