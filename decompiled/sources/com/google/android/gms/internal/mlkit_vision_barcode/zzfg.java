package com.google.android.gms.internal.mlkit_vision_barcode;

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
import o.MotionEventAdapter;
import o.accesscomputeFillMinDimensioniLBOSCw;
import o.accessdetachAndRemoveNode;
import o.accessgetAggregateChildKindSet;
import o.accesspropagateCoordinator;
import o.accessupdateNode;
import o.clearOnDeviceChange;
import o.getComposePointerId_I2yYro;
import o.getMotionEventToComposePointerIdMapuiannotations;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfg implements accessupdateNode {
    public static final accessgetAggregateChildKindSet IconCompatParcelizer;
    public static final Charset RemoteActionCompatParcelizer = Charset.forName(Constants.ENCODING);
    public static final zzff read;
    public static final accessgetAggregateChildKindSet write;
    public final HashMap MediaBrowserCompatMediaItem;
    public final accessdetachAndRemoveNode MediaDescriptionCompat;
    public final zzda MediaMetadataCompat = new zzda(this, 1);
    public final HashMap MediaSessionCompatQueueItem;
    public OutputStream serializer;

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, double d) throws IOException {
        serializer(accessgetaggregatechildkindset, d, true);
        return this;
    }

    static {
        getComposePointerId_I2yYro getcomposepointerid_i2yyro = getComposePointerId_I2yYro.DEFAULT;
        IconCompatParcelizer = new accessgetAggregateChildKindSet("key", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(1, getcomposepointerid_i2yyro))));
        write = new accessgetAggregateChildKindSet("value", m1$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.RemoteActionCompatParcelizer(getMotionEventToComposePointerIdMapuiannotations.class, new MotionEventAdapter(2, getcomposepointerid_i2yyro))));
        read = new zzff(0);
    }

    public static int write(accessgetAggregateChildKindSet accessgetaggregatechildkindset) {
        getMotionEventToComposePointerIdMapuiannotations getmotioneventtocomposepointeridmapuiannotations = (getMotionEventToComposePointerIdMapuiannotations) accessgetaggregatechildkindset.write(getMotionEventToComposePointerIdMapuiannotations.class);
        if (getmotioneventtocomposepointeridmapuiannotations != null) {
            return getmotioneventtocomposepointeridmapuiannotations.serializer();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void IconCompatParcelizer(accessdetachAndRemoveNode accessdetachandremovenode, accessgetAggregateChildKindSet accessgetaggregatechildkindset, Object obj, boolean z) throws IOException {
        accesscomputeFillMinDimensioniLBOSCw accesscomputefillmindimensionilboscw = new accesscomputeFillMinDimensioniLBOSCw(1);
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
                write((write(accessgetaggregatechildkindset) << 3) | 2);
                write(j);
                accessdetachandremovenode.serializer(obj, this);
            } catch (Throwable th) {
                this.serializer = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                accesscomputefillmindimensionilboscw.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
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
            write((write(accessgetaggregatechildkindset) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(RemoteActionCompatParcelizer);
            write(bytes.length);
            this.serializer.write(bytes);
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
                IconCompatParcelizer(read, accessgetaggregatechildkindset, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            serializer(accessgetaggregatechildkindset, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            write((write(accessgetaggregatechildkindset) << 3) | 5);
            this.serializer.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            read(accessgetaggregatechildkindset, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            serializer(accessgetaggregatechildkindset, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            write((write(accessgetaggregatechildkindset) << 3) | 2);
            write(bArr.length);
            this.serializer.write(bArr);
            return;
        }
        accessdetachAndRemoveNode accessdetachandremovenode = (accessdetachAndRemoveNode) this.MediaBrowserCompatMediaItem.get(obj.getClass());
        if (accessdetachandremovenode != null) {
            IconCompatParcelizer(accessdetachandremovenode, accessgetaggregatechildkindset, obj, z);
            return;
        }
        accesspropagateCoordinator accesspropagatecoordinator = (accesspropagateCoordinator) this.MediaSessionCompatQueueItem.get(obj.getClass());
        if (accesspropagatecoordinator != null) {
            zzda zzdaVar = this.MediaMetadataCompat;
            zzdaVar.write = false;
            zzdaVar.serializer = accessgetaggregatechildkindset;
            zzdaVar.read = z;
            accesspropagatecoordinator.serializer(obj, zzdaVar);
            return;
        }
        if (obj instanceof clearOnDeviceChange) {
            serializer(accessgetaggregatechildkindset, ((clearOnDeviceChange) obj).zza(), true);
        } else if (obj instanceof Enum) {
            serializer(accessgetaggregatechildkindset, ((Enum) obj).ordinal(), true);
        } else {
            IconCompatParcelizer(this.MediaDescriptionCompat, accessgetaggregatechildkindset, obj, z);
        }
    }

    @Override // o.accessupdateNode
    public final /* synthetic */ accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, int i) {
        serializer(accessgetaggregatechildkindset, i, true);
        return this;
    }

    public zzfg(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, accessdetachAndRemoveNode accessdetachandremovenode) {
        this.serializer = byteArrayOutputStream;
        this.MediaBrowserCompatMediaItem = map;
        this.MediaSessionCompatQueueItem = map2;
        this.MediaDescriptionCompat = accessdetachandremovenode;
    }

    public final void serializer(accessgetAggregateChildKindSet accessgetaggregatechildkindset, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        getMotionEventToComposePointerIdMapuiannotations getmotioneventtocomposepointeridmapuiannotations = (getMotionEventToComposePointerIdMapuiannotations) accessgetaggregatechildkindset.write(getMotionEventToComposePointerIdMapuiannotations.class);
        if (getmotioneventtocomposepointeridmapuiannotations != null) {
            int iOrdinal = getmotioneventtocomposepointeridmapuiannotations.IconCompatParcelizer().ordinal();
            if (iOrdinal == 0) {
                write(getmotioneventtocomposepointeridmapuiannotations.serializer() << 3);
                write(i);
                return;
            } else if (iOrdinal == 1) {
                write(getmotioneventtocomposepointeridmapuiannotations.serializer() << 3);
                write((i + i) ^ (i >> 31));
                return;
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                write((getmotioneventtocomposepointeridmapuiannotations.serializer() << 3) | 5);
                this.serializer.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
                return;
            }
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // o.accessupdateNode
    public final /* synthetic */ accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, long j) throws IOException {
        read(accessgetaggregatechildkindset, j, true);
        return this;
    }

    @Override // o.accessupdateNode
    public final accessupdateNode write(accessgetAggregateChildKindSet accessgetaggregatechildkindset, Object obj) {
        write(accessgetaggregatechildkindset, obj, true);
        return this;
    }

    @Override // o.accessupdateNode
    public final /* synthetic */ accessupdateNode read(accessgetAggregateChildKindSet accessgetaggregatechildkindset, boolean z) {
        serializer(accessgetaggregatechildkindset, z ? 1 : 0, true);
        return this;
    }

    public final void serializer(accessgetAggregateChildKindSet accessgetaggregatechildkindset, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        write((write(accessgetaggregatechildkindset) << 3) | 1);
        this.serializer.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void write(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            int i2 = i & 127;
            OutputStream outputStream = this.serializer;
            if (j != 0) {
                outputStream.write(i2 | Fields.SpotShadowColor);
                i >>>= 7;
            } else {
                outputStream.write(i2);
                return;
            }
        }
    }

    public final void read(accessgetAggregateChildKindSet accessgetaggregatechildkindset, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        getMotionEventToComposePointerIdMapuiannotations getmotioneventtocomposepointeridmapuiannotations = (getMotionEventToComposePointerIdMapuiannotations) accessgetaggregatechildkindset.write(getMotionEventToComposePointerIdMapuiannotations.class);
        if (getmotioneventtocomposepointeridmapuiannotations != null) {
            int iOrdinal = getmotioneventtocomposepointeridmapuiannotations.IconCompatParcelizer().ordinal();
            if (iOrdinal == 0) {
                write(getmotioneventtocomposepointeridmapuiannotations.serializer() << 3);
                write(j);
                return;
            } else if (iOrdinal == 1) {
                write(getmotioneventtocomposepointeridmapuiannotations.serializer() << 3);
                write((j >> 63) ^ (j + j));
                return;
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                write((getmotioneventtocomposepointeridmapuiannotations.serializer() << 3) | 1);
                this.serializer.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
                return;
            }
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public final void write(long j) throws IOException {
        while (true) {
            int i = ((int) j) & 127;
            OutputStream outputStream = this.serializer;
            if (((-128) & j) != 0) {
                outputStream.write(i | Fields.SpotShadowColor);
                j >>>= 7;
            } else {
                outputStream.write(i);
                return;
            }
        }
    }
}
