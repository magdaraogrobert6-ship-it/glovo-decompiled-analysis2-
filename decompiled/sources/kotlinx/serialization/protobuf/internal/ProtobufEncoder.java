package kotlinx.serialization.protobuf.internal;

import coil3.UriKt;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.text.RegexKt;
import kotlinx.serialization.SerializationException;
import o.BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DrawableTransformation;
import o.InAppMessageJavascriptInterfaceCompanion;
import o.InAppMessageJavascriptInterfacerequestPushPermission1ExternalSyntheticLambda0;
import o.closeInAppMessageOnKeycodeBack;
import o.closeInAppMessageOnKeycodeBacklambda0;
import o.createInAppMessageViewlambda0;
import o.getCieXyz;
import o.getDrawable;
import o.isApiBelowBaklavaannotations;
import o.onCloseActionlambda0;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.prepareInAppMessageWithZippedAssetHtmllambda4;
import o.r8lambda3beja5D1e1agNYROvnFsh_QFfAY;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8;
import o.r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE;
import o.r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4;
import o.removeNodeAtDepth;
import o.resetMessageMarginsIfNecessary;
import o.setButton;
import o.setButtons;
import o.setCarryoverInAppMessage;
import o.setGraphicModalMaxWidthDp;
import o.setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release;

/* JADX INFO: loaded from: classes4.dex */
public class ProtobufEncoder extends closeInAppMessageOnKeycodeBack implements DefaultInAppMessageViewWrapperFactory, DefaultInAppMessageSlideupViewFactory {
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA IconCompatParcelizer;
    public final setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release MediaDescriptionCompat;
    public final prepareInAppMessageWithZippedAssetHtmllambda4 MediaSessionCompatQueueItem;
    public closeInAppMessageOnKeycodeBacklambda0 RatingCompat;

