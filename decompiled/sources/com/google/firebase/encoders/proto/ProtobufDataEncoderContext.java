package com.google.firebase.encoders.proto;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.adjust.sdk.Constants;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.accessdetachAndRemoveNode;
import o.accessgetAggregateChildKindSet;
import o.accesspropagateCoordinator;
import o.accessupdateNode;
import o.firstFromHeadaLcG6gQui;
import o.getHeadui;
import o.padChain;
import o.propagateCoordinator;
import o.syncAggregateChildKindSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtobufDataEncoderContext implements accessupdateNode {
    public static final accessgetAggregateChildKindSet IconCompatParcelizer;
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer;
    public static final Charset read = Charset.forName(Constants.ENCODING);
    public static final JsonDataEncoderBuilder$$ExternalSyntheticLambda0 write;
    public final HashMap MediaBrowserCompatMediaItem;
    public final ProtobufValueEncoderContext MediaMetadataCompat = new ProtobufValueEncoderContext(this);
    public OutputStream MediaSessionCompatQueueItem;
    public final HashMap RatingCompat;
    public final accessdetachAndRemoveNode serializer;

    static {
        propagateCoordinator propagatecoordinatorWrite = propagateCoordinator.write();
        propagatecoordinatorWrite.RemoteActionCompatParcelizer = 1;
        RemoteActionCompatParcelizer = new accessgetAggregateChildKindSet("key", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite.serializer())));
        propagateCoordinator propagatecoordinatorWrite2 = propagateCoordinator.write();
        propagatecoordinatorWrite2.RemoteActionCompatParcelizer = 2;
        IconCompatParcelizer = new accessgetAggregateChildKindSet("value", m1$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(getHeadui.class, propagatecoordinatorWrite2.serializer())));
        write = new JsonDataEncoderBuilder$$ExternalSyntheticLambda0(1);
    }

    public static int write(accessgetAggregateChildKindSet accessgetaggregatechildkindset) {
        getHeadui getheadui = (getHeadui) accessgetaggregatechildkindset.write(getHeadui.class);
        if (getheadui != null) {
            return getheadui.RemoteActionCompatParcelizer();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void write(accessdetachAndRemoveNode accessdetachandremovenode, accessgetAggregateChildKindSet accessgetaggregatechildkindset, Object obj, boolean z) throws IOException {
        padChain padchain = new padChain();
        padchain.RemoteActionCompatParcelizer = 0L;
        try {
            OutputStream outputStream = this.MediaSessionCompatQueueItem;
            this.MediaSessionCompatQueueItem = padchain;
            try {
                accessdetachandremovenode.serializer(obj, this);
                this.MediaSessionCompatQueueItem = outputStream;
                long j = padchain.RemoteActionCompatParcelizer;
                padchain.close();
                if (z && j == 0) {
                    return;
                }
                IconCompatParcelizer((write(accessgetaggregatechildkindset) << 3) | 2);
                serializer(j);
                accessdetachandremovenode.serializer(obj, this);
            } catch (Throwable th) {
                this.MediaSessionCompatQueueItem = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                padchain.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void IconCompatParcelizer(accessgetAggregateChildKindSet accessgetaggregatechildkindset, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            IconCompatParcelizer((write(accessgetaggregatechildkindset) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(read);
            IconCompatParcelizer(bytes.length);
            this.MediaSessionCompatQueueItem.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                IconCompatParcelizer(accessgetaggregatechildkindset, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                write(write, accessgetaggregatechildkindset, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            IconCompatParcelizer(accessgetaggregatechildkindset, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            IconCompatParcelizer((write(accessgetaggregatechildkindset) << 3) | 5);
            this.MediaSessionCompatQueueItem.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            write(accessgetaggregatechildkindset, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            write(accessgetaggregatechildkindset, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            IconCompatParcelizer((write(accessgetaggregatechildkindset) << 3) | 2);
            IconCompatParcelizer(bArr.length);
            this.MediaSessionCompatQueueItem.write(bArr);
            return;
        }
        accessdetachAndRemoveNode accessdetachandremovenode = (accessdetachAndRemoveNode) this.MediaBrowserCompatMediaItem.get(obj.getClass());
        if (accessdetachandremovenode != null) {
            write(accessdetachandremovenode, accessgetaggregatechildkindset, obj, z);
            return;
        }
        accesspropagateCoordinator accesspropagatecoordinator = (accesspropagateCoordinator) this.RatingCompat.get(obj.getClass());
        if (accesspropagatecoordinator != null) {
            ProtobufValueEncoderContext protobufValueEncoderContext = this.MediaMetadataCompat;
            protobufValueEncoderContext.serializer = false;
            protobufValueEncoderContext.RemoteActionCompatParcelizer = accessgetaggregatechildkindset;
            protobufValueEncoderContext.read = z;
            accesspropagatecoordinator.serializer(obj, protobufValueEncoderContext);
            return;
        }
        if (obj instanceof syncAggregateChildKindSet) {
            write(accessgetaggregatechildkindset, ((syncAggregateChildKindSet) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            write(accessgetaggregatechildkindset, ((Enum) obj).ordinal(), true);
        } else {
            write(this.serializer, accessgetaggregatechildkindset, obj, z);
        }
    }

    public ProtobufDataEncoderContext(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, accessdetachAndRemoveNode accessdetachandremovenode) {
        this.MediaSessionCompatQueueItem = byteArrayOutputStream;
        this.MediaBrowserCompatMediaItem = map;
        this.RatingCompat = map2;
        this.serializer = accessdetachandremovenode;
    }

    public final void IconCompatParcelizer(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.MediaSessionCompatQueueItem;
            if (j != 0) {
                outputStream.write((i & 127) | Fields.SpotShadowColor);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    public final void serializer(long j) throws IOException {
        while (true) {
            OutputStream outputStream = this.MediaSessionCompatQueueItem;
            if (((-128) & j) != 0) {
                outputStream.write((((int) j) & 127) | Fields.SpotShadowColor);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, Object obj) {
        IconCompatParcelizer(accessgetaggregatechildkindset, obj, true);
        return this;
    }

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, double d) throws IOException {
        IconCompatParcelizer(accessgetaggregatechildkindset, d, true);
        return this;
    }

    public final void IconCompatParcelizer(accessgetAggregateChildKindSet accessgetaggregatechildkindset, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        IconCompatParcelizer((write(accessgetaggregatechildkindset) << 3) | 1);
        this.MediaSessionCompatQueueItem.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, int i) {
        write(accessgetaggregatechildkindset, i, true);
        return this;
    }

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, long j) throws IOException {
        write(accessgetaggregatechildkindset, j, true);
        return this;
    }

    @Override // o.accessupdateNode
    public final accessupdateNode read(accessgetAggregateChildKindSet accessgetaggregatechildkindset, boolean z) {
        write(accessgetaggregatechildkindset, z ? 1 : 0, true);
        return this;
    }

    public final void write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        getHeadui getheadui = (getHeadui) accessgetaggregatechildkindset.write(getHeadui.class);
        if (getheadui != null) {
            int i2 = firstFromHeadaLcG6gQui.write[getheadui.serializer().ordinal()];
            if (i2 == 1) {
                IconCompatParcelizer(getheadui.RemoteActionCompatParcelizer() << 3);
                IconCompatParcelizer(i);
                return;
            } else if (i2 == 2) {
                IconCompatParcelizer(getheadui.RemoteActionCompatParcelizer() << 3);
                IconCompatParcelizer((i << 1) ^ (i >> 31));
                return;
            } else {
                if (i2 != 3) {
                    return;
                }
                IconCompatParcelizer((getheadui.RemoteActionCompatParcelizer() << 3) | 5);
                this.MediaSessionCompatQueueItem.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                return;
            }
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        getHeadui getheadui = (getHeadui) accessgetaggregatechildkindset.write(getHeadui.class);
        if (getheadui != null) {
            int i = firstFromHeadaLcG6gQui.write[getheadui.serializer().ordinal()];
            if (i == 1) {
                IconCompatParcelizer(getheadui.RemoteActionCompatParcelizer() << 3);
                serializer(j);
                return;
            } else if (i == 2) {
                IconCompatParcelizer(getheadui.RemoteActionCompatParcelizer() << 3);
                serializer((j << 1) ^ (j >> 63));
                return;
            } else {
                if (i != 3) {
                    return;
                }
                IconCompatParcelizer((getheadui.RemoteActionCompatParcelizer() << 3) | 1);
                this.MediaSessionCompatQueueItem.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                return;
            }
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
}
