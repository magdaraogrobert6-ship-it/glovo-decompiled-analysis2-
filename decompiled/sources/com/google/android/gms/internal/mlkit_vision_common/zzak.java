package com.google.android.gms.internal.mlkit_vision_common;

import androidx.compose.ui.graphics.Fields;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.mlkit_vision_face.zzda;
import com.google.firebase.encoders.EncodingException;
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
import o.accesscomputeFillMinDimensioniLBOSCw;
import o.accessdetachAndRemoveNode;
import o.accessgetAggregateChildKindSet;
import o.accessgetMousecp;
import o.accesspropagateCoordinator;
import o.accessupdateNode;
import o.getStylusT8wyACA;
import o.getTouchT8wyACA;
import o.getUnknownT8wyACA;

/* JADX INFO: loaded from: classes2.dex */
public final class zzak implements accessupdateNode {
    public static final accessgetAggregateChildKindSet RemoteActionCompatParcelizer;
    public static final accessgetAggregateChildKindSet read;
    public static final zzaj serializer;
    public static final Charset write = Charset.forName(Constants.ENCODING);
    public OutputStream IconCompatParcelizer;
    public final HashMap MediaBrowserCompatMediaItem;
    public final accessdetachAndRemoveNode MediaDescriptionCompat;
    public final HashMap MediaMetadataCompat;
    public final zzda RatingCompat = new zzda(this, 2);

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, double d) throws IOException {
        RemoteActionCompatParcelizer(accessgetaggregatechildkindset, d, true);
        return this;
    }

    static {
        getStylusT8wyACA getstylust8wyaca = getStylusT8wyACA.DEFAULT;
        accessgetMousecp accessgetmousecp = new accessgetMousecp(1, getstylust8wyaca);
        HashMap map = new HashMap();
        map.put(getUnknownT8wyACA.class, accessgetmousecp);
        read = new accessgetAggregateChildKindSet("key", m1$$ExternalSyntheticOutline0.m(map));
        accessgetMousecp accessgetmousecp2 = new accessgetMousecp(2, getstylust8wyaca);
        HashMap map2 = new HashMap();
        map2.put(getUnknownT8wyACA.class, accessgetmousecp2);
        RemoteActionCompatParcelizer = new accessgetAggregateChildKindSet("value", m1$$ExternalSyntheticOutline0.m(map2));
        serializer = zzaj.read;
    }

    public static int read(accessgetAggregateChildKindSet accessgetaggregatechildkindset) {
        getUnknownT8wyACA getunknownt8wyaca = (getUnknownT8wyACA) accessgetaggregatechildkindset.write(getUnknownT8wyACA.class);
        if (getunknownt8wyaca != null) {
            return getunknownt8wyaca.RemoteActionCompatParcelizer();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            IconCompatParcelizer((read(accessgetaggregatechildkindset) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(write);
            IconCompatParcelizer(bytes.length);
            this.IconCompatParcelizer.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                write(accessgetaggregatechildkindset, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                serializer(serializer, accessgetaggregatechildkindset, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            RemoteActionCompatParcelizer(accessgetaggregatechildkindset, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            IconCompatParcelizer((read(accessgetaggregatechildkindset) << 3) | 5);
            this.IconCompatParcelizer.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            IconCompatParcelizer(accessgetaggregatechildkindset, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            read(accessgetaggregatechildkindset, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            IconCompatParcelizer((read(accessgetaggregatechildkindset) << 3) | 2);
            IconCompatParcelizer(bArr.length);
            this.IconCompatParcelizer.write(bArr);
            return;
        }
        accessdetachAndRemoveNode accessdetachandremovenode = (accessdetachAndRemoveNode) this.MediaBrowserCompatMediaItem.get(obj.getClass());
        if (accessdetachandremovenode != null) {
            serializer(accessdetachandremovenode, accessgetaggregatechildkindset, obj, z);
            return;
        }
        accesspropagateCoordinator accesspropagatecoordinator = (accesspropagateCoordinator) this.MediaMetadataCompat.get(obj.getClass());
        if (accesspropagatecoordinator != null) {
            zzda zzdaVar = this.RatingCompat;
            zzdaVar.write = false;
            zzdaVar.serializer = accessgetaggregatechildkindset;
            zzdaVar.read = z;
            accesspropagatecoordinator.serializer(obj, zzdaVar);
            return;
        }
        if (obj instanceof getTouchT8wyACA) {
            read(accessgetaggregatechildkindset, ((getTouchT8wyACA) obj).zza(), true);
        } else if (obj instanceof Enum) {
            read(accessgetaggregatechildkindset, ((Enum) obj).ordinal(), true);
        } else {
            serializer(this.MediaDescriptionCompat, accessgetaggregatechildkindset, obj, z);
        }
    }

    public final void serializer(accessdetachAndRemoveNode accessdetachandremovenode, accessgetAggregateChildKindSet accessgetaggregatechildkindset, Object obj, boolean z) throws IOException {
        accesscomputeFillMinDimensioniLBOSCw accesscomputefillmindimensionilboscw = new accesscomputeFillMinDimensioniLBOSCw(2);
        accesscomputefillmindimensionilboscw.read = 0L;
        try {
            OutputStream outputStream = this.IconCompatParcelizer;
            this.IconCompatParcelizer = accesscomputefillmindimensionilboscw;
            try {
                accessdetachandremovenode.serializer(obj, this);
                this.IconCompatParcelizer = outputStream;
                long j = accesscomputefillmindimensionilboscw.read;
                accesscomputefillmindimensionilboscw.close();
                if (z && j == 0) {
                    return;
                }
                IconCompatParcelizer((read(accessgetaggregatechildkindset) << 3) | 2);
                read(j);
                accessdetachandremovenode.serializer(obj, this);
            } catch (Throwable th) {
                this.IconCompatParcelizer = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                accesscomputefillmindimensionilboscw.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    @Override // o.accessupdateNode
    public final /* synthetic */ accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, int i) {
        read(accessgetaggregatechildkindset, i, true);
        return this;
    }

    public zzak(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, accessdetachAndRemoveNode accessdetachandremovenode) {
        this.IconCompatParcelizer = byteArrayOutputStream;
        this.MediaBrowserCompatMediaItem = map;
        this.MediaMetadataCompat = map2;
        this.MediaDescriptionCompat = accessdetachandremovenode;
    }

    public final void read(accessgetAggregateChildKindSet accessgetaggregatechildkindset, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        getUnknownT8wyACA getunknownt8wyaca = (getUnknownT8wyACA) accessgetaggregatechildkindset.write(getUnknownT8wyACA.class);
        if (getunknownt8wyaca != null) {
            getStylusT8wyACA getstylust8wyaca = getStylusT8wyACA.DEFAULT;
            int iOrdinal = getunknownt8wyaca.write().ordinal();
            if (iOrdinal == 0) {
                IconCompatParcelizer(getunknownt8wyaca.RemoteActionCompatParcelizer() << 3);
                IconCompatParcelizer(i);
                return;
            } else if (iOrdinal == 1) {
                IconCompatParcelizer(getunknownt8wyaca.RemoteActionCompatParcelizer() << 3);
                IconCompatParcelizer((i + i) ^ (i >> 31));
                return;
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                IconCompatParcelizer((getunknownt8wyaca.RemoteActionCompatParcelizer() << 3) | 5);
                this.IconCompatParcelizer.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                return;
            }
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // o.accessupdateNode
    public final /* synthetic */ accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, long j) throws IOException {
        IconCompatParcelizer(accessgetaggregatechildkindset, j, true);
        return this;
    }

    public final void IconCompatParcelizer(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.IconCompatParcelizer;
            if (j != 0) {
                outputStream.write((i & 127) | Fields.SpotShadowColor);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    public final void read(long j) throws IOException {
        while (true) {
            OutputStream outputStream = this.IconCompatParcelizer;
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
        write(accessgetaggregatechildkindset, obj, true);
        return this;
    }

    @Override // o.accessupdateNode
    public final /* synthetic */ accessupdateNode read(accessgetAggregateChildKindSet accessgetaggregatechildkindset, boolean z) {
        read(accessgetaggregatechildkindset, z ? 1 : 0, true);
        return this;
    }

    public final void RemoteActionCompatParcelizer(accessgetAggregateChildKindSet accessgetaggregatechildkindset, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        IconCompatParcelizer((read(accessgetaggregatechildkindset) << 3) | 1);
        this.IconCompatParcelizer.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void IconCompatParcelizer(accessgetAggregateChildKindSet accessgetaggregatechildkindset, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        getUnknownT8wyACA getunknownt8wyaca = (getUnknownT8wyACA) accessgetaggregatechildkindset.write(getUnknownT8wyACA.class);
        if (getunknownt8wyaca != null) {
            getStylusT8wyACA getstylust8wyaca = getStylusT8wyACA.DEFAULT;
            int iOrdinal = getunknownt8wyaca.write().ordinal();
            if (iOrdinal == 0) {
                IconCompatParcelizer(getunknownt8wyaca.RemoteActionCompatParcelizer() << 3);
                read(j);
                return;
            } else if (iOrdinal == 1) {
                IconCompatParcelizer(getunknownt8wyaca.RemoteActionCompatParcelizer() << 3);
                read((j >> 63) ^ (j + j));
                return;
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                IconCompatParcelizer((getunknownt8wyaca.RemoteActionCompatParcelizer() << 3) | 1);
                this.IconCompatParcelizer.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                return;
            }
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
}
