package kotlinx.serialization.protobuf.internal;

import androidx.room.RoomDatabase$createConnectionManager$3;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.UriKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.RegexKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.serialization.SerializationException;
import o.BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DrawableTransformation;
import o.InAppMessageJavascriptInterfacerequestPushPermission1ExternalSyntheticLambda0;
import o.accessgetInstancedelegatecp;
import o.closeInAppMessageOnKeycodeBack;
import o.createInAppMessageViewlambda0;
import o.createInAppMessageViewlambda1;
import o.getButtonDrawable;
import o.getCieXyz;
import o.onCloseActionlambda0;
import o.onContentCardClicked;
import o.onMove;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.prepareInAppMessageWithZippedAssetHtmllambda4;
import o.r8lambda3beja5D1e1agNYROvnFsh_QFfAY;
import o.r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8;
import o.r8lambdaXAGCOYbTdmoxumZCm7CYX91qEs0;
import o.r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE;
import o.r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import o.setDrawableColor;
import o.setGraphicModalMaxWidthDp;
import o.setWasCloseMessageCalled;
import okhttp3.internal.http2.Huffman$Node;

/* JADX INFO: loaded from: classes4.dex */
public class ProtobufDecoder extends closeInAppMessageOnKeycodeBack implements DefaultInAppMessageModalViewFactoryCompanion, createInAppMessageViewlambda1 {
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA MediaBrowserCompatMediaItem;
    public final r8lambdaXAGCOYbTdmoxumZCm7CYX91qEs0 MediaDescriptionCompat;
    public HashMap MediaMetadataCompat;
    public final int[] MediaSessionCompatQueueItem;
    public final ProtobufReader MediaSessionCompatResultReceiverWrapper;
    public final prepareInAppMessageWithZippedAssetHtmllambda4 MediaSessionCompatToken;
    public HashMap PlaybackStateCompatCustomAction;
    public boolean RatingCompat;

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return !this.RatingCompat;
    }

    @Override // o.createInAppMessageViewlambda1
    public final void write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion, o.createInAppMessageViewlambda1
    public final prepareInAppMessageWithZippedAssetHtml MediaSessionCompatQueueItem() {
        return this.MediaSessionCompatToken.RemoteActionCompatParcelizer;
    }

    public int read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int iIntValue;
        HashMap map;
        ProtobufReader protobufReader = this.MediaSessionCompatResultReceiverWrapper;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        while (true) {
            try {
                int iRatingCompat = protobufReader.RatingCompat();
                r8lambdaXAGCOYbTdmoxumZCm7CYX91qEs0 r8lambdaxagcoybtdmoxumzcm7cyx91qes0 = this.MediaDescriptionCompat;
                if (iRatingCompat == -1) {
                    return r8lambdaxagcoybtdmoxumzcm7cyx91qes0.IconCompatParcelizer();
                }
                if (iRatingCompat == 0) {
                    throw new SerializationException("0 is not allowed as the protobuf field number in " + r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer() + ", the input bytes may have been corrupted");
                }
                int[] iArr = this.MediaSessionCompatQueueItem;
                if (iArr != null) {
                    iIntValue = (iRatingCompat < 0 || iRatingCompat >= iArr.length) ? -1 : iArr[iRatingCompat];
                } else {
                    HashMap map2 = this.PlaybackStateCompatCustomAction;
                    map2.getClass();
                    Object obj = map2.get(Integer.valueOf(iRatingCompat));
                    if (obj == null) {
                        obj = -1;
                    }
                    iIntValue = ((Number) obj).intValue();
                }
                if (iIntValue != -1) {
                    if (UriKt.IconCompatParcelizer(UriKt.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, iIntValue)) && (map = this.MediaMetadataCompat) != null) {
                    }
                    r8lambdaxagcoybtdmoxumzcm7cyx91qes0.write(iIntValue);
                    return iIntValue;
                }
                protobufReader.MediaDescriptionCompat();
            } catch (ProtobufDecodingException e) {
                throw new ProtobufDecodingException("Fail to get element index for " + r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer() + " in " + this.MediaBrowserCompatMediaItem.serializer(), e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x010e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0136  */
    /* JADX WARN: Code duplicated, block: B:30:0x0141  */
    /* JADX WARN: Code duplicated, block: B:31:0x0144  */
    /* JADX WARN: Code duplicated, block: B:33:0x015e  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x015e, please report this as an issue */
    public final Object read(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        String string;
        int i;
        String str;
        r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8 r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8 = r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer;
        setgraphicmodalmaxwidthdp.getClass();
        try {
            if (setgraphicmodalmaxwidthdp instanceof r8lambda3beja5D1e1agNYROvnFsh_QFfAY) {
                return write(setgraphicmodalmaxwidthdp, obj);
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setgraphicmodalmaxwidthdp.getDescriptor(), InAppMessageJavascriptInterfacerequestPushPermission1ExternalSyntheticLambda0.IconCompatParcelizer.RatingCompat}, getCieXyz.write())).booleanValue()) {
                return read((byte[]) obj);
            }
            return setgraphicmodalmaxwidthdp instanceof r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k ? ((r8lambda4Ey0xzRjb9vTolCNosMnfar_p1k) setgraphicmodalmaxwidthdp).IconCompatParcelizer(this, obj) : setgraphicmodalmaxwidthdp.deserialize(this);
        } catch (ProtobufDecodingException e) {
            long jSerializer = serializer();
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = setgraphicmodalmaxwidthdp.getDescriptor();
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = this.MediaBrowserCompatMediaItem;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda, descriptor}, getCieXyz.write())).booleanValue()) {
                string = "Error while decoding " + r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setgraphicmodalmaxwidthdp.getDescriptor().RemoteActionCompatParcelizer(), r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8}, getCieXyz.write())).booleanValue()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8}, getCieXyz.write())).booleanValue()) {
                            i = ((int) (jSerializer & 2147483647L)) - 1;
                            int i2 = i / 2;
                            if (i % 2 == 0) {
                                str = "key";
                            } else {
                                str = "value";
                            }
                            StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("Error while decoding ", i2, str, " of index ", " in map field of ");
                            sbM.append(setgraphicmodalmaxwidthdp.getDescriptor().serializer());
                            string = sbM.toString();
                        } else {
                            string = "Error while decoding " + setgraphicmodalmaxwidthdp.getDescriptor().serializer() + " at proto number " + ((int) (jSerializer & 2147483647L)) + " of " + r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Error while decoding index ");
                        sb.append(((int) (jSerializer & 2147483647L)) - 1);
                        sb.append(" in repeated field of ");
                        sb.append(setgraphicmodalmaxwidthdp.getDescriptor().serializer());
                        string = sb.toString();
                    }
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(), r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8}, getCieXyz.write())).booleanValue()) {
                        i = ((int) (jSerializer & 2147483647L)) - 1;
                        int i3 = i / 2;
                        if (i % 2 == 0) {
                            str = "key";
                        } else {
                            str = "value";
                        }
                        StringBuilder sbM2 = m1$$ExternalSyntheticOutline0.m("Error while decoding ", i3, str, " of index ", " in map field of ");
                        sbM2.append(setgraphicmodalmaxwidthdp.getDescriptor().serializer());
                        string = sbM2.toString();
                    } else {
                        string = "Error while decoding " + setgraphicmodalmaxwidthdp.getDescriptor().serializer() + " at proto number " + ((int) (jSerializer & 2147483647L)) + " of " + r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer();
                    }
                }
            }
            throw new ProtobufDecodingException(string, e);
        }
    }

    public createInAppMessageViewlambda1 serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        Integer num;
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda2 = this.MediaBrowserCompatMediaItem;
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        try {
            RegexKt regexKtRemoteActionCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer();
            r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8 r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8 = r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.RemoteActionCompatParcelizer;
            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8}, getCieXyz.write())).booleanValue();
            prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4 = this.MediaSessionCompatToken;
            ProtobufReader protobufReader = this.MediaSessionCompatResultReceiverWrapper;
            if (zBooleanValue) {
                long jSerializer = serializer();
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda2.RemoteActionCompatParcelizer(), r8lambdahmnwzrtgt9ipof7jjsxqrywxhc8}, getCieXyz.write())).booleanValue() || jSerializer == 19500 || r8lambda92m0p9sit5uf70mvjf4rwmruda2.equals(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
                    return (protobufReader.read == r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.SIZE_DELIMITED && UriKt.read(r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(0))) ? new PackedArrayDecoder(prepareinappmessagewithzippedassethtmllambda4, new ProtobufReader(protobufReader.write()), r8lambda92m0p9sit5uf70mvjf4rwmruda) : new setDrawableColor(prepareinappmessagewithzippedassethtmllambda4, protobufReader, jSerializer, r8lambda92m0p9sit5uf70mvjf4rwmruda);
                }
                ProtobufReader protobufReaderRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(protobufReader, jSerializer);
                protobufReaderRemoteActionCompatParcelizer.RatingCompat();
                return new setDrawableColor(prepareinappmessagewithzippedassethtmllambda4, protobufReaderRemoteActionCompatParcelizer, 1 | BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT.getSignature$kotlinx_serialization_protobuf(), r8lambda92m0p9sit5uf70mvjf4rwmruda);
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.write}, getCieXyz.write())).booleanValue() && !(regexKtRemoteActionCompatParcelizer instanceof createInAppMessageViewlambda0)) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{regexKtRemoteActionCompatParcelizer, r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.serializer}, getCieXyz.write())).booleanValue()) {
                        return new getButtonDrawable(prepareinappmessagewithzippedassethtmllambda4, new ProtobufReader(serializer() == 19500 ? protobufReader.read() : protobufReader.write()), serializer(), r8lambda92m0p9sit5uf70mvjf4rwmruda);
                    }
                    throw new SerializationException("Primitives are not supported at top-level");
                }
            }
            long jSerializer2 = serializer();
            if (jSerializer2 == 19500) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmruda2, r8lambda92m0p9sit5uf70mvjf4rwmruda}, getCieXyz.write())).booleanValue()) {
                    return this;
                }
            }
            if (!UriKt.IconCompatParcelizer(jSerializer2)) {
                return new ProtobufDecoder(prepareinappmessagewithzippedassethtmllambda4, BuildersKt.RemoteActionCompatParcelizer(protobufReader, jSerializer2), r8lambda92m0p9sit5uf70mvjf4rwmruda);
            }
            int i = (int) (jSerializer2 & 2147483647L);
            HashMap map = this.MediaMetadataCompat;
            if (map != null && (num = (Integer) map.get(Integer.valueOf(i - 1))) != null) {
                jSerializer2 = ((long) num.intValue()) | (1152921500311879680L & jSerializer2);
            }
            return new OneOfPolymorphicReader(prepareinappmessagewithzippedassethtmllambda4, protobufReader, jSerializer2, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        } catch (ProtobufDecodingException e) {
            throw new ProtobufDecodingException("Fail to begin structure for " + r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer() + " in " + r8lambda92m0p9sit5uf70mvjf4rwmruda2.serializer() + " at proto number " + ((int) (serializer() & 2147483647L)), e);
        }
    }

    public ProtobufDecoder(prepareInAppMessageWithZippedAssetHtmllambda4 prepareinappmessagewithzippedassethtmllambda4, ProtobufReader protobufReader, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        this.MediaSessionCompatToken = prepareinappmessagewithzippedassethtmllambda4;
        this.MediaSessionCompatResultReceiverWrapper = protobufReader;
        this.MediaBrowserCompatMediaItem = r8lambda92m0p9sit5uf70mvjf4rwmruda;
        this.MediaDescriptionCompat = new r8lambdaXAGCOYbTdmoxumZCm7CYX91qEs0(r8lambda92m0p9sit5uf70mvjf4rwmruda, new RoomDatabase$createConnectionManager$3(2, this, ProtobufDecoder.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, 5));
        int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
        if (iIconCompatParcelizer >= 32) {
            MediaDescriptionCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, iIconCompatParcelizer);
            return;
        }
        int i = iIconCompatParcelizer + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        for (int i3 = 0; i3 < iIconCompatParcelizer; i3++) {
            int iIconCompatParcelizer2 = UriKt.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i3, false);
            if (iIconCompatParcelizer2 > iIconCompatParcelizer || iIconCompatParcelizer2 == -2) {
                MediaDescriptionCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, iIconCompatParcelizer);
                return;
            }
            iArr[iIconCompatParcelizer2] = i3;
        }
        this.MediaSessionCompatQueueItem = iArr;
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final int IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(read());
        if (iRemoteActionCompatParcelizer < r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer() && iRemoteActionCompatParcelizer >= 0 && UriKt.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, iRemoteActionCompatParcelizer, true) == iRemoteActionCompatParcelizer) {
            return iRemoteActionCompatParcelizer;
        }
        int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            if (UriKt.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i, true) == iRemoteActionCompatParcelizer) {
                return i;
            }
        }
        throw new ProtobufDecodingException(iRemoteActionCompatParcelizer + " is not among valid " + this.MediaBrowserCompatMediaItem.serializer() + " enum proto numbers", null);
    }

    @Override // o.createInAppMessageViewlambda1
    public final int IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return RemoteActionCompatParcelizer(RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final Object IconCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        MediaBrowserCompatMediaItem(RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
        return read(setgraphicmodalmaxwidthdp, obj);
    }

    @Override // o.createInAppMessageViewlambda1
    public final String MediaMetadataCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return read(RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    public long RatingCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return UriKt.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i);
    }

    @Override // o.createInAppMessageViewlambda1
    public final double RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return IconCompatParcelizer(RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final DefaultInAppMessageModalViewFactoryCompanion RemoteActionCompatParcelizer(onCloseActionlambda0 oncloseactionlambda0, int i) {
        oncloseactionlambda0.getClass();
        long jRatingCompat = RatingCompat(oncloseactionlambda0, i);
        oncloseactionlambda0.RemoteActionCompatParcelizer(i).getClass();
        MediaBrowserCompatMediaItem(jRatingCompat);
        return this;
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final DefaultInAppMessageModalViewFactoryCompanion RemoteActionCompatParcelizer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        MediaBrowserCompatMediaItem(RemoteActionCompatParcelizer());
        return this;
    }

    @Override // o.createInAppMessageViewlambda1
    public final float read(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return write(RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final short read(onCloseActionlambda0 oncloseactionlambda0, int i) {
        oncloseactionlambda0.getClass();
        return (short) RemoteActionCompatParcelizer(RatingCompat(oncloseactionlambda0, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final char serializer(onCloseActionlambda0 oncloseactionlambda0, int i) {
        oncloseactionlambda0.getClass();
        return (char) RemoteActionCompatParcelizer(RatingCompat(oncloseactionlambda0, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final long serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return MediaDescriptionCompat(RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.createInAppMessageViewlambda1
    public final Object serializer(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i, setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        setgraphicmodalmaxwidthdp.getClass();
        MediaBrowserCompatMediaItem(RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
        if (this.RatingCompat) {
            return null;
        }
        return read(setgraphicmodalmaxwidthdp, obj);
    }

    @Override // o.createInAppMessageViewlambda1
    public final byte write(onCloseActionlambda0 oncloseactionlambda0, int i) {
        oncloseactionlambda0.getClass();
        return (byte) RemoteActionCompatParcelizer(RatingCompat(oncloseactionlambda0, i));
    }

    public final LinkedHashMap write(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp, Object obj) {
        setgraphicmodalmaxwidthdp.getClass();
        r8lambda3beja5D1e1agNYROvnFsh_QFfAY r8lambda3beja5d1e1agnyrovnfsh_qffay = (r8lambda3beja5D1e1agNYROvnFsh_QFfAY) setgraphicmodalmaxwidthdp;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = r8lambda3beja5d1e1agnyrovnfsh_qffay.IconCompatParcelizer;
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp3 = r8lambda3beja5d1e1agnyrovnfsh_qffay.write;
        setgraphicmodalmaxwidthdp2.getClass();
        setgraphicmodalmaxwidthdp3.getClass();
        r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE r8lambdaahdgh7r8gnmd2vmkuaabjue6gge = new r8lambdaahdGH7R8GNMD2vmKUAaBjuE6gGE(setgraphicmodalmaxwidthdp2, setgraphicmodalmaxwidthdp3, 1);
        Map map = obj instanceof Map ? (Map) obj : null;
        Set<Map.Entry> set = (Set) new setWasCloseMessageCalled(r8lambdaahdgh7r8gnmd2vmkuaabjue6gge, 1).IconCompatParcelizer(this, map != null ? map.entrySet() : null);
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(set, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // o.createInAppMessageViewlambda1
    public final boolean write(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        r8lambda92m0p9sit5uf70mvjf4rwmruda.getClass();
        return serializer(RatingCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, i));
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final short ComponentActivity() {
        return (short) RemoteActionCompatParcelizer(read());
    }

    public final long MediaDescriptionCompat(long j) {
        ProtobufReader protobufReader = this.MediaSessionCompatResultReceiverWrapper;
        try {
            if (j == 19500) {
                return protobufReader.IconCompatParcelizer(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
            }
            return protobufReader.read(UriKt.write(j));
        } catch (ProtobufDecodingException e) {
            DrawableTransformation.RemoteActionCompatParcelizer((int) (j & 2147483647L), this.MediaBrowserCompatMediaItem.serializer(), e);
            return 0L;
        }
    }

    public final void MediaDescriptionCompat(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda, int i) {
        HashMap map = new HashMap(i, 1.0f);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (UriKt.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i3, false) == -2) {
                List listSerializer = UriKt.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(i3), this.MediaSessionCompatToken.RemoteActionCompatParcelizer);
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listSerializer, 10));
                Iterator it = listSerializer.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (UriKt.RemoteActionCompatParcelizer((r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) it.next(), 0) & 2147483647L)));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    map.put(Integer.valueOf(((Number) it2.next()).intValue()), Integer.valueOf(i3));
                }
                i2++;
            } else {
                map.put(Integer.valueOf(UriKt.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, i3, false)), Integer.valueOf(i3));
            }
        }
        if (i2 > 0) {
            this.MediaMetadataCompat = new HashMap(i2, 1.0f);
        }
        this.PlaybackStateCompatCustomAction = map;
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final boolean MediaDescriptionCompat() {
        return serializer(read());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final char MediaSessionCompatResultReceiverWrapper() {
        return (char) RemoteActionCompatParcelizer(read());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final int MediaSessionCompatToken() {
        return RemoteActionCompatParcelizer(read());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final double ParcelableVolumeInfo() {
        return IconCompatParcelizer(read());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final float PlaybackStateCompat() {
        return write(read());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final byte PlaybackStateCompatCustomAction() {
        return (byte) RemoteActionCompatParcelizer(read());
    }

    public final int RemoteActionCompatParcelizer(long j) {
        ProtobufReader protobufReader = this.MediaSessionCompatResultReceiverWrapper;
        try {
            if (j == 19500) {
                return protobufReader.RemoteActionCompatParcelizer(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
            }
            return protobufReader.write(UriKt.write(j));
        } catch (ProtobufDecodingException e) {
            DrawableTransformation.RemoteActionCompatParcelizer((int) (j & 2147483647L), this.MediaBrowserCompatMediaItem.serializer(), e);
            return 0;
        }
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final String ResultReceiver() {
        return read(read());
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return MediaDescriptionCompat(read());
    }

    public String read(long j) {
        ProtobufReader protobufReader = this.MediaSessionCompatResultReceiverWrapper;
        try {
            if (j == 19500) {
                int iRemoteActionCompatParcelizer = protobufReader.RemoteActionCompatParcelizer(BackgroundInAppMessagePreparerdisplayPreparedInAppMessage2.DEFAULT);
                ProtobufReader.RemoteActionCompatParcelizer(iRemoteActionCompatParcelizer);
                Huffman$Node huffman$Node = protobufReader.write;
                byte[] bArr = (byte[]) huffman$Node.write;
                int i = huffman$Node.read;
                String strSerializer = setCarryoverInAppMessage.serializer(bArr, i, i + iRemoteActionCompatParcelizer, 4);
                huffman$Node.read += iRemoteActionCompatParcelizer;
                return strSerializer;
            }
            return protobufReader.MediaSessionCompatQueueItem();
        } catch (ProtobufDecodingException e) {
            DrawableTransformation.RemoteActionCompatParcelizer((int) (j & 2147483647L), this.MediaBrowserCompatMediaItem.serializer(), e);
            return null;
        }
    }

    public final float write(long j) {
        ProtobufReader protobufReader = this.MediaSessionCompatResultReceiverWrapper;
        try {
            if (j == 19500) {
                return Float.intBitsToFloat(protobufReader.serializer());
            }
            r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 r8lambdara3i0udadsld9ycgatzf3t4ge4 = r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.i32;
            if (protobufReader.read == r8lambdara3i0udadsld9ycgatzf3t4ge4) {
                return Float.intBitsToFloat(protobufReader.serializer());
            }
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(r8lambdara3i0udadsld9ycgatzf3t4ge4);
            DrawableTransformation.write(sb, protobufReader.read);
            return 0.0f;
        } catch (ProtobufDecodingException e) {
            DrawableTransformation.RemoteActionCompatParcelizer((int) (j & 2147483647L), this.MediaBrowserCompatMediaItem.serializer(), e);
            return 0.0f;
        }
    }

    public final double IconCompatParcelizer(long j) {
        ProtobufReader protobufReader = this.MediaSessionCompatResultReceiverWrapper;
        try {
            if (j == 19500) {
                return Double.longBitsToDouble(protobufReader.RemoteActionCompatParcelizer());
            }
            r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 r8lambdara3i0udadsld9ycgatzf3t4ge4 = r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.i64;
            if (protobufReader.read == r8lambdara3i0udadsld9ycgatzf3t4ge4) {
                return Double.longBitsToDouble(protobufReader.RemoteActionCompatParcelizer());
            }
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(r8lambdara3i0udadsld9ycgatzf3t4ge4);
            DrawableTransformation.write(sb, protobufReader.read);
            return 0.0d;
        } catch (ProtobufDecodingException e) {
            DrawableTransformation.RemoteActionCompatParcelizer((int) (j & 2147483647L), this.MediaBrowserCompatMediaItem.serializer(), e);
            return 0.0d;
        }
    }

    public final byte[] read(byte[] bArr) {
        r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4 r8lambdara3i0udadsld9ycgatzf3t4ge4;
        long jSerializer = serializer();
        ProtobufReader protobufReader = this.MediaSessionCompatResultReceiverWrapper;
        byte[] bArrIconCompatParcelizer = null;
        try {
            if (jSerializer == 19500 || protobufReader.read == (r8lambdara3i0udadsld9ycgatzf3t4ge4 = r8lambdarA3i0udaDsLd9YcgAtzF3t4gE4.SIZE_DELIMITED)) {
                bArrIconCompatParcelizer = protobufReader.IconCompatParcelizer();
            } else {
                StringBuilder sb = new StringBuilder("Expected wire type ");
                sb.append(r8lambdara3i0udadsld9ycgatzf3t4ge4);
                DrawableTransformation.write(sb, protobufReader.read);
            }
            return bArr == null ? bArrIconCompatParcelizer : onContentCardClicked.serializer(bArr, bArrIconCompatParcelizer);
        } catch (ProtobufDecodingException e) {
            DrawableTransformation.RemoteActionCompatParcelizer((int) (jSerializer & 2147483647L), this.MediaBrowserCompatMediaItem.serializer(), e);
            return bArrIconCompatParcelizer;
        }
    }

    public final boolean serializer(long j) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j);
        if (iRemoteActionCompatParcelizer != 0) {
            if (iRemoteActionCompatParcelizer == 1) {
                return true;
            }
            DrawableTransformation.serializer(c8$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer, "Unexpected boolean value: "));
        }
        return false;
    }

    @Override // o.DefaultInAppMessageModalViewFactoryCompanion
    public final Object write(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        setgraphicmodalmaxwidthdp.getClass();
        return read(setgraphicmodalmaxwidthdp, (Object) null);
    }
}
