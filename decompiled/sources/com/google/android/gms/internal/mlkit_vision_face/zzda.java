package com.google.android.gms.internal.mlkit_vision_face;

import com.google.android.gms.internal.mlkit_vision_barcode.zzfg;
import com.google.android.gms.internal.mlkit_vision_common.zzak;
import com.google.firebase.encoders.EncodingException;
import o.accessgetAggregateChildKindSet;
import o.accessupdateNode;
import o.createAndInsertNodeAsChild;

/* JADX INFO: loaded from: classes2.dex */
public final class zzda implements createAndInsertNodeAsChild {
    public final /* synthetic */ int IconCompatParcelizer;
    public final accessupdateNode RemoteActionCompatParcelizer;
    public accessgetAggregateChildKindSet serializer;
    public boolean write = false;
    public boolean read = false;

    public /* synthetic */ zzda(accessupdateNode accessupdatenode, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = accessupdatenode;
    }

    @Override // o.createAndInsertNodeAsChild
    public final createAndInsertNodeAsChild RemoteActionCompatParcelizer(String str) {
        int i = this.IconCompatParcelizer;
        accessupdateNode accessupdatenode = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            if (this.write) {
                throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
            }
            this.write = true;
            ((zzcw) accessupdatenode).RemoteActionCompatParcelizer(this.serializer, str, this.read);
            return this;
        }
        if (i != 1) {
            if (this.write) {
                throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
            }
            this.write = true;
            ((zzak) accessupdatenode).write(this.serializer, str, this.read);
            return this;
        }
        if (this.write) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.write = true;
        ((zzfg) accessupdatenode).write(this.serializer, str, this.read);
        return this;
    }

    @Override // o.createAndInsertNodeAsChild
    public final createAndInsertNodeAsChild RemoteActionCompatParcelizer(boolean z) {
        int i = this.IconCompatParcelizer;
        accessupdateNode accessupdatenode = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            if (!this.write) {
                this.write = true;
                ((zzcw) accessupdatenode).write(this.serializer, z ? 1 : 0, this.read);
                return this;
            }
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        if (i != 1) {
            if (!this.write) {
                this.write = true;
                ((zzak) accessupdatenode).read(this.serializer, z ? 1 : 0, this.read);
                return this;
            }
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        if (!this.write) {
            this.write = true;
            ((zzfg) accessupdatenode).serializer(this.serializer, z ? 1 : 0, this.read);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
