package o;

import kotlinx.serialization.protobuf.internal.ProtobufEncoder;

/* JADX INFO: loaded from: classes4.dex */
public class setButtons extends ProtobufEncoder {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final getDrawable read;
    public final setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release serializer;
    public final long write;

    public setButtons(long j, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4) {
        getDrawable getdrawable = new getDrawable();
        prepareinappmessagewithzippedassethtmllambda4.getClass();
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        super(prepareinappmessagewithzippedassethtmllambda4, new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(23, getdrawable), r8lambda92m0p9sit5uf70mvjf4rwmruda);
        this.write = j;
        this.serializer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        this.read = getdrawable;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufEncoder
    public long IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        if (this.RemoteActionCompatParcelizer != 1) {
            return super.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
        }
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT.getSignature$kotlinx_serialization_protobuf() | 1;
    }

    @Override // kotlinx.serialization.protobuf.internal.ProtobufEncoder
    public void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i = this.RemoteActionCompatParcelizer;
        long j = this.write;
        getDrawable getdrawable = this.read;
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.serializer;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (i != 0) {
            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
            getdrawable.getClass();
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.write(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, (getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write, r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.serializer(getdrawable);
            return;
        }
        if (j == 19500) {
            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.serializer(getdrawable);
            return;
        }
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        getdrawable.getClass();
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.write(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, (getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write, r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.serializer(getdrawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setButtons(prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, long j, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, getDrawable getdrawable) {
        super(prepareinappmessagewithzippedassethtmllambda4, new setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release(23, getdrawable), r8lambda92m0p9sit5uf70mvjf4rwmruda);
        prepareinappmessagewithzippedassethtmllambda4.getClass();
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.serializer = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        this.write = j;
        this.read = getdrawable;
    }
}
