package com.google.android.gms.internal.mlkit_vision_face;

import androidx.compose.ui.graphics.Fields;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.adjust.sdk.Constants;
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
import o.accesscomputeFillMaxDimensioniLBOSCw;
import o.accesscomputeFillMinDimensioniLBOSCw;
import o.accessdetachAndRemoveNode;
import o.accessgetAggregateChildKindSet;
import o.accesspropagateCoordinator;
import o.accessupdateNode;
import o.computeFillHeightiLBOSCw;
import o.computeFillMaxDimensioniLBOSCw;
import o.computeFillMinDimensioniLBOSCw;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcw implements accessupdateNode {
    public static final accessgetAggregateChildKindSet IconCompatParcelizer;
    public static final zzcv RemoteActionCompatParcelizer;
    public static final Charset read = Charset.forName(Constants.ENCODING);
    public static final accessgetAggregateChildKindSet write;
    public final HashMap MediaBrowserCompatMediaItem;
    public final accessdetachAndRemoveNode MediaMetadataCompat;
    public final HashMap MediaSessionCompatQueueItem;
    public final zzda RatingCompat = new zzda(this, 0);
    public OutputStream serializer;

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, double d) throws IOException {
        write(accessgetaggregatechildkindset, d, true);
        return this;
    }

    static {
        computeFillMinDimensioniLBOSCw computefillmindimensionilboscw = computeFillMinDimensioniLBOSCw.DEFAULT;
        computeFillHeightiLBOSCw computefillheightilboscw = new computeFillHeightiLBOSCw(1, computefillmindimensionilboscw);
        HashMap map = new HashMap();
        map.put(accesscomputeFillMaxDimensioniLBOSCw.class, computefillheightilboscw);
        write = new accessgetAggregateChildKindSet("key", m1$$ExternalSyntheticOutline0.m(map));
        computeFillHeightiLBOSCw computefillheightilboscw2 = new computeFillHeightiLBOSCw(2, computefillmindimensionilboscw);
        HashMap map2 = new HashMap();
        map2.put(accesscomputeFillMaxDimensioniLBOSCw.class, computefillheightilboscw2);
        IconCompatParcelizer = new accessgetAggregateChildKindSet("value", m1$$ExternalSyntheticOutline0.m(map2));
        RemoteActionCompatParcelizer = zzcv.RemoteActionCompatParcelizer;
    }

    public static int read(accessgetAggregateChildKindSet accessgetaggregatechildkindset) {
        accesscomputeFillMaxDimensioniLBOSCw accesscomputefillmaxdimensionilboscw = (accesscomputeFillMaxDimensioniLBOSCw) accessgetaggregatechildkindset.write(accesscomputeFillMaxDimensioniLBOSCw.class);
        if (accesscomputefillmaxdimensionilboscw != null) {
            return accesscomputefillmaxdimensionilboscw.IconCompatParcelizer();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void RemoteActionCompatParcelizer(accessgetAggregateChildKindSet accessgetaggregatechildkindset, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            IconCompatParcelizer((read(accessgetaggregatechildkindset) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(read);
            IconCompatParcelizer(bytes.length);
            this.serializer.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer(accessgetaggregatechildkindset, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                RemoteActionCompatParcelizer(RemoteActionCompatParcelizer, accessgetaggregatechildkindset, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            write(accessgetaggregatechildkindset, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            IconCompatParcelizer((read(accessgetaggregatechildkindset) << 3) | 5);
            this.serializer.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            serializer(accessgetaggregatechildkindset, ((Number) obj).longValue(), z);
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
            IconCompatParcelizer((read(accessgetaggregatechildkindset) << 3) | 2);
            IconCompatParcelizer(bArr.length);
            this.serializer.write(bArr);
            return;
        }
        accessdetachAndRemoveNode accessdetachandremovenode = (accessdetachAndRemoveNode) this.MediaSessionCompatQueueItem.get(obj.getClass());
        if (accessdetachandremovenode != null) {
            RemoteActionCompatParcelizer(accessdetachandremovenode, accessgetaggregatechildkindset, obj, z);
            return;
        }
        accesspropagateCoordinator accesspropagatecoordinator = (accesspropagateCoordinator) this.MediaBrowserCompatMediaItem.get(obj.getClass());
        if (accesspropagatecoordinator != null) {
            zzda zzdaVar = this.RatingCompat;
            zzdaVar.write = false;
            zzdaVar.serializer = accessgetaggregatechildkindset;
            zzdaVar.read = z;
            accesspropagatecoordinator.serializer(obj, zzdaVar);
            return;
        }
        if (obj instanceof computeFillMaxDimensioniLBOSCw) {
            write(accessgetaggregatechildkindset, ((computeFillMaxDimensioniLBOSCw) obj).zza(), true);
        } else if (obj instanceof Enum) {
            write(accessgetaggregatechildkindset, ((Enum) obj).ordinal(), true);
        } else {
            RemoteActionCompatParcelizer(this.MediaMetadataCompat, accessgetaggregatechildkindset, obj, z);
        }
    }

    public final void RemoteActionCompatParcelizer(accessdetachAndRemoveNode accessdetachandremovenode, accessgetAggregateChildKindSet accessgetaggregatechildkindset, Object obj, boolean z) throws IOException {
        accesscomputeFillMinDimensioniLBOSCw accesscomputefillmindimensionilboscw = new accesscomputeFillMinDimensioniLBOSCw(0);
        accesscomputefillmindimensionilboscw.read = 0L;
        try {
            OutputStream outputStream = this.serializer;
            this.serializer = accesscomputefillmindimensionilboscw;
            try {
                accessdetachandremovenode.serializer(obj, this);
                this.serializer = outputStream;
                long j = accesscomputefillmindimensionilboscw.read;
                accesscomputefillmindimensionilboscw.close();
                if (z && j == 0) {
                    return;
                }
                IconCompatParcelizer((read(accessgetaggregatechildkindset) << 3) | 2);
                read(j);
                accessdetachandremovenode.serializer(obj, this);
            } catch (Throwable th) {
                this.serializer = outputStream;
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
        write(accessgetaggregatechildkindset, i, true);
        return this;
    }

    public zzcw(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, accessdetachAndRemoveNode accessdetachandremovenode) {
        this.serializer = byteArrayOutputStream;
        this.MediaSessionCompatQueueItem = map;
        this.MediaBrowserCompatMediaItem = map2;
        this.MediaMetadataCompat = accessdetachandremovenode;
    }

    @Override // o.accessupdateNode
    public final /* synthetic */ accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, long j) throws IOException {
        serializer(accessgetaggregatechildkindset, j, true);
        return this;
    }

    public final void write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        accesscomputeFillMaxDimensioniLBOSCw accesscomputefillmaxdimensionilboscw = (accesscomputeFillMaxDimensioniLBOSCw) accessgetaggregatechildkindset.write(accesscomputeFillMaxDimensioniLBOSCw.class);
        if (accesscomputefillmaxdimensionilboscw != null) {
            computeFillMinDimensioniLBOSCw computefillmindimensionilboscw = computeFillMinDimensioniLBOSCw.DEFAULT;
            int iOrdinal = accesscomputefillmaxdimensionilboscw.RemoteActionCompatParcelizer().ordinal();
            if (iOrdinal == 0) {
                IconCompatParcelizer(accesscomputefillmaxdimensionilboscw.IconCompatParcelizer() << 3);
                IconCompatParcelizer(i);
                return;
            } else if (iOrdinal == 1) {
                IconCompatParcelizer(accesscomputefillmaxdimensionilboscw.IconCompatParcelizer() << 3);
                IconCompatParcelizer((i + i) ^ (i >> 31));
                return;
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                IconCompatParcelizer((accesscomputefillmaxdimensionilboscw.IconCompatParcelizer() << 3) | 5);
                this.serializer.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                return;
            }
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void IconCompatParcelizer(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.serializer;
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
            OutputStream outputStream = this.serializer;
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
        RemoteActionCompatParcelizer(accessgetaggregatechildkindset, obj, true);
        return this;
    }

    @Override // o.accessupdateNode
    public final /* synthetic */ accessupdateNode read(accessgetAggregateChildKindSet accessgetaggregatechildkindset, boolean z) {
        write(accessgetaggregatechildkindset, z ? 1 : 0, true);
        return this;
    }

    public final void write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        IconCompatParcelizer((read(accessgetaggregatechildkindset) << 3) | 1);
        this.serializer.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void serializer(accessgetAggregateChildKindSet accessgetaggregatechildkindset, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        accesscomputeFillMaxDimensioniLBOSCw accesscomputefillmaxdimensionilboscw = (accesscomputeFillMaxDimensioniLBOSCw) accessgetaggregatechildkindset.write(accesscomputeFillMaxDimensioniLBOSCw.class);
        if (accesscomputefillmaxdimensionilboscw != null) {
            computeFillMinDimensioniLBOSCw computefillmindimensionilboscw = computeFillMinDimensioniLBOSCw.DEFAULT;
            int iOrdinal = accesscomputefillmaxdimensionilboscw.RemoteActionCompatParcelizer().ordinal();
            if (iOrdinal == 0) {
                IconCompatParcelizer(accesscomputefillmaxdimensionilboscw.IconCompatParcelizer() << 3);
                read(j);
                return;
            } else if (iOrdinal == 1) {
                IconCompatParcelizer(accesscomputefillmaxdimensionilboscw.IconCompatParcelizer() << 3);
                read((j >> 63) ^ (j + j));
                return;
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                IconCompatParcelizer((accesscomputefillmaxdimensionilboscw.IconCompatParcelizer() << 3) | 1);
                this.serializer.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                return;
            }
        }
        throw new EncodingException("Field has no @Protobuf config");
    }
}