    public void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void IconCompatParcelizer() {
        String str;
        closeInAppMessageOnKeycodeBacklambda0 closeinappmessageonkeycodebacklambda0 = this.RatingCompat;
        if (closeinappmessageonkeycodebacklambda0 != closeInAppMessageOnKeycodeBacklambda0.ACCEPTABLE) {
            int i = isApiBelowBaklavaannotations.IconCompatParcelizer[closeinappmessageonkeycodebacklambda0.ordinal()];
            if (i == 1) {
                str = "'null' is not supported for optional properties in ProtoBuf";
            } else if (i == 2) {
                str = "'null' is not supported as the value of collection types in ProtoBuf";
            } else if (i != 3) {
                str = i != 4 ? "'null' is not supported in ProtoBuf" : "'null' is not allowed for not-null properties";
            } else {
                str = "'null' is not supported as the value of a list element in ProtoBuf";
            }
            DrawableTransformation.serializer(str);
        }
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final prepareInAppMessageWithZippedAssetHtml MediaSessionCompatQueueItem() {
        return this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer;
    }

    public ProtobufEncoder(prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4, setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        prepareinappmessagewithzippedassethtmllambda4.getClass();
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.RatingCompat = closeInAppMessageOnKeycodeBacklambda0.NOT_NULL;
        this.MediaSessionCompatQueueItem = prepareinappmessagewithzippedassethtmllambda4;
        this.MediaDescriptionCompat = sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release;
        this.IconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda;
    }

    public long IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return UriKt.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final DefaultInAppMessageViewWrapperFactory IconCompatParcelizer(onCloseActionlambda0 oncloseactionlambda0, int i) {
        oncloseactionlambda0.getClass();
        long jIconCompatParcelizer = IconCompatParcelizer((r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) oncloseactionlambda0, i);
        oncloseactionlambda0.RemoteActionCompatParcelizer(i).getClass();
        MediaBrowserCompatMediaItem(jIconCompatParcelizer);
        return this;
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void IconCompatParcelizer(String str) {
        str.getClass();
        write(read(), str);
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void IconCompatParcelizer(onCloseActionlambda0 oncloseactionlambda0, int i, byte b) {
        oncloseactionlambda0.getClass();
        write((int) b, IconCompatParcelizer((r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) oncloseactionlambda0, i));
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        if (this.ParcelableVolumeInfo >= 0) {
            RemoteActionCompatParcelizer();
        }
        write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, double d) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        serializer(d, IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a2  */
    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        closeInAppMessageOnKeycodeBacklambda0 closeinappmessageonkeycodebacklambda0;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        if (r8lambda92m0p9sit5uf70mvjf4rwmruda.write(i)) {
            closeinappmessageonkeycodebacklambda0 = closeInAppMessageOnKeycodeBacklambda0.OPTIONAL;
        } else {
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(i);
            if (r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
                RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmrudaRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer}, getCieXyz.write())).booleanValue()) {
                    closeinappmessageonkeycodebacklambda0 = closeInAppMessageOnKeycodeBacklambda0.COLLECTION;
                } else {
                    r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8 r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8 = r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8}, getCieXyz.write())).booleanValue()) {
                        closeinappmessageonkeycodebacklambda0 = closeInAppMessageOnKeycodeBacklambda0.COLLECTION;
                    } else {
                        closeinappmessageonkeycodebacklambda0 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8}, getCieXyz.write())).booleanValue() ? closeInAppMessageOnKeycodeBacklambda0.LIST_ELEMENT : closeInAppMessageOnKeycodeBacklambda0.ACCEPTABLE;
                    }
                }
            } else {
                closeinappmessageonkeycodebacklambda0 = closeInAppMessageOnKeycodeBacklambda0.NOT_NULL;
            }
        }
        this.RatingCompat = closeinappmessageonkeycodebacklambda0;
        MediaBrowserCompatMediaItem(IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
        read(setgraphicmodalmaxwidthdp, obj);
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, boolean z) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        write(z ? 1 : 0, IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    public DefaultInAppMessageViewWrapperFactory RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        MediaBrowserCompatMediaItem(RemoteActionCompatParcelizer());
        return this;
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void RemoteActionCompatParcelizer(onCloseActionlambda0 oncloseactionlambda0, int i, char c) {
        oncloseactionlambda0.getClass();
        write((int) c, IconCompatParcelizer((r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) oncloseactionlambda0, i));
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void RemoteActionCompatParcelizer(onCloseActionlambda0 oncloseactionlambda0, int i, short s) {
        oncloseactionlambda0.getClass();
        write((int) s, IconCompatParcelizer((r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) oncloseactionlambda0, i));
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, long j) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        write(IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i), j);
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        long j = read();
        int iIconCompatParcelizer = UriKt.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i, true);
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.MediaDescriptionCompat;
        if (j == 19500) {
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.write(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, (getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write, iIconCompatParcelizer);
        } else {
            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write(iIconCompatParcelizer, (int) (j & 2147483647L), BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0098  */
    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        closeInAppMessageOnKeycodeBacklambda0 closeinappmessageonkeycodebacklambda0;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        if (r8lambda92m0p9sit5uf70mvjf4rwmruda.write(i)) {
            closeinappmessageonkeycodebacklambda0 = closeInAppMessageOnKeycodeBacklambda0.OPTIONAL;
        } else {
            RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(i).RemoteActionCompatParcelizer();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer}, getCieXyz.write())).booleanValue()) {
                closeinappmessageonkeycodebacklambda0 = closeInAppMessageOnKeycodeBacklambda0.COLLECTION;
            } else {
                r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8 r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8 = r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8}, getCieXyz.write())).booleanValue()) {
                    closeinappmessageonkeycodebacklambda0 = closeInAppMessageOnKeycodeBacklambda0.COLLECTION;
                } else {
                    closeinappmessageonkeycodebacklambda0 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8}, getCieXyz.write())).booleanValue() ? closeInAppMessageOnKeycodeBacklambda0.LIST_ELEMENT : closeInAppMessageOnKeycodeBacklambda0.ACCEPTABLE;
                }
            }
        }
        this.RatingCompat = closeinappmessageonkeycodebacklambda0;
        MediaBrowserCompatMediaItem(IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
        super.write(setgraphicmodalmaxwidthdp, obj);
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void read(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        setgraphicmodalmaxwidthdp.getClass();
        if (!(setgraphicmodalmaxwidthdp instanceof r8lambda3beja5D1e1agNYROvnFsh_QFfAY)) {
            Object[] objArr = {setgraphicmodalmaxwidthdp.getDescriptor(), InAppMessageJavascriptInterfacerequestPushPermission1ExternalSyntheticLambda0.IconCompatParcelizer.RatingCompat};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                setgraphicmodalmaxwidthdp.serialize(this, obj);
                return;
            }
            obj.getClass();
            byte[] bArr = (byte[]) obj;
            long j = read();
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.MediaDescriptionCompat;
            if (j == 19500) {
                sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.IconCompatParcelizer(bArr);
                return;
            }
            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.write(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, (getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write, r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.IconCompatParcelizer(bArr);
            return;
        }
        r8lambda3beja5D1e1agNYROvnFsh_QFfAY r8lambda3beja5d1e1agnyrovnfsh_qffay = (r8lambda3beja5D1e1agNYROvnFsh_QFfAY) setgraphicmodalmaxwidthdp;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = r8lambda3beja5d1e1agnyrovnfsh_qffay.IconCompatParcelizer;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = r8lambda3beja5d1e1agnyrovnfsh_qffay.write;
        setgraphicmodalmaxwidthdp2.getClass();
        setgraphicmodalmaxwidthdp3.getClass();
        r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE r8lambdaahdgh7r8gnmd2vmkuaabjue6gge = new r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE(setgraphicmodalmaxwidthdp2, setgraphicmodalmaxwidthdp3, 1);
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = r8lambdaahdgh7r8gnmd2vmkuaabjue6gge.getDescriptor();
        descriptor.getClass();
        InAppMessageJavascriptInterfaceCompanion inAppMessageJavascriptInterfaceCompanion = new InAppMessageJavascriptInterfaceCompanion(descriptor, 1);
        obj.getClass();
        Set setEntrySet = ((Map) obj).entrySet();
        setEntrySet.getClass();
        int size = setEntrySet.size();
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactoryWrite = write(inAppMessageJavascriptInterfaceCompanion, size);
        setEntrySet.getClass();
        Iterator it = setEntrySet.iterator();
        for (int i = 0; i < size; i++) {
            defaultInAppMessageSlideupViewFactoryWrite.IconCompatParcelizer(inAppMessageJavascriptInterfaceCompanion, i, r8lambdaahdgh7r8gnmd2vmkuaabjue6gge, it.next());
        }
        defaultInAppMessageSlideupViewFactoryWrite.IconCompatParcelizer(inAppMessageJavascriptInterfaceCompanion);
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final boolean read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.MediaSessionCompatQueueItem.getClass();
        return false;
    }

    public DefaultInAppMessageSlideupViewFactory serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            if (!UriKt.read(r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(0)) || (serializer() & 4294967296L) == 0) {
                return new resetMessageMarginsIfNecessary(serializer(), this.MediaDescriptionCompat, r8lambda92m0p9sit5uf70mvjf4rwmruda, this.MediaSessionCompatQueueItem);
            }
            return new PackedArrayEncoder(serializer(), this.MediaDescriptionCompat, r8lambda92m0p9sit5uf70mvjf4rwmruda, this.MediaSessionCompatQueueItem);
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.write}, getCieXyz.write())).booleanValue() && !(regexKtRemoteActionCompatParcelizer instanceof createInAppMessageViewlambda0)) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer}, getCieXyz.write())).booleanValue()) {
                    return new setButton(serializer(), this.MediaDescriptionCompat, r8lambda92m0p9sit5uf70mvjf4rwmruda, this.MediaSessionCompatQueueItem);
                }
                throw new SerializationException("This serial kind is not supported as structure: " + r8lambda92m0p9sit5uf70mvjf4rwmruda);
            }
        }
        long jSerializer = serializer();
        if (jSerializer == 19500 && r8lambda92m0p9sit5uf70mvjf4rwmruda.equals(this.IconCompatParcelizer)) {
            return this;
        }
        boolean zIconCompatParcelizer = UriKt.IconCompatParcelizer(jSerializer);
        prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = this.MediaSessionCompatQueueItem;
        return zIconCompatParcelizer ? new OneOfPolymorphicEncoder(prepareinappmessagewithzippedassethtmllambda4, this.MediaDescriptionCompat, r8lambda92m0p9sit5uf70mvjf4rwmruda) : new setButtons(serializer(), this.MediaDescriptionCompat, r8lambda92m0p9sit5uf70mvjf4rwmruda, prepareinappmessagewithzippedassethtmllambda4);
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, String str) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        str.getClass();
        write(IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i), str);
    }

    public DefaultInAppMessageSlideupViewFactory write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer();
        r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8 r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8 = r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8}, getCieXyz.write())).booleanValue()) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer}, getCieXyz.write())).booleanValue()) {
                return new setButton(this.PlaybackStateCompat[this.ParcelableVolumeInfo], this.MediaDescriptionCompat, r8lambda92m0p9sit5uf70mvjf4rwmruda, this.MediaSessionCompatQueueItem);
            }
            throw new SerializationException("This serial kind is not supported as collection: " + r8lambda92m0p9sit5uf70mvjf4rwmruda);
        }
        long jSerializer = serializer();
        if ((4294967296L & jSerializer) != 0 && UriKt.read(r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(0))) {
            return new PackedArrayEncoder(serializer(), this.MediaDescriptionCompat, r8lambda92m0p9sit5uf70mvjf4rwmruda, this.MediaSessionCompatQueueItem);
        }
        if (jSerializer == 19500) {
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.MediaDescriptionCompat;
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.write(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, (getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write, i);
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = this.IconCompatParcelizer;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda2.RemoteActionCompatParcelizer(), r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8}, getCieXyz.write())).booleanValue() || jSerializer == 19500 || r8lambda92m0p9sit5uf70mvjf4rwmruda2.equals(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            return new resetMessageMarginsIfNecessary(jSerializer, this.MediaDescriptionCompat, r8lambda92m0p9sit5uf70mvjf4rwmruda, this.MediaSessionCompatQueueItem);
        }
        return new setButtons(this.MediaSessionCompatQueueItem, this.MediaDescriptionCompat, jSerializer, r8lambda92m0p9sit5uf70mvjf4rwmruda, new getDrawable());
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void write(int i, int i2, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        write(i2, IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.DefaultInAppMessageSlideupViewFactory
    public final void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, float f) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        read(f, IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(byte b) {
        write((int) b, read());
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(char c) {
        write((int) c, read());
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(double d) {
        serializer(d, read());
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void RemoteActionCompatParcelizer(boolean z) {
        write(z ? 1 : 0, read());
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void read(float f) {
        read(f, read());
    }

    public final void read(float f, long j) {
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.MediaDescriptionCompat;
        if (j == 19500) {
            ((getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write).IconCompatParcelizer(Integer.reverseBytes(Float.floatToRawIntBits(f)));
            return;
        }
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.write(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, (getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write, r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.i32.wireIntWithTag((int) (j & 2147483647L)));
        ((getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write).IconCompatParcelizer(Integer.reverseBytes(Float.floatToRawIntBits(f)));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void read(int i) {
        write(i, read());
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void read(short s) {
        write((int) s, read());
    }

    public final void serializer(double d, long j) {
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.MediaDescriptionCompat;
        if (j == 19500) {
            ((getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write).write(Long.reverseBytes(Double.doubleToRawLongBits(d)));
            return;
        }
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.write(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, (getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write, r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.i64.wireIntWithTag((int) (j & 2147483647L)));
        ((getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write).write(Long.reverseBytes(Double.doubleToRawLongBits(d)));
    }

    @Override // o.DefaultInAppMessageViewWrapperFactory
    public final void serializer(long j) {
        write(read(), j);
    }

    public final void write(int i, long j) {
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.MediaDescriptionCompat;
        if (j == 19500) {
            setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.write(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, (getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write, i);
        } else {
            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write(i, (int) (2147483647L & j), UriKt.write(j));
        }
    }

    public final void write(long j, long j2) {
        r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 r8lambdara3i0udadsld9ycgatzf3t4ge4;
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.MediaDescriptionCompat;
        if (j == 19500) {
            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write((getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write, j2, BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
            return;
        }
        int i = (int) (2147483647L & j);
        BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2 backgroundInAppMessagePreparerdisplayPreparedInAppMessage2Write = UriKt.write(j);
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        getDrawable getdrawable = (getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write;
        backgroundInAppMessagePreparerdisplayPreparedInAppMessage2Write.getClass();
        if (backgroundInAppMessagePreparerdisplayPreparedInAppMessage2Write == BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.FIXED) {
            r8lambdara3i0udadsld9ycgatzf3t4ge4 = r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.i64;
        } else {
            r8lambdara3i0udadsld9ycgatzf3t4ge4 = r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.VARINT;
        }
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.write(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, getdrawable, r8lambdara3i0udadsld9ycgatzf3t4ge4.wireIntWithTag(i));
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write(getdrawable, j2, backgroundInAppMessagePreparerdisplayPreparedInAppMessage2Write);
    }

    public void write(long j, String str) {
        str.getClass();
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release = this.MediaDescriptionCompat;
        if (j == 19500) {
            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
            sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.IconCompatParcelizer(setCarryoverInAppMessage.RatingCompat(str));
            return;
        }
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.getClass();
        byte[] bArrRatingCompat = setCarryoverInAppMessage.RatingCompat(str);
        setHtmlInAppMessageHtmlLinkTargetEnabledandroid_sdk_base_release.write(sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release, (getDrawable) sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.write, r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.SIZE_DELIMITED.wireIntWithTag((int) (j & 2147483647L)));
        sethtmlinappmessagehtmllinktargetenabledandroid_sdk_base_release.IconCompatParcelizer(bArrRatingCompat);
    }
}
